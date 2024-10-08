package X;

import android.view.Surface;

/* renamed from: X.WmO  reason: case insensitive filesystem */
public final class C20164WmO implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ W8D A01;

    public C20164WmO(Surface surface, W8D w8d) {
        this.A00 = surface;
        this.A01 = w8d;
    }

    public final void run() {
        this.A00.release();
    }
}
