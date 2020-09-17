package org.jetbrains.kotlin2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        org.jetbrains.kotlin2.Book book = new org.jetbrains.kotlin2.Book("Pushkin", 32, false);
        org.jetbrains.kotlin2.Book book2 = new org.jetbrains.kotlin2.Book("Pushkin1", 33, true);
        org.jetbrains.kotlin2.Book book3 = new org.jetbrains.kotlin2.Book("Pushkin2", 34, false);
        org.jetbrains.kotlin2.Book book4 = new Book("Pushkin3", 35, true);
        book2.setAuthor("Tolstoi");
        book3.setIndex(44);
        book4.setInUse(book.inUse);

        org.jetbrains.kotlin2.MyClass myObj = new MyClass();
        System.out.println(myObj.x);
        myObj.x = book.getIndex();
        System.out.println(myObj.x);
        System.out.println( "Hello World!" );
    }
}
