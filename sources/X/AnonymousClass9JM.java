package X;

/* renamed from: X.9JM  reason: invalid class name */
public final class AnonymousClass9JM extends AnonymousClass0T0 {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public final int A06;

    public AnonymousClass9JM(Boolean bool, String str, String str2, String str3, String str4, String str5) {
        this.A06 = 1;
        0qQ.A0B(str, 2);
        0qQ.A0B(str4, 5);
        0qQ.A0B(str5, 6);
        this.A00 = bool;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this.A06 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass9JM)) {
                return false;
            }
            AnonymousClass9JM r3 = (AnonymousClass9JM) obj;
            if (r3.A06 != 1 || !0qQ.A0K(this.A00, r3.A00) || !0qQ.A0K(this.A01, r3.A01) || !0qQ.A0K(this.A02, r3.A02) || !0qQ.A0K(this.A03, r3.A03) || !0qQ.A0K(this.A04, r3.A04)) {
                return false;
            }
            str = this.A05;
            str2 = r3.A05;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof AnonymousClass9JM)) {
                return false;
            }
            AnonymousClass9JM r32 = (AnonymousClass9JM) obj;
            if (r32.A06 != 0 || !0qQ.A0K(this.A03, r32.A03) || !0qQ.A0K(this.A01, r32.A01) || !0qQ.A0K(this.A05, r32.A05) || !0qQ.A0K(this.A02, r32.A02) || !0qQ.A0K(this.A00, r32.A00)) {
                return false;
            }
            str = this.A04;
            str2 = r32.A04;
        }
        if (!0qQ.A0K(str, str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        if (this.A06 != 0) {
            Object obj = this.A00;
            int i = 0;
            if (obj == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = obj.hashCode();
            }
            int hashCode6 = ((hashCode4 * 31) + this.A01.hashCode()) * 31;
            String str = this.A02;
            if (str == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str.hashCode();
            }
            int i2 = (hashCode6 + hashCode5) * 31;
            String str2 = this.A03;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return ((((i2 + i) * 31) + this.A04.hashCode()) * 31) + this.A05.hashCode();
        }
        int hashCode7 = ((this.A03.hashCode() * 31) + this.A01.hashCode()) * 31;
        String str3 = this.A05;
        int i3 = 0;
        if (str3 == null) {
            hashCode = 0;
        } else {
            hashCode = str3.hashCode();
        }
        int i4 = (hashCode7 + hashCode) * 31;
        String str4 = this.A02;
        if (str4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str4.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        Object obj2 = this.A00;
        if (obj2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = obj2.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        String str5 = this.A04;
        if (str5 != null) {
            i3 = str5.hashCode();
        }
        return i6 + i3;
    }

    public final String toString() {
        if (this.A06 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ExternalClipInfo(contentType=");
        sb.append(this.A03);
        sb.append(C66579MXk.A00(425));
        sb.append(this.A01);
        sb.append(", username=");
        sb.append(this.A05);
        sb.append(", contentTitle=");
        sb.append(this.A02);
        sb.append(", segmentIndex=");
        sb.append(this.A00);
        sb.append(Pxd.A00(334));
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass9JM(Integer num, String str, String str2, String str3, String str4, String str5) {
        this.A06 = 0;
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        this.A03 = str;
        this.A01 = str2;
        this.A05 = str3;
        this.A02 = str4;
        this.A00 = num;
        this.A04 = str5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9JM() {
        this((Integer) null, "", "", (String) null, (String) null, (String) null);
        this.A06 = 0;
        this.A06 = 0;
    }
}
