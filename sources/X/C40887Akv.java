package X;

import android.view.View;

/* renamed from: X.Akv  reason: case insensitive filesystem */
public final class C40887Akv implements Runnable {
    public final /* synthetic */ C357918a4 A00;

    public C40887Akv(C357918a4 r1) {
        this.A00 = r1;
    }

    public final void run() {
        C19500Wam wam = this.A00.A0Y;
        if (wam != null) {
            View view = wam.A05;
            view.setEnabled(true);
            view.setVisibility(0);
        }
    }
}
