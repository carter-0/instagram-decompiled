package X;

/* renamed from: X.HtC  reason: case insensitive filesystem */
public final class C56124HtC {
    public final int A00;
    public final int A01;
    public final C54651HMi A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56124HtC) {
                C56124HtC htC = (C56124HtC) obj;
                if (!(this.A02 == htC.A02 && this.A00 == htC.A00 && this.A03 == htC.A03 && this.A01 == htC.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A03, ((AnonymousClass7TG.A0C(this.A02) * 31) + this.A00) * 31) + this.A01;
    }

    public C56124HtC(C54651HMi hMi, int i, int i2, boolean z) {
        this.A02 = hMi;
        this.A00 = i;
        this.A03 = z;
        this.A01 = i2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MEmuPoseInfo(currentPose=");
        A1A.append(this.A02);
        A1A.append(", currentPoseNumber=");
        A1A.append(this.A00);
        A1A.append(", captureCurrentPose=");
        A1A.append(this.A03);
        A1A.append(", totalPoseCount=");
        return C51975G9x.A0j(A1A, this.A01);
    }
}
