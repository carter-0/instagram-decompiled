package com.instagram.urlhandlers.bwp;

import X.08y;
import X.09i;
import X.0Tu;
import X.0qQ;
import X.182;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C66579MXk;
import X.C69714Nqa;
import X.C71172bH;
import X.DbS;
import X.DbT;
import X.DbZ;
import X.FFQ;
import X.NC1;
import android.os.Bundle;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.net.URLDecoder;
import org.json.JSONObject;

public final class AmazonAccountLinkingUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.bwp.AmazonAccountLinkingUrlHandlerActivity, java.lang.Object, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        String A0m;
        JSONObject jSONObject;
        int A00 = AnonymousClass0fD.A00(1070289);
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        08y r4 = 09i.A0A;
        AnonymousClass0wW A05 = r4.A05(this);
        if (A05 instanceof UserSession) {
            if (182.A06(0Tu.A05, r4.A05(this), 36325600733967433L)) {
                if (C71172bH.A00() != null) {
                    String stringExtra = getIntent().getStringExtra("consent_flow_name");
                    String stringExtra2 = getIntent().getStringExtra("partnership_name");
                    if (!(stringExtra == null || stringExtra.length() == 0 || stringExtra2 == null || stringExtra2.length() == 0)) {
                        try {
                            String stringExtra3 = getIntent().getStringExtra("extra_params");
                            if (stringExtra3 == null) {
                                stringExtra3 = "";
                            }
                            jSONObject = new JSONObject(URLDecoder.decode(stringExtra3, ReactWebViewManager.HTML_ENCODING));
                        } catch (Exception unused) {
                            jSONObject = DbS.A11();
                        }
                        jSONObject.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, C66579MXk.A00(174));
                        AnonymousClass0wW A052 = r4.A05(this);
                        0qQ.A0B(A052, 0);
                        C69714Nqa.A00(A052).A00(this, new NC1(1, this, this), stringExtra, stringExtra2, (String) null, (String) null, jSONObject.toString());
                    }
                } else {
                    Bundle bundleExtra2 = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
                    if (!(bundleExtra2 == null || (A0m = DbS.A0m(bundleExtra2)) == null)) {
                        DbZ.A0v(this, DbT.A09(A0m));
                    }
                }
            }
            finish();
        } else {
            FFQ.A01(this, bundleExtra, A05);
        }
        AnonymousClass0fD.A07(-99648420, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
