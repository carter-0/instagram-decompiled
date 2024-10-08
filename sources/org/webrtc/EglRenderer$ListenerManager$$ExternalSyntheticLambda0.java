package org.webrtc;

import java.util.concurrent.CountDownLatch;
import org.webrtc.EglRenderer;

public final /* synthetic */ class EglRenderer$ListenerManager$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ EglRenderer.ListenerManager f$0;
    public final /* synthetic */ CountDownLatch f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ EglRenderer$ListenerManager$$ExternalSyntheticLambda0(EglRenderer.ListenerManager listenerManager, CountDownLatch countDownLatch, Object obj) {
        this.f$0 = listenerManager;
        this.f$1 = countDownLatch;
        this.f$2 = obj;
    }

    public final void run() {
        this.f$0.m43lambda$removeListener$1$orgwebrtcEglRenderer$ListenerManager(this.f$1, this.f$2);
    }
}
