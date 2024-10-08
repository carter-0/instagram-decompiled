package com.instagram.debug.devoptions.section.zone;

import X.AnonymousClass0fD;
import X.C59689JTv;
import X.Pxg;
import android.view.View;
import androidx.fragment.app.FragmentActivity;

public final class PolicyZonePreferencesSection$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;

    public PolicyZonePreferencesSection$getItems$1(FragmentActivity fragmentActivity) {
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(484882810);
        FragmentActivity fragmentActivity = this.$activity;
        if (Pxg.A0R().isEnabled()) {
            str = "Yes";
        } else {
            str = "No";
        }
        C59689JTv.A09(fragmentActivity, str);
        AnonymousClass0fD.A0C(1894166045, A05);
    }
}
