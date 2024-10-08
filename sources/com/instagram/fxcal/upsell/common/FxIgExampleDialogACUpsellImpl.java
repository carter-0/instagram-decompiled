package com.instagram.fxcal.upsell.common;

import X.0qQ;
import X.AnonymousClass0lh;
import X.AnonymousClass7TG;
import X.C317816nt;
import X.C323586xk;
import X.C63265KuA;
import X.C66520MUy;
import X.C66543MVx;
import X.C73673Phm;
import X.LDA;
import android.app.Activity;
import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

public final class FxIgExampleDialogACUpsellImpl extends C323586xk implements AnonymousClass0lh, CallerContextable {
    public static final C63265KuA Companion = new Object();
    public final UserSession userSession;

    public void showUpsell(C66520MUy mUy, Activity activity) {
        0qQ.A0B(activity, 1);
        new LDA(activity, this.userSession, this).A00(mUy);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.MVx, java.lang.Object] */
    public C66543MVx getUpsellContent() {
        return new Object();
    }

    public boolean isUpsellEligible() {
        return C317816nt.A00(this.userSession).A0B(this.userSession, this.entryPoint, true);
    }

    public void onSessionWillEnd() {
        this.userSession.A03(FxIgLogoutACUpsellImpl.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FxIgExampleDialogACUpsellImpl(UserSession userSession2, Context context, String str) {
        super(context, userSession2, str);
        AnonymousClass7TG.A1U(userSession2, context, str);
        this.userSession = userSession2;
    }

    public static final FxIgExampleDialogACUpsellImpl getInstance(UserSession userSession2, Context context, String str) {
        AnonymousClass7TG.A1T(userSession2, context, str);
        return (FxIgExampleDialogACUpsellImpl) userSession2.A01(FxIgExampleDialogACUpsellImpl.class, new C73673Phm(context, userSession2, str, 18));
    }
}
