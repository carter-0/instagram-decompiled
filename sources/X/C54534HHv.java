package X;

/* renamed from: X.HHv  reason: case insensitive filesystem */
public final class C54534HHv extends HQ1 {
    public final CharSequence A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54534HHv) {
                C54534HHv hHv = (C54534HHv) obj;
                if (!0qQ.A0K(this.A00, hHv.A00) || !0qQ.A0K(this.A01, hHv.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public C54534HHv(String str, CharSequence charSequence) {
        this.A00 = charSequence;
        this.A01 = str;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PromptUpdated(prompt=");
        A1A.append(this.A00);
        A1A.append(", displayPrompt=");
        return C51975G9x.A0i(this.A01, A1A);
    }
}
