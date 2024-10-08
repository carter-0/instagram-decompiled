package X;

/* renamed from: X.5ZC  reason: invalid class name */
public final class AnonymousClass5ZC {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final AnonymousClass5Z3 A05;
    public final C291815hv A06;
    public final C291825hw A07;

    public final AnonymousClass5ZC A00(AnonymousClass5ZC r11) {
        if (r11 == null) {
            return this;
        }
        int i = r11.A02;
        int i2 = r11.A03;
        long j = r11.A04;
        C291815hv r2 = r11.A06;
        return C287155Zf.A00(this, r11.A05, r2, r11.A07, i, i2, r11.A01, r11.A00, j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5ZC) {
                AnonymousClass5ZC r8 = (AnonymousClass5ZC) obj;
                if (this.A02 == r8.A02 && this.A03 == r8.A03) {
                    long j = this.A04;
                    long j2 = r8.A04;
                    AnonymousClass5Z6[] r0 = AnonymousClass5Z5.A02;
                    if (j != j2 || !0qQ.A0K(this.A06, r8.A06) || !0qQ.A0K(this.A05, r8.A05) || this.A01 != r8.A01 || this.A00 != r8.A00 || !0qQ.A0K(this.A07, r8.A07)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        long j = this.A04;
        AnonymousClass5Z6[] r0 = AnonymousClass5Z5.A02;
        int i3 = ((((this.A02 * 31) + this.A03) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        C291815hv r02 = this.A06;
        int i4 = 0;
        if (r02 != null) {
            i = r02.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        AnonymousClass5Z3 r03 = this.A05;
        if (r03 != null) {
            i2 = r03.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (((((i5 + i2) * 31 * 31) + this.A01) * 31) + this.A00) * 31;
        C291825hw r04 = this.A07;
        if (r04 != null) {
            i4 = r04.hashCode();
        }
        return i6 + i4;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ParagraphStyle(textAlign=");
        sb.append(I1V.A00(this.A02));
        sb.append(", textDirection=");
        sb.append(I1W.A00(this.A03));
        sb.append(", lineHeight=");
        sb.append(AnonymousClass5Z5.A02(this.A04));
        sb.append(", textIndent=");
        sb.append(this.A06);
        sb.append(", platformStyle=");
        sb.append(this.A05);
        sb.append(", lineHeightStyle=");
        sb.append((Object) null);
        sb.append(", lineBreak=");
        sb.append(C54758HRq.A00(this.A01));
        sb.append(", hyphens=");
        int i = this.A00;
        if (i == 1) {
            str = "Hyphens.None";
        } else if (i == 2) {
            str = "Hyphens.Auto";
        } else if (i == Integer.MIN_VALUE) {
            str = "Hyphens.Unspecified";
        } else {
            str = "Invalid";
        }
        sb.append(str);
        sb.append(", textMotion=");
        sb.append(this.A07);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass5ZC(AnonymousClass5Z3 r4, C291815hv r5, C291825hw r6, int i, int i2, int i3, int i4, long j) {
        this.A02 = i;
        this.A03 = i2;
        this.A04 = j;
        this.A06 = r5;
        this.A05 = r4;
        this.A01 = i3;
        this.A00 = i4;
        this.A07 = r6;
        if (j != AnonymousClass5Z5.A01) {
            float A002 = AnonymousClass5Z5.A00(j);
            if (A002 < 0.0f) {
                throw new IllegalStateException(002.A0F("lineHeight can't be negative (", ')', A002));
            }
        }
    }
}
