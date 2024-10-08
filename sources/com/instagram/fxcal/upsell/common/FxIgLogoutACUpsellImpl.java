package com.instagram.fxcal.upsell.common;

import X.0Tu;
import X.0qQ;
import X.182;
import X.1Au;
import X.AnonymousClass0lh;
import X.C317816nt;
import X.C317826nu;
import X.C323576xi;
import X.C323586xk;
import X.C323596xl;
import X.C46402DeP;
import X.C66520MUy;
import X.C66543MVx;
import X.C73662Phb;
import X.G75;
import X.LDA;
import X.M1L;
import android.app.Activity;
import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

public final class FxIgLogoutACUpsellImpl extends C323586xk implements AnonymousClass0lh, CallerContextable {
    public static final C323576xi Companion = new Object();
    public boolean upsellShownInSession;
    public final UserSession userSession;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FxIgLogoutACUpsellImpl(UserSession userSession2, Context context, String str) {
        super(context, userSession2, str);
        0qQ.A0B(userSession2, 1);
        0qQ.A0B(context, 2);
        0qQ.A0B(str, 3);
        this.userSession = userSession2;
    }

    public static final FxIgLogoutACUpsellImpl getInstance(UserSession userSession2, Context context, String str) {
        return C323576xi.A00(userSession2, context, str);
    }

    public void showUpsell(C66520MUy mUy, Activity activity) {
        0qQ.A0B(activity, 1);
        LDA lda = new LDA(activity, this.userSession, this);
        this.upsellShownInSession = true;
        lda.A00(mUy);
    }

    private final boolean checkClientImpressionAndMaybeSilentlyMigrateToServer() {
        if (!1Au.A00(this.userSession).A01.getBoolean("fx_cal_right_before_logout_sso_upsell_seen", false) && !this.upsellShownInSession) {
            return false;
        }
        C46402DeP deP = new C46402DeP(this.userSession);
        if (deP.A02(this.entryPoint)) {
            return true;
        }
        deP.A01(this.entryPoint);
        deP.A00(this.entryPoint);
        return true;
    }

    private final boolean hasReachedImpressionLimit() {
        if (Boolean.valueOf(182.A06(0Tu.A06, this.userSession, 36319746693668437L)).booleanValue()) {
            return false;
        }
        return checkClientImpressionAndMaybeSilentlyMigrateToServer();
    }

    public C66543MVx getUpsellContent() {
        UserSession userSession2 = this.userSession;
        0qQ.A0B(userSession2, 0);
        return (M1L) userSession2.A01(M1L.class, new C73662Phb(userSession2, 23));
    }

    public boolean isUpsellEligible() {
        if (Boolean.valueOf(182.A06(0Tu.A06, this.userSession, 2342156442305300443L)).booleanValue() || hasReachedImpressionLimit() || isLinked() || !C317816nt.A00(this.userSession).A0B(this.userSession, "IG_LOGOUT_UPSELL", true)) {
            return false;
        }
        return true;
    }

    public void onSessionWillEnd() {
        this.userSession.A03(FxIgLogoutACUpsellImpl.class);
    }

    public void prefetchEligibility() {
        if (!isKillswitchEnabled()) {
            C317826nu A00 = C317816nt.A00(this.userSession);
            Context applicationContext = this.context.getApplicationContext();
            0qQ.A07(applicationContext);
            UserSession userSession2 = this.userSession;
            String str = this.entryPoint;
            A00.A09(applicationContext, userSession2, (G75) null, str, "IG_PROFILE_PHOTO_CHANGE_CHAINING", C323596xl.A00(str), false);
        }
    }
}
