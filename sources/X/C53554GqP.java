package X;

/* renamed from: X.GqP  reason: case insensitive filesystem */
public final class C53554GqP extends AnonymousClass0T0 implements JOQ {
    public final Integer A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53554GqP) {
                C53554GqP gqP = (C53554GqP) obj;
                if (!(this.A00 == gqP.A00 && this.A01 == gqP.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getId() {
        if (1 - this.A00.intValue() != 0) {
            return "Suggested";
        }
        return "Count";
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "Suggested";
        } else {
            str = "Count";
        }
        return DbS.A06(this.A01, C51968G9o.A0F(str, intValue));
    }

    public C53554GqP(Integer num, boolean z) {
        this.A00 = num;
        this.A01 = z;
    }
}
