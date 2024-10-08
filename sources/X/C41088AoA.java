package X;

import android.animation.ValueAnimator;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.AoA  reason: case insensitive filesystem */
public final class C41088AoA implements Runnable {
    public final /* synthetic */ IgTextView A00;
    public final /* synthetic */ AJ9 A01;

    public C41088AoA(IgTextView igTextView, AJ9 aj9) {
        this.A01 = aj9;
        this.A00 = igTextView;
    }

    public final void run() {
        AJ9 aj9 = this.A01;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        IgTextView igTextView = this.A00;
        ofFloat.addUpdateListener(new AJX(igTextView, 11));
        ofFloat.addListener(new C56678I7i(igTextView, 6));
        ofFloat.setDuration(50);
        ofFloat.start();
        aj9.A02 = ofFloat;
    }
}
