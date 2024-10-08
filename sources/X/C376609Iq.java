package X;

/* renamed from: X.9Iq  reason: invalid class name and case insensitive filesystem */
public final class C376609Iq extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final long A01;
    public final long A02;
    public final long A03;
    public final String A04;

    public C376609Iq(String str, long j, long j2, long j3, int i) {
        0qQ.A0B(str, 4);
        this.A03 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A04 = str;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C376609Iq)) {
            return false;
        }
        C376609Iq r6 = (C376609Iq) obj;
        if (r6.A00 == 0 && this.A03 == r6.A03 && this.A01 == r6.A01 && this.A02 == r6.A02 && 0qQ.A0K(this.A04, r6.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            return super.hashCode();
        }
        long j = this.A03;
        long j2 = this.A01;
        long j3 = this.A02;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.A04.hashCode();
    }

    public C376609Iq(String str, long j, long j2, long j3) {
        this.A04 = str;
        this.A03 = j;
        this.A02 = j2;
        this.A01 = j3;
    }
}
