package X;

import java.util.List;

public final class Jv8 extends AnonymousClass0T0 {
    public final C366688pV A00;
    public final KN4 A01;
    public final JYK A02;
    public final String A03;
    public final List A04;
    public final List A05;
    public final List A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Jv8) {
                Jv8 jv8 = (Jv8) obj;
                if (!0qQ.A0K(this.A03, jv8.A03) || this.A02 != jv8.A02 || !0qQ.A0K(this.A01, jv8.A01) || !0qQ.A0K(this.A06, jv8.A06) || !0qQ.A0K(this.A00, jv8.A00) || !0qQ.A0K(this.A04, jv8.A04) || !0qQ.A0K(this.A05, jv8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A03);
        List list = this.A06;
        return AnonymousClass7TE.A0N(this.A05, AnonymousClass7TF.A07(this.A04, (AnonymousClass7TF.A07(list, (AnonymousClass7TF.A07(this.A02, A0O) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00)) * 31));
    }

    public Jv8(C366688pV r1, KN4 kn4, JYK jyk, String str, List list, List list2, List list3) {
        C51974G9v.A1L(str, jyk, list);
        C51972G9s.A1E(list2, list3);
        this.A03 = str;
        this.A02 = jyk;
        this.A01 = kn4;
        this.A06 = list;
        this.A00 = r1;
        this.A04 = list2;
        this.A05 = list3;
    }

    public Jv8() {
        this((C366688pV) null, (KN4) null, JYK.VIDEO, AnonymousClass7TF.A0b(), AnonymousClass7TE.A1C(), AnonymousClass7TE.A1C(), AnonymousClass7TE.A1C());
    }
}
