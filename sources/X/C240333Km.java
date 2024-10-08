package X;

import android.view.View;

/* renamed from: X.3Km  reason: invalid class name and case insensitive filesystem */
public final class C240333Km extends AnonymousClass0T0 implements AnonymousClass1qK {
    public final View A00;
    public final 1Xj A01;
    public final AnonymousClass3W1 A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C240333Km) {
                C240333Km r5 = (C240333Km) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode()) * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return hashCode + i;
    }

    public C240333Km(View view, 1Xj r2, AnonymousClass3W1 r3, boolean z) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = view;
        this.A03 = z;
    }
}
