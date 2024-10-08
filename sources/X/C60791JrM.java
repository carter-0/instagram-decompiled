package X;

/* renamed from: X.JrM  reason: case insensitive filesystem */
public final class C60791JrM extends C62698Kky {
    public final C60793JrO A00;
    public final C60795JrQ A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60791JrM) {
                C60791JrM jrM = (C60791JrM) obj;
                if (!0qQ.A0K(this.A01, jrM.A01) || !0qQ.A0K(this.A00, jrM.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public C60791JrM(C60793JrO jrO, C60795JrQ jrQ) {
        this.A01 = jrQ;
        this.A00 = jrO;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UserAvatarAndTemplateData(userAvatarData=");
        A1A.append(this.A01);
        A1A.append(", templateInfo=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
