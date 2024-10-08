package X;

import java.util.List;

public final class Q36 {
    public final int A00;
    public final String A01;
    public final List A02;

    public Q36(List list, int i, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
        this.A02 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Q36) {
                Q36 q36 = (Q36) obj;
                if (!0qQ.A0K(this.A01, q36.A01) || this.A00 != q36.A00 || !0qQ.A0K(this.A02, q36.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, (AnonymousClass7TE.A0O(this.A01) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AsyncComponentContainerTargetInfo(serverId=");
        A1A.append(this.A01);
        A1A.append(", clientId=");
        A1A.append(this.A00);
        A1A.append(", keyPath=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
