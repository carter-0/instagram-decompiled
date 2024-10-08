package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class M1J implements C66520MUy {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C61921KRq A01;
    public final /* synthetic */ K4Y A02;
    public final /* synthetic */ C66520MUy A03;

    public M1J(Activity activity, C61921KRq kRq, K4Y k4y, C66520MUy mUy) {
        this.A03 = mUy;
        this.A02 = k4y;
        this.A01 = kRq;
        this.A00 = activity;
    }

    public final void getDismissAction() {
        C63918LCj lCj;
        C61921KRq kRq = this.A01;
        if (!kRq.A02) {
            UserSession userSession = kRq.A06;
            if (182.A06(0Tu.A06, userSession, 2342158392220781726L) && (lCj = kRq.A00) != null) {
                lCj.A00(false);
            }
            FFL.A02(C48152EZu.A06, userSession, AnonymousClass000.A00(1914), (Map) null, 2);
        }
        kRq.A02 = false;
    }

    public final void getPrimaryCtaAction() {
        C66520MUy mUy = this.A03;
        if (mUy != null) {
            mUy.getPrimaryCtaAction();
        }
        K4Y k4y = this.A02;
        M1E m1e = new M1E(this.A00, k4y);
        String A012 = EXN.A0B.A01();
        1Z9 A002 = C48920EmK.A00();
        C61921KRq kRq = this.A01;
        UserSession userSession = kRq.A06;
        A002.A01(k4y, userSession, m1e).A06(A012, C317816nt.A00(userSession).A08("IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL"));
        kRq.A02 = true;
        FFL.A02(C48152EZu.A06, userSession, "upsell_primary_click", (Map) null, 2);
        C61921KRq.A00(C368278sM.ACCEPT, kRq);
    }

    public final void getSecondaryCtaAction() {
        DbX.A10(this.A00, AnonymousClass37D.A00);
        C61921KRq kRq = this.A01;
        kRq.A02 = true;
        C63918LCj lCj = kRq.A00;
        if (lCj != null) {
            lCj.A00(false);
        }
        FFL.A02(C48152EZu.A06, kRq.A06, AnonymousClass000.A00(389), (Map) null, 2);
        C61921KRq.A00(C368278sM.DECLINE, kRq);
    }
}
