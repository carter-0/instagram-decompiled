package X;

/* renamed from: X.9Ir  reason: invalid class name and case insensitive filesystem */
public final class C376619Ir extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final String A02;

    public C376619Ir(int i, String str) {
        this.A00 = 1;
        0qQ.A0B(str, 2);
        this.A01 = i;
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
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C376619Ir)) {
                    return false;
                }
                C376619Ir r3 = (C376619Ir) obj;
                if (r3.A00 == 1 && this.A01 == r3.A01 && 0qQ.A0K(this.A02, r3.A02)) {
                    return true;
                }
                return false;
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (!(obj instanceof C376619Ir)) {
            return false;
        }
        C376619Ir r32 = (C376619Ir) obj;
        if (r32.A00 == i && 0qQ.A0K(this.A02, r32.A02) && this.A01 == r32.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        if (1 - this.A00 != 0) {
            i = this.A02.hashCode() * 31;
            hashCode = this.A01;
        } else {
            i = this.A01 * 31;
            hashCode = this.A02.hashCode();
        }
        return i + hashCode;
    }

    public final String toString() {
        StringBuilder sb;
        switch (this.A00) {
            case 1:
                sb = new StringBuilder();
                sb.append("NFTruncationConfig(limit=");
                sb.append(this.A01);
                sb.append(", controlTitle=");
                sb.append(this.A02);
                break;
            case 2:
                sb = new StringBuilder();
                sb.append("SegmentFrame(segmentId=");
                sb.append(this.A02);
                sb.append(", frameMs=");
                sb.append(this.A01);
                break;
            default:
                return super.toString();
        }
        sb.append(')');
        return sb.toString();
    }

    public C376619Ir(String str, int i, int i2) {
        this.A00 = i2;
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A01 = i;
    }
}
