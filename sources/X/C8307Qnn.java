package X;

import java.util.List;

/* renamed from: X.Qnn  reason: case insensitive filesystem */
public final class C8307Qnn extends C9686Rf4 {
    public final long A00;
    public final long A01;
    public final C9684Rf2 A02;
    public final C8870RDm A03;
    public final Integer A04;
    public final String A05;
    public final List A06;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C9686Rf4)) {
                return false;
            }
            C8307Qnn qnn = (C8307Qnn) ((C9686Rf4) obj);
            if (this.A00 != qnn.A00 || this.A01 != qnn.A01) {
                return false;
            }
            C9684Rf2 rf2 = this.A02;
            C9684Rf2 rf22 = qnn.A02;
            if (rf2 == null) {
                if (rf22 != null) {
                    return false;
                }
            } else if (!rf2.equals(rf22)) {
                return false;
            }
            Integer num = this.A04;
            Integer num2 = qnn.A04;
            if (num == null) {
                if (num2 != null) {
                    return false;
                }
            } else if (!num.equals(num2)) {
                return false;
            }
            String str = this.A05;
            String str2 = qnn.A05;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            List list = this.A06;
            List list2 = qnn.A06;
            if (list == null) {
                if (list2 != null) {
                    return false;
                }
            } else if (!list.equals(list2)) {
                return false;
            }
            C8870RDm rDm = this.A03;
            C8870RDm rDm2 = qnn.A03;
            return rDm == null ? rDm2 == null : rDm.equals(rDm2);
        }
    }

    public final int hashCode() {
        int hashCode;
        long j = this.A00;
        long j2 = this.A01;
        int A0C = (((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ AnonymousClass7TG.A0C(this.A02)) * 1000003) ^ AnonymousClass7TG.A0C(this.A04)) * 1000003) ^ AnonymousClass7TG.A0E(this.A05)) * 1000003;
        List list = this.A06;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return ((A0C ^ hashCode) * 1000003) ^ AnonymousClass7TE.A0L(this.A03);
    }

    public C8307Qnn(C9684Rf2 rf2, C8870RDm rDm, Integer num, String str, List list, long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = rf2;
        this.A04 = num;
        this.A05 = str;
        this.A06 = list;
        this.A03 = rDm;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LogRequest{requestTimeMs=");
        A1A.append(this.A00);
        A1A.append(", requestUptimeMs=");
        A1A.append(this.A01);
        A1A.append(", clientInfo=");
        A1A.append(this.A02);
        A1A.append(", logSource=");
        A1A.append(this.A04);
        A1A.append(", logSourceName=");
        A1A.append(this.A05);
        A1A.append(", logEvents=");
        A1A.append(this.A06);
        A1A.append(", qosTier=");
        return C66582MXn.A0v(this.A03, A1A);
    }
}
