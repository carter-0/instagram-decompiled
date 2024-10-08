package X;

/* renamed from: X.5vk  reason: invalid class name and case insensitive filesystem */
public final class C299725vk extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final int A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C299725vk) {
                C299725vk r5 = (C299725vk) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00 || this.A04 != r5.A04 || !0qQ.A0K(this.A02, r5.A02)) {
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
        int hashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A00) * 31) + this.A04) * 31;
        String str2 = this.A02;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public C299725vk(String str, String str2, String str3, int i, int i2) {
        this.A03 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A04 = i2;
        this.A02 = str3;
    }
}
