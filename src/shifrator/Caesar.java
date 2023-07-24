package shifrator;//Написать метод «Шифр Цезаря», с булевым параметром зашифрования/расшифрования, и числовым ключом;


public class Caesar {
    public static void main(String[] args) {
        byte random =  (byte) (Math.random() * 4 + 1);

        String in = "Hello World";
        char[] chars = in.toCharArray();

        StringBuilder in2 = new StringBuilder();
        in2.append((char) random);
        for (byte i = 0; chars.length > i; i++) {
            chars[i] = (char) (chars[i] - random);
            in2.append(chars[i]);

             }
        System.out.println(in2);
        }

    }


//    private static String caesar(String in, int key, boolean encrypt){
//            if (in == null || in.isEmpty())
//                return null;
//
//            final int len = in.length();
//            char[] out = new char[len];
//            for (int i = 0; i < len; ++i) {
//                out[i] = (char) (in.charAt(i) + ((encrypt) ? key : -key));
//
//            }
//            return new String(out);
//
//
//    }
//}
