package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.PYK  reason: case insensitive filesystem */
public final class C73180PYK implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ OHG A01;

    public C73180PYK(Bitmap bitmap, OHG ohg) {
        this.A01 = ohg;
        this.A00 = bitmap;
    }

    public final void run() {
        ImageView imageView = this.A01.A03;
        if (imageView != null) {
            imageView.setImageBitmap(this.A00);
        }
    }
}
