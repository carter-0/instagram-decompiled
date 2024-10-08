package X;

import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4Mw  reason: invalid class name and case insensitive filesystem */
public final class C263664Mw {
    public int A00;
    public int A01;
    public int A02 = -1;
    public int A03 = -1;
    public long A04;
    public long A05;
    public Surface A06;
    public AnonymousClass4OI A07;
    public 274 A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public volatile Surface A0C;
    public final /* synthetic */ C263634Mt A0D;

    public static void A05(C263664Mw r5) {
        r5.A0A = false;
        r5.A01 = 0;
        r5.A00 = 0;
        r5.A07 = null;
        C263634Mt r3 = r5.A0D;
        AtomicInteger atomicInteger = C263634Mt.A0b;
        r3.A0P = 1.0f;
        r5.A04 = 0;
        r5.A05 = 0;
        r3.A0U = 0;
        r3.A0X = false;
        r3.A0B.set(new C263674Mx());
        r3.A0N.set(C263684My.A0D);
        List list = r3.A0L;
        synchronized (list) {
            list.clear();
            r3.A00 = -1;
        }
        r5.A0B = false;
    }

    public C263664Mw(C263634Mt r2) {
        this.A0D = r2;
    }

    public static 274 A00(C263664Mw r1) {
        274 r0 = r1.A08;
        if (r0 != null) {
            return r0;
        }
        throw new RemoteException("No service api available");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ce, code lost:
        if (r0.A07.A0B != false) goto L_0x00d0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C263664Mw r17) {
        /*
            r0 = r17
            X.4Mt r9 = r0.A0D
            java.util.concurrent.atomic.AtomicInteger r1 = X.C263634Mt.A0b
            X.4Mg r1 = r9.A06
            X.274 r6 = r1.A00()
            r0.A08 = r6
            X.4OI r1 = r0.A07
            if (r1 == 0) goto L_0x0066
            r3 = 0
            long r4 = r9.A0S     // Catch:{ IllegalStateException | NullPointerException -> 0x003e }
            X.4OI r2 = r0.A07     // Catch:{ IllegalStateException | NullPointerException -> 0x003e }
            X.4N6 r1 = r9.A07     // Catch:{ IllegalStateException | NullPointerException -> 0x003e }
            long r4 = r6.A06(r2, r1, r4)     // Catch:{ IllegalStateException | NullPointerException -> 0x003e }
            long r6 = r9.A0S     // Catch:{ IllegalStateException | NullPointerException -> 0x003e }
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0030
            r9.A0R = r3     // Catch:{ IllegalStateException | NullPointerException -> 0x003e }
            r2 = 0
            r0.A06 = r2     // Catch:{ IllegalStateException | NullPointerException -> 0x003e }
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r1 = r9.A08     // Catch:{ IllegalStateException | NullPointerException -> 0x003e }
            boolean r1 = r1.A30     // Catch:{ IllegalStateException | NullPointerException -> 0x003e }
            if (r1 != 0) goto L_0x0030
            r9.A0W = r2     // Catch:{ IllegalStateException | NullPointerException -> 0x003e }
        L_0x0030:
            r9.A0S = r4     // Catch:{ IllegalStateException | NullPointerException -> 0x003e }
            long[] r6 = r9.A0O     // Catch:{ IllegalStateException | NullPointerException -> 0x003e }
            r4 = r6[r3]     // Catch:{ IllegalStateException | NullPointerException -> 0x003e }
            r1 = 1
            r6[r1] = r4     // Catch:{ IllegalStateException | NullPointerException -> 0x003e }
            long r1 = r9.A0S     // Catch:{ IllegalStateException | NullPointerException -> 0x003e }
            r6[r3] = r1     // Catch:{ IllegalStateException | NullPointerException -> 0x003e }
            goto L_0x0064
        L_0x003e:
            r14 = move-exception
            java.lang.String r12 = "Error occurs while creating player"
            X.5OZ r11 = X.AnonymousClass5OZ.PLAYER_ERROR     // Catch:{ all -> 0x0060 }
            X.4Yz r10 = X.C266464Yz.A0K     // Catch:{ all -> 0x0060 }
            X.4OI r1 = r0.A07     // Catch:{ all -> 0x0060 }
            java.lang.String r13 = r1.A07     // Catch:{ all -> 0x0060 }
            X.C263634Mt.A02(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0060 }
            r1 = 0
            r9.A0S = r1     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = "Failed ensure service player, "
            java.lang.String r1 = r14.getMessage()     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = X.002.A0R(r2, r1)     // Catch:{ all -> 0x0060 }
            android.os.RemoteException r1 = new android.os.RemoteException     // Catch:{ all -> 0x0060 }
            r1.<init>(r2)     // Catch:{ all -> 0x0060 }
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r1 = move-exception
            r0.A0B = r3
            throw r1
        L_0x0064:
            r0.A0B = r3
        L_0x0066:
            android.view.Surface r1 = r0.A0C
            if (r1 == 0) goto L_0x0096
            android.view.Surface r2 = r0.A0C
            android.view.Surface r1 = r0.A06
            if (r2 == r1) goto L_0x0096
            X.274 r8 = r0.A08
            long r2 = r9.A0S
            android.view.Surface r7 = r0.A0C
            int r6 = r0.A03
            int r5 = r0.A02
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r4 = new java.lang.Object[]{r1, r7}
            java.lang.String r1 = "id [%d]: setSurface: %s"
            X.28J.A03(r1, r4)
            X.29n r1 = r8.A0c
            X.4OS r1 = r1.A00(r2)
            if (r1 == 0) goto L_0x0096
            r1.A0O(r7, r6, r5)
            android.view.Surface r1 = r0.A0C
            r0.A06 = r1
        L_0x0096:
            X.4OI r6 = r0.A07
            if (r6 == 0) goto L_0x0127
            long r4 = r0.A04
            r1 = 0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x016d
            X.3uU r3 = r6.A0K
            boolean r3 = r3.A03()
            if (r3 == 0) goto L_0x0147
            X.274 r7 = r0.A08
            long r5 = r9.A0S
            long r3 = r0.A05
            r7.A0A(r5, r3)
        L_0x00b3:
            r0.A04 = r1
            r0.A05 = r1
        L_0x00b7:
            X.274 r4 = r0.A08
            long r1 = r9.A0S
            X.4OI r11 = r0.A07
            boolean r3 = r0.A0A
            r14 = 1
            if (r3 != 0) goto L_0x00c3
            r14 = 0
        L_0x00c3:
            float r10 = r9.A0Q
            boolean r3 = r9.A0X
            if (r3 != 0) goto L_0x00d0
            X.4OI r3 = r0.A07
            boolean r3 = r3.A0B
            r13 = 0
            if (r3 == 0) goto L_0x00d1
        L_0x00d0:
            r13 = 1
        L_0x00d1:
            r8 = 3
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            r9 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r14)
            r12 = 1
            X.3uU r7 = r11.A0K
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r3, r7}
            java.lang.String r3 = "id [%d]: prepareAndMayPlay, shouldPlay=%b, videoSource=%s"
            X.28J.A03(r3, r5)
            X.29n r3 = r4.A0c
            X.4OS r6 = r3.A00(r1)
            if (r6 == 0) goto L_0x0127
            if (r14 == 0) goto L_0x0145
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A0R
            boolean r3 = r1.compareAndSet(r12, r9)
        L_0x00f7:
            r6.A0M(r10)
            r6.A0Q(r11)
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.String r1 = "Set Looping"
            X.AnonymousClass4OS.A0E(r6, r1, r2)
            android.os.Handler r5 = r6.A0G
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r13)
            r1 = 18
            android.os.Message r1 = r5.obtainMessage(r1, r2)
            X.AnonymousClass4OS.A07(r1, r6)
            if (r14 == 0) goto L_0x012b
            r1 = -1
            r6.A0N(r1, r3)
        L_0x011a:
            java.lang.String r2 = r7.A0G
            if (r2 == 0) goto L_0x0127
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r1 = r4.A0H
            boolean r1 = r1.A1i
            if (r1 == 0) goto L_0x0127
            X.274.A04(r4, r2)
        L_0x0127:
            r1 = 0
            r0.A09 = r1
            return
        L_0x012b:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)
            java.lang.Object[] r2 = new java.lang.Object[]{r3}
            java.lang.String r1 = "Pause: finishPlayback=%b"
            X.AnonymousClass4OS.A0E(r6, r1, r2)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1}
            android.os.Message r1 = r5.obtainMessage(r8, r1)
            X.AnonymousClass4OS.A07(r1, r6)
            goto L_0x011a
        L_0x0145:
            r3 = 0
            goto L_0x00f7
        L_0x0147:
            java.util.concurrent.atomic.AtomicLong r3 = X.C263634Mt.A0c
            long r15 = r3.incrementAndGet()
            X.274 r10 = r0.A08
            long r11 = r9.A0S
            long r13 = r0.A04
            r17 = 0
            boolean r3 = r10.A0B(r11, r13, r15, r17)
            if (r3 == 0) goto L_0x0169
            long r3 = r0.A04
            r9.A0T = r3
            r9.A0U = r15
            long r3 = android.os.SystemClock.elapsedRealtime()
            r9.A0V = r3
            goto L_0x00b3
        L_0x0169:
            r9.A0U = r1
            goto L_0x00b3
        L_0x016d:
            int r3 = r0.A01
            if (r3 <= 0) goto L_0x0193
            java.util.concurrent.atomic.AtomicLong r3 = X.C263634Mt.A0c
            long r15 = r3.incrementAndGet()
            X.274 r10 = r0.A08
            long r11 = r9.A0S
            int r3 = r0.A01
            long r13 = (long) r3
            r17 = 0
            boolean r3 = r10.A0B(r11, r13, r15, r17)
            if (r3 == 0) goto L_0x01a3
            int r1 = r0.A01
            long r1 = (long) r1
            r9.A0T = r1
            r9.A0U = r15
            long r1 = android.os.SystemClock.elapsedRealtime()
            r9.A0V = r1
        L_0x0193:
            int r1 = r0.A00
            if (r1 <= 0) goto L_0x00b7
            X.274 r5 = r0.A08
            long r3 = r9.A0S
            int r1 = r0.A00
            long r1 = (long) r1
            r5.A0A(r3, r1)
            goto L_0x00b7
        L_0x01a3:
            r9.A0U = r1
            goto L_0x0193
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C263664Mw.A01(X.4Mw):void");
    }

    public static void A02(C263664Mw r0) {
        String str;
        AnonymousClass4OI r02 = r0.A07;
        if (r02 != null) {
            str = r02.A0K.A0G;
        } else {
            str = null;
        }
        String.valueOf(str);
    }

    public static void A03(C263664Mw r5) {
        C263634Mt r4 = r5.A0D;
        AtomicInteger atomicInteger = C263634Mt.A0b;
        r4.A0U = 0;
        long[] jArr = r4.A0O;
        jArr[1] = 0;
        jArr[0] = 0;
        if (r4.A0I()) {
            r4.A0S = 0;
            r5.A06 = null;
            r4.hashCode();
            A02(r5);
        }
    }

    public static void A04(C263664Mw r23) {
        String str;
        C263664Mw r3 = r23;
        C263634Mt r4 = r3.A0D;
        AtomicInteger atomicInteger = C263634Mt.A0b;
        synchronized (r4.A0K) {
            AnonymousClass4NN r5 = r4.A02;
            if (r5 != null) {
                long A082 = r4.A08();
                String str2 = r5.A06;
                if (str2 == null) {
                    str2 = AnonymousClass4NN.A02(r5);
                }
                AnonymousClass4NP r1 = r5.A0B;
                r1.A00(C264144Ot.RESET, str2);
                r1.A01(str2);
                r5.A06 = null;
                AnonymousClass4OY A002 = r5.A0A.A00(r5.A02, str2);
                if (A002 != null) {
                    if (r5.A0C.A0G) {
                        str = "reset";
                    } else {
                        str = "requested_pause";
                    }
                    A002.A01((C290425fI) null, (Boolean) null, (Boolean) null, (Long) null, (Long) null, str, str2, (String) null, (String) null, (String) null, A082, r5.A01, SystemClock.elapsedRealtime(), false);
                }
            }
        }
        try {
            if (!r4.A0I()) {
                C263634Mt.A05(r4, "Before reset(), service player was evicted. Lazy recover at next play()", new Object[0]);
            } else {
                274 A003 = A00(r3);
                long j = r4.A0S;
                28J.A03("id [%d]: reset", new Object[]{Long.valueOf(j)});
                AnonymousClass4OS A004 = A003.A0c.A00(j);
                if (A004 == null) {
                    C263634Mt.A05(r4, "When reset(), service player is noticed to be evicted earlier. Lazy recover at next play()", new Object[0]);
                    A03(r3);
                } else {
                    AnonymousClass4OS.A0E(A004, "Reset", new Object[0]);
                    AnonymousClass4OS.A07(A004.A0G.obtainMessage(11), A004);
                }
            }
            r4.hashCode();
            A02(r3);
        } catch (RemoteException e) {
            C263634Mt.A04(r4, "Error occurs while pausing the video", e, new Object[0]);
        } catch (Throwable th) {
            A05(r3);
            throw th;
        }
        A05(r3);
    }

    public static void A06(C263664Mw r6, C263674Mx r7) {
        boolean z;
        C263634Mt r62 = r6.A0D;
        AtomicInteger atomicInteger = C263634Mt.A0b;
        AtomicReference atomicReference = r62.A0B;
        synchronized (atomicReference) {
            if (((C263674Mx) atomicReference.get()).A0H <= r7.A0H) {
                atomicReference.set(r7);
                if (r7.A0C < r62.A0U) {
                    z = true;
                } else if (r7.A0Q) {
                    z = false;
                }
                r62.A0Y = z;
            }
        }
    }
}
