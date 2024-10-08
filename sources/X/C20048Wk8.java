package X;

import android.view.View;

/* renamed from: X.Wk8  reason: case insensitive filesystem */
public final class C20048Wk8 implements Runnable {
    public final /* synthetic */ C18739VzK A00;

    public C20048Wk8(C18739VzK vzK) {
        this.A00 = vzK;
    }

    public final void run() {
        C18739VzK vzK = this.A00;
        U17 u17 = vzK.A07;
        View view = vzK.A05;
        u17.setBounds(0, 0, view.getWidth(), view.getHeight());
        Runnable runnable = vzK.A02;
        if (runnable != null) {
            runnable.run();
        }
        vzK.A02 = null;
    }
}
