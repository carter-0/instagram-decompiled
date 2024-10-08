package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Jx5  reason: case insensitive filesystem */
public final class C61094Jx5 extends AnonymousClass0T0 implements MW4 {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61094Jx5) {
                C61094Jx5 jx5 = (C61094Jx5) obj;
                if (!0qQ.A0K(this.A01, jx5.A01) || !0qQ.A0K(this.A02, jx5.A02) || !0qQ.A0K(this.A00, jx5.A00) || !0qQ.A0K(this.A03, jx5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A03, AnonymousClass7TF.A07(this.A00, ((AnonymousClass7TG.A0E(this.A01) * 31) + C41845B3m.A00(this.A02)) * 31));
    }

    public C61094Jx5(ImageUrl imageUrl, String str, String str2, String str3) {
        C51972G9s.A1D(imageUrl, str3);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = imageUrl;
        this.A03 = str3;
    }
}
