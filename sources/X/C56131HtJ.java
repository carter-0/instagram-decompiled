package X;

/* renamed from: X.HtJ  reason: case insensitive filesystem */
public final class C56131HtJ {
    public final JMY A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56131HtJ) {
                C56131HtJ htJ = (C56131HtJ) obj;
                if (!0qQ.A0K(this.A02, htJ.A02) || !0qQ.A0K(this.A04, htJ.A04) || !0qQ.A0K(this.A03, htJ.A03) || !0qQ.A0K(this.A00, htJ.A00) || this.A01 != htJ.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A07 = AnonymousClass7TF.A07(this.A00, ((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A03)) * 31);
        int intValue = this.A01.intValue();
        if (1 != intValue) {
            str = "SUGGESTED_PROMPT";
        } else {
            str = "SUGGESTED_CONTENT";
        }
        return A07 + C51966G9m.A04(str, intValue);
    }

    public C56131HtJ(JMY jmy, Integer num, String str, String str2, String str3) {
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A00 = jmy;
        this.A01 = num;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("WriteWithAIContext(initialContent=");
        A1A.append(this.A02);
        A1A.append(", prompt=");
        A1A.append(this.A04);
        A1A.append(", initialPromptRequestId=");
        A1A.append(this.A03);
        A1A.append(", requestInput=");
        A1A.append(this.A00);
        A1A.append(", suggestedPromptType=");
        if (1 - this.A01.intValue() != 0) {
            str = "SUGGESTED_PROMPT";
        } else {
            str = "SUGGESTED_CONTENT";
        }
        return C51975G9x.A0i(str, A1A);
    }
}
