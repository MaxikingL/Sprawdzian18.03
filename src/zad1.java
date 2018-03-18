public class zad1 {
    public static void main(String[] args) {

        String ala = "AlA ma kota";


        int leterCount = 0;
        for (char c : ala.toLowerCase().toCharArray()) {
            if (c == 'a') {
                leterCount++;



            }

        } System.out.println(leterCount);
    }
}