package com.instagram.debug.devoptions.section.videodebug;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass4M3;
import android.widget.CompoundButton;

public final class VideoUtilityFragment$onViewCreated$2 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ VideoUtilityFragment this$0;

    public VideoUtilityFragment$onViewCreated$2(VideoUtilityFragment videoUtilityFragment) {
        this.this$0 = videoUtilityFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AnonymousClass4M3 r0 = this.this$0.igVideoPlayer;
        if (r0 == null) {
            0qQ.A0F("igVideoPlayer");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.Ech(z);
        }
    }
}
