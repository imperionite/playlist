abstract class Media {
    // Our shared info - every media needs these
    private String title;
    private int durationInSeconds;

    // Constructor - sets up the shared stuff
    public Media(String title, int durationInSeconds) {
        this.title = title;
        this.durationInSeconds = durationInSeconds;
    }

    // Getters - way to see the private info safely
    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return durationInSeconds;
    }

    // ABSTRACT = "subclasses MUST write this method"
    public abstract void play();
}

// =======================================
// Song class - uses Media's stuff + adds song extras
// =======================================
class Song extends Media {
    private String artist;  // Song-only info

    // Constructor - super() calls parent's constructor first!
    public Song(String title, int durationInSeconds, String artist) {
        super(title, durationInSeconds);  // Parent setup first
        this.artist = artist;
    }

    // Our version of play() - what makes Song special
    @Override
    public void play() {
        System.out.println("♪ " + getTitle() + " by " + artist);
    }
}

// =======================================
// MAIN - Let's see it work!
// =======================================
public class Main {
    public static void main(String[] args) {
        System.out.println("Alt Rock Hits Demo\n");

        // Same Media type, different songs (polymorphism!)
        Media song1 = new Song("Mr. Brightside", 223, "The Killers");
        Media song2 = new Song("Chasing Cars", 264, "Snow Patrol");
        Media song3 = new Song("Creep", 239, "Radiohead");
        Media song4 = new Song("Amber", 265, "311");
        Media song5 = new Song("1979", 260, "Smashing Pumpkins");
        Media song6 = new Song("Butterfly", 265, "Crazy Town");

        // All songs have title + duration (from Media)
        System.out.println("Songs loaded:");
        System.out.println("1. " + song1.getTitle());
        System.out.println("2. " + song2.getTitle());
        System.out.println("3. " + song3.getTitle());
        System.out.println("4. " + song4.getTitle());
        System.out.println("5. " + song5.getTitle());
        System.out.println("6. " + song6.getTitle());
        System.out.println();

        // Same play() call → different results!
        System.out.println("🎵 Playing songs: 🎵");
        song1.play();
        song2.play();
        song3.play();
        song4.play();
        song5.play();
        song6.play();
    }
}
