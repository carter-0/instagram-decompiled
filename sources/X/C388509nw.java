package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.9nw  reason: invalid class name and case insensitive filesystem */
public final class C388509nw extends C391959tx {
    public final int A00;
    public final Drawable A01;

    public C388509nw(Drawable drawable, int i) {
        0qQ.A0B(drawable, 1);
        this.A01 = drawable;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C388509nw) {
                C388509nw r5 = (C388509nw) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00) {
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
}
