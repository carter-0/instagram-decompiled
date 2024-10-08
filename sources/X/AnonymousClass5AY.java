package X;

/* renamed from: X.5AY  reason: invalid class name */
public final class AnonymousClass5AY extends AnonymousClass0T0 implements AnonymousClass5AZ {
    public final String A00;
    public final String A01;
    public final String A02;

    public AnonymousClass5AY(String str, String str2, String str3) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5AY) {
                AnonymousClass5AY r5 = (AnonymousClass5AY) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A01.hashCode();
    }
}
