package X;

/* renamed from: X.JrI  reason: case insensitive filesystem */
public final class C60787JrI extends C62696Kkw {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public C60787JrI(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, int i4) {
        AnonymousClass7TF.A1E(str2, 2, str3);
        this.A09 = str;
        this.A0A = str2;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A0B = str3;
        this.A05 = str4;
        this.A08 = str5;
        this.A06 = str6;
        this.A04 = str7;
        this.A07 = str8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60787JrI) {
                C60787JrI jrI = (C60787JrI) obj;
                if (!0qQ.A0K(this.A09, jrI.A09) || !0qQ.A0K(this.A0A, jrI.A0A) || this.A01 != jrI.A01 || this.A02 != jrI.A02 || this.A03 != jrI.A03 || this.A00 != jrI.A00 || !0qQ.A0K(this.A0B, jrI.A0B) || !0qQ.A0K(this.A05, jrI.A05) || !0qQ.A0K(this.A08, jrI.A08) || !0qQ.A0K(this.A06, jrI.A06) || !0qQ.A0K(this.A04, jrI.A04) || !0qQ.A0K(this.A07, jrI.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A09);
        return C41845B3m.A01(this.A07, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A0B, (((((((AnonymousClass7TF.A08(this.A0A, A0O) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31) + this.A00) * 31))))));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ODRTemplateGenerateSuccessEvent(templateFilePath=");
        A1A.append(this.A09);
        A1A.append(", templateId=");
        A1A.append(this.A0A);
        A1A.append(", templateFrameCount=");
        A1A.append(this.A01);
        A1A.append(", templateHeight=");
        A1A.append(this.A02);
        A1A.append(", templateWidth=");
        A1A.append(this.A03);
        A1A.append(", fps=");
        A1A.append(this.A00);
        A1A.append(", templatePackName=");
        A1A.append(this.A0B);
        A1A.append(", instructionKeyId=");
        A1A.append(this.A05);
        A1A.append(", stableId=");
        A1A.append(this.A08);
        A1A.append(", mediaTemplateId=");
        A1A.append(this.A06);
        A1A.append(", accessibilityLabel=");
        A1A.append(this.A04);
        A1A.append(", mediaTemplateName=");
        return C51975G9x.A0i(this.A07, A1A);
    }
}
