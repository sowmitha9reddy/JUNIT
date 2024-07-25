import org.junit.jupiter.api.*;
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Demo {
    @BeforeAll
   static void beforeClass1() {
        System.out.println("ruuniing ..before class");
    }


	@BeforeEach
	void beforeEach() {
		System.out.println("runnin..before each");
	}

//
////	@BeforeAll
////	void beforeClass() {
////		System.out.println("ruuniing ..before class");
////	}
////
     @AfterEach
     void AfterEach1() {
        System.out.println("runnin..After each");
     }
//
	@Test
	void test() {
	   System.out.println("This is my test Case");
		//fail("not yet implemented");
	}
	 @Test
	  @DisplayName("Hello Test Cases")
	    public void unitTest() {
	        String actualValue="Hello World";
	        Assertions.assertEquals("Hello World",actualValue);
	    }
	 @Test
	    @DisplayName("Jnuit Test Cases")
	    @Disabled
	    public void unitTest1() {
	        String actualValue="JNUIT";
	        Assertions.assertEquals("JNUIT",actualValue);
	    }
	  @AfterAll
      static void afterClass(){

        System.out.println("running.. afterCalss");

    }
   // @Test
////	void test2() {
////	   //System.out.println("This is my test Case");
////	fail("not yet implemented");
////	}

//

//


}
