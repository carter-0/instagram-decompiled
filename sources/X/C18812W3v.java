package X;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.facebook.gputimer.GPUTimerImpl;
import com.facebook.proxygen.LigerSamplePolicy;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.W3v  reason: case insensitive filesystem */
public final class C18812W3v {
    public float A00 = 1.0f;
    public int A01;
    public int A02;
    public RectF A03;
    public C14964UHc A04;
    public X93 A05;
    public C17953Vik A06;
    public W1n A07;
    public C368958tb A08;
    public AnonymousClass8KU A09;
    public GPUTimerImpl A0A;
    public boolean A0B = true;
    public boolean A0C = false;
    public boolean A0D;
    public boolean A0E = true;
    public boolean A0F = true;
    public boolean A0G = false;
    public int A0H;
    public long A0I;
    @Deprecated
    public boolean A0J;
    public final C344227rW A0K;
    public final C17553Va6 A0L;
    public final C18658VwD A0M;
    public final C17904Vhv A0N;
    public final V5Z A0O;
    public final C17848Vh1 A0P;
    public final WG9 A0Q;
    public final WG9 A0R;
    public final C17814VgR A0S;
    public final VLG A0T = new VLG(this);
    public final C17849Vh2 A0U;
    public final VLH A0V;
    public final C18633VvR A0W;
    public final C365438n7 A0X;
    public final C365228mk A0Y;
    public final C365248mm A0Z;
    public final C344037rD A0a;
    public final C368538so A0b = new C368538so();
    public final C368938tZ A0c;
    public final ArrayList A0d;
    public final ArrayList A0e;
    public final ArrayList A0f = new ArrayList();
    public final ArrayList A0g;
    public final Map A0h;
    public final Set A0i;
    public final C368798tL A0j = new C368798tL();
    public final Map A0k = new HashMap();
    public final float[] A0l;

    public static void A05(C18812W3v w3v) {
        w3v.A0F = true;
        C17953Vik vik = w3v.A06;
        if (vik.A01()) {
            synchronized (vik) {
                0JA.A09(AnonymousClass7TF.A1W(vik.A00, AnonymousClass05K.A00), "Resuming from a non paused state");
                vik.A00 = AnonymousClass05K.A01;
            }
            Iterator it = w3v.A0f.iterator();
            while (it.hasNext()) {
                ((AnonymousClass8KU) it.next()).CMW(w3v.A0Y, w3v.A0Z);
            }
            C344037rD r2 = w3v.A0a;
            r2.Ajt().Eel(w3v.A0P.A00.BYP());
            w3v.A0L.A05 = true;
            r2.CjJ((long) w3v.hashCode(), "media_pipeline_resume", "RenderThreadManager", (Map) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bf, code lost:
        if (r0 != null) goto L_0x00c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C369008tg A00(X.C17814VgR r20, X.W1n r21, X.AnonymousClass8KU r22, X.C369008tg r23, X.C368538so r24, boolean r25, boolean r26) {
        /*
            r19 = this;
            r2 = r23
            r14 = r19
            X.Va6 r1 = r14.A0L
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0019
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0019
            X.Vs3 r5 = r1.A00
            if (r5 == 0) goto L_0x0019
            long r3 = r5.A01
            r0 = 1
            long r3 = r3 + r0
            r5.A01 = r3
        L_0x0019:
            r11 = 0
            r13 = r21
            r12 = r25
            if (r25 == 0) goto L_0x0162
            if (r23 != 0) goto L_0x0162
            X.VwD r10 = r14.A0M     // Catch:{ Exception -> 0x0152 }
            X.8n3 r0 = r13.A06     // Catch:{ Exception -> 0x0152 }
            X.8n1 r16 = r0.AoM()     // Catch:{ Exception -> 0x0152 }
            X.VjQ r9 = r13.A0D     // Catch:{ Exception -> 0x0152 }
            r0 = r20
            java.util.ArrayList r0 = r0.A01     // Catch:{ Exception -> 0x0152 }
            r17 = r0
            X.8tL r8 = r14.A0j     // Catch:{ Exception -> 0x0152 }
            X.VuK r7 = r10.A0A     // Catch:{ Exception -> 0x0152 }
            X.8tg r0 = r7.A02     // Catch:{ Exception -> 0x0152 }
            boolean r0 = X.DbW.A1a(r0)
            X.0JA.A07(r0)     // Catch:{ Exception -> 0x0152 }
            r7.A00 = r9     // Catch:{ Exception -> 0x0152 }
            r0 = r16
            r7.A01 = r0     // Catch:{ Exception -> 0x0152 }
            r7.A03 = r8     // Catch:{ Exception -> 0x0152 }
            X.8so r6 = r7.A04     // Catch:{ Exception -> 0x0152 }
            r18 = r24
            r0 = r18
            r6.A04(r0)     // Catch:{ Exception -> 0x0152 }
            r5 = 0
            int r15 = r17.size()     // Catch:{ all -> 0x013a }
        L_0x0055:
            java.lang.String r2 = "effectmanager::onDrawFrame - preparing fbt"
            if (r5 >= r15) goto L_0x00ed
            r0 = r17
            java.lang.Object r4 = r0.get(r5)     // Catch:{ all -> 0x013a }
            X.8tQ r4 = (X.C368848tQ) r4     // Catch:{ all -> 0x013a }
            boolean r0 = r4.A08     // Catch:{ all -> 0x013a }
            if (r0 == 0) goto L_0x00e9
            X.8gx r0 = r4.A05     // Catch:{ all -> 0x013a }
            boolean r0 = r0.isEnabled()     // Catch:{ all -> 0x013a }
            if (r0 == 0) goto L_0x00e9
            r16.ANS()     // Catch:{ all -> 0x013a }
            X.Vh2 r0 = r13.A0E     // Catch:{ all -> 0x013a }
            X.VfW r3 = r0.A02     // Catch:{ all -> 0x013a }
            java.lang.Integer r1 = r3.A00()     // Catch:{ all -> 0x013a }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x013a }
            if (r1 != r0) goto L_0x00c3
            X.8tg r0 = r7.A02     // Catch:{ all -> 0x013a }
            if (r0 == 0) goto L_0x00b7
            X.8gx r0 = r4.A05     // Catch:{ all -> 0x013a }
            java.lang.Integer r1 = r0.BHb()     // Catch:{ all -> 0x013a }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x013a }
            if (r1 != r0) goto L_0x00bd
            float[] r1 = r10.A02     // Catch:{ all -> 0x013a }
            if (r1 == 0) goto L_0x00c3
            float[] r0 = r10.A01     // Catch:{ all -> 0x013a }
            if (r0 == 0) goto L_0x0096
            float[] r0 = r10.A03     // Catch:{ all -> 0x013a }
            if (r0 == r1) goto L_0x00b1
        L_0x0096:
            r10.A03 = r1     // Catch:{ all -> 0x013a }
            r0 = 16
            float[] r0 = new float[r0]     // Catch:{ all -> 0x013a }
            r10.A01 = r0     // Catch:{ all -> 0x013a }
            boolean r0 = android.opengl.Matrix.invertM(r0, r11, r1, r11)     // Catch:{ all -> 0x013a }
            if (r0 != 0) goto L_0x00b1
            java.lang.String r1 = "could not invert the matrix "
            float[] r0 = r10.A02     // Catch:{ all -> 0x013a }
            java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch:{ all -> 0x013a }
            java.lang.RuntimeException r0 = X.Pxg.A0k(r1, r0)     // Catch:{ all -> 0x013a }
            throw r0     // Catch:{ all -> 0x013a }
        L_0x00b1:
            float[] r0 = r10.A01     // Catch:{ all -> 0x013a }
            r0.getClass()     // Catch:{ all -> 0x013a }
            goto L_0x00c1
        L_0x00b7:
            X.8gx r0 = r4.A05     // Catch:{ all -> 0x013a }
            X.C18658VwD.A00(r10, r9, r13, r0)     // Catch:{ all -> 0x013a }
            goto L_0x00c3
        L_0x00bd:
            float[] r0 = r10.A04     // Catch:{ all -> 0x013a }
            if (r0 == 0) goto L_0x00c3
        L_0x00c1:
            r6.A03 = r0     // Catch:{ all -> 0x013a }
        L_0x00c3:
            boolean r0 = r4.A06     // Catch:{ all -> 0x013a }
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "effectmanager::onDrawFrame - rendering chainable"
            r7.A01(r4, r3, r0)     // Catch:{ all -> 0x013a }
            goto L_0x00e9
        L_0x00cd:
            X.8tg r0 = r7.A02     // Catch:{ all -> 0x013a }
            if (r0 != 0) goto L_0x00d6
            X.8tQ r0 = r10.A09     // Catch:{ all -> 0x013a }
            r7.A01(r0, r3, r2)     // Catch:{ all -> 0x013a }
        L_0x00d6:
            java.lang.String r2 = "effectmanager::onDrawFrame - rendering non chainable"
            X.8tg r0 = r7.A02     // Catch:{ all -> 0x013a }
            r0.getClass()     // Catch:{ all -> 0x013a }
            X.8tg r1 = r7.A02     // Catch:{ all -> 0x013a }
            r0 = r18
            X.C18568VuK.A00(r4, r7, r3, r1, r0)     // Catch:{ all -> 0x013a }
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch:{ all -> 0x013a }
            X.C345907uH.A02(r2, r0)     // Catch:{ all -> 0x013a }
        L_0x00e9:
            int r5 = r5 + 1
            goto L_0x0055
        L_0x00ed:
            X.8tg r0 = r7.A02     // Catch:{ all -> 0x013a }
            if (r0 != 0) goto L_0x0109
            X.Vh2 r0 = r13.A0E     // Catch:{ all -> 0x013a }
            X.VfW r3 = r0.A02     // Catch:{ all -> 0x013a }
            java.lang.Integer r1 = r3.A00()     // Catch:{ all -> 0x013a }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x013a }
            if (r1 != r0) goto L_0x0104
            X.8tQ r0 = r10.A09     // Catch:{ all -> 0x013a }
            X.8gx r0 = r0.A05     // Catch:{ all -> 0x013a }
            X.C18658VwD.A00(r10, r9, r13, r0)     // Catch:{ all -> 0x013a }
        L_0x0104:
            X.8tQ r0 = r10.A09     // Catch:{ all -> 0x013a }
            r7.A01(r0, r3, r2)     // Catch:{ all -> 0x013a }
        L_0x0109:
            X.Vh2 r0 = r13.A0E     // Catch:{ all -> 0x013a }
            X.VfW r0 = r0.A02     // Catch:{ all -> 0x013a }
            java.lang.Integer r1 = r0.A00()     // Catch:{ all -> 0x013a }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x013a }
            if (r1 != r0) goto L_0x011a
            r0 = 0
            r10.A04 = r0     // Catch:{ all -> 0x013a }
            r10.A02 = r0     // Catch:{ all -> 0x013a }
        L_0x011a:
            X.8tg r2 = r7.A02     // Catch:{ all -> 0x013a }
            r3 = 0
            r7.A02 = r3     // Catch:{ all -> 0x013a }
            X.VjQ r0 = r7.A00     // Catch:{ Exception -> 0x0152 }
            r0.getClass()     // Catch:{ Exception -> 0x0152 }
            X.8tg r1 = r7.A02     // Catch:{ Exception -> 0x0152 }
            if (r1 == 0) goto L_0x012f
            X.VjQ r0 = r7.A00     // Catch:{ Exception -> 0x0152 }
            r0.A01(r1)     // Catch:{ Exception -> 0x0152 }
            r7.A02 = r3     // Catch:{ Exception -> 0x0152 }
        L_0x012f:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A05     // Catch:{ Exception -> 0x0152 }
            r0.set(r11)     // Catch:{ Exception -> 0x0152 }
            if (r2 != 0) goto L_0x0137
            return r3
        L_0x0137:
            if (r26 == 0) goto L_0x015b
            goto L_0x0154
        L_0x013a:
            r2 = move-exception
            X.VjQ r0 = r7.A00     // Catch:{ Exception -> 0x0152 }
            r0.getClass()     // Catch:{ Exception -> 0x0152 }
            X.8tg r1 = r7.A02     // Catch:{ Exception -> 0x0152 }
            if (r1 == 0) goto L_0x014c
            X.VjQ r0 = r7.A00     // Catch:{ Exception -> 0x0152 }
            r0.A01(r1)     // Catch:{ Exception -> 0x0152 }
            r0 = 0
            r7.A02 = r0     // Catch:{ Exception -> 0x0152 }
        L_0x014c:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A05     // Catch:{ Exception -> 0x0152 }
            r0.set(r11)     // Catch:{ Exception -> 0x0152 }
            throw r2     // Catch:{ Exception -> 0x0152 }
        L_0x0152:
            r1 = move-exception
            throw r1
        L_0x0154:
            java.util.Map r1 = r14.A0k     // Catch:{ Exception -> 0x0184 }
            X.8KV r0 = r8.A00     // Catch:{ Exception -> 0x0184 }
            r1.put(r0, r2)     // Catch:{ Exception -> 0x0184 }
        L_0x015b:
            java.lang.String r1 = "RenderManager::renderTextureToOutput draw all effects"
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0184 }
            X.C345907uH.A02(r1, r0)     // Catch:{ Exception -> 0x0184 }
        L_0x0162:
            boolean r0 = r14.A0J     // Catch:{ Exception -> 0x0184 }
            r1 = r22
            if (r0 == 0) goto L_0x0177
            monitor-enter(r1)     // Catch:{ Exception -> 0x0184 }
            boolean r0 = r14.A0G(r1)     // Catch:{ all -> 0x0174 }
            if (r0 != 0) goto L_0x0172
            r14.A0C(r13, r1, r2, r12)     // Catch:{ all -> 0x0174 }
        L_0x0172:
            monitor-exit(r1)     // Catch:{ all -> 0x0174 }
            goto L_0x017a
        L_0x0174:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0174 }
            throw r0     // Catch:{ Exception -> 0x0184 }
        L_0x0177:
            r14.A0C(r13, r1, r2, r12)     // Catch:{ Exception -> 0x0184 }
        L_0x017a:
            r14.A0H = r11     // Catch:{ Exception -> 0x0184 }
            java.lang.String r1 = "RenderManager::renderTextureToOutput"
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0184 }
            X.C345907uH.A02(r1, r0)     // Catch:{ Exception -> 0x0184 }
            return r2
        L_0x0184:
            r1 = move-exception
            if (r2 == 0) goto L_0x018c
            X.VjQ r0 = r13.A0D
            r0.A01(r2)
        L_0x018c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18812W3v.A00(X.VgR, X.W1n, X.8KU, X.8tg, X.8so, boolean, boolean):X.8tg");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r3.A00 == X.AnonymousClass05K.A0C) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01() {
        /*
            r4 = this;
            X.Vik r3 = r4.A06
            monitor-enter(r3)
            java.lang.Integer r1 = r3.A00     // Catch:{ all -> 0x0037 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0037 }
            if (r1 == r0) goto L_0x0010
            java.lang.Integer r2 = r3.A00     // Catch:{ all -> 0x0037 }
            java.lang.Integer r1 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0037 }
            r0 = 0
            if (r2 != r1) goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            monitor-exit(r3)
            if (r0 != 0) goto L_0x0036
            X.Vh1 r3 = r4.A0P
            r0 = 1
            X.7s3 r2 = r3.A00
            r2.ErB(r0)
            java.lang.Object r1 = r3.A01
            monitor-enter(r1)
            r3.A03 = r0     // Catch:{ all -> 0x0033 }
            r1.notifyAll()     // Catch:{ all -> 0x0033 }
            monitor-exit(r1)     // Catch:{ all -> 0x0033 }
            X.7rD r0 = r4.A0a
            X.7rK r1 = r0.Ajt()
            int r0 = r2.BYP()
            r1.Eel(r0)
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0033 }
            throw r0
        L_0x0036:
            return
        L_0x0037:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18812W3v.A01():void");
    }

    @Deprecated
    private void A02() {
        C18658VwD vwD = this.A0M;
        boolean z = true;
        if (!vwD.A08.A00.CTO(83)) {
            Iterator A16 = DbV.A16(vwD.A0C);
            while (true) {
                if (A16.hasNext()) {
                    if (((C368848tQ) A16.next()).A05.EtX()) {
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        this.A0J = z;
    }

    public static void A03(Surface surface, C18812W3v w3v, AnonymousClass8KU r8) {
        W1n w1n;
        if (w3v.A0f.contains(r8)) {
            C17953Vik vik = w3v.A06;
            boolean A002 = vik.A00();
            if (!A002) {
                w3v.A01();
            }
            C344557s3 r2 = w3v.A0P.A00;
            r8.CMn(surface, r2);
            r8.ClU();
            if (vik.A00() && (w1n = w3v.A07) != null && w1n.A08) {
                w1n.A06.B81();
            }
            if (!A002) {
                synchronized (vik) {
                    0JA.A09(C51969G9p.A1a(vik.A00, AnonymousClass05K.A00), "Initialized from paused state");
                    vik.A00 = AnonymousClass05K.A0N;
                }
                C18658VwD vwD = w3v.A0M;
                vwD.A00 = true;
                Iterator A16 = DbV.A16(vwD.A0C);
                while (A16.hasNext()) {
                    C368848tQ r3 = (C368848tQ) A16.next();
                    r3.A05.DpY(vwD.A0B);
                    r3.A03 = true;
                }
                C368938tZ r0 = w3v.A0c;
                C345557ti r1 = vwD.A0B;
                r0.A00 = r1;
                C368958tb r02 = w3v.A08;
                if (r02 != null) {
                    r02.DpY(r1);
                }
                Iterator A0v = AnonymousClass7TF.A0v(w3v.A0h);
                while (A0v.hasNext()) {
                    ((W1n) A0v.next()).A05(w3v.A0Q, w3v.A0X);
                    A06(w3v);
                }
                W1n w1n2 = w3v.A07;
                if (w1n2 != null) {
                    A07(w3v, w1n2.A06.BHc(), w3v.A07.A06.BHR());
                }
                C345907uH.A02("RenderManager::completeInitialization", new Object[0]);
                if (w3v.A0K.A00.CTO(96)) {
                    C14964UHc uHc = new C14964UHc();
                    uHc.CMn(uHc.A00(), r2);
                    w3v.A04 = uHc;
                }
            }
            AnonymousClass8KU r22 = w3v.A09;
            if (!(r22 == null || r22 == r8)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(r22);
                w3v.A0L(arrayList);
                w3v.A09 = null;
            }
            C14964UHc uHc2 = w3v.A04;
            if (uHc2 != null) {
                uHc2.ClU();
            }
            C345907uH.A02("RenderManager::handleOutputSurfaceCreated", new Object[0]);
        }
    }

    public static void A04(C18812W3v w3v) {
        long j;
        C344037rD r8 = w3v.A0a;
        C344107rK Ajt = r8.Ajt();
        C17848Vh1 vh1 = w3v.A0P;
        Ajt.Eel(vh1.A00.BYP());
        long hashCode = (long) w3v.hashCode();
        C17553Va6 va6 = w3v.A0L;
        HashMap hashMap = new HashMap();
        C18455Vs3 vs3 = va6.A00;
        if (vs3 != null) {
            0KC.A0O("AnomalyDetector", "Number of black screens: %d", new Object[]{Long.valueOf(vs3.A02)});
            j = vs3.A02;
        } else {
            j = 0;
        }
        if (j > 0) {
            hashMap.put("number_of_black_screen", String.valueOf(j));
        }
        VLE vle = va6.A02;
        if (vle != null) {
            long j2 = vle.A00;
            if (j2 > 0) {
                hashMap.put("aspect_ratio_mismatch_frame_count", String.valueOf(j2));
            }
        }
        C18483Vsd vsd = va6.A01;
        if (vsd != null) {
            0KC.A0O("AnomalyDetector", "Number of freezes: %d", new Object[]{Long.valueOf(vsd.A01)});
            long j3 = vsd.A01;
            if (j3 > 0) {
                hashMap.put("number_of_freezes", String.valueOf(j3));
            }
        }
        r8.CjJ(hashCode, "media_pipeline_pause", "RenderThreadManager", hashMap);
        va6.A05 = false;
        C18483Vsd vsd2 = va6.A01;
        if (vsd2 != null) {
            C18483Vsd.A00(vsd2);
        }
        C17953Vik vik = w3v.A06;
        synchronized (vik) {
            vik.A00 = AnonymousClass05K.A00;
        }
        w3v.A05.stop();
        W1n w1n = w3v.A07;
        if (w1n != null) {
            C365408n3 r2 = w1n.A06;
            if (r2 != null) {
                r2.release();
            }
            w1n.A07 = null;
            w1n.A0D.A00();
            w1n.A08 = false;
        }
        w3v.A0c.Dpb();
        w3v.A0M.A02();
        C368958tb r22 = w3v.A08;
        if (r22 != null) {
            r22.Dpb();
        }
        w3v.A0N.A00();
        Iterator it = w3v.A0f.iterator();
        while (it.hasNext()) {
            AnonymousClass8KU r3 = (AnonymousClass8KU) it.next();
            r3.release();
            synchronized (w3v) {
                w3v.A0i.remove(r3);
            }
        }
        C14964UHc uHc = w3v.A04;
        if (uHc != null) {
            uHc.release();
            w3v.A04 = null;
        }
        vh1.A00();
        w3v.A0I = 0;
    }

    public static void A06(C18812W3v w3v) {
        Iterator A0v = AnonymousClass7TF.A0v(w3v.A0h);
        while (A0v.hasNext()) {
            if (((W1n) A0v.next()).A05 != C365378n0.DISABLE) {
                C17904Vhv vhv = w3v.A0N;
                C345557ti r3 = w3v.A0M.A0B;
                C344557s3 r2 = w3v.A0P.A00;
                for (X9O CMh : vhv.A02) {
                    CMh.CMh(r2, r3);
                }
                return;
            }
        }
        w3v.A0N.A00();
    }

    public static void A07(C18812W3v w3v, int i, int i2) {
        if (w3v.A07 != null) {
            w3v.A0M.A03(i, i2);
            C368958tb r0 = w3v.A08;
            if (r0 != null) {
                r0.DpU(i, i2);
            }
        }
        A08(w3v, w3v.A07);
    }

    public static void A08(C18812W3v w3v, W1n w1n) {
        W1n w1n2 = w3v.A07;
        if (w1n == w1n2 && w1n2 != null) {
            C18658VwD vwD = w3v.A0M;
            RectF rectF = w1n2.A03;
            vwD.A07.set(rectF);
            Iterator A16 = DbV.A16(vwD.A0C);
            while (A16.hasNext()) {
                ((C368848tQ) A16.next()).A05.DpZ(rectF);
            }
        }
    }

    public static void A09(C18812W3v w3v, C391719tX r10, String str, Map map) {
        if (!w3v.A0D) {
            C391719tX r2 = r10;
            w3v.A0a.CjI(r2, AnonymousClass000.A00(3577), "RenderThreadManager", "medium", str, map, (long) w3v.hashCode());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004c, code lost:
        if (r13 == null) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0C(X.W1n r24, X.AnonymousClass8KU r25, X.C369008tg r26, boolean r27) {
        /*
            r23 = this;
            r6 = r25
            boolean r0 = r6.ClU()
            if (r0 == 0) goto L_0x014e
            r12 = 0
            android.opengl.GLES20.glClearColor(r12, r12, r12, r12)
            r0 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r0)
            r5 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "RenderManager::renderTextureToOutput makeCurrent and glClear"
            X.C345907uH.A02(r0, r1)
            int r1 = r6.getWidth()
            int r0 = r6.getHeight()
            android.opengl.GLES20.glViewport(r5, r5, r1, r0)
            r7 = r23
            X.8tZ r4 = r7.A0c
            int r11 = r6.getWidth()
            int r9 = r6.getHeight()
            X.8nA r13 = r6.BHU()
            r10 = r26
            boolean r0 = X.AnonymousClass7TF.A1V(r10)
            r15 = r24
            X.Vso r1 = X.W1n.A00(r15, r0)
            X.C18493Vso.A00(r1)
            if (r13 != 0) goto L_0x018e
            X.X7Q r0 = r1.A00
            X.8nA r13 = r0.Avy()
            r0 = 1
            if (r13 != 0) goto L_0x018e
        L_0x004e:
            int r0 = r0 * 31
            int r0 = r0 + r11
            int r8 = r0 * 31
            int r8 = r8 + r9
            android.util.SparseArray r3 = r1.A05
            java.lang.Object r2 = r3.get(r8)
            float[] r2 = (float[]) r2
            if (r2 != 0) goto L_0x00bf
            r0 = 8
            float[] r2 = new float[r0]
            r2 = {-1082130432, -1082130432, 1065353216, -1082130432, -1082130432, 1065353216, 1065353216, 1065353216} // fill-array
            X.8nA r0 = X.C365468nA.FIT
            if (r13 != r0) goto L_0x00bc
            X.X7Q r0 = r1.A00
            int r1 = r0.Asw()
            int r0 = r0.Asq()
            if (r1 == 0) goto L_0x019e
            if (r0 == 0) goto L_0x019e
            if (r11 == 0) goto L_0x0196
            if (r9 == 0) goto L_0x0196
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            float r13 = (float) r11
            float r9 = (float) r9
            float r14 = r13 / r9
            r11 = 1073741824(0x40000000, float:2.0)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0174
            float r1 = r1 * r9
            float r0 = X.AnonymousClass7TE.A00(r13, r1)
            float r0 = r0 / r11
            float r1 = r1 + r0
            android.graphics.RectF r11 = new android.graphics.RectF
            r11.<init>(r0, r12, r1, r9)
        L_0x0094:
            float r1 = r11.right
            float r0 = r11.left
            float r1 = r1 - r0
            float r14 = r13 - r1
            float r14 = r14 / r13
            float r1 = r11.bottom
            float r0 = r11.top
            float r1 = r1 - r0
            float r0 = r9 - r1
            float r0 = r0 / r9
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r11 = r14 + r12
            r9 = 1065353216(0x3f800000, float:1.0)
            float r1 = r9 - r14
            float r12 = r12 + r0
            float r9 = r9 - r0
            r2[r5] = r11
            r0 = 1
            r2[r0] = r12
            r0 = 2
            r2[r0] = r1
            r0 = 3
            r2[r0] = r12
            X.C13990Tnq.A1Y(r2, r11, r9, r1)
        L_0x00bc:
            r3.put(r8, r2)
        L_0x00bf:
            r4.A00(r2)
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            boolean r0 = r6 instanceof X.C365188mg
            if (r0 == 0) goto L_0x0170
            r0 = r6
            X.8mg r0 = (X.C365188mg) r0
            int r19 = r0.Bpb()
        L_0x00cf:
            X.8so r8 = r15.A07
            if (r8 == 0) goto L_0x014e
            X.8tb r2 = r7.A08
            if (r2 == 0) goto L_0x016d
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x016d
        L_0x00db:
            r2.ESt(r3)
            X.8so r9 = r7.A0b
            r20 = r27
            if (r27 == 0) goto L_0x0167
            if (r26 == 0) goto L_0x0167
            X.7v0 r1 = r10.A03
        L_0x00e8:
            r0 = 0
            if (r27 == 0) goto L_0x0162
            r12 = r0
        L_0x00ec:
            int r17 = r6.getWidth()
            int r18 = r6.getHeight()
            X.8nA r16 = r6.BHU()
            float[] r20 = r15.A07(r16, r17, r18, r19, r20)
            long r10 = r8.A00
            r16 = r9
            r17 = r1
            r18 = r12
            r19 = r0
            r21 = r10
            r16.A02(r17, r18, r19, r20, r21)
            r0 = 0
            r2.DAo(r9, r0)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "RenderManager::copyToOutput onDrawFrame"
            X.C345907uH.A02(r0, r1)
            r6.Dpd()
            X.8so r2 = r15.A07
            r2.getClass()
            X.8n3 r1 = r15.A06
            boolean r0 = r1.CKh()
            if (r0 == 0) goto L_0x0159
            long r0 = r2.A00
        L_0x0129:
            boolean r2 = r6 instanceof X.C365208mi
            if (r2 == 0) goto L_0x014f
            r2 = r6
            X.8mi r2 = (X.C365208mi) r2
            r2.A00(r0)
        L_0x0133:
            r6.swapBuffers()
            X.Va6 r1 = r7.A0L
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x014b
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x014b
            X.Vs3 r2 = r1.A00
            if (r2 == 0) goto L_0x014b
            long r5 = r2.A00
            r0 = 1
            long r5 = r5 + r0
            r2.A00 = r5
        L_0x014b:
            r4.ESt(r3)
        L_0x014e:
            return
        L_0x014f:
            boolean r2 = r6 instanceof X.C365178mf
            if (r2 == 0) goto L_0x0133
            r2 = r6
            X.8mf r2 = (X.C365178mf) r2
            r2.A02 = r0
            goto L_0x0133
        L_0x0159:
            X.8n1 r0 = r1.AoM()
            long r0 = r0.ANS()
            goto L_0x0129
        L_0x0162:
            float[] r12 = r8.A04
            float[] r0 = r8.A05
            goto L_0x00ec
        L_0x0167:
            X.7v0 r1 = r8.A00()
            goto L_0x00e8
        L_0x016d:
            r2 = r4
            goto L_0x00db
        L_0x0170:
            r19 = 0
            goto L_0x00cf
        L_0x0174:
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0187
            float r1 = r13 / r1
            float r0 = X.AnonymousClass7TE.A00(r9, r1)
            float r0 = r0 / r11
            float r1 = r1 + r0
            android.graphics.RectF r11 = new android.graphics.RectF
            r11.<init>(r12, r0, r13, r1)
            goto L_0x0094
        L_0x0187:
            android.graphics.RectF r11 = new android.graphics.RectF
            r11.<init>(r12, r12, r13, r9)
            goto L_0x0094
        L_0x018e:
            int r0 = r13.hashCode()
            int r0 = r0 + 31
            goto L_0x004e
        L_0x0196:
            java.lang.String r1 = "Output Widths and Heights cannot be 0 for calculating fit rect"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x019e:
            java.lang.String r1 = "Input Widths and Heights cannot be 0 for calculating fit rect"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18812W3v.A0C(X.W1n, X.8KU, X.8tg, boolean):void");
    }

    private void A0E(String str) {
        ArrayList arrayList = this.A0S.A02;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass8KU r0 = (AnonymousClass8KU) it.next();
            hashMap.put(r0.BO5(), 002.A0P("x", r0.getWidth(), r0.getHeight()));
        }
        C344037rD r1 = this.A0a;
        r1.Ajt().ETZ(hashMap);
        r1.CjJ((long) hashCode(), str, "RenderThreadManager", (Map) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r10 = r18;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x015c A[Catch:{ all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x011c A[Catch:{ all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0127 A[Catch:{ all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x013a A[Catch:{ all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x013d A[Catch:{ all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0144 A[Catch:{ all -> 0x0190 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0F(X.C17814VgR r19) {
        /*
            r18 = this;
            r11 = r19
            java.util.ArrayList r4 = r11.A02
            boolean r0 = r4.isEmpty()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r2 = 0
            if (r0 == 0) goto L_0x01c1
            r10 = r18
            X.W1n r12 = r10.A07
            if (r12 == 0) goto L_0x01c1
            boolean r0 = r10.A0G
            if (r0 != 0) goto L_0x01c1
            X.8n3 r1 = r11.A00
            if (r1 == 0) goto L_0x0025
            java.util.Map r0 = r10.A0h
            java.lang.Object r12 = r0.get(r1)
            X.W1n r12 = (X.W1n) r12
        L_0x0025:
            if (r12 == 0) goto L_0x01c1
            X.8so r15 = r12.A07
            if (r15 == 0) goto L_0x01c1
            boolean r16 = r11.A00()
            if (r16 == 0) goto L_0x0053
            java.util.ArrayList r6 = r10.A0g
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0053
            r5 = 0
        L_0x003a:
            int r0 = r6.size()
            if (r5 >= r0) goto L_0x0050
            X.VvR r3 = r10.A0W
            X.WG9 r1 = r10.A0R
            java.lang.Object r0 = r6.get(r5)
            X.7sc r0 = (X.C344907sc) r0
            r3.A01(r1, r0)
            int r5 = r5 + 1
            goto L_0x003a
        L_0x0050:
            r6.clear()
        L_0x0053:
            java.util.ArrayList r5 = r11.A01
            r17 = 0
            r3 = 0
        L_0x0058:
            int r0 = r5.size()
            if (r3 >= r0) goto L_0x0074
            java.lang.Object r0 = r5.get(r3)
            X.8tQ r0 = (X.C368848tQ) r0
            X.8gx r1 = r0.A05
            boolean r0 = r1 instanceof X.C361878gy
            if (r0 == 0) goto L_0x0079
            X.8gy r1 = (X.C361878gy) r1
            boolean r0 = r1.CXr()
            if (r0 == 0) goto L_0x0079
            r17 = 1
        L_0x0074:
            r9 = 1
            r5 = 0
            r1 = 0
            r3 = 0
            goto L_0x007c
        L_0x0079:
            int r3 = r3 + 1
            goto L_0x0058
        L_0x007c:
            int r0 = r4.size()     // Catch:{ Exception -> 0x0100 }
            if (r3 >= r0) goto L_0x00db
            java.lang.Object r13 = r4.get(r3)     // Catch:{ Exception -> 0x0100 }
            X.8KU r13 = (X.AnonymousClass8KU) r13     // Catch:{ Exception -> 0x0100 }
            X.8tL r6 = r10.A0j     // Catch:{ Exception -> 0x0102 }
            X.8KV r0 = r13.CED()     // Catch:{ Exception -> 0x0102 }
            r6.A00 = r0     // Catch:{ Exception -> 0x0102 }
            X.8KV r0 = r13.CED()     // Catch:{ Exception -> 0x0102 }
            java.lang.Integer r0 = X.AAJ.A01(r0)     // Catch:{ Exception -> 0x0102 }
            r6.A01 = r0     // Catch:{ Exception -> 0x0102 }
            if (r17 == 0) goto L_0x00a7
            java.util.Map r5 = r10.A0k     // Catch:{ Exception -> 0x0102 }
            X.8KV r0 = r6.A00     // Catch:{ Exception -> 0x0102 }
            java.lang.Object r14 = r5.get(r0)     // Catch:{ Exception -> 0x0102 }
            X.8tg r14 = (X.C369008tg) r14     // Catch:{ Exception -> 0x0102 }
            goto L_0x00a8
        L_0x00a7:
            r14 = r1
        L_0x00a8:
            boolean r0 = r10.A0J     // Catch:{ Exception -> 0x00d7, all -> 0x0192 }
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r10.A0G(r13)     // Catch:{ Exception -> 0x00d7, all -> 0x0192 }
            if (r0 != 0) goto L_0x00cb
            X.8tg r1 = r10.A00(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00d7, all -> 0x0192 }
            goto L_0x00c5
        L_0x00b7:
            monitor-enter(r13)     // Catch:{ Exception -> 0x00d7, all -> 0x0192 }
            boolean r0 = r10.A0G(r13)     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00c0
            monitor-exit(r13)     // Catch:{ all -> 0x00d0 }
            goto L_0x00cb
        L_0x00c0:
            X.8tg r1 = r10.A00(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00d0 }
            monitor-exit(r13)     // Catch:{ all -> 0x00d4 }
        L_0x00c5:
            if (r16 == 0) goto L_0x00cc
            if (r1 != 0) goto L_0x00cc
            r5 = r13
            goto L_0x00db
        L_0x00cb:
            r1 = r14
        L_0x00cc:
            int r3 = r3 + 1
            r5 = r13
            goto L_0x007c
        L_0x00d0:
            r0 = move-exception
            r1 = r14
        L_0x00d2:
            monitor-exit(r13)     // Catch:{ all -> 0x00d4 }
            goto L_0x00d6
        L_0x00d4:
            r0 = move-exception
            goto L_0x00d2
        L_0x00d6:
            throw r0     // Catch:{ Exception -> 0x0102 }
        L_0x00d7:
            r4 = move-exception
            r5 = r13
            r1 = r14
            goto L_0x0104
        L_0x00db:
            X.VvR r4 = r10.A0W     // Catch:{ Exception -> 0x00fe }
            X.WG9 r3 = r10.A0R     // Catch:{ Exception -> 0x00fe }
            X.936 r0 = X.AnonymousClass936.A00     // Catch:{ Exception -> 0x00fe }
            r4.A01(r3, r0)     // Catch:{ Exception -> 0x00fe }
            if (r17 == 0) goto L_0x0176
            java.util.Map r4 = r10.A0k
            java.util.Iterator r3 = X.AnonymousClass7TF.A0v(r4)
        L_0x00ec:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x017e
            java.lang.Object r1 = r3.next()
            X.8tg r1 = (X.C369008tg) r1
            X.VjQ r0 = r12.A0D
            r0.A01(r1)
            goto L_0x00ec
        L_0x00fe:
            r4 = move-exception
            goto L_0x0105
        L_0x0100:
            r4 = move-exception
            goto L_0x0104
        L_0x0102:
            r4 = move-exception
            r5 = r13
        L_0x0104:
            r9 = 0
        L_0x0105:
            java.lang.String r0 = r4.getMessage()     // Catch:{ all -> 0x0190 }
            r6 = 30000(0x7530, float:4.2039E-41)
            X.UOx r8 = new X.UOx     // Catch:{ all -> 0x0190 }
            r8.<init>(r0, r4, r6)     // Catch:{ all -> 0x0190 }
            r0 = 2
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0190 }
            r7.<init>(r0)     // Catch:{ all -> 0x0190 }
            java.lang.String r3 = "input"
            X.8n3 r0 = r12.A06     // Catch:{ all -> 0x0190 }
            if (r0 == 0) goto L_0x013d
            java.lang.String r0 = r0.BO5()     // Catch:{ all -> 0x0190 }
        L_0x0120:
            r7.put(r3, r0)     // Catch:{ all -> 0x0190 }
            java.lang.String r3 = "output"
            if (r5 == 0) goto L_0x013a
            java.lang.String r0 = r5.BO5()     // Catch:{ all -> 0x0190 }
        L_0x012b:
            r7.put(r3, r0)     // Catch:{ all -> 0x0190 }
            java.lang.String r5 = "RenderThreadManager::renderTextureToOutputs"
            A09(r10, r8, r5, r7)     // Catch:{ all -> 0x0190 }
            int r0 = r10.A0H     // Catch:{ all -> 0x0190 }
            int r3 = r0 + 1
            r10.A0H = r3     // Catch:{ all -> 0x0190 }
            goto L_0x0140
        L_0x013a:
            java.lang.String r0 = "<null>"
            goto L_0x012b
        L_0x013d:
            java.lang.String r0 = "<null>"
            goto L_0x0120
        L_0x0140:
            r0 = 10
            if (r3 < r0) goto L_0x015c
            java.lang.String r0 = "RenderManager::renderTextureToOutputs exceeded retryable errors"
            X.UOx r2 = new X.UOx     // Catch:{ all -> 0x0190 }
            r2.<init>(r0, r4, r6)     // Catch:{ all -> 0x0190 }
            r0 = 0
            A09(r10, r2, r5, r0)     // Catch:{ all -> 0x0190 }
            boolean r0 = r4 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0190 }
            if (r0 == 0) goto L_0x0156
            java.lang.RuntimeException r4 = (java.lang.RuntimeException) r4     // Catch:{ all -> 0x0190 }
            throw r4     // Catch:{ all -> 0x0190 }
        L_0x0156:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0190 }
            r0.<init>(r4)     // Catch:{ all -> 0x0190 }
            throw r0     // Catch:{ all -> 0x0190 }
        L_0x015c:
            if (r17 == 0) goto L_0x0176
            java.util.Map r4 = r10.A0k
            java.util.Iterator r3 = X.AnonymousClass7TF.A0v(r4)
        L_0x0164:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x017e
            java.lang.Object r1 = r3.next()
            X.8tg r1 = (X.C369008tg) r1
            X.VjQ r0 = r12.A0D
            r0.A01(r1)
            goto L_0x0164
        L_0x0176:
            if (r1 == 0) goto L_0x0181
            X.VjQ r0 = r12.A0D
            r0.A01(r1)
            goto L_0x0181
        L_0x017e:
            r4.clear()
        L_0x0181:
            X.UHc r0 = r10.A04
            if (r0 == 0) goto L_0x0188
            r0.ClU()
        L_0x0188:
            java.lang.String r1 = "RenderManager::renderTextureToOutputs"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            X.C345907uH.A02(r1, r0)
            return r9
        L_0x0190:
            r4 = move-exception
            goto L_0x0194
        L_0x0192:
            r4 = move-exception
            r1 = r14
        L_0x0194:
            if (r17 == 0) goto L_0x01ae
            java.util.Map r3 = r10.A0k
            java.util.Iterator r2 = X.AnonymousClass7TF.A0v(r3)
        L_0x019c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01b6
            java.lang.Object r1 = r2.next()
            X.8tg r1 = (X.C369008tg) r1
            X.VjQ r0 = r12.A0D
            r0.A01(r1)
            goto L_0x019c
        L_0x01ae:
            if (r1 == 0) goto L_0x01b9
            X.VjQ r0 = r12.A0D
            r0.A01(r1)
            goto L_0x01b9
        L_0x01b6:
            r3.clear()
        L_0x01b9:
            X.UHc r0 = r10.A04
            if (r0 == 0) goto L_0x01c0
            r0.ClU()
        L_0x01c0:
            throw r4
        L_0x01c1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18812W3v.A0F(X.VgR):boolean");
    }

    public final C344557s3 A0H() {
        C17848Vh1 vh1 = this.A0P;
        Object obj = vh1.A01;
        synchronized (obj) {
            while (!vh1.A03) {
                try {
                    obj.wait(2500);
                } catch (InterruptedException unused) {
                    throw new RuntimeException("Difficulties waiting for the context to be set up");
                }
            }
        }
        return vh1.A00;
    }

    public final void A0I(X93 x93) {
        VLC vlc;
        VLC vlc2;
        C365408n3 r0;
        C18483Vsd vsd;
        C17553Va6 va6 = this.A0L;
        if (va6.A04 && va6.A05 && (vsd = va6.A01) != null) {
            vsd.A00 = SystemClock.uptimeMillis();
        }
        this.A0W.A01(this.A0R, AVY.A00);
        this.A0E = true;
        if (x93 == null) {
            x93 = this.A05;
        }
        W1n CE7 = x93.CE7();
        if (this.A06.A00() && CE7 != null && CE7.A06 != null && this.A0F) {
            W1n w1n = this.A07;
            if (!(w1n == null || (r0 = w1n.A06) == null || !r0.EFH())) {
                CE7.A06(w1n);
            }
            W1n w1n2 = this.A07;
            if (w1n2 != null && x93 == w1n2.A04) {
                this.A0a.EAp(System.nanoTime());
                GPUTimerImpl gPUTimerImpl = this.A0A;
                if (gPUTimerImpl != null) {
                    gPUTimerImpl.beginFrame();
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            while (true) {
                ArrayList arrayList = this.A0e;
                if (i2 >= arrayList.size()) {
                    break;
                }
                C17814VgR vgR = (C17814VgR) arrayList.get(i2);
                if (this.A0h.get(vgR.A00) == CE7) {
                    if (vgR.A00()) {
                        CE7.A04();
                    }
                    z |= A0F(vgR);
                }
                i2++;
            }
            int i3 = 0;
            while (true) {
                ArrayList arrayList2 = this.A0d;
                if (i >= arrayList2.size()) {
                    break;
                }
                C17814VgR vgR2 = (C17814VgR) arrayList2.get(i3);
                if (i == 0 || System.currentTimeMillis() - currentTimeMillis < Long.MAX_VALUE) {
                    if (vgR2.A00()) {
                        CE7.A04();
                    }
                    z |= A0F(vgR2);
                    arrayList2.remove(i3);
                    arrayList2.add(vgR2);
                } else {
                    i3++;
                }
                i++;
            }
            W1n w1n3 = this.A07;
            if (w1n3 != null && x93 == w1n3.A04) {
                this.A0a.EAo(System.nanoTime(), z);
                GPUTimerImpl gPUTimerImpl2 = this.A0A;
                if (gPUTimerImpl2 != null) {
                    gPUTimerImpl2.endFrame();
                }
            }
            if (this.A0I == 0 && (vlc2 = (VLC) this.A0Q.A06.get()) != null) {
                vlc2.A00.A0G.post(new C19924Wht(vlc2));
            }
            if (this.A0I == 10 && (vlc = (VLC) this.A0Q.A06.get()) != null) {
                C18660VwH vwH = vlc.A00;
                if (vwH.A07 != null) {
                    vwH.A0G.post(new C19925Whu(vlc));
                }
            }
            this.A0I++;
            if (va6.A04 && va6.A05) {
                if (va6.A03) {
                    va6.A03 = false;
                    C18483Vsd vsd2 = va6.A01;
                    if (vsd2 != null) {
                        synchronized (vsd2) {
                            Handler handler = vsd2.A02;
                            if (handler == null) {
                                vsd2.A02 = C341447mt.A01("FreezeDetector");
                            } else {
                                handler.removeCallbacksAndMessages((Object) null);
                            }
                            vsd2.A02.postDelayed(vsd2.A04, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                            vsd2.A00 = 0;
                            vsd2.A01 = 0;
                        }
                    }
                } else {
                    C18455Vs3 vs3 = va6.A00;
                    if (vs3 != null) {
                        C18455Vs3.A00(vs3);
                    }
                }
            }
        }
        x93.DGq();
    }

    public final void A0J(VUX vux) {
        C344907sc r1 = vux.A00;
        if (r1 != null) {
            boolean z = r1.CAG().A01;
            C345237tA r0 = vux.A01;
            if (r0 != null) {
                r0.Ddr(r1);
                if (vux.A00.CAG() == C344877sZ.MSQRD_EFFECT) {
                    A02();
                }
            } else if (vux.A02 != null) {
                for (int i = 0; i < vux.A02.size(); i++) {
                    C345237tA r12 = (C345237tA) ((Reference) vux.A02.get(i)).get();
                    if (r12 != null) {
                        r12.Ddr(vux.A00);
                    }
                }
            }
            if (!z) {
                C371328y1.A01(this.A0a, "RenderThreadManager", this.A0M.A01(), (long) hashCode());
            }
            VLH vlh = this.A0V;
            vux.A00 = null;
            vux.A02 = null;
            vux.A01 = null;
            synchronized (vlh) {
                vlh.A00.add(vux);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [X.8KU, X.UHc, X.8KT, java.lang.Object] */
    public final void A0K(List list) {
        boolean A1W;
        if (this.A0K.A00.CTO(102)) {
            C17953Vik vik = this.A06;
            synchronized (vik) {
                A1W = AnonymousClass7TF.A1W(vik.A00, AnonymousClass05K.A01);
            }
            if (A1W) {
                A01();
                synchronized (vik) {
                    0JA.A09(C51969G9p.A1a(vik.A00, AnonymousClass05K.A00), "Waiting for output from paused state");
                    vik.A00 = AnonymousClass05K.A0C;
                }
                ? r1 = new AnonymousClass8KT();
                r1.A01 = 1;
                r1.A00 = 1;
                this.A09 = r1;
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(r1);
                A0K(arrayList);
            }
        }
        A0B(this, list);
        C17814VgR vgR = this.A0S;
        0JA.A08(AnonymousClass7TF.A1V(list), "Passed null outputs to renderpass add");
        for (Object A1S : list) {
            JTR.A1S(A1S, vgR.A02);
        }
        Collections.sort(vgR.A02, new C20381WqM((Object) vgR, 2));
        A0E("media_pipeline_add_output");
    }

    public final void A0L(List list) {
        A0E("media_pipeline_remove_output");
        A0A(this, list);
        C17814VgR vgR = this.A0S;
        0JA.A08(AnonymousClass7TF.A1V(list), "Passed null outputs to renderpass remove");
        vgR.A02.removeAll(list);
        for (Object next : list) {
            if (next != null) {
                this.A0i.remove(next);
            }
        }
    }

    public final void A0M(List list) {
        ArrayList arrayList = this.A0S.A01;
        A0D((C344037rD) null, arrayList);
        C18658VwD vwD = this.A0M;
        vwD.A04(list);
        vwD.A05(arrayList);
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        for (X9O x9o : this.A0N.A02) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C368888tU B7P = x9o.B7P();
                C368858tR r1 = ((C368848tQ) it.next()).A04;
                if (r1 != null && C368858tR.A04.contains(B7P)) {
                    arrayList2.add(r1);
                }
            }
            x9o.Eho(arrayList2);
        }
        C344037rD r4 = this.A0a;
        A0D(r4, arrayList);
        A02();
        C371328y1.A01(r4, "RenderThreadManager", vwD.A01(), (long) hashCode());
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [X.X93, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v25, types: [java.lang.Object, X.V5Z] */
    public C18812W3v(C344227rW r11, C17553Va6 va6, C18658VwD vwD, WG9 wg9, WG9 wg92, C18633VvR vvR, C365438n7 r17, C365228mk r18, C365248mm r19, C344557s3 r20, C344037rD r21, C368938tZ r22, List list, int i) {
        float[] fArr = new float[16];
        this.A0l = fArr;
        this.A0M = vwD;
        this.A0Y = r18;
        this.A0X = r17;
        this.A0Z = r19;
        this.A0Q = wg9;
        this.A0K = r11;
        this.A0U = new C17849Vh2(this);
        this.A0W = vvR;
        this.A0R = wg92;
        this.A0i = Collections.newSetFromMap(new ConcurrentHashMap());
        this.A0P = new C17848Vh1(r20, r11.A00.CTO(78) ? 3 : 2);
        this.A0c = r22;
        this.A0V = new VLH();
        this.A06 = new C17953Vik();
        this.A01 = i;
        Matrix.setIdentityM(fArr, 0);
        C344037rD r4 = r21;
        this.A0a = r4;
        this.A0L = va6;
        this.A0A = null;
        this.A0H = 0;
        this.A05 = new Object();
        C17814VgR vgR = new C17814VgR();
        this.A0S = vgR;
        ArrayList arrayList = new ArrayList();
        this.A0e = arrayList;
        arrayList.add(vgR);
        this.A0d = new ArrayList();
        this.A0N = new C17904Vhv(r11, list);
        this.A0O = new Object();
        this.A0h = new HashMap();
        this.A0D = false;
        this.A0g = new ArrayList();
        this.A0I = 0;
        va6.A05 = true;
        r4.CjJ((long) hashCode(), "media_pipeline_start", "RenderThreadManager", (Map) null);
    }

    public static void A0A(C18812W3v w3v, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass8KU r3 = (AnonymousClass8KU) it.next();
            if (r3 != null) {
                ArrayList arrayList = w3v.A0f;
                if (arrayList.contains(r3)) {
                    r3.destroy();
                    if (r3 instanceof C365198mh) {
                        w3v.A0g.add(((C365198mh) r3).Bls());
                    }
                    arrayList.remove(r3);
                }
            }
        }
    }

    public static void A0B(C18812W3v w3v, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass8KU r3 = (AnonymousClass8KU) it.next();
            0JA.A08(AnonymousClass7TF.A1V(r3), "videoOutput cannot be null.");
            ArrayList arrayList = w3v.A0f;
            if (!arrayList.contains(r3)) {
                if (!w3v.A06.A01()) {
                    r3.CMW(w3v.A0Y, w3v.A0Z);
                }
                arrayList.add(r3);
                if (r3 instanceof C365198mh) {
                    w3v.A0g.add(((C365198mh) r3).Blr());
                }
            }
        }
    }

    public static void A0D(C344037rD r3, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C361868gx r1 = ((C368848tQ) it.next()).A05;
            if (r1 instanceof C361848gv) {
                ((C361848gv) r1).A0G(r3);
            }
        }
    }

    private boolean A0G(AnonymousClass8KU r3) {
        if (!r3.AFP() || r3.getWidth() <= 0 || r3.getHeight() <= 0 || this.A0i.contains(r3)) {
            return true;
        }
        return false;
    }
}
