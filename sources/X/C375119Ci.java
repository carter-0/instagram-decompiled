package X;

import com.facebook.mobileboost.apps.common.AppStatusListener;

/* renamed from: X.9Ci  reason: invalid class name and case insensitive filesystem */
public final class C375119Ci implements Runnable {
    public final /* synthetic */ AppStatusListener A00;

    public C375119Ci(AppStatusListener appStatusListener) {
        this.A00 = appStatusListener;
    }

    public final void run() {
        for (C64171Ho ABZ : this.A00.A05) {
            ABZ.ABZ();
        }
    }
}
