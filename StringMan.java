// String Manipulation
// *Find the length of the string.
// *Character at second and fourth position.
// *Find the sub string using start index only. 
// *Find the sub string using start index only and end index.

public class String_ {
    public static void main(String[] args) {
        String str="Java Programming";
        System.out.println("The string is '"+str+"'");
        System.out.println("Length of the String is "+str.length());
        System.out.println("Character at second and fourth position is "+str.charAt(1)+","+str.charAt(3));
        System.out.println("The sub string using start index only is "+str.substring(5));
        System.out.println("The sub string using start index only is "+str.substring(0,4) );


    }
    
}

// *Concatenate a given string to the end of another string.


public class ConString {
    public static void main(String[] args) {
        String s1="Hello";
        String s2=" World";
        String s3=s1.concat(s2);
        System.out.println(s3);

        String s4="Good"+" Morning";
        System.out.println(s4);
    }
}


// *Covert all characters in a string to lowercase.
// *Covert all characters in a string to uppercase.

public class StartString {
    public static void main(String[] args) {
        String s1 ="Good Morning";
        System.out.println(s1);
        System.out.println("To Upper case:"+s1.toUpperCase());
        System.out.println("To Lower caes:"+s1.toLowerCase());
    }
}
