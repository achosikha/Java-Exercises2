package Collections;

public class MyMain {
    public static void main (String args[]){
        // 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        // Посчитать сколько раз встречается каждое слово.
        new MyArrayList();

        System.out.println();
        for (int size = 0; size <= 10; size++)
        {
            System.out.print ("**");
        }
        System.out.println();

        // 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и
        // телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять
        // записи. С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под
        // одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе
        // такой фамилии должны выводиться все телефоны.

        // Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную
        // запись добавлять еще дополнительные поля (имя, отчество, адрес), делать взаимодействие с
        // пользователем через консоль и т.д.). Консоль желательно не использовать (в том числе Scanner),
        // тестировать просто из метода main() прописывая add() и get().
        Phonebook myPhoneBook = new Phonebook();

        // adding Surnames and Telephone Number using method addToPhoneBook
        myPhoneBook.addToPhoneBook("Gorbachev",890849503);
        myPhoneBook.addToPhoneBook("Smirnova", 899148362);
        myPhoneBook.addToPhoneBook("Ivanov", 891473067);
        myPhoneBook.addToPhoneBook("Navalny",891309378);
        myPhoneBook.addToPhoneBook("Putin",899175093);
        myPhoneBook.addToPhoneBook("Yeltsin",891365801);
        myPhoneBook.addToPhoneBook("Smirnova", 899148361);
        myPhoneBook.addToPhoneBook("Ivanov",899120947);
        myPhoneBook.addToPhoneBook("Smirnov",899784095);
        myPhoneBook.addToPhoneBook("Smirnov",893467589);
        myPhoneBook.addToPhoneBook("Pugacheva", 899093847);
        myPhoneBook.addToPhoneBook("Smirnova", 899148363);
        myPhoneBook.addToPhoneBook("Pugacheva", 893762945);
        myPhoneBook.addToPhoneBook("Gorbachev", 893748571);
        myPhoneBook.addToPhoneBook("Navalny",899105637);
        myPhoneBook.addToPhoneBook("Smirnova", 899148365);
        myPhoneBook.addToPhoneBook("Navalny",897037532);
        myPhoneBook.addToPhoneBook("Smirnova", 899148364);

        // getting number via surname; all similar surnames by using contains();
        myPhoneBook.getMyPhoneNumber ("Smirnov");
    }
}
