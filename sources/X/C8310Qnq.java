package X;

import java.util.Map;

/* renamed from: X.Qnq  reason: case insensitive filesystem */
public final class C8310Qnq extends C9143RQu {
    public final long A00;
    public final long A01;
    public final C11011S5i A02;
    public final Integer A03;
    public final String A04;
    public final Map A05;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C9143RQu)) {
                return false;
            }
            C8310Qnq qnq = (C8310Qnq) ((C9143RQu) obj);
            if (!this.A04.equals(qnq.A04)) {
                return false;
            }
            Integer num = this.A03;
            Integer num2 = qnq.A03;
            if (num == null) {
                if (num2 != null) {
                    return false;
                }
            } else if (!num.equals(num2)) {
                return false;
            }
            if (!this.A02.equals(qnq.A02) || this.A00 != qnq.A00 || this.A01 != qnq.A01 || !this.A05.equals(qnq.A05)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = this.A01;
        return ((((((((((this.A04.hashCode() ^ 1000003) * 1000003) ^ AnonymousClass7TG.A0C(this.A03)) * 1000003) ^ this.A02.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.A05.hashCode();
    }

    public C8310Qnq(C11011S5i s5i, Integer num, String str, Map map, long j, long j2) {
        this.A04 = str;
        this.A03 = num;
        this.A02 = s5i;
        this.A00 = j;
        this.A01 = j2;
        this.A05 = map;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EventInternal{transportName=");
        A1A.append(this.A04);
        A1A.append(C66579MXk.A00(186));
        A1A.append(this.A03);
        A1A.append(", encodedPayload=");
        A1A.append(this.A02);
        A1A.append(", eventMillis=");
        A1A.append(this.A00);
        A1A.append(", uptimeMillis=");
        A1A.append(this.A01);
        A1A.append(", autoMetadata=");
        return C66582MXn.A0v(this.A05, A1A);
    }
}
