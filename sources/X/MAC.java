package X;

import android.view.ViewPropertyAnimator;
import android.widget.ImageView;

public final class MAC implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ ImageView A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ boolean A06;

    public MAC(ImageView imageView, C62320sa r2, float f, int i, int i2, int i3, boolean z) {
        this.A04 = imageView;
        this.A01 = i;
        this.A06 = z;
        this.A00 = f;
        this.A02 = i2;
        this.A03 = i3;
        this.A05 = r2;
    }

    public final void run() {
        float f;
        float f2;
        ImageView imageView = this.A04;
        ViewPropertyAnimator duration = imageView.animate().rotation(((float) this.A01) * 30.0f).setDuration(450);
        if (this.A06) {
            f = this.A00;
            f2 = -f;
        } else {
            f = this.A00;
            f2 = ((float) this.A02) - f;
        }
        duration.x(f2).y(-(((float) this.A03) + f)).withEndAction(new C66007M7s(imageView, this.A05));
    }
}
