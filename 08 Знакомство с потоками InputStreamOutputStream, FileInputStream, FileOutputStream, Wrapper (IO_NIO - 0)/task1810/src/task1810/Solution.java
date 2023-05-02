package task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки работы с файлами.
2.2 Выбросить исключение DownloadException.


Requirements:
1. Программа должна считать имена файлов с консоли.
2. Для чтения из файлов используй поток FileInputStream.
3. Программа должна работать, пока введенный файл не окажется меньше 1000 байт.
4. Программа должна завершиться исключением DownloadException.
5. Поток FileInputStream должен быть закрыт.*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            FileInputStream file = new FileInputStream(reader.readLine());
            byte[] bytes = file.readAllBytes();
            int sum = 0;
            for (byte b: bytes){
                sum += b;
            }
            if (sum < 1000) {
                throw new DownloadException();
            }
        }

    }

    public static class DownloadException extends Exception {
        public DownloadException() {
            super("DownloadException");
        }
    }
}
