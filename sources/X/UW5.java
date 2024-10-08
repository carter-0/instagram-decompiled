package X;

public final class UW5 extends C296745qZ implements Comparable {
    public long A00;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        UW5 uw5 = (UW5) obj;
        boolean z = false;
        if ((this.A00 & 4) == 4) {
            z = true;
        }
        boolean z2 = false;
        if ((uw5.A00 & 4) == 4) {
            z2 = true;
        }
        if (z == z2) {
            long j = this.A01 - uw5.A01;
            if (j == 0) {
                j = this.A00 - uw5.A00;
                if (j == 0) {
                    return 0;
                }
            }
            if (j > 0) {
                return 1;
            }
            return -1;
        } else if (z) {
            return 1;
        } else {
            return -1;
        }
    }
}
