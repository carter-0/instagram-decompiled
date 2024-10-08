package X;

import java.util.List;

/* renamed from: X.Dsl  reason: case insensitive filesystem */
public final class C47199Dsl extends AnonymousClass0T0 implements G8Z {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final List A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47199Dsl) {
                C47199Dsl dsl = (C47199Dsl) obj;
                if (!0qQ.A0K(this.A02, dsl.A02) || this.A00 != dsl.A00 || !0qQ.A0K(this.A03, dsl.A03) || this.A01 != dsl.A01 || !0qQ.A0K(this.A04, dsl.A04) || !0qQ.A0K(this.A06, dsl.A06) || !0qQ.A0K(this.A05, dsl.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A03;
        String str2 = this.A04;
        return AnonymousClass7TE.A0N(this.A05, (AnonymousClass7TF.A08(str2, (AnonymousClass7TF.A08(str, (AnonymousClass7TE.A0O(this.A02) + this.A00) * 31) + this.A01) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31);
    }

    public C47199Dsl(String str, String str2, String str3, List list, List list2, int i, int i2) {
        AnonymousClass7TG.A1P(str, str2);
        AnonymousClass7TF.A1E(str3, 5, list2);
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
        this.A01 = i2;
        this.A04 = str3;
        this.A06 = list;
        this.A05 = list2;
    }
}
