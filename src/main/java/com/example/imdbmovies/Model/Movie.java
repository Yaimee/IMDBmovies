package com.example.imdbmovies.Model;

public class Movie implements Comparable<Movie> {
    private int year;
    private int length;
    private String title;
    private String subject;
    private int popularity;
    private boolean awards;

    Movie(String year, String length, String title, String subject, String popularity, String awards)
    {
        this.year = Integer.parseInt(year);
        this.length = Integer.parseInt(length);
        this.title = title;
        this.subject = subject;
        this.popularity = Integer.parseInt(popularity);
        if (awards.equals("Yes")) {
            this.awards = true;
        } else {
            this.awards = false;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }

    public int getPopularity() {
        return popularity;
    }

    public int getLength() {
        return length;
    }

    public int getYear() {
        return year;
    }

    public boolean isAwards() {
        return awards;
    }

    @Override
    public int compareTo(Movie movie) {
        if(this.getPopularity() > movie.getPopularity()) return 1;

        else if (this.getPopularity() == movie.getPopularity()) return 0;

        else return -1;
    }

    @Override
    public String toString() {
        return  "Title: " + title +
                " Subject: " + subject +
                " Year: " + year +
                " Length: " + length +
                " Popularity: " + popularity +
                " Awards: " + awards;


    }
}
