package lesson1.tech.skelar.TestRepository;

import com.github.javafaker.Faker;

public class TestCase {
    public static void main(String[] args) {
        var faker = Faker.instance().cat();
        System.out.println("My cat's \uD83D\uDC31 name is " + faker.name() + " :)");
        System.out.println("His breed " + faker.breed() + " \uD83D\uDCAB");
        System.out.println("Its registration " + faker.registry() + " \uD83C\uDF0E");
    }
}
