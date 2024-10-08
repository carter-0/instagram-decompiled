package X;

/* renamed from: X.Ht1  reason: case insensitive filesystem */
public final class C56114Ht1 {
    public final Integer A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56114Ht1) {
                C56114Ht1 ht1 = (C56114Ht1) obj;
                if (!0qQ.A0K(this.A01, ht1.A01) || !0qQ.A0K(this.A02, ht1.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01)) * 31) + 16627232;
    }

    public final String toString() {
        return 002.A17("SuggestedPrompt(text=", this.A01, ", pillType=", this.A02, ", promptId=", (String) null, ", suggestedPromptType=", "SUGGESTED_PROMPT", ')');
    }

    public C56114Ht1(String str, Integer num, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
    }
}
