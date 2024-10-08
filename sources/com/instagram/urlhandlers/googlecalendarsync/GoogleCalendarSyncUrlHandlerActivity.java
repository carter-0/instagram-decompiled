package com.instagram.urlhandlers.googlecalendarsync;

import X.0KC;
import X.0cp;
import X.AnonymousClass0b5;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass3M3;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.C46649DiU;
import X.C49891FBs;
import X.DbS;
import X.DbU;
import X.DbW;
import X.DbX;
import X.Dbc;
import X.FFQ;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleCalendarSyncUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.googlecalendarsync.GoogleCalendarSyncUrlHandlerActivity, java.lang.Object, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        HashMap hashMap;
        String str;
        int i;
        int A002 = AnonymousClass0fD.A00(1098937532);
        super.onCreate(bundle);
        this.A00 = DbS.A0S(this);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -1079162842;
        } else {
            String A0m = DbS.A0m(A0A);
            if (A0m == null) {
                finish();
                i = -521089291;
            } else {
                if (!(this.A00 instanceof UserSession)) {
                    FFQ.A00().A00(this, A0A, this.A00);
                } else {
                    Uri A03 = 0cp.A03(A0m);
                    if (A03.toString().contains("launch")) {
                        String queryParameter = A03.getQueryParameter("auth_url");
                        if (queryParameter != null) {
                            AnonymousClass0b5.A03(this, DbX.A09(queryParameter));
                        }
                        finish();
                    } else {
                        if (A03.toString().contains(RealtimeConstants.SEND_SUCCESS)) {
                            hashMap = AnonymousClass7TE.A1E();
                            JSONObject A11 = DbS.A11();
                            JSONObject A112 = DbS.A11();
                            try {
                                Dbc.A0K(A03, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, A11);
                                Dbc.A0K(A03, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, A11);
                                A112.put("server_params", A11);
                                DbW.A1Q(A112, hashMap);
                                str = "com.bloks.www.service.merchant.google.calendar.sync";
                            } catch (JSONException e) {
                                String message = e.getMessage();
                                if (message != null) {
                                    0KC.A0C("GoogleCalendarSyncUrlHandlerActivity", message);
                                }
                                throw new RuntimeException(e);
                            }
                        } else if (A03.toString().contains("failure")) {
                            hashMap = AnonymousClass7TE.A1E();
                            JSONObject A113 = DbS.A11();
                            JSONObject A114 = DbS.A11();
                            try {
                                Dbc.A0K(A03, "error", A113);
                                A114.put("server_params", A113);
                                DbW.A1Q(A114, hashMap);
                                str = "com.bloks.www.service.merchant.google.calendar.sync.failure";
                            } catch (JSONException e2) {
                                String message2 = e2.getMessage();
                                if (message2 != null) {
                                    0KC.A0C("GoogleCalendarSyncUrlHandlerActivity", message2);
                                }
                                throw new RuntimeException(e2);
                            }
                        }
                        AnonymousClass0wW r4 = this.A00;
                        C46649DiU A04 = C46649DiU.A04(str, hashMap);
                        IgBloksScreenConfig A0N = DbS.A0N(r4);
                        DbS.A18(getApplicationContext(), A0N, 2131963124);
                        AnonymousClass3M3 A02 = C49891FBs.A02(A0N, A04);
                        C309516Yo A0Q = DbU.A0Q(this, r4);
                        A0Q.A0D = false;
                        A0Q.A0E(A02);
                        A0Q.A04();
                    }
                }
                i = -1824512064;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
