package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.instagram.realtimeclient.RealtimeMqttClientConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CancellationException;
import org.json.JSONException;
import org.webrtc.CameraCapturer;

/* renamed from: X.Snk  reason: case insensitive filesystem */
public final class C12139Snk implements 26E, C13838TiD {
    public Context A00;
    public Handler A01;
    public HandlerThread A02;
    public AnonymousClass25a A03;
    public C2596342l A04;
    public C2602044r A05;
    public AnonymousClass25T A06;
    public AnonymousClass451 A07;
    public C11267SIe A08;
    public ST2 A09;
    public AnonymousClass453 A0A;
    public C13577Td2 A0B;
    public C13803ThS A0C;
    public ST9 A0D;
    public boolean A0E;
    public volatile C8901REt A0F;
    public volatile Integer A0G;
    public volatile boolean A0H;

    public final void D5i() {
        A02(this, (C8901REt) null);
    }

    public final void D5k() {
        A02(this, (C8901REt) null);
    }

    public final void D7E() {
    }

    public final void DRj(C10938S1r s1r) {
    }

    private AnonymousClass46J A00(C8901REt rEt, String str) {
        Integer num = AnonymousClass05K.A0C;
        try {
            if (str.equals("CONNECTING")) {
                num = AnonymousClass05K.A00;
            } else if (str.equals("CONNECTED")) {
                num = AnonymousClass05K.A01;
            } else if (!str.equals("DISCONNECTED")) {
                throw AnonymousClass7TE.A0w(str);
            }
        } catch (IllegalArgumentException | NullPointerException unused) {
        }
        ST9 st9 = this.A0D;
        return new AnonymousClass46J(rEt, num, st9.A00, st9.A01);
    }

    private void A01() {
        if (!this.A0H) {
            throw AnonymousClass7TE.A15("You must call init() before calling this method");
        }
    }

    public static void A02(C12139Snk snk, C8901REt rEt) {
        Integer num;
        ST3 st3 = snk.A0D.A0w;
        if (st3 == null) {
            num = AnonymousClass05K.A0N;
        } else {
            num = st3.A0Y;
            if (num == null) {
                return;
            }
        }
        if (num != snk.A0G) {
            snk.A0G = num;
            if (num == AnonymousClass05K.A0N) {
                snk.A0F = rEt;
            }
            C11267SIe sIe = snk.A08;
            String A002 = C9561Rcy.A00(num);
            sIe.A01(A002);
            AnonymousClass25a r1 = snk.A03;
            if (r1 != null) {
                r1.onChannelStateChanged(snk.A00(rEt, A002));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [X.ThS, java.lang.Object, X.Sq7] */
    /* JADX WARNING: type inference failed for: r33v0, types: [X.Rd1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r34v0, types: [X.Rd2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r22v0, types: [X.Td0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r17v0, types: [X.Rcr, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r23v0, types: [X.Td0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r25v0, types: [X.Td0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v26, types: [X.3RQ, java.lang.Object] */
    public final synchronized void CMY(C2602044r r42) {
        synchronized (this) {
            if (!this.A0H) {
                C2602044r r3 = r42;
                this.A05 = r3;
                this.A00 = r3.A04;
                String str = r3.A08;
                this.A06 = r3.A06;
                this.A03 = r3.A05;
                this.A02 = Pxf.A0I("MqttThread");
                C2596342l r5 = this.A04;
                C2596242k r0 = (C2596242k) r5;
                QQC qqc = new QQC(this, ((C2596242k) r5).mMqttConnectionConfig, r0.mPreferredTier, r0.mPreferredSandbox);
                this.A07 = qqc;
                this.A0A = qqc.A00;
                C12258SqC sqC = new C12258SqC(str);
                C2596142j r1 = r3.A0A;
                ? obj = new Object();
                r1.getClass();
                obj.A00 = r1;
                this.A0C = obj;
                this.A02.start();
                this.A01 = Pxf.A0H(this.A02);
                boolean A1T = AnonymousClass7TF.A1T(new Random().nextInt(CameraCapturer.OPEN_CAMERA_TIMEOUT), 30);
                C12244Spy spy = new C12244Spy(this, 0);
                ST9 st9 = new ST9();
                C12243Spx spx = new C12243Spx(this, st9);
                C2601944q r15 = r3.A07;
                AnonymousClass3RV A022 = ((AnonymousClass3RX) AnonymousClass3RD.A00).A02();
                ? obj2 = new Object();
                ? obj3 = new Object();
                Context context = this.A00;
                Integer num = AnonymousClass05K.A0Y;
                C13803ThS thS = this.A0C;
                AnonymousClass451 r12 = this.A07;
                ? obj4 = new Object();
                Handler handler = this.A01;
                ? obj5 = new Object();
                C2596542n r10 = ((RealtimeMqttClientConfig) r5).mAnalyticsLogger;
                ? obj6 = new Object();
                C13578Td3 keepaliveParams = r5.getKeepaliveParams();
                C10743RxM rxM = new C10743RxM();
                ? obj7 = new Object();
                ? obj8 = new Object();
                obj8.A00 = A1T;
                C7861Qbl qbl = new C7861Qbl(obj8);
                C7861Qbl qbl2 = qbl;
                AnonymousClass3RV r20 = A022;
                C12243Spx spx2 = spx;
                C2596542n r16 = r10;
                Handler handler2 = handler;
                C10861RzM rzM = new C10861RzM(context, handler2, r16, obj5, qbl2, (C13893TjG) null, r20, spx2, obj4, obj6, spy, obj7, r12, thS, keepaliveParams, this, st9, sqC, rxM, obj2, obj3, r15, (C11165SDb) null, num, (Long) null, r3.A01, r5.getAppSpecificInfo());
                C10970S3c s3c = new C10970S3c();
                List list = r3.A09;
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A1C.add(new SubscribeTopic(AnonymousClass7TE.A18(it), 1));
                }
                s3c.A00(new C7861Qbl(new C10414Rrq(this.A00, A022)), rzM, A1C);
                this.A0D = s3c.A0O;
                this.A0B = s3c.A0K;
                this.A08 = s3c.A0C;
                this.A09 = s3c.A0D;
                boolean z = r3.A03;
                boolean z2 = r3.A02;
                st9.A0f = z;
                st9.A0e = z2;
                this.A0H = true;
            } else {
                throw AnonymousClass7TE.A15("This client has already been initialized");
            }
        }
    }

    public final void Cmh(int i) {
        C11026S6d s6d;
        Map map = this.A0D.A0O.A02;
        synchronized (map) {
            s6d = (C11026S6d) map.remove(Integer.valueOf(i));
        }
        if (s6d != null) {
            s6d.A01(new C241873Rq(AnonymousClass05K.A0u, "abort pending operation", new CancellationException()));
        }
    }

    public final void D5o(T9D t9d) {
        C8901REt rEt;
        if (t9d instanceof C7860Qbk) {
            rEt = null;
        } else {
            rEt = (C8901REt) t9d.A01();
        }
        A02(this, rEt);
    }

    public final void Dav(SBU sbu, Long l, String str, byte[] bArr, int i, long j) {
        A03(this, new TK6(this, sbu, str, bArr, j));
    }

    public final void EFn(long j, String str, boolean z) {
        A03(this, new C12864TBe(this));
    }

    public final boolean Ero() {
        if (!this.A0E) {
            return false;
        }
        if (this.A0B.Erp(AnonymousClass7TE.A1E())) {
            return true;
        }
        return false;
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x002f  */
    public final void FJd(boolean r10, boolean r11) {
        /*
            r9 = this;
            X.ST9 r5 = r9.A0D
            r6 = 0
            java.lang.Object r2 = r5.A0m
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r3 = r5.A0b     // Catch:{ all -> 0x0064 }
            boolean r0 = X.AnonymousClass7TF.A1Q(r10)
            boolean r1 = r3.compareAndSet(r0, r10)     // Catch:{ all -> 0x0064 }
            if (r1 == 0) goto L_0x001b
            r5.A0C()     // Catch:{ all -> 0x0064 }
            X.ST3 r0 = r5.A0w     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x001b
            monitor-enter(r0)     // Catch:{ all -> 0x0064 }
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
        L_0x001b:
            if (r11 != 0) goto L_0x0029
            if (r10 == 0) goto L_0x0024
            boolean r0 = r5.A0f     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x002b
            goto L_0x0029
        L_0x0024:
            boolean r0 = r5.A0e     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r8 = 0
            goto L_0x002c
        L_0x002b:
            r8 = 1
        L_0x002c:
            r7 = 0
            if (r1 == 0) goto L_0x0046
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x0064 }
            boolean r1 = r3.get()     // Catch:{ all -> 0x0064 }
            X.Td3 r0 = r5.A0K     // Catch:{ all -> 0x0064 }
            if (r1 == 0) goto L_0x003e
            r0 = 60
            goto L_0x0042
        L_0x003e:
            int r0 = r0.Aek()     // Catch:{ all -> 0x0064 }
        L_0x0042:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0064 }
        L_0x0046:
            java.util.Map r1 = r5.A0Z     // Catch:{ all -> 0x0064 }
            monitor-enter(r1)     // Catch:{ all -> 0x0064 }
            android.util.Pair r4 = r5.A05()     // Catch:{ all -> 0x0061 }
            if (r6 != 0) goto L_0x0054
            if (r7 != 0) goto L_0x0054
            if (r4 != 0) goto L_0x0054
            goto L_0x005e
        L_0x0054:
            java.util.concurrent.Executor r0 = r5.A0a     // Catch:{ all -> 0x0061 }
            X.TKC r3 = new X.TKC     // Catch:{ all -> 0x0061 }
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0061 }
            r0.execute(r3)     // Catch:{ all -> 0x0061 }
        L_0x005e:
            monitor-exit(r1)     // Catch:{ all -> 0x0061 }
            monitor-exit(r2)     // Catch:{ all -> 0x0064 }
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0061 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0064 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12139Snk.FJd(boolean, boolean):void");
    }

    public static void A03(C12139Snk snk, Runnable runnable) {
        if (Looper.myLooper() != snk.A01.getLooper()) {
            snk.A01.post(runnable);
        } else {
            runnable.run();
        }
    }

    public final C284755Nu BUN() {
        long j;
        A01();
        AnonymousClass46J A002 = A00(this.A0F, C9561Rcy.A00(this.A0G));
        ST2 st2 = this.A09;
        ST3 st3 = this.A0D.A0w;
        if (st3 == null || st3.A0Y != AnonymousClass05K.A0C) {
            j = 0;
        } else {
            j = Pxe.A0C(st3.A0V);
        }
        C7863Qbn A003 = ST2.A00(st2);
        C7865Qbp A012 = ST2.A01(st2, j);
        C7862Qbm qbm = (C7862Qbm) st2.A05(C7862Qbm.class);
        try {
            C9559Rcw.A00(st2.A00.A00(true), qbm, (C7866Qbq) st2.A05(C7866Qbq.class), A003, (C7864Qbo) null, A012, (C7867Qbr) st2.A05(C7867Qbr.class), (C7868Qbs) st2.A05(C7868Qbs.class), true, false).toString();
        } catch (JSONException unused) {
        }
        return new C284755Nu(A002);
    }

    public final void CfN() {
        A01();
        this.A01.post(new C12868TBi(this));
    }

    public final void E58(AnonymousClass46Z r5, AnonymousClass46Y r6, String str, byte[] bArr) {
        A01();
        str.getClass();
        bArr.getClass();
        r6.getClass();
        try {
            if (this.A0D.A04(new C12262SqG(r5, this, 0), Rd4.A00(r6.A00), str, bArr) != -1) {
                return;
            }
        } catch (C241873Rq unused) {
        }
        A03(this, new C12958TFr(r5, this));
    }

    public final int E5A(AnonymousClass46Z r12, AnonymousClass46Y r13, C13775Tgq tgq, String str, byte[] bArr) {
        C12262SqG sqG;
        int i;
        A01();
        String str2 = str;
        str.getClass();
        byte[] bArr2 = bArr;
        bArr2.getClass();
        r13.getClass();
        boolean z = true;
        int i2 = -1;
        try {
            ST9 st9 = this.A0D;
            Integer A002 = Rd4.A00(r13.A00);
            if (r12 == null) {
                sqG = null;
            } else {
                sqG = new C12262SqG(r12, this, 1);
            }
            T9D A062 = st9.A06(tgq, sqG, A002, str2, bArr2, st9.A0E.A00().A0L);
            if (A062 instanceof C7860Qbk) {
                i = -1;
            } else {
                i = ((C11026S6d) A062.A01()).A01;
                if (i != -1) {
                    z = false;
                }
            }
            i2 = i;
        } catch (C241873Rq unused) {
        }
        if (z && r12 != null) {
            A03(this, new C12957TFq(r12, this));
        }
        return i2;
    }

    public final void destroy() {
        A01();
        this.A01.post(new C12867TBh(this));
    }

    public final void start() {
        A01();
        this.A01.post(new C12865TBf(this));
    }

    public final void stop() {
        A01();
        this.A01.post(new C12866TBg(this));
    }
}
