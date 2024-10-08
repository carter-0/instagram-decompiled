package X;

/* renamed from: X.HtM  reason: case insensitive filesystem */
public final class C56134HtM {
    public final C56125HtD A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56134HtM) {
                C56134HtM htM = (C56134HtM) obj;
                if (!0qQ.A0K(this.A05, htM.A05) || this.A01 != htM.A01 || !0qQ.A0K(this.A03, htM.A03) || !0qQ.A0K(this.A04, htM.A04) || !0qQ.A0K(this.A00, htM.A00) || !0qQ.A0K(this.A02, htM.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0O = AnonymousClass7TE.A0O(this.A05);
        int intValue = this.A01.intValue();
        if (intValue != 0) {
            str = "VIDEO";
        } else {
            str = "IMAGE";
        }
        return C41845B3m.A01(this.A02, G9w.A02(AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, C51971G9r.A0F(str, intValue, A0O))), AnonymousClass7TG.A0C(this.A00)));
    }

    public /* synthetic */ C56134HtM(C56125HtD htD, Integer num, String str, String str2, String str3) {
        String A0c = AnonymousClass7TF.A0c();
        AnonymousClass7TF.A1F(num, 2, A0c);
        this.A05 = str;
        this.A01 = num;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = htD;
        this.A02 = A0c;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SpotlightMedia(uri=");
        A1A.append(this.A05);
        A1A.append(", mediaType=");
        if (this.A01.intValue() != 0) {
            str = "VIDEO";
        } else {
            str = "IMAGE";
        }
        A1A.append(str);
        A1A.append(", prompt=");
        A1A.append(this.A03);
        A1A.append(", shortPrompt=");
        A1A.append(this.A04);
        A1A.append(", creatorAttribution=");
        A1A.append(this.A00);
        C51975G9x.A1H(A1A, ", requestId=");
        C51975G9x.A1H(A1A, ", responseId=");
        A1A.append(", id=");
        return C51975G9x.A0i(this.A02, A1A);
    }
}
