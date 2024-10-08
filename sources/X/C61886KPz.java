package X;

import java.util.List;

/* renamed from: X.KPz  reason: case insensitive filesystem */
public final class C61886KPz extends C62791KmT {
    public final String A00;
    public final List A01;
    public final List A02;

    public C61886KPz(List list, List list2, String str) {
        0qQ.A0B(list, 2);
        this.A00 = str;
        this.A01 = list;
        this.A02 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61886KPz) {
                C61886KPz kPz = (C61886KPz) obj;
                if (!0qQ.A0K(this.A00, kPz.A00) || !0qQ.A0K(this.A01, kPz.A01) || !0qQ.A0K(this.A02, kPz.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0O(this.A00)) + AnonymousClass7TG.A0C(this.A02);
    }
}
