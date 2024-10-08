package X;

/* renamed from: X.5Iu  reason: invalid class name and case insensitive filesystem */
public final class C283685Iu extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final Long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C283685Iu) {
                C283685Iu r8 = (C283685Iu) obj;
                if (!(this.A00 == r8.A00 && this.A01 == r8.A01 && 0qQ.A0K(this.A02, r8.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScreenTimeSyncStateEntity(id=");
        sb.append(this.A00);
        sb.append(", lastSyncTime=");
        sb.append(this.A01);
        sb.append(", tiaLastIntervalEnd=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        long j = this.A01;
        int i = ((this.A00 * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.A02;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return i + hashCode;
    }

    public C283685Iu(Long l, int i, long j) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = l;
    }
}
