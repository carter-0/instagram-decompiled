package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.S4z  reason: case insensitive filesystem */
public final class C11005S4z {
    public final int A00;
    public final int A01;
    public final Drawable A02;
    public final View.OnClickListener A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C11005S4z(Drawable drawable, View.OnClickListener onClickListener, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A06 = z;
        this.A07 = z2;
        this.A08 = z3;
        this.A02 = drawable;
        this.A00 = i;
        this.A03 = onClickListener;
        this.A04 = str;
        this.A01 = i2;
        this.A05 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11005S4z) {
                C11005S4z s4z = (C11005S4z) obj;
                if (!(this.A06 == s4z.A06 && this.A07 == s4z.A07 && this.A08 == s4z.A08 && 0qQ.A0K(this.A02, s4z.A02) && this.A00 == s4z.A00 && 0qQ.A0K(this.A03, s4z.A03) && 0qQ.A0K(this.A04, s4z.A04) && this.A01 == s4z.A01 && 0qQ.A0K(this.A05, s4z.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        return (((((((((((C11367SPk.A00(C11367SPk.A00(i + 31, this.A07), this.A08) * 31) + C51971G9r.A0E(this.A02)) * 31) + this.A00) * 31) + C51971G9r.A0E(this.A03)) * 31) + C51971G9r.A0E(this.A04)) * 31) + this.A01) * 31) + C51971G9r.A0E(this.A05);
    }
}
