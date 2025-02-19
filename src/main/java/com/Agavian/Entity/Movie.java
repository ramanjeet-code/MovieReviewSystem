package com.Agavian.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Movie {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
   String title;
    String genre;
    int year;
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<Reviews> reviews;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }



    public String getTitle() {
     return  this.title;
    }
}
