package X;

/* renamed from: X.N8y  reason: case insensitive filesystem */
public final class C68285N8y extends AnonymousClass0T0 implements C74269Prx {
    public final Integer A00;
    public final boolean A01;

    public C68285N8y(Integer num, boolean z) {
        0qQ.A0B(num, 1);
        this.A00 = num;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68285N8y) {
                C68285N8y n8y = (C68285N8y) obj;
                if (!(this.A00 == n8y.A00 && this.A01 == n8y.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        return DbS.A06(this.A01, C51971G9r.A0D(num, O2N.A00(num)) * 31);
    }
}
