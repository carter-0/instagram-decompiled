package X;

import android.view.View;

/* renamed from: X.3Kp  reason: invalid class name and case insensitive filesystem */
public final class C240363Kp extends AnonymousClass0T0 implements AnonymousClass1qK {
    public final int A00;
    public final View A01;
    public final 1Xj A02;
    public final AnonymousClass3W1 A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C240363Kp) {
                C240363Kp r5 = (C240363Kp) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A02.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A00;
    }

    public C240363Kp(View view, 1Xj r2, AnonymousClass3W1 r3, int i) {
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = view;
        this.A00 = i;
    }
}
