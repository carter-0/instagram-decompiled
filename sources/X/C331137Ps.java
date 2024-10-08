package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.7Ps  reason: invalid class name and case insensitive filesystem */
public final class C331137Ps extends AnonymousClass0T0 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public View.OnClickListener A05;
    public CharSequence A06;
    public CharSequence A07;
    public Integer A08;
    public boolean A09;
    public boolean A0A;

    public C331137Ps(View.OnClickListener onClickListener, CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        0qQ.A0B(charSequence2, 8);
        this.A0A = true;
        this.A09 = false;
        this.A02 = i;
        this.A01 = 0;
        this.A04 = null;
        this.A06 = charSequence;
        this.A07 = charSequence2;
        this.A05 = onClickListener;
        this.A00 = i2;
        this.A08 = null;
        this.A03 = 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C331137Ps) {
                C331137Ps r5 = (C331137Ps) obj;
                if (!(this.A0A == r5.A0A && this.A09 == r5.A09 && this.A02 == r5.A02 && this.A01 == r5.A01 && 0qQ.A0K(this.A04, r5.A04) && 0qQ.A0K(this.A06, r5.A06) && 0qQ.A0K(this.A07, r5.A07) && 0qQ.A0K(this.A05, r5.A05) && this.A00 == r5.A00 && 0qQ.A0K(this.A08, r5.A08) && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C331147Pt A00() {
        CharSequence charSequence;
        boolean z = this.A0A;
        boolean z2 = this.A09;
        int i = this.A02;
        int i2 = this.A01;
        Drawable drawable = this.A04;
        CharSequence charSequence2 = this.A06;
        if (this.A07.length() == 0) {
            charSequence = this.A06;
            if (charSequence == null) {
                charSequence = "";
            }
        } else {
            charSequence = this.A07;
        }
        View.OnClickListener onClickListener = null;
        if (this.A0A) {
            onClickListener = this.A05;
        }
        return new C331147Pt(drawable, onClickListener, charSequence2, charSequence, this.A08, Integer.valueOf(this.A03), i, i2, this.A00, z, z2);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 1237;
        if (this.A0A) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A09) {
            i3 = 1231;
        }
        int i4 = (((((i2 + i3) * 31) + this.A02) * 31) + this.A01) * 31 * 31;
        Drawable drawable = this.A04;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        int i5 = (i4 + hashCode) * 31;
        CharSequence charSequence = this.A06;
        if (charSequence == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = charSequence.hashCode();
        }
        int hashCode5 = (((i5 + hashCode2) * 31) + this.A07.hashCode()) * 31;
        View.OnClickListener onClickListener = this.A05;
        if (onClickListener == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = onClickListener.hashCode();
        }
        int i6 = (((hashCode5 + hashCode3) * 31) + this.A00) * 31;
        Integer num = this.A08;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        return ((i6 + hashCode4) * 31 * 31 * 31) + this.A03;
    }

    public C331137Ps() {
        this((View.OnClickListener) null, (CharSequence) null, "", 0, 0);
    }
}
