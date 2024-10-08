package X;

import java.util.List;

/* renamed from: X.Npx  reason: case insensitive filesystem */
public final class C69675Npx {
    public String A00;
    public List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69675Npx) {
                C69675Npx npx = (C69675Npx) obj;
                if (!0qQ.A0K(this.A00, npx.A00) || !0qQ.A0K(this.A01, npx.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BackupDataEntry(userId=");
        A1A.append(this.A00);
        A1A.append(", features=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
