package X;

import java.util.List;

/* renamed from: X.Dsf  reason: case insensitive filesystem */
public final class C47193Dsf extends AnonymousClass0T0 implements G8S {
    public final C47220Dt7 A00;
    public final Integer A01;
    public final Integer A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47193Dsf) {
                C47193Dsf dsf = (C47193Dsf) obj;
                if (!0qQ.A0K(this.A01, dsf.A01) || !0qQ.A0K(this.A02, dsf.A02) || !0qQ.A0K(this.A00, dsf.A00) || !0qQ.A0K(this.A03, dsf.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public C47193Dsf(C47220Dt7 dt7, Integer num, Integer num2, List list) {
        this.A01 = num;
        this.A02 = num2;
        this.A00 = dt7;
        this.A03 = list;
    }
}
