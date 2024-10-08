package com.instagram.debug.devoptions.section.videodebug;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass4M3;
import android.widget.CompoundButton;

public final class VideoUtilityFragment$setAudioVolume$1 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ VideoUtilityFragment this$0;

    public VideoUtilityFragment$setAudioVolume$1(VideoUtilityFragment videoUtilityFragment) {
        this.this$0 = videoUtilityFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        float f;
        AnonymousClass4M3 r1 = this.this$0.igVideoPlayer;
        if (z) {
            if (r1 != null) {
                f = 0.5f;
            }
            0qQ.A0F("igVideoPlayer");
            throw AnonymousClass00P.createAndThrow();
        }
        if (r1 != null) {
            f = 0.0f;
        }
        0qQ.A0F("igVideoPlayer");
        throw AnonymousClass00P.createAndThrow();
        r1.Eqr(f, 1);
    }
}
