package X;

/* renamed from: X.7QO  reason: invalid class name */
public final class AnonymousClass7QO extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final Integer A02;
    public final AnonymousClass7QM A03;

    public AnonymousClass7QO(AnonymousClass7QM r2, Integer num, int i, long j) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(num, 3);
        this.A03 = r2;
        this.A00 = i;
        this.A02 = num;
        this.A01 = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7QO) {
                AnonymousClass7QO r8 = (AnonymousClass7QO) obj;
                if (!(this.A03 == r8.A03 && this.A00 == r8.A00 && this.A02 == r8.A02 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode = ((this.A03.hashCode() * 31) + this.A00) * 31;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "FLUSH_APPEND";
                break;
            case 2:
                str = "DURATION_BASED";
                break;
            default:
                str = "APPEND";
                break;
        }
        int hashCode2 = (hashCode + str.hashCode() + intValue) * 31;
        long j = this.A01;
        return hashCode2 + ((int) (j ^ (j >>> 32)));
    }
}
