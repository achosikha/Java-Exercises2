package Threads;

public class MyMain {
    public static void main (String[] args)
    {
        // 1) Создают одномерный длинный массив, например:
        // 2) Заполняют этот массив единицами;
        // 3) Засекают время выполнения: long a = System.currentTimeMillis();
        // 4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле;
        // 5) Проверяется время окончания метода System.currentTimeMillis();
        // 6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a);
        new MyThreads();
    }
}
