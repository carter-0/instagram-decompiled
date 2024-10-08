package X;

/* renamed from: X.XwZ  reason: case insensitive filesystem */
public final class C22170XwZ implements Y9G {
    public final 01r A00;

    public final /* bridge */ /* synthetic */ void reportTo(C21292XSz xSz, Y9F y9f) {
        XIR xir = (XIR) xSz;
        int i = 0;
        while (true) {
            01r r1 = this.A00;
            if (i < r1.size()) {
                Class cls = (Class) r1.A05(i);
                Y9G y9g = (Y9G) r1.A06(i);
                01r r12 = xir.A00;
                if (r12.containsKey(cls)) {
                    y9g.reportTo((C21292XSz) cls.cast(r12.get(cls)), y9f);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public C22170XwZ(01r r3) {
        01r r0 = new 01r(0);
        this.A00 = r0;
        r0.A09(r3);
    }
}
