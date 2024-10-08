package com.instagram.fbpay.w3c.views;

import X.0s1;
import X.2I7;
import X.AnonymousClass0fD;
import X.DbU;
import X.DbW;
import X.Pxe;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.base.activity.IgFragmentActivity;

public final class DemaskCardActivity extends IgFragmentActivity {
    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.fbpay.w3c.views.DemaskCardActivity, java.lang.Object, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(560516204);
        super.onCreate(bundle);
        setContentView((int) R.layout.w3c_fbpay_activity);
        2I7.A06.A00(Pxe.A0a(this));
        0s1 A0D = DbW.A0D(this);
        Bundle A06 = DbU.A06(this);
        Fragment fragment = new Fragment();
        fragment.setArguments(A06);
        A0D.A09(fragment, R.id.fragment_container);
        A0D.A00();
        AnonymousClass0fD.A07(121663162, A00);
    }
}
