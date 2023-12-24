package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Calendar;

public class WorkWithFiles {
    public static void main(String[] args) throws IOException {

//        FileInputStream inputStream = new FileInputStream(file);
//        var bytes = inputStream.readAllBytes();
//        String temp = new String(bytes).replaceAll(" ", "");
//        Integer i = temp.charAt(0) + temp.charAt(2);
//        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
//        fileOutputStream.write(i.toString().getBytes());
//        File file = new File("C:\\Users\\Victus\\Downloads\\Telegram Desktop\\New hard\\New folder\\new_image");
//        FileInputStream fileInputStream = new FileInputStream(file);
//        File file1 = new File("C:\\Users\\new_imager.jpg");
//        FileOutputStream fileOutputStream = new FileOutputStream(file1);
//        var bytes = fileInputStream.readAllBytes();
//        fileOutputStream.write(bytes);

        String p = "newFiler.txt";
        Path directory = Paths.get("C:\\Users\\Victus\\Desktop\\2024");
        Path filePath = directory.resolve(p);
        try {
            Files.createFile(filePath);
            System.out.println("File created successfully at: " + filePath);
        } catch (IOException e) {
            System.out.println("Unable to create file: " + e.getMessage());
        }
        Calendar calendar = Calendar.getInstance();
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 31; j++) {
                calendar.set(2024, i, j);
                String fileName = calendar.toString();
            }
        }
        LocalDate localDate;
    }
}

