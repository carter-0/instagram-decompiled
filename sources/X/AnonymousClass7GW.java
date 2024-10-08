package X;

/* renamed from: X.7GW  reason: invalid class name */
public final class AnonymousClass7GW extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7GW) {
                AnonymousClass7GW r5 = (AnonymousClass7GW) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A02;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A03;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.A00;
    }

    public AnonymousClass7GW(String str, String str2, String str3, int i) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = i;
    }

    public AnonymousClass7GW() {
        this((String) null, (String) null, (String) null, 0);
    }
}
