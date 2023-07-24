package shifrator;

public class Deshifrator  {

    public static void main(String[] args) {


        String in = "\u0002Fcjjm\u001EUmpjb";
        char[] chars = in.toCharArray();
        StringBuilder in2 = new StringBuilder();
        byte random = (byte) chars[0];
        for (byte i = 0; chars.length > i; i++) {
            chars[i] = (char) (chars[i] + random);
            in2.append(chars[i]);

        }
        System.out.println(in2);
    }

}

