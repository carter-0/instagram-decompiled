package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.KRs  reason: case insensitive filesystem */
public final class C61923KRs extends C323586xk implements AnonymousClass0lh {
    public boolean A00;
    public final UserSession A01;

    public final void showUpsell(C66520MUy mUy, Activity activity) {
        0qQ.A0B(activity, 1);
        UserSession userSession = this.A01;
        K4Y A002 = C63268KuD.A00(userSession, this.entryPoint);
        M1I m1i = new M1I(activity, this, A002);
        FFL.A02(C48152EZu.A0C, userSession, "upsell_impressions", (Map) null, 2);
        A00(C368278sM.VIEW, this);
        A002.A01(m1i, activity);
    }

    public static final void A00(C368278sM r6, C61923KRs kRs) {
        UserSession userSession = kRs.A01;
        AnonymousClass818 r4 = AnonymousClass818.IG_AFTER_STORY_SHARE;
        AnonymousClass819 r3 = AnonymousClass819.BOTTOMSHEET_UNLINKED_USER_STORY;
        AnonymousClass81A A0O = JTO.A0O();
        A0O.A09(AnonymousClass7TE.A0u());
        JTT.A1C(A0O, 1);
        C368288sN.A00(r4, r6, r3, A0O, userSession);
    }

    public final C66543MVx getUpsellContent() {
        UserSession userSession = this.A01;
        return (M1N) userSession.A01(M1N.class, new C73662Phb(userSession, 22));
    }

    public final void onSessionWillEnd() {
        this.A01.A03(C61923KRs.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61923KRs(UserSession userSession, Context context, String str) {
        super(context, userSession, str);
        AnonymousClass7TG.A1P(userSession, str);
        this.A01 = userSession;
    }
}
