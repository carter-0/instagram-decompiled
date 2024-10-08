package com.instagram.urlhandlers.promotionpayments;

import X.09i;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass07i;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C16678UzE;
import X.C18794W2b;
import X.C19181WOn;
import X.DbS;
import X.DbX;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class PromotionPaymentsUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    public final AnonymousClass0wW getSession() {
        AnonymousClass0wW r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.promotionpayments.PromotionPaymentsUrlHandlerActivity, java.lang.Object, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(914105282);
        super.onCreate(bundle);
        UserSession A05 = 09i.A0A.A05(this);
        this.A00 = A05;
        Bundle A0A = DbX.A0A(this);
        if (!(A05 instanceof UserSession)) {
            FFQ.A00().A00(this, A0A, A05);
        } else {
            C16678UzE uzE = C16678UzE.PROMOTION_PAYMENT;
            UserSession userSession = A05;
            0qQ.A0B(userSession, 3);
            C18794W2b.A01(this, AnonymousClass07i.A00(this), new C19181WOn(this, uzE, userSession, "promoted_posts"), userSession);
        }
        AnonymousClass0fD.A07(1473740195, A002);
    }
}
