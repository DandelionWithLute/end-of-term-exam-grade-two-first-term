public class hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String[] books = { "A", "B" };
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        privateMethod();
    }

    static void privateMethod(){
        System.out.println("You are calling this private class.");
    }
}