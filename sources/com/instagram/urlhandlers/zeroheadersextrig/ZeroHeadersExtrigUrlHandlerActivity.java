package com.instagram.urlhandlers.zeroheadersextrig;

import X.0cp;
import X.0xY;
import X.0xn;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C59689JTv;
import X.C60071Jf4;
import X.DbS;
import X.DbX;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class ZeroHeadersExtrigUrlHandlerActivity extends BaseFragmentActivity {
    public final AnonymousClass0wW A00 = DbS.A0S(this);

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.urlhandlers.zeroheadersextrig.ZeroHeadersExtrigUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String A0m;
        Uri A03;
        int A002 = AnonymousClass0fD.A00(1006880913);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null || (A0m = DbS.A0m(A0A)) == null || (A03 = 0cp.A03(A0m)) == null || (str = A03.getQueryParameter("dogfood_id")) == null) {
            str = "";
        }
        0xY AR4 = 0xn.A01("PrefZeroHeadersDogfooding").AR4();
        AR4.E5g("zero_headers_dogfood_id", str);
        AR4.commit();
        if (str.length() > 0) {
            str2 = "Headers Dogfooding Enabled";
        } else {
            str2 = "Headers Dogfooding Disabled";
        }
        C60071Jf4 A02 = C59689JTv.A02(this.A00.getDeviceSession().A06(), str2, (String) null, 1);
        if (A02 != null) {
            A02.show();
        }
        finish();
        AnonymousClass0fD.A07(-1184440653, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
