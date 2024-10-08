package X;

import android.widget.ImageView;

/* renamed from: X.PWn  reason: case insensitive filesystem */
public final class C73106PWn implements Runnable {
    public final /* synthetic */ ImageView A00;

    public C73106PWn(ImageView imageView) {
        this.A00 = imageView;
    }

    public final void run() {
        ImageView imageView = this.A00;
        imageView.setScaleX(0.5f);
        imageView.setScaleY(0.5f);
        imageView.setAlpha(0.5f);
        imageView.setVisibility(0);
    }
}
