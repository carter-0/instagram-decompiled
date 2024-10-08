package X;

/* renamed from: X.3pm  reason: invalid class name and case insensitive filesystem */
public final class C252833pm extends 1Jp {
    public final boolean A00;

    public C252833pm(1Jm r7, String str, long j, boolean z) {
        super(r7, "NO_ID", str, j);
        this.A00 = z;
    }

    public final String A00() {
        if (this.A00) {
            return "log out";
        }
        return "account switch";
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        if (this.A00) {
            str = "Logged out at ";
        } else {
            sb = new StringBuilder();
            str = "Account switch at ";
        }
        sb.append(str);
        sb.append(this.A00);
        return sb.toString();
    }
}
