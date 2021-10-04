package inheritance;

public class Review  {

    private String author= "";
    private float numOfStars=0;
    private String body="";
    private Restaurant restaurant;

    public Review(String author,String body, float numOfStars, Restaurant restaurant) {
        if (numOfStars >= 0 && numOfStars<=5){
            this.author = author;
            this.body= body;
            this.numOfStars= numOfStars;
            this.restaurant= restaurant;
        }

    }

//    @Override
//    public String toString() {
//        return "Review{" +
//                "author='" + author + '\'' +
//                ", numOfStars=" + numOfStars +
//                ", body='" + body + '\'' +
//                ", restaurant=" + restaurant +
//                '}';
//    }

    @Override
    public String toString() {
        return author + ": \n" + " ===> " + body +" I rate this restaurant with " + numOfStars + " star"+ plural();
    }

    public String plural(){
        if (numOfStars == 1){
            return "";
        }else {
            return "s";
        }
    }


    public String getAuthor() {
        return author;
    }

    public float getNumOfStars() {
        return numOfStars;
    }

    public String getBody() {
        return body;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }
}
