package com.instagram.urlhandlers.bloksigbasupportflow;

import X.08y;
import X.09i;
import X.0Yt;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C359608dC;
import X.C46649DiU;
import X.DbS;
import X.DbT;
import X.DbX;
import X.FFQ;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class IGBASupportFlowRedirectActivity extends IgFragmentActivity {
    public AnonymousClass0wW A00;
    public UserSession A01;

    /* JADX WARNING: type inference failed for: r8v0, types: [android.content.Context, com.instagram.urlhandlers.bloksigbasupportflow.IGBASupportFlowRedirectActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(513789876);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = 2064099731;
        } else {
            08y r6 = 09i.A0A;
            AnonymousClass0wW A04 = r6.A04(A0A);
            this.A00 = A04;
            if (A04 == null) {
                finish();
                i = 420394724;
            } else if (!(A04 instanceof UserSession)) {
                FFQ.A01(this, A0A, A04);
                i = -1590953790;
            } else {
                String A0m = DbS.A0m(A0A);
                if (A0m == null) {
                    finish();
                    i = -906609009;
                } else {
                    Uri A09 = DbT.A09(A0m);
                    HashMap A1E = AnonymousClass7TE.A1E();
                    A1E.put("ad_account_id", A09.getQueryParameter("ad_account_id"));
                    A1E.put("ref", A09.getQueryParameter("ref"));
                    HashMap A012 = C359608dC.A01(A1E);
                    UserSession A06 = r6.A06(A0A);
                    this.A01 = A06;
                    0qQ.A0A(A06);
                    IgBloksScreenConfig A0N = DbS.A0N(A06);
                    A0N.A0R = "com.bloks.www.care.ads_payment_support";
                    C46649DiU diU = new C46649DiU(A012, 0Yt.A0E(), "com.bloks.www.care.ads_payment_support");
                    diU.A00 = 719983200;
                    diU.A0D(this, A0N);
                    i = -1157916470;
                }
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
