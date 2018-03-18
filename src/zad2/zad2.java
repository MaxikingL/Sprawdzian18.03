package zad2;

import java.util.Stack;

public class zad2 {
    public static void main(String[] args) {

        String wyr1 = "2*(3.4-(-7)/2*(a-2)/(b-1)))"; //bledny


        Stack<Character> st = new Stack<>();

        char c = '(';
        int counter = 0;


        String a = "(2*(3.4-(-7)*(a-2)/(b-1))";


        for (int i = 0; i < a.length(); i++) {
            st.push(a.charAt(i));
        }
        for (int i = 0; i < st.size(); i++) {
            if (st.search(0)== c) {
                counter++;
                System.out.println(counter);
            }


        }


    }
}


