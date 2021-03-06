package front.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import common.domain.entity.Underlier;
import front.repository.dao.UnderlierDao;


@Service
@Transactional(readOnly=true)
public class UnderlierService {
    @Autowired
    private UnderlierDao underlierDao;

    public List<Underlier> getUnderlierList() {
        return underlierDao.selectAll();
    }
}
