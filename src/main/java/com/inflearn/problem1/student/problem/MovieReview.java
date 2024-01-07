package com.inflearn.problem1.student.problem;

public class MovieReview {

    private String title;

    private String review;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("영화 제목 : ")
                                  .append(this.title)
                                  .append(" 리뷰 : ")
                                  .append(this.review)
                                  .toString();
    }
}
