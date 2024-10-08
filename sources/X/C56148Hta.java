package X;

/* renamed from: X.Hta  reason: case insensitive filesystem */
public final class C56148Hta {
    public final int A00;
    public final C55667HlQ A01;
    public final C59581JPb A02;
    public final C59581JPb A03;
    public final JT7 A04;
    public final JT8 A05;
    public final JT8 A06;
    public final JT8 A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56148Hta) {
                C56148Hta hta = (C56148Hta) obj;
                if (!0qQ.A0K(this.A06, hta.A06) || !0qQ.A0K(this.A0C, hta.A0C) || !0qQ.A0K(this.A0B, hta.A0B) || !0qQ.A0K(this.A05, hta.A05) || !0qQ.A0K(this.A09, hta.A09) || !0qQ.A0K(this.A08, hta.A08) || !0qQ.A0K(this.A07, hta.A07) || !0qQ.A0K(this.A0E, hta.A0E) || !0qQ.A0K(this.A0D, hta.A0D) || !0qQ.A0K(this.A04, hta.A04) || !0qQ.A0K(this.A03, hta.A03) || this.A0F != hta.A0F || !0qQ.A0K(this.A02, hta.A02) || this.A00 != hta.A00 || !0qQ.A0K(this.A01, hta.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((AnonymousClass7TF.A07(this.A04, (((((((((((((AnonymousClass7TF.A07(this.A0D, AnonymousClass7TF.A07(this.A0E, AnonymousClass7TF.A07(this.A07, (AnonymousClass7TF.A07(this.A08, AnonymousClass7TF.A07(this.A09, AnonymousClass7TF.A07(this.A05, (((AnonymousClass7TF.A07(this.A0B, AnonymousClass7TF.A07(this.A0C, AnonymousClass7TE.A0K(this.A06) * 31)) + 1) * 31) + 1) * 31) * 31)) + 1) * 31) * 31)) + 1984282710) * 31) + 79219778) * 31) + 52) * 31) + 16) * 31) + 12) * 31) + 16) * 31) + 12) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + 12) * 31) + C56362HxF.A00(this.A0F)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + 12) * 31) + C56362HxF.A00(this.A0A)) * 31) + this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C56148Hta(C55667HlQ hlQ, C59581JPb jPb, C59581JPb jPb2, JT7 jt7, JT8 jt8, JT8 jt82, JT8 jt83, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, int i) {
        this.A06 = jt8;
        this.A0C = num;
        this.A0B = num2;
        this.A05 = jt82;
        this.A09 = num3;
        this.A08 = num4;
        this.A07 = jt83;
        this.A0E = num5;
        this.A0D = num6;
        this.A04 = jt7;
        this.A03 = jPb;
        this.A0F = num7;
        this.A02 = jPb2;
        this.A0A = num8;
        this.A00 = i;
        this.A01 = hlQ;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ListCellStyleValues(headlineTextVariant=");
        A1A.append(this.A06);
        G9w.A1X(A1A, ", headlineMaxLines=");
        A1A.append(", headlineCapSpacingDp=");
        A1A.append(this.A0C);
        A1A.append(", headlineBaselineSpacingDp=");
        A1A.append(this.A0B);
        A1A.append(", headlineToBodySpacingDp=");
        A1A.append(1);
        A1A.append(", headlineToMetaSpacingDp=");
        A1A.append(1);
        A1A.append(", bodyTextVariant=");
        A1A.append(this.A05);
        G9w.A1X(A1A, ", bodyMaxLines=");
        A1A.append(", bodyCapSpacingDp=");
        A1A.append(this.A09);
        A1A.append(", bodyBaselineSpacingDp=");
        A1A.append(this.A08);
        A1A.append(", bodyToMetaSpacingDp=");
        A1A.append(1);
        A1A.append(", metaTextVariant=");
        A1A.append(this.A07);
        G9w.A1X(A1A, ", metaMaxLines=");
        A1A.append(", metaCapSpacingDp=");
        A1A.append(this.A0E);
        A1A.append(", metaBaselineSpacingDp=");
        A1A.append(this.A0D);
        A1A.append(", textColumnVerticalAlignment=");
        A1A.append("CENTER");
        A1A.append(", textColumnHorizontalAlignment=");
        A1A.append("START");
        A1A.append(", minHeightDp=");
        A1A.append(52);
        A1A.append(", startPaddingDp=");
        A1A.append(16);
        A1A.append(", topPaddingDp=");
        A1A.append(12);
        A1A.append(", endPaddingDp=");
        A1A.append(16);
        A1A.append(", bottomPaddingDp=");
        A1A.append(12);
        A1A.append(", pressedStateVariant=");
        A1A.append(this.A04);
        A1A.append(", startAddOn=");
        A1A.append(this.A03);
        A1A.append(", startAddOnEndMarginDp=");
        A1A.append(12);
        A1A.append(", startAddOnVerticalAlignment=");
        A1A.append(C56362HxF.A01(this.A0F));
        A1A.append(", endAddOn=");
        A1A.append(this.A02);
        A1A.append(", endAddOnStartMarginDp=");
        A1A.append(12);
        A1A.append(", endAddOnVerticalAlignment=");
        A1A.append(C56362HxF.A01(this.A0A));
        A1A.append(", badgeTopMarginDp=");
        A1A.append(this.A00);
        A1A.append(", badge=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
