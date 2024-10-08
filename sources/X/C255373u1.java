package X;

/* renamed from: X.3u1  reason: invalid class name and case insensitive filesystem */
public final class C255373u1 {
    public final int A00;
    public final String A01;

    public C255373u1(String str, int i) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C255373u1) {
                C255373u1 r5 = (C255373u1) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    public final String toString() {
        return 002.A0l("WorkGenerationalId(workSpecId=", this.A01, ", generation=", ')', this.A00);
    }
}
