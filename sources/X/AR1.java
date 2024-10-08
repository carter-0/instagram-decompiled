package X;

import android.content.Context;
import java.util.List;

public final class AR1 implements B37 {
    public final C312426eP A00;
    public final C41791B0u A01;
    public final C361848gv A02;
    public final List A03;

    public AR1(C312426eP r2, C41791B0u b0u, C361848gv r4, List list) {
        0qQ.A0B(r4, 1);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = b0u;
        this.A03 = list;
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [X.7r0, java.lang.Object, X.7r1] */
    public final ATD AKy(Context context, String str) {
        boolean A1U = AnonymousClass7TF.A1U(0, context, str);
        C343647qZ r4 = new C343647qZ(str);
        List<C41806B1l> list = this.A03;
        for (C41806B1l ErV : list) {
            ErV.ErV(r4);
        }
        ATD atd = new ATD(context, new C343657qa(r4));
        for (C41806B1l ALG : list) {
            atd.A02((C343917r1) ALG.ALG(atd));
        }
        atd.A02(new C343897qz(atd));
        atd.A01(new C345707tx(atd), C345607tn.A00);
        C343717qg r2 = C344397rn.A00;
        C345817u8 A022 = C343857qv.A02(atd, r2, A1U);
        A022.Enu(30);
        atd.A01(A022, C344447rs.A00);
        atd.A01(new C345227t8(atd), AnonymousClass7t9.A00);
        C343717qg A002 = C341157mQ.A00(atd, new C344387rm(atd, false, A1U), r2);
        atd.A01(new C380699Ze(atd), B3T.A01);
        atd.A01(new C345657ts(atd), C345647tr.A00);
        C361848gv r3 = this.A02;
        C392469ur.A00(this.A00, atd, this.A01, new AnonymousClass82S(), r3);
        atd.A01(new C380729Zh(atd), C345757u2.A04);
        ? obj = new Object();
        obj.A00 = atd;
        atd.A02(obj);
        C344467ru.A03(atd, A002, r3, A1U ? 1 : 0);
        return atd;
    }
}
