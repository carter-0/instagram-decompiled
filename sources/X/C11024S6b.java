package X;

import java.util.List;

/* renamed from: X.S6b  reason: case insensitive filesystem */
public final class C11024S6b {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11024S6b) {
                C11024S6b s6b = (C11024S6b) obj;
                if (!0qQ.A0K(this.A05, s6b.A05) || !0qQ.A0K(this.A03, s6b.A03) || !0qQ.A0K(this.A02, s6b.A02) || !0qQ.A0K(this.A04, s6b.A04) || !0qQ.A0K(this.A06, s6b.A06) || this.A00 != s6b.A00 || !0qQ.A0K(this.A01, s6b.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A05))))) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A01);
    }

    public C11024S6b(String str, String str2, String str3, String str4, String str5, List list, int i) {
        AnonymousClass7TG.A1Q(str2, str3);
        this.A05 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = str4;
        this.A06 = list;
        this.A00 = i;
        this.A01 = str5;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AuthTicketFromServer(id=");
        A1A.append(this.A05);
        A1A.append(", authenticationTicketStatus=");
        A1A.append(this.A03);
        A1A.append(", authTicketType=");
        A1A.append(this.A02);
        A1A.append(", fingerPrint=");
        A1A.append(this.A04);
        A1A.append(", authTicketCapabilities=");
        A1A.append(this.A06);
        A1A.append(", ttl=");
        A1A.append(this.A00);
        A1A.append(", associatedCredentialId=");
        return C51975G9x.A0i(this.A01, A1A);
    }
}
