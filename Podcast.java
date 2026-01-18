/**
 * Podcast class representing a podcast.
 * Inherits from Media and adds a host field.
 */
public class Podcast extends Media {

    /** Host of the podcast. */
    protected String host;

    /**
     * Constructs a Podcast object.
     *
     * @param title             Title of the podcast
     * @param durationInSeconds Duration of the podcast in seconds
     * @param host              Host of the podcast
     */
    public Podcast(String title, int durationInSeconds, String host) {
        super(title, durationInSeconds); // Call Media constructor
        this.host = host;
    }

    /**
     * Plays the podcast by printing its details.
     * Overrides the abstract play() method in Media.
     */
    @Override
    public void play() {
        System.out.println("Playing podcast hosted by " + host + ": " + title);
    }
}
