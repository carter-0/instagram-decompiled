package X;

/* renamed from: X.Gmb  reason: case insensitive filesystem */
public final class C53351Gmb extends AnonymousClass0T0 {
    public final float A00;
    public final int A01;

    public C53351Gmb(float f, int i) {
        this.A01 = i;
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A01) {
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
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            case 3:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
        }
        if (!(obj instanceof C53351Gmb)) {
            return false;
        }
        C53351Gmb gmb = (C53351Gmb) obj;
        if (gmb.A01 == i && Float.compare(this.A00, gmb.A00) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C53351Gmb() {
        this(0.0f, 2);
        this.A01 = 2;
    }
}
