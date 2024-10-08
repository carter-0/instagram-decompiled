package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class QP4 extends AnonymousClass0T0 {
    public long A00;
    public boolean A01;
    public final int A02;

    public QP4(long j, int i, boolean z) {
        this.A02 = i;
        this.A01 = z;
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A02) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (!(obj instanceof QP4)) {
            return false;
        }
        QP4 qp4 = (QP4) obj;
        if (qp4.A02 == i && this.A01 == qp4.A01 && this.A00 == qp4.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return (i * 31) + C51968G9o.A03(this.A00);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public QP4(DefaultConstructorMarker defaultConstructorMarker, int i, int i2, long j, boolean z) {
        this(0, 0, false);
        this.A02 = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public QP4() {
        this(0, 0, false);
        this.A02 = 0;
        this.A02 = 0;
    }
}
