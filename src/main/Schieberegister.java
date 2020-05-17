package main;

public class Schieberegister {

    public static void main(String[] args) {
        boolean u0 = false;
        boolean u1 = false;
        boolean u2 = false;
        boolean u3 = false;
        boolean u0_in = false;
        boolean u1_in = false;
        boolean u2_in = false;
        boolean u3_in = false;
        boolean input = false;
        String code = "11010100000";
//        String code = "10111000010";

        System.out.println("Takt & u3 & u2 & u1 & u0 & input \\\\");
        System.out.println("\\hline");
//        System.out.println("Takt|u3 |u2 |u1 |u0 |input");

        for (int i = 0; i < code.length(); i++) {
            char ziff = code.charAt(i);
            input = (ziff == 48 ? false : true);

            u3 = u3_in;
            u2 = u2_in;
            u1 = u1_in;
            u0 = u0_in;

            u3_in = u2 ^ u3;
            u2_in = u1 ^ u3;
            u1_in = u0;
            u0_in = u3 ^ input;
//            System.out.println(i + "\t| " + (u3 == true ? "1" : "0") + "\t| " + (u2 == true ? "1" : "0") + "\t| " + (u1 == true ? "1" : "0") + "\t| " + (u0 == true ? "1" : "0") + "\t|" + (input == true ? "1" : "0"));
            System.out.println(i + " & " + (u3 == true ? "1" : "0") + " & " + (u2 == true ? "1" : "0") + " &  " + (u1 == true ? "1" : "0") + " & " + (u0 == true ? "1" : "0") + " & " + (input == true ? "1" : "0") + "\\\\");
            System.out.println("\\hline");
        }

        u3 = u3_in;
        u2 = u2_in;
        u1 = u1_in;
        u0 = u0_in;
        System.out.println("erg." + " & " + (u3 == true ? "1" : "0") + " & " + (u2 == true ? "1" : "0") + " & " + (u1 == true ? "1" : "0") + " & " + (u0 == true ? "1" : "0") + " & " + "- \\\\ ");
        System.out.println("\\hline");
//        System.out.println("erg." + "| " + (u3 == true ? "1" : "0") + "\t| " + (u2 == true ? "1" : "0") + "\t| " + (u1 == true ? "1" : "0") + "\t| " + (u0 == true ? "1" : "0") + "\t|" + "-");
    }
}
