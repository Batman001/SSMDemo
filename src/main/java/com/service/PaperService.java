package com.service;

import com.pojo.Paper;

import java.util.List;

/**
 * @author Batman create on 2019-03-08 14:10
 */
public interface PaperService {

    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();
}
