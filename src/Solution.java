import Repositories.StringObjectsRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    static StringObjectsRepository repository = new StringObjectsRepository();
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Нажмите 1 для выбора готовых последовательнстей или 0 для задания собственных: ");
        String choice = reader.readLine();
        if (choice.equals("1") || choice.equals("0")) {
            if (choice.equals("1")) {
                try {
                    readySubseq(reader);
                } catch (IOException e) {
                    System.out.println("Неверный ввод!");
                    return;
                }
            } else
                mySubseq(reader);
            System.out.println(SubsequenceComparator.compare(repository.getListX(), repository.getListY()));
        } else System.out.println("Неверный ввод!");
        reader.close();

    }

    private static void readySubseq(BufferedReader reader)  throws IOException
    {
        int size1;
        int size2;
        try
        {
            System.out.println("Введите размер первой последовательности: ");
            size1 = Integer.parseInt(reader.readLine());
            System.out.println("Введите размер второй последовательности: ");
            size2 = Integer.parseInt(reader.readLine());
        }
        catch (Exception e)
        {
            throw new IOException();
        }
        if(size1 < 1 || size2 < 1) throw new IOException();
        repository.fillLists(size1, size2);
        System.out.println("Первая последовательность: ");
        for (Object o : repository.getListX()) {
            System.out.print(o + " ");
        }
        System.out.println();
        System.out.println("Вторая последовательность: ");
        for (Object o : repository.getListY()) {
            System.out.print(o + " ");
        }
        System.out.println();


    }
    private static void mySubseq(BufferedReader reader) throws IOException
    {
        System.out.println("Введите элементы первой последовательности через пробел: ");
        String first = reader.readLine();
        System.out.println("Введите элементы второй последовательности через пробел: ");
        String second = reader.readLine();
        repository.fillLists(first,second);
    }
}
