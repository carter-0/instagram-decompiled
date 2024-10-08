package X;

import java.util.Map;

/* renamed from: X.Qnu  reason: case insensitive filesystem */
public final class C8314Qnu extends C9145RQw {
    public final C13632Tdy A00;
    public final Map A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C9145RQw)) {
                return false;
            }
            C8314Qnu qnu = (C8314Qnu) ((C9145RQw) obj);
            if (!this.A00.equals(qnu.A00) || !this.A01.equals(qnu.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ this.A01.hashCode();
    }

    public C8314Qnu(C13632Tdy tdy, Map map) {
        this.A00 = tdy;
        this.A01 = map;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SchedulerConfig{clock=");
        A1A.append(this.A00);
        A1A.append(", values=");
        return C66582MXn.A0v(this.A01, A1A);
    }
}
