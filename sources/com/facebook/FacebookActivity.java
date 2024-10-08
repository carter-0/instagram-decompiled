package com.facebook;

import X.0hq;
import X.0qQ;
import X.0s1;
import X.2YK;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.DbS;
import X.DbU;
import X.DbW;
import X.Pxf;
import X.Pxi;
import X.Pxj;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;

public class FacebookActivity extends AppCompatActivity {
    public Fragment A00;

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.A00;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.facebook.FacebookActivity, java.lang.Object, android.app.Activity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(-1526783036);
        int A003 = AnonymousClass0fD.A00(1345302537);
        if (!Pxj.A1V(this)) {
            finish();
        }
        if (bundle != null) {
            ClassLoader A0W = Pxf.A0W(this);
            0qQ.A07(A0W);
            2YK.A00(bundle, A0W);
        }
        FacebookActivity.super.onCreate(bundle);
        AnonymousClass0fD.A07(1386702006, A003);
        AnonymousClass0wW A0S = DbS.A0S(this);
        Bundle A06 = DbU.A06(this);
        if (A06 != null) {
            A06.getParcelable("Request");
        }
        setContentView((int) R.layout.com_facebook_activity_layout);
        0hq supportFragmentManager = getSupportFragmentManager();
        Fragment A0R = supportFragmentManager.A0R("SingleFragment");
        if (A0R == null) {
            A0R = new Fragment();
            Bundle bundle2 = A0R.mArguments;
            Bundle A0C = Pxi.A0C(bundle2, bundle2);
            DbW.A0w(A0C, A0S);
            A0R.setArguments(A0C);
            A0R.setRetainInstance(true);
            0s1 r1 = new 0s1(supportFragmentManager);
            r1.A0C(A0R, "SingleFragment", R.id.com_facebook_fragment_container);
            r1.A00();
        }
        this.A00 = A0R;
        AnonymousClass0fD.A07(-309335048, A002);
    }
}
