package literatureStats;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TranslationApp {

    public static void main(String[] args) {
        // 设置输入文件和输出文件的路径
        String inputFilePath = "input/test.txt";
        String outputFilePath = "output.txt";

        // 选择翻译类型，例如：DOG
        Translation translationType = Translation.DOG;

        // 翻译并导出文件
        translateAndExport(inputFilePath, outputFilePath, translationType);
    }

    private static void translateAndExport(String inputFilePath, String outputFilePath, Translation translationType) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                StringBuilder translatedLine = new StringBuilder();

                for (String word : words) {
                    String translatedWord = translationType.translate(word);
                    translatedLine.append(translatedWord).append(" ");
                }

                writer.write(translatedLine.toString().trim());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
