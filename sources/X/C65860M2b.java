package X;

import android.view.View;

/* renamed from: X.M2b  reason: case insensitive filesystem */
public final class C65860M2b implements Runnable {
    public final /* synthetic */ View A00;

    public C65860M2b(View view) {
        this.A00 = view;
    }

    public final void run() {
        this.A00.animate().scaleX(1.0f).scaleY(1.0f).setDuration(120).start();
    }
}
