package com.instagram.debug.devoptions.section.videodebug;

import X.0qQ;
import X.AnonymousClass00P;
import android.widget.TextView;

public final class VideoUtilityFragment$onSnaplTimeChanged$1 implements Runnable {
    public final /* synthetic */ long $newPosition;
    public final /* synthetic */ long $newSoundOnTime;
    public final /* synthetic */ long $newTime;
    public final /* synthetic */ VideoUtilityFragment this$0;

    public VideoUtilityFragment$onSnaplTimeChanged$1(VideoUtilityFragment videoUtilityFragment, long j, long j2, long j3) {
        this.this$0 = videoUtilityFragment;
        this.$newTime = j;
        this.$newPosition = j2;
        this.$newSoundOnTime = j3;
    }

    public final void run() {
        String str;
        TextView textView = this.this$0.snaplTimeSpent;
        if (textView == null) {
            str = "snaplTimeSpent";
        } else {
            textView.setText(String.valueOf(this.$newTime));
            VideoUtilityFragment videoUtilityFragment = this.this$0;
            long j = videoUtilityFragment.currentSnaplTotal + this.$newTime;
            videoUtilityFragment.currentSnaplTotal = j;
            TextView textView2 = videoUtilityFragment.snaplTimeSpentTotal;
            if (textView2 == null) {
                str = "snaplTimeSpentTotal";
            } else {
                textView2.setText(String.valueOf(j));
                TextView textView3 = this.this$0.snaplLastPausePosition;
                if (textView3 == null) {
                    str = "snaplLastPausePosition";
                } else {
                    textView3.setText(String.valueOf(this.$newPosition));
                    TextView textView4 = this.this$0.snaplTimeSpentSoundOn;
                    if (textView4 == null) {
                        str = "snaplTimeSpentSoundOn";
                    } else {
                        textView4.setText(String.valueOf(this.$newSoundOnTime));
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
