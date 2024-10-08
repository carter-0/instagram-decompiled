package X;

/* renamed from: X.HtQ  reason: case insensitive filesystem */
public final class C56138HtQ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final JT8 A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56138HtQ) {
                C56138HtQ htQ = (C56138HtQ) obj;
                if (!0qQ.A0K(this.A05, htQ.A05) || !0qQ.A0K(this.A06, htQ.A06) || !0qQ.A0K(this.A03, htQ.A03) || this.A02 != htQ.A02 || this.A01 != htQ.A01 || !0qQ.A0K(this.A04, htQ.A04) || this.A00 != htQ.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((G9w.A02((((AnonymousClass7TF.A07(this.A03, ((AnonymousClass7TG.A0C(this.A05) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + 1) * 31) + this.A02) * 31, this.A01) + AnonymousClass7TE.A0L(this.A04)) * 31) + this.A00;
    }

    public C56138HtQ(JT8 jt8, Integer num, Integer num2, Integer num3, int i, int i2, int i3) {
        this.A05 = num;
        this.A06 = num2;
        this.A03 = jt8;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = num3;
        this.A00 = i3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TextBadgeStyleValues(textBaselineSpacingDp=");
        A1A.append(this.A05);
        A1A.append(", textCapSpacingDp=");
        A1A.append(this.A06);
        A1A.append(", textVariant=");
        A1A.append(this.A03);
        A1A.append(", textMaxLines=");
        A1A.append(1);
        A1A.append(", textStartPaddingDp=");
        A1A.append(this.A02);
        A1A.append(", textEndPaddingDp=");
        A1A.append(this.A01);
        A1A.append(", textTopPaddingDp=");
        A1A.append(0);
        A1A.append(", textBottomPaddingDp=");
        A1A.append(0);
        A1A.append(", backgroundColor=");
        A1A.append(this.A04);
        A1A.append(", cornerRadiusDp=");
        return C51975G9x.A0j(A1A, this.A00);
    }
}
