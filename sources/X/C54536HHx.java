package X;

/* renamed from: X.HHx  reason: case insensitive filesystem */
public final class C54536HHx extends HQ1 {
    public final C56565I1t A00;
    public final CharSequence A01;
    public final String A02;

    public C54536HHx(C56565I1t i1t, CharSequence charSequence, String str) {
        0qQ.A0B(charSequence, 1);
        this.A01 = charSequence;
        this.A02 = str;
        this.A00 = i1t;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54536HHx) {
                C54536HHx hHx = (C54536HHx) obj;
                if (!0qQ.A0K(this.A01, hHx.A01) || !0qQ.A0K(this.A02, hHx.A02) || !0qQ.A0K(this.A00, hHx.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PromptSubmitted(prompt=");
        A1A.append(this.A01);
        A1A.append(", displayPrompt=");
        A1A.append(this.A02);
        A1A.append(", suggestionsPromptMetadata=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
