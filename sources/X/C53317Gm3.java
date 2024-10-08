package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;

/* renamed from: X.Gm3  reason: case insensitive filesystem */
public final class C53317Gm3 extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final ImageUrl A02;
    public final ImageUrl A03;
    public final Reel A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53317Gm3) {
                C53317Gm3 gm3 = (C53317Gm3) obj;
                if (!0qQ.A0K(this.A05, gm3.A05) || !0qQ.A0K(this.A04, gm3.A04) || !0qQ.A0K(this.A02, gm3.A02) || this.A01 != gm3.A01 || this.A09 != gm3.A09 || !0qQ.A0K(this.A07, gm3.A07) || !0qQ.A0K(this.A08, gm3.A08) || !0qQ.A0K(this.A03, gm3.A03) || this.A0A != gm3.A0A || !0qQ.A0K(this.A06, gm3.A06) || this.A00 != gm3.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A05);
        boolean z = this.A09;
        return AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A09(this.A0A, (((((AnonymousClass7TF.A09(z, (((AnonymousClass7TF.A07(this.A04, A0O) + AnonymousClass7TG.A0C(this.A02)) * 31) + this.A01) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TE.A0L(this.A03)) * 31)) + this.A00;
    }

    public C53317Gm3(ImageUrl imageUrl, ImageUrl imageUrl2, Reel reel, String str, String str2, String str3, String str4, int i, int i2, boolean z, boolean z2) {
        this.A05 = str;
        this.A04 = reel;
        this.A02 = imageUrl;
        this.A01 = i;
        this.A09 = z;
        this.A07 = str2;
        this.A08 = str3;
        this.A03 = imageUrl2;
        this.A0A = z2;
        this.A06 = str4;
        this.A00 = i2;
    }
}
