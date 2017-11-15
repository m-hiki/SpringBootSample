package front.repository.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import common.domain.entity.Underlier;
import common.repository.dao.BaseDao;


@Repository
public class UnderlierDao extends BaseDao {

    public List<Underlier> selectAll() {
        return this.sqlSession.selectList("selectAll");
    }
}
