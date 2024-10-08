package X;

/* renamed from: X.4Ej  reason: invalid class name and case insensitive filesystem */
public final class C262474Ej extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C262474Ej) {
                C262474Ej r8 = (C262474Ej) obj;
                if (!(this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        return (this.A00 * 31) + ((int) (j ^ (j >>> 32)));
    }

    public C262474Ej(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }
}
