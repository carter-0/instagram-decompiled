package X;

public final class SST {
    public final C13889TjC A00;
    public final C13883Tj6 A01;
    public final RH2 A02;

    public static C8086Qge A00(C13883Tj6 tj6, C8080QgY qgY, RH2 rh2) {
        qgY.A02 = new SST((C13889TjC) null, tj6, rh2);
        qgY.A03 = false;
        return new C8086Qge(qgY);
    }

    public static C8086Qge A01(C13883Tj6 tj6, C8080QgY qgY, RH2 rh2) {
        qgY.A04 = new SST((C13889TjC) null, tj6, rh2);
        qgY.A03 = false;
        return new C8086Qge(qgY);
    }

    public static void A02(C13883Tj6 tj6, C8080QgY qgY, RH2 rh2) {
        qgY.A04 = new SST((C13889TjC) null, tj6, rh2);
    }

    public static void A03(C13883Tj6 tj6, C8080QgY qgY, RH2 rh2) {
        qgY.A02 = new SST((C13889TjC) null, tj6, rh2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SST) {
                SST sst = (SST) obj;
                if (!0qQ.A0K(this.A01, sst.A01) || this.A02 != sst.A02 || !0qQ.A0K(this.A00, sst.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A01)) + AnonymousClass7TG.A0C(this.A00);
    }

    public SST(C13889TjC tjC, C13883Tj6 tj6, RH2 rh2) {
        AnonymousClass7TG.A1O(tj6, rh2);
        this.A01 = tj6;
        this.A02 = rh2;
        this.A00 = tjC;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("StringResourceWithTextStyle(stringResource=");
        A1A.append(this.A01);
        A1A.append(", textStyle=");
        A1A.append(this.A02);
        A1A.append(C273654mx.A00(1038));
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
