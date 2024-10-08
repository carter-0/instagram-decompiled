package X;

/* renamed from: X.HtD  reason: case insensitive filesystem */
public final class C56125HtD {
    public final String A00;
    public final boolean A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56125HtD) {
                C56125HtD htD = (C56125HtD) obj;
                if (!0qQ.A0K(this.A02, htD.A02) || !0qQ.A0K(this.A00, htD.A00) || !0qQ.A0K(this.A03, htD.A03) || this.A01 != htD.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A02);
        return DbS.A06(this.A01, (AnonymousClass7TF.A08(this.A00, A0O) + AnonymousClass7TG.A0E(this.A03)) * 31);
    }

    public C56125HtD(String str, String str2, String str3, boolean z) {
        this.A02 = str;
        this.A00 = str2;
        this.A03 = str3;
        this.A01 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CreatorAttribution(id=");
        A1A.append(this.A02);
        A1A.append(", name=");
        A1A.append(this.A00);
        A1A.append(", profilePicUri=");
        A1A.append(this.A03);
        A1A.append(", isVerified=");
        return G9t.A1C(A1A, this.A01);
    }
}
