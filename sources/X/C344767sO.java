package X;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7sO  reason: invalid class name and case insensitive filesystem */
public final class C344767sO implements C344737sL, C344747sM, Handler.Callback, C344777sP {
    public static final int[] A0e = {0, 1, 2, 3, 4};
    public float A00;
    public int A01;
    public Handler A02;
    public C345177t3 A03;
    public C345187t4 A04;
    public C344037rD A05;
    public C344567s4 A06;
    public List A07;
    public boolean A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public Long A0G;
    public boolean A0H;
    public boolean A0I;
    public final ConditionVariable A0J;
    public final C344837sV A0K;
    public final C344927se A0L;
    public final C344817sT A0M;
    public final C344407ro A0N;
    public final C344897sb A0O;
    public final boolean A0P;
    public final Context A0Q;
    public final C344807sS A0R;
    public final C344917sd A0S;
    public final List A0T;
    public final AtomicInteger A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public volatile C345137sz A0a;
    public volatile Long A0b;
    public volatile Long A0c;
    public volatile boolean A0d;

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.7sb] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0057, code lost:
        if (android.os.Build.VERSION.SDK_INT < 29) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C344767sO(android.content.Context r8, android.os.Handler r9, android.os.Handler r10, X.C344807sS r11, X.C344407ro r12, X.C344037rD r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r7 = this;
            r3 = 1
            X.0qQ.A0B(r12, r3)
            r0 = 2
            X.0qQ.A0B(r8, r0)
            r0 = 10
            X.0qQ.A0B(r11, r0)
            r7.<init>()
            r7.A0N = r12
            r7.A0Q = r8
            r7.A0P = r14
            r7.A0V = r15
            r7.A0R = r11
            r0 = r18
            r7.A0X = r0
            r0 = r19
            r7.A0W = r0
            r0 = r20
            r7.A0Y = r0
            r7.A05 = r13
            r6 = 0
            if (r16 == 0) goto L_0x0030
            android.os.ConditionVariable r6 = new android.os.ConditionVariable
            r6.<init>()
        L_0x0030:
            r7.A0J = r6
            X.7sT r0 = new X.7sT
            r0.<init>(r12)
            r7.A0M = r0
            X.7sV r0 = new X.7sV
            r0.<init>()
            r7.A0K = r0
            X.7sb r0 = new X.7sb
            r0.<init>()
            r7.A0O = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.A0T = r0
            r5 = 1
            r4 = 0
            if (r17 == 0) goto L_0x0059
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r0 = 1
            if (r2 >= r1) goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            r7.A0Z = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r4)
            r7.A0U = r0
            r7.A0H = r3
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.A00 = r0
            X.7sd r1 = new X.7sd
            r1.<init>(r7)
            r7.A0S = r1
            if (r6 != 0) goto L_0x0073
            r5 = 0
        L_0x0073:
            X.7se r0 = new X.7se
            r0.<init>(r10, r1, r12, r5)
            r7.A0L = r0
            X.7sV r0 = r7.A0K
            X.7t0 r3 = new X.7t0
            r3.<init>(r7)
            X.7sY r2 = r0.A01
            X.7sa[] r1 = r2.A01
            X.7sZ r0 = r3.Blu()
            int r0 = r0.ordinal()
            r1[r0] = r3
            X.C344867sY.A00(r2)
            if (r9 == 0) goto L_0x009f
            android.os.Looper r1 = r9.getLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1, r7)
            r7.A02 = r0
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344767sO.<init>(android.content.Context, android.os.Handler, android.os.Handler, X.7sS, X.7ro, X.7rD, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r0v20, types: [X.Av8, java.lang.RuntimeException] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00df A[Catch:{ all -> 0x013c }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x013b A[Catch:{ all -> 0x013c }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C345137sz A01(X.C344767sO r13, X.C345137sz r14, X.C344697sH r15, java.lang.Integer r16, boolean r17, boolean r18, boolean r19) {
        /*
            r2 = 0
            if (r18 == 0) goto L_0x0071
            android.os.ConditionVariable r7 = r13.A0J     // Catch:{ all -> 0x013f }
            if (r7 == 0) goto L_0x0010
            boolean r0 = r13.A0H     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x0010
            r13.A02(r14)     // Catch:{ all -> 0x013f }
            r13.A0H = r2     // Catch:{ all -> 0x013f }
        L_0x0010:
            r8 = r14
            boolean r0 = r13.A0d     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x0060
            X.7se r3 = r13.A0L     // Catch:{ all -> 0x013f }
            if (r3 == 0) goto L_0x0060
            r1 = 1133892587(0x4395d3eb, float:299.6556)
            java.lang.String r0 = "PreProcessCpuFrames"
            X.0fg.A01(r0, r1)     // Catch:{ all -> 0x013f }
            X.0qQ.A0B(r14, r2)     // Catch:{ all -> 0x013f }
            boolean r0 = r3.A02     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x005a
            X.7sg r1 = r3.A04     // Catch:{ all -> 0x013f }
            int r0 = r14.Awt()     // Catch:{ all -> 0x013f }
            r1.A00 = r0     // Catch:{ all -> 0x013f }
            X.7sp r0 = r3.A08     // Catch:{ all -> 0x013f }
            r0.A03(r14)     // Catch:{ all -> 0x013f }
            boolean r0 = r3.A09     // Catch:{ all -> 0x013f }
            if (r0 != 0) goto L_0x005a
            boolean r0 = r3.A03     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x005a
            X.7su r0 = r3.A00     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x0052
            X.7sy r6 = r0.A0A     // Catch:{ all -> 0x013f }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x013f }
            long r0 = r6.A03     // Catch:{ all -> 0x013f }
            long r4 = r14.C7X()     // Catch:{ all -> 0x013f }
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x005a
            r8 = r6
            goto L_0x005a
        L_0x0052:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x013f }
            r0.<init>(r1)     // Catch:{ all -> 0x013f }
            throw r0     // Catch:{ all -> 0x013f }
        L_0x005a:
            r0 = 1127416906(0x4333044a, float:179.01675)
            X.0fg.A00(r0)     // Catch:{ all -> 0x013f }
        L_0x0060:
            if (r7 == 0) goto L_0x0072
            X.7se r0 = r13.A0L     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x0072
            boolean r0 = r0.A02     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x0072
            r7.block()     // Catch:{ all -> 0x013c }
            r7.close()     // Catch:{ all -> 0x013c }
            goto L_0x0072
        L_0x0071:
            r8 = r14
        L_0x0072:
            if (r16 == 0) goto L_0x007d
            X.7sT r1 = r13.A0M     // Catch:{ all -> 0x013c }
            int r0 = r16.intValue()     // Catch:{ all -> 0x013c }
            r1.A01(r0)     // Catch:{ all -> 0x013c }
        L_0x007d:
            if (r17 == 0) goto L_0x0084
            X.7sz r8 = r13.A02(r8)     // Catch:{ all -> 0x013c }
            goto L_0x00dc
        L_0x0084:
            boolean r0 = r13.A0V     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x00d6
            X.7sT r11 = r13.A0M     // Catch:{ all -> 0x013c }
            boolean r0 = r11.A02()     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x00d6
            java.util.List r10 = r15.B9R(r2)     // Catch:{ all -> 0x013c }
            int r9 = r10.size()     // Catch:{ all -> 0x013c }
            r7 = 5
            r6 = 0
        L_0x009a:
            int[] r0 = A0e     // Catch:{ all -> 0x013c }
            r5 = r0[r6]     // Catch:{ all -> 0x013c }
            r4 = 0
            r3 = 0
        L_0x00a0:
            if (r3 >= r9) goto L_0x00d1
            java.lang.Object r1 = r10.get(r3)     // Catch:{ all -> 0x013c }
            X.7sv r1 = (X.C345097sv) r1     // Catch:{ all -> 0x013c }
            int r0 = r1.BZY()     // Catch:{ all -> 0x013c }
            boolean r12 = r1.CSb(r8)     // Catch:{ all -> 0x013c }
            if (r12 == 0) goto L_0x00b8
            if (r5 == r0) goto L_0x00bf
            if (r5 != 0) goto L_0x00bb
            if (r0 == r7) goto L_0x00bf
        L_0x00b8:
            int r3 = r3 + 1
            goto L_0x00a0
        L_0x00bb:
            if (r5 != r7) goto L_0x00b8
            if (r0 != 0) goto L_0x00b8
        L_0x00bf:
            if (r4 != 0) goto L_0x00c8
            r11.A01(r5)     // Catch:{ all -> 0x013c }
            X.7sz r4 = r13.A02(r8)     // Catch:{ all -> 0x013c }
        L_0x00c8:
            r0 = r15
            X.7sG r0 = (X.C344687sG) r0     // Catch:{ all -> 0x013c }
            X.7sJ r0 = r0.A07     // Catch:{ all -> 0x013c }
            r0.A01(r4, r1)     // Catch:{ all -> 0x013c }
            goto L_0x00b8
        L_0x00d1:
            int r6 = r6 + 1
            if (r6 >= r7) goto L_0x00dc
            goto L_0x009a
        L_0x00d6:
            X.7sz r8 = r13.A02(r8)     // Catch:{ all -> 0x013c }
            r5 = 1
            goto L_0x00dd
        L_0x00dc:
            r5 = 0
        L_0x00dd:
            if (r19 == 0) goto L_0x013b
            boolean r0 = r13.A0d     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x0123
            X.7se r4 = r13.A0L     // Catch:{ all -> 0x013c }
            if (r4 == 0) goto L_0x0123
            r1 = 230955417(0xdc41999, float:1.2085595E-30)
            java.lang.String r0 = "PostProcessCpuFrames"
            X.0fg.A01(r0, r1)     // Catch:{ all -> 0x013c }
            X.0qQ.A0B(r14, r2)     // Catch:{ all -> 0x013c }
            boolean r0 = r4.A02     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x011d
            boolean r0 = r4.A09     // Catch:{ all -> 0x013c }
            if (r0 != 0) goto L_0x011d
            X.7ss r1 = r14.CFP()     // Catch:{ all -> 0x013c }
            if (r1 == 0) goto L_0x011d
            boolean r0 = r1.A00()     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x011d
            X.7su r3 = r4.A00     // Catch:{ all -> 0x013c }
            if (r3 == 0) goto L_0x0115
            int r2 = r1.A01     // Catch:{ all -> 0x013c }
            int r1 = r1.A00     // Catch:{ all -> 0x013c }
            int r0 = r14.Awt()     // Catch:{ all -> 0x013c }
            r3.A03(r2, r1, r0)     // Catch:{ all -> 0x013c }
        L_0x0115:
            X.7sp r0 = r4.A01     // Catch:{ all -> 0x013c }
            r0.A03(r14)     // Catch:{ all -> 0x013c }
            r0 = 1
            r4.A03 = r0     // Catch:{ all -> 0x013c }
        L_0x011d:
            r0 = -451066889(0xffffffffe51d43f7, float:-4.641658E22)
            X.0fg.A00(r0)     // Catch:{ all -> 0x013c }
        L_0x0123:
            if (r5 == 0) goto L_0x012d
            X.7sG r15 = (X.C344687sG) r15     // Catch:{ all -> 0x013c }
            X.7sJ r1 = r15.A07     // Catch:{ all -> 0x013c }
            r0 = 0
            r1.A01(r8, r0)     // Catch:{ all -> 0x013c }
        L_0x012d:
            java.util.concurrent.atomic.AtomicInteger r0 = r13.A0U     // Catch:{ all -> 0x013c }
            r0.incrementAndGet()     // Catch:{ all -> 0x013c }
            X.7sV r2 = r13.A0K     // Catch:{ all -> 0x013c }
            X.936 r1 = X.AnonymousClass936.A00     // Catch:{ all -> 0x013c }
            r0 = 0
            r2.E4d(r1, r0)     // Catch:{ all -> 0x013c }
            return r8
        L_0x013b:
            return r8
        L_0x013c:
            r3 = move-exception
            r14 = r8
            goto L_0x0140
        L_0x013f:
            r3 = move-exception
        L_0x0140:
            X.7s4 r2 = r13.A06
            if (r2 == 0) goto L_0x014e
            java.lang.String r1 = "GlProcessorGraph.processCpuAndGpuFrames() failed."
            X.Av8 r0 = new X.Av8
            r0.<init>(r1, r3)
            r2.A05(r0)
        L_0x014e:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344767sO.A01(X.7sO, X.7sz, X.7sH, java.lang.Integer, boolean, boolean, boolean):X.7sz");
    }

    public final void ACn(C345897uG r6) {
        this.A0d = true;
        C344837sV r3 = this.A0K;
        C344867sY r2 = r3.A01;
        if (r2.A00.compareAndSet(false, true)) {
            C344867sY.A00(r2);
        }
        r3.A00.A01.set(true);
    }

    public final int AlC() {
        return 1;
    }

    public final void CMa(C344567s4 r3) {
        0qQ.A0B(r3, 0);
        this.A06 = r3;
        r3.A03(this.A0M);
        C344927se r0 = this.A0L;
        if (r0 != null) {
            r3.A03(r0);
        }
        Handler handler = this.A02;
        if (handler == null || !0qQ.A0K(handler.getLooper(), r3.A00.getLooper())) {
            this.A02 = new Handler(r3.A00.getLooper(), this);
        }
        List list = this.A07;
        if (list != null) {
            A05(this, new C361888gz(list), (C345237tA) null);
            this.A07 = null;
        }
    }

    public final void E4c(C344907sc r2) {
        A05(this, r2, (C345237tA) null);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.Av8, java.lang.RuntimeException] */
    public final C345137sz EEw(C345137sz r12, C345097sv r13, C344697sH r14, Long l) {
        C345137sz r5 = r12;
        0qQ.A0B(r12, 0);
        C344697sH r6 = r14;
        0qQ.A0B(r14, 2);
        try {
            C349257zq.A03("GlProcessorGraph.render");
            if (this.A02 == null || !CKm() || !this.A08) {
                r5 = A01(this, r5, r6, (Integer) null, true, true, true);
            } else {
                r5 = A03(r12, r14, true);
            }
        } catch (Throwable th) {
            C349257zq.A01();
            throw th;
        }
        C349257zq.A01();
        return r5;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.Av8, java.lang.RuntimeException] */
    public final void EEx(C344697sH r9, Long l) {
        C344697sH r3 = r9;
        0qQ.A0B(r9, 0);
        if (r9.CVW(0)) {
            try {
                C349257zq.A03("GlProcessorGraph.renderInternal");
                C345137sz r2 = (C345137sz) r9.BHP(0);
                if (!this.A0P || r9.B9Q(0) != 0) {
                    if (this.A02 == null || !CKm() || !this.A08) {
                        0qQ.A0A(r2);
                        A01(this, r2, r3, (Integer) null, false, true, true);
                    } else {
                        0qQ.A0A(r2);
                        A03(r2, r9, false);
                    }
                    C349257zq.A01();
                }
                C349257zq.A01();
            } catch (Throwable th) {
                C349257zq.A01();
                throw th;
            }
        }
    }

    public final void FMh(int i, Object obj) {
        0qQ.A0B(obj, 1);
        if ((i & 1) != 0) {
            C345157t1 r0 = ((C342977pT) obj).A00;
            r0.A00 = this;
            r0.A03.A01(r0.A04, r0.A05, this);
        }
    }

    public final void detach() {
        this.A0d = false;
        Long l = this.A0G;
        if (l != null) {
            GLES30.glDeleteSync(l.longValue());
            this.A0G = null;
        }
        Long l2 = this.A0b;
        if (l2 != null) {
            GLES30.glDeleteSync(l2.longValue());
            this.A0b = null;
        }
        Long l3 = this.A0c;
        if (l3 != null) {
            GLES30.glDeleteSync(l3.longValue());
            this.A0c = null;
        }
        C344837sV r1 = this.A0K;
        r1.A01.A00.set(false);
        r1.A00.A01.set(false);
    }

    public final boolean handleMessage(Message message) {
        C344907sc r2;
        C345237tA r1;
        0qQ.A0B(message, 0);
        int i = message.what;
        if (i == 1) {
            Object obj = message.obj;
            if (obj != null) {
                r2 = (C344907sc) obj;
                r1 = null;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (i != 2) {
            if (i == 3 && this.A0d) {
                Object obj2 = message.obj;
                if (obj2 != null) {
                    Object[] objArr = (Object[]) obj2;
                    Object obj3 = objArr[0];
                    0qQ.A0C(obj3, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.mediagraph.interfaces.MediaGraphIO");
                    Object obj4 = objArr[1];
                    0qQ.A0C(obj4, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.interfaces.GlFrame");
                    A01(this, (C345137sz) obj4, (C344697sH) obj3, (Integer) null, true, true, true);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return true;
        } else {
            Object obj5 = message.obj;
            if (obj5 != null) {
                Object[] objArr2 = (Object[]) obj5;
                Object obj6 = objArr2[0];
                0qQ.A0C(obj6, "null cannot be cast to non-null type com.facebook.videocodec.effects.renderers.common.RendererEvent");
                r2 = (C344907sc) obj6;
                Object obj7 = objArr2[1];
                0qQ.A0C(obj7, "null cannot be cast to non-null type com.facebook.videocodec.effects.renderers.common.RendererEventListener");
                r1 = (C345237tA) obj7;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        A06(r2, r1);
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Av8, java.lang.RuntimeException] */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|(1:8)|9|(1:11)|(3:12|13|(1:16))|23|24) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x002d */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047 A[Catch:{ all -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d A[Catch:{ all -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031 A[Catch:{ all -> 0x0058 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C345137sz A00(android.os.Handler r14, X.C345137sz r15, X.C344697sH r16, java.lang.Integer r17, boolean r18, boolean r19, boolean r20) {
        /*
            r13 = this;
            r8 = r16
            r7 = r15
            r4 = 0
            r6 = r13
            java.lang.String r0 = "GlProcessorGraph.renderSingleOutputInSeparateThread"
            X.C349257zq.A03(r0)     // Catch:{ all -> 0x0058 }
            r0 = 1
            java.util.concurrent.CountDownLatch r10 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0058 }
            r10.<init>(r0)     // Catch:{ all -> 0x0058 }
            java.lang.Long r0 = r13.A0b     // Catch:{ all -> 0x0058 }
            java.lang.Long r0 = A04(r13, r0)     // Catch:{ all -> 0x0058 }
            r13.A0b = r0     // Catch:{ all -> 0x0058 }
            X.Aqo r5 = new X.Aqo     // Catch:{ all -> 0x0058 }
            r9 = r17
            r11 = r19
            r12 = r20
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0058 }
            r14.post(r5)     // Catch:{ all -> 0x0058 }
            r0 = 10
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x002d }
            r10.await(r0, r2)     // Catch:{ InterruptedException -> 0x002d }
        L_0x002d:
            java.lang.Long r0 = r13.A0c     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0041
            android.opengl.GLES20.glFlush()     // Catch:{ all -> 0x0058 }
            long r2 = r0.longValue()     // Catch:{ all -> 0x0058 }
            r5 = 0
            r0 = -1
            android.opengl.GLES30.glWaitSync(r2, r5, r0)     // Catch:{ all -> 0x0058 }
            android.opengl.GLES30.glDeleteSync(r2)     // Catch:{ all -> 0x0058 }
        L_0x0041:
            r13.A0c = r4     // Catch:{ all -> 0x0058 }
            X.7sz r0 = r13.A0a     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0048
            r7 = r0
        L_0x0048:
            boolean r0 = r13.A0d     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0067
            if (r18 != 0) goto L_0x0067
            X.7sG r8 = (X.C344687sG) r8     // Catch:{ all -> 0x0056 }
            X.7sJ r0 = r8.A07     // Catch:{ all -> 0x0056 }
            r0.A01(r7, r4)     // Catch:{ all -> 0x0056 }
            goto L_0x0067
        L_0x0056:
            r3 = move-exception
            goto L_0x0059
        L_0x0058:
            r3 = move-exception
        L_0x0059:
            X.7s4 r2 = r13.A06     // Catch:{ all -> 0x006d }
            if (r2 == 0) goto L_0x0067
            java.lang.String r1 = "MediaPipeline.renderSingleOutputInSeparateThread() failed."
            X.Av8 r0 = new X.Av8     // Catch:{ all -> 0x006d }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x006d }
            r2.A05(r0)     // Catch:{ all -> 0x006d }
        L_0x0067:
            X.C349257zq.A01()
            r13.A0a = r4
            return r7
        L_0x006d:
            r0 = move-exception
            X.C349257zq.A01()
            r13.A0a = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344767sO.A00(android.os.Handler, X.7sz, X.7sH, java.lang.Integer, boolean, boolean, boolean):X.7sz");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: X.7sy} */
    /* JADX WARNING: type inference failed for: r0v29, types: [X.Av8, java.lang.RuntimeException] */
    /* JADX WARNING: type inference failed for: r0v70, types: [X.7v9, java.lang.Object, X.7sc] */
    /* JADX WARNING: type inference failed for: r0v73, types: [java.lang.Object, X.7v6, X.7sc] */
    /* JADX WARNING: type inference failed for: r0v76, types: [java.lang.Object, X.7sc, X.7v8] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    private final X.C345137sz A02(X.C345137sz r30) {
        /*
            r29 = this;
            r7 = r29
            r20 = r30
            android.os.Handler r2 = r7.A02
            boolean r0 = r7.A0d
            if (r0 == 0) goto L_0x0024
            boolean r0 = r7.CKm()
            if (r0 == 0) goto L_0x0024
            if (r2 == 0) goto L_0x0025
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = r2.getLooper()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0025
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0025
        L_0x0024:
            return r20
        L_0x0025:
            r1 = -904925411(0xffffffffca0fef1d, float:-2358215.2)
            java.lang.String r0 = "ProcessGlRenderer"
            X.0fg.A01(r0, r1)
            int r2 = r20.Awt()
            int r0 = r7.A0A
            r6 = 1
            r5 = 0
            if (r2 != r0) goto L_0x003f
            int r1 = r20.BZX()
            int r0 = r7.A0E
            if (r1 == r0) goto L_0x008c
        L_0x003f:
            r7.A0A = r2
            int r0 = r20.BZX()
            r7.A0E = r0
            int r2 = r2 + r0
            int r0 = r2 % 180
            if (r0 == 0) goto L_0x009d
            int r3 = r7.A0D
            int r2 = r7.A0F
        L_0x0050:
            X.7sV r4 = r7.A0K
            float r1 = r7.A09
            X.7v9 r0 = new X.7v9
            r0.<init>()
            r0.A02 = r3
            r0.A01 = r2
            r0.A00 = r1
            r3 = 0
            r4.E4d(r0, r3)
            int r0 = r7.A0E
            int r0 = r0 % 180
            if (r0 == 0) goto L_0x0098
            int r2 = r7.A0B
            int r1 = r7.A0C
        L_0x006d:
            X.7v6 r0 = new X.7v6
            r0.<init>()
            r0.A01 = r2
            r0.A00 = r1
            r4.E4d(r0, r3)
            int r0 = r7.A0E
            int r2 = r0 / 90
            int r0 = r7.A0A
            int r1 = -r0
            X.7v8 r0 = new X.7v8
            r0.<init>()
            r0.A00 = r2
            r0.A01 = r1
            r4.E4d(r0, r3)
        L_0x008c:
            X.7sV r1 = r7.A0K
            X.AVY r0 = X.AVY.A00
            r4 = 0
            r1.E4d(r0, r4)
            X.7sT r10 = r7.A0M
            monitor-enter(r10)
            goto L_0x00a2
        L_0x0098:
            int r2 = r7.A0C
            int r1 = r7.A0B
            goto L_0x006d
        L_0x009d:
            int r3 = r7.A0F
            int r2 = r7.A0D
            goto L_0x0050
        L_0x00a2:
            r10.A02 = r6     // Catch:{ all -> 0x0293 }
            X.81j r0 = r10.A06     // Catch:{ all -> 0x0293 }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x0293 }
            r28 = r0
            X.0qQ.A07(r28)     // Catch:{ all -> 0x0293 }
            int r19 = r28.size()     // Catch:{ all -> 0x0293 }
            r9 = 0
        L_0x00b2:
            r0 = r19
            if (r9 >= r0) goto L_0x0221
            r0 = r28
            java.lang.Object r8 = r0.get(r9)     // Catch:{ all -> 0x0293 }
            r3 = r8
            X.8tY r3 = (X.C368928tY) r3     // Catch:{ all -> 0x0293 }
            long r0 = r20.C7X()     // Catch:{ all -> 0x0293 }
            r17 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r17
            X.8gx r2 = r3.A03     // Catch:{ all -> 0x0293 }
            if (r2 == 0) goto L_0x021d
            boolean r2 = r2.isEnabled()     // Catch:{ all -> 0x0293 }
            if (r2 != r6) goto L_0x021d
            X.8tX r2 = r3.A05     // Catch:{ all -> 0x0293 }
            boolean r0 = r2.CSa(r0)     // Catch:{ all -> 0x0293 }
            if (r0 == 0) goto L_0x021d
            X.7s4 r12 = r10.A01     // Catch:{ all -> 0x0293 }
            if (r12 == 0) goto L_0x026f
            X.7ss r11 = r20.CFP()     // Catch:{ all -> 0x0293 }
            if (r11 == 0) goto L_0x0106
            boolean r0 = r11.A00()     // Catch:{ all -> 0x0293 }
            if (r0 == 0) goto L_0x0106
            X.7su r3 = X.C344817sT.A00(r10)     // Catch:{ all -> 0x0293 }
            int r0 = r11.A01     // Catch:{ all -> 0x0293 }
            float r0 = (float) r0     // Catch:{ all -> 0x0293 }
            float r1 = r10.A00     // Catch:{ all -> 0x0293 }
            float r0 = r0 * r1
            int r2 = java.lang.Math.round(r0)     // Catch:{ all -> 0x0293 }
            int r0 = r11.A00     // Catch:{ all -> 0x0293 }
            float r0 = (float) r0     // Catch:{ all -> 0x0293 }
            float r0 = r0 * r1
            int r1 = java.lang.Math.round(r0)     // Catch:{ all -> 0x0293 }
            int r0 = r20.Awt()     // Catch:{ all -> 0x0293 }
            r3.A03(r2, r1, r0)     // Catch:{ all -> 0x0293 }
        L_0x0106:
            r11 = r8
            X.8tY r11 = (X.C368928tY) r11     // Catch:{ all -> 0x0212 }
            X.7uG r16 = r12.A01()     // Catch:{ all -> 0x0212 }
            X.7su r0 = X.C344817sT.A00(r10)     // Catch:{ all -> 0x0212 }
            X.7sy r0 = r0.A0A     // Catch:{ all -> 0x0212 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x0212 }
            X.7su r3 = X.C344817sT.A00(r10)     // Catch:{ all -> 0x0212 }
            monitor-enter(r3)     // Catch:{ all -> 0x0212 }
            X.7v0 r22 = r20.getTexture()     // Catch:{ all -> 0x020f }
            if (r22 == 0) goto L_0x01f7
            java.lang.Exception r0 = r3.ClT()     // Catch:{ all -> 0x01f2 }
            if (r0 != 0) goto L_0x01ee
            X.7sr r1 = r3.A01     // Catch:{ all -> 0x01f2 }
            r0 = r20
            X.7ss r1 = r3.FL1(r0, r1)     // Catch:{ all -> 0x01f2 }
            X.7ss r13 = r20.CFP()     // Catch:{ all -> 0x01f2 }
            if (r13 == 0) goto L_0x01ee
            if (r1 == 0) goto L_0x01ee
            boolean r0 = r13.A00()     // Catch:{ all -> 0x01f2 }
            if (r0 == 0) goto L_0x01ee
            boolean r0 = r1.A00()     // Catch:{ all -> 0x01f2 }
            if (r0 == 0) goto L_0x01ee
            X.8so r2 = r11.A06     // Catch:{ all -> 0x01f2 }
            float[] r13 = r13.A03     // Catch:{ all -> 0x01f2 }
            float[] r0 = r1.A03     // Catch:{ all -> 0x01f2 }
            long r26 = r20.C7X()     // Catch:{ all -> 0x01f2 }
            r21 = r2
            r23 = r13
            r24 = r0
            r25 = r4
            r21.A02(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x01f2 }
            int r13 = r1.A01     // Catch:{ all -> 0x01f2 }
            int r0 = r1.A00     // Catch:{ all -> 0x01f2 }
            android.opengl.GLES20.glViewport(r5, r5, r13, r0)     // Catch:{ all -> 0x01f2 }
            r13 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.opengl.GLES20.glClearColor(r0, r0, r0, r13)     // Catch:{ all -> 0x01f2 }
            r0 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r0)     // Catch:{ all -> 0x01f2 }
            X.8gx r13 = r11.A03     // Catch:{ all -> 0x01f2 }
            if (r13 == 0) goto L_0x018a
            int r0 = r11.A01     // Catch:{ all -> 0x01f2 }
            int r15 = r1.A01     // Catch:{ all -> 0x01f2 }
            if (r0 != r15) goto L_0x017a
            int r14 = r11.A00     // Catch:{ all -> 0x01f2 }
            int r0 = r1.A00     // Catch:{ all -> 0x01f2 }
            if (r14 == r0) goto L_0x018a
        L_0x017a:
            r11.A01 = r15     // Catch:{ all -> 0x01f2 }
            int r0 = r1.A00     // Catch:{ all -> 0x01f2 }
            r11.A00 = r0     // Catch:{ all -> 0x01f2 }
            X.0qQ.A0A(r13)     // Catch:{ all -> 0x01f2 }
            int r1 = r11.A01     // Catch:{ all -> 0x01f2 }
            int r0 = r11.A00     // Catch:{ all -> 0x01f2 }
            r13.DpU(r1, r0)     // Catch:{ all -> 0x01f2 }
        L_0x018a:
            X.7uG r0 = r11.A02     // Catch:{ all -> 0x01f2 }
            if (r0 == 0) goto L_0x01ee
            X.8gx r0 = r11.A03     // Catch:{ all -> 0x01f2 }
            if (r0 == 0) goto L_0x01ee
            boolean r0 = r0.isEnabled()     // Catch:{ all -> 0x01f2 }
            if (r0 == 0) goto L_0x01ee
            long r0 = r2.A00     // Catch:{ all -> 0x01f2 }
            long r0 = r0 / r17
            boolean r13 = r11.A04     // Catch:{ all -> 0x01f2 }
            if (r13 != 0) goto L_0x01a5
            X.8tZ r13 = r11.A08     // Catch:{ all -> 0x01f2 }
            r13.DAo(r2, r0)     // Catch:{ all -> 0x01f2 }
        L_0x01a5:
            X.8gx r14 = r11.A03     // Catch:{ all -> 0x01f2 }
            boolean r13 = r14 instanceof X.C361878gy     // Catch:{ all -> 0x01f2 }
            if (r13 == 0) goto L_0x01b7
            java.lang.String r13 = "null cannot be cast to non-null type com.facebook.videocodec.effects.common.OutputAwareGLRenderer"
            X.0qQ.A0C(r14, r13)     // Catch:{ all -> 0x01f2 }
            X.8gy r14 = (X.C361878gy) r14     // Catch:{ all -> 0x01f2 }
            X.8tL r13 = r11.A07     // Catch:{ all -> 0x01f2 }
            r14.EUE(r13)     // Catch:{ all -> 0x01f2 }
        L_0x01b7:
            X.8gx r11 = r11.A03     // Catch:{ all -> 0x01f2 }
            X.0qQ.A0A(r11)     // Catch:{ all -> 0x01f2 }
            boolean r0 = r11.DAo(r2, r0)     // Catch:{ all -> 0x01f2 }
            if (r0 == 0) goto L_0x01ee
            r3.swapBuffers()     // Catch:{ all -> 0x01f2 }
            r16.makeCurrent()     // Catch:{ all -> 0x020f }
            monitor-exit(r3)     // Catch:{ all -> 0x0212 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0212 }
            r1.<init>()     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = "GL Error after renderFrame(): "
            r1.append(r0)     // Catch:{ all -> 0x0212 }
            r1.append(r8)     // Catch:{ all -> 0x0212 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0212 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0212 }
            X.C345907uH.A02(r1, r0)     // Catch:{ all -> 0x0212 }
            X.7su r0 = X.C344817sT.A00(r10)     // Catch:{ all -> 0x0212 }
            X.7sy r0 = r0.A0A     // Catch:{ all -> 0x0212 }
            r20 = r0
            boolean r0 = r10.A02     // Catch:{ all -> 0x0212 }
            r0 = r0 ^ 1
            r10.A02 = r0     // Catch:{ all -> 0x0212 }
            goto L_0x021d
        L_0x01ee:
            r16.makeCurrent()     // Catch:{ all -> 0x020f }
            goto L_0x01f7
        L_0x01f2:
            r0 = move-exception
            r16.makeCurrent()     // Catch:{ all -> 0x020f }
            throw r0     // Catch:{ all -> 0x020f }
        L_0x01f7:
            monitor-exit(r3)     // Catch:{ all -> 0x0212 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0212 }
            r1.<init>()     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = "GL Error after skip renderFrame(): "
            r1.append(r0)     // Catch:{ all -> 0x0212 }
            r1.append(r8)     // Catch:{ all -> 0x0212 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0212 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0212 }
            X.C345907uH.A02(r1, r0)     // Catch:{ all -> 0x0212 }
            goto L_0x021d
        L_0x020f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0212 }
            throw r0     // Catch:{ all -> 0x0212 }
        L_0x0212:
            r2 = move-exception
            java.lang.String r1 = "GlRenderChain.doFrame() error!"
            X.Av8 r0 = new X.Av8     // Catch:{ all -> 0x0293 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0293 }
            r12.A05(r0)     // Catch:{ all -> 0x0293 }
        L_0x021d:
            int r9 = r9 + 1
            goto L_0x00b2
        L_0x0221:
            monitor-exit(r10)
            r0 = -920525786(0xffffffffc921e426, float:-663106.4)
            X.0fg.A00(r0)
            boolean r0 = r7.A0Z
            if (r0 == 0) goto L_0x0024
            X.7s4 r0 = r7.A06
            if (r0 == 0) goto L_0x028b
            X.7s3 r0 = r0.A03
            int r1 = r0.BYP()
            r0 = 3
            if (r1 < r0) goto L_0x0024
            r1 = -60559716(0xfffffffffc63ee9c, float:-4.7339638E36)
            java.lang.String r0 = "WaitForGpuCompletion"
            X.0fg.A01(r0, r1)
            java.lang.Long r8 = r7.A0G
            if (r8 == 0) goto L_0x0258
            long r2 = r8.longValue()
            r0 = 500000000(0x1dcd6500, double:2.47032823E-315)
            android.opengl.GLES30.glClientWaitSync(r2, r6, r0)
            long r0 = r8.longValue()
            android.opengl.GLES30.glDeleteSync(r0)
            r7.A0G = r4
        L_0x0258:
            r0 = 37143(0x9117, float:5.2048E-41)
            long r0 = android.opengl.GLES30.glFenceSync(r0, r5)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A0G = r0
            android.opengl.GLES20.glFlush()
            r0 = -1498932802(0xffffffffa6a819be, float:-1.1664319E-15)
            X.0fg.A00(r0)
            return r20
        L_0x026f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0293 }
            r1.<init>()     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = "GlRenderChain.init() must be called before doFrame() with enabled "
            r1.append(r0)     // Catch:{ all -> 0x0293 }
            r1.append(r8)     // Catch:{ all -> 0x0293 }
            r0 = 32
            r1.append(r0)     // Catch:{ all -> 0x0293 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0293 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0293 }
            r0.<init>(r1)     // Catch:{ all -> 0x0293 }
            throw r0     // Catch:{ all -> 0x0293 }
        L_0x028b:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0293:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344767sO.A02(X.7sz):X.7sz");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.Av8, java.lang.RuntimeException] */
    private final C345137sz A03(C345137sz r21, C344697sH r22, boolean z) {
        C345137sz r14 = r21;
        C344697sH r15 = r22;
        if (this.A0d) {
            try {
                C349257zq.A03("GlProcessorGraph.renderInSeparateThread");
                Handler handler = this.A02;
                if (handler != null) {
                    boolean z2 = z;
                    if (this.A0U.get() >= this.A01) {
                        if (!z && this.A0V && this.A0M.A02()) {
                            int i = 0;
                            List B9R = r15.B9R(0);
                            int size = B9R.size();
                            boolean[] zArr = new boolean[5];
                            int i2 = 0;
                            for (int i3 = 0; i3 < 5; i3++) {
                                int i4 = A0e[i3];
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size) {
                                        break;
                                    }
                                    C345097sv r8 = (C345097sv) B9R.get(i5);
                                    zArr[i3] = false;
                                    int BZY = r8.BZY();
                                    if (i4 != BZY) {
                                        if (i4 != 0) {
                                            if (i4 == 5 && BZY == 0) {
                                            }
                                            i5++;
                                        } else if (BZY != 5) {
                                            continue;
                                            i5++;
                                        }
                                    }
                                    if (r8.CSb(r14)) {
                                        zArr[i3] = true;
                                        i2++;
                                        break;
                                    }
                                    i5++;
                                }
                            }
                            int i6 = 0;
                            while (true) {
                                if (zArr[i6]) {
                                    int i7 = A0e[i6];
                                    C345137sz r82 = null;
                                    boolean z3 = false;
                                    if (i == 0) {
                                        z3 = true;
                                    }
                                    boolean z4 = false;
                                    if (i == i2 - 1) {
                                        z4 = true;
                                    }
                                    for (int i8 = 0; i8 < size; i8++) {
                                        C345097sv r1 = (C345097sv) B9R.get(i8);
                                        int BZY2 = r1.BZY();
                                        if (i7 != BZY2) {
                                            if (i7 != 0) {
                                                if (i7 == 5 && BZY2 == 0) {
                                                }
                                            } else if (BZY2 != 5) {
                                            }
                                        }
                                        if (r1.CSb(r14)) {
                                            if (r82 == null) {
                                                r82 = A00(handler, r14, r15, Integer.valueOf(i7), true, z3, z4);
                                            }
                                            ((C344687sG) r15).A07.A01(r82, r1);
                                        }
                                    }
                                    i++;
                                }
                                i6++;
                                if (i6 >= 5) {
                                    break;
                                }
                            }
                        } else {
                            r14 = A00(handler, r14, r15, (Integer) null, z2, true, true);
                        }
                    } else {
                        handler.removeMessages(3);
                        handler.sendMessage(handler.obtainMessage(3, new Object[]{r15, r14}));
                        if (this.A0d && !z) {
                            ((C344687sG) r15).A07.A01(r14, (C345097sv) null);
                        }
                    }
                }
            } catch (Throwable th) {
                C349257zq.A01();
                throw th;
            }
            C349257zq.A01();
        }
        return r14;
    }

    public static final Long A04(C344767sO r2, Long l) {
        if (l != null) {
            GLES20.glFlush();
            GLES30.glDeleteSync(l.longValue());
        }
        C344567s4 r0 = r2.A06;
        if (r0 == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (r0.A03.BYP() < 3) {
            return null;
        } else {
            Long valueOf = Long.valueOf(GLES30.glFenceSync(37143, 0));
            GLES20.glFlush();
            return valueOf;
        }
    }

    private final void A07(List list) {
        IllegalStateException th;
        C345897uG r0;
        if (this.A06 == null) {
            this.A07 = list;
            return;
        }
        List list2 = this.A0T;
        ArrayList arrayList = new ArrayList(list2);
        ArrayList arrayList2 = new ArrayList();
        list2.clear();
        ArrayList arrayList3 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C361868gx r2 = (C361868gx) list.get(i);
            list2.add(r2);
            if (!arrayList.remove(r2)) {
                arrayList2.add(r2);
            }
            C368928tY AKz = this.A0R.AKz(i);
            C361868gx r02 = AKz.A03;
            if (r02 != r2) {
                if (r02 != null) {
                    r02.Dpb();
                }
                AKz.A03 = r2;
                AKz.A04 = r2 instanceof C361858gw;
                if (!(r2 == null || (r0 = AKz.A02) == null)) {
                    0qQ.A0A(r0);
                    r2.DpY(r0.BhQ());
                }
            }
            arrayList3.add(AKz);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C361868gx r22 = (C361868gx) arrayList.get(i2);
            if (r22 instanceof C345237tA) {
                ((C345237tA) r22).EiW((C344847sW) null);
            }
            if (r22 instanceof C361848gv) {
                ((C361848gv) r22).A0G((C344037rD) null);
            }
        }
        C344837sV r5 = this.A0K;
        C344037rD r4 = this.A05;
        int size3 = arrayList2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C361868gx r1 = (C361868gx) arrayList2.get(i3);
            if (r1 instanceof C345237tA) {
                ((C345237tA) r1).EiW(r5);
            }
            if (r1 instanceof C361848gv) {
                ((C361848gv) r1).A0G(r4);
            }
        }
        C344817sT r6 = this.A0M;
        synchronized (r6) {
            C344567s4 r9 = r6.A01;
            if (r9 != null) {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList(arrayList3);
                C3496981j r7 = r6.A06;
                List list3 = r7.A00;
                0qQ.A07(list3);
                int size4 = list3.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    C368928tY r12 = (C368928tY) list3.get(i4);
                    if (arrayList5.remove(r12)) {
                        arrayList3.set(arrayList3.indexOf(r12), r12);
                    } else {
                        arrayList4.add(r12);
                    }
                }
                int size5 = arrayList4.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    C368928tY r13 = (C368928tY) arrayList4.get(i5);
                    if (r13 instanceof C344747sM) {
                        r9.A04(r13);
                    }
                }
                int size6 = arrayList5.size();
                for (int i6 = 0; i6 < size6; i6++) {
                    C368928tY r14 = (C368928tY) arrayList5.get(i6);
                    if (r14 instanceof C344747sM) {
                        r9.A03(r14);
                    }
                }
                r7.A00();
                synchronized (r7) {
                    try {
                        if (!arrayList3.isEmpty()) {
                            int size7 = arrayList3.size();
                            ArrayList arrayList6 = new ArrayList(r7.A00.size() + size7);
                            arrayList6.addAll(r7.A00);
                            boolean z = false;
                            for (int i7 = 0; i7 < size7; i7++) {
                                Object obj = arrayList3.get(i7);
                                if (!r7.A00.contains(obj)) {
                                    arrayList6.add(obj);
                                    z = true;
                                }
                            }
                            if (z) {
                                r7.A00 = Collections.unmodifiableList(arrayList6);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } else {
                th = new IllegalStateException("GlRenderChain.init() must be called before setGlRenderers()");
                throw th;
            }
        }
    }

    public final /* synthetic */ int Avq() {
        return 0;
    }

    public final boolean CKm() {
        List list = this.A0M.A06.A00;
        0qQ.A07(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C361868gx r0 = ((C368928tY) list.get(i)).A03;
            if (r0 != null && r0.isEnabled()) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ boolean Cag() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [java.lang.Object, X.7v6, X.7sc] */
    /* JADX WARNING: type inference failed for: r0v17, types: [java.lang.Object, X.7sc, X.7v7] */
    /* JADX WARNING: type inference failed for: r0v19, types: [java.lang.Object, X.7sc, X.7v8] */
    /* JADX WARNING: type inference failed for: r0v20, types: [X.7v9, java.lang.Object, X.7sc] */
    public final void FLA(int i, int i2, int i3, boolean z, int i4, int i5) {
        float f;
        Integer num;
        if (i == 0) {
            float f2 = this.A00;
            this.A0C = Math.round(((float) i2) * f2);
            this.A0B = Math.round(((float) i3) * f2);
            if (this.A0X) {
                this.A0F = i2;
                this.A0D = i3;
            } else {
                this.A0F = i4;
                i2 = i4;
                this.A0D = i5;
            }
            if (this.A0Y) {
                f = ((float) i2) * 0.0024074074f;
            } else {
                f = this.A0Q.getResources().getDisplayMetrics().density;
            }
            this.A09 = f;
            this.A0A = 0;
            this.A0E = 0;
            C344927se r0 = this.A0L;
            if (r0 != null) {
                int i6 = this.A0C;
                int i7 = this.A0B;
                C344947sg r3 = r0.A04;
                if (i6 > 0 && i7 > 0) {
                    int max = Math.max(i6, i7);
                    int i8 = (i6 * 600) / max;
                    r3.A02 = i8;
                    int i9 = (i7 * 600) / max;
                    r3.A01 = i9;
                    r3.A02 = i8 - (i8 % 2);
                    r3.A01 = i9 - (i9 % 2);
                }
                if (r3.A0G) {
                    r3.A08.post(r3.A0B);
                    if (r3.A06) {
                        ConditionVariable conditionVariable = r3.A07;
                        conditionVariable.block();
                        conditionVariable.close();
                    }
                }
            }
            C344837sV r5 = this.A0K;
            r5.E4d(new C346387v5(this.A0I), (C345237tA) null);
            int i10 = this.A0C;
            int i11 = this.A0B;
            ? obj = new Object();
            obj.A01 = i10;
            obj.A00 = i11;
            r5.E4d(obj, (C345237tA) null);
            if (z) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A01;
            }
            ? obj2 = new Object();
            obj2.A00 = num;
            r5.E4d(obj2, (C345237tA) null);
            int i12 = this.A0E / 90;
            int i13 = this.A0A;
            ? obj3 = new Object();
            obj3.A00 = i12;
            obj3.A01 = i13;
            r5.E4d(obj3, (C345237tA) null);
            int i14 = this.A0F;
            int i15 = this.A0D;
            float f3 = this.A09;
            ? obj4 = new Object();
            obj4.A02 = i14;
            obj4.A01 = i15;
            obj4.A00 = f3;
            r5.E4d(obj4, (C345237tA) null);
        }
    }

    public final void release() {
        List list = this.A0T;
        if (!list.isEmpty()) {
            this.A07 = new ArrayList(list);
            A07(0sn.A00);
        }
        C344837sV r2 = this.A0K;
        Arrays.fill(r2.A01.A02, false);
        r2.A00.A00.A00();
        r2.A02.clear();
    }

    public static final void A05(C344767sO r2, C344907sc r3, C345237tA r4) {
        Message obtainMessage;
        if (!r3.AOe()) {
            r2.A06(r3, r4);
        } else if ((!r2.A0W && !r2.A08) || r2.A02 != null) {
            Handler handler = r2.A02;
            if (handler != null) {
                if (r4 != null) {
                    obtainMessage = handler.obtainMessage(2, new Object[]{r3, r4});
                } else {
                    obtainMessage = handler.obtainMessage(1, r3);
                }
                handler.sendMessage(obtainMessage);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r1.A0H != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        if (r0 == false) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A06(X.C344907sc r8, X.C345237tA r9) {
        /*
            r7 = this;
            X.7sZ r3 = r8.CAG()
            if (r3 == 0) goto L_0x0095
            int r1 = r3.ordinal()
            r0 = 33
            if (r1 == r0) goto L_0x008d
            r0 = 39
            if (r1 == r0) goto L_0x006f
            r0 = 38
            if (r1 != r0) goto L_0x0095
            X.7se r0 = r7.A0L
            if (r0 == 0) goto L_0x0027
            X.7sg r1 = r0.A04
            boolean r0 = r1.A0H
            if (r0 == 0) goto L_0x0027
        L_0x0020:
            X.7uT r1 = r1.A04
            if (r1 == 0) goto L_0x0027
            r0 = 1
            r1.A0D = r0
        L_0x0027:
            X.7sZ r0 = X.C344877sZ.MSQRD_EFFECT
            if (r3 != r0) goto L_0x00b8
            X.7t3 r2 = r7.A03
            if (r2 == 0) goto L_0x00b8
            java.util.List r1 = r7.A0T
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.7t1 r6 = r2.A00
            X.7rD r5 = r6.A06
            if (r5 == 0) goto L_0x00b8
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r1.iterator()
        L_0x0044:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r2 = r3.next()
            X.8gx r2 = (X.C361868gx) r2
            boolean r0 = r2 instanceof X.C361848gv
            if (r0 == 0) goto L_0x0044
            boolean r0 = r2 instanceof X.C368938tZ
            if (r0 != 0) goto L_0x0044
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L_0x0044
            X.8tV r1 = new X.8tV
            r1.<init>()
            X.8gv r2 = (X.C361848gv) r2
            java.util.HashMap r0 = r2.A0E()
            r1.A00 = r0
            r4.add(r1)
            goto L_0x0044
        L_0x006f:
            X.8qm r8 = (X.C367458qm) r8
            boolean r0 = r8.A00
            r7.A0I = r0
            X.7sV r2 = r7.A0K
            X.7v5 r1 = new X.7v5
            r1.<init>(r0)
            r0 = 0
            r2.E4d(r1, r0)
            X.7se r1 = r7.A0L
            if (r1 == 0) goto L_0x0027
            boolean r0 = r7.A0I
            X.7sg r1 = r1.A04
            r1.A0H = r0
            if (r0 != 0) goto L_0x0027
            goto L_0x0020
        L_0x008d:
            X.8gz r8 = (X.C361888gz) r8
            java.util.List r0 = r8.A00
            r7.A07(r0)
            goto L_0x0027
        L_0x0095:
            X.7sZ r0 = X.C344877sZ.MSQRD_EFFECT
            if (r3 != r0) goto L_0x009f
            java.util.concurrent.atomic.AtomicInteger r1 = r7.A0U
            r0 = 0
            r1.set(r0)
        L_0x009f:
            X.7sV r0 = r7.A0K
            r0.E4d(r8, r9)
            goto L_0x0027
        L_0x00a5:
            X.7r2 r1 = r6.A07
            java.lang.String r0 = "Lite-Controller-Thread"
            android.os.Handler r1 = r1.BAM(r0)
            X.0qQ.A07(r1)
            X.8y0 r0 = new X.8y0
            r0.<init>(r5, r4)
            r1.post(r0)
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344767sO.A06(X.7sc, X.7tA):void");
    }

    public final void E4d(C344907sc r1, C345237tA r2) {
        A05(this, r1, r2);
    }
}
