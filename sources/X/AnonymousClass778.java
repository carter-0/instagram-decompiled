package X;

/* renamed from: X.778  reason: invalid class name */
public final class AnonymousClass778 extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass778) {
                AnonymousClass778 r5 = (AnonymousClass778) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A03;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A00;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public AnonymousClass778(String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = str4;
    }
}
