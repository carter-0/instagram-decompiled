package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3B6  reason: invalid class name */
public final class AnonymousClass3B6 implements AnonymousClass3B5 {
    public final /* synthetic */ C252553pI A00;

    public AnonymousClass3B6(C252553pI r1) {
        this.A00 = r1;
    }

    public final View AnC(int i) {
        return this.A00.A0X(i);
    }

    public final int BaZ() {
        C252553pI r0 = this.A00;
        return r0.A00 - r0.Ba8();
    }

    public final int Baf() {
        return this.A00.BaC();
    }

    public final int AnI(View view) {
        return this.A00.A0V(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
    }

    public final int AnK(View view) {
        return this.A00.A0W(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
    }
}
