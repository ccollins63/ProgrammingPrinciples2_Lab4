package babynames;

import java.util.Scanner;


/**
 * Created by Tulin on 9/12/2017.
 */
public class ReadNamesTest {
    public static void main(String[] args) {

        int year = 2010;
        char gender = 'M';
        String name = "Javier";
        ReadNames.getRank(year, gender, name);

        year = 2009;
        gender = 'F';
        name = "Jennifer";
        ReadNames.getRank(year, gender, name);

        year = 2008;
        gender = 'F';
        name = "ABC";
        ReadNames.getRank(year, gender, name);

    }
    }
