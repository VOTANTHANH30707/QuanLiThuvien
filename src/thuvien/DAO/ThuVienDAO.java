package thuvien.DAO;

import java.util.List;

public abstract class ThuVienDAO<EntityType, KeyType> {

    public abstract void insert(EntityType entity);

    public abstract EntityType selectById(KeyType id);

    public abstract List<EntityType> selectBySql(String sql, Object... args);
}
