package X;

/* renamed from: X.8nX  reason: invalid class name and case insensitive filesystem */
public final class C365698nX extends C365708nY {
    public final int A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C365708nY) {
                C365698nX r8 = (C365698nX) ((C365708nY) obj);
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
        return ((this.A00 ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        int i = this.A00;
        long j = this.A01;
        StringBuilder sb = new StringBuilder();
        sb.append("EventRecord{eventType=");
        sb.append(i);
        sb.append(", eventTimestamp=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }

    public C365698nX(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }
}
