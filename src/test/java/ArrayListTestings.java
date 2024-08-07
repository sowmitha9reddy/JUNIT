
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ArrayListTestings {

    static ArrayList<Integer> al;

    @BeforeAll
    @Order(1)
    @DisplayName("Create ArrayList")
    static void create() {
        al = new ArrayList<>();
    }

    @Test
    @Order(2)
    @DisplayName("Add Elements")
    public void addElements() {
        al.add(10); // 0
        al.add(30); // 1
        al.add(40); // 2
        al.add(40); // 3
        al.add(50); // 4
        al.add(40); // 5
        System.out.println(al);
        assertEquals(6, al.size());
        assertEquals(2, al.indexOf(40));
        assertEquals(5, al.lastIndexOf(40));
    }

    @Test
    @Order(3)
    @DisplayName("Remove Elements")
    public void removeElements() {
        al.add(10);
        al.add(30);
        al.add(40);
        al.add(50);


        al.remove(1); // Remove element at index 1
        System.out.println("After removing element at index 1"+ al);
        assertEquals(1, al.indexOf(40));

        al.remove(0); // Remove first element
        System.out.println("After removing element at index 0"+ al);
        assertEquals(0, al.indexOf(40));

        al.remove(al.size() - 1); // Remove last element
        System.out.println("After removing element at last index"+ al);
        assertEquals(7, al.size());
    }

    @Test
    @Order(4)
    @DisplayName("Test Get Out of Bounds")
    public void testGetOutOfBounds() {
        al.add(10);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            al.get(20); // This should throw IndexOutOfBoundsException
        });
    }

    @Test
    @Order(5)
    @DisplayName("Set Element")
    public void setElement() {
        al.add(10);
        al.add(30);
        al.add(40);
        System.out.println("After Setting");
        System.out.println(al);
        al.set(1, 50); // Update element at index 1
        assertEquals(50, al.get(1));
    }

    @Test
    @Order(6)
    @DisplayName("Add All Elements")
    public void addAllElements() {
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(60);
        elements.add(70);
        elements.add(80);
        System.out.println("Set of adding elements");
        System.out.println(elements);
        System.out.println("before adding all elemnts");
        System.out.println(al);


        al.addAll(elements);
        System.out.println("After adding all elemnts");
           System.out.println(al);
        assertEquals(14, al.size());
        assertEquals(40, al.get(0));
        assertEquals(50, al.get(2));

    }

    @Test
    @Order(7)
    @DisplayName("Clear Elements")
    public void clearElements() {
        al.add(10);
        al.add(30);
        al.add(40);

        al.clear();
        System.out.println("After clearing the elements");
        System.out.println( al);

        assertTrue(al.isEmpty() ,()->"false");
    }
}


