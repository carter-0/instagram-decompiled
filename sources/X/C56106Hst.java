package X;

/* renamed from: X.Hst  reason: case insensitive filesystem */
public final class C56106Hst {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56106Hst) {
                C56106Hst hst = (C56106Hst) obj;
                if (!0qQ.A0K(this.A02, hst.A02) || !0qQ.A0K(this.A00, hst.A00) || !0qQ.A0K(this.A01, hst.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A14("GeneratedPromptSummaryData(text=", this.A02, ", requestId=", this.A00, ", responseId=", this.A01, ')');
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0O(this.A02) + AnonymousClass7TG.A0E(this.A00)) * 31) + C41845B3m.A00(this.A01);
    }

    public C56106Hst(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }
}
