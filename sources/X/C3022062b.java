package X;

/* renamed from: X.62b  reason: invalid class name and case insensitive filesystem */
public final class C3022062b {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3022062b) {
                C3022062b r5 = (C3022062b) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || this.A01 != r5.A01 || this.A00 != r5.A00 || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.A02;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.A01) * 31) + this.A00) * 31) + this.A03.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Range(item=");
        sb.append(this.A02);
        sb.append(", start=");
        sb.append(this.A01);
        sb.append(", end=");
        sb.append(this.A00);
        sb.append(", tag=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public C3022062b(Object obj, int i, int i2) {
        this(obj, "", i, i2);
    }

    public C3022062b(Object obj, String str, int i, int i2) {
        this.A02 = obj;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
        if (i > i2) {
            throw new IllegalArgumentException("Reversed range is not supported");
        }
    }
}
