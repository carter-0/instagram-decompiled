package X;

/* renamed from: X.9Ip  reason: invalid class name and case insensitive filesystem */
public final class C376599Ip extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final long A01;
    public final String A02;

    public C376599Ip(long j, String str) {
        0qQ.A0B(str, 2);
        this.A01 = j;
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C376599Ip)) {
                return false;
            }
            C376599Ip r6 = (C376599Ip) obj;
            if (r6.A00 == 1 && this.A01 == r6.A01 && 0qQ.A0K(this.A02, r6.A02)) {
                return true;
            }
            return false;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C376599Ip)) {
                return false;
            }
            C376599Ip r62 = (C376599Ip) obj;
            if (r62.A00 == 0 && 0qQ.A0K(this.A02, r62.A02) && this.A01 == r62.A01) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int hashCode;
        int i;
        if (this.A00 != 0) {
            long j = this.A01;
            hashCode = ((int) (j ^ (j >>> 32))) * 31;
            i = this.A02.hashCode();
        } else {
            hashCode = this.A02.hashCode() * 31;
            long j2 = this.A01;
            i = (int) (j2 ^ (j2 >>> 32));
        }
        return hashCode + i;
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DictionaryIdAndKey(dictionaryId=");
        sb.append(this.A01);
        sb.append(C273654mx.A00(1062));
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C376599Ip(String str, long j) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A01 = j;
    }
}
