package com.example.lebanissa.jumbleapp;

/**
 * Created by lebanissa on 2017-07-23.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * The dictionary, which is the model of this app.
 *
 * @author Franck van Breugel
 */
public class Dictionary {


    /**
     * Initializes this dictionary from the given file.  Each line of the file contains a
     * single word.
     *
     * @param file file containing the words of this dictionary.
     */
    public Dictionary(File file)
    {
        try
        {
            Scanner input = new Scanner(file);

            while (input.hasNextLine())
            {
                String word = input.nextLine();
            }
            input.close();
        }
        catch (FileNotFoundException e)
        {
            // do nothing
        }
    }

    /**
     * Returns the list of words that are unscramblings of the given word.
     *
     * @param word word to be unscrambled.
     * @return list of words that are unscramblings of the given word.
     */
    public List<String> getUnscramblings(String word)
    {
        return new ArrayList<String>();
    }
}
