package model;

public class Film {
    public String id;
    public String title;
    public String category;
    public String director;

    public Film(String id, String title, String category, String director, String published_date) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.published_date = published_date;
    }

    public boolean filterByName(String name) {
        return this.title.toLowerCase().contains(name.toLowerCase());
    }

    @Override
    public String toString() {
        return "Film{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", director='" + director + '\'' +
                ", published_date='" + published_date + '\'' +
                '}';
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String published_date;

}
