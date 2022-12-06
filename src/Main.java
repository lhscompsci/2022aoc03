import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) throws Throwable {

        partOne();
        partTwo();

    }

    private static void partTwo() throws Throwable {
        Scanner infile = new Scanner(new File("test.dat"));

      

        long totalScore = 0L;
        while(infile.hasNext()){
            String elf0 = infile.nextLine();
            String elf1 = infile.nextLine();
            String elf2 = infile.nextLine();

            int where = -1;
            for(char c: elf0.toCharArray()){
                if(elf1.indexOf(c) >= 0 && elf2.indexOf(c) >= 0)
                    where = elf1.indexOf(c);
            }
            char dup = elf1.charAt(where);
            if(dup > 'Z')
                totalScore += (dup-'a'+1);
            else
                totalScore += (dup-'A'+27);
         }

        out.println(totalScore);
    }

    private static void partOne() throws Throwable {
        Scanner infile = new Scanner(new File("test.dat"));

        long totalScore = 0L;
        while(infile.hasNext()){
            String next = infile.nextLine();
            String partA = next.substring(0,next.length()/2);
            String partB = next.substring(next.length()/2);

            int where=-1;
            for(char c:partA.toCharArray()){
                if(partB.indexOf(c) >= 0)
                    where = partB.indexOf(c);
            }
            char dup = partB.charAt(where);
            if(dup > 'Z')
                totalScore += (dup-'a'+1);
            else
                totalScore += (dup-'A'+27);

        }

        out.println(totalScore);

    }
}
