package X;

/* renamed from: X.IdD  reason: case insensitive filesystem */
public final class C57586IdD implements C59585JPf {
    public final int A00;
    public final String A01;
    public final C62320sa A02;
    public final C62320sa A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C57586IdD) {
                C57586IdD idD = (C57586IdD) obj;
                if (this.A00 != idD.A00 || !0qQ.A0K(this.A01, idD.A01) || !0qQ.A0K(this.A03, idD.A03) || !0qQ.A0K(this.A02, idD.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int BEU() {
        return this.A00;
    }

    public final C53913GwJ Ezr(C70832Wc r5) {
        return C55237HeS.A00(HNO.A0Y, this.A01, this.A03, this.A02);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A08(this.A01, this.A00 * 31)));
    }

    public C57586IdD(String str, C62320sa r2, C62320sa r3, int i) {
        this.A00 = i;
        this.A01 = str;
        this.A03 = r2;
        this.A02 = r3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Enabled(id=");
        A1A.append(this.A00);
        A1A.append(", text=");
        A1A.append(this.A01);
        A1A.append(", onVisible=");
        A1A.append(this.A03);
        A1A.append(", onClick=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
