package com.instagram.business.instantexperiences.ui;

import X.0s1;
import X.AnonymousClass0fD;
import X.DbS;
import X.DbU;
import X.DbW;
import X.R8a;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;

public class InstantExperiencesBrowserActivity extends IgFragmentActivity {
    public UserSession A00;
    public Fragment A01;

    public final void onBackPressed() {
        if (!this.A01.onBackPressed()) {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(410757087);
        super.onCreate(bundle);
        Bundle A06 = DbU.A06(this);
        A06.getClass();
        this.A00 = DbS.A0U(A06);
        setContentView((int) R.layout.instant_experiences_browser_main);
        if (bundle == null) {
            R8a r8a = new R8a();
            this.A01 = r8a;
            r8a.setArguments(DbU.A06(this));
            0s1 A0D = DbW.A0D(this);
            A0D.A09(this.A01, R.id.instant_experience_fragment_container);
            A0D.A00();
        } else {
            Fragment A0Q = getSupportFragmentManager().A0Q(bundle, "instant_experiences_browser_fragment");
            A0Q.getClass();
            this.A01 = A0Q;
        }
        AnonymousClass0fD.A07(499206163, A002);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        InstantExperiencesBrowserActivity.super.onSaveInstanceState(bundle);
        getSupportFragmentManager().A0g(bundle, this.A01, "instant_experiences_browser_fragment");
    }
}
