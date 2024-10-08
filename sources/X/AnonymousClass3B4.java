package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3B4  reason: invalid class name */
public final class AnonymousClass3B4 implements AnonymousClass3B5 {
    public final /* synthetic */ C252553pI A00;

    public AnonymousClass3B4(C252553pI r1) {
        this.A00 = r1;
    }

    public final View AnC(int i) {
        return this.A00.A0X(i);
    }

    public final int BaZ() {
        C252553pI r0 = this.A00;
        return r0.A03 - r0.BaB();
    }

    public final int Baf() {
        return this.A00.Ba9();
    }

    public final int AnI(View view) {
        return view.getRight() + C252553pI.A07(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
    }

    public final int AnK(View view) {
        return (view.getLeft() - C252553pI.A05(view)) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
    }
}
