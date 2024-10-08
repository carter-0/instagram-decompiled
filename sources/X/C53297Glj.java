package X;

import java.util.List;

/* renamed from: X.Glj  reason: case insensitive filesystem */
public final class C53297Glj extends AnonymousClass0T0 {
    public final C43447ByN A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final AnonymousClass62P A04;
    public final int A05;
    public final List A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53297Glj) {
                C53297Glj glj = (C53297Glj) obj;
                if (!0qQ.A0K(this.A01, glj.A01) || !0qQ.A0K(this.A06, glj.A06) || this.A05 != glj.A05 || !0qQ.A0K(this.A00, glj.A00) || !0qQ.A0K(this.A03, glj.A03) || !0qQ.A0K(this.A02, glj.A02) || !0qQ.A0K(this.A04, glj.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A06)) * 31) + this.A05) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public C53297Glj(C43447ByN byN, String str, String str2, String str3, List list, AnonymousClass62P r6, int i) {
        this.A01 = str;
        this.A06 = list;
        this.A05 = i;
        this.A00 = byN;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = r6;
    }
}
