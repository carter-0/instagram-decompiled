package X;

import android.view.Window;

/* renamed from: X.PYU  reason: case insensitive filesystem */
public final class C73190PYU implements Runnable {
    public final /* synthetic */ Window A00;
    public final /* synthetic */ NVX A01;

    public C73190PYU(Window window, NVX nvx) {
        this.A00 = window;
        this.A01 = nvx;
    }

    public final void run() {
        this.A00.setSoftInputMode(0);
        NVX nvx = this.A01;
        nvx.A03().clearFocus();
        0nA.A0N(nvx.A03());
    }
}
