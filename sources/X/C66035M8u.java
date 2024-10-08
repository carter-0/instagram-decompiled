package X;

import android.graphics.Bitmap;

/* renamed from: X.M8u  reason: case insensitive filesystem */
public final /* synthetic */ class C66035M8u implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C3256173i A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C66035M8u(Bitmap bitmap, C3256173i r2, String str) {
        this.A01 = r2;
        this.A00 = bitmap;
        this.A02 = str;
    }

    public final void run() {
        this.A01.DrA(this.A00, this.A02);
    }
}
