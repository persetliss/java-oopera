public class MusicalShow extends Show {
    Person musicAuthor;
    String librettoText;

    public MusicalShow(String title, Director director, int duration, Person musicAuthor,
                       String librettoText) {
        super(title, director, duration);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
