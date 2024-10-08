package X;

import com.facebookpay.offsite.models.message.OffsiteData;

public final class ONO {
    public final long A00;
    public final OffsiteData A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ONO) {
                ONO ono = (ONO) obj;
                if (this.A00 != ono.A00 || !0qQ.A0K(this.A01, ono.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, C51975G9x.A03(this.A00));
    }

    public ONO(OffsiteData offsiteData, long j) {
        this.A00 = j;
        this.A01 = offsiteData;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("OffsiteDataValue(timestamp=");
        A1A.append(this.A00);
        A1A.append(", data=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
