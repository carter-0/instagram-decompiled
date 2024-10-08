package X;

/* renamed from: X.GmP  reason: case insensitive filesystem */
public final class C53339GmP extends AnonymousClass0T0 {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53339GmP) {
                C53339GmP gmP = (C53339GmP) obj;
                if (!(this.A03 == gmP.A03 && this.A01 == gmP.A01 && this.A00 == gmP.A00 && this.A02 == gmP.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return G9w.A02(((((this.A03 * 31 * 31) + this.A01) * 31) + this.A00) * 31, this.A02);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        C51975G9x.A1F(A1A, "LoggingStats(initialMedia=");
        A1A.append(", withoutLocationData=");
        A1A.append(this.A03);
        C51975G9x.A1F(A1A, ", hasDateTaken=");
        A1A.append(", withLocationData=");
        A1A.append(this.A01);
        A1A.append(", afterMLFilter=");
        A1A.append(this.A00);
        A1A.append(", withMLData=");
        A1A.append(this.A02);
        A1A.append(", afterLocationGrouping=");
        A1A.append(0);
        A1A.append(", afterMinGroupSize=");
        A1A.append(0);
        A1A.append(", afterDeduping=");
        return C51975G9x.A0j(A1A, 0);
    }
}
