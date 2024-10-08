package X;

import android.animation.ValueAnimator;

/* renamed from: X.Io7  reason: case insensitive filesystem */
public final class C58203Io7 extends 0Yg implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C243673Zt A01;
    public final /* synthetic */ 2Wa A02;
    public final /* synthetic */ 2Wa A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58203Io7(C243673Zt r2, 2Wa r3, 2Wa r4, int i, boolean z) {
        super(0);
        this.A01 = r2;
        this.A04 = z;
        this.A03 = r3;
        this.A00 = i;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C243673Zt r7 = this.A01;
        C51973G9u.A18(r7);
        float[] A1b = C51965G9l.A1b();
        // fill-array-data instruction
        A1b[0] = 0;
        A1b[1] = 1065353216;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
        boolean z = this.A04;
        2Wa r4 = this.A03;
        int i = this.A00;
        2Wa r2 = this.A02;
        ofFloat.setDuration(400);
        ofFloat.setStartDelay(1000);
        ofFloat.addListener(new I7f(r4, r2, i, z));
        r7.A00(ofFloat);
        return C51965G9l.A0V(C58705IwE.A01(r7, 31));
    }
}
