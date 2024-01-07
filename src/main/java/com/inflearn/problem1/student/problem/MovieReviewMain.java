package com.inflearn.problem1.student.problem;

public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview review1 = new MovieReview();
        review1.setTitle("인셉션");
        review1.setReview("인생은 무한 루프");

        MovieReview review2 = new MovieReview();
        review2.setTitle("어바웃 타임");
        review2.setReview("인생 시간 영화!");

        MovieReview[] movieReviews = new MovieReview[]{review1, review2};

        for (int i = 0; i < movieReviews.length; i++) {
            System.out.println(movieReviews[i]);
        }
    }
}
