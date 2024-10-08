package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class LGO {
    public View A00;
    public C41832B2n A01;
    public B2H A02;
    public final Context A03;
    public final AnonymousClass4DH A04;
    public final C340297l2 A05;
    public final UserSession A06;
    public final AnonymousClass8Ho A07 = new C65701LyG(this);

    public LGO(Context context, AnonymousClass4DH r3, C340297l2 r4, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A04 = r3;
        this.A06 = userSession;
        this.A05 = r4;
        this.A03 = context;
    }

    public final void A00() {
        UserSession userSession = this.A06;
        Context context = this.A03;
        if (C362988ir.A01(context.getApplicationContext(), userSession)) {
            1pd.A00(C362988ir.A00()).A00(context, userSession, C65699LyE.A00, "sup:SupDelegate|SupLiveDelegate_REMOVE_CB");
        }
    }

    public final void A01() {
        UserSession userSession = this.A06;
        Context context = this.A03;
        if (C362988ir.A01(context.getApplicationContext(), userSession)) {
            1pd.A00(C362988ir.A00()).A00(context, userSession, C65700LyF.A00, "sup:SupLiveDelegate");
        }
    }

    public final void A02(boolean z) {
        W0T A002;
        C357488Yc A012 = C357488Yc.A03.A01(this.A06);
        if (A012 != null && (A002 = A012.A00()) != null) {
            W0T.A01(A002, 30, z, false, false, false, false);
        }
    }

    public final boolean A03() {
        W0T A002;
        C357488Yc A012 = C357488Yc.A03.A01(this.A06);
        if (A012 == null || (A002 = A012.A00()) == null) {
            return false;
        }
        return A002.A0I();
    }
}
