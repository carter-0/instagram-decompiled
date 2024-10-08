package X;

/* renamed from: X.ONd  reason: case insensitive filesystem */
public final class C70831ONd {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C70831ONd) {
                C70831ONd oNd = (C70831ONd) obj;
                if (!0qQ.A0K(this.A02, oNd.A02) || !0qQ.A0K(this.A01, oNd.A01) || this.A00 != oNd.A00 || !0qQ.A0K(this.A03, oNd.A03) || this.A04 != oNd.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A02);
        return DbS.A06(this.A04, AnonymousClass7TF.A08(this.A03, (AnonymousClass7TF.A08(this.A01, A0O) + this.A00) * 31));
    }

    public C70831ONd(String str, String str2, String str3, int i, boolean z) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A03 = str3;
        this.A04 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ZeroHeadersConfigFetchResponseData(pingUri=");
        A1A.append(this.A02);
        A1A.append(", headwindProgram=");
        A1A.append(this.A01);
        A1A.append(", carrierId=");
        A1A.append(this.A00);
        A1A.append(", usage=");
        A1A.append(this.A03);
        A1A.append(", isOptedOut=");
        return G9t.A1C(A1A, this.A04);
    }
}
