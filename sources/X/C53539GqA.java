package X;

import java.util.List;

/* renamed from: X.GqA  reason: case insensitive filesystem */
public final class C53539GqA extends AnonymousClass0T0 implements JM4 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53539GqA) {
                C53539GqA gqA = (C53539GqA) obj;
                if (!0qQ.A0K(this.A03, gqA.A03) || !0qQ.A0K(this.A01, gqA.A01) || !0qQ.A0K(this.A02, gqA.A02) || !0qQ.A0K(this.A00, gqA.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TE.A0K(this.A03) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A00);
    }

    public C53539GqA(String str, String str2, String str3, List list) {
        this.A03 = list;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
