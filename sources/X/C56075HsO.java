package X;

/* renamed from: X.HsO  reason: case insensitive filesystem */
public final class C56075HsO {
    public final String A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56075HsO) {
                C56075HsO hsO = (C56075HsO) obj;
                if (!0qQ.A0K(this.A00, hsO.A00) || this.A01 != hsO.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0l("HookKey(globalKey=", this.A00, ", index=", ')', this.A01);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A00) + this.A01;
    }

    public C56075HsO(String str, int i) {
        this.A00 = str;
        this.A01 = i;
    }
}
