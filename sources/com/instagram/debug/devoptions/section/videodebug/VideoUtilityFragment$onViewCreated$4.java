package com.instagram.debug.devoptions.section.videodebug;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass4M3;
import android.view.View;
import android.widget.SeekBar;

public final class VideoUtilityFragment$onViewCreated$4 implements View.OnClickListener {
    public final /* synthetic */ VideoUtilityFragment this$0;

    public VideoUtilityFragment$onViewCreated$4(VideoUtilityFragment videoUtilityFragment) {
        this.this$0 = videoUtilityFragment;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(1589182160);
        VideoUtilityFragment videoUtilityFragment = this.this$0;
        AnonymousClass4M3 r2 = videoUtilityFragment.igVideoPlayer;
        if (r2 == null) {
            str = "igVideoPlayer";
        } else {
            SeekBar seekBar = videoUtilityFragment.debugSeekBar;
            if (seekBar == null) {
                str = "debugSeekBar";
            } else {
                r2.EKy(Math.max(seekBar.getProgress() - 60000, 0), true);
                AnonymousClass0fD.A0C(-706981515, A05);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
