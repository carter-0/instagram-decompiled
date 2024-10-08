package X;

/* renamed from: X.JrP  reason: case insensitive filesystem */
public final class C60794JrP extends C62698Kky {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60794JrP) {
                C60794JrP jrP = (C60794JrP) obj;
                if (!0qQ.A0K(this.A05, jrP.A05) || !0qQ.A0K(this.A01, jrP.A01) || !0qQ.A0K(this.A04, jrP.A04) || !0qQ.A0K(this.A03, jrP.A03) || !0qQ.A0K(this.A02, jrP.A02) || !0qQ.A0K(this.A00, jrP.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0E(this.A05) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A00);
    }

    public C60794JrP(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A05 = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A03 = str4;
        this.A02 = str5;
        this.A00 = str6;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TemplateMetaData(mediaTemplateKeyId=");
        A1A.append(this.A05);
        A1A.append(", instructionKeyId=");
        A1A.append(this.A01);
        A1A.append(", stableId=");
        A1A.append(this.A04);
        A1A.append(", mediaTemplateName=");
        A1A.append(this.A03);
        A1A.append(", mediaTemplateId=");
        A1A.append(this.A02);
        A1A.append(", accessibilityLabel=");
        return C51975G9x.A0i(this.A00, A1A);
    }
}
