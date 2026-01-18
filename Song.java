/**
 * Song class representing a musical track.
 * Inherits from Media and adds an artist field.
 */
public class Song extends Media {

    /** Artist of the song. */
    private String artist;

    /**
     * Constructs a Song object.
     *
     * @param title             Title of the song
     * @param durationInSeconds Duration of the song in seconds
     * @param artist            Artist of the song
     */
    public Song(String title, int durationInSeconds, String artist) {
        super(title, durationInSeconds); // Call Media constructor
        this.artist = artist;
    }

    /**
     * Plays the song by printing its details.
     * Overrides the abstract play() method in Media.
     */
    @Override
    public void play() {
        System.out.println("Playing song: " + title + " by " + artist);
    }
}
