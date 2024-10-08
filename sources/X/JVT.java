package X;

public abstract class JVT {
    public static short A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return 2;
            case 1:
                return 3;
            default:
                return 4;
        }
    }

    public static void A01(AnonymousClass7I6 r0, Integer num, int i) {
        r0.A06.markerEnd(i, A00(num));
    }
}
