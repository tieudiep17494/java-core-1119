package model;
public class Movie extends Film{
    public int duration;

    public Movie(String id, String title, String category, String director, String published_date, int duration) {
        super(id, title, category, director, published_date);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", director='" + director + '\'' +
                ", published_date='" + published_date + '\'' +
                ", duration=" + duration +

                '}';
    }
}
