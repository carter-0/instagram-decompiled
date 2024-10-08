package com.instagram.debug.devoptions.section.videodebug;

import X.AnonymousClass0fD;
import X.C309516Yo;
import X.Dba;
import android.view.View;

public final class VideoDebugSettingsFragment$onViewCreated$items$9 implements View.OnClickListener {
    public final /* synthetic */ VideoDebugSettingsFragment this$0;

    public VideoDebugSettingsFragment$onViewCreated$items$9(VideoDebugSettingsFragment videoDebugSettingsFragment) {
        this.this$0 = videoDebugSettingsFragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1671582006);
        Dba.A12(VideoUtilityFragment.Companion.newInstance(this.this$0.getSession().getToken()), new C309516Yo(this.this$0.requireActivity(), this.this$0.getSession()));
        AnonymousClass0fD.A0C(1112559567, A05);
    }
}
