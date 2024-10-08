package X;

/* renamed from: X.HtE  reason: case insensitive filesystem */
public final class C56126HtE {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C56126HtE(Integer num, String str, String str2, String str3) {
        0qQ.A0B(num, 4);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56126HtE) {
                C56126HtE htE = (C56126HtE) obj;
                if (!0qQ.A0K(this.A02, htE.A02) || !0qQ.A0K(this.A03, htE.A03) || !0qQ.A0K(this.A01, htE.A01) || this.A00 != htE.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A02)));
        Integer num = this.A00;
        return A08 + C51971G9r.A0D(num, C49260Es3.A00(num));
    }

    public final String toString() {
        return 002.A17("MetaAIPromptSheetPrompt(id=", this.A02, ", text=", this.A03, ", emojiText=", this.A01, ", action=", C49260Es3.A00(this.A00), ')');
    }
}
