package com.instagram.urlhandler;

import X.08y;
import X.09i;
import X.0Aj;
import X.0Tu;
import X.0kR;
import X.182;
import X.AnonymousClass07i;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0kN;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C49300Esj;
import X.C51018FnA;
import X.C66588MXu;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbX;
import X.F2K;
import X.FFQ;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class IgMeMessageUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public String A00 = "";

    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "direct_ig_me_message_url_entry_point";
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandler.IgMeMessageUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        Bundle A0A;
        08y r1 = 09i.A0A;
        Intent intent = getIntent();
        if (intent != null && (A0A = DbT.A0A(intent)) != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A00(IgMeMessageUrlHandlerActivity igMeMessageUrlHandlerActivity, String str, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(igMeMessageUrlHandlerActivity, igMeMessageUrlHandlerActivity.getSession()), "direct_ig_me_message_link_click");
        if (A0e.isSampled()) {
            A0e.AAJ("url", str);
            A0e.AAJ(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, str2);
            A0e.Cgf();
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, com.instagram.urlhandler.IgMeMessageUrlHandlerActivity, android.content.Context, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A0A;
        int A002 = AnonymousClass0fD.A00(-1698632355);
        super.onCreate(C66588MXu.A00(bundle));
        Intent intent = getIntent();
        if (intent == null || (A0A = DbT.A0A(intent)) == null) {
            finish();
            i = 957383466;
        } else {
            if (!182.A06(0Tu.A05, getSession(), 36313939897747778L)) {
                0kR.A0B(this, DbX.A08(this));
            }
            String A0m = DbS.A0m(A0A);
            this.A00 = A0m;
            if (!(A0m == null || A0m.length() == 0)) {
                Uri A09 = DbT.A09(A0m);
                if (DbV.A03(A09) == 2) {
                    UserSession session = getSession();
                    if (!(session instanceof UserSession)) {
                        FFQ.A01(this, A0A, session);
                    } else {
                        String A19 = AnonymousClass7TE.A19(A09.getPathSegments(), 1);
                        String str = C49300Esj.A00;
                        UserSession userSession = session;
                        new F2K(userSession, new C51018FnA(userSession, this, A09.getQueryParameter("ref")), C49300Esj.A00).A00(this, AnonymousClass07i.A00(this), A19);
                    }
                    i = 1168578357;
                }
            }
            finish();
            i = 1168578357;
        }
        AnonymousClass0fD.A07(i, A002);
    }
}
