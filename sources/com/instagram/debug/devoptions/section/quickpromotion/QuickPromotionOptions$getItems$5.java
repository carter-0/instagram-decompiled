package com.instagram.debug.devoptions.section.quickpromotion;

import X.AnonymousClass0fD;
import android.view.View;
import androidx.fragment.app.FragmentActivity;

public final class QuickPromotionOptions$getItems$5 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;

    public QuickPromotionOptions$getItems$5(FragmentActivity fragmentActivity) {
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(358036329);
        QuickPromotionOptions.INSTANCE.showQpIpOverrideDialog(this.$activity);
        AnonymousClass0fD.A0C(-188687155, A05);
    }
}
