package com.spotify.sdk.android.auth.browser;

import X.AnonymousClass0fD;
import X.C66580MXl;
import X.Pxf;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.sdk.android.auth.LoginActivity;

public class RedirectUriReceiverActivity extends Activity {
    public final void onCreate(Bundle bundle) {
        int A02 = Pxf.A02(this, -914284890);
        super.onCreate(bundle);
        Intent A0A = C66580MXl.A0A(this, LoginActivity.class);
        A0A.setData(getIntent().getData());
        A0A.addFlags(603979776);
        startActivity(A0A);
        finish();
        AnonymousClass0fD.A07(1038308271, A02);
    }
}
