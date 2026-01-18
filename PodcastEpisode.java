/**
 * PodcastEpisode class representing a single episode of a podcast.
 * Inherits from Podcast (which inherits from Media) demonstrating multilevel
 * inheritance.
 */
public class PodcastEpisode extends Podcast {

    /** Episode number of the podcast. */
    private int episodeNumber;

    /**
     * Constructs a PodcastEpisode object.
     *
     * @param title             Title of the episode
     * @param durationInSeconds Duration in seconds
     * @param host              Host of the podcast
     * @param episodeNumber     Episode number
     */
    public PodcastEpisode(String title, int durationInSeconds, String host, int episodeNumber) {
        super(title, durationInSeconds, host); // Call Podcast constructor
        this.episodeNumber = episodeNumber;
    }

    /**
     * Plays the podcast episode by printing its details including the episode
     * number.
     * Overrides the play() method from Podcast.
     */
    @Override
    public void play() {
        System.out.println("Episode " + episodeNumber + ": " + title + " (Hosted by " + host + ")");
    }
}
