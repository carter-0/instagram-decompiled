package X;

import java.util.Map;
import java.util.Set;

public final class Q37 {
    public final C277014uI A00;
    public final C277014uI A01;
    public final C277014uI A02;
    public final C277014uI A03;
    public final String A04;
    public final Map A05;
    public final Set A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Q37) {
                Q37 q37 = (Q37) obj;
                if (!0qQ.A0K(this.A04, q37.A04) || !0qQ.A0K(this.A00, q37.A00) || !0qQ.A0K(this.A03, q37.A03) || !0qQ.A0K(this.A02, q37.A02) || !0qQ.A0K(this.A06, q37.A06) || !0qQ.A0K(this.A05, q37.A05) || !0qQ.A0K(this.A01, q37.A01) || this.A07 != q37.A07 || this.A08 != q37.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A04);
        return DbS.A06(this.A08, AnonymousClass7TF.A09(this.A07, (((((((((AnonymousClass7TF.A07(this.A00, A0O) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31));
    }

    public Q37(C277014uI r1, C277014uI r2, C277014uI r3, C277014uI r4, String str, Map map, Set set, boolean z, boolean z2) {
        this.A04 = str;
        this.A00 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A06 = set;
        this.A05 = map;
        this.A01 = r4;
        this.A07 = z;
        this.A08 = z2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ScopedBloksComponentQueryDefinition(id=");
        A1A.append(this.A04);
        A1A.append(", appIdExpression=");
        A1A.append(this.A00);
        A1A.append(", paramsExpression=");
        A1A.append(this.A03);
        A1A.append(", clientParamsExpression=");
        A1A.append(this.A02);
        A1A.append(", dependencies=");
        A1A.append(this.A06);
        A1A.append(", targets=");
        A1A.append(this.A05);
        A1A.append(", cacheTTLExpression=");
        A1A.append(this.A01);
        A1A.append(", isDiskCacheEnabled=");
        A1A.append(this.A07);
        A1A.append(", isScoped=");
        return G9t.A1C(A1A, this.A08);
    }
}
