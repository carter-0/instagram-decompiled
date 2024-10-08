package org.webrtc;

import java.util.concurrent.Callable;
import org.webrtc.EglBase;

public final /* synthetic */ class EglThread$$ExternalSyntheticLambda2 implements Callable {
    public final /* synthetic */ EglBase.Context f$0;
    public final /* synthetic */ int[] f$1;

    public /* synthetic */ EglThread$$ExternalSyntheticLambda2(EglBase.Context context, int[] iArr) {
        this.f$0 = context;
        this.f$1 = iArr;
    }

    public final Object call() {
        return EglThread.lambda$create$0(this.f$0, this.f$1);
    }
}
