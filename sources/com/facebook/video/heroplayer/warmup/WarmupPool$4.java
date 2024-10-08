package com.facebook.video.heroplayer.warmup;

import X.274;
import X.2BM;
import X.AnonymousClass4OL;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

public class WarmupPool$4 extends ResultReceiver {
    public final /* synthetic */ AnonymousClass4OL A00;
    public final /* synthetic */ 274 A01;
    public final /* synthetic */ 2BM A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WarmupPool$4(AnonymousClass4OL r2, 274 r3, 2BM r4) {
        super((Handler) null);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        274 r4 = this.A01;
        AnonymousClass4OL r3 = this.A00;
        r4.A09(r3.A01, false);
        r3.A02();
    }
}
