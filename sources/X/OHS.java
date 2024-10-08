package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class OHS {
    public boolean A00;
    public final UserSession A01;
    public final C61480nO A02;
    public final C337257fy A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(C73913Plo.A00(this, 9));
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;

    public /* synthetic */ OHS(Context context, UserSession userSession) {
        1ET r2 = (1ET) 1ET.A01.getValue();
        boolean A1Z = DbW.A1Z(r2);
        this.A01 = userSession;
        C336297eO A002 = C67562Mpw.A00(context, userSession, r2, "reshare", (String) null, A1Z, A1Z, false);
        this.A03 = A002;
        C61480nO A003 = 0nY.A00();
        0qQ.A07(A003);
        this.A02 = A003;
        this.A05 = AnonymousClass0eN.A01(C73814PkD.A00);
        this.A06 = AnonymousClass0eN.A01(C73913Plo.A00(this, 10));
        A002.EcJ(new C72916PPa(this));
    }
}
