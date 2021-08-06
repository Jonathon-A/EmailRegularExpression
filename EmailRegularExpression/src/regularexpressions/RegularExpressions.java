package regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static void main(String[] args) {

        //ab - members side by side must appear in that sequence
        //| - spererates alternatives
        //* - indicates that there are zero or more of the proceading element
        //+ - indicates that there is one or more of the proceading element
        //? - indicates that there are zero or one of the prceading element
        //() - used to identify groupings
        Scanner input = new Scanner(System.in);

        System.out.println("Please type in an email address");
        String userInput = input.next();

        //Matches email addresses. Based on expression at regular-expressions.info/email.html modified to include all top-level domains (TLD)listed on wikipedia as of June 2010. Needs to be updated as new TLDs are added. Known Issues: * IP Addresses will not validate * Double "at" symbols, e.g. email@em@il.com slip by this regex. Would welcome improvements by a regex ninja.
        //pattern from http://regexlib.com/Search.aspx?k=email
        Pattern regExPattern = Pattern.compile("^[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\\.)+(?:[a-zA-Z]{2}|aero|asia|biz|cat|com|coop|edu|gov|info|int|jobs|mil|mobi|museum|name|net|org|pro|tel|travel)$");

        Matcher matcher = regExPattern.matcher(userInput);

        if (matcher.matches()) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }

    }

}
