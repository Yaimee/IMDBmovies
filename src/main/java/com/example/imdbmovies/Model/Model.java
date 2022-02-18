package com.example.imdbmovies.Model;
import java.io.*;
import java.util.*;

public class Model {
    File file = new File("movie-data/imdb-data.csv");
    Random random = new Random();
    long numberOfLines = 0;

    LinkedList<Movie> movies = new LinkedList<>();

    public void storeFile() throws FileNotFoundException
    {
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] lineSplit = line.split(";");
            Movie movie = new Movie(lineSplit[0],lineSplit[1],lineSplit[2], lineSplit[3], lineSplit[4], lineSplit[5]);
            movies.add(movie);
        }
    }

    public String getTenSortByPopularity()
    {
        ArrayList<Movie> randomMovies = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++)
        {
            Movie randomMovie = movies.get(random.nextInt(movies.size()));
            randomMovies.add(randomMovie);
        }
        Collections.sort(randomMovies);
        sb.append("  Title:\t\t\tPopularity:");
        for (int i = 0; i < randomMovies.size(); i++)
        {
            sb.append((i + 1) + ". " + movies.get(i).getTitle() + "\t\t\t " + movies.get(i).getPopularity() + "\n");
        }
        return sb.toString();
    }

    public String howManyWonAnAward() {
        int awardCount = 0;
        for(Movie movie : movies) {
            if (movie.isAwards()) {
                awardCount++;
            }
        }
        return awardCount + " movies has won an award";
    }

    public String getRandom() {
        Movie randomMovie = movies.get(random.nextInt(movies.size()));
        return randomMovie.toString();
    }

    public String getFirst()
    {
        return movies.get(0).toString();
    }
}
