package X;

public final class MZ7 {
    public static boolean A00;

    public static synchronized void A00() {
        synchronized (MZ7.class) {
            if (!A00) {
                0dV.A0C("advancedcryptotransport_jni");
                A00 = true;
            }
        }
    }
}
