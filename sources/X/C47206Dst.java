package X;

import java.util.List;

/* renamed from: X.Dst  reason: case insensitive filesystem */
public final class C47206Dst extends AnonymousClass0T0 implements C51934G8c {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47206Dst) {
                C47206Dst dst = (C47206Dst) obj;
                if (!0qQ.A0K(this.A01, dst.A01) || !0qQ.A0K(this.A00, dst.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C47206Dst(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
