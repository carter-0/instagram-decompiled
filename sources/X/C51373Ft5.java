package X;

import android.app.Activity;

/* renamed from: X.Ft5  reason: case insensitive filesystem */
public final class C51373Ft5 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass5Gv A01;

    public C51373Ft5(Activity activity, AnonymousClass5Gv r2) {
        this.A00 = activity;
        this.A01 = r2;
    }

    public final void run() {
        Activity activity = this.A00;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            this.A01.A06();
        }
    }
}
