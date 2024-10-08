package com.instagram.urlhandlers.externalsharehandler;

import X.0Df;
import X.0Tu;
import X.0qQ;
import X.182;
import X.2EG;
import X.2IS;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C41845B3m;
import X.C41847B3o;
import X.C45883D9c;
import X.C5S;
import X.DbS;
import X.DbT;
import X.DbX;
import X.DbZ;
import X.EDL;
import X.EDS;
import X.EDV;
import X.EyS;
import X.FFQ;
import X.FHB;
import X.SUL;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class ExternalShareHandlerUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "ExternalShareHandlerUrlHandlerActivity";
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = AnonymousClass0fD.A00(-832987701);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -2119330937;
        } else {
            UserSession A0S = DbS.A0S(this);
            String A0m = DbS.A0m(A0A);
            if (A0m == null) {
                finish();
                i = -1440148377;
            } else {
                Uri A09 = DbT.A09(A0m);
                if (!(A0S instanceof UserSession)) {
                    FFQ.A01(this, A0A, A0S);
                    finish();
                    i = -750524109;
                } else {
                    UserSession userSession = A0S;
                    0Tu A0J = DbS.A0J(userSession, 0);
                    if (!182.A06(A0J, userSession, 36329466204536967L)) {
                        DbZ.A11(A09, A0A, "mainfeed");
                        FHB.A03(this, A0A);
                    } else if (182.A06(A0J, userSession, 36329466204733578L)) {
                        SUL sul = new SUL(this, userSession, 2EG.A0i, A0m, false);
                        sul.A0S = "ExternalShareHandlerUrlHandlerActivity";
                        sul.A0A();
                    } else {
                        String stringExtra = getIntent().getStringExtra("share_id");
                        if (stringExtra != null) {
                            EyS eyS = new EyS(userSession);
                            Intent intent = getIntent();
                            0qQ.A07(intent);
                            EDS eds = new EDS(this, this, intent, A0A, A0m);
                            Object BEh = eyS.A01.A00.BEh(stringExtra);
                            if (BEh != null) {
                                eds.onSuccess(BEh);
                            } else {
                                C45883D9c d9c = eyS.A00;
                                EDL edl = new EDL(eds, eyS, stringExtra, 15);
                                0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, stringExtra, "short_code");
                                2IS A04 = C41845B3m.A04();
                                d9c.A00.A06(new PandoGraphQLRequest(C41847B3o.A04(A03, A04, "input"), "ResolveExternalShareUrl", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C5S.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt__resolve_share_url", AnonymousClass7TE.A1C()), new EDV(42, edl, d9c));
                            }
                        }
                    }
                    i = -1310305272;
                }
            }
        }
        AnonymousClass0fD.A07(i, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
