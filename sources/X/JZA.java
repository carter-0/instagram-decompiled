package X;

public final class JZA extends AnonymousClass0T0 {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final int A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public JZA(int i, int i2, boolean z, boolean z2) {
        this((String) null, z, z2, 4);
        boolean z3;
        int i3;
        this.A03 = i2;
        switch (i2) {
            case 0:
                z3 = JTP.A1X(i, z);
                z2 = (i & 2) != 0 ? false : z2;
                i3 = 0;
                break;
            case 2:
                z3 = JTP.A1X(i, z);
                z2 = (i & 2) != 0 ? false : z2;
                i3 = 2;
                break;
            default:
                return;
        }
        this((String) null, z3, z2, i3);
    }

    public final boolean equals(Object obj) {
        int i;
        JZA jza;
        boolean z;
        boolean z2;
        switch (this.A03) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof JZA)) {
                    return false;
                }
                JZA jza2 = (JZA) obj;
                if (jza2.A03 == 1 && this.A02 == jza2.A02 && 0qQ.A0K(this.A00, jza2.A00) && this.A01 == jza2.A01) {
                    return true;
                }
                return false;
            case 2:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof JZA) {
                    jza = (JZA) obj;
                    if (jza.A03 == 2 && this.A01 == jza.A01) {
                        z = this.A02;
                        z2 = jza.A02;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
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
        if (!(obj instanceof JZA)) {
            return false;
        }
        jza = (JZA) obj;
        if (jza.A03 != i || this.A02 != jza.A02) {
            return false;
        }
        z = this.A01;
        z2 = jza.A01;
        if (z != z2 || !0qQ.A0K(this.A00, jza.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08;
        int i;
        int A05;
        boolean z;
        switch (this.A03) {
            case 1:
                A08 = AnonymousClass7TF.A08(this.A00, C51965G9l.A05(this.A02));
                i = 1237;
                if (this.A01) {
                    i = 1231;
                    break;
                }
                break;
            case 2:
                A05 = C51965G9l.A05(this.A01);
                z = this.A02;
                break;
            default:
                A05 = C51965G9l.A05(this.A02);
                z = this.A01;
                break;
        }
        A08 = AnonymousClass7TF.A09(z, A05);
        i = AnonymousClass7TG.A0E(this.A00);
        return A08 + i;
    }

    public JZA(String str, boolean z, boolean z2) {
        this.A03 = 1;
        0qQ.A0B(str, 2);
        this.A02 = z;
        this.A00 = str;
        this.A01 = z2;
    }

    public JZA(String str, boolean z, boolean z2, int i) {
        this.A03 = i;
        switch (i) {
            case 0:
            case 3:
            case 4:
                this.A02 = z;
                this.A01 = z2;
                break;
            default:
                this.A01 = z;
                this.A02 = z2;
                break;
        }
        this.A00 = str;
    }
}
