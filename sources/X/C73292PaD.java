package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.PaD  reason: case insensitive filesystem */
public final class C73292PaD implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ OHG A02;

    public C73292PaD(Bitmap bitmap, Bitmap bitmap2, OHG ohg) {
        this.A00 = bitmap;
        this.A01 = bitmap2;
        this.A02 = ohg;
    }

    public final void run() {
        ImageView imageView;
        ImageView imageView2;
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            OHG ohg = this.A02;
            Bitmap A05 = 1MF.A05(bitmap);
            if (!(A05 == null || (imageView2 = ohg.A02) == null)) {
                imageView2.setImageBitmap(A05);
            }
        }
        Bitmap bitmap2 = this.A01;
        if (bitmap2 != null) {
            OHG ohg2 = this.A02;
            Bitmap A052 = 1MF.A05(bitmap2);
            if (A052 != null && (imageView = ohg2.A01) != null) {
                imageView.setImageBitmap(A052);
            }
        }
    }
}
