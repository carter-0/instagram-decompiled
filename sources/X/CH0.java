package X;

import com.instagram.common.typedurl.ImageUrl;

public final class CH0 extends H3E {
    public final ImageUrl A00;
    public final 1Xj A01;
    public final C44056CTz A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public CH0(ImageUrl imageUrl, 1Xj r3, C44056CTz cTz, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str4, 6);
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A00 = imageUrl;
        this.A09 = z;
        this.A03 = str4;
        this.A05 = str5;
        this.A04 = str6;
        this.A01 = r3;
        this.A0A = z2;
        this.A0C = z3;
        this.A0B = z4;
        this.A02 = cTz;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CH0) {
                CH0 ch0 = (CH0) obj;
                if (!0qQ.A0K(this.A06, ch0.A06) || !0qQ.A0K(this.A07, ch0.A07) || !0qQ.A0K(this.A08, ch0.A08) || !0qQ.A0K(this.A00, ch0.A00) || this.A09 != ch0.A09 || !0qQ.A0K(this.A03, ch0.A03) || !0qQ.A0K(this.A05, ch0.A05) || !0qQ.A0K(this.A04, ch0.A04) || !0qQ.A0K(this.A01, ch0.A01) || this.A0A != ch0.A0A || this.A0C != ch0.A0C || this.A0B != ch0.A0B || !0qQ.A0K(this.A02, ch0.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ImageUrl A04() {
        return this.A00;
    }

    public final String A05() {
        return this.A03;
    }

    public final String A06() {
        return this.A06;
    }

    public final String A07() {
        return this.A07;
    }

    public final String A08() {
        return this.A08;
    }

    public final boolean A0A() {
        return this.A09;
    }

    public final 1Xj A0B() {
        return this.A01;
    }

    public final String A0C() {
        return this.A04;
    }

    public final String A0D() {
        return this.A05;
    }

    public final boolean A0E() {
        return this.A0A;
    }

    public final boolean A0F() {
        return this.A0C;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A08(this.A07, AnonymousClass7TE.A0O(this.A06)))))))))))) + AnonymousClass7TG.A0C(this.A02);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OriginalAudio(primaryText=");
        sb.append(this.A06);
        sb.append(AnonymousClass000.A00(852));
        sb.append(this.A07);
        sb.append(AnonymousClass000.A00(854));
        sb.append(this.A08);
        sb.append(C66579MXk.A00(46));
        sb.append(this.A00);
        sb.append(", isChecked=");
        sb.append(this.A09);
        sb.append(", id=");
        sb.append(this.A03);
        sb.append(", mediaId=");
        sb.append(this.A05);
        sb.append(", mediaAuthorId=");
        sb.append(this.A04);
        sb.append(", media=");
        sb.append(this.A01);
        sb.append(AnonymousClass000.A00(846));
        sb.append(this.A0A);
        sb.append(", isTrending=");
        sb.append(this.A0C);
        sb.append(AnonymousClass000.A00(847));
        sb.append(this.A0B);
        sb.append(", originalAudioConsumptionModel=");
        return AnonymousClass7TG.A0n(this.A02, sb);
    }
}
