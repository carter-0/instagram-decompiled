package X;

import java.util.List;

public final class UMq extends AnonymousClass0T0 implements C21009X9k {
    public final Integer A00;
    public final Integer A01;
    public final List A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UMq) {
                UMq uMq = (UMq) obj;
                if (!0qQ.A0K(this.A00, uMq.A00) || !0qQ.A0K(this.A03, uMq.A03) || !0qQ.A0K(this.A01, uMq.A01) || !0qQ.A0K(this.A02, uMq.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public UMq(Integer num, Integer num2, List list, List list2) {
        this.A00 = num;
        this.A03 = list;
        this.A01 = num2;
        this.A02 = list2;
    }
}
