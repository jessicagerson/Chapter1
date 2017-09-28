
/**
Delete one l (el) from the name of the class (so the first non-comment line is public class Helo), save the program, and recompile it. Is there an error message, if so what was the error message?
Answer: There is no error message.
Misspelling inside string. Correct the mistake above, then delete one l from the Hello in the message to be printed (inside the quotation marks). Save the program and recompile it. There is no error message—why not? Now run the program. What has changed?
Answer: There is no error message because the words inside the quotations are the user input, so now the program will print Helo, world! instead of Hello, world!
 delete the ending quotation mark enclosing the string Hello, World!. Save the program and recompile it. What error message(s) do you get?
Answer: You get the errors 1)unclosed string literal 2) ; expected and 3) reached end of file while parsing. These are synthax errors.
take out the beginning one. Save and recompile. How many errors this time? When you get lots of errors always concentrate on finding the first one listed!! 
Answer: There are 4 errors this time.
Now remove the semicolon at the end of the line that prints the message. Save the program and recompile it. What error message(s) do you get?
Answer: The only error thrown is the synthax error "; expetced"

 */
public class Hello{
    public static void main (String[] args)
    {
      System.out.println("Hello, world!");
    }
}