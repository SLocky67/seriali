import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("/Users/elkapusto/Games/src");
        if (file1.mkdir()){
            System.out.println("Directory 1 created successfully");
        }
        File file2 = new File("/Users/elkapusto/Games/res");
        if (file2.mkdir()){
            System.out.println("Directory 2 created successfully");
        }
        File file3 = new File("/Users/elkapusto/Games/savegames");
        if (file3.mkdir()){
            System.out.println("Directory 3 created successfully");
        }
        File file4 = new File("/Users/elkapusto/Games/temp");
        if (file4.mkdir()){
            System.out.println("Directory 4 created successfully");
        }
        File file5 = new File("/Users/elkapusto/src/main");
        if (file5.mkdir()){
            System.out.println("Directory 5 created successfully");
        }
        File file6 = new File("/Users/elkapusto/src/test");
        if (file6.mkdir()){
            System.out.println("Directory 6 created successfully");
        }
        File file7 = new File("/Users/elkapusto/res/drawables");
        if (file7.mkdir()){
            System.out.println("Directory 7 created successfully");
        }
                File file8 = new File("/Users/elkapusto/res/vectors");
        if (file8.mkdir()){
            System.out.println("Directory 8 created successfully");
        }
        File file9 = new File("/Users/elkapusto/res/icons");
        if (file9.mkdir()){
            System.out.println("Directory 9 created successfully");
        }



        String directoryPath = "/Users/elkapusto/src/main";
        int numberOfFiles = 2;

        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        String[] fileNames = {"Main.java", "Utils.java"};

        for (int i = 0; i < numberOfFiles; i++) {
            String filePath = directoryPath + "/" + fileNames[i];
            File file = new File(filePath);
            try {
                if (file.createNewFile()) {
                    System.out.println("Файл " + file.getName() + " успешно создан");
                } else {
                    System.out.println("Файл " + file.getName() + " уже существует");
                }
            } catch (IOException e) {
                System.out.println("Ошибка при создании файла " + file.getName());
                e.printStackTrace();
            }
        }
        String directoryPath2 = "/Users/elkapusto/Games/temp";
        String fileName = "temp.txt";

        File directory2 = new File(directoryPath);
        if (!directory2.exists()) {
            directory2.mkdirs();
        }

        StringBuilder logBuilder = new StringBuilder();

        // Добавляем информацию о создании файлов и каталогов в StringBuilder
        logBuilder.append("Создание каталога: ").append(directoryPath2).append("\n");
        logBuilder.append("Создание каталога: ").append(file1).append("\n");
        logBuilder.append("Создание каталога: ").append(file2).append("\n");
        logBuilder.append("Создание каталога: ").append(file3).append("\n");
        logBuilder.append("Создание каталога: ").append(file4).append("\n");
        logBuilder.append("Создание каталога: ").append(file5).append("\n");
        logBuilder.append("Создание каталога: ").append(file6).append("\n");
        logBuilder.append("Создание каталога: ").append(file7).append("\n");
        logBuilder.append("Создание каталога: ").append(file8).append("\n");
        logBuilder.append("Создание каталога: ").append(file9).append("\n");


        String filePath = directoryPath2 + "/" + fileName;
        File file = new File(filePath);
        try {
            if (file.createNewFile()) {
                logBuilder.append("Файл ").append(file.getName()).append(" успешно создан\n");
            } else {
                logBuilder.append("Файл ").append(file.getName()).append(" уже существует\n");
            }
        } catch (IOException e) {
            logBuilder.append("Ошибка при создании файла ").append(file.getName()).append("\n");
            e.printStackTrace();
        }

        // Записываем лог в файл temp.txt
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(logBuilder.toString());
            System.out.println("Лог успешно записан в файл " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи лога в файл " + fileName);
            e.printStackTrace();
        }
    }
}
