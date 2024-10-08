package X;

import java.util.List;

/* renamed from: X.9bp  reason: invalid class name and case insensitive filesystem */
public final class C381479bp extends AnonymousClass0T0 {
    public final int A00;
    public final 1Xj A01;
    public final AnonymousClass3W1 A02;
    public final List A03;

    public C381479bp(1Xj r2, AnonymousClass3W1 r3, List list, int i) {
        0qQ.A0B(list, 3);
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = list;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381479bp) {
                C381479bp r5 = (C381479bp) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A01))) + this.A00;
    }
}
