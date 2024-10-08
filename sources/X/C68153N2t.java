package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.N2t  reason: case insensitive filesystem */
public final class C68153N2t extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final ImageUrl A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68153N2t) {
                C68153N2t n2t = (C68153N2t) obj;
                if (!0qQ.A0K(this.A04, n2t.A04) || this.A01 != n2t.A01 || !0qQ.A0K(this.A02, n2t.A02) || !0qQ.A0K(this.A03, n2t.A03) || !0qQ.A0K(this.A05, n2t.A05) || this.A00 != n2t.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A07(this.A02, C51972G9s.A07(this.A01, AnonymousClass7TE.A0O(this.A04))))) + this.A00;
    }

    public C68153N2t(ImageUrl imageUrl, String str, String str2, String str3, int i, long j) {
        this.A04 = str;
        this.A01 = j;
        this.A02 = imageUrl;
        this.A03 = str2;
        this.A05 = str3;
        this.A00 = i;
    }
}
