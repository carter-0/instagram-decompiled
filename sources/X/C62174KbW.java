package X;

/* renamed from: X.KbW  reason: case insensitive filesystem */
public final class C62174KbW extends C62876Knq {
    public final int A00;
    public final L7E A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62174KbW) {
                C62174KbW kbW = (C62174KbW) obj;
                if (!0qQ.A0K(this.A02, kbW.A02) || !0qQ.A0K(this.A01, kbW.A01) || this.A00 != kbW.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0O(this.A02) + AnonymousClass7TG.A0C(this.A01)) * 31) + this.A00;
    }

    public C62174KbW(L7E l7e, String str, int i) {
        this.A02 = str;
        this.A01 = l7e;
        this.A00 = i;
    }
}
