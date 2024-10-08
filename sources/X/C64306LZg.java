package X;

/* renamed from: X.LZg  reason: case insensitive filesystem */
public final class C64306LZg implements AnonymousClass0hF, AnonymousClass07Y {
    public final int A00;
    public final Object A01;

    public C64306LZg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Dms(07T r3, AnonymousClass07Z r4) {
        C64125LOw lOw;
        switch (this.A00) {
            case 0:
                ((C14220Ts0) this.A01).A00(false);
                return;
            case 1:
                AnonymousClass7TG.A1N(r4, r3);
                ((0sL) C51966G9m.A18(this.A01)).invoke(r4, r3);
                return;
            default:
                0qQ.A0B(r3, 1);
                if (r3 == 07T.ON_DESTROY && (lOw = ((C65207LpD) this.A01).A03.A05) != null) {
                    lOw.A01();
                    return;
                }
                return;
        }
    }
}
