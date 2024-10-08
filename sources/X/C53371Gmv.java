package X;

/* renamed from: X.Gmv  reason: case insensitive filesystem */
public final class C53371Gmv extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53371Gmv) {
                C53371Gmv gmv = (C53371Gmv) obj;
                if (!0qQ.A0K(this.A02, gmv.A02) || !0qQ.A0K(this.A03, gmv.A03) || !0qQ.A0K(this.A01, gmv.A01) || this.A06 != gmv.A06 || this.A00 != gmv.A00 || !0qQ.A0K(this.A04, gmv.A04) || this.A05 != gmv.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A06;
        return DbS.A06(this.A05, (((AnonymousClass7TF.A09(z, ((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + this.A00) * 31) + C41845B3m.A00(this.A04)) * 31);
    }

    public C53371Gmv(String str, String str2, String str3, String str4, int i, boolean z, boolean z2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A06 = z;
        this.A00 = i;
        this.A04 = str4;
        this.A05 = z2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UiState(spinsAuthorName=");
        A1A.append(this.A02);
        A1A.append(", spinsContent=");
        A1A.append(this.A03);
        A1A.append(C66579MXk.A00(81));
        A1A.append(this.A01);
        A1A.append(", isSpinsLiked=");
        A1A.append(this.A06);
        A1A.append(AnonymousClass000.A00(848));
        A1A.append(this.A00);
        A1A.append(", timeStampText=");
        A1A.append(this.A04);
        A1A.append(", isSpinAuthorReachable=");
        return G9t.A1C(A1A, this.A05);
    }

    public C53371Gmv() {
        this((String) null, (String) null, (String) null, (String) null, 0, false, false);
    }
}
