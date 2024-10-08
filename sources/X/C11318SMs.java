package X;

/* renamed from: X.SMs  reason: case insensitive filesystem */
public final class C11318SMs {
    public static long A00;
    public static SRX A01;

    public static SRX A00() {
        synchronized (C11318SMs.class) {
            SRX srx = A01;
            if (srx == null) {
                return new SRX();
            }
            A01 = srx.A02;
            srx.A02 = null;
            A00 -= 8192;
            return srx;
        }
    }

    public static void A01(SRX srx) {
        if (srx.A02 != null || srx.A03 != null) {
            throw Pxe.A0g();
        } else if (!srx.A05) {
            synchronized (C11318SMs.class) {
                long j = A00 + 8192;
                if (j <= 65536) {
                    A00 = j;
                    srx.A02 = A01;
                    srx.A00 = 0;
                    srx.A01 = 0;
                    A01 = srx;
                }
            }
        }
    }
}
