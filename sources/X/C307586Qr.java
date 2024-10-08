package X;

/* renamed from: X.6Qr  reason: invalid class name and case insensitive filesystem */
public final class C307586Qr extends C307596Qs {
    public final Integer A00;
    public final String A01;
    public final String A02;

    public C307586Qr(String str, Integer num, String str2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C307586Qr) {
                C307586Qr r5 = (C307586Qr) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode = ((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "NORMAL";
        } else {
            str = "SECURE";
        }
        return hashCode + str.hashCode() + intValue;
    }

    public final String toString() {
        String str;
        String str2 = this.A01;
        String str3 = this.A02;
        Integer num = this.A00;
        if (num == null) {
            str = "null";
        } else if (1 - num.intValue() != 0) {
            str = "NORMAL";
        } else {
            str = "SECURE";
        }
        return 002.A14("BloksPrepackagedData(checksum=", str2, ", publicCdnUrl=", str3, ", contentSecurityType=", str, ')');
    }
}
