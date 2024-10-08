package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3BC  reason: invalid class name */
public final class AnonymousClass3BC extends AnonymousClass3BB {
    public final int A02() {
        return this.A02.A03;
    }

    public final int A03() {
        C252553pI r0 = this.A02;
        return r0.A03 - r0.BaB();
    }

    public final int A04() {
        return this.A02.BaB();
    }

    public final int A05() {
        return this.A02.A04;
    }

    public final int A06() {
        return this.A02.Ba9();
    }

    public final int A07() {
        C252553pI r2 = this.A02;
        return (r2.A03 - r2.Ba9()) - r2.BaB();
    }

    public final void A0E(int i) {
        this.A02.A19(i);
    }

    public final int A08(View view) {
        return view.getRight() + C252553pI.A07(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
    }

    public final int A0B(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        Rect rect = ((AnonymousClass3MX) view.getLayoutParams()).A02;
        return view.getMeasuredWidth() + rect.left + rect.right + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public final int A0C(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        Rect rect = ((AnonymousClass3MX) view.getLayoutParams()).A02;
        return view.getMeasuredHeight() + rect.top + rect.bottom + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int A0D(View view) {
        return (view.getLeft() - C252553pI.A05(view)) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
    }

    public AnonymousClass3BC(C252553pI r1) {
        super(r1);
    }
}
