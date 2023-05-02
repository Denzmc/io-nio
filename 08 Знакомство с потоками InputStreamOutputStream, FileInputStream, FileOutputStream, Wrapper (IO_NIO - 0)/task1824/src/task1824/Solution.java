package task1824;

import java.io.*;

/* 
Файлы и исключения
Читайте с консоли имена файлов.
Если файла не существует (передано неправильное имя файла),
то перехватить исключение FileNotFoundException,
вывести в консоль переданное неправильное имя файла и завершить работу программы.
Закрыть потоки.
Не используй System.exit();


Requirements:
1. Программа должна считывать имена файлов с консоли.
2. Для каждого файла нужно создавать поток для чтения.
3. Если файл не существует, программа должна перехватывать исключение FileNotFoundException.
4. После перехвата исключения, программа должна вывести имя файла в консоль и завершить работу.
5. Потоки для чтения из файла должны быть закрыты.
6. Команду "System.exit();" использовать нельзя.*/

public class Solution {
    public static void main(String[] args) {
        String s = "";
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true){
                s = reader.readLine();
                FileInputStream file = new FileInputStream(s);


                file.close();
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("File name: "+s);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
