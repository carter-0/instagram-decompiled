package X;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.774  reason: invalid class name */
public final class AnonymousClass774 extends AnonymousClass0T0 {
    public final Drawable A00;
    public final Drawable A01;
    public final CharSequence A02;
    public final CharSequence A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final String A09;
    public final List A0A;

    public AnonymousClass774(Drawable drawable, Drawable drawable2, CharSequence charSequence, CharSequence charSequence2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, List list) {
        0qQ.A0B(charSequence, 2);
        this.A0A = list;
        this.A03 = charSequence;
        this.A02 = charSequence2;
        this.A00 = drawable;
        this.A01 = drawable2;
        this.A06 = num;
        this.A07 = num2;
        this.A08 = num3;
        this.A05 = num4;
        this.A04 = num5;
        this.A09 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass774) {
                AnonymousClass774 r5 = (AnonymousClass774) obj;
                if (!0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A09, r5.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A0A.hashCode() * 31) + this.A03.hashCode()) * 31;
        CharSequence charSequence = this.A02;
        int i = 0;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Drawable drawable = this.A00;
        int hashCode3 = (hashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.A01;
        int hashCode4 = (hashCode3 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Integer num = this.A06;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A07;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A08;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A05;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.A04;
        int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31 * 31 * 31 * 31;
        String str = this.A09;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode9 + i;
    }
}
