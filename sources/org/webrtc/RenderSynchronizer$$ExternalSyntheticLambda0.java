package org.webrtc;

import android.view.Choreographer;

public final /* synthetic */ class RenderSynchronizer$$ExternalSyntheticLambda0 implements Choreographer.FrameCallback {
    public final /* synthetic */ RenderSynchronizer f$0;

    public /* synthetic */ RenderSynchronizer$$ExternalSyntheticLambda0(RenderSynchronizer renderSynchronizer) {
        this.f$0 = renderSynchronizer;
    }

    public final void doFrame(long j) {
        this.f$0.onDisplayRefreshCycleBegin(j);
    }
}
