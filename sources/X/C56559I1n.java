package X;

/* renamed from: X.I1n  reason: case insensitive filesystem */
public final class C56559I1n {
    public final C54726HQf A00;
    public final C56146HtY A01;
    public final C56146HtY A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56559I1n) {
                C56559I1n i1n = (C56559I1n) obj;
                if (!0qQ.A0K(this.A01, i1n.A01) || this.A04 != i1n.A04 || !0qQ.A0K(this.A03, i1n.A03) || !0qQ.A0K(this.A02, i1n.A02) || !0qQ.A0K(this.A00, i1n.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A09(this.A04, AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C56559I1n(C54726HQf hQf, C56146HtY htY, C56146HtY htY2, String str, boolean z) {
        this.A01 = htY;
        this.A04 = z;
        this.A03 = str;
        this.A02 = htY2;
        this.A00 = hQf;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EditHistoryNode(media=");
        A1A.append(this.A01);
        A1A.append(", isEdited=");
        A1A.append(this.A04);
        A1A.append(", editPrompt=");
        A1A.append(this.A03);
        A1A.append(", parentMedia=");
        A1A.append(this.A02);
        A1A.append(", generationError=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }

    public C56559I1n() {
        this((C54726HQf) null, (C56146HtY) null, (C56146HtY) null, (String) null, false);
    }
}
