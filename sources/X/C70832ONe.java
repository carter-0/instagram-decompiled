package X;

/* renamed from: X.ONe  reason: case insensitive filesystem */
public final class C70832ONe {
    public final C69356Njv A00;
    public final String A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final String A05;

    public C70832ONe(C69356Njv njv, Integer num, Long l, String str, String str2, String str3) {
        DbW.A1O(str, 2, num);
        this.A03 = l;
        this.A01 = str;
        this.A05 = str2;
        this.A00 = njv;
        this.A04 = str3;
        this.A02 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C70832ONe) {
                C70832ONe oNe = (C70832ONe) obj;
                if (!0qQ.A0K(this.A03, oNe.A03) || !0qQ.A0K(this.A01, oNe.A01) || !0qQ.A0K(this.A05, oNe.A05) || this.A00 != oNe.A00 || !0qQ.A0K(this.A04, oNe.A04) || this.A02 != oNe.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0C = AnonymousClass7TG.A0C(this.A03) * 31;
        int A07 = (AnonymousClass7TF.A07(this.A00, (AnonymousClass7TF.A08(this.A01, A0C) + AnonymousClass7TG.A0E(this.A05)) * 31) + C41845B3m.A00(this.A04)) * 31;
        Integer num = this.A02;
        return A07 + C51971G9r.A0D(num, C69687Nq9.A00(num));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VirtualDeviceMetadata(creationTimeSeconds=");
        A1A.append(this.A03);
        A1A.append(", id=");
        A1A.append(this.A01);
        A1A.append(", createdOn=");
        A1A.append(this.A05);
        A1A.append(", type=");
        A1A.append(this.A00);
        A1A.append(", cloudAccount=");
        A1A.append(this.A04);
        A1A.append(", migrationStatus=");
        return C51975G9x.A0i(C69687Nq9.A00(this.A02), A1A);
    }
}
