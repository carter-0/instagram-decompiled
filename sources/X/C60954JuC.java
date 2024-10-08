package X;

import java.util.HashMap;

/* renamed from: X.JuC  reason: case insensitive filesystem */
public final class C60954JuC extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final HashMap A06;
    public final HashMap A07;

    public C60954JuC(String str, String str2, String str3, String str4, HashMap hashMap, HashMap hashMap2, int i, long j) {
        0qQ.A0B(str, 1);
        C51973G9u.A0s(2, str2, str3, str4);
        this.A02 = str;
        this.A03 = str2;
        this.A06 = hashMap;
        this.A07 = hashMap2;
        this.A00 = i;
        this.A01 = j;
        this.A04 = str3;
        this.A05 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60954JuC) {
                C60954JuC juC = (C60954JuC) obj;
                if (!0qQ.A0K(this.A02, juC.A02) || !0qQ.A0K(this.A03, juC.A03) || !0qQ.A0K(this.A06, juC.A06) || !0qQ.A0K(this.A07, juC.A07) || this.A00 != juC.A00 || this.A01 != juC.A01 || !0qQ.A0K(this.A04, juC.A04) || !0qQ.A0K(this.A05, juC.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A02);
        return C41845B3m.A01(this.A05, AnonymousClass7TF.A08(this.A04, C51972G9s.A07(this.A01, (((((AnonymousClass7TF.A08(this.A03, A0O) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A07)) * 31) + this.A00) * 31)));
    }
}
