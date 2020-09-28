import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {
    // The main system input of the user
    Scanner scanner = new Scanner(System.in);

    public void MenuPage() throws IOException {
        System.out.println("Welcome, please enter a Wikipedia page you want to search.");
        String inputWikipediaPage = scanner.nextLine();

        System.out.println("\n Choose an action: " +
                "\n1. See the most active editor " +
                "\n2. See the most recent changes");
        int menuSearchOption = Integer.parseInt(scanner.nextLine());

        if (menuSearchOption == 1) {
            Editors.mostActiveEditor(inputWikipediaPage);
        }
        else if (menuSearchOption == 2) {
            recentEditsMade(inputWikipediaPage);
        }
         public void mostActiveEditor(String inputWikipediaPage) throws IOException {
            ActiveEditor activeEditor = new ActiveEditor();
            activeEditor.mostActiveEditor(inputWikipediaPage);
        }
    }
}
