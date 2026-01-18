/**
 * Abstract class representing a generic media item.
 * This class defines shared properties and behavior
 * that all media types must have.
 */
abstract class Media {

    /** Title of the media */
    private String title;

    /** Duration of the media in seconds */
    private int durationInSeconds;

    /**
     * Constructs a Media object with a title and duration.
     *
     * @param title             the title of the media
     * @param durationInSeconds the length of the media in seconds
     */
    public Media(String title, int durationInSeconds) {
        this.title = title;
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * Gets the title of the media.
     *
     * @return the media title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the duration of the media in seconds.
     *
     * @return the duration in seconds
     */
    public int getDuration() {
        return durationInSeconds;
    }

    /**
     * Plays the media.
     * This method must be implemented by all subclasses.
     */
    public abstract void play();
}

/**
 * Represents a Song media type.
 * A Song is a Media object with an additional artist attribute.
 */
class Song extends Media {

    /** Artist who performs the song */
    private String artist;

    /**
     * Constructs a Song with a title, duration, and artist.
     *
     * @param title             the song title
     * @param durationInSeconds the length of the song in seconds
     * @param artist            the artist who performs the song
     */
    public Song(String title, int durationInSeconds, String artist) {
        // Call the parent class constructor
        super(title, durationInSeconds);
        this.artist = artist;
    }

    /**
     * Plays the song by displaying its title and artist.
     * This method overrides the abstract play() method in Media.
     */
    @Override
    public void play() {
        System.out.println("♪ " + getTitle() + " by " + artist);
    }
}

/**
 * Main class that demonstrates abstraction and polymorphism
 * using the Media and Song classes.
 */
public class Main {

    /**
     * Program entry point.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        System.out.println("Alt Rock Hits Demo\n");

        // Creating Song objects using Media references (polymorphism)
        Media song1 = new Song("Mr. Brightside", 223, "The Killers");
        Media song2 = new Song("Chasing Cars", 264, "Snow Patrol");
        Media song3 = new Song("Creep", 239, "Radiohead");
        Media song4 = new Song("Amber", 265, "311");
        Media song5 = new Song("1979", 260, "Smashing Pumpkins");
        Media song6 = new Song("Butterfly", 265, "Crazy Town");

        // Display loaded songs using inherited getter method
        System.out.println("Songs loaded:");
        System.out.println("1. " + song1.getTitle());
        System.out.println("2. " + song2.getTitle());
        System.out.println("3. " + song3.getTitle());
        System.out.println("4. " + song4.getTitle());
        System.out.println("5. " + song5.getTitle());
        System.out.println("6. " + song6.getTitle());
        System.out.println();

        // Demonstrate polymorphism: same method call, different behavior
        System.out.println("🎵 Playing songs: 🎵");
        song1.play();
        song2.play();
        song3.play();
        song4.play();
        song5.play();
        song6.play();
    }
}
