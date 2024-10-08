package X;

/* renamed from: X.Rzf  reason: case insensitive filesystem */
public final class C10879Rzf {
    public final SE0 A00() {
        SE0 se0 = SE0.A02;
        if (se0 == null) {
            synchronized (this) {
                se0 = SE0.A02;
                if (se0 == null) {
                    se0 = new SE0();
                    SE0.A02 = se0;
                }
            }
        }
        return se0;
    }
}
