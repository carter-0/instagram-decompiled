package X;

import android.os.Process;
import com.facebook.proxygen.TraceFieldType;
import java.util.Random;

/* renamed from: X.XwH  reason: case insensitive filesystem */
public class C22152XwH implements YA7 {
    public static String A04;
    public Y9E A00;
    public Y9F A01;
    public Y9G A02;
    public Y9H A03;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void DR7(java.lang.Object r12, java.util.concurrent.ScheduledExecutorService r13, int r14) {
        /*
            r11 = this;
            r3 = r11
            boolean r0 = r11 instanceof X.C21181XIa
            if (r0 == 0) goto L_0x003d
            r2 = r11
            X.XIa r2 = (X.C21181XIa) r2
            monitor-enter(r3)
            r0 = 5
            if (r14 == r0) goto L_0x0019
            r0 = 6
            if (r14 != r0) goto L_0x0041
            java.util.concurrent.ScheduledFuture r1 = r2.A00     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0041
            r0 = 1
            r1.cancel(r0)     // Catch:{ all -> 0x0043 }
            r0 = 0
            goto L_0x003a
        L_0x0019:
            if (r12 == 0) goto L_0x0041
            X.XTy r12 = (X.C21301XTy) r12     // Catch:{ all -> 0x0043 }
            java.util.concurrent.ScheduledFuture r1 = r2.A00     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0028
            r0 = 1
            r1.cancel(r0)     // Catch:{ all -> 0x0043 }
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x0043 }
        L_0x0028:
            boolean r0 = r12.A03     // Catch:{ all -> 0x0043 }
            X.Y2R r5 = new X.Y2R     // Catch:{ all -> 0x0043 }
            r5.<init>(r2, r0)     // Catch:{ all -> 0x0043 }
            long r6 = r12.A00     // Catch:{ all -> 0x0043 }
            long r8 = r12.A01     // Catch:{ all -> 0x0043 }
            java.util.concurrent.TimeUnit r10 = r12.A02     // Catch:{ all -> 0x0043 }
            r4 = r13
            java.util.concurrent.ScheduledFuture r0 = r4.scheduleAtFixedRate(r5, r6, r8, r10)     // Catch:{ all -> 0x0043 }
        L_0x003a:
            r2.A00 = r0     // Catch:{ all -> 0x0043 }
            goto L_0x0041
        L_0x003d:
            monitor-enter(r3)
            r11.A00(r14)     // Catch:{ all -> 0x0043 }
        L_0x0041:
            monitor-exit(r3)
            return
        L_0x0043:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22152XwH.DR7(java.lang.Object, java.util.concurrent.ScheduledExecutorService, int):void");
    }

    public final void A00(int i) {
        String str;
        String str2;
        String str3;
        Y9F y9f = this.A01;
        ((C22162XwR) y9f).A00 = 0xI.A01("mobile_memory_metrics", (String) null);
        C22162XwR xwR = (C22162XwR) y9f;
        C60640iu r5 = xwR.A01;
        0xI r0 = xwR.A00;
        if (r0 == null) {
            throw AnonymousClass7TE.A0y();
        } else if (r5.CSp(r0)) {
            this.A02.reportTo(this.A00.BSt(), y9f);
            boolean z = !14i.A08();
            0xI r1 = xwR.A00;
            if (r1 != null) {
                r1.A09(TraceFieldType.IsForeground, Boolean.valueOf(z));
                switch (i) {
                    case 1:
                        str = "EVENT_FOREGROUND";
                        break;
                    case 2:
                        str = "EVENT_BACKGROUND";
                        break;
                    case 3:
                        str = "EVENT_PERIODIC_FOREGROUND";
                        break;
                    case 4:
                        str = "EVENT_NAVIGATION";
                        break;
                    case 5:
                        str = "EVENT_START_PERIODIC";
                        break;
                    case 6:
                        str = "EVENT_STOP_PERIODIC";
                        break;
                    case 7:
                        str = "EVENT_START_DEBUG";
                        break;
                    case 8:
                        str = "EVENT_STOP_DEBUG";
                        break;
                    default:
                        str = "EVENT_PERIODIC_BACKGROUND";
                        break;
                }
                y9f.A7h("memory_event_type", str);
                synchronized (this) {
                    str2 = A04;
                    if (str2 == null) {
                        str2 = 002.A0g(Integer.toString(Process.myPid()), "_", Integer.toString(new Random().nextInt(1000000)));
                        A04 = str2;
                    }
                }
                y9f.A7h(Dbo.A00(), str2);
                y9f.A7h(AnonymousClass000.A00(4490), 0LA.A01());
                if (0LA.A04 == null) {
                    str3 = "";
                } else {
                    str3 = 0LA.A04.A03;
                }
                y9f.A7h("navigation_module", str3);
                long elapsedCpuTime = Process.getElapsedCpuTime();
                0xI r12 = xwR.A00;
                if (r12 != null) {
                    r12.A0B("elapsed_cpu_time_ms", Long.valueOf(elapsedCpuTime));
                    0xI r02 = xwR.A00;
                    if (r02 != null) {
                        r5.EFq(r02);
                        xwR.A00 = null;
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
                throw AnonymousClass7TE.A0y();
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final boolean Esn(int i, Object obj) {
        boolean z = this instanceof C21181XIa;
        boolean CUY = this.A03.CUY();
        if (z) {
            if (!CUY) {
                return false;
            }
            if (i == 5 || i == 6) {
                return true;
            }
            return false;
        } else if (!CUY) {
            return false;
        } else {
            if (i == 1 || i == 2) {
                return true;
            }
            return false;
        }
    }
}
