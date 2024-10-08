package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.MusicConsumptionModel;

/* renamed from: X.CGz  reason: case insensitive filesystem */
public final class C43885CGz extends H3E {
    public final ImageUrl A00;
    public final 1Xj A01;
    public final MusicConsumptionModel A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43885CGz) {
                C43885CGz cGz = (C43885CGz) obj;
                if (!0qQ.A0K(this.A06, cGz.A06) || !0qQ.A0K(this.A07, cGz.A07) || !0qQ.A0K(this.A08, cGz.A08) || !0qQ.A0K(this.A00, cGz.A00) || this.A09 != cGz.A09 || !0qQ.A0K(this.A03, cGz.A03) || !0qQ.A0K(this.A05, cGz.A05) || !0qQ.A0K(this.A04, cGz.A04) || !0qQ.A0K(this.A01, cGz.A01) || this.A0A != cGz.A0A || this.A0B != cGz.A0B || !0qQ.A0K(this.A02, cGz.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C43885CGz(ImageUrl imageUrl, 1Xj r3, MusicConsumptionModel musicConsumptionModel, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(musicConsumptionModel, 12);
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
        this.A0B = z3;
        this.A02 = musicConsumptionModel;
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
        return this.A0B;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A08(this.A07, AnonymousClass7TE.A0O(this.A06))))))))))));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Music(primaryText=");
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
        sb.append(this.A0B);
        sb.append(", musicConsumptionModel=");
        return AnonymousClass7TG.A0n(this.A02, sb);
    }
}
