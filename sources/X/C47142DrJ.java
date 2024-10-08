package X;

import java.util.List;

/* renamed from: X.DrJ  reason: case insensitive filesystem */
public final class C47142DrJ extends AnonymousClass0T0 {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47142DrJ) {
                C47142DrJ drJ = (C47142DrJ) obj;
                if (!0qQ.A0K(this.A00, drJ.A00) || !0qQ.A0K(this.A01, drJ.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C47142DrJ(List list, List list2) {
        this.A00 = list;
        this.A01 = list2;
    }
}
