package X;

import android.widget.ImageView;

/* renamed from: X.M7s  reason: case insensitive filesystem */
public final class C66007M7s implements Runnable {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C62320sa A01;

    public C66007M7s(ImageView imageView, C62320sa r2) {
        this.A00 = imageView;
        this.A01 = r2;
    }

    public final void run() {
        ImageView imageView = this.A00;
        imageView.setVisibility(8);
        imageView.setRotation(0.0f);
        this.A01.invoke();
    }
}
