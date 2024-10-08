package X;

/* renamed from: X.HtU  reason: case insensitive filesystem */
public final class C56142HtU {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56142HtU) {
                C56142HtU htU = (C56142HtU) obj;
                if (!0qQ.A0K(this.A03, htU.A03) || !0qQ.A0K(this.A01, htU.A01) || !0qQ.A0K(this.A05, htU.A05) || !0qQ.A0K(this.A02, htU.A02) || !0qQ.A0K(this.A06, htU.A06) || !0qQ.A0K(this.A00, htU.A00) || !0qQ.A0K(this.A04, htU.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A03)));
        return AnonymousClass7TF.A08(this.A00, (AnonymousClass7TF.A08(this.A02, A08) + AnonymousClass7TG.A0E(this.A06)) * 31) + C41845B3m.A00(this.A04);
    }

    public C56142HtU(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A03 = str;
        this.A01 = str2;
        this.A05 = str3;
        this.A02 = str4;
        this.A06 = str5;
        this.A00 = str6;
        this.A04 = str7;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("WriteWithAIResponse(result=");
        A1A.append(this.A03);
        A1A.append(", requestId=");
        A1A.append(this.A01);
        A1A.append(", metagenRequestId=");
        A1A.append(this.A05);
        A1A.append(", responseId=");
        G9w.A1V(A1A, this.A02);
        A1A.append(this.A06);
        A1A.append(AnonymousClass000.A00(2004));
        A1A.append(this.A00);
        A1A.append(", suggestionId=");
        return C51975G9x.A0i(this.A04, A1A);
    }
}
