package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.IaH  reason: case insensitive filesystem */
public final class C57411IaH implements C273424mY {
    public static final C71392co A07 = C71392co.A03(0.0d, 5.0d);
    public final float A00;
    public final View A01;
    public final C317396nC A02;
    public final float A03;
    public final int A04 = 5;
    public final C62320sa A05;
    public final C62320sa A06;

    public C57411IaH(View view, C62320sa r6, C62320sa r7) {
        0qQ.A0B(view, 1);
        this.A01 = view;
        this.A05 = r6;
        this.A06 = r7;
        Context context = view.getContext();
        this.A02 = new C317396nC(context, this);
        float dimensionPixelSize = (float) (context.getResources().getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height) + C51972G9s.A08(context));
        this.A00 = dimensionPixelSize;
        this.A03 = dimensionPixelSize / 3.0f;
        C56815IDm.A00(view, 1, this);
    }

    public final void DAZ(C317396nC r9, float f, float f2, float f3, float f4, float f5) {
        C317396nC r2 = r9;
        0qQ.A0B(r9, 0);
        if (Math.abs(f) > this.A03 || Math.abs(f4) > ((float) this.A04)) {
            A00(f4);
        } else {
            r2.A02(A07, 0.0f, 0.0f, 5.0f, 0.0f);
        }
    }

    public final boolean DAg(C317396nC r2, float f, float f2, float f3, float f4, boolean z) {
        return true;
    }

    public final void A00(float f) {
        C317396nC r2 = this.A02;
        int i = 1;
        if (0mk.A02(this.A01.getContext())) {
            i = -1;
        }
        r2.A02(A07, ((float) i) * this.A00, 0.0f, f, 0.0f);
        this.A06.invoke();
    }

    public final boolean DAA(C317396nC r3, float f, float f2) {
        this.A01.getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public final void DAS(C317396nC r4, float f, float f2, float f3, boolean z) {
        View view = this.A01;
        int i = 1;
        if (0mk.A02(view.getContext())) {
            i = -1;
        }
        if (((float) i) * f >= 0.0f) {
            view.setTranslationX(f);
        }
    }

    public final boolean DlG(C317396nC r2, float f, float f2) {
        this.A05.invoke();
        return true;
    }

    public final void DvA(C317396nC r3) {
        this.A01.getParent().requestDisallowInterceptTouchEvent(false);
    }
}
