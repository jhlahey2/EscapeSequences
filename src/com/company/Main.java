package com.company;

/**
 * A character preceded by a backslash () is an escape sequence and has special meaning to the compiler. The following table shows the Java escape sequences. Note: Each escape sequence represents one character entity.
 * Escape Sequence 	Description
 *  \t 	Insert a tab in the text at this point.
 *  \b 	Insert a backspace in the text at this point.
 *  \n 	Insert a newline in the text at this point.
 *  \r 	Insert a carriage return in the text at this point.
 *  \f 	Insert a formfeed in the text at this point.
 *  \' 	Insert a single quote character in the text at this point.
 *  \" 	Insert a double quote character in the text at this point.
 *  \ 	Insert a backslash character in the text at this point.
 *  Write a Java program to print a box, an oval, or a diamond (choose one) using asterisks.
 */

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Let's have some fun making shapes!\n\n");

        System.out.println("A square seems easy, lets try it.\n\n");

        System.out.print("\t***************\n");
        System.out.print("\t*             *\n");
        System.out.print("\t*             *\n");
        System.out.print("\t*             *\n");
        System.out.print("\t*             *\n");
        System.out.print("\t*             *\n");
        System.out.print("\t***************\n");
        System.out.print("\n\n");

        System.out.println("How about a diamond?\n\n");

        System.out.print("\t       *       \n");
        System.out.print("\t      * *      \n");
        System.out.print("\t     *   *     \n");
        System.out.print("\t    *     *    \n");
        System.out.print("\t   *       *   \n");
        System.out.print("\t    *     *    \n");
        System.out.print("\t     *   *     \n");
        System.out.print("\t      * *      \n");
        System.out.print("\t       *       \n");
        System.out.print("\n\n");

        System.out.println("Now an oval.\n\n");

        System.out.print("\t      ***      \n");
        System.out.print("\t     *   *     \n");
        System.out.print("\t    *     *    \n");
        System.out.print("\t   *       *   \n");
        System.out.print("\t   *       *   \n");
        System.out.print("\t    *     *    \n");
        System.out.print("\t     *   *     \n");
        System.out.print("\t      ***      \n");
        System.out.print("\n\n");

        System.out.println("TA-DA!\n\n");

        System.out.println("Let's see if overtyping works?\n\n");

        System.out.println("First print a word then strike it out like this\b\b\b\b----.");
        System.out.println("Nope, that didn't really work.  It backspaced, but didn't overtype.");
        System.out.println("Oh well.");

    }
}
