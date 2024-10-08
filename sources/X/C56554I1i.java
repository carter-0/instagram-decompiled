package X;

/* renamed from: X.I1i  reason: case insensitive filesystem */
public final class C56554I1i {
    public final float A00;
    public final HLO A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56554I1i) {
                C56554I1i i1i = (C56554I1i) obj;
                if (!(Float.compare(this.A00, i1i.A00) == 0 && this.A01 == i1i.A01 && this.A02 == i1i.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A07(this.A01, G9w.A00(this.A00)));
    }

    public C56554I1i(HLO hlo, float f, boolean z) {
        this.A00 = f;
        this.A01 = hlo;
        this.A02 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AssetData(radius=");
        A1A.append(this.A00);
        A1A.append(", assetType=");
        A1A.append(this.A01);
        A1A.append(", isActive=");
        return G9t.A1C(A1A, this.A02);
    }

    public C56554I1i() {
        this(HLO.CIRCLE, 6.0f, false);
    }
}
