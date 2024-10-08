package X;

import android.animation.ValueAnimator;

public final class I81 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ 2V5 A02;
    public final /* synthetic */ 2V5 A03;
    public final /* synthetic */ 2V5 A04;
    public final /* synthetic */ 2V5 A05;
    public final /* synthetic */ 2V5 A06;
    public final /* synthetic */ AnonymousClass3z3 A07;

    public I81(2V5 r1, 2V5 r2, 2V5 r3, 2V5 r4, 2V5 r5, AnonymousClass3z3 r6, int i, int i2) {
        this.A02 = r1;
        this.A07 = r6;
        this.A01 = i;
        this.A06 = r2;
        this.A05 = r3;
        this.A03 = r4;
        this.A00 = i2;
        this.A04 = r5;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float A002 = AnonymousClass7TH.A00(valueAnimator);
        2V5 r1 = this.A02;
        AnonymousClass3z3 r0 = this.A07;
        int i = this.A01;
        AnonymousClass3z2 r5 = r0.A00;
        C51967G9n.A1A(r1, 1sx.A00(A002, r5.A01, i));
        C51967G9n.A1A(this.A06, 1sx.A00(A002, r5.A09, -1));
        C51967G9n.A1A(this.A05, 1sx.A00(A002, r5.A06, r5.A05));
        C51967G9n.A1A(this.A03, 1sx.A00(A002, this.A00, r5.A02));
        C51967G9n.A1A(this.A04, 1sx.A00(A002, r5.A04, i));
    }
}
