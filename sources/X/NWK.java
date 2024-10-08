package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public final class NWK extends C67883MwR {
    public final int A00;
    public final View A01;
    public final C74491Pvl A02;
    public final UserSession A03;

    public static final void A00(NWK nwk, C67328Mm4 mm4, C66788McZ mcZ, int i, int i2) {
        C66787McY mcY = (C66787McY) mcZ.A01.get(i);
        C67331Mm7 A002 = C67330Mm6.A00(AnonymousClass7TE.A0S(nwk.A01), mcY, nwk.A03, mcZ.A02);
        Object obj = mcY.A02;
        C74491Pvl pvl = nwk.A02;
        boolean A0K = 0qQ.A0K(obj, pvl.Brn());
        mm4.A00(A002, new C58698Iw7(i, 10, (Object) A002, (Object) nwk, (Object) mcZ), A0K);
        mm4.itemView.setMinimumWidth(i2);
        pvl.DGH(JTO.A0F(nwk), A002, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NWK(View view, UserSession userSession, C74491Pvl pvl) {
        super(view);
        AnonymousClass7TG.A1P(userSession, pvl);
        this.A03 = userSession;
        this.A01 = view;
        this.A02 = pvl;
        this.A00 = 0nA.A09(AnonymousClass7TE.A0S(view));
    }
}
