import java.util.ArrayList;

/**
 * Main class demonstrating abstraction, inheritance, and polymorphism in
 * MyPlaylist.
 * Shows how Media references can point to multiple subclasses (Song, Podcast,
 * PodcastEpisode)
 * and how dynamic method dispatch works.
 */
public class Main {

    /**
     * Entry point of the program.
     * Demonstrates polymorphic references, a polymorphic collection, loops, and
     * parent-type methods.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {

        System.out.println("MyPlaylist Polymorphism Demo with ArrayList\n");

        // ============================
        // Step 1: Polymorphic References
        // ============================

        Media song = new Song("Amber", 260, "311"); // Updated song
        Media podcast = new Podcast("History Hour", 3000, "Prof. Luna");
        Media episode = new PodcastEpisode("AI Trends", 600, "Tech Talk", 12);

        // Dynamic method dispatch demonstration
        song.play(); // Calls Song's play() method
        podcast.play(); // Calls Podcast's play() method
        episode.play(); // Calls PodcastEpisode's play() method

        // ============================
        // Step 2: Polymorphic Collection
        // ============================

        ArrayList<Media> playlist = new ArrayList<>();
        playlist.add(song);
        playlist.add(podcast);
        playlist.add(episode);

        // ============================
        // Step 3: Loop Through Collection
        // ============================

        System.out.println("\nPlaying playlist using polymorphic ArrayList loop:");
        for (Media item : playlist) {
            item.play(); // Calls the correct overridden play() method dynamically
        }

        // ============================
        // Step 4: Parent-Type Helper Method
        // ============================

        System.out.println("\nDisplaying media information:");
        for (Media item : playlist) {
            printMediaInfo(item); // Works for any Media subclass
        }

        // ============================
        // Step 5: Reflection on Polymorphism
        // ============================

        // Observations:
        // 1. Each object successfully ran its overridden play() method 
        // 2. No instanceof or type-checking was required 
        // 3. Loop handled all media types without modification 
        // 4. Adding new media types would not require changing loops or helper methods
        // 
        // 5. Demonstrates scalable and maintainable OOP design using polymorphism
    }

    /**
     * Helper method to print general information about any Media object.
     *
     * @param item Media object (Song, Podcast, PodcastEpisode, etc.)
     */
    public static void printMediaInfo(Media item) {
        System.out.println(item.getTitle() + " (" + item.getDurationInSeconds() + " seconds)");
    }
}
