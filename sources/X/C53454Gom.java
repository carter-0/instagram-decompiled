package X;

import java.util.List;

/* renamed from: X.Gom  reason: case insensitive filesystem */
public final class C53454Gom extends AnonymousClass0T0 implements DRJ {
    public final List A00;
    public final List A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53454Gom) {
                C53454Gom gom = (C53454Gom) obj;
                if (!0qQ.A0K(this.A00, gom.A00) || !0qQ.A0K(this.A01, gom.A01) || !0qQ.A0K(this.A02, gom.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00)) + AnonymousClass7TG.A0E(this.A02);
    }

    public C53454Gom(List list, List list2, String str) {
        AnonymousClass7TG.A1O(list, list2);
        this.A00 = list;
        this.A01 = list2;
        this.A02 = str;
    }
}
