package com.arthur.learn.imperial.court.entity;

public class Memorial {

    private Integer memoId;
    private String memoTitle;
    private String memoContent;
    private String memoContentDigest;
    private Integer memoEmpId;
    private String memoEmpName;
    private String memoCreateTime;
    private String feedbackTime;
    private String feedbackContent;
    private Integer memoStatus;

    public Memorial() {
    }

    public Memorial(Integer memoId, String memoTitle, String memoContent, String memoContentDigest, Integer memoEmpId,
                    String memoEmpName, String memoCreateTime, String feedbackTime, String feedbackContent,
                    Integer memoStatus) {
        this.memoId = memoId;
        this.memoTitle = memoTitle;
        this.memoContent = memoContent;
        this.memoContentDigest = memoContentDigest;
        this.memoEmpId = memoEmpId;
        this.memoEmpName = memoEmpName;
        this.memoCreateTime = memoCreateTime;
        this.feedbackTime = feedbackTime;
        this.feedbackContent = feedbackContent;
        this.memoStatus = memoStatus;
    }

    public Integer getMemoId() {
        return memoId;
    }

    public void setMemoId(Integer memoId) {
        this.memoId = memoId;
    }

    public String getMemoTitle() {
        return memoTitle;
    }

    public void setMemoTitle(String memoTitle) {
        this.memoTitle = memoTitle;
    }

    public String getMemoContent() {
        return memoContent;
    }

    public void setMemoContent(String memoContent) {
        this.memoContent = memoContent;
    }

    public String getMemoContentDigest() {
        return memoContentDigest;
    }

    public void setMemoContentDigest(String memoContentDigest) {
        this.memoContentDigest = memoContentDigest;
    }

    public Integer getMemoEmpId() {
        return memoEmpId;
    }

    public void setMemoEmpId(Integer memoEmpId) {
        this.memoEmpId = memoEmpId;
    }

    public String getMemoEmpName() {
        return memoEmpName;
    }

    public void setMemoEmpName(String memoEmpName) {
        this.memoEmpName = memoEmpName;
    }

    public String getMemoCreateTime() {
        return memoCreateTime;
    }

    public void setMemoCreateTime(String memoCreateTime) {
        this.memoCreateTime = memoCreateTime;
    }

    public String getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(String feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    public Integer getMemoStatus() {
        return memoStatus;
    }

    public void setMemoStatus(Integer memoStatus) {
        this.memoStatus = memoStatus;
    }

    @Override
    public String toString() {
        return "Memorial{" +
                "memoId=" + memoId +
                ", memoTitle='" + memoTitle + '\'' +
                ", memoContent='" + memoContent + '\'' +
                ", memoContentDigest='" + memoContentDigest + '\'' +
                ", memoEmpId=" + memoEmpId +
                ", memoEmpName='" + memoEmpName + '\'' +
                ", memoCreateTime='" + memoCreateTime + '\'' +
                ", feedbackTime='" + feedbackTime + '\'' +
                ", feedbackContent='" + feedbackContent + '\'' +
                ", memoStatus=" + memoStatus +
                '}';
    }
}
