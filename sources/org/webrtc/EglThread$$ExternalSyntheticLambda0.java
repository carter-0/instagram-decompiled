package org.webrtc;

import org.webrtc.EglBase;

public final /* synthetic */ class EglThread$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ EglBase.EglConnection f$0;

    public /* synthetic */ EglThread$$ExternalSyntheticLambda0(EglBase.EglConnection eglConnection) {
        this.f$0 = eglConnection;
    }

    public final void run() {
        this.f$0.release();
    }
}
