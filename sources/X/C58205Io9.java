package X;

import android.animation.ValueAnimator;

/* renamed from: X.Io9  reason: case insensitive filesystem */
public final class C58205Io9 extends 0Yg implements C62320sa {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58205Io9(int i, long j, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i;
        this.A04 = obj;
        this.A01 = j;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                return C307996Sh.A04.A03((C244943c0) this.A04, (C276544tV) this.A02, ((C276694tk) this.A03).A03, this.A01);
            case 1:
                C56603I4c i4c = (C56603I4c) this.A04;
                i4c.A06 = false;
                i4c.A09.A01(AnonymousClass30M.A06(AnonymousClass30J.MILLISECONDS, AnonymousClass49C.A01.A00(this.A01)), ((C53249Gkx) this.A02).A06, true);
                DbS.A1U(this.A03);
                return C60340gF.A00;
            default:
                C243673Zt r7 = (C243673Zt) this.A02;
                C51973G9u.A18(r7);
                float[] A1b = C51965G9l.A1b();
                // fill-array-data instruction
                A1b[0] = 0;
                A1b[1] = 1065353216;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
                long j = this.A01;
                Object obj = this.A03;
                ofFloat.setDuration(300);
                ofFloat.addListener(new C56671I7a((2Wa) this.A04, j));
                C56678I7i.A00(ofFloat, obj, 11);
                ofFloat.start();
                r7.A00(ofFloat);
                return C51965G9l.A0V(C58705IwE.A01(r7, 43));
        }
    }
}
