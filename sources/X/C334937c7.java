package X;

import com.instagram.model.mediatype.ProductType;

/* renamed from: X.7c7  reason: invalid class name and case insensitive filesystem */
public final class C334937c7 extends AnonymousClass0T0 implements C334127ai {
    public final ProductType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C334937c7(ProductType productType, String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(productType, 6);
        this.A02 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A03 = str4;
        this.A01 = str5;
        this.A00 = productType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C334937c7) {
                C334937c7 r5 = (C334937c7) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A02.hashCode() * 31) + this.A05.hashCode()) * 31;
        String str = this.A04;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.A03.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode();
    }
}
