/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvien.DAO;

import java.sql.ResultSet;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import thuvien.entity.DocGia;
import thuvien.utils.XJdbc;

/**
 *
 * @author Asus
 */
public class DocGiaDAO extends ThuVienDAO<DocGia, String> {

    final String INSERT_SQL = "insert into DOCGIA(MaDocGia, Ho, Ten, CCCD, Email, NgayCap, HanSD) values(?, ?, ?, ?, ?, ?, ?)";
    final String SELECT_BY_ID_SQL = "select * from DocGia where MaDocGia = ?";

    @Override
    public void insert(DocGia entity) {
        XJdbc.update(INSERT_SQL,
                entity.getMaDocGia(),
                entity.getHo(),
                entity.getTen(),
                entity.getCCCD(),
                entity.getEmail(),
                entity.getNgayCap(),
                entity.getHanSD()
        );
    }

    @Override
    public DocGia selectById(String id) {
        List<DocGia> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<DocGia> selectBySql(String sql, Object... args) {
        List<DocGia> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);

            while (rs.next()) {
                DocGia dg = new DocGia();
                dg.setMaDocGia(rs.getNString("MaDocGia"));
                dg.setHo(rs.getString("Ho"));
                dg.setTen(rs.getString("Ten"));
                dg.setCCCD(rs.getNString("CCCD"));
                dg.setNgayCap(rs.getDate("NgayCap"));
                dg.setHanSD(rs.getDate("HanSD"));
                list.add(dg);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<DocGia> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM DocGia WHERE MaDocGia LIKE ? or  CCCD LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%", "%" + keyword + "%");
    }

}
