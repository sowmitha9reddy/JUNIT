import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class Testing {
    StringSwapHelper help=new StringSwapHelper();
        @Test
        @DisplayName("swap2chars")
        public void stringSwap2charsOnly() {
            Assertions.assertEquals("BA", help.swaplasttwochars("AB"));
        }
        @Test
      @DisplayName("swap4chars")

        public void stringSwap4chars () {
            Assertions.assertEquals("ABDC", help.swaplasttwochars("ABCD"));
        }
    @Test
    @DisplayName("SwapLastCharcters")

    public void stringSwap() {
            Assertions.assertEquals("SELENIMU", help.swaplasttwochars("SELENIUM"));

    }
    @Test
  @DisplayName("singleCharacter")
    public void stringSwap1CharOnly(){
        Assertions.assertEquals("A", help.swaplasttwochars("A"));
   }




}
