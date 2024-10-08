package X;

public final class SBJ {
    public static boolean A00;

    public static final synchronized void A00() {
        synchronized (SBJ.class) {
            if (!A00) {
                0dV.A0C("millruntimejni");
                A00 = true;
            }
        }
    }
}
