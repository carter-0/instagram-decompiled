package X;

public final class QP1 extends AnonymousClass0T0 {
    public final boolean A00;
    public final C8951RIq A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QP1) {
                QP1 qp1 = (QP1) obj;
                if (!(this.A00 == qp1.A00 && this.A01 == qp1.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return (i * 31) + AnonymousClass7TG.A0C(this.A01);
    }

    public QP1(C8951RIq rIq, boolean z) {
        this.A00 = z;
        this.A01 = rIq;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RedirectResult(isFallback=");
        A1A.append(this.A00);
        A1A.append(", reason=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }

    public QP1() {
        this((C8951RIq) null, true);
    }
}
