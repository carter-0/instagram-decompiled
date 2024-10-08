package X;

import java.util.Set;
import java.util.UUID;

/* renamed from: X.S6g  reason: case insensitive filesystem */
public final class C11028S6g {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C255323tw A03;
    public final C255323tw A04;
    public final C2379139t A05;
    public final Set A06;
    public final UUID A07;
    public final int A08;
    public final long A09;
    public final C255343ty A0A;
    public final S5P A0B;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !DbY.A1b(this, obj)) {
            return false;
        }
        C11028S6g s6g = (C11028S6g) obj;
        if (this.A01 == s6g.A01 && this.A00 == s6g.A00 && 0qQ.A0K(this.A07, s6g.A07) && this.A05 == s6g.A05 && 0qQ.A0K(this.A03, s6g.A03) && 0qQ.A0K(this.A0A, s6g.A0A) && this.A09 == s6g.A09 && 0qQ.A0K(this.A0B, s6g.A0B) && this.A02 == s6g.A02 && this.A08 == s6g.A08 && 0qQ.A0K(this.A06, s6g.A06)) {
            return 0qQ.A0K(this.A04, s6g.A04);
        }
        return false;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A05, AnonymousClass7TE.A0K(this.A07))));
        int A073 = AnonymousClass7TF.A07(this.A0A, (((AnonymousClass7TF.A07(this.A04, A072) + this.A01) * 31) + this.A00) * 31);
        return AnonymousClass7TF.A01(this.A02, (AnonymousClass7TF.A01(this.A09, A073) + C51971G9r.A0E(this.A0B)) * 31) + this.A08;
    }

    public C11028S6g(C255343ty r1, C255323tw r2, C255323tw r3, S5P s5p, C2379139t r5, Set set, UUID uuid, int i, int i2, int i3, long j, long j2) {
        this.A07 = uuid;
        this.A05 = r5;
        this.A06 = set;
        this.A03 = r2;
        this.A04 = r3;
        this.A01 = i;
        this.A00 = i2;
        this.A0A = r1;
        this.A09 = j;
        this.A0B = s5p;
        this.A02 = j2;
        this.A08 = i3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("WorkInfo{id='");
        A1A.append(this.A07);
        A1A.append("', state=");
        A1A.append(this.A05);
        A1A.append(", outputData=");
        A1A.append(this.A03);
        A1A.append(", tags=");
        A1A.append(this.A06);
        A1A.append(AnonymousClass000.A00(850));
        A1A.append(this.A04);
        A1A.append(", runAttemptCount=");
        A1A.append(this.A01);
        A1A.append(", generation=");
        A1A.append(this.A00);
        A1A.append(", constraints=");
        A1A.append(this.A0A);
        A1A.append(", initialDelayMillis=");
        A1A.append(this.A09);
        A1A.append(", periodicityInfo=");
        A1A.append(this.A0B);
        A1A.append(", nextScheduleTimeMillis=");
        A1A.append(this.A02);
        A1A.append("}, stopReason=");
        return Pxe.A0z(A1A, this.A08);
    }
}
