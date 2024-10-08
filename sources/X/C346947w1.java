package X;

import android.app.Dialog;

/* renamed from: X.7w1  reason: invalid class name and case insensitive filesystem */
public final class C346947w1 implements Runnable {
    public final /* synthetic */ C352098Br A00;

    public C346947w1(C352098Br r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass0eM r1 = this.A00.A02;
        if (((Dialog) r1.getValue()).isShowing()) {
            ((Dialog) r1.getValue()).dismiss();
        }
    }
}
