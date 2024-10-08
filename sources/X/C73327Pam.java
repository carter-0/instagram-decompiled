package X;

import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;

/* renamed from: X.Pam  reason: case insensitive filesystem */
public final class C73327Pam implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ImageView A01;
    public final /* synthetic */ C62320sa A02;

    public C73327Pam(View view, ImageView imageView, C62320sa r3) {
        this.A00 = view;
        this.A01 = imageView;
        this.A02 = r3;
    }

    public final void run() {
        C66581MXm.A0E(this.A00.animate().setInterpolator(new OvershootInterpolator(1.8f)).setStartDelay(125), 1.0f).withEndAction(new C73107PWo(this.A02));
        this.A01.setVisibility(8);
    }
}
