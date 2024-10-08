package X;

import java.io.Serializable;

/* renamed from: X.Jzu  reason: case insensitive filesystem */
public final class C61262Jzu extends AnonymousClass0T0 implements Serializable {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public Integer A03;
    public final long A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;

    public C61262Jzu(Integer num, Integer num2, Integer num3, Integer num4, long j) {
        AnonymousClass7TG.A0w(1, num, num2, num3);
        this.A07 = num;
        this.A04 = j;
        this.A06 = num2;
        this.A05 = num3;
        this.A03 = num4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61262Jzu) {
                C61262Jzu jzu = (C61262Jzu) obj;
                if (!(this.A07 == jzu.A07 && this.A04 == jzu.A04 && this.A06 == jzu.A06 && this.A05 == jzu.A05 && this.A03 == jzu.A03 && this.A00 == jzu.A00 && this.A02 == jzu.A02 && this.A01 == jzu.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2;
        Integer num = this.A07;
        switch (num.intValue()) {
            case 1:
                str = "LUKEWARM";
                break;
            case 2:
                str = "HOT";
                break;
            case 3:
                str = "OTHER_HEAD_LOAD";
                break;
            default:
                str = "COLD";
                break;
        }
        int A072 = C51972G9s.A07(this.A04, C51971G9r.A0D(num, str) * 31);
        Integer num2 = this.A06;
        int A0B = AnonymousClass7TG.A0B(num2, 0qU.A00(num2), A072);
        Integer num3 = this.A05;
        int A0B2 = AnonymousClass7TG.A0B(num3, 0qT.A00(num3), A0B);
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str2 = "FAILED";
                break;
            case 2:
                str2 = "SUCCESSED";
                break;
            default:
                str2 = "IN_PROGRESS";
                break;
        }
        return ((((C51971G9r.A0F(str2, intValue, A0B2) + this.A00) * 31) + this.A02) * 31) + this.A01;
    }
}
