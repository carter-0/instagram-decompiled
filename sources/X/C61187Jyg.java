package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Jyg  reason: case insensitive filesystem */
public final class C61187Jyg extends AnonymousClass0T0 implements MQQ {
    public final int A00;
    public final int A01;
    public final Drawable A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61187Jyg) {
                C61187Jyg jyg = (C61187Jyg) obj;
                if (!(0qQ.A0K(this.A02, jyg.A02) && this.A00 == jyg.A00 && this.A01 == jyg.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A02) + this.A00) * 31) + this.A01;
    }

    public C61187Jyg(Drawable drawable, int i, int i2) {
        this.A02 = drawable;
        this.A00 = i;
        this.A01 = i2;
    }
}
