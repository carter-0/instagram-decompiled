package X;

import android.graphics.Bitmap;

/* renamed from: X.Wlo  reason: case insensitive filesystem */
public final class C20128Wlo implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C17813VgQ A01;

    public C20128Wlo(Bitmap bitmap, C17813VgQ vgQ) {
        this.A01 = vgQ;
        this.A00 = bitmap;
    }

    public final void run() {
        this.A01.A00.D15(this.A00, "MediaPipelineController");
    }
}
