package com.instagram.urlhandlers.metaverified;

import X.0Aj;
import X.0Tu;
import X.182;
import X.1ES;
import X.AnonymousClass000;
import X.AnonymousClass06Q;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0kN;
import X.AnonymousClass0wW;
import X.AnonymousClass1O9;
import X.AnonymousClass7TE;
import X.C229382nI;
import X.C273654mx;
import X.C359608dC;
import X.C359988do;
import X.C360678ey;
import X.C50128FQl;
import X.DbS;
import X.DbT;
import X.DbX;
import X.DbY;
import X.DbZ;
import X.E84;
import X.FFQ;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class MetaVerifiedUrlHandlerActivity extends IgFragmentActivity implements AnonymousClass0iw {
    public AnonymousClass0wW A00;
    public final AnonymousClass06Q A01 = new C50128FQl(this, 17);

    public final String getModuleName() {
        return "MetaVerifiedUrlHandlerActivity";
    }

    public static final void A00(AnonymousClass0iw r1, UserSession userSession, String str, String str2, String str3) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r1, userSession), C273654mx.A00(3059));
        if (A0e.isSampled()) {
            A0e.AAJ("stage", "deeplink");
            A0e.AAJ("substage", "landing");
            DbS.A1I(A0e, str);
            DbS.A1M(A0e, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0e.A9H("extra_data", DbY.A0p("deeplink_params", str3, AnonymousClass7TE.A1L("entrypoint", str2)));
            A0e.Cgf();
        }
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.instagram.urlhandlers.metaverified.MetaVerifiedUrlHandlerActivity, X.0iw, com.instagram.base.activity.IgFragmentActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(1055386000);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -1522820162;
        } else {
            UserSession A0W = DbT.A0W(A0A);
            this.A00 = A0W;
            if (A0W == null) {
                finish();
                i = 1990378070;
            } else if (!(A0W instanceof UserSession)) {
                FFQ.A01(this, A0A, A0W);
                finish();
                i = 709504237;
            } else if (!182.A06(0Tu.A05, A0W, 36317427413488767L)) {
                finish();
                i = 1443307521;
            } else {
                String A0m = DbS.A0m(A0A);
                if (A0m == null) {
                    finish();
                    i = -1275730049;
                } else {
                    Uri A09 = DbT.A09(A0m);
                    HashMap A1E = AnonymousClass7TE.A1E();
                    String queryParameter = A09.getQueryParameter("entrypoint");
                    if (queryParameter == null) {
                        finish();
                        i = -347096709;
                    } else {
                        A1E.put("entrypoint", queryParameter);
                        String queryParameter2 = A09.getQueryParameter("deeplink_params");
                        HashMap A1E2 = AnonymousClass7TE.A1E();
                        if (!(queryParameter2 == null || queryParameter2.length() == 0)) {
                            try {
                                JSONObject jSONObject = new JSONObject(queryParameter2);
                                Iterator<String> keys = jSONObject.keys();
                                while (keys.hasNext()) {
                                    String A18 = AnonymousClass7TE.A18(keys);
                                    A1E2.put(A18, jSONObject.getString(A18));
                                }
                                A1E.put("deeplink_params", A1E2);
                            } catch (JSONException unused) {
                                A00(this, A0W, "mv_deeplink_json_exception", queryParameter, queryParameter2);
                                finish();
                                AnonymousClass0fD.A07(-304819422, A002);
                                return;
                            }
                        }
                        HashMap A012 = C359608dC.A01(A1E);
                        DbZ.A0u(this, getWindow());
                        getSupportFragmentManager().A0s(this.A01);
                        A00(this, A0W, "mv_deeplink_navigation", queryParameter, (String) null);
                        C229382nI A013 = C229382nI.A01((SparseArray) null, this, this, A0W);
                        C360678ey A02 = C359988do.A02((AnonymousClass1O9) null, A0W, AnonymousClass000.A00(552), A012);
                        E84.A00(A02, A013, 22);
                        1ES.A03(A02);
                        i = -703322774;
                    }
                }
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
