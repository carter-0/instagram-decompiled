package X;

import org.json.JSONObject;

public final class LG2 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final JSONObject A04;
    public final JSONObject A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LG2) {
                LG2 lg2 = (LG2) obj;
                if (!0qQ.A0K(this.A03, lg2.A03) || !0qQ.A0K(this.A04, lg2.A04) || !0qQ.A0K(this.A05, lg2.A05) || !0qQ.A0K(this.A02, lg2.A02) || this.A00 != lg2.A00 || this.A01 != lg2.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A04, AnonymousClass7TE.A0O(this.A03)))) + this.A00) * 31) + this.A01;
    }

    public LG2(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, int i, int i2) {
        this.A03 = str;
        this.A04 = jSONObject;
        this.A05 = jSONObject2;
        this.A02 = str2;
        this.A00 = i;
        this.A01 = i2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TemplateInfo(templateId=");
        A1A.append(this.A03);
        A1A.append(", camera=");
        A1A.append(this.A04);
        A1A.append(", lights=");
        A1A.append(this.A05);
        A1A.append(", pose=");
        A1A.append(this.A02);
        A1A.append(", fps=");
        A1A.append(this.A00);
        A1A.append(", frameCount=");
        return C51975G9x.A0j(A1A, this.A01);
    }
}
