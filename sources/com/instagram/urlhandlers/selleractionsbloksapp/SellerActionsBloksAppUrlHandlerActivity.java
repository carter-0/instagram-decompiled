package com.instagram.urlhandlers.selleractionsbloksapp;

import X.08y;
import X.09i;
import X.0KC;
import X.0c9;
import X.0cp;
import X.AnonymousClass06Q;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass3M3;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.C46649DiU;
import X.C50128FQl;
import X.DbS;
import X.DbU;
import X.DbX;
import X.F5I;
import X.FFQ;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class SellerActionsBloksAppUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;
    public UserSession A01;
    public final AnonymousClass06Q A02 = new C50128FQl(this, 27);

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.urlhandlers.selleractionsbloksapp.SellerActionsBloksAppUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        AnonymousClass0wW r1;
        int A002 = AnonymousClass0fD.A00(1609628641);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -99187986;
        } else {
            08y r12 = 09i.A0A;
            this.A00 = r12.A04(A0A);
            getIntent();
            AnonymousClass0wW r0 = this.A00;
            if (r0 == null) {
                finish();
                i = -415405202;
            } else if (!(r0 instanceof UserSession)) {
                FFQ.A00().A00(this, A0A, this.A00);
                i = -1612312075;
            } else {
                this.A01 = r12.A06(A0A);
                String A0m = DbS.A0m(A0A);
                if (A0m == null) {
                    finish();
                    i = -2010016789;
                } else {
                    getSupportFragmentManager().A0s(this.A02);
                    Uri A03 = 0cp.A03(A0m);
                    String queryParameter = A03.getQueryParameter("bloks_app_id");
                    String queryParameter2 = A03.getQueryParameter("params");
                    HashMap A1E = AnonymousClass7TE.A1E();
                    UserSession userSession = this.A01;
                    if (!(userSession == null || queryParameter2 == null)) {
                        try {
                            A1E = F5I.A00(0c9.A04.A01(userSession, queryParameter2));
                        } catch (IOException e) {
                            0KC.A0F("FBShopsSellerActionsUrlHandler", "Failed to extract params from URI", e);
                        }
                    }
                    if (queryParameter == null || !Arrays.asList("com.bloks.www.shops.fb_channel_enablement,com.bloks.www.bloks.commerce.creator-shop.activation.info,com.bloks.www.bloks.commerce.drops.shared-launch-details,com.bloks.www.bloks.commerce.drops.future-product-details-edit,com.bloks.www.bloks.commerce.creators-as-sellers.shop-management,com.bloks.www.bloks.commerce.creators-as-sellers.featured-products,com.bloks.www.commerce.cam.shop.management".split(",")).contains(queryParameter) || A1E == null || (r1 = this.A00) == null || this.A01 == null) {
                        finish();
                    } else {
                        AnonymousClass3M3 A022 = C46649DiU.A02(r1, queryParameter, A1E);
                        C309516Yo A0Q = DbU.A0Q(this, this.A01);
                        A0Q.A0D = false;
                        A0Q.A0E(A022);
                        A0Q.A04();
                    }
                    i = 537902847;
                }
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
