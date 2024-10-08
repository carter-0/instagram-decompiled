package com.fbpay.customtabs;

import X.0cp;
import X.0qQ;
import X.AnonymousClass0fD;
import X.Pxf;
import X.Pxj;
import X.SO4;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public abstract class CustomTabsActivity extends Activity {
    public boolean A00 = true;

    public void onNewIntent(Intent intent) {
        0qQ.A0B(intent, 0);
        super.onNewIntent(intent);
        if ("action_custom_tab_redirect".equals(intent.getAction())) {
            setResult(-1, intent);
        } else {
            setResult(0, intent);
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A02 = Pxf.A02(this, -1940133220);
        super.onCreate(bundle);
        if (!Pxj.A1V(this)) {
            finish();
            i = -350200869;
        } else {
            if (bundle == null) {
                String stringExtra = getIntent().getStringExtra("extra_url");
                if (stringExtra == null) {
                    finish();
                    i = -133691908;
                } else {
                    new SO4().A01().A00(this, 0cp.A03(stringExtra));
                    this.A00 = true;
                }
            }
            i = -1908787341;
        }
        AnonymousClass0fD.A07(i, A02);
    }

    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(-1358194371);
        super.onResume();
        if (!this.A00) {
            setResult(0);
            finish();
        }
        this.A00 = false;
        AnonymousClass0fD.A07(623441748, A002);
    }
}
