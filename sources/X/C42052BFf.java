package X;

import java.util.HashMap;

/* renamed from: X.BFf  reason: case insensitive filesystem */
public final class C42052BFf extends AnonymousClass0T0 implements DRI {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final HashMap A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42052BFf) {
                C42052BFf bFf = (C42052BFf) obj;
                if (!0qQ.A0K(this.A04, bFf.A04) || !0qQ.A0K(this.A01, bFf.A01) || !0qQ.A0K(this.A00, bFf.A00) || !0qQ.A0K(this.A02, bFf.A02) || !0qQ.A0K(this.A03, bFf.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0K(this.A04));
        return C41845B3m.A01(this.A03, (AnonymousClass7TF.A08(this.A00, A08) + AnonymousClass7TG.A0E(this.A02)) * 31);
    }

    public C42052BFf(String str, String str2, String str3, String str4, HashMap hashMap) {
        AnonymousClass7TG.A1U(hashMap, str, str2);
        0qQ.A0B(str4, 5);
        this.A04 = hashMap;
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}
