package X;

import java.util.List;

/* renamed from: X.GmY  reason: case insensitive filesystem */
public final class C53348GmY extends AnonymousClass0T0 {
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
            if (obj instanceof C53348GmY) {
                C53348GmY gmY = (C53348GmY) obj;
                if (!0qQ.A0K(this.A08, gmY.A08) || !0qQ.A0K(this.A05, gmY.A05) || !0qQ.A0K(this.A06, gmY.A06) || !0qQ.A0K(this.A03, gmY.A03) || !0qQ.A0K(this.A07, gmY.A07) || this.A00 != gmY.A00 || !0qQ.A0K(this.A09, gmY.A09) || this.A01 != gmY.A01 || !0qQ.A0K(this.A04, gmY.A04) || !0qQ.A0K(this.A02, gmY.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0O(this.A08))));
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A08(this.A04, C51972G9s.A07(this.A01, AnonymousClass7TF.A07(this.A09, (AnonymousClass7TF.A08(this.A07, A082) + this.A00) * 31))));
    }

    public C53348GmY(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, long j) {
        AnonymousClass7TG.A1U(str, str2, str3);
        0qQ.A0B(str5, 5);
        C51973G9u.A0u(7, list, str6, str7);
        this.A08 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A03 = str4;
        this.A07 = str5;
        this.A00 = i;
        this.A09 = list;
        this.A01 = j;
        this.A04 = str6;
        this.A02 = str7;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ProfileTapRealtimeInfo(signalId=");
        A1A.append(this.A08);
        A1A.append(", containerModule=");
        G9w.A1W(A1A, this.A05);
        G9w.A1S(A1A, this.A06);
        G9w.A1R(A1A, this.A03);
        G9w.A1U(A1A, this.A07);
        A1A.append(this.A00);
        A1A.append(", mediaIds=");
        G9w.A1Q(A1A, this.A09);
        G9w.A0y(this.A01, A1A);
        A1A.append(this.A04);
        A1A.append(", accountType=");
        return C51975G9x.A0i(this.A02, A1A);
    }
}
