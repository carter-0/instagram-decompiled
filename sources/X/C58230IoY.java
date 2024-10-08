package X;

import android.animation.ValueAnimator;
import android.view.animation.OvershootInterpolator;

/* renamed from: X.IoY  reason: case insensitive filesystem */
public final class C58230IoY extends 0Yg implements C62320sa {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58230IoY(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, float f, int i, int i2) {
        super(0);
        this.A01 = i2;
        this.A07 = obj;
        this.A05 = obj2;
        this.A03 = obj3;
        this.A02 = i;
        this.A00 = f;
        this.A04 = obj4;
        this.A06 = obj5;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C62320sa wxR;
        long j;
        long j2;
        int i = this.A01;
        Object obj = this.A07;
        if (i != 0) {
            C53928GwY gwY = (C53928GwY) obj;
            OvershootInterpolator overshootInterpolator = C53928GwY.A0r;
            if (gwY.A0A && gwY.A0D) {
                C243673Zt r4 = (C243673Zt) this.A05;
                AnonymousClass2VL.A00();
                if (AnonymousClass7TE.A1a(r4.A00)) {
                    ((2V5) this.A03).A00(C53928GwY.A00(this.A00, this.A02, 0, 0, false, false));
                } else {
                    C243673Zt r3 = (C243673Zt) this.A04;
                    C51973G9u.A18(r3);
                    float[] A1b = C51965G9l.A1b();
                    // fill-array-data instruction
                    A1b[0] = 1065353216;
                    A1b[1] = 0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
                    int i2 = this.A02;
                    Object obj2 = this.A06;
                    Object obj3 = this.A03;
                    float f = this.A00;
                    if (gwY.A0E) {
                        j2 = 300;
                    } else {
                        j2 = 0;
                    }
                    ofFloat.setDuration(j2);
                    ofFloat.addUpdateListener(new C56692I7y(obj2, obj3, gwY, f, i2, 1));
                    C56678I7i.A00(ofFloat, r4, 14);
                    ofFloat.start();
                    r3.A00(ofFloat);
                }
            }
            wxR = new C58703IwC(this.A04, 5);
        } else {
            C52646GaK gaK = (C52646GaK) obj;
            OvershootInterpolator overshootInterpolator2 = C52646GaK.A0u;
            if (gaK.A0A && gaK.A0D) {
                C243673Zt r42 = (C243673Zt) this.A05;
                AnonymousClass2VL.A00();
                if (AnonymousClass7TE.A1a(r42.A00)) {
                    ((2V5) this.A03).A00(C52646GaK.A00(this.A00, this.A02, 0, 0, false, false));
                } else {
                    C243673Zt r32 = (C243673Zt) this.A04;
                    C51973G9u.A18(r32);
                    float[] A1b2 = C51965G9l.A1b();
                    // fill-array-data instruction
                    A1b2[0] = 1065353216;
                    A1b2[1] = 0;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(A1b2);
                    int i3 = this.A02;
                    Object obj4 = this.A06;
                    Object obj5 = this.A03;
                    float f2 = this.A00;
                    if (gaK.A0E) {
                        j = 300;
                    } else {
                        j = 0;
                    }
                    ofFloat2.setDuration(j);
                    ofFloat2.addUpdateListener(new C56692I7y(obj4, obj5, gaK, f2, i3, 0));
                    C56678I7i.A00(ofFloat2, r42, 8);
                    ofFloat2.start();
                    r32.A00(ofFloat2);
                }
            }
            wxR = new C20695WxR(this.A04, 17);
        }
        return C51965G9l.A0V(wxR);
    }
}
