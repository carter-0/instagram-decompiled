package X;

/* renamed from: X.5F4  reason: invalid class name */
public final class AnonymousClass5F4 extends AnonymousClass5F5 implements AnonymousClass2Ha {
    public final /* bridge */ /* synthetic */ Comparable B1S() {
        return Long.valueOf(this.A01);
    }

    public final /* bridge */ /* synthetic */ Comparable Byc() {
        return Long.valueOf(this.A00);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass5F4)) {
            return false;
        }
        if (isEmpty() && ((AnonymousClass5F4) obj).isEmpty()) {
            return true;
        }
        AnonymousClass5F5 r6 = (AnonymousClass5F5) obj;
        if (this.A00 == r6.A00 && this.A01 == r6.A01) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        if (this.A00 > this.A01) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append("..");
        sb.append(this.A01);
        return sb.toString();
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.A00;
        long j2 = 31 * (j ^ (j >>> 32));
        long j3 = this.A01;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    public AnonymousClass5F4(long j, long j2) {
        super(j, j2);
    }
}
