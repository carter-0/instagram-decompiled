package X;

/* renamed from: X.Twb  reason: case insensitive filesystem */
public final class C14453Twb implements C20912X4d {
    public final /* synthetic */ C14138TqY A00;

    public C14453Twb(C14138TqY tqY) {
        this.A00 = tqY;
    }

    public final void DiH() {
        String str;
        C14138TqY tqY = this.A00;
        C14445TwT twT = tqY.A0C;
        if (twT != null) {
            String str2 = tqY.A01.A01;
            0qQ.A0B(str2, 0);
            twT.A00.add(str2);
            C358448av A0D = tqY.A0D();
            String E4z = tqY.A0i.E4z();
            if (E4z != null) {
                A0D.CjB(E4z, tqY.A0k.E4p());
                C14200Trf trf = tqY.A07;
                if (trf == null) {
                    str = "dataSource";
                } else {
                    C14488TxA.A00(trf, tqY);
                    TwE twE = tqY.A06;
                    if (twE != null) {
                        twE.A02();
                        return;
                    }
                    return;
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            str = "seeMoreController";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
