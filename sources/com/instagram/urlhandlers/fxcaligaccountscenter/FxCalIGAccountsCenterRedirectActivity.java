package com.instagram.urlhandlers.fxcaligaccountscenter;

import X.08y;
import X.09i;
import X.0KC;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass06Q;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C20581Wuz;
import X.C229382nI;
import X.C268194cw;
import X.C269474fB;
import X.C296675qS;
import X.C359988do;
import X.C360678ey;
import X.C50128FQl;
import X.C50220FUa;
import X.DbS;
import X.DbT;
import X.DbX;
import X.E84;
import X.F5u;
import X.FFQ;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class FxCalIGAccountsCenterRedirectActivity extends IgFragmentActivity {
    public AnonymousClass0wW A00;
    public UserSession A01;
    public final AnonymousClass06Q A02 = new C50128FQl(this, 14);

    /* JADX WARNING: type inference failed for: r15v0, types: [com.instagram.urlhandlers.fxcaligaccountscenter.FxCalIGAccountsCenterRedirectActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(-1828986657);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -2100245310;
        } else {
            08y r2 = 09i.A0A;
            this.A00 = r2.A04(A0A);
            Intent intent = getIntent();
            AnonymousClass0wW r1 = this.A00;
            if (r1 == null) {
                finish();
                i = -1791513956;
            } else if (!(r1 instanceof UserSession)) {
                FFQ.A01(this, A0A, r1);
                i = -2112106082;
            } else {
                this.A01 = r2.A06(A0A);
                String A0m = DbS.A0m(A0A);
                if (A0m == null) {
                    finish();
                    i = -1315700057;
                } else {
                    getSupportFragmentManager().A0s(this.A02);
                    String queryParameter = DbT.A09(A0m).getQueryParameter("entrypoint");
                    if (queryParameter == null || queryParameter.length() == 0) {
                        queryParameter = "UNKNOWN";
                    }
                    String stringExtra = intent.getStringExtra("deeplink_destination");
                    if (!intent.hasExtra("entrypoint")) {
                        0KC.A0E("FxCalIGAccountsCenterRedirectActivity", "No entrypoint provided");
                    }
                    CharSequence[] charSequenceArr = {stringExtra, queryParameter};
                    int i2 = 0;
                    while (true) {
                        if (C296675qS.A03(charSequenceArr[i2])) {
                            break;
                        }
                        i2++;
                        if (i2 >= 2) {
                            if (stringExtra != null) {
                                String stringExtra2 = intent.getStringExtra("deeplink_params");
                                UserSession userSession = this.A01;
                                if (userSession != null) {
                                    F5u.A01(userSession, true);
                                    UserSession userSession2 = this.A01;
                                    if (userSession2 != null) {
                                        C229382nI A0N = DbT.A0N(this, new C50220FUa(), userSession2);
                                        UserSession userSession3 = this.A01;
                                        if (userSession3 != null) {
                                            C269474fB r6 = C269474fB.A00;
                                            C268194cw r5 = new C268194cw(r6);
                                            r5.A0E("deeplink_destination", stringExtra);
                                            r5.A0E("entrypoint", AnonymousClass7TF.A0j(queryParameter));
                                            r5.A0C("requested_screen_component_type", 2);
                                            r5.A0C("cds_client_value", F5u.A00(userSession3));
                                            C268194cw r4 = new C268194cw(r6);
                                            if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                                                try {
                                                    JSONObject jSONObject = new JSONObject(URLDecoder.decode(stringExtra2, ReactWebViewManager.HTML_ENCODING));
                                                    Iterator<String> keys = jSONObject.keys();
                                                    while (keys.hasNext()) {
                                                        String A18 = AnonymousClass7TE.A18(keys);
                                                        r4.A0E(A18, jSONObject.getString(A18));
                                                    }
                                                } catch (UnsupportedEncodingException | JSONException e) {
                                                    0KC.A0H("FxCalIGAccountsCenterRedirectActivity", "Exception on resolving deeplink params", e);
                                                }
                                            }
                                            r5.A0B(r4, "deeplink_params");
                                            C360678ey A05 = C359988do.A05(userSession3, "com.bloks.www.fxcal.settings.async", new C20581Wuz(DbX.A0L(r5, r6), 5));
                                            E84.A00(A05, A0N, 21);
                                            schedule(A05);
                                            i = -2107354509;
                                        }
                                    }
                                }
                                0qQ.A0F("userSession");
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                    }
                    finish();
                    i = 880165277;
                }
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
