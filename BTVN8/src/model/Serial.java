package model;

public class Serial extends Film{
    public int episode_number;
    public int average_duration;

    public Serial(String id, String title, String category, String director, String published_date, int episode_number, int average_duration) {
        super(id, title, category, director, published_date);
        this.episode_number = episode_number;
        this.average_duration = average_duration;
    }

    public int getEpisode_number() {
        return episode_number;
    }

    public void setEpisode_number(int episode_number) {
        this.episode_number = episode_number;
    }

    public int getAverage_duration() {
        return average_duration;
    }

    public void setAverage_duration(int average_duration) {
        this.average_duration = average_duration;
    }

    @Override
    public String toString() {
        return "Serial{" +

                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", director='" + director + '\'' +
                ", published_date='" + published_date + '\'' +
                ", episode_number=" + episode_number +
                ", average_duration=" + average_duration +
                '}';
    }
}
