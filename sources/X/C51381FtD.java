package X;

import android.view.View;

/* renamed from: X.FtD  reason: case insensitive filesystem */
public final class C51381FtD implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ E3V A01;

    public C51381FtD(View view, E3V e3v) {
        this.A01 = e3v;
        this.A00 = view;
    }

    public final void run() {
        this.A00.requestFocus();
    }
}
