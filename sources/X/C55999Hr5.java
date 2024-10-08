package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hr5  reason: case insensitive filesystem */
public final class C55999Hr5 {
    public long A00;
    public C262204Co A01;
    public final C284945Oz A02 = C51969G9p.A0S(HM0.A02);
    public final C284945Oz A03 = C51970G9q.A0S(new C53355Gmf(0));
    public final UserSession A04;
    public final C57461Ib5 A05;
    public final String A06;
    public final C262224Cq A07 = 19E.A02(new AnonymousClass19G((C262204Co) null).plus(AnonymousClass12T.A00.AOJ(258583802, 3)));

    public final void A00(boolean z) {
        C57461Ib5 ib5 = this.A05;
        if (!z) {
            C14044Tol tol = ib5.A01;
            if (tol != null) {
                tol.A0D("playback completed", true);
            }
        } else if (ib5.A01 != null) {
            ib5.A00(false);
            C14044Tol tol2 = ib5.A01;
            if (tol2 != null) {
                tol2.A0B("reset player");
            }
            ib5.A01 = null;
        }
        this.A02.Epw(HM0.A02);
        C284945Oz r4 = this.A03;
        r4.Epw(new C53355Gmf(0.0f, 0.0f, ((C53355Gmf) r4.getValue()).A00, 0));
    }

    public C55999Hr5(Context context, UserSession userSession, AnonymousClass4DU r9, String str) {
        AnonymousClass7TG.A1O(context, userSession);
        0qQ.A0B(r9, 3);
        this.A04 = userSession;
        this.A06 = str;
        this.A05 = new C57461Ib5(context, userSession, r9, new C252313ou(userSession, r9, (String) null, false));
    }
}
