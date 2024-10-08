package com.facebook;

import X.1wn;
import X.1xC;
import X.AnonymousClass0fD;
import X.C12787T6x;
import X.C12788T6y;
import X.C66580MXl;
import X.Pxf;
import X.Pxj;
import X.T72;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class CustomTabActivity extends Activity {
    public 1wn A00 = null;

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            1xC r2 = 1xC.A01;
            r2.A00(new C12788T6y(getIntent().getDataString()));
            T72 t72 = new T72(this, 1);
            this.A00 = t72;
            r2.A02(t72, C12787T6x.class);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A02 = Pxf.A02(this, 348390450);
        super.onCreate(bundle);
        if (!Pxj.A1V(this)) {
            finish();
        }
        Intent A0A = C66580MXl.A0A(this, CustomTabMainActivity.class);
        A0A.setAction("CustomTabActivity.action_customTabRedirect");
        A0A.putExtra("CustomTabMainActivity.extra_url", getIntent().getDataString());
        A0A.addFlags(603979776);
        Pxf.A0O().A0F(this, A0A, 2);
        AnonymousClass0fD.A07(1055699055, A02);
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0fD.A00(-739852603);
        1wn r2 = this.A00;
        if (r2 != null) {
            1xC.A01.A03(r2, C12787T6x.class);
        }
        super.onDestroy();
        AnonymousClass0fD.A07(1570583838, A002);
    }
}
