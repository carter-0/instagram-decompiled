package X;

/* renamed from: X.WdV  reason: case insensitive filesystem */
public final class C19667WdV implements X59 {
    public final int A00;
    public final Object A01;

    public C19667WdV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Dba(C18078Vl7 vl7) {
        C16746V4d v4d;
        String str;
        int i = this.A00;
        0qQ.A0B(vl7, 0);
        switch (i) {
            case 0:
                C61363K4f k4f = (C61363K4f) this.A01;
                k4f.A0D = vl7;
                vl7.A0B.Eoq(true);
                vl7.A03(7);
                vl7.A05(new K0Q(1, vl7, k4f), AnonymousClass000.A00(1864));
                C18078Vl7 vl72 = k4f.A0D;
                if (vl72 == null) {
                    0qQ.A0F("mediaStreamController");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    vl72.A01();
                    return;
                }
            case 1:
                C18760Vzv vzv = (C18760Vzv) this.A01;
                vzv.A01 = vl7;
                C20886X2q x2q = vzv.A0B.A01;
                0qQ.A0B(x2q, 0);
                vl7.A0F = x2q;
                vl7.A0B.Elv(x2q);
                v4d = new UUj(vzv, 2);
                str = "sup:MediaStreamControllerDelegate";
                break;
            case 2:
                v4d = new K0Q(2, vl7, this.A01);
                str = AnonymousClass000.A00(194);
                break;
            default:
                ((K6W) this.A01).A00 = vl7;
                return;
        }
        vl7.A05(v4d, str);
    }
}
