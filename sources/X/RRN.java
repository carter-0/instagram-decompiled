package X;

public final class RRN {
    public double A00;
    public int A01;
    public long A02;
    public long A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RRN) {
                RRN rrn = (RRN) obj;
                if (!(this.A03 == rrn.A03 && this.A02 == rrn.A02 && Double.compare(this.A00, rrn.A00) == 0 && this.A01 == rrn.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A03;
        return Pxi.A03((AnonymousClass7TF.A01(this.A02, ((int) (j ^ (j >>> 32))) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A00))) * 31, C54732HQn.A00()) + this.A01;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("METAVideoMLConfig(transcodeVideoLowerEdgeSize=");
        A1A.append(this.A03);
        A1A.append(", transcodeVideoFPS=");
        A1A.append(this.A02);
        A1A.append(", creationFlowTimeoutSec=");
        A1A.append(this.A00);
        A1A.append(", enableEditStatus=");
        A1A.append(false);
        A1A.append(", enableUploadingMask=");
        A1A.append(false);
        A1A.append(", maxEditRequestRetries=");
        return C51975G9x.A0j(A1A, this.A01);
    }
}
