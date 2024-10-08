package X;

/* renamed from: X.6Kk  reason: invalid class name and case insensitive filesystem */
public final class C306006Kk extends AnonymousClass0T0 {
    public final long A00;
    public final AnonymousClass9J0 A01;
    public final short A02;
    public final short A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C306006Kk) {
                C306006Kk r8 = (C306006Kk) obj;
                if (!(this.A02 == r8.A02 && this.A00 == r8.A00 && 0qQ.A0K(this.A01, r8.A01) && this.A03 == r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavigationOutcome(actionId=");
        sb.append(this.A02);
        sb.append(", finishTime=");
        sb.append(this.A00);
        sb.append(", interrupt=");
        sb.append(this.A01);
        sb.append(", granularActionId=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        long j = this.A00;
        int i = ((this.A02 * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        AnonymousClass9J0 r0 = this.A01;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        return ((i + hashCode) * 31) + this.A03;
    }

    public C306006Kk(AnonymousClass9J0 r1, long j, short s, short s2) {
        this.A02 = s;
        this.A00 = j;
        this.A01 = r1;
        this.A03 = s2;
    }
}
