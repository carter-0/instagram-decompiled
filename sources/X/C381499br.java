package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.9br  reason: invalid class name and case insensitive filesystem */
public final class C381499br extends AnonymousClass0T0 {
    public boolean A00 = true;
    public int A01;
    public final int A02;
    public final Drawable A03;
    public final float A04;

    public C381499br(Drawable drawable, float f, int i, int i2) {
        this.A03 = drawable;
        this.A01 = i;
        this.A04 = f;
        this.A02 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381499br) {
                C381499br r5 = (C381499br) obj;
                if (!(0qQ.A0K(this.A03, r5.A03) && this.A01 == r5.A01 && this.A00 == r5.A00 && Float.compare(this.A04, r5.A04) == 0 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00(AnonymousClass7TF.A09(this.A00, (AnonymousClass7TE.A0K(this.A03) + this.A01) * 31), this.A04) + this.A02;
    }
}
