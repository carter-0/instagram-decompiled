package X;

/* renamed from: X.Qns  reason: case insensitive filesystem */
public final class C8312Qns extends RLr {
    public final long A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof RLr)) {
                return false;
            }
            C8312Qns qns = (C8312Qns) ((RLr) obj);
            if (!this.A01.equals(qns.A01) || this.A00 != qns.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A01;
        return ((C51971G9r.A0D(num, C9690Rf8.A00(num)) ^ 1000003) * 1000003) ^ C51968G9o.A03(this.A00);
    }

    public C8312Qns(long j, Integer num) {
        this.A01 = num;
        this.A00 = j;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BackendResponse{status=");
        Integer num = this.A01;
        if (num != null) {
            str = C9690Rf8.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", nextRequestWaitMillis=");
        A1A.append(this.A00);
        return AnonymousClass7TF.A0l("}", A1A);
    }
}
