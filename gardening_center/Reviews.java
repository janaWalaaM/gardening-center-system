/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.gardening_center;

/**
 *
 * @author janawalaa
 */
public class Reviews {
  private String review;
    private int rating;

    public Reviews() {
    }

    public Reviews(String review, int rating) {
        this.review = review;
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Reviews{" + "review=" + review + ", rating=" + rating + '}';
    }
    
}
   

