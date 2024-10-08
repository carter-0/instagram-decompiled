package X;

/* renamed from: X.HtZ  reason: case insensitive filesystem */
public final class C56147HtZ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C57542IcU A05;
    public final C54716HPv A06;
    public final JT7 A07;
    public final JT8 A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56147HtZ) {
                C56147HtZ htZ = (C56147HtZ) obj;
                if (!0qQ.A0K(this.A08, htZ.A08) || !0qQ.A0K(this.A0E, htZ.A0E) || !0qQ.A0K(this.A0D, htZ.A0D) || !0qQ.A0K(this.A0C, htZ.A0C) || !0qQ.A0K(this.A0B, htZ.A0B) || this.A02 != htZ.A02 || !0qQ.A0K(this.A09, htZ.A09) || this.A01 != htZ.A01 || this.A00 != htZ.A00 || !0qQ.A0K(this.A0A, htZ.A0A) || this.A04 != htZ.A04 || this.A03 != htZ.A03 || !0qQ.A0K(this.A06, htZ.A06) || !0qQ.A0K(this.A07, htZ.A07) || !0qQ.A0K(this.A05, htZ.A05) || Float.compare(0.7f, 0.7f) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A0E, (AnonymousClass7TE.A0K(this.A08) + 1) * 31);
        return C51966G9m.A02((AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A06, ((((((((((((((((((((AnonymousClass7TF.A07(this.A0D, A072) * 31) + AnonymousClass7TG.A0C(this.A0C)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) - 766850501) * 31) + this.A02) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + this.A01) * 31) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + this.A04) * 31) + this.A03) * 31) * 31) + AnonymousClass7TE.A0L(this.A05)) * 31, 0.7f);
    }

    public C56147HtZ(C57542IcU icU, C54716HPv hPv, JT7 jt7, JT8 jt8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i, int i2, int i3, int i4, int i5) {
        this.A08 = jt8;
        this.A0E = num;
        this.A0D = num2;
        this.A0C = num3;
        this.A0B = num4;
        this.A02 = i;
        this.A09 = num5;
        this.A01 = i2;
        this.A00 = i3;
        this.A0A = num6;
        this.A04 = i4;
        this.A03 = i5;
        this.A06 = hPv;
        this.A07 = jt7;
        this.A05 = icU;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ButtonStyleValues(textVariant=");
        A1A.append(this.A08);
        A1A.append(", textMaxLines=");
        A1A.append(1);
        A1A.append(", textCapSpacingDp=");
        A1A.append(this.A0E);
        A1A.append(", textBaselineSpacingDp=");
        A1A.append(this.A0D);
        G9w.A1X(A1A, ", startIconVariant=");
        A1A.append(", startIconSizeDp=");
        A1A.append(this.A0C);
        A1A.append(", startIconMarginEndDp=");
        A1A.append(this.A0B);
        A1A.append(", startIconAlignment=");
        A1A.append("CENTERED_WITH_TEXT");
        A1A.append(", heightDp=");
        A1A.append(this.A02);
        A1A.append(", backgroundColor=");
        A1A.append(this.A09);
        A1A.append(", cornerRadiusDp=");
        A1A.append(this.A01);
        A1A.append(", borderWidthDp=");
        A1A.append(this.A00);
        A1A.append(AnonymousClass000.A00(839));
        A1A.append(this.A0A);
        A1A.append(", paddingStartDp=");
        A1A.append(this.A04);
        A1A.append(", paddingEndDp=");
        A1A.append(this.A03);
        A1A.append(", widthMode=");
        A1A.append(this.A06);
        C51975G9x.A1F(A1A, ", touchExpansionDp=");
        A1A.append(", pressedStateVariant=");
        A1A.append(this.A07);
        A1A.append(", loadingSpinnerVariant=");
        A1A.append(this.A05);
        A1A.append(", disabledAlpha=");
        A1A.append(0.7f);
        return AnonymousClass7TG.A0p(A1A);
    }
}
