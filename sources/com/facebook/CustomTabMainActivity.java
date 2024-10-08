package com.facebook;

import X.002;
import X.1wn;
import X.1xC;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C10070Rm7;
import X.C10179Rnu;
import X.C10506RtL;
import X.C10917S0u;
import X.C11164SCy;
import X.C11406SSd;
import X.C12788T6y;
import X.Pxf;
import X.Pxi;
import X.Pxj;
import X.SO4;
import X.T72;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import java.util.Collection;

public class CustomTabMainActivity extends Activity {
    public 1wn A00 = null;
    public boolean A01 = true;

    public final void onCreate(Bundle bundle) {
        int i;
        boolean z;
        int A02 = Pxf.A02(this, -1184881461);
        super.onCreate(bundle);
        if (!Pxj.A1V(this)) {
            finish();
        }
        if ("CustomTabActivity.action_customTabRedirect".equals(Pxi.A0a(this))) {
            setResult(0);
            finish();
            i = -1785440123;
        } else {
            if (bundle == null) {
                String stringExtra = getIntent().getStringExtra("CustomTabMainActivity.extra_action");
                Bundle bundleExtra = getIntent().getBundleExtra("CustomTabMainActivity.extra_params");
                String stringExtra2 = getIntent().getStringExtra("CustomTabMainActivity.extra_chromePackage");
                Bundle A0C = Pxi.A0C(bundleExtra, bundleExtra);
                Collection collection = C10070Rm7.A01;
                Uri A002 = C11406SSd.A00(A0C, String.format("m.%s", new Object[]{IGPixelRequestBuffer.URL_PREFIX}), 002.A0u("v2.3", "/", "dialog/", stringExtra));
                C10917S0u A012 = new SO4((C10506RtL) null).A01();
                A012.A00.setPackage(stringExtra2);
                try {
                    A012.A00(this, A002);
                    z = true;
                } catch (ActivityNotFoundException unused) {
                    z = false;
                }
                this.A01 = false;
                if (!z) {
                    setResult(0, getIntent().putExtra("CustomTabMainActivity.no_activity_exception", true));
                    finish();
                    i = -313143066;
                } else {
                    T72 t72 = new T72(this, 2);
                    this.A00 = t72;
                    1xC.A01.A02(t72, C12788T6y.class);
                }
            }
            i = -715104842;
        }
        AnonymousClass0fD.A07(i, A02);
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0fD.A00(2006141850);
        1wn r2 = this.A00;
        if (r2 != null) {
            1xC.A01.A03(r2, C12788T6y.class);
        }
        super.onDestroy();
        AnonymousClass0fD.A07(-1052043915, A002);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.1xE, java.lang.Object] */
    public final void onNewIntent(Intent intent) {
        Bundle A0a;
        super.onNewIntent(intent);
        if ("CustomTabMainActivity.action_refresh".equals(intent.getAction())) {
            1xC.A01.A00(new Object());
        } else if (!"CustomTabActivity.action_customTabRedirect".equals(intent.getAction())) {
            return;
        }
        String stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
        if (stringExtra != null) {
            A0a = C11406SSd.A01(stringExtra);
        } else {
            A0a = AnonymousClass7TE.A0a();
        }
        Intent A002 = C11164SCy.A00(getIntent(), A0a, (C10179Rnu) null);
        if (A002 != null) {
            intent = A002;
        }
        setResult(-1, intent);
        finish();
    }

    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(-2121318846);
        super.onResume();
        if (this.A01) {
            setResult(0, C11164SCy.A00(getIntent(), AnonymousClass7TE.A0a(), (C10179Rnu) null));
            finish();
        }
        this.A01 = true;
        AnonymousClass0fD.A07(-223282094, A002);
    }
}
