package X;

import android.content.Context;

/* renamed from: X.4n2  reason: invalid class name and case insensitive filesystem */
public final class C273694n2 extends C273704n3 implements 2UA {
    public static final int[] A01 = new int[2];
    public final C14118TqD A00 = new C14118TqD(this);

    public final void CsJ() {
        this.A00.CsJ();
    }

    public final void Dct(Long l) {
        this.A00.Dct(l);
    }

    public final void Dv5() {
        this.A00.Dv5();
    }

    public C14118TqD getRootHostDelegate() {
        return this.A00;
    }

    public final void onMeasure(int i, int i2) {
        C14118TqD tqD = this.A00;
        long A002 = C244873bt.A00(i, i2);
        int[] iArr = A01;
        0qQ.A0B(iArr, 1);
        if (!C245073cH.A08(A002) || !C245073cH.A07(A002)) {
            AnonymousClass6NZ r0 = tqD.A00;
            if (r0 != null) {
                r0.A04(A002, iArr);
                tqD.A02 = false;
            } else {
                super.onMeasure(i, i2);
                return;
            }
        } else {
            tqD.A02 = true;
            iArr[0] = C245073cH.A01(A002);
            iArr[1] = C245073cH.A00(A002);
        }
        setMeasuredDimension(iArr[0], iArr[1]);
    }

    public void setRenderState(AnonymousClass6NZ r4) {
        C245663dH r0;
        C14118TqD tqD = this.A00;
        if (!0qQ.A0K(tqD.A00, r4)) {
            AnonymousClass6NZ r1 = tqD.A00;
            if (r1 != null) {
                r1.A02 = null;
            }
            tqD.A00 = r4;
            if (r4 != null) {
                C14118TqD tqD2 = r4.A02;
                if (tqD2 == null || tqD2.equals(tqD)) {
                    r4.A02 = tqD;
                    r0 = r4.A01;
                } else {
                    throw new RuntimeException("Must detach from previous host listener first");
                }
            } else {
                r0 = null;
            }
            tqD.A00(r0);
        }
    }

    public void setRenderTreeUpdateListener(C232612u4 r2) {
        this.A00.setRenderTreeUpdateListener(r2);
    }

    public C273694n2(Context context) {
        super(context);
    }

    public final void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
        CsJ();
    }

    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        CsJ();
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(1522178918);
        super.onAttachedToWindow();
        this.A00.A03.A0A();
        AnonymousClass0fD.A0D(-2142187806, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(-1729796356);
        super.onDetachedFromWindow();
        this.A00.A03.A0B();
        AnonymousClass0fD.A0D(1596863422, A06);
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        CsJ();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        CsJ();
    }
}
