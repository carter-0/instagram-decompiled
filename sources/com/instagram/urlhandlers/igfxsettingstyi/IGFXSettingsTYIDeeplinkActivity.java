package com.instagram.urlhandlers.igfxsettingstyi;

import X.08y;
import X.09i;
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
import X.DbX;
import X.FFQ;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;

public class IGFXSettingsTYIDeeplinkActivity extends IgFragmentActivity {
    public AnonymousClass0wW A00;

    /* JADX WARNING: type inference failed for: r8v0, types: [android.content.Context, com.instagram.urlhandlers.igfxsettingstyi.IGFXSettingsTYIDeeplinkActivity, java.lang.Object, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(93828658);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -202218397;
        } else {
            08y r3 = 09i.A0A;
            AnonymousClass0wW A04 = r3.A04(A0A);
            this.A00 = A04;
            if (A04 == null) {
                finish();
                i = 1897028252;
            } else if (!(A04 instanceof UserSession)) {
                FFQ.A00().A00(this, A0A, this.A00);
                i = 1520708368;
            } else {
                Intent intent = getIntent();
                HashMap A1E = AnonymousClass7TE.A1E();
                if (intent.hasExtra("source")) {
                    A1E.put("source", intent.getStringExtra("source"));
                }
                if (intent.hasExtra("import_service")) {
                    A1E.put("import_service", intent.getStringExtra("import_service"));
                }
                A1E.put("surface", "STANDALONE_IG");
                HashMap A1E2 = AnonymousClass7TE.A1E();
                A1E2.put("should_dismiss", AnonymousClass7TE.A0v());
                A1E2.put("deeplink_params", A1E);
                HashMap A01 = C359608dC.A01(A1E2);
                C49940FFt fFt = new C49940FFt();
                fFt.A02 = C46627Di7.DISABLED;
                fFt.A03 = C46626Di6.FULL_SHEET;
                C46471DfZ A012 = C49940FFt.A01(fFt, this, 6);
                C49672F1e f1e = new C49672F1e(r3.A06(A0A));
                IgBloksScreenConfig igBloksScreenConfig = f1e.A00;
                igBloksScreenConfig.A0R = "com.bloks.www.fx.settings.tyi.home_page";
                f1e.A00(A012);
                new C46649DiU(A01, Collections.emptyMap(), "com.bloks.www.fx.settings.tyi.home_page").A0F(this, igBloksScreenConfig);
                i = 1058637553;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
