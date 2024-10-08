package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.Wit  reason: case insensitive filesystem */
public final class C19982Wit implements Runnable {
    public final /* synthetic */ W2i A00;

    public C19982Wit(W2i w2i) {
        this.A00 = w2i;
    }

    public final void run() {
        W2i w2i = this.A00;
        ImageView imageView = w2i.A02;
        if (imageView != null) {
            imageView.setImageBitmap((Bitmap) null);
            ImageView imageView2 = w2i.A02;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
                return;
            }
        }
        0qQ.A0F("instructionImageView");
        throw AnonymousClass00P.createAndThrow();
    }
}
