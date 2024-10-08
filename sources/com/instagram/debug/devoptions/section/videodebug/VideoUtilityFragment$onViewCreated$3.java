package com.instagram.debug.devoptions.section.videodebug;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass4M3;
import android.view.View;
import android.widget.SeekBar;

public final class VideoUtilityFragment$onViewCreated$3 implements View.OnClickListener {
    public final /* synthetic */ VideoUtilityFragment this$0;

    public VideoUtilityFragment$onViewCreated$3(VideoUtilityFragment videoUtilityFragment) {
        this.this$0 = videoUtilityFragment;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(-507532222);
        VideoUtilityFragment videoUtilityFragment = this.this$0;
        AnonymousClass4M3 r3 = videoUtilityFragment.igVideoPlayer;
        if (r3 == null) {
            str = "igVideoPlayer";
        } else {
            SeekBar seekBar = videoUtilityFragment.debugSeekBar;
            str = "debugSeekBar";
            if (seekBar != null) {
                int progress = seekBar.getProgress() + 60000;
                SeekBar seekBar2 = this.this$0.debugSeekBar;
                if (seekBar2 != null) {
                    r3.EKy(Math.min(progress, seekBar2.getMax()), true);
                    AnonymousClass0fD.A0C(1938340238, A05);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
