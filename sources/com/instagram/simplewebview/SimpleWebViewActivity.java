package com.instagram.simplewebview;

import X.08y;
import X.09i;
import X.0lg;
import X.0qQ;
import X.0s1;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1GD;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.C49906FEe;
import X.DbU;
import X.DbW;
import android.content.Context;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;

public final class SimpleWebViewActivity extends BaseFragmentActivity {
    public static final C49906FEe A02 = new Object();
    public AnonymousClass0wW A00;
    public boolean A01;

    public static final void A00(Context context, 0lg r2, SimpleWebViewConfig simpleWebViewConfig) {
        A02.A02(context, r2, simpleWebViewConfig);
    }

    public final AnonymousClass0wW getSession() {
        AnonymousClass0wW r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("session");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.simplewebview.SimpleWebViewActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void A0j(Bundle bundle) {
        if (getSupportFragmentManager().A0P(R.id.layout_container_main) == null) {
            AnonymousClass4DH r1 = new AnonymousClass4DH();
            r1.setArguments(DbU.A06(this));
            0s1 A0D = DbW.A0D(this);
            A0D.A0A(r1, R.id.layout_container_main);
            A0D.A00();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.simplewebview.SimpleWebViewActivity, android.app.Activity] */
    public final void finish() {
        SimpleWebViewActivity.super.finish();
        if (!this.A01) {
            overridePendingTransition(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_right_exit);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.instagram.simplewebview.SimpleWebViewActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A002 = AnonymousClass0fD.A00(1551431989);
        AnonymousClass1GD.A01(this);
        08y r1 = 09i.A0A;
        Bundle A06 = DbU.A06(this);
        if (A06 != null) {
            AnonymousClass0wW A04 = r1.A04(A06);
            0qQ.A0B(A04, 0);
            this.A00 = A04;
            Bundle A062 = DbU.A06(this);
            if (A062 != null) {
                Object obj = A062.get("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG");
                if (obj instanceof SimpleWebViewConfig) {
                    this.A01 = ((SimpleWebViewConfig) obj).A04;
                }
                super.onCreate(bundle);
                if (!this.A01) {
                    overridePendingTransition(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_left_exit);
                }
                AnonymousClass0fD.A07(-1980268364, A002);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -1388582056;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -953617384;
        }
        AnonymousClass0fD.A07(i, A002);
        throw illegalStateException;
    }
}
