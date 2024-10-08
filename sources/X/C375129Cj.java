package X;

import com.facebook.mobileboost.apps.common.AppStatusListener;

/* renamed from: X.9Cj  reason: invalid class name and case insensitive filesystem */
public final class C375129Cj implements Runnable {
    public final /* synthetic */ AppStatusListener A00;

    public C375129Cj(AppStatusListener appStatusListener) {
        this.A00 = appStatusListener;
    }

    public final void run() {
        AppStatusListener appStatusListener = this.A00;
        appStatusListener.A04.set(true);
        for (C64171Ho ABY : appStatusListener.A05) {
            ABY.ABY();
        }
    }
}
