import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayServes arrayServes = new ArrayServes(11);
        System.out.println("arrayServes.add(\"loshka\") = " + arrayServes.add("loshka"));
        System.out.println("arrayServes.add(\"stol\") = " + arrayServes.add("stol"));
        System.out.println("arrayServes.add(\"doska\") = " + arrayServes.add("doska"));
        System.out.println("arrayServes.add(\"lopata\") = " + arrayServes.add("lopata"));
        System.out.println("arrayServes.add(2,\"vilka\") = " + arrayServes.add(2, "vilka"));
        System.out.println("arrayServes.add(\"tarelka\") = " + arrayServes.add("tarelka"));
        System.out.println("arrayServes.set(2,\"noj\") = " + arrayServes.set(2, "noj"));
        System.out.println("arrayServes.remove(\"vilka\") = " + arrayServes.remove("vilka"));
        System.out.println("arrayServes.remove(3) = " + arrayServes.remove(3));
        System.out.println("arrayServes.contains(\"loshka\") = " + arrayServes.contains("loshka"));
        System.out.println("arrayServes.indexOf(\"loshka\") = " + arrayServes.indexOf("loshka"));
        System.out.println("arrayServes.toArray() = " + Arrays.toString(arrayServes.toArray()));
        System.out.println("arrayServes.size() = " + arrayServes.size());
        System.out.println("arrayServes.indexOf(\"loshka\") = " + arrayServes.lastIndexOf("loshka"));

        arrayServes.clear();
        System.out.println("arrayServes.add(\"loshka\") = " + arrayServes.add("loshka"));

    }
}