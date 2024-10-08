package X;

import java.util.List;

/* renamed from: X.S6i  reason: case insensitive filesystem */
public final class C11030S6i {
    public int A00;
    public long A01;
    public long A02;
    public Integer A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final C255343ty A0B;
    public final C255323tw A0C;
    public final C2379139t A0D;
    public final String A0E;
    public final List A0F;
    public final List A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11030S6i) {
                C11030S6i s6i = (C11030S6i) obj;
                if (!(0qQ.A0K(this.A0E, s6i.A0E) && this.A0D == s6i.A0D && 0qQ.A0K(this.A0C, s6i.A0C) && this.A08 == s6i.A08 && this.A09 == s6i.A09 && this.A07 == s6i.A07 && 0qQ.A0K(this.A0B, s6i.A0B) && this.A05 == s6i.A05 && this.A03 == s6i.A03 && this.A01 == s6i.A01 && this.A02 == s6i.A02 && this.A00 == s6i.A00 && this.A04 == s6i.A04 && this.A0A == s6i.A0A && this.A06 == s6i.A06 && 0qQ.A0K(this.A0G, s6i.A0G) && 0qQ.A0K(this.A0F, s6i.A0F))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A072 = (AnonymousClass7TF.A07(this.A0B, AnonymousClass7TF.A01(this.A07, AnonymousClass7TF.A01(this.A09, AnonymousClass7TF.A01(this.A08, AnonymousClass7TF.A07(this.A0C, AnonymousClass7TF.A07(this.A0D, AnonymousClass7TE.A0O(this.A0E))))))) + this.A05) * 31;
        int intValue = this.A03.intValue();
        if (1 != intValue) {
            str = "EXPONENTIAL";
        } else {
            str = "LINEAR";
        }
        int A012 = AnonymousClass7TF.A01(this.A01, (A072 + str.hashCode() + intValue) * 31);
        long j = this.A0A;
        return AnonymousClass7TE.A0N(this.A0F, AnonymousClass7TF.A07(this.A0G, (AnonymousClass7TF.A01(j, (((AnonymousClass7TF.A01(this.A02, A012) + this.A00) * 31) + this.A04) * 31) + this.A06) * 31));
    }

    public C11030S6i(C255343ty r3, C255323tw r4, C2379139t r5, Integer num, String str, List list, List list2, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5, long j6) {
        AnonymousClass7TG.A1U(str, r5, r4);
        0qQ.A0B(num, 9);
        this.A0E = str;
        this.A0D = r5;
        this.A0C = r4;
        this.A08 = j;
        this.A09 = j2;
        this.A07 = j3;
        this.A0B = r3;
        this.A05 = i;
        this.A03 = num;
        this.A01 = j4;
        this.A02 = j5;
        this.A00 = i2;
        this.A04 = i3;
        this.A0A = j6;
        this.A06 = i4;
        this.A0G = list;
        this.A0F = list2;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("WorkInfoPojo(id=");
        A1A.append(this.A0E);
        A1A.append(", state=");
        A1A.append(this.A0D);
        A1A.append(", output=");
        A1A.append(this.A0C);
        A1A.append(", initialDelay=");
        A1A.append(this.A08);
        A1A.append(", intervalDuration=");
        A1A.append(this.A09);
        A1A.append(", flexDuration=");
        A1A.append(this.A07);
        A1A.append(", constraints=");
        A1A.append(this.A0B);
        A1A.append(", runAttemptCount=");
        A1A.append(this.A05);
        A1A.append(", backoffPolicy=");
        if (1 - this.A03.intValue() != 0) {
            str = "EXPONENTIAL";
        } else {
            str = "LINEAR";
        }
        A1A.append(str);
        A1A.append(", backoffDelayDuration=");
        A1A.append(this.A01);
        A1A.append(", lastEnqueueTime=");
        A1A.append(this.A02);
        A1A.append(", periodCount=");
        A1A.append(this.A00);
        A1A.append(", generation=");
        A1A.append(this.A04);
        A1A.append(", nextScheduleTimeOverride=");
        A1A.append(this.A0A);
        A1A.append(", stopReason=");
        A1A.append(this.A06);
        A1A.append(", tags=");
        A1A.append(this.A0G);
        A1A.append(AnonymousClass000.A00(850));
        return AnonymousClass7TG.A0n(this.A0F, A1A);
    }
}
