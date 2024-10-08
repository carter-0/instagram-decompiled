package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.4YR  reason: invalid class name */
public final class AnonymousClass4YR extends AnonymousClass4Y1 {
    public boolean A00;
    public long A01;
    public final int A02;
    public final long A03;
    public final C257163wx A04;
    public final C265014Se A05;
    public volatile boolean A06 = false;
    public volatile boolean A07;

    public final void AGO() {
        this.A07 = true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4YR(X.C257163wx r21, X.C256683wB r22, X.C265014Se r23, X.C257113ws r24, X.C257263x7 r25, java.lang.Object r26, int r27, int r28, long r29, long r31, long r33, long r35, long r37, long r39, long r41) {
        /*
            r20 = this;
            r10 = r31
            r8 = r29
            r18 = r41
            r6 = r26
            r16 = r37
            r4 = r24
            r2 = r20
            r12 = r33
            r3 = r22
            r14 = r35
            r5 = r25
            r7 = r27
            r2.<init>(r3, r4, r5, r6, r7, r8, r10, r12, r14, r16, r18)
            r0 = 0
            r2.A06 = r0
            r0 = r28
            r2.A02 = r0
            r0 = r39
            r2.A03 = r0
            r0 = r23
            r2.A05 = r0
            r0 = r21
            r2.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4YR.<init>(X.3wx, X.3wB, X.4Se, X.3ws, X.3x7, java.lang.Object, int, int, long, long, long, long, long, long, long):void");
    }

    public final void Cg1() {
        HashMap hashMap;
        C257263x7 r6;
        C266214Xz r8;
        AnonymousClass4Y6 r7;
        long j;
        if (this.A01 == 0) {
            C266074Xl r9 = this.A00;
            C256703wD.A01(r9);
            long j2 = this.A03;
            for (C265984Xc r5 : r9.A00) {
                if (r5.A07 != j2) {
                    r5.A07 = j2;
                    r5.A0H = true;
                }
            }
            C265014Se r82 = this.A05;
            long j3 = this.A03;
            long j4 = -9223372036854775807L;
            if (j3 == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                j = j3 - j2;
            }
            long j5 = this.A02;
            if (j5 != -9223372036854775807L) {
                j4 = j5 - j2;
            }
            r82.CMd(r9, j, j4);
        }
        try {
            hashMap = new HashMap();
            hashMap.put("bytes_loaded", Long.valueOf(this.A01));
            r6 = this.A06;
            long j6 = this.A01;
            long j7 = r6.A03;
            long j8 = -1;
            if (j7 != -1) {
                j8 = j7 - j6;
            }
            C257263x7 A002 = r6.A00(j6, j8);
            r8 = this.A07;
            r7 = new AnonymousClass4Y6(r8, A002.A02, r8.open(A002));
            this.A06 = false;
            while (!this.A07) {
                int E68 = ((C264994Sc) this.A05).A05.E68(r7, C264994Sc.A09);
                boolean z = false;
                if (E68 != 1) {
                    z = true;
                }
                C256703wD.A04(z);
                if (E68 != 0) {
                    break;
                }
            }
            this.A01 = r7.A02 - r6.A02;
        } catch (IOException e) {
            hashMap.put("exception", e.getLocalizedMessage());
            hashMap.put("stream_position", Long.valueOf(r7.A02));
            hashMap.put("absolute_position", Long.valueOf(r6.A02));
            this.A06 = true;
        } catch (Throwable th) {
            C266214Xz r2 = this.A07;
            C257113ws r1 = r2.A03;
            if (this.A07 && (r1 instanceof AnonymousClass4XL)) {
                ((AnonymousClass4XK) ((AnonymousClass4XL) r1)).A01.cancel();
            }
            try {
                r2.close();
            } catch (IOException unused) {
            }
            throw th;
        }
        C257113ws r12 = r8.A03;
        if (this.A07 && (r12 instanceof AnonymousClass4XL)) {
            ((AnonymousClass4XK) ((AnonymousClass4XL) r12)).A01.cancel();
        }
        try {
            r8.close();
        } catch (IOException unused2) {
        }
        this.A00 = true;
    }
}
