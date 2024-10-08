package X;

import com.google.android.exoplayer2.Timeline;

/* renamed from: X.4Rp  reason: invalid class name and case insensitive filesystem */
public final class C264864Rp {
    public static final C264874Rq A0E = new C264884Rr(new Object(), -1, -1, -1, -1);
    public final int A00;
    public final long A01;
    public final long A02;
    public final Timeline A03;
    public final C264874Rq A04;
    public final C264874Rq A05;
    public final C264844Rn A06;
    public final C264734Rb A07;
    public final Integer A08;
    public final boolean A09;
    public final boolean A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C264864Rp(com.google.android.exoplayer2.Timeline r21, X.C264844Rn r22, X.C264734Rb r23, long r24) {
        /*
            r20 = this;
            X.4Rq r2 = A0E
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 1
            r18 = 0
            r0 = r20
            r1 = r21
            r4 = r22
            r5 = r23
            r8 = r24
            r3 = r2
            r12 = r8
            r14 = r8
            r16 = r8
            r19 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r16, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C264864Rp.<init>(com.google.android.exoplayer2.Timeline, X.4Rn, X.4Rb, long):void");
    }

    public static void A00(C264864Rp r2, C264864Rp r3) {
        r3.A0C = r2.A0C;
        r3.A0B = r2.A0B;
        r3.A0D = r2.A0D;
    }

    public final C264864Rp A01(C264874Rq r23, long j, long j2, long j3) {
        long j4 = j2;
        Timeline timeline = this.A03;
        C264874Rq r4 = r23;
        if (r4.A00 == -1) {
            j4 = -9223372036854775807L;
        }
        int i = this.A00;
        boolean z = this.A0A;
        C264844Rn r6 = this.A06;
        C264734Rb r7 = this.A07;
        long j5 = j;
        return new C264864Rp(timeline, r4, this.A04, r6, r7, AnonymousClass05K.A00, i, j5, j4, this.A0B, j3, j5, z, false);
    }

    public final C264864Rp A02(C264844Rn r35, C264734Rb r36) {
        Timeline timeline = this.A03;
        C264874Rq r19 = this.A05;
        long j = this.A02;
        long j2 = this.A01;
        boolean z = this.A0A;
        C264874Rq r14 = this.A04;
        long j3 = this.A0B;
        long j4 = this.A0D;
        long j5 = this.A0C;
        Integer num = this.A08;
        int i = this.A00;
        long j6 = j;
        long j7 = j2;
        C264874Rq r15 = r19;
        C264874Rq r16 = r14;
        Integer num2 = num;
        Timeline timeline2 = timeline;
        C264864Rp r13 = new C264864Rp(timeline2, r15, r16, r35, r36, num2, i, j6, j7, j3, j4, j5, z, this.A09);
        A00(this, r13);
        return r13;
    }

    public C264864Rp(Timeline timeline, C264874Rq r4, C264874Rq r5, C264844Rn r6, C264734Rb r7, Integer num, int i, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2) {
        this.A03 = timeline;
        this.A05 = r4;
        this.A02 = j;
        this.A01 = j2;
        this.A0C = j;
        this.A00 = i;
        this.A0A = z;
        this.A06 = r6;
        this.A07 = r7;
        this.A04 = r5;
        this.A0B = j3;
        this.A0D = j4;
        this.A0C = j5;
        this.A08 = num;
        this.A09 = z2;
    }
}
