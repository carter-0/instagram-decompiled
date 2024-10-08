package org.webrtc;

import org.webrtc.EglThread;

public final /* synthetic */ class EglRenderer$$ExternalSyntheticLambda2 implements EglThread.RenderUpdate {
    public final /* synthetic */ EglRenderer f$0;
    public final /* synthetic */ VideoFrame f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ EglRenderer$$ExternalSyntheticLambda2(EglRenderer eglRenderer, VideoFrame videoFrame, long j) {
        this.f$0 = eglRenderer;
        this.f$1 = videoFrame;
        this.f$2 = j;
    }

    public final void update(boolean z) {
        this.f$0.m41lambda$swapBuffersOnRenderThread$6$orgwebrtcEglRenderer(this.f$1, this.f$2, z);
    }
}
