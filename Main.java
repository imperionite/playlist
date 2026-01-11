class Song {

    private String title;
    private String artist;
    private int durationInSeconds;

    public Song(String title, String artist, int durationInSeconds) {
        this.title = title;
        this.artist = artist;
        setDuration(durationInSeconds); // validation applied at creation
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return durationInSeconds;
    }

    // Setter with validation
    public void setDuration(int durationInSeconds) {
        if (durationInSeconds > 0) {
            this.durationInSeconds = durationInSeconds;
        } else {
            System.out.println("Invalid duration. Must be greater than 0.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Song mySong = new Song("Golden Hour", "JVKE", 209);

        System.out.println("Title: " + mySong.getTitle());
        System.out.println("Duration: " + mySong.getDuration());

        // Valid update
        mySong.setDuration(250);
        System.out.println("Updated Duration: " + mySong.getDuration());

        // Invalid update
        mySong.setDuration(-5);
        System.out.println("Updated Duration (after invalid attempt): " + mySong.getDuration());
    }
}
