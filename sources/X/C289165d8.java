package X;

/* renamed from: X.5d8  reason: invalid class name and case insensitive filesystem */
public final class C289165d8 {
    public final long A00;

    public static final long A00(long j, long j2) {
        return (((long) (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) (((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32);
    }

    public static final long A01(long j, long j2) {
        return (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32);
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C289165d8) || j != ((C289165d8) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append((int) (j >> 32));
        sb.append(", ");
        sb.append((int) (j & 4294967295L));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ C289165d8(long j) {
        this.A00 = j;
    }
}
