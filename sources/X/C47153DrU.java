package X;

import java.util.List;

/* renamed from: X.DrU  reason: case insensitive filesystem */
public final class C47153DrU extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final List A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47153DrU) {
                C47153DrU drU = (C47153DrU) obj;
                if (!0qQ.A0K(this.A01, drU.A01) || !0qQ.A0K(this.A03, drU.A03) || this.A00 != drU.A00 || !0qQ.A0K(this.A02, drU.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A01);
        return AnonymousClass7TE.A0N(this.A02, (AnonymousClass7TF.A08(this.A03, A0O) + this.A00) * 31);
    }

    public C47153DrU(int i, String str, String str2, List list) {
        AnonymousClass7TG.A1O(str, str2);
        0qQ.A0B(list, 4);
        this.A01 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A02 = list;
    }
}
