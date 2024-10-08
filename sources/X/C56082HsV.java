package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.HsV  reason: case insensitive filesystem */
public final class C56082HsV {
    public final int A00;
    public final Drawable A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56082HsV) {
                C56082HsV hsV = (C56082HsV) obj;
                if (this.A00 != hsV.A00 || !0qQ.A0K(this.A01, hsV.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, this.A00 * 31);
    }

    public C56082HsV(Drawable drawable, int i) {
        this.A00 = i;
        this.A01 = drawable;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SpinnerStyleValues(sizeDp=");
        A1A.append(this.A00);
        A1A.append(", indeterminateDrawable=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
