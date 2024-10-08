package X;

/* renamed from: X.GnJ  reason: case insensitive filesystem */
public final class C53387GnJ extends AnonymousClass0T0 {
    public int A00;
    public int A01;
    public String A02;
    public final int A03;

    public C53387GnJ(String str, int i, int i2) {
        this.A03 = 2;
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        int i3;
        switch (this.A03) {
            case 0:
                if (this != obj) {
                    i3 = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i3 = 1;
                    break;
                } else {
                    return true;
                }
            case 2:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C53387GnJ) {
                    C53387GnJ gnJ = (C53387GnJ) obj;
                    if (gnJ.A03 == 2 && 0qQ.A0K(this.A02, gnJ.A02) && this.A01 == gnJ.A01) {
                        i = this.A00;
                        i2 = gnJ.A00;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 3:
                if (this != obj) {
                    i3 = 3;
                    break;
                } else {
                    return true;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C53387GnJ)) {
                    return false;
                }
                C53387GnJ gnJ2 = (C53387GnJ) obj;
                if (gnJ2.A03 != 4 || !0qQ.A0K(this.A02, gnJ2.A02)) {
                    return false;
                }
                return true;
        }
        if (!(obj instanceof C53387GnJ)) {
            return false;
        }
        C53387GnJ gnJ3 = (C53387GnJ) obj;
        if (gnJ3.A03 != i3 || this.A00 != gnJ3.A00 || !0qQ.A0K(this.A02, gnJ3.A02)) {
            return false;
        }
        i = this.A01;
        i2 = gnJ3.A01;
        if (i != i2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O;
        int i;
        switch (this.A03) {
            case 2:
                A0O = (AnonymousClass7TE.A0O(this.A02) + this.A01) * 31;
                i = this.A00;
                break;
            case 4:
                return this.A02.hashCode();
            default:
                A0O = AnonymousClass7TF.A08(this.A02, this.A00 * 31);
                i = this.A01;
                break;
        }
        return A0O + i;
    }

    public final String toString() {
        if (4 - this.A03 != 0) {
            return super.toString();
        }
        return G9w.A0k("SeenState(mediaId=", this.A02);
    }

    public C53387GnJ(int i, String str, int i2, int i3) {
        this.A03 = i3;
        0qQ.A0B(str, 2);
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
    }

    public C53387GnJ(String str) {
        this.A03 = 4;
        this.A02 = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C53387GnJ() {
        this(0, "", 0, 3);
        this.A03 = 3;
    }
}
