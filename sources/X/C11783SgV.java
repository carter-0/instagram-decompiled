package X;

import java.util.List;

/* renamed from: X.SgV  reason: case insensitive filesystem */
public final class C11783SgV implements C13687Tf4, C13518Tbn {
    public final C11388SRb A00;
    public final C11388SRb A01;
    public final C11388SRb A02;
    public final Integer A03;
    public final List A04 = AnonymousClass7TE.A1C();
    public final boolean A05;

    public final void Dwx() {
        int i = 0;
        while (true) {
            List list = this.A04;
            if (i < list.size()) {
                ((C13518Tbn) list.get(i)).Dwx();
                i++;
            } else {
                return;
            }
        }
    }

    public final void ESm(List list, List list2) {
    }

    public C11783SgV(C11814Sh0 sh0, C11796Sgi sgi) {
        this.A05 = sh0.A04;
        this.A03 = sh0.A03;
        QGR A002 = C11802Sgo.A00(sh0.A02);
        this.A02 = A002;
        QGR A003 = C11802Sgo.A00(sh0.A00);
        this.A00 = A003;
        QGR A004 = C11802Sgo.A00(sh0.A01);
        this.A01 = A004;
        sgi.A0C(A002);
        sgi.A0C(A003);
        sgi.A0C(A004);
        A002.A09(this);
        A003.A09(this);
        A004.A09(this);
    }

    public final String getName() {
        throw AnonymousClass00P.createAndThrow();
    }
}
