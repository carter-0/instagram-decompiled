package com.instagram.debug.devoptions.section.xdms;

import X.0xY;
import X.AnonymousClass0fD;
import X.C59689JTv;
import X.DbS;
import android.view.View;
import androidx.fragment.app.FragmentActivity;

public final class XDMSOptions$getItems$3 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;

    public XDMSOptions$getItems$3(FragmentActivity fragmentActivity) {
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(824741931);
        0xY A0d = DbS.A0d(DbS.A0e());
        A0d.E5Z("preference_double_tap_profile_tab_tooltip_impressions", 0);
        A0d.apply();
        C59689JTv.A07(this.$activity, 2131958369);
        AnonymousClass0fD.A0C(454674165, A05);
    }
}
