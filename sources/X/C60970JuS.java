package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JuS  reason: case insensitive filesystem */
public final class C60970JuS extends AnonymousClass0T0 {
    public final int A00;
    public final ImageUrl A01;
    public final C247733gp A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C60970JuS(ImageUrl imageUrl, C247733gp r3, Long l, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str, 1);
        this.A06 = str;
        this.A01 = imageUrl;
        this.A04 = str2;
        this.A03 = l;
        this.A05 = str3;
        this.A07 = z;
        this.A08 = z2;
        this.A00 = i;
        this.A09 = z3;
        this.A02 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60970JuS) {
                C60970JuS juS = (C60970JuS) obj;
                if (!0qQ.A0K(this.A06, juS.A06) || !0qQ.A0K(this.A01, juS.A01) || !0qQ.A0K(this.A04, juS.A04) || !0qQ.A0K(this.A03, juS.A03) || !0qQ.A0K(this.A05, juS.A05) || this.A07 != juS.A07 || this.A08 != juS.A08 || this.A00 != juS.A00 || this.A09 != juS.A09 || !0qQ.A0K(this.A02, juS.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A07, (((((((AnonymousClass7TE.A0O(this.A06) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31);
        return AnonymousClass7TF.A09(this.A09, (AnonymousClass7TF.A09(this.A08, A092) + this.A00) * 31) + AnonymousClass7TE.A0L(this.A02);
    }
}
