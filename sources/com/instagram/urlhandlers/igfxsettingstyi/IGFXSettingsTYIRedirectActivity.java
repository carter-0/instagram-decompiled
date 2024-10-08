package com.instagram.urlhandlers.igfxsettingstyi;

import X.08y;
import X.09i;
import X.0cp;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C359608dC;
import X.C46471DfZ;
import X.C46626Di6;
import X.C46627Di7;
import X.C46649DiU;
import X.C49672F1e;
import X.C49940FFt;
import X.DbS;
import X.DbX;
import X.FFQ;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Collections;
import java.util.HashMap;

public class IGFXSettingsTYIRedirectActivity extends IgFragmentActivity {
    public AnonymousClass0wW A00;
    public UserSession A01;

    /* JADX WARNING: type inference failed for: r8v0, types: [android.content.Context, com.instagram.urlhandlers.igfxsettingstyi.IGFXSettingsTYIRedirectActivity, java.lang.Object, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(-586894843);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -274787082;
        } else {
            08y r6 = 09i.A0A;
            AnonymousClass0wW A04 = r6.A04(A0A);
            this.A00 = A04;
            if (A04 == null) {
                finish();
                i = 623684799;
            } else if (!(A04 instanceof UserSession)) {
                FFQ.A00().A00(this, A0A, this.A00);
                i = 1446574786;
            } else {
                String A0m = DbS.A0m(A0A);
                if (A0m == null) {
                    finish();
                    i = 361269283;
                } else {
                    Uri A03 = 0cp.A03(A0m);
                    HashMap A1E = AnonymousClass7TE.A1E();
                    A1E.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, A03.getQueryParameter(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE));
                    A1E.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, A03.getQueryParameter(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE));
                    HashMap A012 = C359608dC.A01(A1E);
                    C49940FFt fFt = new C49940FFt();
                    fFt.A02 = C46627Di7.DISABLED;
                    fFt.A03 = C46626Di6.FLEXIBLE_SHEET;
                    C46471DfZ A013 = C49940FFt.A01(fFt, this, 7);
                    UserSession A06 = r6.A06(A0A);
                    this.A01 = A06;
                    C49672F1e f1e = new C49672F1e(A06);
                    IgBloksScreenConfig igBloksScreenConfig = f1e.A00;
                    igBloksScreenConfig.A0R = "com.bloks.www.fx.settings.tyi.oauth_loading_page";
                    f1e.A00(A013);
                    C46649DiU.A08(this, igBloksScreenConfig, "com.bloks.www.fx.settings.tyi.oauth_loading_page", A012, Collections.emptyMap());
                    i = 1792672388;
                }
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
