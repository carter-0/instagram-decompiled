package X;

import java.util.Arrays;

public final class N9C extends AnonymousClass0T0 implements C74269Prx {
    public final long A00;
    public final Integer A01;
    public final Integer A02;
    public final boolean A03;
    public final String[] A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9C) {
                N9C n9c = (N9C) obj;
                if (!(this.A01 == n9c.A01 && this.A00 == n9c.A00 && 0qQ.A0K(this.A04, n9c.A04) && this.A02 == n9c.A02 && this.A03 == n9c.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        Integer num = this.A01;
        int A07 = (C51972G9s.A07(this.A00, C51971G9r.A0D(num, O2O.A00(num)) * 31) + Arrays.hashCode(this.A04)) * 31;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "HIGH";
                break;
            case 2:
                str = "GUARANTEED";
                break;
            default:
                str = "DEFAULT";
                break;
        }
        return DbS.A06(this.A03, C51971G9r.A0F(str, intValue, A07));
    }

    public N9C(Integer num, Integer num2, String[] strArr, long j, boolean z) {
        this.A01 = num;
        this.A00 = j;
        this.A04 = strArr;
        this.A02 = num2;
        this.A03 = z;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallSystemMessageModel(message=");
        Integer num = this.A01;
        if (num != null) {
            str = O2O.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", messageTimeMs=");
        A1A.append(this.A00);
        A1A.append(", messageArguments=");
        A1A.append(Arrays.toString(this.A04));
        A1A.append(", priority=");
        Integer num2 = this.A02;
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str2 = "HIGH";
                    break;
                case 2:
                    str2 = "GUARANTEED";
                    break;
                default:
                    str2 = "DEFAULT";
                    break;
            }
        } else {
            str2 = "null";
        }
        A1A.append(str2);
        A1A.append(", longDuration=");
        return G9t.A1C(A1A, this.A03);
    }
}
