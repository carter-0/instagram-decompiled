package X;

import android.view.Window;

/* renamed from: X.PYV  reason: case insensitive filesystem */
public final class C73191PYV implements Runnable {
    public final /* synthetic */ Window A00;
    public final /* synthetic */ NVX A01;

    public C73191PYV(Window window, NVX nvx) {
        this.A00 = window;
        this.A01 = nvx;
    }

    public final void run() {
        this.A00.setSoftInputMode(16);
        NVX nvx = this.A01;
        nvx.A03().requestFocus();
        0nA.A0R(nvx.A03());
    }
}
