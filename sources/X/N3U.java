package X;

public final class N3U extends AnonymousClass0T0 {
    public final long A00;
    public final C67468MoN A01;
    public final Integer A02;
    public final String A03;
    public final Long A04;
    public final String A05;

    public N3U(C67468MoN moN, Integer num, Long l, String str, String str2, long j) {
        0qQ.A0B(num, 3);
        this.A03 = str;
        this.A00 = j;
        this.A02 = num;
        this.A01 = moN;
        this.A04 = l;
        this.A05 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3U) {
                N3U n3u = (N3U) obj;
                if (!0qQ.A0K(this.A03, n3u.A03) || this.A00 != n3u.A00 || this.A02 != n3u.A02 || this.A01 != n3u.A01 || !0qQ.A0K(this.A04, n3u.A04) || !0qQ.A0K(this.A05, n3u.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A03);
        return ((AnonymousClass7TF.A07(this.A01, (C51972G9s.A07(this.A00, A0O) + 543360879 + this.A02.intValue()) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + C41845B3m.A00(this.A05);
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SafetyIntervention(id=");
        A1A.append(this.A03);
        A1A.append(", expirationTime=");
        A1A.append(this.A00);
        A1A.append(C273654mx.A00(1077));
        if (this.A02 != null) {
            str = "EDUCATION_NOTICE";
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", uiType=");
        A1A.append(this.A01);
        A1A.append(", startTime=");
        A1A.append(this.A04);
        A1A.append(Pxd.A00(26));
        return C51975G9x.A0i(this.A05, A1A);
    }
}
