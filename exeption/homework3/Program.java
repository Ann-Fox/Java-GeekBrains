import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try {
            FileService service = new FileService();
            final String coding = "cp866";
            System.setProperty("console.encoding", coding);
            Scanner in = new Scanner(System.in, coding);
            System.out.println("Введите данные");
            String consoleText = in.nextLine();

            Parser parser = new Parser();
            ItemRecord data = parser.parceToData(consoleText);

            service.SaveToFile(data);

            in.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage() + e.getStackTrace());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}