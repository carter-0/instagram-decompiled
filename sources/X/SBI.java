package X;

public final class SBI {
    public static boolean A00;

    public static final synchronized void A00() {
        synchronized (SBI.class) {
            if (!A00) {
                0dV.A0C("millimmutablecursorjni");
                A00 = true;
            }
        }
    }
}
