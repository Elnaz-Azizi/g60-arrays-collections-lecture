package se.lexicon;

import java.util.*;

public class CollectionsDemo {
    static void main() {
        ex8();
    }

    //ArrayList
    public static void ex1() {
        ArrayList<String> books = new ArrayList<>();
        books.add("Java");
        books.add("Java");
        books.add("Spring");
        books.add("React");
        books.add("Clean Code");
        books.add("OCP");
        books.add("OCP");
        //Print the list
        System.out.println(books);
        //Print the size of the list
        System.out.println(books.size());
        //Access specific element by index
        System.out.println(books.get(0)); //Java
        System.out.println(books.get(1)); //Java
        System.out.println(books.get(2)); //Spring
        //System.out.println(books.get(8)); //Index 8 out of bounds for length 7

        Iterator<String> iterator = books.iterator();
        while (iterator.hasNext()) {
            String book = iterator.next();
            if (book.equals("OCP")) {
                iterator.remove();
            }
        }
        System.out.println(books);
        System.out.println(books.size());


    }

    public static void ex2() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(100);
        numbers.add(400);
        numbers.add(300);
        numbers.add(200);

        boolean isRemoved = numbers.remove(Integer.valueOf(100));
        System.out.println("isRemoved 100= " + isRemoved);
        System.out.println(numbers);
        System.out.println(numbers.size());

        Integer removedByIndex = numbers.remove(2);
        System.out.println("Removed by index = " + removedByIndex);
        System.out.println(numbers);
        System.out.println(numbers.size());

    }

    public static void ex3() {
        List<String> euCars = new ArrayList<>();

        euCars.add("Volvo");
        euCars.add("BMW");
        euCars.add("Volvo");
        euCars.add("Volvo");

        String target = "Volvo";

        List<String> usaCars = new ArrayList<>();
        usaCars.add("Tesla");
        euCars.addAll(usaCars);

        for (String car : euCars) {
            System.out.println("car = " + car);
        }

        System.out.println("First index of Volvo = " + euCars.indexOf("Volvo"));
        System.out.println("Last index of Volvo = " + euCars.lastIndexOf("Volvo"));

        // How to get all indexes of repetitive items (0, 2, 3)?
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < euCars.size(); i++) {
            if (euCars.get(i).equals(target)) {
                indexes.add(i);
            }
        }
        System.out.println("All indexes: " + indexes);

    }

    public static void ex4() {
        //Convert List to Array
        List<String> names = new ArrayList<>();
        names.add("Mehrdad");
        names.add("Simon");
        names.add("Marcus");
        String[] nameArray = names.toArray(new String[0]);
        System.out.println("First name: " + nameArray[0]);

    }

    public static void ex5() {
        //Sort and Shuffle
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        // Collections.sort(numbers);
        //System.out.println("Sorting numbers in ascending order: " + numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);

        Collections.shuffle(numbers);
        System.out.println("Shuffled numbers: " + numbers);

    }

    public static void ex6() {
        Person person1 = new Person(1, "Mehrdad", "mehrdad.javan@lexicon.se");
        Person person2 = new Person(1, "Mehrdad", "mehrdad.javan@lexicon.se");

        System.out.println(person1.equals(person2));

        String test1 = "Test";
        String test2 = "Test";

        System.out.println(test1.equals(test2));

        System.out.println(person1.equals(person2));

        System.out.println(" person1.hashcode= " + person1.hashCode());
        System.out.println(" person2.hashcode= " + person2.hashCode());


    }

    //HashSet
    public static void ex7() {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Cherry");
        System.out.println(set);
        System.out.println(set.contains("Apple"));
        set.remove("Banana");
        System.out.println(set);
        System.out.println(set.size());

        HashSet<String> newFruits = new HashSet<>();
        newFruits.add("Date");
        newFruits.add("Elderberry");
        set.addAll(newFruits);
        System.out.println(set);

        String[] array = set.toArray(new String[0]);
        System.out.println(Arrays.toString(array));

        set.clear();
        System.out.println("Is set empty? " + set.isEmpty());

    }

    public static void ex8() {
        HashSet<Person> peopleHashSet = new HashSet<>();
        peopleHashSet.add(new Person(3, "John", "jon@test.se"));
        peopleHashSet.add(new Person(1, "Alice", "alice@test.se"));
        peopleHashSet.add(new Person(2, "Bob", "bob@test.se"));
        peopleHashSet.add(new Person(2, "Bob", "bob@test.se"));

        System.out.println("Contents of HashSet:");
        peopleHashSet.forEach(person -> System.out.println(person));
        System.out.println("______________________________");
        Iterator<Person> iterator = peopleHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Person person : peopleHashSet) {
            System.out.println(person);
        }

    }

    //Hashmap
    public static void ex9() {
        Map<String, String> contactMap = new HashMap<>();
        // Map<KeyType, ValueType>
        contactMap.put("Simon", "simon@lexicon.se");
        contactMap.put("Ulf", "ulf@lexicon.se");
        contactMap.put("Mehrdad", "mehrdad@lexicon.se");

        System.out.println("Mehrdad's email: " + contactMap.get("Mehrdad"));

    }

}
