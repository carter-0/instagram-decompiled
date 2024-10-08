package com.instagram.debug.devoptions.section.xdms;

import X.0xY;
import X.AnonymousClass0fD;
import X.C59689JTv;
import X.DbS;
import android.view.View;
import androidx.fragment.app.FragmentActivity;

public final class XDMSOptions$getItems$2 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;

    public XDMSOptions$getItems$2(FragmentActivity fragmentActivity) {
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1610019867);
        0xY A0d = DbS.A0d(DbS.A0e());
        A0d.E5Z("preference_long_press_avatar_show_mac_account_switcher_tooltip_impressions", 0);
        A0d.apply();
        C59689JTv.A07(this.$activity, 2131958377);
        AnonymousClass0fD.A0C(910858374, A05);
    }
}
