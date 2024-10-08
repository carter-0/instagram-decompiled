package X;

import android.os.SystemClock;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.google.android.exoplayer2.util.Util;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4QY  reason: invalid class name */
public final class AnonymousClass4QY implements AnonymousClass4QZ {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04 = -9223372036854775807L;
    public boolean A05;
    public int A06;
    public long A07;
    public boolean A08;
    public final 27s A09;
    public final 27k A0A;
    public final AtomicBoolean A0B;
    public final AtomicBoolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final int A0F;
    public final int A0G;
    public final C697127t A0H;
    public final AnonymousClass4QT A0I;
    public final AnonymousClass27Y A0J;
    public final AnonymousClass4QV A0K;
    public volatile long A0L = -9223372036854775807L;
    public volatile long A0M = -9223372036854775807L;

    private void A00(boolean z) {
        this.A06 = 0;
        this.A08 = false;
        if (z) {
            AnonymousClass4QV r1 = this.A0K;
            synchronized (r1) {
                r1.A00(0);
            }
        }
        this.A0L = -9223372036854775807L;
        this.A04 = -9223372036854775807L;
    }

    public final long Aee() {
        return 0;
    }

    public final void DYy() {
        A00(false);
    }

    public final boolean EJB() {
        return false;
    }

    public final void onReleased() {
        A00(true);
    }

    public final void onStopped() {
        A00(true);
    }

    public final AnonymousClass4QW Ab1() {
        return this.A0K;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r6 != 5) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DtI(X.C264844Rn r10, X.AnonymousClass4PL[] r11, X.AnonymousClass4RX[] r12) {
        /*
            r9 = this;
            int r7 = r9.A0G
            r0 = -1
            if (r7 != r0) goto L_0x0046
            r8 = 0
            r7 = 0
        L_0x0007:
            int r0 = r11.length
            if (r8 >= r0) goto L_0x0046
            r0 = r12[r8]
            if (r0 == 0) goto L_0x0026
            r0 = r11[r8]
            X.4PK r0 = (X.AnonymousClass4PK) r0
            int r6 = r0.A0B
            boolean r5 = r9.A05
            r4 = 0
            r3 = 5
            r2 = 3
            r1 = 2
            r0 = 1
            if (r5 == 0) goto L_0x002f
            if (r6 == r0) goto L_0x002c
            if (r6 == r1) goto L_0x0029
            if (r6 == r2) goto L_0x003d
            if (r6 == r3) goto L_0x003d
        L_0x0025:
            int r7 = r7 + r4
        L_0x0026:
            int r8 = r8 + 1
            goto L_0x0007
        L_0x0029:
            int r4 = r9.A01
            goto L_0x0025
        L_0x002c:
            int r4 = r9.A00
            goto L_0x0025
        L_0x002f:
            if (r6 == r0) goto L_0x0043
            if (r6 == r1) goto L_0x0040
            if (r6 == r2) goto L_0x003d
            if (r6 == r3) goto L_0x003d
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x003d:
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0025
        L_0x0040:
            r4 = 13107200(0xc80000, float:1.8367099E-38)
            goto L_0x0025
        L_0x0043:
            r4 = 3538944(0x360000, float:4.959117E-39)
            goto L_0x0025
        L_0x0046:
            r9.A06 = r7
            X.4QV r0 = r9.A0K
            r0.A00(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4QY.DtI(X.4Rn, X.4PL[], X.4RX[]):void");
    }

    public final void EUg(long j, long j2) {
        this.A0L = j;
        this.A0M = j2;
    }

    public final boolean Erx(C284645Nj r9) {
        long j = r9.A02;
        if (j < 0) {
            j = this.A07;
        } else {
            this.A07 = j;
        }
        return Ery(r9.A00, j, r9.A01, r9.A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        if (r1.A01() == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0056, code lost:
        if (r2 == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0094, code lost:
        if (r1.A01() == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a2, code lost:
        if (r1 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x00ee, code lost:
        if (r0 > 0) goto L_0x00f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0113 A[Catch:{ all -> 0x0124 }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0115 A[Catch:{ all -> 0x0124 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x008f A[Catch:{ all -> 0x0124 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x00f8 A[Catch:{ all -> 0x0124 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0104 A[Catch:{ all -> 0x0124 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Ery(float r18, long r19, long r21, boolean r23) {
        /*
            r17 = this;
            java.lang.String r0 = "shouldContinueLoading"
            X.27d.A01(r0)     // Catch:{ all -> 0x0124 }
            r7 = r17
            boolean r0 = r7.A0D     // Catch:{ all -> 0x0124 }
            r2 = 1
            if (r0 == 0) goto L_0x0017
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A0B     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.get()     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x0017
            goto L_0x0020
        L_0x0017:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A0C     // Catch:{ all -> 0x0124 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0124 }
            if (r0 != 0) goto L_0x0020
            r2 = 0
        L_0x0020:
            r1 = 0
            if (r2 != 0) goto L_0x002a
            boolean r0 = r7.A0E     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x002a
            if (r23 != 0) goto L_0x002a
            r1 = 1
        L_0x002a:
            r6 = 0
            if (r1 != 0) goto L_0x0120
            X.4QV r0 = r7.A0K     // Catch:{ all -> 0x0124 }
            int r1 = r0.C8e()     // Catch:{ all -> 0x0124 }
            int r0 = r7.A06     // Catch:{ all -> 0x0124 }
            r16 = 0
            if (r1 < r0) goto L_0x003b
            r16 = 1
        L_0x003b:
            X.4QT r9 = r7.A0I     // Catch:{ all -> 0x0124 }
            X.27s r1 = r7.A09     // Catch:{ all -> 0x0124 }
            if (r1 == 0) goto L_0x0048
            boolean r0 = r1.A01()     // Catch:{ all -> 0x0124 }
            r8 = 1
            if (r0 != 0) goto L_0x0049
        L_0x0048:
            r8 = 0
        L_0x0049:
            boolean r11 = r9.A09     // Catch:{ all -> 0x0124 }
            if (r11 == 0) goto L_0x0058
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A06     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x0058
            boolean r2 = r0.get()     // Catch:{ all -> 0x0124 }
            r0 = 1
            if (r2 != 0) goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            r14 = 0
            r4 = r19
            if (r0 == 0) goto L_0x0066
            long r2 = r9.A03     // Catch:{ all -> 0x0124 }
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0066
            goto L_0x008d
        L_0x0066:
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A07     // Catch:{ all -> 0x0124 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x0071
            long r2 = r9.A02     // Catch:{ all -> 0x0124 }
            goto L_0x008d
        L_0x0071:
            if (r23 != 0) goto L_0x007a
            long r2 = r9.A04     // Catch:{ all -> 0x0124 }
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x007a
            goto L_0x008d
        L_0x007a:
            if (r11 == 0) goto L_0x0083
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A06     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x0083
            r0.get()     // Catch:{ all -> 0x0124 }
        L_0x0083:
            long r2 = r9.A00(r4, r8)     // Catch:{ all -> 0x0124 }
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x008d
            long r2 = r9.A01     // Catch:{ all -> 0x0124 }
        L_0x008d:
            if (r1 == 0) goto L_0x0096
            boolean r0 = r1.A01()     // Catch:{ all -> 0x0124 }
            r10 = 1
            if (r0 != 0) goto L_0x0097
        L_0x0096:
            r10 = 0
        L_0x0097:
            if (r11 == 0) goto L_0x00a4
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A06     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x00a4
            boolean r1 = r0.get()     // Catch:{ all -> 0x0124 }
            r0 = 1
            if (r1 != 0) goto L_0x00a5
        L_0x00a4:
            r0 = 0
        L_0x00a5:
            if (r0 == 0) goto L_0x00ae
            long r0 = r9.A03     // Catch:{ all -> 0x0124 }
            int r8 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r8 <= 0) goto L_0x00ae
            goto L_0x00f0
        L_0x00ae:
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A07     // Catch:{ all -> 0x0124 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x00b9
            long r0 = r9.A02     // Catch:{ all -> 0x0124 }
            goto L_0x00f0
        L_0x00b9:
            if (r23 != 0) goto L_0x00c2
            long r0 = r9.A04     // Catch:{ all -> 0x0124 }
            int r8 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r8 <= 0) goto L_0x00c2
            goto L_0x00f0
        L_0x00c2:
            if (r11 == 0) goto L_0x00cb
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A06     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x00cb
            r0.get()     // Catch:{ all -> 0x0124 }
        L_0x00cb:
            X.1xZ r1 = r9.A05     // Catch:{ all -> 0x0124 }
            if (r1 == 0) goto L_0x00e4
            boolean r0 = r9.A08     // Catch:{ all -> 0x0124 }
            if (r0 != 0) goto L_0x00e4
            if (r10 == 0) goto L_0x00d6
            goto L_0x00d9
        L_0x00d6:
            int r8 = r1.A02     // Catch:{ all -> 0x0124 }
            goto L_0x00db
        L_0x00d9:
            int r8 = r1.A05     // Catch:{ all -> 0x0124 }
        L_0x00db:
            long r0 = r9.A00(r4, r10)     // Catch:{ all -> 0x0124 }
            int r4 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x00e4
            goto L_0x00e7
        L_0x00e4:
            long r0 = r9.A00     // Catch:{ all -> 0x0124 }
            goto L_0x00f0
        L_0x00e7:
            long r4 = (long) r8     // Catch:{ all -> 0x0124 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r10
            long r0 = r0 + r4
            int r4 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x00e4
        L_0x00f0:
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = r18
            int r4 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0100
            long r2 = com.google.android.exoplayer2.util.Util.A05(r5, r2)     // Catch:{ all -> 0x0124 }
            long r2 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x0124 }
        L_0x0100:
            int r4 = r7.A0F     // Catch:{ all -> 0x0124 }
            if (r4 <= 0) goto L_0x010f
            int r4 = r4 * 1000
            long r4 = (long) r4     // Catch:{ all -> 0x0124 }
            long r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0124 }
            long r0 = java.lang.Math.min(r0, r4)     // Catch:{ all -> 0x0124 }
        L_0x010f:
            int r4 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0115
            r6 = 1
            goto L_0x011e
        L_0x0115:
            int r2 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x011e
            if (r16 != 0) goto L_0x011e
            boolean r6 = r7.A08     // Catch:{ all -> 0x0124 }
            goto L_0x0120
        L_0x011e:
            r7.A08 = r6     // Catch:{ all -> 0x0124 }
        L_0x0120:
            X.27d.A00()
            return r6
        L_0x0124:
            r0 = move-exception
            X.27d.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4QY.Ery(float, long, long, boolean):boolean");
    }

    public final boolean EtV(float f, long j, long j2, boolean z, boolean z2) {
        long j3;
        if (f != 1.0f) {
            j = Math.round(((double) j) / ((double) f));
        }
        if (!z) {
            j3 = (long) (((float) this.A03) * 1.0f);
        } else if (z2) {
            j3 = (long) (27k.A00(this.A0A, 9) * IgNetworkConsentStorage.MAX_ENTRIES);
        } else {
            long j4 = this.A0L;
            long j5 = this.A0M;
            if (j4 == -9223372036854775807L) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j6 = this.A04;
                if (j6 == -9223372036854775807L) {
                    this.A04 = elapsedRealtime;
                } else if (elapsedRealtime - j6 > j5) {
                    this.A0L = -9223372036854775807L;
                    this.A04 = -9223372036854775807L;
                }
            }
            long j7 = this.A0L;
            if (j7 != -9223372036854775807L) {
                UUID uuid = AnonymousClass4T7.A04;
                j3 = Util.A07(j7);
            } else {
                j3 = this.A02;
            }
        }
        if (j3 > 0 && j < j3) {
            return false;
        }
        this.A0L = -9223372036854775807L;
        this.A04 = -9223372036854775807L;
        return true;
    }

    public AnonymousClass4QY(C697127t r6, AnonymousClass4QT r7, AnonymousClass27Y r8, 27s r9, 27k r10, AnonymousClass4QV r11, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3) {
        C256703wD.A05(i >= 0, 002.A0g("mBufferForPlaybackMs", " cannot be less than ", "0"));
        C256703wD.A05(i2 >= 0, 002.A0g("mBufferForPlaybackAfterRebufferMs", " cannot be less than ", "0"));
        this.A0K = r11;
        this.A03 = ((long) i) * 1000;
        this.A02 = ((long) i2) * 1000;
        this.A0A = r10;
        this.A0G = i3;
        this.A01 = i4;
        this.A00 = i5;
        this.A05 = z;
        this.A0E = z2;
        this.A0I = r7;
        this.A09 = r9;
        this.A0H = r6;
        this.A0J = r8;
        this.A0C = atomicBoolean;
        this.A0B = atomicBoolean2;
        this.A0D = z3;
        this.A0F = i6;
    }
}
