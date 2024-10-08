package X;

/* renamed from: X.VeX  reason: case insensitive filesystem */
public final class C17755VeX {
    public final AD2 A00() {
        AD2 ad2 = AD2.A03;
        if (ad2 == null) {
            synchronized (this) {
                ad2 = AD2.A03;
                if (ad2 == null) {
                    02m r0 = 02m.A0p;
                    0qQ.A07(r0);
                    ad2 = new AD2(r0);
                    AD2.A03 = ad2;
                }
            }
        }
        return ad2;
    }
}
