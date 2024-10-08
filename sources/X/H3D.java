package X;

public final class H3D extends HPG {
    public final int A00;
    public final C268654dm A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3D) {
                H3D h3d = (H3D) obj;
                if (!(0qQ.A0K(this.A01, h3d.A01) && this.A00 == h3d.A00 && this.A02 == h3d.A02 && this.A04 == h3d.A04 && this.A03 == h3d.A03 && this.A06 == h3d.A06 && this.A05 == h3d.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A05, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A02, (AnonymousClass7TE.A0K(this.A01) + this.A00) * 31)))));
    }

    public H3D(C268654dm r1, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = z;
        this.A04 = z2;
        this.A03 = z3;
        this.A06 = z4;
        this.A05 = z5;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FailState(optionalResponse=");
        A1A.append(this.A01);
        A1A.append(", chunkIndex=");
        A1A.append(this.A00);
        A1A.append(", isFirstPage=");
        A1A.append(this.A02);
        A1A.append(", isRefreshing=");
        A1A.append(this.A04);
        A1A.append(", isPrefetchResponse=");
        A1A.append(this.A03);
        A1A.append(", isStreaming=");
        A1A.append(this.A06);
        A1A.append(", isRequestedFromCache=");
        return G9t.A1C(A1A, this.A05);
    }
}
