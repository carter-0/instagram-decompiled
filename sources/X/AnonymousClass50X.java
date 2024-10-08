package X;

import java.util.List;

/* renamed from: X.50X  reason: invalid class name */
public final class AnonymousClass50X extends AnonymousClass0T0 {
    public final int A00;
    public final AnonymousClass3W1 A01;
    public final List A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass50X) {
                AnonymousClass50X r5 = (AnonymousClass50X) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A00 * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode()) * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return hashCode + i;
    }

    public AnonymousClass50X(AnonymousClass3W1 r1, List list, int i, boolean z) {
        this.A00 = i;
        this.A02 = list;
        this.A01 = r1;
        this.A03 = z;
    }
}
