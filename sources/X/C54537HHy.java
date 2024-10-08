package X;

/* renamed from: X.HHy  reason: case insensitive filesystem */
public final class C54537HHy extends HQ1 {
    public final C56146HtY A00;
    public final C56565I1t A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54537HHy) {
                C54537HHy hHy = (C54537HHy) obj;
                if (!0qQ.A0K(this.A00, hHy.A00) || this.A02 != hHy.A02 || !0qQ.A0K(this.A01, hHy.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0K(this.A00)) + AnonymousClass7TG.A0C(this.A01);
    }

    public C54537HHy(C56146HtY htY, C56565I1t i1t, boolean z) {
        this.A00 = htY;
        this.A02 = z;
        this.A01 = i1t;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Select(selectedImage=");
        A1A.append(this.A00);
        A1A.append(", isEdited=");
        A1A.append(this.A02);
        A1A.append(", suggestionsPromptMetadata=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
