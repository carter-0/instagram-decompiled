package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;

/* renamed from: X.PbW  reason: case insensitive filesystem */
public final class C73373PbW implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ImageView A02;
    public final /* synthetic */ C62320sa A03;

    public C73373PbW(Bitmap bitmap, View view, ImageView imageView, C62320sa r4) {
        this.A02 = imageView;
        this.A01 = view;
        this.A00 = bitmap;
        this.A03 = r4;
    }

    public final void run() {
        ImageView imageView = this.A02;
        View view = this.A01;
        Bitmap bitmap = this.A00;
        C62320sa r3 = this.A03;
        int measuredWidth = imageView.getMeasuredWidth();
        Rect A0W = AnonymousClass7TE.A0W();
        view.getLocalVisibleRect(A0W);
        float f = (float) measuredWidth;
        imageView.setY(((float) A0W.bottom) + (2.0f * f));
        imageView.setVisibility(8);
        imageView.clearAnimation();
        imageView.setImageBitmap(bitmap);
        C66581MXm.A0E(imageView.animate().y(A0W.exactCenterY() - (f * 0.1f)), 1.0f).alpha(1.0f).setInterpolator(new OvershootInterpolator(1.8f)).setDuration(500).setStartDelay(150).withStartAction(new C73106PWn(imageView)).withEndAction(new C73328Pan(view, imageView, r3));
    }
}
