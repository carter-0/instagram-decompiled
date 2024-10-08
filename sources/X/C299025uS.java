package X;

import android.content.Context;

/* renamed from: X.5uS  reason: invalid class name and case insensitive filesystem */
public class C299025uS extends C273704n3 implements C299035uT {
    public C245663dH A00;
    public final 2UL A01 = new 2UL(this, 1KZ.A01);

    public final void CsJ() {
        C245863db.A00(this, this.A01);
    }

    public final void Dct(Long l) {
        C245863db.A02(this.A01, l);
    }

    public final void Dv5() {
        C245863db.A01(this.A01);
    }

    public final C245663dH getCurrentRenderTree() {
        return this.A00;
    }

    public 2UL getMountState() {
        return this.A01;
    }

    public final void offsetLeftAndRight(int i) {
        if (i != 0) {
            super.offsetLeftAndRight(i);
            CsJ();
        }
    }

    public final void offsetTopAndBottom(int i) {
        if (i != 0) {
            super.offsetTopAndBottom(i);
            CsJ();
        }
    }

    public final void onMeasure(int i, int i2) {
        C245663dH r0 = this.A00;
        if (r0 == null) {
            setMeasuredDimension(0, 0);
        } else {
            setMeasuredDimension(r0.A01(), r0.A00());
        }
    }

    public void setRenderTree(C245663dH r2) {
        if (this.A00 != r2) {
            if (r2 == null) {
                this.A01.A0C();
            }
            this.A00 = r2;
            requestLayout();
        }
    }

    public void setRenderTreeUpdateListener(C232612u4 r2) {
        this.A01.A0G(r2);
    }

    public C299025uS(Context context) {
        super(context);
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(1115170156);
        super.onAttachedToWindow();
        this.A01.A0A();
        AnonymousClass0fD.A0D(-1519291372, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(-2004419988);
        super.onDetachedFromWindow();
        this.A01.A0B();
        AnonymousClass0fD.A0D(1180704309, A06);
    }

    public void setTranslationX(float f) {
        if (f != getTranslationX()) {
            super.setTranslationX(f);
            CsJ();
        }
    }

    public void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            CsJ();
        }
    }
}
