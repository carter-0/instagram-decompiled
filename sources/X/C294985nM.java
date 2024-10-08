package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.5nM  reason: invalid class name and case insensitive filesystem */
public final class C294985nM extends C294975nL {
    public final int A00;
    public final ValueAnimator A01;

    public C294985nM(View view) {
        super(view);
        int integer = view.getResources().getInteger(17694721);
        this.A00 = integer;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A01 = valueAnimator;
        valueAnimator.setDuration((long) integer);
        C294995nN r0 = new C294995nN(this);
        valueAnimator.addUpdateListener(r0);
        valueAnimator.addListener(r0);
    }
}
