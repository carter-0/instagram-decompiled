package X;

public final class SBQ {
    public static volatile boolean A00;

    public static final synchronized void A00() {
        synchronized (SBQ.class) {
            if (!A00) {
                0dV.A0C("react_devsupportjni");
                A00 = true;
            }
        }
    }
}
