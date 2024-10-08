package X;

import android.os.Bundle;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.TJg  reason: case insensitive filesystem */
public final class C13050TJg implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ Callback A01;
    public final /* synthetic */ C11184SEk A02;
    public final /* synthetic */ DialogModule A03;

    public C13050TJg(Bundle bundle, Callback callback, C11184SEk sEk, DialogModule dialogModule) {
        this.A03 = dialogModule;
        this.A02 = sEk;
        this.A00 = bundle;
        this.A01 = callback;
    }

    public final void run() {
        SVH svh;
        C11184SEk sEk = this.A02;
        Bundle bundle = this.A00;
        Callback callback = this.A01;
        C11184SEk.A00(sEk);
        if (callback != null) {
            svh = new SVH(callback, sEk.A02);
        } else {
            svh = null;
        }
        C14763U7u u7u = new C14763U7u(bundle, svh);
        if (sEk.A02.mIsInForeground) {
            0hq r2 = sEk.A01;
            if (!r2.A12()) {
                if (bundle.containsKey(DialogModule.KEY_CANCELABLE)) {
                    u7u.A0D(bundle.getBoolean(DialogModule.KEY_CANCELABLE));
                }
                u7u.A0B(r2, DialogModule.FRAGMENT_TAG);
                return;
            }
        }
        sEk.A00 = u7u;
    }
}
