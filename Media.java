/**
 * Abstract class representing any type of media in the MyPlaylist system.
 * All media types (Song, Podcast, PodcastEpisode) inherit from this class.
 */
public abstract class Media {

    /** Title of the media. */
    protected String title;

    /** Duration of the media in seconds. */
    protected int durationInSeconds;

    /**
     * Constructs a Media object with a title and duration.
     *
     * @param title             Title of the media
     * @param durationInSeconds Duration of the media in seconds
     */
    public Media(String title, int durationInSeconds) {
        this.title = title;
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * Returns the title of the media.
     *
     * @return Title string
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the duration of the media in seconds.
     *
     * @return Duration in seconds
     */
    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    /**
     * Abstract method to play the media.
     * Each subclass must provide its own implementation.
     */
    public abstract void play();
}
