package com.example.imdbmovies.View;

import com.example.imdbmovies.Model.Model;

public class View {
    Model model = new Model();

    public String getTenSortbyPopularity()
    {
        return model.getTenSortByPopularity();
    }

    public String howManyWonAnAward() {
        return model.howManyWonAnAward();
    }

    public String getRandom()
    {
        return model.getRandom();
    }

    public String getFirst()
    {
        return model.getFirst();
    }
}
