package X;

public final class SBG {
    public static boolean A00;

    public static synchronized void A00() {
        synchronized (SBG.class) {
            if (!A00) {
                0dV.A0C("mcphealthmetadataproviderjni");
                A00 = true;
            }
        }
    }
}
