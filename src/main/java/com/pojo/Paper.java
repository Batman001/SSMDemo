package com.pojo;

/**
 * @author Batman create on 2019-03-08 14:08
 */
public class Paper {
    private Long paperId;
    private String paperName;
    private int paperNum;
    private String paperDetail;

    public void setPaperId(Long paperId) {
        this.paperId = paperId;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public void setPaperNum(int paperNum) {
        this.paperNum = paperNum;
    }

    public void setPaperDetail(String paperDetail) {
        this.paperDetail = paperDetail;
    }

    public Long getPaperId() {
        return paperId;
    }

    public String getPaperName() {
        return paperName;
    }

    public int getPaperNum() {
        return paperNum;
    }

    public String getPaperDetail() {
        return paperDetail;
    }
}
