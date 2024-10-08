package X;

/* renamed from: X.I1s  reason: case insensitive filesystem */
public final class C56564I1s {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56564I1s) {
                C56564I1s i1s = (C56564I1s) obj;
                if (!0qQ.A0K(this.A01, i1s.A01) || !0qQ.A0K(this.A02, i1s.A02) || !0qQ.A0K(this.A03, i1s.A03) || !0qQ.A0K(this.A05, i1s.A05) || !0qQ.A0K(this.A04, i1s.A04) || !0qQ.A0K(this.A06, i1s.A06) || !0qQ.A0K(this.A00, i1s.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01)))))));
    }

    public C56564I1s(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = str4;
        this.A04 = str5;
        this.A06 = str6;
        this.A00 = str7;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetaAiLinks(aiDisclosuresLink=");
        A1A.append(this.A01);
        A1A.append(", aiTermsLink=");
        A1A.append(this.A02);
        A1A.append(", privacyCenterLink=");
        A1A.append(this.A03);
        A1A.append(", appLevelPrivacyCenterLink=");
        A1A.append(this.A05);
        A1A.append(", privacyPolicyLink=");
        A1A.append(this.A04);
        A1A.append(", learnMoreLink=");
        A1A.append(this.A06);
        A1A.append(", aiAtMetaLink=");
        return C51975G9x.A0i(this.A00, A1A);
    }

    public C56564I1s() {
        this("", "", "", "", "", "", "");
    }
}
