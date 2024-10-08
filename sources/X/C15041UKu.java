package X;

import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.UKu  reason: case insensitive filesystem */
public final class C15041UKu extends AnonymousClass0T0 {
    public final ExtendedImageUrl A00;
    public final 1iA A01;
    public final AnonymousClass3VA A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final 1iA A0B;
    public final boolean A0C;

    public C15041UKu(ExtendedImageUrl extendedImageUrl, 1iA r3, 1iA r4, AnonymousClass3VA r5, Integer num, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C13988Tno.A1O(num, 6, r5);
        this.A07 = z;
        this.A01 = r3;
        this.A08 = z2;
        this.A0C = z3;
        this.A0B = r4;
        this.A03 = num;
        this.A00 = extendedImageUrl;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A02 = r5;
        this.A0A = z4;
        this.A09 = z5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15041UKu) {
                C15041UKu uKu = (C15041UKu) obj;
                if (!(this.A07 == uKu.A07 && this.A01 == uKu.A01 && this.A08 == uKu.A08 && this.A0C == uKu.A0C && this.A0B == uKu.A0B && this.A03 == uKu.A03 && 0qQ.A0K(this.A00, uKu.A00) && 0qQ.A0K(this.A05, uKu.A05) && 0qQ.A0K(this.A06, uKu.A06) && 0qQ.A0K(this.A04, uKu.A04) && this.A02 == uKu.A02 && this.A0A == uKu.A0A && this.A09 == uKu.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A072 = AnonymousClass7TF.A07(this.A0B, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A08, (C51965G9l.A05(this.A07) + AnonymousClass7TG.A0C(this.A01)) * 31)));
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = "VIDEO";
                break;
            case 2:
                str = "CAROUSEL";
                break;
            case 3:
                str = "PHOTO";
                break;
            case 4:
                str = "REEL";
                break;
            default:
                str = "IGTV";
                break;
        }
        String str2 = this.A05;
        return DbS.A06(this.A09, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A07(this.A02, (((AnonymousClass7TF.A08(str2, (C51971G9r.A0F(str, intValue, A072) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + C41845B3m.A00(this.A04)) * 31)));
    }
}
