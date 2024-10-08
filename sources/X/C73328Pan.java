package X;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;

/* renamed from: X.Pan  reason: case insensitive filesystem */
public final class C73328Pan implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ImageView A01;
    public final /* synthetic */ C62320sa A02;

    public C73328Pan(View view, ImageView imageView, C62320sa r3) {
        this.A00 = view;
        this.A01 = imageView;
        this.A02 = r3;
    }

    public final void run() {
        AnonymousClass2S0.A01.A04();
        View view = this.A00;
        view.animate().scaleX(0.7f).scaleY(0.7f);
        ImageView imageView = this.A01;
        C66581MXm.A0E(imageView.animate(), 0.0f).alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setDuration(250).withEndAction(new C73327Pam(view, imageView, this.A02));
    }
}
