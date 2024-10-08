package X;

/* renamed from: X.JtW  reason: case insensitive filesystem */
public final class C60912JtW extends AnonymousClass0T0 {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60912JtW) {
                C60912JtW jtW = (C60912JtW) obj;
                if (!0qQ.A0K(this.A00, jtW.A00) || this.A01 != jtW.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TG.A0E(this.A00) * 31);
    }

    public C60912JtW(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
