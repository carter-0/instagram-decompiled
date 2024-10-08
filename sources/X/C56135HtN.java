package X;

import java.util.List;

/* renamed from: X.HtN  reason: case insensitive filesystem */
public final class C56135HtN {
    public final C56551I1f A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56135HtN) {
                C56135HtN htN = (C56135HtN) obj;
                if (!0qQ.A0K(this.A05, htN.A05) || !0qQ.A0K(this.A00, htN.A00) || !0qQ.A0K(this.A02, htN.A02) || !0qQ.A0K(this.A03, htN.A03) || !0qQ.A0K(this.A04, htN.A04) || !0qQ.A0K(this.A01, htN.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A05)) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A01);
    }

    public C56135HtN(C56551I1f i1f, String str, String str2, String str3, String str4, List list) {
        this.A05 = list;
        this.A00 = i1f;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = str4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("WriteWithAISuggestionStreamResponse(result=");
        A1A.append(this.A05);
        A1A.append(", errorInfo=");
        A1A.append(this.A00);
        A1A.append(", metagenRequestId=");
        A1A.append(this.A02);
        A1A.append(", metagenResponseId=");
        G9w.A1V(A1A, this.A03);
        A1A.append(this.A04);
        A1A.append(", everstoreId=");
        return C51975G9x.A0i(this.A01, A1A);
    }
}
