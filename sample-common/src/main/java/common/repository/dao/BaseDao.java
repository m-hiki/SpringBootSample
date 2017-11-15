package common.repository.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class BaseDao {

    @Autowired
    protected SqlSession sqlSession;

}
