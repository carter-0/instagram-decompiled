package org.webrtc;

import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class SurfaceEglRenderer$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ CountDownLatch f$0;

    public /* synthetic */ SurfaceEglRenderer$$ExternalSyntheticLambda0(CountDownLatch countDownLatch) {
        this.f$0 = countDownLatch;
    }

    public final void run() {
        this.f$0.countDown();
    }
}
