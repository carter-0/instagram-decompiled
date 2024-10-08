package X;

/* renamed from: X.NaU  reason: case insensitive filesystem */
public final class C68892NaU extends C69612Nou {
    public final String A00;
    public final String A01;
    public final 0sP A02;
    public final boolean A03;

    public C68892NaU(String str, String str2, 0sP r4, boolean z) {
        0qQ.A0B(str2, 2);
        this.A01 = str;
        this.A00 = str2;
        this.A03 = z;
        this.A02 = r4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68892NaU) {
                C68892NaU naU = (C68892NaU) obj;
                if (!0qQ.A0K(this.A01, naU.A01) || !0qQ.A0K(this.A00, naU.A00) || this.A03 != naU.A03 || !0qQ.A0K(this.A02, naU.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A08(this.A00, AnonymousClass7TG.A0E(this.A01) * 31)));
    }
}
