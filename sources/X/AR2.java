package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class AR2 implements B37 {
    public final C312426eP A00;
    public final C41791B0u A01;
    public final C361848gv A02;
    public final UserSession A03;
    public final boolean A04;

    public AR2(C312426eP r2, C41791B0u b0u, C361848gv r4, UserSession userSession, boolean z) {
        0qQ.A0B(r4, 1);
        this.A02 = r4;
        this.A03 = userSession;
        this.A00 = r2;
        this.A01 = b0u;
        this.A04 = z;
    }

    public final ATD AKy(Context context, String str) {
        boolean A1U = AnonymousClass7TF.A1U(0, context, str);
        C343647qZ r3 = new C343647qZ(str);
        C343647qZ.A00(r3, C343737qi.A0M, A1U);
        List<C41806B1l> A002 = C392539uy.A00(this.A03);
        for (C41806B1l ErV : A002) {
            ErV.ErV(r3);
        }
        ATD atd = new ATD(context, new C343657qa(r3));
        for (C41806B1l ALG : A002) {
            atd.A02((C343917r1) ALG.ALG(atd));
        }
        atd.A02(new C343897qz(atd));
        atd.A01(new C345707tx(atd), C345607tn.A00);
        atd.A01(new C345227t8(atd), AnonymousClass7t9.A00);
        C345817u8 A022 = C343857qv.A02(atd, C344397rn.A00, A1U);
        boolean z = this.A04;
        if (!z) {
            A022.Enu(30);
        }
        C343717qg A003 = C341157mQ.A00(atd, A022, C344447rs.A00);
        atd.A01(new C380699Ze(atd), B3T.A01);
        if (z) {
            atd.A01(new C345637tq(atd), C345647tr.A00);
        }
        C361848gv r32 = this.A02;
        C392469ur.A00(this.A00, atd, this.A01, new AnonymousClass82S(), r32);
        if (!z) {
            atd.A01(new C380729Zh(atd), C345757u2.A04);
        }
        C344467ru.A03(atd, A003, r32, A1U ? 1 : 0);
        return atd;
    }
}
