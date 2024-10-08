package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Tu  reason: invalid class name */
public final class AnonymousClass9Tu implements C13861Tih, C344777sP {
    public static final Object A0b = new Object();
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public C345897uG A03;
    public B19 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public C13725Tfv A0B;
    public boolean A0C;
    public final int A0D;
    public final Context A0E;
    public final Handler A0F;
    public final C344477rv A0G;
    public final C344407ro A0H;
    public final C11354SOn A0I;
    public final B2V A0J;
    public final C41828B2j A0K;
    public final C7334Q4k A0L;
    public final Object A0M = new Object();
    public final Map A0N;
    public final Map A0O = AnonymousClass7TE.A1E();
    public final Map A0P = new ConcurrentHashMap();
    public final Handler A0Q;
    public final HandlerThread A0R;
    public final C365388n1 A0S;
    public final C345557ti A0T;
    public final AGo A0U;
    public final Object A0V;
    public final boolean A0W;
    public volatile MediaComposition A0X;
    public volatile Exception A0Y;
    public volatile boolean A0Z;
    public volatile boolean A0a;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void AQY(long r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            java.lang.String r0 = "ArFrameLiteRenderer.drawFrame()"
            X.C349257zq.A03(r0)     // Catch:{ all -> 0x01ce }
            java.util.Map r5 = r13.A0P     // Catch:{ all -> 0x01ce }
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x01ce }
            r3 = 1
            r1 = 0
            if (r0 != 0) goto L_0x0011
            r1 = 1
        L_0x0011:
            java.lang.String r0 = "init() hasn't been called yet!"
            X.0JA.A09(r1, r0)     // Catch:{ all -> 0x01ce }
            X.8n1 r1 = r13.A0S     // Catch:{ all -> 0x01ce }
            X.9Tv r1 = (X.C379419Tv) r1     // Catch:{ all -> 0x01ce }
            monitor-enter(r1)     // Catch:{ all -> 0x01ce }
            r1.A00 = r14     // Catch:{ all -> 0x01cb }
            monitor-exit(r1)     // Catch:{ all -> 0x01ce }
            java.util.Map r1 = r13.A0N     // Catch:{ all -> 0x01ce }
            if (r1 == 0) goto L_0x013e
            java.lang.String r0 = "ArFrameLiteRenderer.renderAsync()"
            X.C349257zq.A03(r0)     // Catch:{ all -> 0x01c6 }
            java.util.Set r0 = r1.entrySet()     // Catch:{ all -> 0x01c6 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x01c6 }
        L_0x002f:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x01c6 }
            if (r0 == 0) goto L_0x0125
            java.lang.Object r1 = r12.next()     // Catch:{ all -> 0x01c6 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x01c6 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ all -> 0x01c6 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01c6 }
            java.lang.Object r6 = r1.getValue()     // Catch:{ all -> 0x01c6 }
            X.ATn r6 = (X.C40147ATn) r6     // Catch:{ all -> 0x01c6 }
            java.lang.Object r4 = r5.get(r0)     // Catch:{ all -> 0x01c6 }
            X.8n5 r4 = (X.C365418n5) r4     // Catch:{ all -> 0x01c6 }
            r4.getClass()     // Catch:{ all -> 0x01c6 }
            boolean r0 = r13.A05     // Catch:{ all -> 0x01c6 }
            if (r0 != 0) goto L_0x0064
            X.7uG r2 = r13.A03     // Catch:{ all -> 0x01c6 }
            r2.getClass()     // Catch:{ all -> 0x01c6 }
            X.A8v r1 = r6.A02     // Catch:{ all -> 0x01c6 }
            monitor-enter(r1)     // Catch:{ all -> 0x01c6 }
            r1.A01 = r2     // Catch:{ all -> 0x013b }
            monitor-exit(r1)     // Catch:{ all -> 0x01c6 }
            X.8fr r0 = r6.A04     // Catch:{ all -> 0x01c6 }
            r0.ACn(r2)     // Catch:{ all -> 0x01c6 }
        L_0x0064:
            X.7uG r8 = r13.A03     // Catch:{ all -> 0x01c6 }
            X.7sz r2 = r4.B82()     // Catch:{ all -> 0x01c6 }
            java.lang.Object r4 = r6.A05     // Catch:{ InterruptedException -> 0x002f }
            monitor-enter(r4)     // Catch:{ InterruptedException -> 0x002f }
        L_0x006d:
            int r0 = r6.A00     // Catch:{ all -> 0x0122 }
            if (r0 < r3) goto L_0x0082
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.wait(r0)     // Catch:{ all -> 0x0122 }
            int r0 = r6.A00     // Catch:{ all -> 0x0122 }
            if (r0 < r3) goto L_0x006d
            java.lang.String r0 = "media pipeline rendering took too long :("
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0122 }
            r1.<init>(r0)     // Catch:{ all -> 0x0122 }
        L_0x0081:
            throw r1     // Catch:{ all -> 0x0122 }
        L_0x0082:
            int r0 = r0 + 1
            r6.A00 = r0     // Catch:{ all -> 0x0122 }
            X.A8v r10 = r6.A02     // Catch:{ all -> 0x0122 }
            monitor-enter(r10)     // Catch:{ all -> 0x0122 }
            X.7uG r0 = r10.A01     // Catch:{ all -> 0x011e }
            r0.getClass()     // Catch:{ all -> 0x011e }
            java.util.LinkedList r1 = r10.A03     // Catch:{ all -> 0x011e }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x00de
            X.7sq r11 = new X.7sq     // Catch:{ all -> 0x011e }
            r11.<init>()     // Catch:{ all -> 0x011e }
            java.lang.String r0 = "glBufferedInputInput"
            r11.A00 = r0     // Catch:{ all -> 0x011e }
            r9 = 0
            X.800 r1 = new X.800     // Catch:{ all -> 0x011e }
            r1.<init>(r9)     // Catch:{ all -> 0x011e }
            java.lang.String r0 = "glBufferedInputOutput"
            r1.A00 = r0     // Catch:{ all -> 0x011e }
            X.7ro r0 = r10.A02     // Catch:{ all -> 0x011e }
            X.7su r7 = new X.7su     // Catch:{ all -> 0x011e }
            r7.<init>(r0, r11, r1, r9)     // Catch:{ all -> 0x011e }
            X.7ss r0 = r2.CFP()     // Catch:{ all -> 0x011e }
            r0.getClass()     // Catch:{ all -> 0x011e }
            X.7ss r0 = r2.CFP()     // Catch:{ all -> 0x011e }
            int r9 = r0.A01     // Catch:{ all -> 0x011e }
            X.7ss r0 = r2.CFP()     // Catch:{ all -> 0x011e }
            int r1 = r0.A00     // Catch:{ all -> 0x011e }
            int r0 = r2.Awt()     // Catch:{ all -> 0x011e }
            r7.A03(r9, r1, r0)     // Catch:{ all -> 0x011e }
            X.7uG r0 = r10.A01     // Catch:{ all -> 0x011e }
            r7.ACn(r0)     // Catch:{ all -> 0x011e }
            int r0 = r10.A00     // Catch:{ all -> 0x011e }
            int r0 = r0 + 1
            r10.A00 = r0     // Catch:{ all -> 0x011e }
        L_0x00d5:
            long r0 = r2.C7X()     // Catch:{ all -> 0x011e }
            X.7sy r9 = r7.A0A     // Catch:{ all -> 0x011e }
            r9.A03 = r0     // Catch:{ all -> 0x011e }
            goto L_0x00e6
        L_0x00de:
            r0 = 0
            java.lang.Object r7 = r1.remove(r0)     // Catch:{ all -> 0x011e }
            X.7su r7 = (X.C345087su) r7     // Catch:{ all -> 0x011e }
            goto L_0x00d5
        L_0x00e6:
            monitor-exit(r10)     // Catch:{ all -> 0x0122 }
            X.8fr r0 = r6.A04     // Catch:{ all -> 0x0122 }
            r0.A00(r8, r2, r7)     // Catch:{ all -> 0x0122 }
            X.A39 r8 = r6.A03     // Catch:{ all -> 0x0122 }
            r0 = 37143(0x9117, float:5.2048E-41)
            r2 = 0
            long r0 = android.opengl.GLES30.glFenceSync(r0, r2)     // Catch:{ all -> 0x0122 }
            r8.A00 = r0     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "after gl fence"
            X.C345907uH.A02(r0, r1)     // Catch:{ all -> 0x0122 }
            long r1 = r8.A00     // Catch:{ all -> 0x0122 }
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0115
            android.opengl.GLES20.glFlush()     // Catch:{ all -> 0x0122 }
            java.util.List r0 = r6.A06     // Catch:{ all -> 0x0122 }
            r0.add(r7)     // Catch:{ all -> 0x0122 }
            r4.notifyAll()     // Catch:{ all -> 0x0122 }
            monitor-exit(r4)     // Catch:{ all -> 0x0122 }
            goto L_0x002f
        L_0x0115:
            java.lang.String r0 = "gl fence creation failed"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0122 }
            r1.<init>(r0)     // Catch:{ all -> 0x0122 }
            goto L_0x0081
        L_0x011e:
            r1 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0122 }
            goto L_0x0081
        L_0x0122:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0122 }
            throw r0     // Catch:{ InterruptedException -> 0x002f }
        L_0x0125:
            java.lang.Object r1 = r13.A0M     // Catch:{ all -> 0x01c6 }
            monitor-enter(r1)     // Catch:{ all -> 0x01c6 }
            int r0 = r13.A00     // Catch:{ all -> 0x0138 }
            int r0 = r0 + 1
            r13.A00 = r0     // Catch:{ all -> 0x0138 }
            monitor-exit(r1)     // Catch:{ all -> 0x0138 }
            r0 = 0
            r13.A00(r14, r0)     // Catch:{ all -> 0x01c6 }
            X.C349257zq.A01()     // Catch:{ all -> 0x01ce }
            goto L_0x01bf
        L_0x0138:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0138 }
            goto L_0x013d
        L_0x013b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01c6 }
        L_0x013d:
            throw r0     // Catch:{ all -> 0x01c6 }
        L_0x013e:
            java.lang.String r0 = "ArFrameLiteRenderer.renderSync()"
            X.C349257zq.A03(r0)     // Catch:{ IllegalStateException -> 0x01bc }
            java.lang.Object r2 = r13.A0M     // Catch:{ IllegalStateException -> 0x01bc }
            monitor-enter(r2)     // Catch:{ IllegalStateException -> 0x01bc }
        L_0x0146:
            boolean r0 = r13.A07     // Catch:{ all -> 0x01b9 }
            if (r0 != 0) goto L_0x01b4
            boolean r0 = r13.A08     // Catch:{ all -> 0x01b9 }
            r13.A00(r14, r0)     // Catch:{ all -> 0x01b9 }
            X.Q4k r0 = r13.A0L     // Catch:{ InterruptedException -> 0x019e }
            boolean r0 = r0.A05()     // Catch:{ InterruptedException -> 0x019e }
            if (r0 == 0) goto L_0x016f
            r6 = 0
        L_0x0159:
            int r0 = r13.A0D     // Catch:{ InterruptedException -> 0x019e }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x019e }
            r2.wait(r0)     // Catch:{ InterruptedException -> 0x019e }
            long r6 = r6 + r0
            boolean r0 = r13.A07     // Catch:{ InterruptedException -> 0x019e }
            if (r0 != 0) goto L_0x0175
            boolean r0 = r13.A0Z     // Catch:{ InterruptedException -> 0x019e }
            if (r0 != 0) goto L_0x0175
            r4 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0159
            goto L_0x0175
        L_0x016f:
            int r0 = r13.A0D     // Catch:{ InterruptedException -> 0x019e }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x019e }
            r2.wait(r0)     // Catch:{ InterruptedException -> 0x019e }
        L_0x0175:
            boolean r0 = r13.A07     // Catch:{ InterruptedException -> 0x019e }
            if (r0 != 0) goto L_0x0146
            java.lang.Exception r4 = r13.A0Y     // Catch:{ InterruptedException -> 0x019e }
            r0 = 0
            r13.A0Y = r0     // Catch:{ InterruptedException -> 0x019e }
            r1 = r4
            if (r4 == 0) goto L_0x0182
            goto L_0x018a
        L_0x0182:
            java.lang.String r0 = "ARFrameLiteRenderer render failed with timeout"
            X.TQA r1 = new X.TQA     // Catch:{ InterruptedException -> 0x019e }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x019e }
            goto L_0x019d
        L_0x018a:
            boolean r0 = r4 instanceof java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x019e }
            if (r0 != 0) goto L_0x019d
            java.lang.String r1 = "ARFrameLiteRenderer render failed with exception: "
            java.lang.String r0 = r4.getMessage()     // Catch:{ InterruptedException -> 0x019e }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ InterruptedException -> 0x019e }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x019e }
            r1.<init>(r0, r4)     // Catch:{ InterruptedException -> 0x019e }
        L_0x019d:
            throw r1     // Catch:{ InterruptedException -> 0x019e }
        L_0x019e:
            r1 = move-exception
            X.Q4k r0 = r13.A0L     // Catch:{ all -> 0x01b9 }
            boolean r0 = r0.A09()     // Catch:{ all -> 0x01b9 }
            if (r0 == 0) goto L_0x01b4
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x01b9 }
            r0.interrupt()     // Catch:{ all -> 0x01b9 }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x01b9 }
            r0.<init>(r1)     // Catch:{ all -> 0x01b9 }
            throw r0     // Catch:{ all -> 0x01b9 }
        L_0x01b4:
            r0 = 0
            r13.A07 = r0     // Catch:{ all -> 0x01b9 }
            monitor-exit(r2)     // Catch:{ all -> 0x01b9 }
            goto L_0x01bc
        L_0x01b9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01b9 }
            throw r0     // Catch:{ IllegalStateException -> 0x01bc }
        L_0x01bc:
            X.C349257zq.A01()     // Catch:{ all -> 0x01ce }
        L_0x01bf:
            r13.A05 = r3     // Catch:{ all -> 0x01ce }
            X.C349257zq.A01()     // Catch:{ all -> 0x01d3 }
            monitor-exit(r13)
            return
        L_0x01c6:
            r0 = move-exception
            X.C349257zq.A01()     // Catch:{ all -> 0x01ce }
            goto L_0x01cd
        L_0x01cb:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01ce }
        L_0x01cd:
            throw r0     // Catch:{ all -> 0x01ce }
        L_0x01ce:
            r0 = move-exception
            X.C349257zq.A01()     // Catch:{ all -> 0x01d3 }
            throw r0     // Catch:{ all -> 0x01d3 }
        L_0x01d3:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Tu.AQY(long):void");
    }

    public final void Ef8(Surface surface, C9608Rdm rdm, int i) {
        SJA sja;
        if (!this.A0K.CSv()) {
            C346027uT r5 = new C346027uT(surface, false);
            r5.A09 = 0;
            C11354SOn sOn = this.A0I;
            r5.A06 = (sOn.A0B + sOn.A05) % 360;
            C346037uU r4 = new C346037uU(this.A0H, r5);
            if ((sOn.A09 == 7 || ((sja = sOn.A0G) != null && sja.A01)) && this.A0L.A08()) {
                r4.A00 = 7;
                r4.A01 = 7;
            }
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            r4.A04 = -1;
            r4.A03 = -1;
            r4.A07 = timeUnit;
            r4.A0A = this.A0C;
            int i2 = 1;
            if (this.A0W) {
                i2 = 2;
            }
            r4.A02 = i2;
            this.A0O.put(0, r4);
            this.A0G.BQ8().A8c(r4, 0);
        }
    }

    public final void cancel() {
        this.A0Z = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: X.Q4k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: X.Q4k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: X.Q4k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9Tu(android.content.Context r18, android.opengl.EGLContext r19, X.C344557s3 r20, X.C345557ti r21, X.C11354SOn r22, com.facebook.videolite.transcoder.base.composition.MediaComposition r23, X.AGo r24, X.C7334Q4k r25, java.lang.Object r26) {
        /*
            r17 = this;
            r15 = r25
            r4 = r26
            r6 = r17
            r6.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r6.A0P = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r6.A0O = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r6.A0M = r0
            r0 = -1
            r6.A02 = r0
            r6.A01 = r0
            r2 = r24
            r6.A0U = r2
            if (r26 != 0) goto L_0x002a
            java.lang.Object r4 = A0b
        L_0x002a:
            r6.A0V = r4
            X.9w2 r0 = X.AGo.A01
            X.7ro r1 = X.C344407ro.A01
            java.util.Map r3 = r2.A00
            java.lang.Object r0 = r3.get(r0)
            if (r0 == 0) goto L_0x0039
            r1 = r0
        L_0x0039:
            X.7ro r1 = (X.C344407ro) r1
            r6.A0H = r1
            r0 = r18
            r6.A0E = r0
            r5 = r21
            r6.A0T = r5
            X.9Tv r0 = new X.9Tv
            r0.<init>()
            r6.A0S = r0
            r14 = r22
            r6.A0I = r14
            r0 = r23
            r6.A0X = r0
            if (r25 != 0) goto L_0x005b
            X.Q4k r15 = new X.Q4k
            r15.<init>()
        L_0x005b:
            r6.A0L = r15
            X.9w2 r2 = X.AGo.A05
            r0 = 60000(0xea60, float:8.4078E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r3.get(r2)
            if (r0 == 0) goto L_0x006d
            r1 = r0
        L_0x006d:
            int r0 = X.AnonymousClass7TE.A0M(r1)
            r6.A0D = r0
            X.9w2 r0 = X.AGo.A04
            r3.get(r0)
            X.9w2 r0 = X.AGo.A08
            java.lang.Object r0 = r3.get(r0)
            android.os.Handler r0 = (android.os.Handler) r0
            r2 = 0
            r8 = 0
            if (r0 == 0) goto L_0x0151
            r6.A0R = r2
            r6.A0Q = r0
        L_0x0088:
            X.9w2 r0 = X.AGo.A07
            java.lang.Object r9 = r3.get(r0)
            r9.getClass()
            X.B2V r9 = (X.B2V) r9
            r6.A0J = r9
            android.os.Handler r11 = r6.A0Q
            r0 = 5
            X.AR5 r12 = new X.AR5
            r12.<init>(r6, r0)
            r10 = r19
            r13 = r20
            r16 = r4
            X.B2j r7 = r9.AMn(r10, r11, r12, r13, r14, r15, r16)
            r6.A0K = r7
            r7.EIx()
            X.7rv r4 = r7.BQ7()
            r6.A0G = r4
            X.9Tw r0 = new X.9Tw
            r0.<init>(r6)
            r4.EiV(r0)
            android.os.Handler r0 = r4.getHandler()
            r6.A0F = r0
            X.9w2 r0 = X.AGo.A06
            java.lang.Object r0 = r3.get(r0)
            X.Tfv r0 = (X.C13725Tfv) r0
            r6.A0B = r0
            X.9w2 r0 = X.AGo.A02
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            r8 = r1
            java.lang.Object r0 = r3.get(r0)
            if (r0 == 0) goto L_0x00d8
            r1 = r0
        L_0x00d8:
            boolean r0 = X.AnonymousClass7TE.A1a(r1)
            r1 = 1
            if (r0 == 0) goto L_0x013d
            r6.A0C = r1
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r6.A0N = r0
            r5.getClass()
            X.7s4 r2 = r4.B9O()
            X.7ry r1 = r4.B9N()
            r1.getClass()
            X.ATb r0 = new X.ATb
            r0.<init>(r13, r5, r1, r2)
            r6.A03 = r0
        L_0x00fd:
            X.9w2 r0 = X.AGo.A03
            r1 = r8
            java.lang.Object r0 = r3.get(r0)
            if (r0 == 0) goto L_0x0107
            r1 = r0
        L_0x0107:
            boolean r0 = X.AnonymousClass7TE.A1a(r1)
            r6.A06 = r0
            X.9w2 r0 = X.AGo.A0A
            r1 = r8
            java.lang.Object r0 = r3.get(r0)
            if (r0 == 0) goto L_0x0117
            r1 = r0
        L_0x0117:
            boolean r0 = X.AnonymousClass7TE.A1a(r1)
            r6.A08 = r0
            X.9w2 r0 = X.AGo.A09
            r1 = r8
            java.lang.Object r0 = r3.get(r0)
            if (r0 == 0) goto L_0x0127
            r1 = r0
        L_0x0127:
            boolean r0 = X.AnonymousClass7TE.A1a(r1)
            r6.A0W = r0
            X.9w2 r0 = X.AGo.A0B
            java.lang.Object r0 = r3.get(r0)
            if (r0 == 0) goto L_0x0136
            r8 = r0
        L_0x0136:
            boolean r0 = X.AnonymousClass7TE.A1a(r8)
            r6.A09 = r0
            return
        L_0x013d:
            boolean r0 = r15.A05()
            if (r0 != 0) goto L_0x014a
            boolean r0 = r7.CSv()
            if (r0 != 0) goto L_0x014a
            r1 = 0
        L_0x014a:
            r6.A0C = r1
            r6.A0N = r2
            r6.A03 = r2
            goto L_0x00fd
        L_0x0151:
            X.9w2 r0 = X.AGo.A0C
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            java.lang.Object r0 = r3.get(r0)
            if (r0 == 0) goto L_0x015e
            r1 = r0
        L_0x015e:
            boolean r0 = X.AnonymousClass7TE.A1a(r1)
            if (r0 != 0) goto L_0x018b
            java.lang.String r1 = "AR-Frame-Lite-Renderer-Render-Thread-"
            int r0 = r6.hashCode()
            java.lang.String r1 = X.002.A0O(r1, r0)
            android.os.HandlerThread r0 = new android.os.HandlerThread
            r0.<init>(r1)
            X.AnonymousClass0fe.A00(r0)
            r6.A0R = r0
            r0.start()
            android.os.Looper r1 = r0.getLooper()
            r1.getClass()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
            r6.A0Q = r0
            goto L_0x0088
        L_0x018b:
            r6.A0R = r2
            r6.A0Q = r2
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Tu.<init>(android.content.Context, android.opengl.EGLContext, X.7s3, X.7ti, X.SOn, com.facebook.videolite.transcoder.base.composition.MediaComposition, X.AGo, X.Q4k, java.lang.Object):void");
    }

    private void A00(long j, boolean z) {
        if (this.A0N == null || this.A0G.AYr() >= 3) {
            this.A0G.EEu(Long.valueOf(j), z);
            return;
        }
        throw new RuntimeException("enableAsyncRendering can be only enabled for devices supporting open gl es 3");
    }

    public final void A8G(MediaEffect mediaEffect, int i) {
        this.A0F.post(new C40974AmK(mediaEffect, this));
    }

    public final void AAZ(int i) {
        this.A0F.post(new C40973AmJ(this, i));
    }

    public final void APj(int i, long j) {
        if (!this.A0C) {
            C349257zq.A03("ArFrameLiteRenderer.displayFrame()");
            try {
                synchronized (this.A0M) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    this.A0F.post(new AnonymousClass9W4(this, countDownLatch, j));
                    countDownLatch.await((long) this.A0D, TimeUnit.MILLISECONDS);
                }
            } catch (InterruptedException e) {
                try {
                    if (this.A0L.A09()) {
                        Thread.currentThread().interrupt();
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    C349257zq.A01();
                    throw th;
                }
            }
            C349257zq.A01();
        }
    }

    public final SurfaceTexture BHZ(int i, boolean z) {
        Map map = this.A0P;
        Integer valueOf = Integer.valueOf(i);
        0JA.A09(map.containsKey(valueOf), "init() hasn't been called yet!");
        try {
            Object obj = map.get(valueOf);
            obj.getClass();
            return ((C365398n2) ((C365418n5) obj).A09).A01(z);
        } catch (InterruptedException e) {
            if (!this.A0L.A09()) {
                return null;
            }
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [X.SrR, java.lang.Object] */
    public final synchronized void CMP() {
        C7232Q0d q0d;
        synchronized (this) {
            this.A0Z = false;
            this.A0a = false;
            HashMap A072 = this.A0X.A07(C266714aE.VIDEO);
            A072.getClass();
            Iterator A0s = AnonymousClass7TF.A0s(A072);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                C266754aI r1 = (C266754aI) AnonymousClass7TE.A1D(((C266794aM) A1J.getValue()).A04).get(0);
                File file = r1.A04;
                C266784aL.A05(file);
                boolean A012 = r1.A01(false);
                if (A012) {
                    try {
                        q0d = new Object().AU7(Uri.fromFile(file));
                    } catch (IOException e) {
                        th = new RuntimeException(e);
                        throw th;
                    }
                } else {
                    C13725Tfv tfv = this.A0B;
                    if (tfv != null) {
                        q0d = tfv.AU7(Uri.fromFile(file));
                    } else {
                        q0d = SRj.A02(this.A0E, Uri.fromFile(file).toString(), false);
                        q0d.getClass();
                    }
                }
                int i = q0d.A05;
                int i2 = i;
                boolean z = this.A06;
                if (z && i % 16 != 0) {
                    i2 = ((i / 16) * 16) + 16;
                }
                int i3 = q0d.A03;
                int i4 = i3;
                if (z && i3 % 16 != 0) {
                    i4 = ((i3 / 16) * 16) + 16;
                }
                int i5 = q0d.A04;
                C365368mz r15 = new C365368mz(i2, i4, i2, i4, i5, q0d.A02);
                Integer num = (Integer) A1J.getKey();
                boolean z2 = true;
                C365378n0 r14 = C365378n0.ENABLE;
                C365468nA r17 = C365468nA.A04;
                C365388n1 r11 = this.A0S;
                C7334Q4k q4k = this.A0L;
                C365398n2 r13 = new C365398n2(r14, r15, r11, r17, this.A0V, "ARFrameLiteRenderer", true, true, q4k.A0A(), A012, q4k.A0F());
                if (A012) {
                    z2 = false;
                }
                C365418n5 r10 = new C365418n5(r13, z2);
                r10.A0C.A00 = "transcoderVideoInput";
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append(i);
                A1A.append("x");
                A1A.append(i3);
                A1A.append(",");
                A1A.append("rotation:");
                A1A.append(i5);
                if (z && !(i % 16 == 0 && i3 % 16 == 0)) {
                    A1A.append(",multipleOf16FixEnabled:true");
                    r10.A03 = new RectF(0.0f, 0.0f, ((float) i) / ((float) i2), ((float) i3) / ((float) i4));
                }
                this.A0P.put(num, r10);
                Map map = this.A0N;
                if (map != null) {
                    map.put(num, new C40147ATn(this.A0H));
                }
                C344417rp r3 = this.A0H.A00;
                String obj = A1A.toString();
                synchronized (r3) {
                    try {
                        r3.A00.put("ARFrameLiteRenderer.inputMetadata", obj);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            }
            this.A0F.post(new C41121Aoh(this, this.A0P, this.A0N));
        }
    }

    public final void DKp(int i) {
        C365418n5 r0 = (C365418n5) this.A0P.get(Integer.valueOf(i));
        if (r0 != null) {
            C365398n2 r2 = (C365398n2) r0.A09;
            synchronized (r2.A07) {
                r2.A0I = true;
                r2.A00 = null;
            }
        }
    }

    public final void DVi() {
        if (this.A0A) {
            Iterator A0u = AnonymousClass7TF.A0u(this.A0O);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                this.A0G.BQ8().A8c((C345097sv) A1J.getValue(), AnonymousClass7TE.A0M(A1J.getKey()));
                this.A0A = false;
            }
        }
    }

    public final void DVj() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A0O);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            this.A0G.BQ8().EDi(AnonymousClass7TE.A0M(A1J.getKey()), A1J.getValue());
            this.A0A = true;
        }
    }

    public final void E4c(C344907sc r2) {
        C344777sP Blt = this.A0J.Blt();
        if (Blt != null) {
            Blt.E4c(r2);
        }
    }

    public final void E4d(C344907sc r2, C345237tA r3) {
        C344777sP Blt = this.A0J.Blt();
        if (Blt != null) {
            Blt.E4d(r2, r3);
        }
    }

    public final void EDZ(MediaEffect mediaEffect, int i) {
        this.A0F.post(new C40975AmL(mediaEffect, this));
    }

    public final Bitmap EK2(int i) {
        ArrayList arrayList;
        int i2;
        if (this.A0L.A0A()) {
            Handler handler = this.A0F;
            if (handler.getLooper() == Looper.myLooper()) {
                int i3 = this.A02;
                if (i3 <= 0) {
                    i3 = this.A0I.A0C;
                }
                int i4 = this.A01;
                if (i4 <= 0) {
                    i4 = this.A0I.A0A;
                }
                return AnonymousClass9UO.A00(i3, i4);
            }
            Bitmap[] bitmapArr = new Bitmap[1];
            arrayList = AnonymousClass7TE.A1C();
            synchronized (this.A0M) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                handler.post(new C41202Aq0(this, arrayList, countDownLatch, bitmapArr));
                countDownLatch.await((long) this.A0D, TimeUnit.MILLISECONDS);
            }
            i2 = 0;
            if (arrayList.isEmpty()) {
                Bitmap bitmap = bitmapArr[0];
                if (bitmap != null) {
                    return bitmap;
                }
                throw AnonymousClass7TE.A11("Bitmap is null");
            }
        } else {
            Bitmap[] bitmapArr2 = new Bitmap[1];
            arrayList = AnonymousClass7TE.A1C();
            synchronized (this.A0M) {
                CountDownLatch countDownLatch2 = new CountDownLatch(1);
                this.A0F.post(new C41203Aq1(this, arrayList, countDownLatch2, bitmapArr2));
                countDownLatch2.await((long) this.A0D, TimeUnit.MILLISECONDS);
            }
            i2 = 0;
            if (arrayList.isEmpty()) {
                Bitmap bitmap2 = bitmapArr2[0];
                if (bitmap2 != null) {
                    return bitmap2;
                }
                throw AnonymousClass7TE.A11("Bitmap is null");
            }
        }
        throw ((Throwable) arrayList.get(i2));
    }

    public final void FJk(int i, Bitmap bitmap) {
        C7334Q4k q4k = this.A0L;
        BHZ(i, false);
        Object obj = this.A0P.get(Integer.valueOf(i));
        obj.getClass();
        C365398n2 r2 = (C365398n2) ((C365418n5) obj).A09;
        if (q4k.A0A()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            try {
                this.A0F.post(new C41120Aog(bitmap, r2, countDownLatch));
                if (q4k.A05()) {
                    long j = 0;
                    do {
                        long j2 = (long) this.A0D;
                        countDownLatch.await(j2, TimeUnit.MILLISECONDS);
                        j += j2;
                        if (countDownLatch.getCount() <= 0 || this.A0Z || j >= 10000) {
                            return;
                        }
                        long j22 = (long) this.A0D;
                        countDownLatch.await(j22, TimeUnit.MILLISECONDS);
                        j += j22;
                        return;
                    } while (j >= 10000);
                    return;
                }
                countDownLatch.await((long) this.A0D, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            C346337v0 r0 = r2.A02;
            if (r0 != null) {
                GLES20.glBindTexture(3553, r0.A00);
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                GLES20.glFlush();
            }
        }
    }

    public final void FKX(C361238ft r3, int i) {
        Object obj = this.A0P.get(Integer.valueOf(i));
        obj.getClass();
        ((C365418n5) obj).B82().EZ2(r3);
    }

    public final void finalize() {
        HandlerThread handlerThread = this.A0R;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            try {
                handlerThread.join(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                if (this.A0L.A09()) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public final void flush() {
        if (this.A0N != null) {
            try {
                Object obj = this.A0M;
                synchronized (obj) {
                    int i = this.A00;
                    while (i > 0) {
                        obj.wait((long) this.A0D);
                        int i2 = this.A00;
                        if (i2 < i) {
                            i = i2;
                        } else {
                            throw AnonymousClass7TE.A15(002.A02(i, i2, "waiting for finishing render queue took too long :( ", " "));
                        }
                    }
                }
            } catch (InterruptedException e) {
                if (this.A0L.A09()) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public final void release() {
        Map map = this.A0N;
        if (map != null) {
            Iterator A0v = AnonymousClass7TF.A0v(map);
            while (A0v.hasNext()) {
                C40147ATn aTn = (C40147ATn) A0v.next();
                synchronized (aTn.A05) {
                    C345087su r1 = aTn.A01;
                    if (r1 != null) {
                        aTn.A02.A00(r1);
                        aTn.A01 = null;
                    }
                    for (C345087su A002 : aTn.A06) {
                        aTn.A02.A00(A002);
                    }
                    C39776A8v a8v = aTn.A02;
                    synchronized (a8v) {
                        try {
                            int i = a8v.A00;
                            LinkedList linkedList = a8v.A03;
                            0JA.A08(AnonymousClass7TF.A1S(i, linkedList.size()), 002.A02(i, linkedList.size(), "not all buffers were returned, we have a memory leak :(", " "));
                            Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                it.next();
                            }
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }
                    aTn.A04.detach();
                }
            }
        }
        if (this.A0L.A0C()) {
            Iterator A0u = AnonymousClass7TF.A0u(this.A0O);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                this.A0G.BQ8().EDi(AnonymousClass7TE.A0M(A1J.getKey()), A1J.getValue());
                this.A0A = true;
            }
        }
        this.A0K.destroy();
        this.A0a = true;
    }

    public final void EeS(B19 b19) {
        this.A04 = b19;
    }
}
