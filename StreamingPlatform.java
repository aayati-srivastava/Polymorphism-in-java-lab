// Base class
class Content {
    String title;

    Content(String title) {
        this.title = title;
    }

    void play() {
        System.out.println("Playing: " + title);
    }
}

// Movie subclass
class Movie extends Content {
    double rating;
    int duration; // minutes
    boolean subtitles;

    Movie(String title, double rating, int duration, boolean subtitles) {
        super(title);
        this.rating = rating;
        this.duration = duration;
        this.subtitles = subtitles;
    }

    void displayMovieDetails() {
        System.out.println("Movie Title: " + title);
        System.out.println("Rating: " + rating + "/10");
        System.out.println("Duration: " + duration + " mins");
        System.out.println("Subtitles: " + (subtitles ? "Available" : "Not Available"));
    }
}

// TV Series subclass
class TVSeries extends Content {
    int seasons;
    int episodes;
    String nextEpisode;

    TVSeries(String title, int seasons, int episodes, String nextEpisode) {
        super(title);
        this.seasons = seasons;
        this.episodes = episodes;
        this.nextEpisode = nextEpisode;
    }

    void displaySeriesDetails() {
        System.out.println("TV Series Title: " + title);
        System.out.println("Seasons: " + seasons);
        System.out.println("Episodes: " + episodes);
        System.out.println("Next Episode: " + nextEpisode);
    }
}

// Documentary subclass
class Documentary extends Content {
    String[] tags;
    String relatedContent;

    Documentary(String title, String[] tags, String relatedContent) {
        super(title);
        this.tags = tags;
        this.relatedContent = relatedContent;
    }

    void displayDocumentaryDetails() {
        System.out.println("Documentary Title: " + title);
        System.out.print("Educational Tags: ");
        for (String tag : tags) {
            System.out.print(tag + " ");
        }
        System.out.println("\nRelated Content: " + relatedContent);
    }
}

// Main program
public class StreamingPlatform {
    public static void main(String[] args) {
        // Upcasting
        Content[] library = new Content[3];

        library[0] = new Movie("Inception", 8.8, 148, true);
        library[1] = new TVSeries("Stranger Things", 4, 34, "Season 5, Episode 1");
        library[2] = new Documentary("Planet Earth", new String[]{"Nature", "Wildlife"}, "Blue Planet");

        System.out.println("🎬 Streaming Platform Library 🎬\n");

        for (Content content : library) {
            content.play();

            // Downcasting to access specific features
            if (content instanceof Movie) {
                Movie movie = (Movie) content;
                movie.displayMovieDetails();
            } else if (content instanceof TVSeries) {
                TVSeries series = (TVSeries) content;
                series.displaySeriesDetails();
            } else if (content instanceof Documentary) {
                Documentary doc = (Documentary) content;
                doc.displayDocumentaryDetails();
            }

            System.out.println();
        }
    }
}
