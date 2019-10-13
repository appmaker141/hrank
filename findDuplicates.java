package HR.String;


public class findDuplicates {

    public static boolean hasDups(String toTest) {

        if(toTest.length() > 256) return false;

        boolean[] char_Set = new boolean[256];

        for(int i = 0; i < toTest.length(); i++) {

            int val = toTest.charAt(i);

            if(char_Set[val]){
                System.out.println("false");
                return false;
            }
            char_Set[val] = true;
        }
        System.out.println("true");

        return true;

    }
    public static void main(String[] args) {

        hasDups("abcdc");
    }
}