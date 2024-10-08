package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.NZy  reason: case insensitive filesystem */
public final class C68866NZy extends C69608Noq {
    public final ImageUrl A00;
    public final AnonymousClass3OA A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C68866NZy(ImageUrl imageUrl, AnonymousClass3OA r3, String str, String str2, String str3, boolean z) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A00 = imageUrl;
        this.A01 = r3;
        this.A04 = str2;
        this.A03 = str3;
        this.A05 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68866NZy) {
                C68866NZy nZy = (C68866NZy) obj;
                if (!0qQ.A0K(this.A02, nZy.A02) || !0qQ.A0K(this.A00, nZy.A00) || !0qQ.A0K(this.A01, nZy.A01) || !0qQ.A0K(this.A04, nZy.A04) || !0qQ.A0K(this.A03, nZy.A03) || this.A05 != nZy.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A05, (((((((AnonymousClass7TE.A0O(this.A02) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A03)) * 31);
    }
}
