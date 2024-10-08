package X;

/* renamed from: X.Gmt  reason: case insensitive filesystem */
public final class C53369Gmt extends AnonymousClass0T0 {
    public long A00;
    public String A01;
    public final int A02;

    public C53369Gmt(long j, String str) {
        this.A02 = 0;
        this.A00 = j;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this.A02 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C53369Gmt)) {
                return false;
            }
            C53369Gmt gmt = (C53369Gmt) obj;
            if (gmt.A02 == 1 && 0qQ.A0K(this.A01, gmt.A01) && this.A00 == gmt.A00) {
                return true;
            }
            return false;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C53369Gmt)) {
                return false;
            }
            C53369Gmt gmt2 = (C53369Gmt) obj;
            if (gmt2.A02 == 0 && this.A00 == gmt2.A00 && 0qQ.A0K(this.A01, gmt2.A01)) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int A03;
        int hashCode;
        if (this.A02 != 0) {
            A03 = AnonymousClass7TE.A0O(this.A01);
            hashCode = C51968G9o.A03(this.A00);
        } else {
            A03 = C51975G9x.A03(this.A00);
            hashCode = this.A01.hashCode();
        }
        return A03 + hashCode;
    }

    public final String toString() {
        if (this.A02 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Event(timestamp=");
        A1A.append(this.A00);
        A1A.append(", type=");
        return C51975G9x.A0i(this.A01, A1A);
    }

    public C53369Gmt() {
        this.A02 = 1;
        this.A02 = 1;
        this.A02 = 1;
        this.A01 = "";
        this.A00 = 0;
    }
}
