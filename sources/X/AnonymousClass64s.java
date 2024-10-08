package X;

import androidx.compose.animation.core.SuspendAnimationKt;

/* renamed from: X.64s  reason: invalid class name */
public final class AnonymousClass64s extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C3025964g A01;
    public final /* synthetic */ C287955b5 A02;
    public final /* synthetic */ C287725af A03;
    public final /* synthetic */ Object A04;
    public final /* synthetic */ 0sP A05;
    public final /* synthetic */ 0rm A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass64s(C3025964g r2, C287955b5 r3, C287725af r4, Object obj, 0sP r6, 0rm r7, float f) {
        super(1);
        this.A06 = r7;
        this.A04 = obj;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = f;
        this.A05 = r6;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        0rm r3 = this.A06;
        Object obj2 = this.A04;
        C3025964g r15 = this.A01;
        C287805an CAq = r15.CAq();
        C287725af r6 = this.A03;
        Object C4T = r15.C4T();
        C287955b5 r2 = this.A02;
        C3026764v r5 = new C3026764v(r6, CAq, obj2, C4T, new AnonymousClass9L8(r2, 0), longValue, longValue);
        0sP r18 = this.A05;
        C287955b5 r17 = r2;
        SuspendAnimationKt.A05(r15, r5, r17, r18, this.A00, longValue);
        r3.A00 = r5;
        return C60340gF.A00;
    }
}
