package task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки.


Requirements:
1. Программа должна считывать имя файла с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое файла
(используй FileReader c конструктором принимающим String).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль количество слов "world",
которые встречаются в файле.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        FileReader fr = new FileReader(reader.readLine());
        StringBuilder sb = new StringBuilder();
        int c;
        while ((c = fr.read())!=-1){
            sb.append((char) c);
        }

        String s = sb.toString();
        s = s.replaceAll("\\p{Punct}"," ");
        s = s.replaceAll("\n"," ");

        String[] strings = s.split(" ");
        for(String str: strings){
            str = str.trim();
            if (str.equals("world"))
                count++;
        }
        System.out.println(count);
        fr.close();
        reader.close();
    }
}
