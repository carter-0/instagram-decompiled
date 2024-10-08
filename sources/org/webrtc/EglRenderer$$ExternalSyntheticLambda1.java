package org.webrtc;

import java.util.concurrent.CountDownLatch;
import org.webrtc.EglRenderer;

public final /* synthetic */ class EglRenderer$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ EglRenderer f$0;
    public final /* synthetic */ CountDownLatch f$1;
    public final /* synthetic */ EglRenderer.FrameListener f$2;

    public /* synthetic */ EglRenderer$$ExternalSyntheticLambda1(EglRenderer eglRenderer, CountDownLatch countDownLatch, EglRenderer.FrameListener frameListener) {
        this.f$0 = eglRenderer;
        this.f$1 = countDownLatch;
        this.f$2 = frameListener;
    }

    public final void run() {
        this.f$0.m39lambda$removeFrameListener$2$orgwebrtcEglRenderer(this.f$1, this.f$2);
    }
}
