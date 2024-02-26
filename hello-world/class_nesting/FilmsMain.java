public class FilmsMain {
    public static void main(String[] args) {
        Films.Film newFilm = new Films().new Film();
        Films.AnotherFilm myFilm = new Films.AnotherFilm();

        System.out.println("From the Film class");
        System.out.println(newFilm.title);
        System.out.println(newFilm.genre);
        System.out.println(newFilm.fcb);
        System.out.println(newFilm.release);
        System.out.println(newFilm.price);
        System.out.println("---------------------\n");
        System.out.println("From the AnotherFilm class.");
        System.out.println(myFilm.title);
        System.out.print("Available seats: ");
        for (String seatNumber : myFilm.availableSeats) {
            System.out.print(seatNumber + " ");
        }
        System.out.println();

    }
}
