package X;

public abstract class RVL {
    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return 2;
        }
    }
}
