package X;

public final class HII extends HQ3 {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final C56565I1t A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HII) {
                HII hii = (HII) obj;
                if (!0qQ.A0K(this.A01, hii.A01) || !0qQ.A0K(this.A00, hii.A00) || this.A02 != hii.A02 || !0qQ.A0K(this.A03, hii.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A02, ((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public HII(C56565I1t i1t, String str, String str2, boolean z) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = z;
        this.A03 = i1t;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MEmuOnboarding(prompt=");
        A1A.append(this.A01);
        A1A.append(", displayPrompt=");
        A1A.append(this.A00);
        A1A.append(", isStartingWithMemuOnboarding=");
        A1A.append(this.A02);
        A1A.append(", suggestionsPromptMetadata=");
        return AnonymousClass7TG.A0n(this.A03, A1A);
    }
}
