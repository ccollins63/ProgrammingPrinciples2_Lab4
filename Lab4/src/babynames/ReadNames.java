package babynames;

import java.io.*;

public class ReadNames {
    private static String[][] boyNames = new String[10][1000];
    private static String[][] girlNames = new String[10][1000];

    public static void getRank(int year, char gender, String name)
    {
        readFiles();

        if (gender == 'M')
    {
        searchBoyNames(year, name);
    }
    else if (gender == 'F')
        {
            searchGirlNames(year, name);
        }
        //
    }

    private static void readFiles()
    {
        String home = System.getProperty("user.home");
        String filePath = home + "/Documents/KSU/Fall 2017/CS 1302/Lab4/src/babynames/data/Babynamesranking";
        try
        {
            int year = 2000;
            for (int i=0; i < 10; i++)
            {
                year ++;
                File file = new File(filePath + year + ".txt");
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line;

                int index = 0;
                while ((line = bufferedReader.readLine( )) != null)
                {
                    String[] name = line.split("\t");
                    String boyName = name[1].trim();
                    String girlName = name[3].trim();
                    boyNames[i][index] = boyName;
                    girlNames[i][index] = girlName;
                    index++;
                }

                fileReader.close( );
            }
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }

    }


    private static int searchBoyNames(int year, String name)
    {
        for(int i = 0; i < 1000; i++)
        {
            int index = year - 2001;

            String boyName = boyNames[index][i];
            if (name.equalsIgnoreCase(boyName))
            {
                System.out.println("Boy name " + name + " is ranked #" + (i + 1) + " in year " + year);
                return 0;
            }
        }
        System.out.println("Boy name " + name + " is not ranked in year " + year);

        return -1;
    }

    private static int searchGirlNames(int year, String name)
    {
        for(int i = 0; i < 1000; i++)
        {
            int index = year - 2001;
            String girlName = girlNames[index][i];
            if (name.equalsIgnoreCase(girlName))
            {
                System.out.println("Girl name " + name + " is ranked #" + (i + 1) + " in year " + year);
                return 0;
            }
        }
        System.out.println("Girl name " + name + " is not ranked in year " + year);
        return -1;
    }
}