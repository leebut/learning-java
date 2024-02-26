public class Films {
    String nestMessage = "This is the outer Films class";

    String title = "The Thing";
    String genre = "Sci-Fi, horror";
    String fcb = "18";
    String release = "1978";

    class Film {
        Films myFilm = new Films();

        String title = myFilm.title;
        String genre = myFilm.genre;
        String fcb = myFilm.fcb;
        String release = myFilm.release;
        String price = "£6.99";
    }

    static class AnotherFilm {
        Films anotherFilm = new Films();
        String title = anotherFilm.title;
        String[] availableSeats = { "A15", "A16", "A25" };

    }
}
