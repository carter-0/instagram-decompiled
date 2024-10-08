package X;

import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;

/* renamed from: X.Wou  reason: case insensitive filesystem */
public final class C20305Wou implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ AlphaAnimation A01;
    public final /* synthetic */ boolean A02;

    public C20305Wou(ViewGroup viewGroup, AlphaAnimation alphaAnimation, boolean z) {
        this.A00 = viewGroup;
        this.A01 = alphaAnimation;
        this.A02 = z;
    }

    public final void run() {
        ViewGroup viewGroup = this.A00;
        viewGroup.startAnimation(this.A01);
        viewGroup.setVisibility(DbW.A01(this.A02 ? 1 : 0));
    }
}
