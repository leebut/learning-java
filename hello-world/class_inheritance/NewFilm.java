class NewFilm extends Films {
    private String newFilmTitle = "The Thing Again";

    public static void main(String[] args) {
        NewFilm filmObj = new NewFilm();
        filmObj.price = "5.99";

        System.out.println("Title: " + filmObj.newFilmTitle);
        System.out.println("Genre: " + filmObj.filmGenre);
        System.out.println("Classification: " + filmObj.flimClassification);
        System.out.println("Price: " + filmObj.price);
        
    }
}
