package X;

/* renamed from: X.5Rc  reason: invalid class name and case insensitive filesystem */
public abstract class C285385Rc {
    public final int A00;
    public final long A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C285385Rc r7 = (C285385Rc) obj;
        if (this.A00 == r7.A00 && 0qQ.A0K(this.A02, r7.A02) && this.A01 == r7.A01) {
            return true;
        }
        return false;
    }

    public final float A00(int i) {
        if (this instanceof C285375Rb) {
            return ((C285375Rb) this).A00;
        }
        if (this instanceof C285545Rs) {
            if (i == 0) {
                return 1.0f;
            }
            return 0.5f;
        } else if (this instanceof C285525Rq) {
            return 2.0f;
        } else {
            if (i == 0) {
                return 100.0f;
            }
            return 128.0f;
        }
    }

    public final float A01(int i) {
        float f;
        if (this instanceof C285375Rb) {
            return ((C285375Rb) this).A01;
        }
        if (this instanceof C285545Rs) {
            f = -0.5f;
        } else if (this instanceof C285525Rq) {
            return -2.0f;
        } else {
            f = -128.0f;
        }
        if (i == 0) {
            return 0.0f;
        }
        return f;
    }

    public int hashCode() {
        long j = this.A01;
        return (((this.A02.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.A00;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A02);
        sb.append(" (id=");
        sb.append(this.A00);
        sb.append(", model=");
        long j = this.A01;
        if (j == C285435Rh.A02) {
            str = "Rgb";
        } else if (j == C285435Rh.A03) {
            str = "Xyz";
        } else if (j == C285435Rh.A01) {
            str = "Lab";
        } else if (j == C285435Rh.A00) {
            str = "Cmyk";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    public C285385Rc(int i, String str, long j) {
        this.A02 = str;
        this.A01 = j;
        this.A00 = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
    }
}
