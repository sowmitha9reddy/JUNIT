import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LinkedListTesting {

  static LinkedList<Integer> ll;
    @BeforeAll
    @DisplayName("create LinkedList")

    static void create(){
        ll=new LinkedList<Integer>();
    }
    @Test
            @DisplayName("add Elements")
    @Order(1)
            public  void addElements(){
                    ll.add(10);//0
		            ll.add(30);//1
		           ll.add(40);//2
                   ll.add(40);//3
        ll.printLinkedList();
        Assertions.assertEquals(4,ll.size());
        Assertions.assertEquals(2,ll.indexOf(40));
        Assertions.assertEquals(3,ll.lastIndexOf(40));


    }
   @Test
           @DisplayName("Remove Elements")
   @Order(2)
           public void removeElements(){
                   ll.printLinkedList();
                     ll.add(70);
                     ll.add(90);
                     ll.add(80);
                     ll.add(100);
                     ll.printLinkedList();
                      ll.remove(3);
                    //  ll.printLinkedList();
                      Assertions.assertEquals(3,ll.indexOf(70));

                      ll.removeFirst();
                      Assertions.assertEquals(0,ll.indexOf(30));

                      ll.removeLast();
                      Assertions.assertEquals(5,ll.size());



   }
    @Test
@Order(3)

    public void testGetOutOfBounds() {

        ll.add(10);

        ll.indexOf(20);  // This should throw IndexOutOfBoundsException
    }








}
