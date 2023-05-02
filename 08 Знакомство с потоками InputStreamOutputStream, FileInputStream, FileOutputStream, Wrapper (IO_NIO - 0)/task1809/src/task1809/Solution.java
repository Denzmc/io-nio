package task1809;

import java.io.*;
import java.util.*;

/* 
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.


Requirements:
1. Программа должна два раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
3. Во второй файл нужно записать все байты из первого в обратном порядке.
4. Потоки FileInputStream и FileOutputStream должны быть закрыты.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream file = new FileInputStream(reader.readLine());

        FileOutputStream fos2 = new FileOutputStream(reader.readLine());

        List<Integer> list = new ArrayList<>();

        while (file.available()>0){
            int data = file.read();
            list.add(data);
        }

        for (int i = list.size()-1; i > -1; i--) {
            fos2.write(list.get(i));
        }
        file.close();
        fos2.close();

    }
}
