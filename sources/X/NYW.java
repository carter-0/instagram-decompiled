package X;

import com.instagram.common.typedurl.ImageUrl;

public final class NYW extends AnonymousClass7FV implements AnonymousClass7FW {
    public final ImageUrl A00;
    public final ImageUrl A01;
    public final AnonymousClass7FE A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final AnonymousClass7FT A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NYW) {
                NYW nyw = (NYW) obj;
                if (!0qQ.A0K(this.A03, nyw.A03) || !0qQ.A0K(this.A00, nyw.A00) || !0qQ.A0K(this.A04, nyw.A04) || !0qQ.A0K(this.A05, nyw.A05) || !0qQ.A0K(this.A01, nyw.A01) || !0qQ.A0K(this.A02, nyw.A02) || !0qQ.A0K(this.A06, nyw.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A04, (AnonymousClass7TE.A0O(this.A03) + AnonymousClass7TG.A0C(this.A00)) * 31);
        return AnonymousClass7TE.A0N(this.A06, AnonymousClass7TF.A07(this.A02, (AnonymousClass7TF.A08(this.A05, A08) + AnonymousClass7TE.A0L(this.A01)) * 31));
    }

    public NYW(ImageUrl imageUrl, ImageUrl imageUrl2, AnonymousClass7FT r3, AnonymousClass7FE r4, String str, String str2, String str3) {
        super(r3);
        this.A03 = str;
        this.A00 = imageUrl;
        this.A04 = str2;
        this.A05 = str3;
        this.A01 = imageUrl2;
        this.A02 = r4;
        this.A06 = r3;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
