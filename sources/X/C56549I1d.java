package X;

/* renamed from: X.I1d  reason: case insensitive filesystem */
public final class C56549I1d {
    public final C56107Hsu A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56549I1d) {
                C56549I1d i1d = (C56549I1d) obj;
                if (!0qQ.A0K(this.A00, i1d.A00) || !0qQ.A0K(this.A01, i1d.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TG.A0C(this.A00) * 31);
    }

    public C56549I1d(C56107Hsu hsu, String str) {
        this.A00 = hsu;
        this.A01 = str;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UIState(suggestionPreviewState=");
        A1A.append(this.A00);
        A1A.append(", screenName=");
        return C51975G9x.A0i(this.A01, A1A);
    }

    public C56549I1d() {
        this((C56107Hsu) null, "WriteWithAIFeedbackBottomSheet");
    }
}
