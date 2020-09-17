package org.jetbrains.kotlin17;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Book book = new Book("Pushkin", 32, false);
        Book book2 = new Book("Pushkin1", 33, true);
        Book book3 = new Book("Pushkin2", 34, false);
        Book book4 = new Book("Pushkin3", 35, true);
        book2.setAuthor("Tolstoi");
        book3.setIndex(44);
        book4.setInUse(book.inUse);

        MyClass myObj = new MyClass();
        System.out.println(myObj.x);
        myObj.x = book.getIndex();
        System.out.println(myObj.x);
        System.out.println( "Hello World!" );
    }
}
