package X;

import android.text.SpannableString;

/* renamed from: X.6OW  reason: invalid class name */
public final class AnonymousClass6OW extends AnonymousClass0T0 {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final SpannableString A07;
    public final SpannableString A08;
    public final AnonymousClass90O A09;
    public final AnonymousClass6OV A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final 0sL A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6OW) {
                AnonymousClass6OW r5 = (AnonymousClass6OW) obj;
                if (!(this.A05 == r5.A05 && 0qQ.A0K(this.A09, r5.A09) && 0qQ.A0K(this.A0C, r5.A0C) && this.A06 == r5.A06 && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A02 == r5.A02 && 0qQ.A0K(this.A07, r5.A07) && this.A0F == r5.A0F && 0qQ.A0K(this.A08, r5.A08) && this.A0G == r5.A0G && this.A0B == r5.A0B && Float.compare(this.A00, r5.A00) == 0 && 0qQ.A0K(this.A0D, r5.A0D) && this.A0E == r5.A0E && Float.compare(this.A01, r5.A01) == 0 && 0qQ.A0K(this.A0A, r5.A0A))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass6OW(SpannableString spannableString, SpannableString spannableString2, AnonymousClass90O r4, AnonymousClass6OV r5, Integer num, Integer num2, 0sL r8, float f, float f2, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(spannableString, 8);
        this.A05 = i;
        this.A09 = r4;
        this.A0C = num;
        this.A06 = i2;
        this.A04 = i3;
        this.A03 = i4;
        this.A02 = i5;
        this.A07 = spannableString;
        this.A0F = z;
        this.A08 = spannableString2;
        this.A0G = z2;
        this.A0B = num2;
        this.A00 = f;
        this.A0D = r8;
        this.A0E = z3;
        this.A01 = f2;
        this.A0A = r5;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str;
        int hashCode3 = ((this.A05 * 31) + this.A09.hashCode()) * 31;
        Integer num = this.A0C;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode4 = (((((((((((hashCode3 + hashCode) * 31) + this.A06) * 31) + this.A04) * 31) + this.A03) * 31) + this.A02) * 31) + this.A07.hashCode()) * 31;
        int i2 = 1237;
        if (this.A0F) {
            i2 = 1231;
        }
        int i3 = (hashCode4 + i2) * 31;
        SpannableString spannableString = this.A08;
        if (spannableString == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = spannableString.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        int i5 = 1237;
        if (this.A0G) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int intValue = this.A0B.intValue();
        switch (intValue) {
            case 1:
                str = "WORD";
                break;
            case 2:
                str = "LINE";
                break;
            default:
                str = "CHARACTER";
                break;
        }
        int hashCode5 = (((i6 + str.hashCode() + intValue) * 31) + Float.floatToIntBits(this.A00)) * 31;
        0sL r0 = this.A0D;
        if (r0 != null) {
            i = r0.hashCode();
        }
        int i7 = (hashCode5 + i) * 31;
        int i8 = 1237;
        if (this.A0E) {
            i8 = 1231;
        }
        return ((((i7 + i8) * 31) + Float.floatToIntBits(this.A01)) * 31) + this.A0A.hashCode();
    }
}
