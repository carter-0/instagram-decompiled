package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import java.util.List;

/* renamed from: X.74v  reason: invalid class name and case insensitive filesystem */
public final class C3259574v extends C3259674w {
    public final int A00;
    public final Drawable A01;
    public final SpannableString A02;
    public final 1aV A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3259574v(Drawable drawable, SpannableString spannableString, 1aV r4, String str, List list, int i, boolean z, boolean z2, boolean z3) {
        super(drawable, spannableString, r4, list);
        0qQ.A0B(spannableString, 2);
        this.A04 = str;
        this.A02 = spannableString;
        this.A05 = list;
        this.A06 = z;
        this.A08 = z2;
        this.A01 = drawable;
        this.A00 = i;
        this.A07 = z3;
        this.A03 = r4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3259574v) {
                C3259574v r5 = (C3259574v) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A05, r5.A05) || this.A06 != r5.A06 || this.A08 != r5.A08 || !0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00 || this.A07 != r5.A07 || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.A04.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A05.hashCode()) * 31;
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        int i3 = 1237;
        if (this.A08) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        Drawable drawable = this.A01;
        int i5 = 0;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        int i6 = (((i4 + hashCode) * 31) + this.A00) * 31;
        int i7 = 1237;
        if (this.A07) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        1aV r0 = this.A03;
        if (r0 != null) {
            i5 = r0.hashCode();
        }
        return i8 + i5;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C3259574v r4 = (C3259574v) obj;
        String str2 = this.A04;
        if (r4 != null) {
            str = r4.A04;
        } else {
            str = null;
        }
        if (!0qQ.A0K(str2, str) || !0qQ.A0K(this.A02.toString(), r4.A02.toString()) || !0qQ.A0K(this.A05, r4.A05) || this.A06 != r4.A06 || this.A08 != r4.A08 || !0qQ.A0K(this.A01, r4.A01) || this.A00 != r4.A00 || this.A07 != r4.A07) {
            return false;
        }
        return true;
    }
}
