package X;

/* renamed from: X.3u2  reason: invalid class name and case insensitive filesystem */
public final class C255383u2 {
    public final int A00;
    public final int A01;
    public final String A02;

    public C255383u2(String str, int i, int i2) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C255383u2) {
                C255383u2 r5 = (C255383u2) obj;
                if (!(0qQ.A0K(this.A02, r5.A02) && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SystemIdInfo(workSpecId=");
        sb.append(this.A02);
        sb.append(", generation=");
        sb.append(this.A00);
        sb.append(", systemId=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }
}
