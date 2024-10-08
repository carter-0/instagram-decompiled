package X;

import android.graphics.Bitmap;

/* renamed from: X.Anb  reason: case insensitive filesystem */
public final class C41053Anb implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ B23 A01;

    public C41053Anb(Bitmap bitmap, B23 b23) {
        this.A00 = bitmap;
        this.A01 = b23;
    }

    public final void run() {
        Bitmap bitmap = this.A00;
        B23 b23 = this.A01;
        if (bitmap != null) {
            b23.DH0(bitmap);
        } else {
            b23.DH1();
        }
    }
}
