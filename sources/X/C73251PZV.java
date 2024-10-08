package X;

import android.view.View;

/* renamed from: X.PZV  reason: case insensitive filesystem */
public final class C73251PZV implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C62320sa A01;

    public C73251PZV(View view, C62320sa r2) {
        this.A00 = view;
        this.A01 = r2;
    }

    public final void run() {
        View view = this.A00;
        view.setVisibility(8);
        this.A01.invoke();
        JTR.A1B(view);
    }
}
