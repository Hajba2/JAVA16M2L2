public class Main {

    public static int anInt = 7;

    public static void main(String[] args) {
        m7();
    }

    private static void m7() {
        System.out.println("anInt = " + anInt);
        int a = 7;
        System.out.println("a = " + a);

        if (true) {
            int b = 7;
            System.out.println("b = " + b);
            System.out.println("a = " + a);
            System.out.println("anInt = " + anInt);
        }

        System.out.println("a = " + a);
    }

    private static void m6() {
        String s = "A hello i love to learn Java";

        System.out.println("s.codePointAt(1) = " + s.codePointAt(1));

        byte[] bytes = s.getBytes();
        System.out.println("s.toLowerCase() = " + s.toLowerCase());

        System.out.println("\"abc\".compareTo(\"aaa\") = " + "abc".compareTo("aaa"));
        System.out.println("\"aaa\".compareTo(\"abc\") = " + "aaa".compareTo("abc"));
        System.out.println("\"aaa\".compareTo(\"aaa\") = " + "aaa".compareTo("aaa"));

        String sUpperCase = s.toUpperCase();
        System.out.println("s " + s);
        System.out.println("sUpperCase = " + sUpperCase);

        System.out.println("s.contains(\"hello\") = " + s.contains("hello"));
        System.out.println("s.contains(\"Java\") = " + s.contains("Java"));
        System.out.println("s.contains(\"java\") = " + s.contains("java"));
        System.out.println("s.contains(\"hello java\") = " + s.contains("hello java"));

        System.out.println("s.startsWith(\"A hello\") = " + s.startsWith("A hello"));
        System.out.println("s.endsWith(\"Java\") = " + s.endsWith("Java"));

        System.out.println("s.equalsIgnoreCase(\"A HELLO i LOVE to learn Java\") = " + s.equalsIgnoreCase("A HELLO i LOVE to learn Java"));
        System.out.println("s.equals(\"A HELLO i LOVE to learn Java\") = " + s.equals("A HELLO i LOVE to learn Java"));

        System.out.println("\"   \".isEmpty() = " + "   ".isEmpty());
        System.out.println("\"\".isEmpty() = " + "".isEmpty());
        System.out.println("\"\n\".isEmpty() = " + "\n".isEmpty());
        System.out.println("\"sadf\".isEmpty() = " + "sadf".isEmpty());

        System.out.println("\"  \".isBlank() = " + "  ".isBlank());
        System.out.println("\"\\n\".isBlank() = " + "\n".isBlank());
        System.out.println("\"sdf\".isBlank() = " + "sdf".isBlank());

        System.out.println("\"           osdjfhs       \".trim() = " + " osdjfhs       ".trim());

        System.out.println("s.replace(\"A \", \"Java\") = " + s.replace("A ", "Java "));

        String[] s1 = s.split(" ");

        System.out.println("s.matches(\".*hello.*\") = " + s.matches(".*hello java.*"));

        System.out.println("s.substring(4, 9) = " + s.substring(4, s.length()-2));
        System.out.println("s.concat(\" added\") = " + s.concat(" added"));

        System.out.println("(s + \" added\") = " + (s + " added"));

        System.out.println("s.lastIndexOf(\"e\") = " + s.lastIndexOf("e"));

    }

    private static void m5() {
        int a = 6;
        int b = 6;

        System.out.println("(a == b) = " + (a == b));

        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = s2;

        System.out.println("s.equals(s2) = " + s1.equals(s2));
        System.out.println("(s1 == s2) = " + (s1 == s2));

        String s4 = "Java";
        String s5 = "Java";
        System.out.println("s4.equals(s5) = " + s4.equals(s5));
        System.out.println("(s4 == s5) = " + (s4 == s5));
    }

    public static void m4() {
        boolean isWeatherGood = false;
        boolean isElectricityPresent = true;

        boolean willIGoToTheMall = isWeatherGood & isElectricityPresent;
        boolean willIGoPLayWithFriends = isWeatherGood | isElectricityPresent;
        boolean willIPlayPlaystation = !isWeatherGood & isElectricityPresent;
        boolean xor = isWeatherGood ^ isElectricityPresent;

        int temperature = 9;

        if (isTemperatureGreaterThanTen(temperature) || isTemperatureLessThanFortyFive(temperature)) {
            System.out.println("I will go to the park");
        }
    }

    public static boolean isTemperatureLessThanFortyFive(int temperature) {
        return temperature < 45;
    }

    public static boolean isTemperatureGreaterThanTen(int temperature) {
        return temperature > 10;
    }

    public static void m3() {
        int a = 9;
        int b = 5;
        boolean b1 = a > b; //true
        boolean b2 = a < b; //false
        boolean b3 = a == b;//false
        boolean b4 = a <= b;//false
        boolean b5 = a >= b;//true
        boolean b6 = a != b;//true
    }

    public static void m2() {
        boolean isDivideByThree = (9 % 3) == 0;
        System.out.println(isDivideByThree);
    }

    public static void m1() {
        String s = "vova \"is\" \\a man \nnew line";

        System.out.println(s);
    }
}