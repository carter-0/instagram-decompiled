package X;

import android.view.View;

/* renamed from: X.FtZ  reason: case insensitive filesystem */
public final class C51403FtZ implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C62320sa A01;

    public C51403FtZ(View view, C62320sa r2) {
        this.A00 = view;
        this.A01 = r2;
    }

    public final void run() {
        View view = this.A00;
        view.postDelayed(new C51402FtY(view, this.A01), 900);
    }
}
