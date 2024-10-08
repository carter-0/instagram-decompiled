package com.instagram.debug.devoptions.section.videodebug;

import X.0qQ;
import X.AnonymousClass00P;
import X.C13988Tno;
import android.widget.TextView;

public final class VideoUtilityFragment$onTimeChanged$1 implements Runnable {
    public final /* synthetic */ int $newPosition;
    public final /* synthetic */ int $newSoundOnTime;
    public final /* synthetic */ int $newTime;
    public final /* synthetic */ VideoUtilityFragment this$0;

    public VideoUtilityFragment$onTimeChanged$1(VideoUtilityFragment videoUtilityFragment, int i, int i2, int i3) {
        this.this$0 = videoUtilityFragment;
        this.$newTime = i;
        this.$newPosition = i2;
        this.$newSoundOnTime = i3;
    }

    public final void run() {
        String str;
        TextView textView = this.this$0.prodTimeSpent;
        if (textView == null) {
            str = "prodTimeSpent";
        } else {
            C13988Tno.A15(textView, this.$newTime);
            VideoUtilityFragment videoUtilityFragment = this.this$0;
            int i = videoUtilityFragment.currentProdTotal + this.$newTime;
            videoUtilityFragment.currentProdTotal = i;
            TextView textView2 = videoUtilityFragment.prodTimeSpentTotal;
            if (textView2 == null) {
                str = "prodTimeSpentTotal";
            } else {
                C13988Tno.A15(textView2, i);
                TextView textView3 = this.this$0.prodLastPausePosition;
                if (textView3 == null) {
                    str = "prodLastPausePosition";
                } else {
                    C13988Tno.A15(textView3, this.$newPosition);
                    TextView textView4 = this.this$0.prodTimeSpentSoundOn;
                    if (textView4 == null) {
                        str = "prodTimeSpentSoundOn";
                    } else {
                        C13988Tno.A15(textView4, this.$newSoundOnTime);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
