package org.webrtc;

import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class VideoFileRenderer$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ VideoFileRenderer f$0;
    public final /* synthetic */ CountDownLatch f$1;

    public /* synthetic */ VideoFileRenderer$$ExternalSyntheticLambda0(VideoFileRenderer videoFileRenderer, CountDownLatch countDownLatch) {
        this.f$0 = videoFileRenderer;
        this.f$1 = countDownLatch;
    }

    public final void run() {
        this.f$0.m60lambda$release$2$orgwebrtcVideoFileRenderer(this.f$1);
    }
}
