package X;

/* renamed from: X.Ff8  reason: case insensitive filesystem */
public final class C50594Ff8 implements G7G {
    public final /* synthetic */ C47502E5h A00;

    public final void DoT(C8L c8l) {
        C47502E5h e5h;
        int i;
        String A09;
        if (c8l != null) {
            C43417Bxt A0E = c8l.A0E();
            if (A0E == null || !A0E.getRequiredBooleanField(1, "code_sent")) {
                String str = null;
                C43417Bxt A0E2 = c8l.A0E();
                if (!(A0E2 == null || (A09 = A0E2.A09("error")) == null || A09.length() == 0)) {
                    C43417Bxt A0E3 = c8l.A0E();
                    if (A0E3 != null) {
                        str = A0E3.A09("error");
                    }
                    DbS.A1Y(str);
                    1xC r1 = 1xC.A01;
                    C310336ap A0a = DbS.A0a();
                    A0a.A0D = str;
                    A0a.A06();
                    DbY.A1K(r1, A0a);
                    return;
                }
            } else {
                e5h = this.A00;
                i = 2131961580;
                if (e5h.A02) {
                    i = 2131974072;
                }
                C47502E5h.A00(e5h, i);
            }
        }
        e5h = this.A00;
        i = 2131974093;
        C47502E5h.A00(e5h, i);
    }

    public C50594Ff8(C47502E5h e5h) {
        this.A00 = e5h;
    }

    public final void DED() {
        C47502E5h.A00(this.A00, 2131974093);
    }
}
