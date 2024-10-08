package X;

/* renamed from: X.GrB  reason: case insensitive filesystem */
public final class C53596GrB extends AnonymousClass0T0 implements JNG {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C53596GrB(C53451Goj goj, String str, int i) {
        this.A00 = i;
        if (i != 0) {
            0qQ.A0B(str, 2);
        }
        this.A01 = goj;
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
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
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (!(obj instanceof C53596GrB)) {
            return false;
        }
        C53596GrB grB = (C53596GrB) obj;
        if (grB.A00 != i || !0qQ.A0K(this.A01, grB.A01) || !0qQ.A0K(this.A02, grB.A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        int A0C = AnonymousClass7TG.A0C(this.A01);
        if (i == 0) {
            return (A0C * 31) + C41845B3m.A00(this.A02);
        }
        return C41845B3m.A01(this.A02, A0C * 31);
    }
}
