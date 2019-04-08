package com.service.impl;

import com.dao.PaperDao;
import com.pojo.Paper;
import com.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Batman create on 2019-03-08 14:11
 */
@Service
public class PaperServiceImpl implements PaperService {

    @Autowired
    private PaperDao dao;

    @Override
    public int addPaper(Paper paper) {
        return dao.addPaper(paper);
    }

    @Override
    public int deletePaperById(long id) {
        return dao.deletePaperById(id);
    }

    @Override
    public int updatePaper(Paper paper) {
        return dao.updatePaper(paper);
    }

    @Override
    public Paper queryById(long id) {
        return dao.queryById(id);
    }

    @Override
    public List<Paper> queryAllPaper() {
        return dao.queryAllPaper();
    }
}
