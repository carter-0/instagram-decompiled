package X;

/* renamed from: X.Wao  reason: case insensitive filesystem */
public final class C19502Wao implements C357928a5 {
    public final /* synthetic */ C357948a7 A00;

    public C19502Wao(C357948a7 r1) {
        this.A00 = r1;
    }

    public final void DhZ(XAT xat) {
        C357948a7 r1 = this.A00;
        if (xat == r1.A00) {
            r1.A01.DhZ(xat);
            r1.A00 = null;
        }
    }

    public final void Dha(XAT xat) {
        C357948a7 r0 = this.A00;
        r0.A00 = xat;
        r0.A01.Dha(xat);
    }

    public final void Dhb(XAT xat, int i) {
        C357948a7 r3 = this.A00;
        if (xat == r3.A00) {
            for (XAT xat2 : r3.A02) {
                if (xat2 != r3.A00) {
                    xat2.Dle(i);
                }
            }
            r3.A01.Dhb(xat, i);
        }
    }
}
