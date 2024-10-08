package X;

import android.app.Activity;
import android.view.Window;

/* renamed from: X.PXy  reason: case insensitive filesystem */
public final class C73163PXy implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ boolean A01;

    public C73163PXy(Activity activity, boolean z) {
        this.A00 = activity;
        this.A01 = z;
    }

    public final void run() {
        Window window = this.A00.getWindow();
        if (window != null) {
            C69718Nqe.A00(window, this.A01);
        }
    }
}
