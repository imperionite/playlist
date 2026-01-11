// The Song class demonstrates ENCAPSULATION in Java.
// It hides its internal data (fields) and exposes only safe methods to interact with it.
class Song {

    // Private fields: cannot be accessed directly outside this class
    private String title;
    private String artist;
    private int durationInSeconds;

    // Constructor: initializes a new Song object with given values
    // Notice we call setDuration() instead of assigning directly,
    // so that validation rules are applied even at creation.
    public Song(String title, String artist, int durationInSeconds) {
        this.title = title;
        this.artist = artist;
        setDuration(durationInSeconds); // validation applied at creation
    }

    // Getter: allows safe, read-only access to the title
    public String getTitle() {
        return title;
    }

    // Getter: allows safe, read-only access to the artist
    public String getArtist() {
        return artist;
    }

    // Getter: allows safe, read-only access to the duration
    public int getDuration() {
        return durationInSeconds;
    }

    // Setter with validation: controls how duration can be updated
    // Rule: duration must be greater than 0
    // If invalid, the update is rejected and a warning is printed
    public void setDuration(int durationInSeconds) {
        if (durationInSeconds > 0) {
            this.durationInSeconds = durationInSeconds;
        } else {
            System.out.println("Invalid duration. Must be greater than 0.");
        }
    }
}

// The Main class is the entry point of the program.
// It creates a Song object and demonstrates how encapsulation protects data.
public class Main {
    public static void main(String[] args) {
        // Create a Song object with initial values
        Song mySong = new Song("Golden Hour", "JVKE", 209);

        // Use getters to display the song’s title and duration
        System.out.println("Title: " + mySong.getTitle());
        System.out.println("Duration: " + mySong.getDuration());

        // Valid update: duration is changed to 250 seconds
        mySong.setDuration(250);
        System.out.println("Updated Duration: " + mySong.getDuration());

        // Invalid update: negative duration is rejected
        mySong.setDuration(-5);
        System.out.println("Updated Duration (after invalid attempt): " + mySong.getDuration());
    }
}
