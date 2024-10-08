package X;

/* renamed from: X.9V0  reason: invalid class name */
public final class AnonymousClass9V0 extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final long A01;
    public final String A02;
    public final String A03;

    public AnonymousClass9V0(int i, String str, String str2, long j) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = j;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass9V0)) {
            return false;
        }
        AnonymousClass9V0 r6 = (AnonymousClass9V0) obj;
        if (r6.A00 != 0 || this.A01 != r6.A01 || !0qQ.A0K(this.A02, r6.A02) || !0qQ.A0K(this.A03, r6.A03)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            return super.hashCode();
        }
        long j = this.A01;
        return AnonymousClass7TF.A08(this.A02, ((int) (j ^ (j >>> 32))) * 31) + this.A03.hashCode();
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Marker(pointName=");
        A1A.append(this.A03);
        A1A.append(", data=");
        A1A.append(this.A02);
        A1A.append(", time=");
        A1A.append(this.A01);
        return AnonymousClass7TG.A0p(A1A);
    }

    public AnonymousClass9V0(String str, String str2, long j) {
        AnonymousClass7TG.A1Q(str, str2);
        this.A01 = j;
        this.A02 = str;
        this.A03 = str2;
    }
}
