package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Feb  reason: case insensitive filesystem */
public final class C50566Feb implements G7C {
    public final UserSession A00;
    public final Dd4 A01;

    public final boolean AFM(C48087EVf eVf, C283155Gi r4, int i) {
        0qQ.A0B(r4, 0);
        return AnonymousClass7TF.A1W(r4.A05, C283195Gm.COPYRIGHT_VIDEO_REINSTATED);
    }

    public C50566Feb(UserSession userSession, Dd4 dd4) {
        this.A00 = userSession;
        this.A01 = dd4;
    }

    public final void AJS(View view, JV7 jv7, C48087EVf eVf, C283155Gi r8, int i) {
        AnonymousClass7TG.A1N(r8, eVf);
        String str = r8.A04.A0U;
        String str2 = "";
        if (str != null) {
            String A012 = new 11S("^/").A01(str, str2);
            1NY A0M = DbU.A0M(this.A00);
            A0M.A0A(A012);
            A0M.A04();
            1ES.A03(DbU.A0S(A0M, 1XP.class, 1XY.class));
        }
        Dd4 dd4 = this.A01;
        String A07 = r8.A07();
        if (A07 != null) {
            str2 = A07;
        }
        dd4.DPt(C47179Dru.A00(jv7, eVf, i), r8, str2, i);
    }
}
