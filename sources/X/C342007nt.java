package X;

/* renamed from: X.7nt  reason: invalid class name and case insensitive filesystem */
public final class C342007nt extends AnonymousClass0T0 implements C358998bo {
    public final Integer A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C342007nt) {
                C342007nt r5 = (C342007nt) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.A00;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i = hashCode * 31;
        int i2 = 1237;
        if (this.A01) {
            i2 = 1231;
        }
        return i + i2;
    }

    public C342007nt(Integer num, boolean z) {
        this.A00 = num;
        this.A01 = z;
    }
}
