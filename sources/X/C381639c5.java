package X;

import android.graphics.RectF;

/* renamed from: X.9c5  reason: invalid class name and case insensitive filesystem */
public final class C381639c5 extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final RectF A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381639c5) {
                C381639c5 r5 = (C381639c5) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && 0qQ.A0K(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, ((this.A01 * 31) + this.A00) * 31);
    }

    public C381639c5(RectF rectF, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = rectF;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RectFWithOriginalDimen(originalWidth=");
        A1A.append(this.A01);
        A1A.append(", originalHeight=");
        A1A.append(this.A00);
        A1A.append(", rectF=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
