package com.instagram.appinitializer.reliability;

import X.02m;
import X.0LA;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import android.os.Process;
import android.os.SystemClock;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.appinitializer.reliability.MessageQueueTimelineInitializer$start$2$1", f = "MessageQueueTimelineInitializer.kt", i = {0, 0, 0, 0, 0, 0}, l = {183}, m = "invokeSuspend", n = {"$this$launch", "wasCancelled", "$this$invokeSuspend_u24lambda_u247", "messageQueue", "instance", "startElapsedCpuTimeMs"}, s = {"L$0", "L$1", "L$4", "L$5", "I$0", "J$0"})
public final class MessageQueueTimelineInitializer$start$2$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public long A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public /* synthetic */ Object A08;
    public final /* synthetic */ MessageQueueTimelineInitializer A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageQueueTimelineInitializer$start$2$1(MessageQueueTimelineInitializer messageQueueTimelineInitializer, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A09 = messageQueueTimelineInitializer;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.appinitializer.reliability.MessageQueueTimelineInitializer$start$2$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        ? messageQueueTimelineInitializer$start$2$1 = new MessageQueueTimelineInitializer$start$2$1(this.A09, r4);
        messageQueueTimelineInitializer$start$2$1.A08 = obj;
        return messageQueueTimelineInitializer$start$2$1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: X.0r1} */
    /* JADX WARNING: type inference failed for: r12v0, types: [com.instagram.appinitializer.reliability.MessageQueueTimelineInitializer$start$2$1, X.4D7] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            X.1Hj r11 = X.1Hj.A02
            r12 = r24
            int r0 = r12.A01
            r10 = 694559645(0x2966239d, float:5.110115E-14)
            if (r0 == 0) goto L_0x0028
            long r3 = r12.A02
            int r6 = r12.A00
            java.lang.Object r2 = r12.A07
            android.os.MessageQueue r2 = (android.os.MessageQueue) r2
            java.lang.Object r5 = r12.A06
            X.02m r5 = (X.02m) r5
            java.lang.Object r9 = r12.A05
            com.instagram.appinitializer.reliability.MessageQueueTimelineInitializer r9 = (com.instagram.appinitializer.reliability.MessageQueueTimelineInitializer) r9
            java.lang.Object r8 = r12.A03
            X.0r1 r8 = (X.0r1) r8
            java.lang.Object r7 = r12.A08
            X.4Cq r7 = (X.C262224Cq) r7
            X.0eS.A00(r25)     // Catch:{ CancellationException -> 0x01c1 }
            goto L_0x0177
        L_0x0028:
            X.0eS.A00(r25)
            java.lang.Object r7 = r12.A08
            X.4Cq r7 = (X.C262224Cq) r7
        L_0x002f:
            boolean r0 = X.19E.A07(r7)
            if (r0 == 0) goto L_0x020c
            com.instagram.appinitializer.reliability.MessageQueueTimelineInitializer r9 = r12.A09
            java.util.concurrent.atomic.AtomicInteger r0 = r9.A03
            int r6 = r0.incrementAndGet()
            X.0r1 r8 = new X.0r1
            r8.<init>()
            X.0eM r0 = r9.A08
            java.lang.Object r5 = r0.getValue()
            X.02m r5 = (X.02m) r5
            long r3 = android.os.Process.getElapsedCpuTime()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.MessageQueue r2 = r0.getQueue()
            X.0qQ.A07(r2)
            r17 = 0
            r0 = r17
            r5.markerStart(r10, r6, r0)     // Catch:{ CancellationException -> 0x01c1 }
            java.lang.String r1 = "start_endpoint"
            java.lang.String r0 = X.0LA.A00()     // Catch:{ CancellationException -> 0x01c1 }
            r5.markerAnnotate(r10, r6, r1, r0)     // Catch:{ CancellationException -> 0x01c1 }
            java.lang.String r1 = "asl_session_id"
            java.lang.String r0 = X.0LA.A01()     // Catch:{ CancellationException -> 0x01c1 }
            r5.markerAnnotate(r10, r6, r1, r0)     // Catch:{ CancellationException -> 0x01c1 }
            java.lang.String r1 = "start_is_foreground"
            boolean r0 = X.0LA.A07()     // Catch:{ CancellationException -> 0x01c1 }
            r5.markerAnnotate(r10, r6, r1, r0)     // Catch:{ CancellationException -> 0x01c1 }
            java.lang.String r21 = "start_uptime_ms"
            long r22 = android.os.SystemClock.uptimeMillis()     // Catch:{ CancellationException -> 0x01c1 }
            r19 = r10
            r20 = r6
            r18 = r5
            r18.markerAnnotate(r19, r20, r21, r22)     // Catch:{ CancellationException -> 0x01c1 }
            monitor-enter(r2)     // Catch:{ CancellationException -> 0x01c1 }
            X.0eM r0 = r9.A07     // Catch:{ all -> 0x01be }
            r18 = r0
            java.lang.Object r14 = r18.getValue()     // Catch:{ all -> 0x01be }
            X.4pO r14 = (X.C274974pO) r14     // Catch:{ all -> 0x01be }
            if (r14 == 0) goto L_0x00e1
            r16 = 0
            java.util.HashMap r13 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x01be }
            monitor-enter(r2)     // Catch:{ all -> 0x01be }
            java.lang.reflect.Field r0 = r14.A00     // Catch:{ all -> 0x00a7 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x00a7 }
            android.os.Message r0 = (android.os.Message) r0     // Catch:{ all -> 0x00a7 }
            goto L_0x00a9
        L_0x00a7:
            r0 = r16
        L_0x00a9:
            if (r0 == 0) goto L_0x00df
            android.os.Handler r15 = r0.getTarget()     // Catch:{ all -> 0x01ba }
            if (r15 == 0) goto L_0x00d6
            java.lang.Runnable r1 = r0.getCallback()     // Catch:{ all -> 0x01ba }
            if (r1 == 0) goto L_0x00d1
            java.lang.Class r15 = r1.getClass()     // Catch:{ all -> 0x01ba }
        L_0x00bb:
            java.lang.Object r1 = r13.get(r15)     // Catch:{ all -> 0x01ba }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x01ba }
            if (r1 != 0) goto L_0x00c7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x01ba }
        L_0x00c7:
            int r1 = r1.intValue()     // Catch:{ all -> 0x01ba }
            int r1 = r1 + 1
            X.C66581MXm.A1S(r15, r13, r1)     // Catch:{ all -> 0x01ba }
            goto L_0x00d6
        L_0x00d1:
            java.lang.Class r15 = r15.getClass()     // Catch:{ all -> 0x01ba }
            goto L_0x00bb
        L_0x00d6:
            java.lang.reflect.Field r1 = r14.A01     // Catch:{ all -> 0x00a7 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00a7 }
            android.os.Message r0 = (android.os.Message) r0     // Catch:{ all -> 0x00a7 }
            goto L_0x00a9
        L_0x00df:
            monitor-exit(r2)     // Catch:{ all -> 0x01ba }
            goto L_0x00e2
        L_0x00e1:
            r13 = 0
        L_0x00e2:
            java.lang.String r14 = "start_queue_length_with_delayed"
            if (r13 == 0) goto L_0x0104
            java.util.Set r0 = r13.entrySet()     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x0104
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x01be }
            r1 = 0
        L_0x00f1:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = X.C51971G9r.A0p(r15)     // Catch:{ all -> 0x01be }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x01be }
            int r0 = X.AnonymousClass7TE.A0M(r0)     // Catch:{ all -> 0x01be }
            int r1 = r1 + r0
            goto L_0x00f1
        L_0x0104:
            r1 = -1
        L_0x0105:
            r5.markerAnnotate(r10, r6, r14, r1)     // Catch:{ all -> 0x01be }
            java.lang.String r1 = "start_queue_length"
            java.lang.Object r0 = r18.getValue()     // Catch:{ all -> 0x01be }
            X.4pO r0 = (X.C274974pO) r0     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x0133
            int r0 = r0.A00(r2)     // Catch:{ all -> 0x01be }
        L_0x0116:
            r5.markerAnnotate(r10, r6, r1, r0)     // Catch:{ all -> 0x01be }
            java.lang.String r1 = "start_is_idle"
            boolean r0 = r2.isIdle()     // Catch:{ all -> 0x01be }
            r5.markerAnnotate(r10, r6, r1, r0)     // Catch:{ all -> 0x01be }
            java.lang.String r16 = "most_queued_msg"
            if (r13 == 0) goto L_0x014b
            java.util.Set r1 = r13.entrySet()     // Catch:{ all -> 0x01be }
            if (r1 == 0) goto L_0x014b
            r0 = r17
            java.util.List r1 = X.C73429PcU.A00(r1, r0)     // Catch:{ all -> 0x01be }
            goto L_0x0135
        L_0x0133:
            r0 = -1
            goto L_0x0116
        L_0x0135:
            if (r1 == 0) goto L_0x014b
            r0 = 3
            java.util.List r15 = X.00k.A0d(r1, r0)     // Catch:{ all -> 0x01be }
            if (r15 == 0) goto L_0x014b
            java.lang.String r14 = ",\n"
            java.lang.String r13 = "{"
            java.lang.String r1 = "}"
            X.PnZ r0 = X.C74008PnZ.A00     // Catch:{ all -> 0x01be }
            java.lang.String r1 = X.00k.A0P(r14, r13, r1, r15, r0)     // Catch:{ all -> 0x01be }
            goto L_0x014d
        L_0x014b:
            java.lang.String r1 = "none"
        L_0x014d:
            r0 = r16
            r5.markerAnnotate(r10, r6, r0, r1)     // Catch:{ all -> 0x01be }
            monitor-exit(r2)     // Catch:{ CancellationException -> 0x01c1 }
            X.0eM r0 = r9.A05     // Catch:{ CancellationException -> 0x01c1 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ CancellationException -> 0x01c1 }
            X.30M r0 = (X.AnonymousClass30M) r0     // Catch:{ CancellationException -> 0x01c1 }
            long r0 = r0.A00     // Catch:{ CancellationException -> 0x01c1 }
            r12.A08 = r7     // Catch:{ CancellationException -> 0x01c1 }
            r12.A03 = r8     // Catch:{ CancellationException -> 0x01c1 }
            r12.A04 = r5     // Catch:{ CancellationException -> 0x01c1 }
            r12.A05 = r9     // Catch:{ CancellationException -> 0x01c1 }
            r12.A06 = r5     // Catch:{ CancellationException -> 0x01c1 }
            r12.A07 = r2     // Catch:{ CancellationException -> 0x01c1 }
            r12.A00 = r6     // Catch:{ CancellationException -> 0x01c1 }
            r12.A02 = r3     // Catch:{ CancellationException -> 0x01c1 }
            r13 = 1
            r12.A01 = r13     // Catch:{ CancellationException -> 0x01c1 }
            java.lang.Object r0 = X.C241603Pv.A02(r12, r0)     // Catch:{ CancellationException -> 0x01c1 }
            if (r0 != r11) goto L_0x0177
            goto L_0x01bd
        L_0x0177:
            A00(r5, r6, r3)
            monitor-enter(r2)
            java.lang.String r1 = "end_queue_length_with_delayed"
            X.0eM r3 = r9.A07     // Catch:{ all -> 0x0209 }
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x0209 }
            X.4pO r0 = (X.C274974pO) r0     // Catch:{ all -> 0x0209 }
            if (r0 == 0) goto L_0x01ab
            int r0 = r0.A01(r2)     // Catch:{ all -> 0x0209 }
        L_0x018b:
            r5.markerAnnotate(r10, r6, r1, r0)     // Catch:{ all -> 0x0209 }
            java.lang.String r1 = "end_queue_length"
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x0209 }
            X.4pO r0 = (X.C274974pO) r0     // Catch:{ all -> 0x0209 }
            if (r0 == 0) goto L_0x01a9
            int r0 = r0.A00(r2)     // Catch:{ all -> 0x0209 }
        L_0x019c:
            r5.markerAnnotate(r10, r6, r1, r0)     // Catch:{ all -> 0x0209 }
            java.lang.String r1 = "end_is_idle"
            boolean r0 = r2.isIdle()     // Catch:{ all -> 0x0209 }
            r5.markerAnnotate(r10, r6, r1, r0)     // Catch:{ all -> 0x0209 }
            goto L_0x01ad
        L_0x01a9:
            r0 = -1
            goto L_0x019c
        L_0x01ab:
            r0 = -1
            goto L_0x018b
        L_0x01ad:
            monitor-exit(r2)
            boolean r1 = r8.A00
            r0 = 2
            if (r1 == 0) goto L_0x01b5
            r0 = 630(0x276, float:8.83E-43)
        L_0x01b5:
            r5.markerEnd(r10, r6, r0)
            goto L_0x002f
        L_0x01ba:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ all -> 0x01be }
        L_0x01bd:
            return r11
        L_0x01be:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ CancellationException -> 0x01c1 }
            throw r0     // Catch:{ CancellationException -> 0x01c1 }
        L_0x01c1:
            r1 = move-exception
            r0 = 1
            r8.A00 = r0     // Catch:{ all -> 0x01c6 }
            throw r1     // Catch:{ all -> 0x01c6 }
        L_0x01c6:
            r7 = move-exception
            A00(r5, r6, r3)
            monitor-enter(r2)
            java.lang.String r1 = "end_queue_length_with_delayed"
            X.0eM r3 = r9.A07     // Catch:{ all -> 0x0209 }
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x0209 }
            X.4pO r0 = (X.C274974pO) r0     // Catch:{ all -> 0x0209 }
            if (r0 == 0) goto L_0x01fb
            int r0 = r0.A01(r2)     // Catch:{ all -> 0x0209 }
        L_0x01db:
            r5.markerAnnotate(r10, r6, r1, r0)     // Catch:{ all -> 0x0209 }
            java.lang.String r1 = "end_queue_length"
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x0209 }
            X.4pO r0 = (X.C274974pO) r0     // Catch:{ all -> 0x0209 }
            if (r0 == 0) goto L_0x01f9
            int r0 = r0.A00(r2)     // Catch:{ all -> 0x0209 }
        L_0x01ec:
            r5.markerAnnotate(r10, r6, r1, r0)     // Catch:{ all -> 0x0209 }
            java.lang.String r1 = "end_is_idle"
            boolean r0 = r2.isIdle()     // Catch:{ all -> 0x0209 }
            r5.markerAnnotate(r10, r6, r1, r0)     // Catch:{ all -> 0x0209 }
            goto L_0x01fd
        L_0x01f9:
            r0 = -1
            goto L_0x01ec
        L_0x01fb:
            r0 = -1
            goto L_0x01db
        L_0x01fd:
            monitor-exit(r2)
            boolean r1 = r8.A00
            r0 = 2
            if (r1 == 0) goto L_0x0205
            r0 = 630(0x276, float:8.83E-43)
        L_0x0205:
            r5.markerEnd(r10, r6, r0)
            throw r7
        L_0x0209:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x020c:
            X.0gF r11 = X.C60340gF.A00
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.appinitializer.reliability.MessageQueueTimelineInitializer$start$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static void A00(02m r6, int i, long j) {
        02m r2 = r6;
        int i2 = i;
        r6.markerAnnotate(694559645, i, "end_endpoint", 0LA.A00());
        r6.markerAnnotate(694559645, i, "end_is_foreground", 0LA.A07());
        r2.markerAnnotate(694559645, i2, "elapsed_cpu_time_delta_ms", Process.getElapsedCpuTime() - j);
        r2.markerAnnotate(694559645, i2, "end_uptime_ms", SystemClock.uptimeMillis());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MessageQueueTimelineInitializer$start$2$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
