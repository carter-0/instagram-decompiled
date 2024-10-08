package X;

import java.util.List;

/* renamed from: X.GoT  reason: case insensitive filesystem */
public final class C53436GoT extends AnonymousClass0T0 implements C46235DRq {
    public final String A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final String A04;
    public final String A05;

    public final C46235DRq E77(1E9 r1) {
        return this;
    }

    public final C53436GoT F1A(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53436GoT) {
                C53436GoT goT = (C53436GoT) obj;
                if (!0qQ.A0K(this.A00, goT.A00) || !0qQ.A0K(this.A04, goT.A04) || !0qQ.A0K(this.A05, goT.A05) || !0qQ.A0K(this.A02, goT.A02) || !0qQ.A0K(this.A03, goT.A03) || !0qQ.A0K(this.A01, goT.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A00);
        return C41845B3m.A01(this.A01, (((((AnonymousClass7TF.A08(this.A04, A0O) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A03)) * 31);
    }

    public C53436GoT(String str, String str2, String str3, String str4, List list, List list2) {
        AnonymousClass7TG.A1O(str, str2);
        0qQ.A0B(str4, 6);
        this.A00 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = list;
        this.A03 = list2;
        this.A01 = str4;
    }
}
