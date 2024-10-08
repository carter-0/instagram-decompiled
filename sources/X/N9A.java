package X;

public final class N9A extends AnonymousClass0T0 implements C74269Prx {
    public String A00;
    public long A01;
    public String A02;
    public final Boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9A) {
                N9A n9a = (N9A) obj;
                if (!0qQ.A0K(this.A02, n9a.A02) || !0qQ.A0K(this.A00, n9a.A00) || this.A01 != n9a.A01 || !0qQ.A0K(this.A03, n9a.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51972G9s.A07(this.A01, ((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public N9A(Boolean bool, String str, String str2, long j) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = j;
        this.A03 = bool;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcScreenCaptureModel(actorId=");
        A1A.append(this.A02);
        A1A.append(", username=");
        A1A.append(this.A00);
        A1A.append(", actionTimeMs=");
        A1A.append(this.A01);
        A1A.append(C273654mx.A00(1083));
        return AnonymousClass7TG.A0n(this.A03, A1A);
    }
}
