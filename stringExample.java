public class stringExample {
    public static void main(String[] args) {
        String first = "Hello";
        String second = "Manish";
        String result = first + second;
        System.out.println(result);
        System.out.println(result.length());
        System.out.println(result.toUpperCase());
        System.out.println(result.toLowerCase());
        System.out.println(result.charAt(0));
        System.out.println(result.equals(result));
        System.out.println(result.equalsIgnoreCase(result));
        System.out.println(result.substring(5,11));
        System.out.println(result.contains("Manish"));
        System.out.println(first.concat(second));
    }
}
