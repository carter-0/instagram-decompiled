package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.fxcal.upsell.common.FxIgLogoutACUpsellImpl;

/* renamed from: X.KRr  reason: case insensitive filesystem */
public final class C61922KRr extends C323586xk implements AnonymousClass0lh {
    public final UserSession A00;

    public final void showUpsell(C66520MUy mUy, Activity activity) {
        0qQ.A0B(activity, 1);
        C63268KuD.A00(this.A00, this.entryPoint).A01(mUy, activity);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.MVx, java.lang.Object] */
    public final C66543MVx getUpsellContent() {
        return new Object();
    }

    public final boolean isUpsellEligible() {
        UserSession userSession = this.A00;
        return C317816nt.A00(userSession).A0B(userSession, this.entryPoint, true);
    }

    public final void onSessionWillEnd() {
        this.A00.A03(FxIgLogoutACUpsellImpl.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61922KRr(UserSession userSession, Context context, String str) {
        super(context, userSession, str);
        AnonymousClass7TG.A1P(userSession, str);
        this.A00 = userSession;
    }
}
