package com.instagram.react.activity;

import X.08y;
import X.09i;
import X.0hq;
import X.0qQ;
import X.0s1;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass2ZV;
import X.AnonymousClass2Za;
import X.AnonymousClass4DF;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13717Tfi;
import X.DbU;
import X.DbW;
import X.MJ1;
import X.R8S;
import android.os.Bundle;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;

public final class IgReactActivity extends BaseFragmentActivity implements AnonymousClass0iw, AnonymousClass2ZV, C13717Tfi, AnonymousClass2Za {
    public AnonymousClass0wW A00;
    public PermissionsModule A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new MJ1(this, 12));

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.react.activity.IgReactActivity, android.app.Activity] */
    public final void EHZ(PermissionsModule permissionsModule, String[] strArr, int i) {
        0qQ.A0B(strArr, 0);
        this.A01 = permissionsModule;
        requestPermissions(strArr, i);
    }

    public final String getModuleName() {
        return "react_activity";
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        AnonymousClass7TF.A1B(strArr, 1, iArr);
        PermissionsModule permissionsModule = this.A01;
        if (permissionsModule != null && permissionsModule.onRequestPermissionsResult(i, strArr, iArr)) {
            this.A01 = null;
        }
    }

    public final AnonymousClass0iw AuG() {
        return this;
    }

    public final AnonymousClass4DF BTU() {
        return (AnonymousClass4DF) this.A02.getValue();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.react.activity.IgReactActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void A0j(Bundle bundle) {
        if (getSupportFragmentManager().A0P(R.id.layout_container_main) == null) {
            R8S r8s = new R8S();
            r8s.setArguments(DbU.A06(this));
            0s1 A0D = DbW.A0D(this);
            A0D.A0A(r8s, R.id.layout_container_main);
            A0D.A00();
        }
    }

    public final 0hq B7w() {
        return getSupportFragmentManager();
    }

    public final boolean CXf() {
        AnonymousClass4DF BTU = BTU();
        if (BTU == null || !BTU.A06()) {
            return false;
        }
        return true;
    }

    public final boolean CXg() {
        AnonymousClass4DF BTU = BTU();
        if (BTU == null || !BTU.A05()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.react.activity.IgReactActivity, android.app.Activity] */
    public final void finish() {
        IgReactActivity.super.finish();
        int[] intArrayExtra = getIntent().getIntArrayExtra("IgReactActivity.EXTRA_ACTIVITY_ANIMATION");
        if (intArrayExtra != null && intArrayExtra.length == 4) {
            overridePendingTransition(intArrayExtra[2], intArrayExtra[3]);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.react.activity.IgReactActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(-1930693958);
        super.onCreate(bundle);
        08y r1 = 09i.A0A;
        Bundle A06 = DbU.A06(this);
        if (A06 != null) {
            this.A00 = r1.A04(A06);
            int[] intArrayExtra = getIntent().getIntArrayExtra("IgReactActivity.EXTRA_ACTIVITY_ANIMATION");
            if (intArrayExtra != null && intArrayExtra.length == 4) {
                overridePendingTransition(intArrayExtra[0], intArrayExtra[1]);
            }
            AnonymousClass0fD.A07(794127300, A002);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A07(79003697, A002);
        throw A0y;
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
