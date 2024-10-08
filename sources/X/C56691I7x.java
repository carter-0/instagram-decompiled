package X;

import android.animation.ValueAnimator;

/* renamed from: X.I7x  reason: case insensitive filesystem */
public final class C56691I7x implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C53155GjR A03;

    public C56691I7x(C53155GjR gjR, int i, int i2, int i3) {
        this.A03 = gjR;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float A002 = AnonymousClass7TH.A00(valueAnimator);
        C53155GjR gjR = this.A03;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        int A022 = 0nH.A02(A002, gjR.A02, this.A01);
        gjR.A0B.setTextColor(A022);
        gjR.A09.setColorFilter(A022);
        gjR.A07.setBackgroundColor(0nH.A02(A002, this.A02, this.A00));
    }
}
