package X;

/* renamed from: X.9I1  reason: invalid class name */
public final class AnonymousClass9I1 extends AnonymousClass0T0 {
    public int A00;
    public int A01;
    public final int A02;

    public AnonymousClass9I1(int i, int i2, int i3) {
        this.A02 = i3;
        switch (i3) {
            case 0:
            case 1:
            case 2:
            case 4:
                this.A01 = i;
                this.A00 = i2;
                return;
            default:
                this.A00 = i;
                this.A01 = i2;
                return;
        }
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        int i3;
        switch (this.A02) {
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
                if (this != obj) {
                    i3 = 2;
                    break;
                } else {
                    return true;
                }
            case 3:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9I1) {
                    AnonymousClass9I1 r3 = (AnonymousClass9I1) obj;
                    if (r3.A02 == 3 && this.A00 == r3.A00) {
                        i = this.A01;
                        i2 = r3.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            default:
                if (this != obj) {
                    i3 = 4;
                    break;
                } else {
                    return true;
                }
        }
        if (!(obj instanceof AnonymousClass9I1)) {
            return false;
        }
        AnonymousClass9I1 r32 = (AnonymousClass9I1) obj;
        if (r32.A02 != i3 || this.A01 != r32.A01) {
            return false;
        }
        i = this.A00;
        i2 = r32.A00;
        if (i != i2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        if (3 - this.A02 != 0) {
            i = this.A01 * 31;
            i2 = this.A00;
        } else {
            i = this.A00 * 31;
            i2 = this.A01;
        }
        return i + i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9I1() {
        this(0, 0, 1);
        this.A02 = 1;
    }
}
