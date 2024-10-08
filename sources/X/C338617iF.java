package X;

/* renamed from: X.7iF  reason: invalid class name and case insensitive filesystem */
public final class C338617iF extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C338617iF) {
                C338617iF r8 = (C338617iF) obj;
                if (!(0qQ.A0K(this.A04, r8.A04) && this.A01 == r8.A01 && 0qQ.A0K(this.A03, r8.A03) && this.A00 == r8.A00 && this.A02 == r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = this.A02;
        return (((((((this.A04.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.A03.hashCode()) * 31) + this.A00) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C338617iF(String str, String str2, int i, long j, long j2) {
        this.A04 = str;
        this.A01 = j;
        this.A03 = str2;
        this.A00 = i;
        this.A02 = j2;
    }
}
