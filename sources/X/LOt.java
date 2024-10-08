package X;

public final class LOt {
    public final int A00;
    public final C62637KjI A01;
    public final boolean A02;

    public LOt(C62637KjI kjI, int i, boolean z) {
        0qQ.A0B(kjI, 1);
        this.A01 = kjI;
        this.A02 = z;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LOt) {
                LOt lOt = (LOt) obj;
                if (!(this.A01 == lOt.A01 && this.A02 == lOt.A02 && this.A00 == lOt.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0K(this.A01) * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ImageUploadConfig(namespace=");
        A1A.append(this.A01);
        A1A.append(Pxd.A00(304));
        A1A.append((String) null);
        A1A.append(", shouldEnableDedupPolicy=");
        A1A.append(this.A02);
        A1A.append(", bitmapQuality=");
        return C51975G9x.A0j(A1A, this.A00);
    }

    public LOt() {
        this(C62637KjI.A0K, 100, false);
    }
}
