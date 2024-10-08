package X;

import android.view.View;

/* renamed from: X.WeJ  reason: case insensitive filesystem */
public final class C19717WeJ implements C273424mY {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C71392co A02;
    public final /* synthetic */ C15336Ual A03;

    public final void DAS(C317396nC r4, float f, float f2, float f3, boolean z) {
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        View view = this.A01;
        if (i < 0) {
            view.setTranslationY(0.0f);
        } else {
            view.setTranslationY(f2);
        }
    }

    public final boolean DlG(C317396nC r2, float f, float f2) {
        return false;
    }

    public final void DvA(C317396nC r1) {
    }

    public C19717WeJ(View view, C71392co r2, C15336Ual ual, float f) {
        this.A03 = ual;
        this.A01 = view;
        this.A00 = f;
        this.A02 = r2;
    }

    public final boolean DAg(C317396nC r3, float f, float f2, float f3, float f4, boolean z) {
        AnonymousClass3M7 r1 = this.A03.A02;
        if (!(r1 instanceof AnonymousClass3M7) || !r1.isScrolledToTop() || f2 >= 0.0f) {
            return false;
        }
        return true;
    }

    public final boolean DAA(C317396nC r2, float f, float f2) {
        return r2.A04();
    }

    public final void DAZ(C317396nC r7, float f, float f2, float f3, float f4, float f5) {
        if (Math.abs(f2) < this.A00) {
            r7.A02(this.A02, 0.0f, 0.0f, f4, f5);
            return;
        }
        DbT.A1J(this.A03);
    }
}
