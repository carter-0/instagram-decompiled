package X;

public final class GM5 extends AnonymousClass0T0 implements C46224DRf {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GM5) {
                GM5 gm5 = (GM5) obj;
                if (!0qQ.A0K(this.A02, gm5.A02) || !0qQ.A0K(this.A01, gm5.A01) || this.A00 != gm5.A00 || this.A03 != gm5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, (((AnonymousClass7TE.A0O(this.A02) + AnonymousClass7TG.A0E(this.A01)) * 31) + this.A00) * 31);
    }

    public GM5(String str, String str2, int i, boolean z) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A03 = z;
    }
}
