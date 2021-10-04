package inheritance;

import java.net.SocketOption;

public class Library {
    public boolean someLibraryMethod() {

        return true;
    }

    public static void main (String[] args){

//        RESTAURANT

        // NEW RESTAURANT OBJ
        Restaurant kfc = new Restaurant("kfc", 2.0, "$");
        System.out.println(kfc);

        //  NEW REVIEW OBJ
        Review rev = new Review("Good restaurant","Meghem", 3.0);
        Review rev1 = new Review("Good restaurant","Mezel", 4.0);
        Review rev2 = new Review("Good restaurant","Metlak", 2.0);

        //  ADD REVIEWS
        kfc.addReview(rev);
        kfc.addReview(rev1);
        kfc.addReview(rev2);

        //  PRINT REVIEWS AND kfc OBJ
        System.out.println(kfc.getReviews());
        System.out.println(kfc);

//         SHOP

        //  NEW SHOP OBJs
        Shop carrefour = new Shop("carrefour","supermarket",3);
        System.out.println(carrefour);

        //  NEW REVIEWS OBJs
        Review rev3 = new Review("bad","wdha", 7);
        Review rev4 = new Review("bad","ferdos", 3);

        //  ADD REVIEWS
        carrefour.addReview(rev3);
        carrefour.addReview(rev4);

        //  PRINT REVIEWS AND carrefour OBJ
        System.out.println(carrefour.getReviews());
        System.out.println(carrefour);

//        THEATER

        //   NEW THEATER OBJ
        Theater theater = new Theater("azzam");
        System.out.println(theater);

        //   ADD MOVIES TO MOVIE LIST
        theater.addMovie("lion");
        theater.addMovie("tiger");

        //    PRINT MOVIES
        System.out.println(theater);

        //    PRINT MOVIE LIST
        System.out.println(theater.getMovies());

        //     ADD MOVIES TO REVIEW
        theater.addNewRev("good","oglah",4);

        //      NEW REVIEW OBJ
        Review rev5 = new Review("good","ahmad", 3);

        theater.addNewRev(rev5,"lion");
        theater.removeMovie("tiger");
        theater.addNewRev(rev5,"tiger");
        System.out.println(theater);
        System.out.println(theater.getReviews());
    }
}
