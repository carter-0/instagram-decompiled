package X;

/* renamed from: X.9Is  reason: invalid class name and case insensitive filesystem */
public final class C376629Is extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final int A01;
    public final int A02;
    public final String A03;

    public C376629Is(String str, int i, int i2) {
        this.A03 = str;
        this.A02 = i;
        this.A01 = i2;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C376629Is)) {
                return false;
            }
            C376629Is r3 = (C376629Is) obj;
            if (r3.A00 == 1 && this.A01 == r3.A01 && this.A02 == r3.A02 && 0qQ.A0K(this.A03, r3.A03)) {
                return true;
            }
            return false;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C376629Is)) {
                return false;
            }
            C376629Is r32 = (C376629Is) obj;
            if (r32.A00 == 0 && 0qQ.A0K(this.A03, r32.A03) && this.A02 == r32.A02 && this.A01 == r32.A01) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int hashCode;
        int i;
        if (this.A00 != 0) {
            hashCode = ((this.A01 * 31) + this.A02) * 31;
            i = this.A03.hashCode();
        } else {
            hashCode = ((this.A03.hashCode() * 31) + this.A02) * 31;
            i = this.A01;
        }
        return hashCode + i;
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("TooltipDataItem(count=");
        sb.append(this.A01);
        sb.append(", resId=");
        sb.append(this.A02);
        sb.append(", useCase=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public C376629Is(int i, int i2, String str) {
        0qQ.A0B(str, 3);
        this.A01 = i;
        this.A02 = i2;
        this.A03 = str;
    }
}
