package org.webrtc;

import java.util.concurrent.CountDownLatch;
import org.webrtc.EglRenderer;

public final /* synthetic */ class EglRenderer$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ EglRenderer f$0;
    public final /* synthetic */ CountDownLatch f$1;
    public final /* synthetic */ EglRenderer.RenderListener f$2;

    public /* synthetic */ EglRenderer$$ExternalSyntheticLambda4(EglRenderer eglRenderer, CountDownLatch countDownLatch, EglRenderer.RenderListener renderListener) {
        this.f$0 = eglRenderer;
        this.f$1 = countDownLatch;
        this.f$2 = renderListener;
    }

    public final void run() {
        this.f$0.m40lambda$removeRenderListener$3$orgwebrtcEglRenderer(this.f$1, this.f$2);
    }
}
