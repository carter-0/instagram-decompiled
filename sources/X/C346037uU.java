package X;

import android.os.Handler;
import android.view.Surface;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7uU  reason: invalid class name and case insensitive filesystem */
public final class C346037uU implements C344747sM, C345097sv, C344487rw {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C345897uG A05;
    public C344567s4 A06;
    public TimeUnit A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public int A0D;
    public A93 A0E;
    public final C344407ro A0F;
    public final C346027uT A0G;
    public final AwakeTimeSinceBootClock A0H;
    public final C345057sr A0I;
    public final C346047uV A0J;
    public final C346057uW A0K;
    public volatile C345937uK A0L;
    public volatile boolean A0M;

    public C346037uU(C344407ro r7, C346027uT r8) {
        this((AwakeTimeSinceBootClock) null, r7, (C346047uV) null, r8, false);
    }

    public final String B0U() {
        return "GlSurfaceOutput";
    }

    public final void A00() {
        synchronized (this.A0G) {
            C345937uK r1 = this.A0L;
            this.A0L = null;
            if (r1 != null) {
                r1.A02();
            }
        }
    }

    public final void ACn(C345897uG r7) {
        Object obj;
        C345937uK AMY;
        this.A05 = r7;
        this.A08 = false;
        this.A0M = false;
        if (r7 != null) {
            C346017uS r4 = r7.C3G().A01;
            boolean z = this.A0B;
            C346027uT r3 = this.A0G;
            if (z) {
                obj = r3.A0C;
            } else {
                obj = r3.A0B;
                if (obj == null) {
                    obj = r3.A00();
                }
            }
            if (obj != null) {
                HashMap hashMap = C346017uS.A01;
                synchronized (hashMap) {
                    C346037uU r1 = (C346037uU) hashMap.remove(obj);
                    if (r1 != null) {
                        r1.A00();
                    }
                    hashMap.put(obj, this);
                    C346007uR r5 = r4.A00;
                    synchronized (r3) {
                        Surface A002 = r3.A00();
                        A002.getClass();
                        if (A002.isValid()) {
                            C345897uG r0 = this.A05;
                            if (r0 == null || (r0.Azk().Apq() & 32) == 0 || this.A00 == 7) {
                                AMY = r5.A00.Azk().AMY(A002);
                            } else {
                                AMY = r5.A00.Azl(5).AMZ(A002, 5);
                            }
                            this.A0L = AMY;
                        }
                    }
                }
            }
        }
    }

    public final Object BNo() {
        return this.A0G;
    }

    public final int BZU() {
        C345897uG r0 = this.A05;
        if (r0 == null || (r0.Azk().Apq() & 32) == 0) {
            return 3;
        }
        return this.A01;
    }

    public final int BZY() {
        int i = this.A0G.A07;
        if (i == 1) {
            return 1;
        }
        if (i == 3) {
            return 3;
        }
        if (i != 4) {
            return 0;
        }
        return 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        if (r8 <= r1) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0053, code lost:
        if (r5.convert(r1, r3) >= 0) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0068, code lost:
        if (r8 >= r1) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006a, code lost:
        r0 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CSb(X.C345137sz r11) {
        /*
            r10 = this;
            X.7uT r4 = r10.A0G
            monitor-enter(r4)
            X.7uK r0 = r10.A0L     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x006c
            boolean r0 = r4.A04()     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x006c
            long r8 = r11.C7X()     // Catch:{ all -> 0x006f }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x006f }
            r6 = 0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x006c
            java.util.concurrent.TimeUnit r3 = r10.A07     // Catch:{ all -> 0x006f }
            if (r3 == 0) goto L_0x0028
            long r1 = r10.A04     // Catch:{ all -> 0x006f }
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0028
            long r1 = r5.convert(r1, r3)     // Catch:{ all -> 0x006f }
            goto L_0x002a
        L_0x0028:
            r1 = -1
        L_0x002a:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0043
            java.util.concurrent.TimeUnit r3 = r10.A07     // Catch:{ all -> 0x006f }
            if (r3 == 0) goto L_0x003d
            long r1 = r10.A03     // Catch:{ all -> 0x006f }
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x003d
            long r1 = r5.convert(r1, r3)     // Catch:{ all -> 0x006f }
            goto L_0x003f
        L_0x003d:
            r1 = -1
        L_0x003f:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x006a
        L_0x0043:
            java.util.concurrent.TimeUnit r3 = r10.A07     // Catch:{ all -> 0x006f }
            if (r3 == 0) goto L_0x0055
            long r1 = r10.A03     // Catch:{ all -> 0x006f }
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0055
            long r1 = r5.convert(r1, r3)     // Catch:{ all -> 0x006f }
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x006c
        L_0x0055:
            java.util.concurrent.TimeUnit r3 = r10.A07     // Catch:{ all -> 0x006f }
            if (r3 == 0) goto L_0x0064
            long r1 = r10.A04     // Catch:{ all -> 0x006f }
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0064
            long r1 = r5.convert(r1, r3)     // Catch:{ all -> 0x006f }
            goto L_0x0066
        L_0x0064:
            r1 = -1
        L_0x0066:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x006c
        L_0x006a:
            r0 = 1
            goto L_0x006d
        L_0x006c:
            r0 = 0
        L_0x006d:
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return r0
        L_0x006f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C346037uU.CSb(X.7sz):boolean");
    }

    public final boolean CYX() {
        return this.A09;
    }

    public final boolean CdZ() {
        return false;
    }

    public final Exception ClT() {
        IllegalStateException illegalStateException;
        synchronized (this.A0G) {
            C345937uK r0 = this.A0L;
            if (r0 == null) {
                this.A0F.A00(C368978td.GL_SURFACE_OUTPUT_SKIP_MAKE_CURRENT_GL_SURFACE_NULL);
                illegalStateException = new IllegalStateException("Gl surface is null");
            } else {
                try {
                    r0.A05();
                    illegalStateException = null;
                } catch (C345117sx e) {
                    this.A0F.A00(C368978td.GL_FRAME_BUFFER_SKIP_MAKE_CURRENT_SURFACE_ERROR);
                    return e;
                }
            }
        }
        return illegalStateException;
    }

    public final C345067ss FL0(C345137sz r2) {
        return FL1(r2, this.A0I);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (r2.A0E == false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C345067ss FL1(X.C345137sz r12, X.C345057sr r13) {
        /*
            r11 = this;
            X.7uT r2 = r11.A0G
            monitor-enter(r2)
            X.7ss r5 = r12.CFP()     // Catch:{ all -> 0x0077 }
            r3 = 0
            if (r5 == 0) goto L_0x006e
            boolean r0 = r5.A00()     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0019
            X.7ro r1 = r11.A0F     // Catch:{ all -> 0x0077 }
            X.8td r0 = X.C368978td.GL_SURFACE_OUTPUT_SKIP_UPDATE_OUTPUT_VIEWPORT_NOT_VALID     // Catch:{ all -> 0x0077 }
            r1.A00(r0)     // Catch:{ all -> 0x0077 }
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            goto L_0x0076
        L_0x0019:
            X.7uK r4 = r11.A0L     // Catch:{ all -> 0x0077 }
            if (r4 != 0) goto L_0x0025
            X.7ro r1 = r11.A0F     // Catch:{ all -> 0x0077 }
            X.8td r0 = X.C368978td.GL_SURFACE_OUTPUT_SKIP_UPDATE_OUTPUT_GL_SURFACE_NULL     // Catch:{ all -> 0x0077 }
            r1.A00(r0)     // Catch:{ all -> 0x0077 }
            goto L_0x0017
        L_0x0025:
            int r0 = r4.A01()     // Catch:{ all -> 0x0077 }
            r11.A0D = r0     // Catch:{ all -> 0x0077 }
            int r0 = r4.A00()     // Catch:{ all -> 0x0077 }
            r11.A0C = r0     // Catch:{ all -> 0x0077 }
            int r1 = r2.A09     // Catch:{ all -> 0x0077 }
            r0 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 != r0) goto L_0x004e
            goto L_0x0041
        L_0x0039:
            long r0 = r12.C7X()     // Catch:{ all -> 0x0077 }
            r4.A04(r0)     // Catch:{ all -> 0x0077 }
            goto L_0x004e
        L_0x0041:
            X.7uW r3 = r11.A0K     // Catch:{ all -> 0x0077 }
            long r0 = r12.C7X()     // Catch:{ all -> 0x0077 }
            long r0 = r3.A00(r0)     // Catch:{ all -> 0x0077 }
            r4.A04(r0)     // Catch:{ all -> 0x0077 }
        L_0x004e:
            int r4 = r5.A01     // Catch:{ all -> 0x0077 }
            int r5 = r5.A00     // Catch:{ all -> 0x0077 }
            int r6 = r11.A0D     // Catch:{ all -> 0x0077 }
            int r7 = r11.A0C     // Catch:{ all -> 0x0077 }
            int r8 = r2.A06     // Catch:{ all -> 0x0077 }
            boolean r0 = r12.CU4()     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0063
            boolean r0 = r2.A0E     // Catch:{ all -> 0x0077 }
            r9 = 1
            if (r0 != 0) goto L_0x0064
        L_0x0063:
            r9 = 0
        L_0x0064:
            r10 = 0
            r3 = r13
            r3.A09(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0077 }
            X.7ss r3 = r13.A08()     // Catch:{ all -> 0x0077 }
            goto L_0x0017
        L_0x006e:
            X.7ro r1 = r11.A0F     // Catch:{ all -> 0x0077 }
            X.8td r0 = X.C368978td.GL_SURFACE_OUTPUT_SKIP_UPDATE_OUTPUT_VIEWPORT_NULL     // Catch:{ all -> 0x0077 }
            r1.A00(r0)     // Catch:{ all -> 0x0077 }
            goto L_0x0017
        L_0x0076:
            return r3
        L_0x0077:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C346037uU.FL1(X.7sz, X.7sr):X.7ss");
    }

    public final boolean contains(Object obj) {
        if (this.A0G == obj) {
            return true;
        }
        return false;
    }

    public final void detach() {
        Handler handler;
        Object obj;
        C345897uG r1 = this.A05;
        this.A05 = null;
        this.A08 = false;
        this.A0M = false;
        if (r1 != null) {
            r1.C3G();
            boolean z = this.A0B;
            C346027uT r12 = this.A0G;
            if (z) {
                obj = r12.A0C;
            } else {
                obj = r12.A0B;
                if (obj == null) {
                    obj = r12.A00();
                }
            }
            if (obj != null) {
                HashMap hashMap = C346017uS.A01;
                synchronized (hashMap) {
                    if (equals((C346037uU) hashMap.get(obj))) {
                        hashMap.remove(obj);
                    }
                    A00();
                }
            }
        }
        C344567s4 r0 = this.A06;
        if (r0 != null && (handler = r0.A06.A01) != null) {
            handler.removeMessages(1, this);
        }
    }

    public final void release() {
        Handler handler;
        C346027uT r1 = this.A0G;
        synchronized (r1) {
            r1.A01();
            this.A0M = false;
        }
        C344567s4 r0 = this.A06;
        if (r0 != null && (handler = r0.A06.A01) != null) {
            handler.removeMessages(1, this);
        }
    }

    public final void swapBuffers() {
        C346047uV r4;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock;
        synchronized (this.A0G) {
            A93 a93 = this.A0E;
            C345937uK r3 = this.A0L;
            boolean z = this.A0M;
            if (a93 != null) {
                if (r3 != null) {
                    a93.A00(r3.A01(), r3.A00());
                }
                this.A0F.A00(C368978td.GL_SURFACE_OUTPUT_SKIP_SWAP_BUFFERS_GL_SURFACE_NULL);
            } else {
                if (r3 != null) {
                }
                this.A0F.A00(C368978td.GL_SURFACE_OUTPUT_SKIP_SWAP_BUFFERS_GL_SURFACE_NULL);
            }
            if (this.A0A) {
                r3.A03();
            } else {
                int i = this.A02;
                if (i != 0) {
                    C345897uG r0 = this.A05;
                    if (r0 == null) {
                        this.A0F.A00(C368978td.GL_SURFACE_OUTPUT_SKIP_SWAP_BUFFERS_GL_CONTEXT_NULL);
                    } else if (i != 1) {
                        r0.flush();
                    } else {
                        r0.AVT();
                    }
                }
                this.A08 = true;
            }
            if (!(z || (r4 = this.A0J) == null || (awakeTimeSinceBootClock = this.A0H) == null)) {
                long nowNanos = awakeTimeSinceBootClock.nowNanos();
                C343927r2 r02 = r4.A00.A0F;
                ((C343897qz) r02).A00.post(new C40957Am3(r4, nowNanos));
            }
            this.A0M = true;
        }
        C344567s4 r03 = this.A06;
        if (r03 != null) {
            r03.A06.A00(this);
        }
    }

    public final void CMa(C344567s4 r1) {
        this.A06 = r1;
    }

    public final void EeR(A93 a93) {
        this.A0E = a93;
    }

    public C346037uU(AwakeTimeSinceBootClock awakeTimeSinceBootClock, C344407ro r5, C346047uV r6, C346027uT r7, boolean z) {
        C345057sr r1;
        this.A0F = r5;
        this.A0G = r7;
        this.A0B = z;
        if (r7.A08 != 1) {
            r1 = new C345077st();
        } else {
            r1 = new AnonymousClass800(false);
        }
        this.A0I = r1;
        this.A0J = r6;
        this.A0H = awakeTimeSinceBootClock;
        r1.A00 = "glSurfaceOutput";
        this.A0A = true;
        this.A0M = false;
        this.A02 = 0;
        this.A01 = 0;
        this.A0K = new C346057uW();
    }

    public C346037uU() {
    }
}
