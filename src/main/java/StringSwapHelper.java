public class StringSwapHelper {
    public String swaplasttwochars(String st) {

                int length = st.length();
            if(length<2) {

                return st;

            }
                String strExceptLast2Chars = st.substring(0, length - 2);

                char secondLastChar = st.charAt(length - 2);

                char lastChar = st.charAt(length - 1);

                return strExceptLast2Chars + lastChar + secondLastChar;


//                char firstChar = st.charAt(0);
//
//                char secChar = st.charAt(1);
//
//                return "" + secChar + firstChar; // "" is appended as 2 chars cannot be appended

            }




}
