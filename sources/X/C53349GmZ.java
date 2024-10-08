package X;

import java.util.List;

/* renamed from: X.GmZ  reason: case insensitive filesystem */
public final class C53349GmZ extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53349GmZ) {
                C53349GmZ gmZ = (C53349GmZ) obj;
                if (!0qQ.A0K(this.A07, gmZ.A07) || !0qQ.A0K(this.A03, gmZ.A03) || !0qQ.A0K(this.A04, gmZ.A04) || !0qQ.A0K(this.A02, gmZ.A02) || !0qQ.A0K(this.A05, gmZ.A05) || this.A00 != gmZ.A00 || !0qQ.A0K(this.A09, gmZ.A09) || this.A01 != gmZ.A01 || !0qQ.A0K(this.A08, gmZ.A08) || !0qQ.A0K(this.A06, gmZ.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A07))));
        return C41845B3m.A01(this.A06, AnonymousClass7TF.A08(this.A08, C51972G9s.A07(this.A01, AnonymousClass7TF.A07(this.A09, (AnonymousClass7TF.A08(this.A05, A082) + this.A00) * 31))));
    }

    public C53349GmZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, long j) {
        C51974G9v.A1P(str, str2, str3, str4);
        0qQ.A0B(str5, 5);
        C51973G9u.A0u(7, list, str6, str7);
        this.A07 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A02 = str4;
        this.A05 = str5;
        this.A00 = i;
        this.A09 = list;
        this.A01 = j;
        this.A08 = str6;
        this.A06 = str7;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("XoutRealtimeInfo(signalId=");
        A1A.append(this.A07);
        A1A.append(", containerModule=");
        G9w.A1W(A1A, this.A03);
        G9w.A1S(A1A, this.A04);
        G9w.A1R(A1A, this.A02);
        G9w.A1U(A1A, this.A05);
        A1A.append(this.A00);
        A1A.append(", mediaIds=");
        A1A.append(this.A09);
        A1A.append(", xoutTimestamp=");
        A1A.append(this.A01);
        A1A.append(", xoutMediaId=");
        A1A.append(this.A08);
        A1A.append(", reason=");
        return C51975G9x.A0i(this.A06, A1A);
    }
}
