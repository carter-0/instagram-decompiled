package X;

import com.meta.foa.session.FoaUserSession;

/* renamed from: X.HsZ  reason: case insensitive filesystem */
public final class C56086HsZ {
    public final FoaUserSession A00;
    public final C56088Hsb A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56086HsZ) {
                C56086HsZ hsZ = (C56086HsZ) obj;
                if (!0qQ.A0K(this.A00, hsZ.A00) || !0qQ.A0K(this.A01, hsZ.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C56086HsZ(FoaUserSession foaUserSession, C56088Hsb hsb) {
        this.A00 = foaUserSession;
        this.A01 = hsb;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetaAIPromptSheetArgs(foaUserSession=");
        A1A.append(this.A00);
        A1A.append(", params=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
