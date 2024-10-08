package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.HIx  reason: case insensitive filesystem */
public final class C54562HIx extends C54721HQa {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public C54562HIx(String str, String str2, String str3, List list) {
        0qQ.A0B(list, 1);
        this.A04 = list;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (next instanceof C57590IdH) {
                A1C.add(next);
            }
        }
        this.A03 = A1C;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54562HIx) {
                C54562HIx hIx = (C54562HIx) obj;
                if (!0qQ.A0K(this.A04, hIx.A04) || !0qQ.A0K(this.A00, hIx.A00) || !0qQ.A0K(this.A01, hIx.A01) || !0qQ.A0K(this.A02, hIx.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TE.A0K(this.A04) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02)) * 31) + C54732HQn.A00();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Active(rows=");
        A1A.append(this.A04);
        A1A.append(", metagenRequestId=");
        A1A.append(this.A00);
        A1A.append(", metagenResponseId=");
        G9w.A1V(A1A, this.A01);
        A1A.append(this.A02);
        A1A.append(", lockHeightWhileLoading=");
        return G9t.A1C(A1A, false);
    }
}
