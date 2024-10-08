package X;

import java.util.List;

/* renamed from: X.Hsl  reason: case insensitive filesystem */
public final class C56098Hsl {
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56098Hsl) {
                C56098Hsl hsl = (C56098Hsl) obj;
                if (this.A01 != hsl.A01 || !0qQ.A0K(this.A00, hsl.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, C51965G9l.A05(this.A01));
    }

    public C56098Hsl(List list, boolean z) {
        this.A01 = z;
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VaultBioAuthPromptResult(isAuthenticated=");
        A1A.append(this.A01);
        A1A.append(", failureReasons=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
