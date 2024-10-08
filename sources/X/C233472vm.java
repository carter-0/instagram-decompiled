package X;

import java.util.List;

/* renamed from: X.2vm  reason: invalid class name and case insensitive filesystem */
public class C233472vm {
    public C233492vo A00;
    public boolean A01 = false;

    public final void A0C(boolean z) {
        int max;
        int i = 1;
        if (!z) {
            Integer num = this.A00.A03;
            if (num == null || (max = num.intValue()) <= 0 || max >= Integer.MAX_VALUE) {
                max = Math.max(1, A03() - 1);
            }
            i = max;
        }
        C233492vo r0 = this.A00;
        Integer num2 = r0.A03;
        Integer num3 = r0.A04;
        Integer num4 = r0.A05;
        List list = r0.A0H;
        Integer num5 = r0.A06;
        Boolean bool = r0.A01;
        Integer num6 = r0.A08;
        Integer num7 = r0.A09;
        Integer num8 = r0.A0A;
        Integer num9 = r0.A0B;
        Integer num10 = r0.A0C;
        C67241sS r5 = r0.A00;
        Integer num11 = r0.A0D;
        Integer num12 = r0.A0E;
        Integer num13 = r0.A0F;
        Integer num14 = r0.A0G;
        List list2 = list;
        Integer num15 = num3;
        Integer num16 = num4;
        Integer num17 = num5;
        Integer num18 = num6;
        C67241sS r14 = r5;
        Boolean bool2 = bool;
        Float f = r0.A02;
        Integer num19 = num2;
        this.A00 = C233482vn.A00(r14, bool2, f, num19, num15, num16, num17, Integer.valueOf(i), num18, num7, num8, num9, num10, num11, num12, num13, num14, list2);
    }

    public C233472vm(C233492vo r22) {
        C233492vo r2 = r22;
        this.A00 = r22 == null ? new C233492vo((C67241sS) null, (Boolean) null, (Float) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (List) null) : r2;
    }

    public final double A00() {
        Float f = this.A00.A02;
        if (f != null) {
            return (double) f.floatValue();
        }
        return 0.0d;
    }

    public final int A01() {
        Integer num = this.A00.A04;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int A02() {
        Integer num = this.A00.A05;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int A03() {
        Integer num;
        boolean z = this.A01;
        C233492vo r0 = this.A00;
        if (z) {
            num = r0.A0F;
            if (num == null || num.intValue() == 0) {
                return 3;
            }
        } else {
            num = r0.A07;
            if (num == null) {
                return 0;
            }
        }
        return num.intValue();
    }

    public final int A04() {
        Integer num = this.A00.A08;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int A05() {
        Integer num = this.A00.A09;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int A06() {
        Integer num = this.A00.A0B;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int A07() {
        Integer num = this.A00.A0D;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int A08() {
        Integer num = this.A00.A0E;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int A09() {
        Integer num = this.A00.A0G;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void A0A(int i) {
        C233492vo r0 = this.A00;
        Integer num = r0.A03;
        Integer num2 = r0.A04;
        Integer num3 = r0.A05;
        List list = r0.A0H;
        Integer num4 = r0.A06;
        Integer num5 = r0.A07;
        Boolean bool = r0.A01;
        Integer num6 = r0.A08;
        Integer num7 = r0.A0A;
        Integer num8 = r0.A0B;
        Integer num9 = r0.A0C;
        C67241sS r5 = r0.A00;
        Integer num10 = r0.A0D;
        Integer num11 = r0.A0E;
        Integer num12 = r0.A0F;
        Integer num13 = r0.A0G;
        Integer num14 = num5;
        Integer num15 = num6;
        Integer num16 = num7;
        Integer num17 = num2;
        Integer num18 = num3;
        Integer num19 = num4;
        Boolean bool2 = bool;
        Float f = r0.A02;
        C67241sS r15 = r5;
        this.A00 = C233482vn.A00(r15, bool2, f, num, num17, num18, num19, num14, num15, Integer.valueOf(i), num16, num8, num9, num10, num11, num12, num13, list);
    }

    public final void A0B(int i) {
        C233492vo r0 = this.A00;
        Integer num = r0.A03;
        Integer num2 = r0.A04;
        Integer num3 = r0.A05;
        List list = r0.A0H;
        Integer num4 = r0.A06;
        Integer num5 = r0.A07;
        Boolean bool = r0.A01;
        Integer num6 = r0.A08;
        Integer num7 = r0.A09;
        Integer num8 = r0.A0A;
        Integer num9 = r0.A0B;
        Integer num10 = r0.A0C;
        C67241sS r4 = r0.A00;
        Integer num11 = r0.A0D;
        Integer num12 = r0.A0E;
        Integer num13 = r0.A0F;
        Integer num14 = num10;
        Integer num15 = num11;
        Integer num16 = num12;
        Integer num17 = num7;
        Integer num18 = num8;
        Integer num19 = num9;
        Integer num20 = num4;
        Integer num21 = num5;
        Integer num22 = num6;
        Integer num23 = num;
        Integer num24 = num2;
        Integer num25 = num3;
        C67241sS r15 = r4;
        Boolean bool2 = bool;
        Float f = r0.A02;
        this.A00 = C233482vn.A00(r15, bool2, f, num23, num24, num25, num20, num21, num22, num17, num18, num19, num14, num15, num16, num13, Integer.valueOf(i), list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GapRules{mEvaluatedExpression=");
        sb.append((Object) null);
        sb.append(", mConsumedMediaGapToPreviousAd=");
        sb.append(A01());
        sb.append(", mConsumedMediaGapToPreviousNetego=");
        sb.append(A02());
        sb.append(", mHighestPositionRule=");
        sb.append(A03());
        sb.append(", mMinMediaGapToPreviousItem=");
        sb.append(A06());
        sb.append(", mTimeGapToPreviousItemSeconds=");
        sb.append(A00());
        sb.append(", mRawRulesExpression=");
        sb.append(this.A00.A0H);
        sb.append(", mReelGapToPreviousAd=");
        sb.append(A07());
        sb.append(", mReelGapToPreviousNetego=");
        sb.append(A08());
        sb.append(", mMaxReelGapToPreviousItem=");
        sb.append(A04());
        sb.append('}');
        return sb.toString();
    }
}
