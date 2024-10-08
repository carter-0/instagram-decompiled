package X;

/* renamed from: X.GlG  reason: case insensitive filesystem */
public final class C53268GlG extends AnonymousClass0T0 {
    public final JMC A00;
    public final Integer A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53268GlG) {
                C53268GlG glG = (C53268GlG) obj;
                if (!(this.A02 == glG.A02 && this.A01 == glG.A01 && 0qQ.A0K(this.A00, glG.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A05 = C51965G9l.A05(this.A02);
        int intValue = this.A01.intValue();
        if (1 != intValue) {
            str = "SET";
        } else {
            str = "UNSET";
        }
        return AnonymousClass7TE.A0N(this.A00, C51971G9r.A0F(str, intValue, A05));
    }

    public C53268GlG(JMC jmc, Integer num, boolean z) {
        this.A02 = z;
        this.A01 = num;
        this.A00 = jmc;
    }
}
