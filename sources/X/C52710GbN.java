package X;

/* renamed from: X.GbN  reason: case insensitive filesystem */
public final class C52710GbN extends AnonymousClass0T0 {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public final int A04;

    public C52710GbN(float f, float f2, float f3, int i, int i2) {
        this.A04 = i2;
        switch (i2) {
            case 0:
            case 1:
                this.A00 = f;
                this.A01 = f2;
                this.A02 = f3;
                break;
            default:
                this.A02 = f;
                this.A00 = f2;
                this.A01 = f3;
                break;
        }
        this.A03 = i;
    }

    public final boolean equals(Object obj) {
        int i;
        C52710GbN gbN;
        float f;
        float f2;
        switch (this.A04) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C52710GbN) {
                    gbN = (C52710GbN) obj;
                    if (gbN.A04 == 2 && Float.compare(this.A02, gbN.A02) == 0 && Float.compare(this.A00, gbN.A00) == 0) {
                        f = this.A01;
                        f2 = gbN.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (!(obj instanceof C52710GbN)) {
            return false;
        }
        gbN = (C52710GbN) obj;
        if (gbN.A04 != i || Float.compare(this.A00, gbN.A00) != 0 || Float.compare(this.A01, gbN.A01) != 0) {
            return false;
        }
        f = this.A02;
        f2 = gbN.A02;
        if (Float.compare(f, f2) == 0 && this.A03 == gbN.A03) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A002;
        float f;
        if (2 - this.A04 != 0) {
            A002 = AnonymousClass7TF.A00(G9w.A00(this.A00), this.A01);
            f = this.A02;
        } else {
            A002 = AnonymousClass7TF.A00(G9w.A00(this.A02), this.A00);
            f = this.A01;
        }
        return AnonymousClass7TF.A00(A002, f) + this.A03;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C52710GbN() {
        this(0.0f, 0.0f, 0.0f, 0, 2);
        this.A04 = 2;
    }
}
