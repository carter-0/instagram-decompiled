package com.facebook.video.heroplayer.client;

import android.os.Bundle;
import android.os.ResultReceiver;

public class HeroClientResultReceiver extends ResultReceiver {
    public Runnable A00;

    public final void onReceiveResult(int i, Bundle bundle) {
        Runnable runnable = this.A00;
        if (runnable != null) {
            runnable.run();
        }
        this.A00 = null;
    }
}
