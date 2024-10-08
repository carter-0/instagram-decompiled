package X;

/* renamed from: X.HsY  reason: case insensitive filesystem */
public final class C56085HsY {
    public final int A00;
    public final String A01;

    public C56085HsY(String str, int i) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56085HsY) {
                C56085HsY hsY = (C56085HsY) obj;
                if (!0qQ.A0K(this.A01, hsY.A01) || this.A00 != hsY.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0l("EmuFlashRequest(prompt=", this.A01, ", flashSessionId=", ')', this.A00);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + this.A00;
    }
}
