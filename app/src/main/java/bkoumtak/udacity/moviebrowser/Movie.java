package bkoumtak.udacity.moviebrowser;

import java.io.Serializable;

/**
 * Created by kondeelai on 2016-07-22.
 */
public class Movie implements Serializable{
    String poster_reference;
    String title;
    String release_date;
    String vote_avg;
    String synopsis;
    String jpeg_file;
    String trailers[];
    Review reviews[];

    public Movie(String poster_reference, String title, String release_date,
                 String vote_avg, String synopsis, String trailers[], Review reviews[]){
        this.poster_reference = poster_reference;
        this.title = title;
        this.release_date = release_date;
        this.vote_avg = vote_avg;
        this.synopsis = synopsis;
        this.trailers = trailers;
        this.reviews = reviews;
        jpeg_file = "filler.jpg";
    }

}
