package X;

import java.util.Arrays;

/* renamed from: X.Qnm  reason: case insensitive filesystem */
public final class C8306Qnm extends C9685Rf3 {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C9687Rf5 A03;
    public final Integer A04;
    public final String A05;
    public final byte[] A06;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C9685Rf3)) {
                return false;
            }
            C8306Qnm qnm = (C8306Qnm) ((C9685Rf3) obj);
            if (this.A00 != qnm.A00) {
                return false;
            }
            Integer num = this.A04;
            Integer num2 = qnm.A04;
            if (num == null) {
                if (num2 != null) {
                    return false;
                }
            } else if (!num.equals(num2)) {
                return false;
            }
            if (this.A01 != qnm.A01 || !Arrays.equals(this.A06, qnm.A06)) {
                return false;
            }
            String str = this.A05;
            String str2 = qnm.A05;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.A02 != qnm.A02) {
                return false;
            }
            C9687Rf5 rf5 = this.A03;
            C9687Rf5 rf52 = qnm.A03;
            return rf5 == null ? rf52 == null : rf5.equals(rf52);
        }
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = this.A01;
        long j3 = this.A02;
        return ((((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ AnonymousClass7TG.A0C(this.A04)) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.A06)) * 1000003) ^ AnonymousClass7TG.A0E(this.A05)) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ AnonymousClass7TE.A0L(this.A03);
    }

    public C8306Qnm(C9687Rf5 rf5, Integer num, String str, byte[] bArr, long j, long j2, long j3) {
        this.A00 = j;
        this.A04 = num;
        this.A01 = j2;
        this.A06 = bArr;
        this.A05 = str;
        this.A02 = j3;
        this.A03 = rf5;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LogEvent{eventTimeMs=");
        A1A.append(this.A00);
        A1A.append(", eventCode=");
        A1A.append(this.A04);
        A1A.append(", eventUptimeMs=");
        A1A.append(this.A01);
        A1A.append(", sourceExtension=");
        A1A.append(Arrays.toString(this.A06));
        A1A.append(", sourceExtensionJsonProto3=");
        A1A.append(this.A05);
        A1A.append(", timezoneOffsetSeconds=");
        A1A.append(this.A02);
        A1A.append(", networkConnectionInfo=");
        return C66582MXn.A0v(this.A03, A1A);
    }
}
