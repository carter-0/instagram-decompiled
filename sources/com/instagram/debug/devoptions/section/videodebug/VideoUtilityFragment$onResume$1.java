package com.instagram.debug.devoptions.section.videodebug;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass4M1;
import X.AnonymousClass4M3;
import android.widget.TextView;

public final class VideoUtilityFragment$onResume$1 implements Runnable {
    public final /* synthetic */ VideoUtilityFragment this$0;

    public VideoUtilityFragment$onResume$1(VideoUtilityFragment videoUtilityFragment) {
        this.this$0 = videoUtilityFragment;
    }

    public void run() {
        String str;
        VideoUtilityFragment videoUtilityFragment = this.this$0;
        TextView textView = videoUtilityFragment.currentStatus;
        if (textView == null) {
            str = "currentStatus";
        } else {
            AnonymousClass4M3 r0 = videoUtilityFragment.igVideoPlayer;
            if (r0 != null) {
                textView.setText(((AnonymousClass4M1) r0).A0M.toString());
                VideoUtilityFragment videoUtilityFragment2 = this.this$0;
                TextView textView2 = videoUtilityFragment2.currentVolume;
                if (textView2 == null) {
                    str = "currentVolume";
                } else {
                    AnonymousClass4M3 r02 = videoUtilityFragment2.igVideoPlayer;
                    if (r02 != null) {
                        textView2.setText(String.valueOf(((AnonymousClass4M1) r02).A02));
                        this.this$0.mainHandler.postDelayed(this, 200);
                        return;
                    }
                }
            }
            0qQ.A0F("igVideoPlayer");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
