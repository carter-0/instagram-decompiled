package com.instagram.debug.devoptions.section.videodebug;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass4M3;

public final class VideoUtilityFragment$onViewCreated$7$onProgressChanged$1 implements Runnable {
    public final /* synthetic */ int $progress;
    public final /* synthetic */ VideoUtilityFragment this$0;

    public VideoUtilityFragment$onViewCreated$7$onProgressChanged$1(VideoUtilityFragment videoUtilityFragment, int i) {
        this.this$0 = videoUtilityFragment;
        this.$progress = i;
    }

    public final void run() {
        AnonymousClass4M3 r2 = this.this$0.igVideoPlayer;
        if (r2 == null) {
            0qQ.A0F("igVideoPlayer");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r2.EKy(this.$progress, true);
        }
    }
}
