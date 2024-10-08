package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Wlk  reason: case insensitive filesystem */
public final class C20124Wlk implements Runnable {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ C14820UAz A01;

    public C20124Wlk(RecyclerView recyclerView, C14820UAz uAz) {
        this.A01 = uAz;
        this.A00 = recyclerView;
    }

    public final void run() {
        C14820UAz uAz = this.A01;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        uAz.A00 = ofFloat;
        ofFloat.addUpdateListener(new W4C(this.A00, uAz.A03));
        uAz.A00.setDuration(200);
        uAz.A00.start();
        uAz.A02 = false;
    }
}
