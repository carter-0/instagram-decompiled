package X;

public abstract class OR0 {
    public static String A01(Integer num) {
        if (num == null) {
            return "null";
        }
        if (1 - num.intValue() != 0) {
            return "THREADS_HANGOUT";
        }
        return "DEFAULT";
    }

    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        if (1 != intValue) {
            str = "THREADS_HANGOUT";
        } else {
            str = "DEFAULT";
        }
        return C51966G9m.A04(str, intValue);
    }
}
