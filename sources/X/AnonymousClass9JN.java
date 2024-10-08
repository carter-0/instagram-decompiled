package X;

/* renamed from: X.9JN  reason: invalid class name */
public final class AnonymousClass9JN extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final int A07 = 0;

    public AnonymousClass9JN(String str) {
        this.A04 = str;
        this.A05 = "web_url";
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A07 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass9JN)) {
                return false;
            }
            AnonymousClass9JN r3 = (AnonymousClass9JN) obj;
            if (r3.A07 != 1) {
                return false;
            }
            obj2 = this.A04;
            obj3 = r3.A04;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof AnonymousClass9JN)) {
                return false;
            }
            AnonymousClass9JN r32 = (AnonymousClass9JN) obj;
            if (r32.A07 != 0 || !0qQ.A0K(this.A04, r32.A04) || !0qQ.A0K(this.A05, r32.A05) || !0qQ.A0K(this.A06, r32.A06) || !0qQ.A0K(this.A02, r32.A02) || !0qQ.A0K(this.A03, r32.A03) || !0qQ.A0K(this.A00, r32.A00)) {
                return false;
            }
            obj2 = this.A01;
            obj3 = r32.A01;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = this.A07;
        String str = this.A04;
        if (i != 0) {
            return str.hashCode();
        }
        int hashCode5 = ((str.hashCode() * 31) + this.A05.hashCode()) * 31;
        String str2 = this.A06;
        int i2 = 0;
        if (str2 == null) {
            hashCode = 0;
        } else {
            hashCode = str2.hashCode();
        }
        int i3 = (hashCode5 + hashCode) * 31;
        String str3 = this.A02;
        if (str3 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str3.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        String str4 = this.A03;
        if (str4 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str4.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        Object obj = this.A00;
        if (obj == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj.hashCode();
        }
        int i6 = (i5 + hashCode4) * 31;
        Object obj2 = this.A01;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i6 + i2;
    }

    public AnonymousClass9JN(String str, String str2, String str3) {
        this(str);
        this.A05 = str2;
        this.A02 = str3;
        this.A01 = new C61078JwG((Object) new BBV((String) null, 18), 7);
        this.A03 = null;
        this.A06 = null;
        this.A00 = null;
    }

    public AnonymousClass9JN(AnonymousClass9JG r2, Integer num, String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A02 = str4;
        this.A03 = str5;
        this.A00 = num;
        this.A01 = r2;
    }

    public AnonymousClass9JN(Integer num, String str, String str2, String str3, String str4, String str5) {
        this((AnonymousClass9JG) null, num, str, str2, str3, str4, str5);
    }
}
