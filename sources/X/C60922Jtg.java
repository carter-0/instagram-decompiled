package X;

/* renamed from: X.Jtg  reason: case insensitive filesystem */
public final class C60922Jtg extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60922Jtg) {
                C60922Jtg jtg = (C60922Jtg) obj;
                if (!(this.A02 == jtg.A02 && this.A00 == jtg.A00 && this.A01 == jtg.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A02.intValue();
        if (1 != intValue) {
            str = "DAYS";
        } else {
            str = "WEEKS";
        }
        return ((C51968G9o.A0F(str, intValue) + this.A00) * 31) + C51968G9o.A03(this.A01);
    }

    public C60922Jtg(Integer num, int i, long j) {
        this.A02 = num;
        this.A00 = i;
        this.A01 = j;
    }
}
