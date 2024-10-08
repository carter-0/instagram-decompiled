package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3Cy  reason: invalid class name and case insensitive filesystem */
public final class C238673Cy extends AnonymousClass3BB {
    public final int A02() {
        return this.A02.A00;
    }

    public final int A03() {
        C252553pI r0 = this.A02;
        return r0.A00 - r0.Ba8();
    }

    public final int A04() {
        return this.A02.Ba8();
    }

    public final int A05() {
        return this.A02.A01;
    }

    public final int A06() {
        return this.A02.BaC();
    }

    public final int A07() {
        C252553pI r2 = this.A02;
        return (r2.A00 - r2.BaC()) - r2.Ba8();
    }

    public final void A0E(int i) {
        this.A02.A1A(i);
    }

    public final int A0B(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        Rect rect = ((AnonymousClass3MX) view.getLayoutParams()).A02;
        return view.getMeasuredHeight() + rect.top + rect.bottom + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int A0C(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        Rect rect = ((AnonymousClass3MX) view.getLayoutParams()).A02;
        return view.getMeasuredWidth() + rect.left + rect.right + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public final int A0D(View view) {
        return this.A02.A0W(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
    }

    public C238673Cy(C252553pI r1) {
        super(r1);
    }
}
