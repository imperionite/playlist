import java.util.ArrayList;

/**
 * Abstract parent class for all media types.
 * Contains shared fields, constructor, and methods.
 */
abstract class Media {

    /** Title of the media */
    protected String title;

    /** Duration of the media in seconds */
    protected int durationInSeconds;

    /**
     * Constructs a Media object.
     *
     * @param title             the media title
     * @param durationInSeconds the media duration in seconds
     */
    public Media(String title, int durationInSeconds) {
        this.title = title;
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * Gets the media title.
     *
     * @return title of the media
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the duration of the media.
     *
     * @return duration in seconds
     */
    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    /**
     * Returns a string representation of a Media object.
     * This method is inherited by all subclasses.
     *
     * @return formatted media information
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Duration: " + durationInSeconds + " seconds";
    }

    /**
     * Abstract method that all subclasses must implement.
     */
    public abstract void play();
}

/**
 * Represents a Song.
 * Demonstrates single inheritance from Media.
 */
class Song extends Media {

    /** Artist who performs the song */
    private String artist;

    /**
     * Constructs a Song object.
     *
     * @param title             song title
     * @param durationInSeconds song duration
     * @param artist            song artist
     */
    public Song(String title, int durationInSeconds, String artist) {
        super(title, durationInSeconds);
        this.artist = artist;
    }

    /**
     * Plays the song.
     */
    @Override
    public void play() {
        System.out.println("Playing song: " + title + " by " + artist);
    }

    /**
     * Extends the Media toString() method.
     *
     * @return formatted song information
     */
    @Override
    public String toString() {
        return super.toString() + ", Artist: " + artist;
    }
}

/**
 * Represents a Podcast.
 * Demonstrates inheritance from Media.
 */
class Podcast extends Media {

    /** Host of the podcast */
    protected String host;

    /**
     * Constructs a Podcast object.
     *
     * @param title             podcast title
     * @param durationInSeconds podcast duration
     * @param host              podcast host
     */
    public Podcast(String title, int durationInSeconds, String host) {
        super(title, durationInSeconds);
        this.host = host;
    }

    /**
     * Plays the podcast.
     */
    @Override
    public void play() {
        System.out.println("Playing podcast: " + title + " hosted by " + host);
    }

    /**
     * Extends the Media toString() method.
     *
     * @return formatted podcast information
     */
    @Override
    public String toString() {
        return super.toString() + ", Host: " + host;
    }
}

/**
 * Represents a specific episode of a Podcast.
 * Demonstrates multilevel inheritance.
 */
class PodcastEpisode extends Podcast {

    /** Episode number */
    private int episodeNumber;

    /**
     * Constructs a PodcastEpisode object.
     *
     * @param title             episode title
     * @param durationInSeconds episode duration
     * @param host              podcast host
     * @param episodeNumber     episode number
     */
    public PodcastEpisode(String title, int durationInSeconds, String host, int episodeNumber) {
        super(title, durationInSeconds, host);
        this.episodeNumber = episodeNumber;
    }

    /**
     * Plays the podcast episode.
     */
    @Override
    public void play() {
        System.out.println(
                "Playing podcast episode " + episodeNumber +
                        ": " + title + " hosted by " + host);
    }

    /**
     * Extends the Podcast toString() method.
     *
     * @return formatted podcast episode information
     */
    @Override
    public String toString() {
        return super.toString() + ", Episode: " + episodeNumber;
    }
}

/**
 * Main class demonstrating inheritance, polymorphism,
 * ArrayList usage, and method overriding.
 */
public class Main {

    /**
     * Program entry point.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("🎵 MyPlaylist Demo with Inheritance & Polymorphism\n");

        // Create a playlist using ArrayList (polymorphism in action)
        ArrayList<Media> playlist = new ArrayList<>();

        playlist.add(new Song("Mr. Brightside", 223, "The Killers"));
        playlist.add(new Podcast("Tech Talks Daily", 1800, "Neil Hughes"));
        playlist.add(new PodcastEpisode("The Future of AI", 2700, "Neil Hughes", 42));

        // Play all media items
        for (Media media : playlist) {
            media.play();
        }

        System.out.println("\n📄 Playlist Details:");

        // Demonstrate overridden toString() methods
        for (Media media : playlist) {
            System.out.println(media);
        }
    }
}
