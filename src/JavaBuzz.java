public class JavaBuzz {

    public String javabuzzify(int i) {
        if (i % 15 == 0) return "JavaBuzz";
        if (i % 5 == 0) return "Buzz";
        if (i % 3 == 0) return "Java";
        return Integer.toString(i);
    }
}