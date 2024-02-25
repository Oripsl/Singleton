public class Main {
    public static void main(String[] args) {
        User user1 = new User("Carlo", 25);
        User user2 = new User("Luca", 22);

        System.out.println("User1 :");
        user1.printAgeAndName();

        user2.setAge(55);
        user2.setName("Fabio");
        user2.printAgeAndName();
    }
}
