package X;

import android.os.Handler;
import android.util.SparseArray;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class SU1 {
    public static final long A0c;
    public static final long A0d;
    public long A00 = 0;
    public long A01 = -1;
    public long A02 = A0c;
    public long A03;
    public C12315SrI A04;
    public STM A05;
    public S0X A06;
    public Q14 A07;
    public Q14 A08;
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B = true;
    public boolean A0C = false;
    public long A0D;
    public C12315SrI A0E;
    public boolean A0F = false;
    public final C7255Q1d A0G;
    public final SNJ A0H;
    public final C13725Tfv A0I;
    public final SOP A0J;
    public final C11186SEm A0K;
    public final C10810RyW A0L;
    public final C10862RzN A0M;
    public final S30 A0N;
    public final HashMap A0O;
    public final List A0P = AnonymousClass7TE.A1C();
    public final Map A0Q = AnonymousClass7TE.A1E();
    public final Map A0R = AnonymousClass7TE.A1E();
    public final ExecutorService A0S;
    public final long A0T = TimeUnit.SECONDS.toMicros(10);
    public final C13588TdG A0U;
    public final SJL A0V;
    public final C13834Ti9 A0W;
    public final C13726Tfw A0X;
    public final ExecutorService A0Y;
    public volatile long A0Z = 0;
    public volatile long A0a;
    public volatile boolean A0b;

    public static void A04(C266714aE r10, SU1 su1, long j, boolean z) {
        long min;
        SU1 su12 = su1;
        C7334Q4k q4k = su1.A0M.A0B;
        long j2 = j;
        if (q4k instanceof C7964QeC) {
            C7964QeC qeC = (C7964QeC) q4k;
            if (1 - qeC.A00 == 0 && ((SJN) qeC.A01).A0r) {
                min = su1.A0D;
                su1.A06(r10, su12.A00(r10, j2, j + min), z);
            }
        }
        min = Math.min(su1.A0a - j, su1.A0D);
        su1.A06(r10, su12.A00(r10, j2, j + min), z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(X.C266714aE r14, X.SU1 r15, java.util.Set r16, long r17) {
        /*
            r8 = r15
            X.RzN r0 = r15.A0M
            X.Q4k r3 = r0.A0B
            boolean r2 = r3 instanceof X.C7964QeC
            if (r2 == 0) goto L_0x0062
            r1 = r3
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0062
            java.lang.Object r0 = r1.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A0r
            if (r0 == 0) goto L_0x0062
            long r0 = r15.A0D
        L_0x001c:
            r10 = r17
            long r12 = r17 + r0
            r9 = r14
            java.util.ArrayList r5 = r8.A00(r9, r10, r12)
            r1 = r16
            if (r16 == 0) goto L_0x003e
            if (r2 == 0) goto L_0x003e
            X.QeC r3 = (X.C7964QeC) r3
            int r0 = r3.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x003e
            java.lang.Object r0 = r3.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A0p
            if (r0 == 0) goto L_0x003e
            r5.removeAll(r1)
        L_0x003e:
            X.SEm r4 = r15.A0K
            X.C11186SEm.A00(r4)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Map r3 = r4.A00
            java.lang.Object r6 = r3.get(r14)
            android.util.SparseArray r6 = (android.util.SparseArray) r6
            r2 = 0
            if (r6 == 0) goto L_0x0065
            int r1 = r6.size()
        L_0x0056:
            if (r2 >= r1) goto L_0x0065
            int r0 = r6.keyAt(r2)
            X.AnonymousClass7TF.A1M(r7, r0)
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0062:
            long r0 = r15.A0T
            goto L_0x001c
        L_0x0065:
            java.util.Iterator r6 = X.Pxg.A15(r7)
        L_0x0069:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r0 = r6.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L_0x0069
            X.C11186SEm.A00(r4)
            java.lang.Object r0 = r3.get(r14)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r1 = r0.get(r2)
            r0.remove(r2)
        L_0x0091:
            r1.getClass()
            r0 = 3
            X.TNq r2 = new X.TNq
            r2.<init>(r0, r15, r1)
            java.util.List r1 = r15.A0P
            java.util.concurrent.ExecutorService r0 = r15.A0S
            java.util.concurrent.Future r0 = r0.submit(r2)
            r1.add(r0)
            goto L_0x0069
        L_0x00a6:
            r1 = 0
            goto L_0x0091
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SU1.A05(X.4aE, X.SU1, java.util.Set, long):void");
    }

    public final void A09() {
        Q1V.A00("MultipleTrackCoordinatorRealtime", "pausePlayback", new Object[0]);
        long j = this.A0Z;
        Q1V.A00("MultipleTrackCoordinatorRealtime", "resetPlayer", new Object[0]);
        this.A0C = false;
        this.A01 = -1;
        this.A00 = j;
        this.A0A = false;
        STM stm = this.A05;
        if (stm != null) {
            Pxf.A15(stm.A0D, 6);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(long r15) {
        /*
            r14 = this;
            r9 = 1
            r2 = r15
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r8 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "seekPlayer: playbackPositionUs=%s"
            java.lang.String r7 = "MultipleTrackCoordinatorRealtime"
            X.Q1V.A00(r7, r0, r1)
            long r0 = r14.A0a
            r4 = 1
            long r0 = r0 - r4
            long r3 = java.lang.Math.min(r2, r0)
            r1 = 0
            long r3 = java.lang.Math.max(r3, r1)
            r14.A0Z = r3
            long r5 = r14.A0Z
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r0 = "resetPlayer"
            X.Q1V.A00(r7, r0, r3)
            r14.A0C = r8
            r3 = -1
            r14.A01 = r3
            r14.A00 = r5
            r14.A0A = r8
            X.4aE r6 = X.C266714aE.VIDEO
            long r3 = r14.A0Z
            java.util.Map r5 = r14.A0R
            X.RzN r0 = r14.A0M
            X.Q4k r10 = r0.A0B
            java.util.ArrayList r8 = X.SPy.A02(r6, r10, r5, r3)
            boolean r0 = r10 instanceof X.C7964QeC
            if (r0 == 0) goto L_0x00b3
            X.QeC r10 = (X.C7964QeC) r10
            int r0 = r10.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x00b3
            java.lang.Object r0 = r10.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A0s
            if (r0 == 0) goto L_0x00b3
            r14.A03(r6)
        L_0x005d:
            java.util.Iterator r13 = r8.iterator()
        L_0x0061:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r12 = r13.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            long r3 = r14.A0Z
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r8 = new java.lang.Object[]{r6, r0, r12}
            java.lang.String r0 = "seekTrackTo: trackType=%s, targetPtsUs=%s, presentationTrackIndex=%s"
            X.Q1V.A00(r7, r0, r8)
            int r8 = r12.intValue()
            X.Tia r11 = r14.A08(r6, r8)
            java.lang.Object r0 = X.Pxe.A0r(r6, r5)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            java.lang.Object r8 = X.C41847B3o.A15(r0, r8)
            X.4aF r8 = (X.C266724aF) r8
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r9 = r8.A03(r0)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x009d
            r9 = 0
        L_0x009d:
            java.util.HashMap r8 = r14.A0O
            boolean r0 = r8.containsKey(r12)
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = r8.get(r12)
            X.4aF r0 = (X.C266724aF) r0
            r11.FM5(r0)
        L_0x00ae:
            long r3 = r3 - r9
            r11.EKz(r3)
            goto L_0x0061
        L_0x00b3:
            long r3 = r14.A0Z
            r0 = 0
            A05(r6, r14, r0, r3)
            r14.A06(r6, r8, r9)
            java.util.Map r3 = r14.A0Q
            java.util.HashSet r0 = X.C66580MXl.A12(r8)
            r3.put(r6, r0)
            goto L_0x005d
        L_0x00c6:
            X.STM r2 = r14.A05
            if (r2 == 0) goto L_0x00d6
            long r0 = r14.A0Z
            android.os.Handler r2 = r2.A0D
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 4
            X.Pxe.A1N(r2, r1, r0)
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SU1.A0B(long):void");
    }

    private void A01(long j) {
        long max;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(10);
        if (j < 0) {
            if (j < timeUnit.toNanos(-200)) {
                max = TimeUnit.NANOSECONDS.toMicros(-j);
            } else {
                max = this.A02 + micros;
            }
        } else if (j > timeUnit.toNanos(200)) {
            max = A0d;
        } else {
            max = Math.max(this.A02 - micros, A0d);
        }
        this.A02 = max;
    }

    private void A02(long j) {
        SOP sop;
        if (!this.A0M.A0B.A0A() && (sop = this.A0J) != null) {
            sop.A02(j);
        }
    }

    private void A03(C266714aE r7) {
        HashSet hashSet;
        long j = this.A0Z;
        ArrayList A022 = SPy.A02(r7, this.A0M.A0B, this.A0R, j);
        HashSet A12 = C66580MXl.A12(A022);
        Map map = this.A0Q;
        Collection collection = (Collection) map.get(r7);
        if (collection != null) {
            A12.removeAll(collection);
            hashSet = C66580MXl.A12(collection);
            hashSet.removeAll(A022);
        } else {
            hashSet = null;
        }
        A05(r7, this, hashSet, this.A0Z);
        A04(r7, this, this.A0Z, false);
        Iterator it = A12.iterator();
        while (it.hasNext()) {
            A08(r7, AnonymousClass7TG.A0F(it)).EKz(0);
        }
        map.put(r7, C66580MXl.A12(A022));
    }

    private void A06(C266714aE r25, List list, boolean z) {
        C10862RzN rzN = this.A0M;
        MediaComposition mediaComposition = rzN.A08;
        mediaComposition.getClass();
        Iterator it = list.iterator();
        while (true) {
            C266714aE r13 = r25;
            if (it.hasNext()) {
                Number number = (Number) it.next();
                if (!this.A0b) {
                    C11186SEm sEm = this.A0K;
                    int intValue = number.intValue();
                    C11186SEm.A00(sEm);
                    Map map = sEm.A00;
                    SparseArray sparseArray = (SparseArray) map.get(r13);
                    if (sparseArray == null || sparseArray.get(intValue) == null) {
                        C266714aE r1 = C266714aE.VIDEO;
                        if (r1.equals(r13)) {
                            S30 s30 = this.A0N;
                            ExecutorService executorService = this.A0Y;
                            executorService.getClass();
                            C13726Tfw tfw = this.A0X;
                            tfw.getClass();
                            SJL sjl = this.A0V;
                            C266794aM A042 = mediaComposition.A04(r1, intValue);
                            0JA.A05(A042, "mc: %s", new Object[]{mediaComposition});
                            SJL sjl2 = sjl;
                            C266754aI r19 = (C266754aI) Pxg.A0j(A042.A04);
                            S30 s302 = s30;
                            C13855Tia A012 = s302.A01(sjl2, r19, rzN, tfw, executorService, true);
                            Q1V.A00("MultipleTrackCoordinatorRealtime", "createDemuxDecodeWrapperCallable", new Object[0]);
                            Future submit = this.A0S.submit(new C13147TNf(intValue, 1, this, A012));
                            C11186SEm.A00(sEm);
                            Map map2 = sEm.A01;
                            SparseArray sparseArray2 = (SparseArray) map2.get(r13);
                            SparseArray sparseArray3 = (SparseArray) map.get(r13);
                            if (sparseArray2 == null) {
                                sparseArray2 = Pxe.A0L();
                                map2.put(r13, sparseArray2);
                            }
                            if (sparseArray3 == null) {
                                sparseArray3 = Pxe.A0L();
                                map.put(r13, sparseArray3);
                            }
                            sparseArray2.put(intValue, A012);
                            sparseArray3.put(intValue, submit);
                        } else {
                            Q1V.A00("MultipleTrackCoordinatorRealtime", "maybePreloadDemuxDecodeWrappers: UnsupportedOperationException", new Object[0]);
                            throw C66580MXl.A11();
                        }
                    }
                } else {
                    Q1V.A00("MultipleTrackCoordinatorRealtime", "maybePreloadDemuxDecodeWrappers: CancellationException", new Object[0]);
                    throw new CancellationException();
                }
            } else if (z) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Number number2 = (Number) it2.next();
                    if (!this.A0b) {
                        C11186SEm sEm2 = this.A0K;
                        int intValue2 = number2.intValue();
                        C11186SEm.A00(sEm2);
                        Future future = (Future) ((SparseArray) Pxe.A0r(r13, sEm2.A00)).get(intValue2);
                        future.getClass();
                        future.get();
                    } else {
                        Q1V.A00("MultipleTrackCoordinatorRealtime", "maybePreloadDemuxDecodeWrappers: ensureLoaded CancellationException", new Object[0]);
                        throw new CancellationException();
                    }
                }
                return;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        if (r6 == false) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0244 A[LOOP:4: B:104:0x023e->B:106:0x0244, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01b1 A[LOOP:3: B:86:0x01ab->B:88:0x01b1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A07(long r14, boolean r16) {
        /*
            r13 = this;
            X.STM r0 = r13.A05
            if (r0 == 0) goto L_0x000c
            if (r16 != 0) goto L_0x000c
            android.os.Handler r1 = r0.A0D
            r0 = 1
            X.Pxf.A15(r1, r0)
        L_0x000c:
            X.4aE r8 = X.C266714aE.VIDEO
            long r0 = r13.A0Z
            java.util.Map r3 = r13.A0R
            X.RzN r2 = r13.A0M
            X.Q4k r2 = r2.A0B
            java.util.ArrayList r5 = X.SPy.A02(r8, r2, r3, r0)
            boolean r4 = r5.isEmpty()
            r6 = 1
            r7 = 0
            long r0 = r13.A0Z
            if (r4 == 0) goto L_0x0061
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x0041
            boolean r0 = r13.A0C
            if (r0 != 0) goto L_0x0044
            r13.A0C = r6
            long r0 = java.lang.System.nanoTime()
            r13.A01 = r0
            r13.A0A = r7
        L_0x0036:
            long r2 = r13.A0Z
            long r0 = r13.A02
            long r2 = r2 + r0
            long r0 = java.lang.Math.min(r2, r14)
            r13.A0Z = r0
        L_0x0041:
            long r0 = r13.A0Z
            return r0
        L_0x0044:
            long r3 = r13.A01
            long r7 = r13.A0Z
            long r0 = r13.A00
            long r7 = r7 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r0
            long r3 = r3 + r7
            long r0 = java.lang.System.nanoTime()
            long r3 = r3 - r0
            r1 = 30000000(0x1c9c380, double:1.48219694E-316)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x005c
            r6 = 0
        L_0x005c:
            r13.A0A = r6
            if (r6 != 0) goto L_0x0041
            goto L_0x0036
        L_0x0061:
            X.Q14 r4 = r13.A08
            if (r4 == 0) goto L_0x0068
            r4.A01(r0)
        L_0x0068:
            X.Q14 r4 = r13.A07
            if (r4 == 0) goto L_0x006f
            r4.A01(r0)
        L_0x006f:
            long r0 = r13.A0Z
            int r4 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x0041
            boolean r0 = r13.A0A
            r11 = 0
            if (r0 != 0) goto L_0x00ba
            java.util.Iterator r10 = r5.iterator()
        L_0x007f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00ba
            int r1 = X.AnonymousClass7TG.A0F(r10)
            X.Tia r9 = r13.A08(r8, r1)
            boolean r0 = r9.CRE()
            if (r0 != 0) goto L_0x00b2
            java.lang.Object r0 = X.Pxe.A0r(r8, r3)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            java.lang.Object r1 = X.C41847B3o.A15(r0, r1)
            X.4aF r1 = (X.C266724aF) r1
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r4 = r1.A03(r0)
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ab
            r4 = 0
        L_0x00ab:
            long r0 = r13.A0Z     // Catch:{ CancellationException -> 0x026f }
            long r0 = r0 - r4
            r9.ANu(r0)     // Catch:{ CancellationException -> 0x026f }
            goto L_0x007f
        L_0x00b2:
            long r0 = r13.A03
            r4 = 1
            long r0 = r0 + r4
            r13.A03 = r0
            goto L_0x007f
        L_0x00ba:
            boolean r0 = r13.A0F
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r13.A0B
            if (r0 == 0) goto L_0x00f0
            r13.A0F = r7
            java.lang.String r0 = "MultipleTrackCoordinator.warmup"
            X.C349257zq.A03(r0)
            X.RyW r0 = r13.A0L
            java.util.Map r0 = r0.A07
            java.util.Iterator r1 = X.AnonymousClass7TF.A0u(r0)
        L_0x00d1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r0 = X.C51971G9r.A0p(r1)
            X.Q1G r0 = (X.Q1G) r0
            X.Tid r0 = r0.A00
            r0.getClass()
            r0.FNK()
            goto L_0x00d1
        L_0x00e6:
            X.C349257zq.A01()
            X.Ti9 r0 = r13.A0W
            if (r0 == 0) goto L_0x00f0
            r0.onStart()
        L_0x00f0:
            long r0 = r13.A0Z
            int r3 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r3 < 0) goto L_0x0139
            boolean r0 = r13.A0A
            if (r0 != 0) goto L_0x014b
            X.RyW r3 = r13.A0L     // Catch:{ Exception -> 0x0114 }
            long r0 = r13.A0Z     // Catch:{ Exception -> 0x0114 }
            java.util.Map r3 = r3.A07     // Catch:{ Exception -> 0x0114 }
            java.util.Iterator r4 = X.AnonymousClass7TF.A0u(r3)     // Catch:{ Exception -> 0x0114 }
        L_0x0104:
            boolean r3 = r4.hasNext()     // Catch:{ Exception -> 0x0114 }
            if (r3 == 0) goto L_0x014b
            java.lang.Object r3 = X.C51971G9r.A0p(r4)     // Catch:{ Exception -> 0x0114 }
            X.Q1G r3 = (X.Q1G) r3     // Catch:{ Exception -> 0x0114 }
            r3.EF4(r0)     // Catch:{ Exception -> 0x0114 }
            goto L_0x0104
        L_0x0114:
            r4 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[]{r4}
            java.lang.String r1 = "demuxAndDecodeMediaCompositionRealtime renderFrame Exception=%s"
            java.lang.String r0 = "MultipleTrackCoordinatorRealtime"
            X.Q1V.A00(r0, r1, r3)
            boolean r0 = r4 instanceof X.TQA
            if (r0 != 0) goto L_0x014b
            throw r4
        L_0x0125:
            r9 = -30000000(0xfffffffffe363c80, double:NaN)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0195
            r13.A01(r0)
            X.S0X r2 = r13.A06
            if (r2 == 0) goto L_0x0139
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = 0
            r2.A00(r1, r0)
        L_0x0139:
            r13.A0A = r7
            long r2 = r13.A0Z
            long r0 = r13.A02
            long r2 = r2 + r0
            long r0 = java.lang.Math.min(r2, r14)
            r13.A0Z = r0
            r13.A03(r8)
            goto L_0x0041
        L_0x014b:
            boolean r0 = r2 instanceof X.C7964QeC
            if (r0 == 0) goto L_0x01d8
            X.QeC r2 = (X.C7964QeC) r2
            int r0 = r2.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x01d8
            java.lang.Object r0 = r2.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A0o
            if (r0 == 0) goto L_0x01d8
            long r0 = A0c
            r13.A02 = r0
            boolean r0 = r13.A0C
            java.lang.String r11 = "MultipleTrackCoordinator.displayFrame()"
            if (r0 == 0) goto L_0x0220
            long r4 = r13.A01
            long r2 = r13.A0Z
            long r0 = r13.A00
            long r2 = r2 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            long r4 = r4 + r2
            long r2 = java.lang.System.nanoTime()
            long r0 = r4 - r2
            r9 = 30000000(0x1c9c380, double:1.48219694E-316)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x01fd
            r9 = -30000000(0xfffffffffe363c80, double:NaN)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0195
            r13.A01(r0)
            X.S0X r2 = r13.A06
            if (r2 == 0) goto L_0x0195
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = 0
            r2.A00(r1, r0)
        L_0x0195:
            long r0 = r13.A0Z
            r13.A02(r0)
            X.C349257zq.A03(r11)
            X.RyW r6 = r13.A0L
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.toMicros(r4)
            java.util.Map r2 = r6.A07
            java.util.Iterator r4 = X.AnonymousClass7TF.A0u(r2)
        L_0x01ab:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x01be
            X.Q1G r3 = X.Pxh.A0Q(r4)
            X.Rdm r2 = r6.A04
            r2.getClass()
            r3.APk(r0)
            goto L_0x01ab
        L_0x01be:
            X.S0X r3 = r13.A06
            if (r3 == 0) goto L_0x01d3
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.Long r0 = X.C51968G9o.A0u()
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            r3.A00(r2, r0)
        L_0x01d3:
            X.C349257zq.A01()
            goto L_0x0139
        L_0x01d8:
            boolean r0 = r13.A0C
            java.lang.String r11 = "MultipleTrackCoordinator.displayFrame()"
            if (r0 == 0) goto L_0x0220
            long r4 = r13.A01
            long r2 = r13.A0Z
            long r0 = r13.A00
            long r2 = r2 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            long r4 = r4 + r2
            X.SrI r9 = r13.A04
            if (r9 != 0) goto L_0x0201
            long r9 = java.lang.System.nanoTime()
        L_0x01f1:
            long r0 = r4 - r9
            r9 = 30000000(0x1c9c380, double:1.48219694E-316)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0125
            r13.A01(r0)
        L_0x01fd:
            r13.A0A = r6
            goto L_0x0041
        L_0x0201:
            X.SEW r10 = r9.A05
            long r0 = X.SEW.A02
            android.media.AudioTrack r0 = r10.A01
            int r0 = r0.getPlaybackHeadPosition()
            long r2 = (long) r0
            long r0 = X.SEW.A02
            long r2 = r2 * r0
            long r0 = r10.A00
            long r2 = r2 / r0
            java.util.concurrent.atomic.AtomicLong r0 = r9.A06
            long r9 = r0.get()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r0 = r0.toNanos(r2)
            long r9 = r9 + r0
            goto L_0x01f1
        L_0x0220:
            long r0 = r13.A0Z
            r13.A02(r0)
            long r0 = java.lang.System.nanoTime()
            r13.A01 = r0
            X.C349257zq.A03(r11)
            X.RyW r5 = r13.A0L
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r13.A01
            long r0 = r2.toMicros(r0)
            java.util.Map r2 = r5.A07
            java.util.Iterator r4 = X.AnonymousClass7TF.A0u(r2)
        L_0x023e:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0251
            X.Q1G r3 = X.Pxh.A0Q(r4)
            X.Rdm r2 = r5.A04
            r2.getClass()
            r3.APk(r0)
            goto L_0x023e
        L_0x0251:
            X.S0X r3 = r13.A06
            if (r3 == 0) goto L_0x0266
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.Long r0 = X.C51968G9o.A0u()
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            r3.A00(r2, r0)
        L_0x0266:
            X.C349257zq.A01()
            r13.A0C = r6
            r13.A09 = r6
            goto L_0x0139
        L_0x026f:
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r1 = "demuxAndDecodeMediaCompositionRealtime decodeFrameAndAdvance CancellationException"
            java.lang.String r0 = "MultipleTrackCoordinatorRealtime"
            X.Q1V.A00(r0, r1, r2)
            long r0 = r13.A0Z
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SU1.A07(long, boolean):long");
    }

    public final C13855Tia A08(C266714aE r4, int i) {
        C11186SEm sEm = this.A0K;
        C11186SEm.A00(sEm);
        Future future = (Future) ((SparseArray) Pxe.A0r(r4, sEm.A00)).get(i);
        if (future != null) {
            return (C13855Tia) future.get();
        }
        Q1V.A00("MultipleTrackCoordinatorRealtime", "getDemuxDecodeWrapperRealtime: Null future for presentationTrack=%s", AnonymousClass7TF.A1b(i));
        throw new Exception(002.A0O("Null future for presentationTrack=", i));
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [X.Thy, java.lang.Object] */
    public final void A0C(S0X s0x, HashSet hashSet) {
        C10833Ryt ryt;
        this.A06 = s0x;
        Map map = this.A0R;
        map.clear();
        this.A0Q.clear();
        C266714aE r9 = C266714aE.VIDEO;
        C10862RzN rzN = this.A0M;
        C13725Tfv tfv = this.A0I;
        SPy.A03(tfv, r9, rzN, map);
        MediaComposition mediaComposition = rzN.A08;
        mediaComposition.getClass();
        C266714aE r3 = C266714aE.AUDIO;
        HashMap A072 = mediaComposition.A07(r3);
        if (A072 != null && !A072.isEmpty()) {
            C13852TiV AL5 = this.A0U.AL5();
            SFQ sfq = rzN.A0C;
            int i = sfq.A04;
            int i2 = sfq.A01;
            Integer num = C9956RkB.A00;
            SEV sev = new SEV(i, i2);
            C10568RuN ruN = new C10568RuN(sev, sev, A072.size());
            if (rzN.A0B.A02() && AL5.getWarmupDurationInSec() != 0) {
                HashSet hashSet2 = hashSet;
                if (!hashSet2.isEmpty()) {
                    AL5.configure(ruN);
                    S30 s30 = this.A0N;
                    C7255Q1d q1d = this.A0G;
                    C10794RyG ryG = new C10794RyG(AL5, new Object(), this.A0J, (C11352SOl) null, rzN);
                    Integer num2 = AnonymousClass05K.A00;
                    C7949Qdq qdq = new C7949Qdq(q1d, this.A0H, ryG, tfv, this.A06, this, rzN, s30, num2);
                    Handler handler = qdq.A0D;
                    Pxf.A15(handler, 3);
                    Pxe.A1N(handler, Pxf.A0K(hashSet2, AL5.getWarmupDurationInSec()), 9);
                    qdq.A0F.A02.FNG();
                    qdq.A05();
                }
            }
            AL5.configure(ruN);
            SOP sop = this.A0J;
            if (!(sop == null || (ryt = sop.A05) == null)) {
                ryt.A03 = sev;
            }
            C12315SrI srI = new C12315SrI(i, sfq.A01);
            this.A0E = srI;
            S30 s302 = this.A0N;
            C7255Q1d q1d2 = this.A0G;
            C10794RyG ryG2 = new C10794RyG(AL5, srI, sop, (C11352SOl) null, rzN);
            Integer num3 = AnonymousClass05K.A00;
            C7950Qdr qdr = new C7950Qdr(q1d2, this.A0H, ryG2, tfv, this.A06, this, rzN, s302, num3);
            this.A05 = qdr;
            Pxf.A15(qdr.A0D, 3);
            this.A04 = this.A05.A0F.A02.Ble();
        }
        long A002 = Q1Z.A00(tfv, r9, mediaComposition);
        if (A002 <= 0 && rzN.A0B.A04()) {
            A002 = Q1Z.A00(tfv, r3, mediaComposition);
        }
        this.A0a = A002;
        this.A0D = Math.min(TimeUnit.SECONDS.toMicros(2), this.A0a);
        C349257zq.A03("MultipleTrackCoordinator.decoderPreloading");
        boolean z = true;
        A04(r9, this, 0, true);
        C349257zq.A01();
        this.A0C = false;
        this.A09 = false;
        this.A01 = -1;
        this.A00 = 0;
        this.A0A = false;
        this.A0F = true;
        this.A0O.clear();
        C10810RyW ryW = this.A0L;
        SsA ssA = new SsA(ryW);
        Ss8 ss8 = new Ss8(ryW);
        C7334Q4k q4k = rzN.A0B;
        this.A08 = SPy.A00(ss8, ssA, q4k, map);
        Q14 q14 = this.A07;
        if (q14 != null) {
            q14.A00();
        } else {
            z = false;
        }
        C7963QeB A012 = SPy.A01(mediaComposition, new C12359Ss5(this), new C12361Ss7(this), q4k);
        this.A07 = A012;
        if (z) {
            A012.A01(this.A0Z);
        }
    }

    static {
        long A002 = (long) (Pxg.A00() / 30.0d);
        A0c = A002;
        A0d = A002 / 2;
    }

    public SU1(C7255Q1d q1d, SNJ snj, C13588TdG tdG, C13725Tfv tfv, SJL sjl, SOP sop, C10810RyW ryW, C10862RzN rzN, C13726Tfw tfw, S30 s30) {
        ThreadPoolExecutor threadPoolExecutor;
        int size;
        this.A0N = s30;
        this.A0G = q1d;
        this.A0U = tdG;
        this.A0M = rzN;
        this.A0V = sjl;
        this.A0L = ryW;
        this.A0X = tfw;
        this.A0I = tfv;
        this.A0H = snj;
        this.A0J = sop;
        this.A0O = AnonymousClass7TE.A1E();
        this.A0K = new C11186SEm();
        MediaComposition mediaComposition = rzN.A08;
        C266714aE r1 = C266714aE.VIDEO;
        if (mediaComposition == null || mediaComposition.A07(r1) == null || (size = mediaComposition.A07(r1).size()) == 0) {
            threadPoolExecutor = null;
        } else {
            threadPoolExecutor = q1d.A02(AnonymousClass05K.A0C, size);
        }
        this.A0Y = threadPoolExecutor;
        this.A0S = q1d.A03(AnonymousClass05K.A02, (Thread.UncaughtExceptionHandler) null);
        this.A0W = rzN.A07;
    }

    private ArrayList A00(C266714aE r18, long j, long j2) {
        HashSet A1F = AnonymousClass7TE.A1F();
        SparseArray sparseArray = (SparseArray) this.A0R.get(r18);
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                C266724aF r8 = (C266724aF) sparseArray.valueAt(i);
                C7334Q4k q4k = this.A0M.A0B;
                long j3 = j;
                long j4 = j2;
                if (q4k instanceof C7964QeC) {
                    C7964QeC qeC = (C7964QeC) q4k;
                    if (1 - qeC.A00 == 0 && ((SJN) qeC.A01).A0e) {
                        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                        C266724aF A0V2 = Pxe.A0V(timeUnit, j3, j4);
                        boolean A0H2 = q4k.A0H();
                        if (r8.A05(A0V2, A0H2)) {
                            AnonymousClass7TF.A1M(A1F, keyAt);
                        }
                        if (j2 > this.A0a) {
                            if (!r8.A05(Pxe.A0V(timeUnit, 0, j2 - this.A0a), A0H2)) {
                            }
                            AnonymousClass7TF.A1M(A1F, keyAt);
                        }
                    }
                }
                TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
                if (j2 >= r8.A03(timeUnit2)) {
                    if (j > r8.A02(timeUnit2)) {
                    }
                    AnonymousClass7TF.A1M(A1F, keyAt);
                }
            }
        }
        return AnonymousClass7TE.A1D(A1F);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.Q1b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v0, types: [X.Q1b, java.lang.Object] */
    public final void A0A() {
        ? obj;
        Q1V.A00("MultipleTrackCoordinatorRealtime", "releasePlayer", Pxe.A1b());
        try {
            obj = new Object();
            STM stm = this.A05;
            if (stm != null) {
                stm.A05();
            }
        } catch (Throwable th) {
            th = th;
        }
        C266714aE r6 = C266714aE.VIDEO;
        ? obj2 = new Object();
        C11186SEm sEm = this.A0K;
        C11186SEm.A00(sEm);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Map map = sEm.A00;
        SparseArray sparseArray = (SparseArray) map.get(r6);
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass7TF.A1M(A1C, sparseArray.keyAt(i));
            }
        }
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            int A092 = Pxe.A09(it.next());
            C11186SEm.A00(sEm);
            Future future = (Future) ((SparseArray) Pxe.A0r(r6, map)).get(A092);
            if (future != null && !future.isCancelled()) {
                try {
                    new C7948Qdp((C7254Q1b) obj2, (C13855Tia) future.get()).A00();
                } catch (Throwable th2) {
                    Q1V.A00("MultipleTrackCoordinatorRealtime", "releaseAllDemuxDecoderWrappersRealtime: Exception=%s", th2);
                }
            }
        }
        C11186SEm.A00(sEm);
        map.remove(r6);
        List<Future> list = this.A0P;
        for (Future future2 : list) {
            try {
                future2.get();
            } catch (Throwable th3) {
                Q1V.A00("MultipleTrackCoordinatorRealtime", "releaseAllDemuxDecoderWrappersRealtime: releaseCallable Exception=%s", th3);
            }
        }
        list.clear();
        obj2.A01();
        th = null;
        Q14 q14 = this.A08;
        if (q14 != null) {
            q14.A00();
            this.A08 = null;
        }
        Q14 q142 = this.A07;
        if (q142 != null) {
            q142.A00();
            this.A07 = null;
        }
        ExecutorService executorService = this.A0Y;
        if (executorService != null) {
            executorService.shutdown();
        }
        this.A0S.shutdown();
        if (th != null) {
            Q1V.A00("MultipleTrackCoordinatorRealtime", "releasePlayer: releaseException=%s", th);
            throw th;
        }
    }
}
