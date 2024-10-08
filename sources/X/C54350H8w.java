package X;

import java.util.List;

/* renamed from: X.H8w  reason: case insensitive filesystem */
public final class C54350H8w extends HPJ {
    public final Integer A00;
    public final List A01;
    public final boolean A02;

    public C54350H8w(Integer num, List list, boolean z) {
        0qQ.A0B(num, 3);
        this.A01 = list;
        this.A02 = z;
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54350H8w) {
                C54350H8w h8w = (C54350H8w) obj;
                if (!(0qQ.A0K(this.A01, h8w.A01) && this.A02 == h8w.A02 && this.A00 == h8w.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0K(this.A01)) + C54896HXe.A00(this.A00);
    }
}
