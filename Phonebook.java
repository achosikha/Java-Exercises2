package Collections;

import java.util.ArrayList;

public class Phonebook {
    ArrayList<String> surNames = new ArrayList<>();
    ArrayList<Integer> numbers = new ArrayList<>();

    void addToPhoneBook(String addSirName, int addNumber)
    {
        surNames.add(addSirName);
        numbers.add(addNumber);
    }

    void getMyPhoneNumber(String sirName)
    {
        boolean isSirName = true;

        for (int size = 0; size < surNames.size(); size++)
        {
            if (surNames.get(size).contains(sirName))
            {
                System.out.println (surNames.get(size) + " " + numbers.get(size));
                isSirName = false;
            }
        }
        if (isSirName) System.out.println ("No such family name found.");
    }
}
