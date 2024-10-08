package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.IiV  reason: case insensitive filesystem */
public final class C57914IiV implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C56010HrI A01;
    public final /* synthetic */ Runnable A02;

    public C57914IiV(C56010HrI hrI, Runnable runnable, int i) {
        this.A01 = hrI;
        this.A00 = i;
        this.A02 = runnable;
    }

    public final void run() {
        C56010HrI hrI = this.A01;
        View view = hrI.A03;
        int width = view.getWidth();
        int height = view.getHeight();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, (this.A00 * width) / 100});
        0qQ.A07(ofInt);
        ofInt.addUpdateListener(new C56686I7r(hrI, height, 2));
        Runnable runnable = this.A02;
        if (runnable != null) {
            ofInt.addListener(new C52775GcS(runnable, 2));
        }
        ofInt.setDuration(400);
        ofInt.start();
    }
}
