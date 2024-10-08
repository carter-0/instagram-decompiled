package X;

import android.content.Context;

/* renamed from: X.UTr  reason: case insensitive filesystem */
public final class C15166UTr extends C273704n3 implements 2UA {
    public C20880X2h A00;
    public C307996Sh A01;
    public final 2UL A02 = new 2UL(this, 1KZ.A01);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15166UTr(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    public final void A0O(boolean z, int i, int i2, int i3, int i4) {
        C20880X2h x2h = this.A00;
        if (x2h != null) {
            C307996Sh r0 = this.A01;
            if (r0 != null) {
                this.A02.A0E(r0.A01);
            }
            int i5 = 0;
            while (true) {
                if (x2h.equals(this.A00) && this.A01 != null) {
                    break;
                } else if (i5 > 4) {
                    2SK.A02("LazyMeasureHostView", C273654mx.A00(1310));
                    return;
                } else {
                    int i6 = i3 - i;
                    int i7 = i4 - i2;
                    C307996Sh Blm = x2h.Blm(this.A01, C244913bx.A00.A00(i6, i6, i7, i7));
                    this.A02.A0E(Blm.A01);
                    this.A01 = Blm;
                    i5++;
                }
            }
        }
        C299265uq.A00(this);
    }

    public final void CsJ() {
        C245863db.A00(this, this.A02);
    }

    public final void Dct(Long l) {
        C245863db.A02(this.A02, l);
    }

    public final void Dv5() {
        C245863db.A01(this.A02);
    }

    public final void onMeasure(int i, int i2) {
        C307996Sh Blm;
        C20880X2h x2h = this.A00;
        if (x2h == null) {
            setMeasuredDimension(0, 0);
            Blm = null;
        } else {
            Blm = x2h.Blm(this.A01, C244873bt.A00(i, i2));
            C245663dH r0 = Blm.A01;
            setMeasuredDimension(r0.A01(), r0.A00());
        }
        this.A01 = Blm;
    }

    public final void setLazyRenderTreeProvider(C20880X2h x2h) {
        if (!0qQ.A0K(this.A00, x2h)) {
            if (x2h == null) {
                this.A01 = null;
                this.A02.A0C();
            }
            this.A00 = x2h;
            requestLayout();
        }
    }

    public void setRenderTreeUpdateListener(C232612u4 r2) {
        this.A02.A0G(r2);
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
        int A06 = AnonymousClass0fD.A06(-1835842661);
        super.onAttachedToWindow();
        this.A02.A0A();
        AnonymousClass0fD.A0D(1150753886, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(1018701990);
        super.onDetachedFromWindow();
        this.A02.A0B();
        AnonymousClass0fD.A0D(134985777, A06);
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
