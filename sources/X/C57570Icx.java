package X;

/* renamed from: X.Icx  reason: case insensitive filesystem */
public final class C57570Icx implements JMS {
    public final C56125HtD A00;
    public final C62532KhO A01;
    public final C56565I1t A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C57570Icx(C56125HtD htD, C62532KhO khO, C56565I1t i1t, String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(khO, 4);
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = khO;
        this.A06 = str4;
        this.A07 = str5;
        this.A00 = htD;
        this.A02 = i1t;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C57570Icx) {
                C57570Icx icx = (C57570Icx) obj;
                if (!0qQ.A0K(this.A05, icx.A05) || !0qQ.A0K(this.A03, icx.A03) || !0qQ.A0K(this.A04, icx.A04) || this.A01 != icx.A01 || !0qQ.A0K(this.A06, icx.A06) || !0qQ.A0K(this.A07, icx.A07) || !0qQ.A0K(this.A00, icx.A00) || !0qQ.A0K(this.A02, icx.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A05)))) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ImagineSuggestion(prompt=");
        A1A.append(this.A05);
        A1A.append(", displayPrompt=");
        A1A.append(this.A03);
        A1A.append(", imageUri=");
        A1A.append(this.A04);
        A1A.append(", intent=");
        A1A.append(this.A01);
        A1A.append(", requestId=");
        A1A.append(this.A06);
        A1A.append(", responseId=");
        A1A.append(this.A07);
        A1A.append(", creatorAttribution=");
        A1A.append(this.A00);
        A1A.append(", suggestionsPromptMetadata=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
