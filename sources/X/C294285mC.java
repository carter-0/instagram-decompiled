package X;

import androidx.compose.animation.core.SuspendAnimationKt;

/* renamed from: X.5mC  reason: invalid class name and case insensitive filesystem */
public final class C294285mC extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C3025964g A01;
    public final /* synthetic */ C287955b5 A02;
    public final /* synthetic */ 0sP A03;
    public final /* synthetic */ 0rm A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C294285mC(C3025964g r2, C287955b5 r3, 0sP r4, 0rm r5, float f) {
        super(1);
        this.A04 = r5;
        this.A00 = f;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.A04.A00;
        0qQ.A0A(obj2);
        float f = this.A00;
        SuspendAnimationKt.A05(this.A01, (C3026764v) obj2, this.A02, this.A03, f, longValue);
        return C60340gF.A00;
    }
}
