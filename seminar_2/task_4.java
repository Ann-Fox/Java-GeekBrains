package seminar_2;
// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.\

import java.io.FileWriter;
import java.io.IOException;

public class task_4 {
    public static void main(String[] args) {
        FillFile();
    }

    public static void FillFile() {
        String name = "TEST";
        try {
            FileWriter fw = new FileWriter("seminar_2/test.txt");
            for (int i = 0; i < 100; i++) {
                fw.write(name);
                fw.append("\n");
            }
            fw.close();
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
