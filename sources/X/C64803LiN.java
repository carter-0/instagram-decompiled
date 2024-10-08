package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.LiN  reason: case insensitive filesystem */
public final class C64803LiN implements C232262tL {
    public final ImageUrl A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C64803LiN(ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, boolean z) {
        AnonymousClass7TG.A0w(1, str, imageUrl, imageUrl2);
        0qQ.A0B(str3, 6);
        this.A03 = str;
        this.A04 = str2;
        this.A01 = imageUrl;
        this.A00 = imageUrl2;
        this.A05 = z;
        this.A02 = str3;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64803LiN liN = (C64803LiN) obj;
        0qQ.A0B(liN, 0);
        if (!0qQ.A0K(this.A04, liN.A04) || !0qQ.A0K(this.A01, liN.A01) || !0qQ.A0K(this.A00, liN.A00) || this.A05 != liN.A05 || !0qQ.A0K(this.A02, liN.A02)) {
            return false;
        }
        return true;
    }
}
