package com.dao;

import com.pojo.Paper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Batman create on 2019-03-08 14:13
 */
@Repository
public interface PaperDao {
    /**
     * 添加paper
     * @param paper 传入paper信息
     * @return
     */
    int addPaper(Paper paper);

    /**
     * 根据传入的id删除paper
     * @param id 传入paperId
     * @return
     */
    int deletePaperById(long id);

    /**
     * 更新paper信息
     * @param paper 待更新的paper信息
     * @return
     */
    int updatePaper(Paper paper);

    /**
     * 根据id查询paper信息
     * @param id 传入待检索的id
     * @return
     */
    Paper queryById(long id);

    /**
     * 列出全部的paper信息
     * @return
     */
    List<Paper> queryAllPaper();

}
