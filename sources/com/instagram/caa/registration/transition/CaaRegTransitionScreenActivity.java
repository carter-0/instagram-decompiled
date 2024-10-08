package com.instagram.caa.registration.transition;

import X.09i;
import X.0eP;
import X.0qQ;
import X.0qv;
import X.19f;
import X.AnonymousClass7TE;
import X.C276534tU;
import X.C359608dC;
import X.C46471DfZ;
import X.C46476Dff;
import X.C46649DiU;
import X.C49672F1e;
import X.C49940FFt;
import X.DbT;
import X.DbY;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import org.json.JSONObject;

public final class CaaRegTransitionScreenActivity extends BaseFragmentActivity {
    public UserSession A00;

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, com.instagram.caa.registration.transition.CaaRegTransitionScreenActivity, java.lang.Object, android.app.Activity] */
    public final void A0j(Bundle bundle) {
        try {
            UserSession A08 = 09i.A0A.A08(this);
            this.A00 = A08;
            Intent intent = getIntent();
            0qQ.A07(intent);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = AnonymousClass7TE.A0a();
            }
            0eP A1L = AnonymousClass7TE.A1L("flow_name", extras.getString("flow_name"));
            Intent intent2 = getIntent();
            0qQ.A07(intent2);
            Bundle extras2 = intent2.getExtras();
            if (extras2 == null) {
                extras2 = AnonymousClass7TE.A0a();
            }
            String A10 = DbT.A10(new JSONObject(DbY.A0p("flow_type", extras2.getString("flow_type"), A1L)));
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("flow_info", A10);
            A1E.put("family_device_id", DbT.A0P(A08).A02(19f.A1P));
            A1E.put(C46476Dff.A02(0, 9, 117), 0qv.A00(this));
            A1E.put("qe_device_id", 0qv.A02.A04(this));
            C46471DfZ A01 = C49940FFt.A01(C49940FFt.A00(), this, 3);
            C49672F1e f1e = new C49672F1e(A08);
            IgBloksScreenConfig igBloksScreenConfig = f1e.A00;
            igBloksScreenConfig.A0R = "com.bloks.www.bloks.caa.reg.transition";
            f1e.A00(A01);
            C276534tU r3 = new C276534tU(13784);
            r3.A0P(45, "bloks.caa.reg.transition");
            C46649DiU A04 = C46649DiU.A04("com.bloks.www.bloks.caa.reg.transition", C359608dC.A01(A1E));
            A04.A00 = 719983200;
            r3.A0O();
            A04.A03 = r3;
            A04.A06 = "bloks.caa.reg.transition";
            A04.A0F(this, igBloksScreenConfig);
        } catch (IllegalStateException unused) {
        }
    }
}
