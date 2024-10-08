package X;

import android.graphics.Bitmap;

/* renamed from: X.Ih6  reason: case insensitive filesystem */
public final class C57827Ih6 implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ 0sP A01;

    public C57827Ih6(Bitmap bitmap, 0sP r2) {
        this.A01 = r2;
        this.A00 = bitmap;
    }

    public final void run() {
        0sP r1 = this.A01;
        Bitmap bitmap = this.A00;
        0qQ.A0A(bitmap);
        r1.invoke(bitmap);
    }
}
