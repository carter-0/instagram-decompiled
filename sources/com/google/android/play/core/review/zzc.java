package com.google.android.play.core.review;

import X.C365498nD;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

public final class zzc extends ResultReceiver {
    public final /* synthetic */ C365498nD A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzc(Handler handler, C365498nD r2) {
        super(handler);
        this.A00 = r2;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        this.A00.A00.A0F((Object) null);
    }
}
