package X;

/* renamed from: X.9JC  reason: invalid class name */
public final class AnonymousClass9JC extends AnonymousClass0T0 implements C334127ai {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public AnonymousClass9JC(1Xj r3, C335737dS r4) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(r3, 2);
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = null;
        this.A04 = null;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass9JC)) {
                return false;
            }
            AnonymousClass9JC r3 = (AnonymousClass9JC) obj;
            if (r3.A00 != 1 || !0qQ.A0K(this.A01, r3.A01) || !0qQ.A0K(this.A03, r3.A03) || !0qQ.A0K(this.A04, r3.A04) || this.A02 != r3.A02) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof AnonymousClass9JC)) {
                return false;
            }
            AnonymousClass9JC r32 = (AnonymousClass9JC) obj;
            if (r32.A00 != 0 || this.A02 != r32.A02 || !0qQ.A0K(this.A01, r32.A01) || !0qQ.A0K(this.A03, r32.A03) || !0qQ.A0K(this.A04, r32.A04)) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        if (this.A00 != 0) {
            Object obj = this.A01;
            int i = 0;
            if (obj == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = obj.hashCode();
            }
            int hashCode3 = ((hashCode2 * 31) + this.A03.hashCode()) * 31;
            String str = this.A04;
            if (str != null) {
                i = str.hashCode();
            }
            return ((hashCode3 + i) * 31) + this.A02.hashCode();
        }
        int hashCode4 = ((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31;
        String str2 = this.A03;
        int i2 = 0;
        if (str2 == null) {
            hashCode = 0;
        } else {
            hashCode = str2.hashCode();
        }
        int i3 = (hashCode4 + hashCode) * 31;
        String str3 = this.A04;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return i3 + i2;
    }

    public AnonymousClass9JC(C335857de r2, 1bK r3, String str, String str2) {
        this.A01 = r3;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = r2;
    }
}
