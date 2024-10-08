package com.instagram.urlhandlers.adsconsentgrowth;

import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1Nd;
import X.C2371636o;
import X.DbS;
import X.DbT;
import X.DbX;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;

public final class AdsConsentGrowthUrlHandlerActivity extends IgFragmentActivity {
    public AnonymousClass0wW A00;

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.urlhandlers.adsconsentgrowth.AdsConsentGrowthUrlHandlerActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(-8650559);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = 966993227;
        } else {
            this.A00 = DbT.A0W(A0A);
            String A0m = DbS.A0m(A0A);
            if (A0m == null) {
                i = -1804677472;
            } else {
                Uri A09 = DbT.A09(A0m);
                AnonymousClass0wW r0 = this.A00;
                if (r0 != null) {
                    AnonymousClass1Nd.A00(r0).A00(new C2371636o(A09));
                }
                finish();
                i = -1220612036;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
