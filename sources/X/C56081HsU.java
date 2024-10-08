package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.HsU  reason: case insensitive filesystem */
public final class C56081HsU {
    public final int A00;
    public final Drawable A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56081HsU) {
                C56081HsU hsU = (C56081HsU) obj;
                if (!0qQ.A0K(this.A01, hsU.A01) || this.A00 != hsU.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + this.A00;
    }

    public C56081HsU(Drawable drawable, int i) {
        this.A01 = drawable;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("IconStyleValues(drawable=");
        A1A.append(this.A01);
        A1A.append(", sizeDp=");
        return C51975G9x.A0j(A1A, this.A00);
    }
}
