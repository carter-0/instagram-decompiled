package X;

public final class GTI extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;

    public GTI(JM8 jm8, C62320sa r3, C62320sa r4, C62320sa r5, C62320sa r6, C62320sa r7, C62320sa r8, C62320sa r9, 0sP r10, 0sP r11, 0sL r12) {
        0qQ.A0B(jm8, 1);
        this.A06 = jm8;
        this.A09 = r10;
        this.A08 = r3;
        this.A07 = r11;
        this.A0B = r4;
        this.A03 = r5;
        this.A0A = r12;
        this.A04 = r6;
        this.A02 = r7;
        this.A05 = r8;
        this.A01 = r9;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GTI)) {
                return false;
            }
            GTI gti = (GTI) obj;
            if (gti.A00 != 1 || !0qQ.A0K(this.A06, gti.A06) || !0qQ.A0K(this.A09, gti.A09) || !0qQ.A0K(this.A08, gti.A08) || !0qQ.A0K(this.A07, gti.A07) || !0qQ.A0K(this.A0B, gti.A0B) || !0qQ.A0K(this.A03, gti.A03) || !0qQ.A0K(this.A0A, gti.A0A) || !0qQ.A0K(this.A04, gti.A04) || !0qQ.A0K(this.A02, gti.A02) || !0qQ.A0K(this.A05, gti.A05)) {
                return false;
            }
            obj2 = this.A01;
            obj3 = gti.A01;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof GTI)) {
                return false;
            }
            GTI gti2 = (GTI) obj;
            if (gti2.A00 != 0 || !0qQ.A0K(this.A04, gti2.A04) || !0qQ.A0K(this.A02, gti2.A02) || !0qQ.A0K(this.A09, gti2.A09) || !0qQ.A0K(this.A07, gti2.A07) || !0qQ.A0K(this.A01, gti2.A01) || !0qQ.A0K(this.A08, gti2.A08) || !0qQ.A0K(this.A0A, gti2.A0A) || !0qQ.A0K(this.A03, gti2.A03) || !0qQ.A0K(this.A06, gti2.A06) || !0qQ.A0K(this.A0B, gti2.A0B)) {
                return false;
            }
            obj2 = this.A05;
            obj3 = gti2.A05;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072;
        Object obj;
        if (this.A00 != 0) {
            A072 = AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A0A, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A0B, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A08, AnonymousClass7TF.A07(this.A09, AnonymousClass7TE.A0K(this.A06))))))))));
            obj = this.A01;
        } else {
            A072 = AnonymousClass7TF.A07(this.A0B, AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A0A, AnonymousClass7TF.A07(this.A08, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A09, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A04))))))))));
            obj = this.A05;
        }
        return AnonymousClass7TE.A0N(obj, A072);
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AdUniversalCTAUiActions(getCarouselMedia=");
        A1A.append(this.A04);
        A1A.append(", getCarouselIndex=");
        A1A.append(this.A02);
        A1A.append(", getMediaStatePosition=");
        A1A.append(this.A09);
        A1A.append(", getLinkFromAdMedia=");
        A1A.append(this.A07);
        A1A.append(", getAdOverlaySubtitle=");
        A1A.append(this.A01);
        A1A.append(", getLinkText=");
        A1A.append(this.A08);
        A1A.append(", isAd=");
        A1A.append(this.A0A);
        A1A.append(", setStyledCTAColor=");
        A1A.append(this.A03);
        A1A.append(", getIGAutomatedLoggingTrackingDataGenerator=");
        A1A.append(this.A06);
        A1A.append(", onClickCTAButton=");
        A1A.append(this.A0B);
        A1A.append(", getCurrentMedia=");
        return AnonymousClass7TG.A0n(this.A05, A1A);
    }

    public GTI(C62320sa r2, C62320sa r3, C62320sa r4, C62320sa r5, C62320sa r6, 0sP r7, 0sP r8, 0sP r9, 0sL r10, 0sL r11, 0sK r12) {
        this.A04 = r2;
        this.A02 = r3;
        this.A09 = r4;
        this.A07 = r7;
        this.A01 = r8;
        this.A08 = r9;
        this.A0A = r5;
        this.A03 = r10;
        this.A06 = r11;
        this.A0B = r12;
        this.A05 = r6;
    }
}
