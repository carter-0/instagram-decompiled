package X;

/* renamed from: X.GRc  reason: case insensitive filesystem */
public final class C52402GRc extends AnonymousClass0T0 {
    public final long A00;
    public final long A01;
    public final AnonymousClass62P A02;
    public final AnonymousClass62P A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52402GRc) {
                C52402GRc gRc = (C52402GRc) obj;
                if (!0qQ.A0K(this.A04, gRc.A04) || this.A01 != gRc.A01 || this.A00 != gRc.A00 || !0qQ.A0K(this.A03, gRc.A03) || !0qQ.A0K(this.A02, gRc.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A01(this.A00, AnonymousClass7TF.A01(this.A01, AnonymousClass7TE.A0O(this.A04)))) + AnonymousClass7TG.A0C(this.A02);
    }

    public C52402GRc(String str, AnonymousClass62P r2, AnonymousClass62P r3, long j, long j2) {
        C51972G9s.A1B(str, r2);
        this.A04 = str;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = r2;
        this.A02 = r3;
    }
}
