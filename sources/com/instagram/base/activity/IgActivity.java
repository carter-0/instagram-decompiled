package com.instagram.base.activity;

import X.0lU;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass11c;
import X.AnonymousClass1K7;
import X.AnonymousClass3QE;
import X.C262154Ci;
import X.Pxf;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;

public abstract class IgActivity extends Activity {
    public C262154Ci A00;

    public final void attachBaseContext(Context context) {
        0qQ.A0B(context, 0);
        super.attachBaseContext(context);
        AnonymousClass11c A002 = AnonymousClass11c.A00();
        0qQ.A07(A002);
        this.A00 = A002.A02(context);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        C262154Ci r0 = this.A00;
        if (r0 == null) {
            0qQ.A0F("igResources");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A01(configuration);
        }
    }

    public final Resources getResources() {
        C262154Ci r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("igResources");
        throw AnonymousClass00P.createAndThrow();
    }

    public void onCreate(Bundle bundle) {
        int A02 = Pxf.A02(this, -1215114548);
        0lU.A00(this);
        super.onCreate(bundle);
        0lU.A01(this);
        AnonymousClass0fD.A07(600314632, A02);
    }

    public void onDestroy() {
        int A002 = AnonymousClass0fD.A00(-1544405360);
        super.onDestroy();
        0lU.A02(this);
        if (Build.VERSION.SDK_INT < 29) {
            AnonymousClass3QE.A00(this);
        }
        AnonymousClass0fD.A07(1886719446, A002);
    }

    public final void onPause() {
        int A002 = AnonymousClass0fD.A00(-1267059465);
        super.onPause();
        0lU.A03(this);
        AnonymousClass0fD.A07(625802624, A002);
    }

    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(1098597612);
        super.onResume();
        0lU.A04(this);
        AnonymousClass0fD.A07(-1000650145, A002);
    }

    public final void onStart() {
        int A002 = AnonymousClass0fD.A00(-215996483);
        super.onStart();
        0lU.A05(this);
        AnonymousClass0fD.A07(-1947377669, A002);
    }

    public final void onStop() {
        int A002 = AnonymousClass0fD.A00(-1097854692);
        super.onStop();
        0lU.A06(this);
        AnonymousClass0fD.A07(-40401239, A002);
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        AnonymousClass1K7.A00().A07(i);
    }
}
