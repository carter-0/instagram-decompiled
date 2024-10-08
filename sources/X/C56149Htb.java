package X;

/* renamed from: X.Htb  reason: case insensitive filesystem */
public final class C56149Htb {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final JT8 A0C;
    public final JT8 A0D;
    public final C56083HsW A0E;
    public final C56083HsW A0F;
    public final C56083HsW A0G;
    public final C59582JPc A0H;
    public final Integer A0I;
    public final Integer A0J;
    public final Integer A0K;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56149Htb) {
                C56149Htb htb = (C56149Htb) obj;
                if (!(0qQ.A0K(this.A0D, htb.A0D) && 0qQ.A0K(this.A0C, htb.A0C) && this.A06 == htb.A06 && 0qQ.A0K(this.A0J, htb.A0J) && this.A01 == htb.A01 && this.A07 == htb.A07 && this.A09 == htb.A09 && this.A0A == htb.A0A && this.A04 == htb.A04 && this.A00 == htb.A00 && this.A05 == htb.A05 && 0qQ.A0K(this.A0F, htb.A0F) && this.A0B == htb.A0B && 0qQ.A0K(this.A0G, htb.A0G) && this.A02 == htb.A02 && 0qQ.A0K(this.A0E, htb.A0E) && this.A08 == htb.A08 && 0qQ.A0K(this.A0H, htb.A0H) && this.A03 == htb.A03 && this.A0I == htb.A0I)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K2 = AnonymousClass7TE.A0K(this.A0D);
        C56083HsW hsW = this.A0F;
        C56083HsW hsW2 = this.A0G;
        return (((((((((AnonymousClass7TF.A07(this.A0E, (AnonymousClass7TF.A07(hsW2, (AnonymousClass7TF.A07(hsW, ((((((((((((G9w.A02(((G9w.A02((((AnonymousClass7TF.A07(this.A0C, A0K2) + this.A06) * 31 * 31) + AnonymousClass7TG.A0C(this.A0J)) * 31, this.A01) * 31 * 31 * 31) + 1700509087) * 31, 2014820470) * 31 * 31 * 31 * 31) + this.A07) * 31) + this.A09) * 31) + this.A0A) * 31) + this.A04) * 31) + this.A00) * 31 * 31) + this.A05) * 31) + this.A0B) * 31) + this.A02) * 31) * 31) + this.A08) * 31) + C56363HxG.A00(this.A0K)) * 31) + AnonymousClass7TE.A0L(this.A0H)) * 31) + this.A03) * 31) + C56363HxG.A00(this.A0I);
    }

    public C56149Htb(JT8 jt8, JT8 jt82, C56083HsW hsW, C56083HsW hsW2, C56083HsW hsW3, C59582JPc jPc, Integer num, Integer num2, Integer num3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        AnonymousClass7TG.A1O(jt8, jt82);
        0qQ.A0B(num3, 37);
        this.A0D = jt8;
        this.A0C = jt82;
        this.A06 = i;
        this.A0J = num;
        this.A01 = i2;
        this.A07 = i3;
        this.A09 = i4;
        this.A0A = i5;
        this.A04 = i6;
        this.A00 = i7;
        this.A05 = i8;
        this.A0F = hsW;
        this.A0B = i9;
        this.A0G = hsW2;
        this.A02 = i10;
        this.A0E = hsW3;
        this.A08 = i11;
        this.A0K = num2;
        this.A0H = jPc;
        this.A03 = i12;
        this.A0I = num3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TextInputStyleValues(inputTextVariant=");
        A1A.append(this.A0D);
        A1A.append(", disabledInputTextVariant=");
        A1A.append(this.A0C);
        A1A.append(", inputMaxLines=");
        A1A.append(this.A06);
        C51975G9x.A1F(A1A, ", inputStaticPrefixLength=");
        A1A.append(", hintTextColor=");
        A1A.append(this.A0J);
        A1A.append(", cursorColor=");
        A1A.append(this.A01);
        A1A.append(", highlightColor=");
        A1A.append((Object) null);
        A1A.append(", labelTextVariant=");
        A1A.append((Object) null);
        A1A.append(", labelCapSpacingDp=");
        A1A.append(0);
        A1A.append(", labelBaselineSpacingDp=");
        A1A.append(0);
        A1A.append(", labelMaxLines=");
        A1A.append(0);
        A1A.append(", labelBehaviour=");
        A1A.append("EditTextHint");
        A1A.append(", textColumnVerticalAlignment=");
        A1A.append("Center");
        A1A.append(", floatingLabelTextVariant=");
        A1A.append((Object) null);
        A1A.append(", floatingLabelCapSpacingDp=");
        A1A.append(0);
        A1A.append(", floatingLabelBaselineSpacingDp=");
        A1A.append(0);
        A1A.append(", floatingLabelMaxLines=");
        A1A.append(0);
        A1A.append(", floatingLabelStartDp=");
        A1A.append(0);
        A1A.append(", floatingLabelTopDp=");
        A1A.append(0);
        A1A.append(", minHeightDp=");
        A1A.append(this.A07);
        A1A.append(", startPaddingDp=");
        A1A.append(this.A09);
        A1A.append(", topPaddingDp=");
        A1A.append(this.A0A);
        A1A.append(", endPaddingDp=");
        A1A.append(this.A04);
        A1A.append(", bottomPaddingDp=");
        A1A.append(this.A00);
        C51975G9x.A1F(A1A, ", inputToLabelDp=");
        A1A.append(", focusedBackgroundColor=");
        A1A.append(this.A05);
        A1A.append(", focusedBorder=");
        A1A.append(this.A0F);
        A1A.append(", unFocusedBackgroundColor=");
        A1A.append(this.A0B);
        A1A.append(", unFocusedBorder=");
        A1A.append(this.A0G);
        A1A.append(", disabledBackgroundColor=");
        A1A.append(this.A02);
        A1A.append(", disabledBorder=");
        A1A.append(this.A0E);
        G9w.A1X(A1A, ", startAddOn=");
        A1A.append(", startAddOnEndMarginDp=");
        A1A.append(this.A08);
        A1A.append(", startAddOnVerticalAlignment=");
        A1A.append(C56363HxG.A01(this.A0K));
        A1A.append(", endAddOn=");
        A1A.append(this.A0H);
        A1A.append(", endAddOnStartMarginDp=");
        A1A.append(this.A03);
        A1A.append(", endAddOnVerticalAlignment=");
        return C51975G9x.A0i(C56363HxG.A01(this.A0I), A1A);
    }
}
