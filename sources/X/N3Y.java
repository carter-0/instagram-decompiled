package X;

public final class N3Y extends AnonymousClass0T0 {
    public final int A00;
    public final 1iA A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3Y) {
                N3Y n3y = (N3Y) obj;
                if (!0qQ.A0K(this.A04, n3y.A04) || this.A01 != n3y.A01 || !0qQ.A0K(this.A02, n3y.A02) || !0qQ.A0K(this.A07, n3y.A07) || !0qQ.A0K(this.A06, n3y.A06) || this.A08 != n3y.A08 || !0qQ.A0K(this.A03, n3y.A03) || !0qQ.A0K(this.A05, n3y.A05) || this.A00 != n3y.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A04);
        String str = this.A07;
        return AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A09(this.A08, (AnonymousClass7TF.A08(str, (AnonymousClass7TF.A07(this.A01, A0O) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A06)) * 31))) + this.A00;
    }

    public N3Y(1iA r1, String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z) {
        this.A04 = str;
        this.A01 = r1;
        this.A02 = str2;
        this.A07 = str3;
        this.A06 = str4;
        this.A08 = z;
        this.A03 = str5;
        this.A05 = str6;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("NavigationFields(mediaId=");
        A1A.append(this.A04);
        A1A.append(", mediaType=");
        A1A.append(this.A01);
        A1A.append(", exploreSourceToken=");
        A1A.append(this.A02);
        A1A.append(", normalizedMediaId=");
        A1A.append(this.A07);
        A1A.append(C273654mx.A00(450));
        A1A.append(this.A06);
        A1A.append(", isArchived=");
        A1A.append(this.A08);
        A1A.append(", mediaAuthorId=");
        A1A.append(this.A03);
        A1A.append(", messageAuthorId=");
        A1A.append(this.A05);
        A1A.append(", carouselShareIndex=");
        return C51975G9x.A0j(A1A, this.A00);
    }
}
