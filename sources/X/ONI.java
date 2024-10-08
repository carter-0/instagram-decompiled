package X;

public final class ONI {
    public final C69329NjU A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ONI) {
                ONI oni = (ONI) obj;
                if (!0qQ.A0K(this.A01, oni.A01) || this.A00 != oni.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public ONI(C69329NjU njU, String str) {
        this.A01 = str;
        this.A00 = njU;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FetchHSMVirtualDeviceInfoResponse(virtualDeviceId=");
        A1A.append(this.A01);
        A1A.append(", pinNormalizationStatus=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
