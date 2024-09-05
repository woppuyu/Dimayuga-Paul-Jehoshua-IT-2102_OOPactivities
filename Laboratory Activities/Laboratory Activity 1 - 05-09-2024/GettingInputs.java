import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the year: ");
        String temp = cin.nextLine();
        int year = Integer.parseInt(temp);

        System.out.print("Enter the genre: ");
        String genre = cin.nextLine();

        System.out.print("Enter the album: ");
        String album = cin.nextLine();

        System.out.print("Enter the song title: ");
        String title = cin.nextLine();

        System.out.print("Enter the artist: ");
        String artist = cin.nextLine();

        System.out.println("--------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("--------------------------");

        System.out.println("Year Released: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);

        cin.close();
    }
    
}
