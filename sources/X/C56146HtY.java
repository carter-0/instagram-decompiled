package X;

/* renamed from: X.HtY  reason: case insensitive filesystem */
public final class C56146HtY {
    public final C56106Hst A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final 0eP A0C;
    public final boolean A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56146HtY) {
                C56146HtY htY = (C56146HtY) obj;
                if (!0qQ.A0K(this.A0A, htY.A0A) || !0qQ.A0K(this.A04, htY.A04) || !0qQ.A0K(this.A05, htY.A05) || !0qQ.A0K(this.A03, htY.A03) || !0qQ.A0K(this.A06, htY.A06) || !0qQ.A0K(this.A08, htY.A08) || !0qQ.A0K(this.A07, htY.A07) || this.A02 != htY.A02 || !0qQ.A0K(this.A0C, htY.A0C) || this.A01 != htY.A01 || !0qQ.A0K(this.A09, htY.A09) || !0qQ.A0K(this.A0B, htY.A0B) || !0qQ.A0K(this.A00, htY.A00) || this.A0D != htY.A0D) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = (((((((AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0O(this.A0A))) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31;
        Integer num = this.A02;
        int A072 = AnonymousClass7TF.A07(this.A0C, AnonymousClass7TG.A0B(num, C49259Es2.A00(num), A082));
        Integer num2 = this.A01;
        return DbS.A06(this.A0D, (((((AnonymousClass7TG.A0B(num2, LKT.A01(num2), A072) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TE.A0L(this.A00)) * 31);
    }

    public C56146HtY(C56106Hst hst, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, 0eP r14, boolean z) {
        AnonymousClass7TG.A1U(str, str2, str3);
        0qQ.A0B(num2, 10);
        this.A0A = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A03 = str4;
        this.A06 = str5;
        this.A08 = str6;
        this.A07 = str7;
        this.A02 = num;
        this.A0C = r14;
        this.A01 = num2;
        this.A09 = str8;
        this.A0B = str9;
        this.A00 = hst;
        this.A0D = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ImagineGeneratedMedia(uri=");
        A1A.append(this.A0A);
        A1A.append(", id=");
        A1A.append(this.A04);
        A1A.append(", prompt=");
        A1A.append(this.A05);
        A1A.append(", displayPrompt=");
        A1A.append(this.A03);
        A1A.append(AnonymousClass000.A00(2041));
        A1A.append(this.A06);
        A1A.append(", responseId=");
        A1A.append(this.A08);
        A1A.append(", requestId=");
        A1A.append(this.A07);
        A1A.append(", mediaType=");
        A1A.append(C49259Es2.A00(this.A02));
        A1A.append(", mediaResolution=");
        A1A.append(this.A0C);
        A1A.append(AnonymousClass000.A00(845));
        G9w.A1V(A1A, LKT.A01(this.A01));
        A1A.append(this.A09);
        A1A.append(AnonymousClass000.A00(2052));
        A1A.append(this.A0B);
        A1A.append(", generatedPromptSummaryData=");
        A1A.append(this.A00);
        A1A.append(", isMediaPersonalized=");
        return G9t.A1C(A1A, this.A0D);
    }
}
