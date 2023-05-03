package task1906;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Четные символы
Считать с консоли 2 имени файла.
Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1).

Пример первого файла:
text in file
Вывод во втором файле:
eti ie
Закрыть потоки ввода-вывод


Requirements:
1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое первого файла
(используй FileReader c конструктором String).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна записывать во второй файл все символы
из первого файла с четным порядковым номером (используй FileWriter).
6. Поток записи в файл (FileWriter) должен быть закрыт.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        FileReader fr = new FileReader(s1);
        FileWriter fw =new FileWriter(s2);
        List<Character> chars = new ArrayList<>();
        int c;
        int a = 0;
        while ((c = fr.read())!=-1){
            ++a;
            if (a%2 == 0){
                chars.add((char)c);
            }
        }
        char[] arr = new char[chars.size()];
        for (int i = 0; i < chars.size(); i++) {
            arr[i] = chars.get(i);
        }
        fw.write(arr);

        fw.close();
        fr.close();
        reader.close();
    }
}
