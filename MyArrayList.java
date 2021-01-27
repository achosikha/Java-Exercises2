package Collections;

import java.util.ArrayList;

public class MyArrayList {
    ArrayList<String> myWords = new ArrayList<>();

    int [] countEachWord;

    MyArrayList()
    {
        initializeArrayList();
        sortOutMyArray();
    }

    void initializeArrayList()
    {
        myWords.add("Book");
        myWords.add("Pen");
        myWords.add("Car");
        myWords.add("House");
        myWords.add("Bike");
        myWords.add("Car");
        myWords.add("Paper");
        myWords.add("Finger");
        myWords.add("Book");
        myWords.add("Car");
        myWords.add("Block");
        myWords.add("House");
        myWords.add("Wheel");
        myWords.add("Axis");
        myWords.add("Box");
        myWords.add("Square");
        myWords.add("Circle");
        myWords.add("Square");
        myWords.add("Wheel");
        myWords.add("Paper");

        countEachWord = new int [myWords.size()];

        System.out.println ("The initial ArrayList:");
        getMySortedArray();
        System.out.println();
    }

    void sortOutMyArray()
    {
        // Я тут мог и создать массив обыкновенный от ArrayList, но так быстрее и проще
        for (int sizeOut = 0; sizeOut < myWords.size(); sizeOut++)
        {
            countEachWord [sizeOut] = 1;
            for (int sizeInn = sizeOut+1; sizeInn < myWords.size(); sizeInn++)
            {
                if (myWords.get(sizeOut).equals(myWords.get(sizeInn)))
                {
                    myWords.remove(sizeInn);
                    countEachWord [sizeOut] = countEachWord[sizeOut] + 1;
                }
            }
        }
        System.out.println ("Sorted out ArrayList is: ");
        getCountEachWord();
    }

    void getMySortedArray()
    {
        System.out.println(myWords);
    }

    void getCountEachWord()
    {

        int loop = 1;

        for (int size = 0; size < myWords.size(); size++)
        {
            System.out.print (myWords.get(size) + ": " + countEachWord[size] + "; ");
            loop++;
            if (loop == 7)
            {
                System.out.println();
                loop = 1;
            }
        }
        System.out.println();
    }
}
