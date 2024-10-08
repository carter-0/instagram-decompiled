package com.facebook.commonavatarliveediting;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4CZ;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.MTM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.commonavatarliveediting.PrefetchQueue$tickCache$1", f = "PrefetchQueue.kt", i = {0, 0, 1, 1, 1}, l = {188, 351, 225}, m = "invokeSuspend", n = {"requestId", "qplInstanceKey", "requestId", "$this$withLock_u24default$iv", "qplInstanceKey"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
public final class PrefetchQueue$tickCache$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ PrefetchQueue A07;
    public final /* synthetic */ MTM A08;
    public final /* synthetic */ AnonymousClass4CZ A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrefetchQueue$tickCache$1(PrefetchQueue prefetchQueue, MTM mtm, AnonymousClass4D7 r4, AnonymousClass4CZ r5, int i) {
        super(2, r4);
        this.A07 = prefetchQueue;
        this.A06 = i;
        this.A08 = mtm;
        this.A09 = r5;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.commonavatarliveediting.PrefetchQueue$tickCache$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        return new PrefetchQueue$tickCache$1(this.A07, this.A08, r8, this.A09, this.A06);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r7v0, types: [com.facebook.commonavatarliveediting.PrefetchQueue$tickCache$1, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0231, code lost:
        if (r7.A07.A02.get() != false) goto L_0x0233;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x008b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0090 A[Catch:{ all -> 0x0250 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            r31 = this;
            r2 = r32
            X.1Hj r6 = X.1Hj.A02
            r7 = r31
            int r1 = r7.A02
            r24 = 3
            r23 = 2
            r22 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0226
            r0 = r22
            if (r1 == r0) goto L_0x0060
            r0 = r23
            if (r1 == r0) goto L_0x004c
            X.0eS.A00(r2)
        L_0x001c:
            com.facebook.commonavatarliveediting.PrefetchQueue r1 = r7.A07
            java.util.concurrent.atomic.AtomicInteger r0 = r1.A03
            int r0 = r0.get()
            if (r0 <= 0) goto L_0x0233
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.A02
            r0 = r22
            r2.set(r0)
            java.util.UUID r0 = X.C16772V5f.A00()
            java.lang.String r11 = X.DbT.A10(r0)
            int r4 = r11.hashCode()
            X.ULy r2 = r1.A00
            r7.A03 = r11
            r7.A04 = r1
            r7.A00 = r4
            r0 = r22
            r7.A02 = r0
            java.lang.Object r2 = com.facebook.commonavatarliveediting.PrefetchQueue.A00(r1, r2, r7)
            if (r2 != r6) goto L_0x006d
            return r6
        L_0x004c:
            int r1 = r7.A01
            int r4 = r7.A00
            java.lang.Object r8 = r7.A05
            com.facebook.commonavatarliveediting.PrefetchQueue r8 = (com.facebook.commonavatarliveediting.PrefetchQueue) r8
            java.lang.Object r3 = r7.A04
            X.136 r3 = (X.136) r3
            java.lang.Object r11 = r7.A03
            java.lang.String r11 = (java.lang.String) r11
            X.0eS.A00(r2)
            goto L_0x008c
        L_0x0060:
            int r4 = r7.A00
            java.lang.Object r1 = r7.A04
            com.facebook.commonavatarliveediting.PrefetchQueue r1 = (com.facebook.commonavatarliveediting.PrefetchQueue) r1
            java.lang.Object r11 = r7.A03
            java.lang.String r11 = (java.lang.String) r11
            X.0eS.A00(r2)
        L_0x006d:
            X.ULy r2 = (X.C15055ULy) r2
            r1.A00 = r2
            com.facebook.commonavatarliveediting.PrefetchQueue r8 = r7.A07
            X.136 r3 = r8.A04
            int r1 = r7.A06
            r7.A03 = r11
            r7.A04 = r3
            r7.A05 = r8
            r7.A00 = r4
            r7.A01 = r1
            r0 = r23
            r7.A02 = r0
            java.lang.Object r0 = X.136.A00(r7, r3)
            if (r0 != r6) goto L_0x008c
            return r6
        L_0x008c:
            com.facebook.quicklog.QuickPerformanceLogger r0 = X.VJT.A00     // Catch:{ all -> 0x0250 }
            if (r0 == 0) goto L_0x024a
            r2 = 231948284(0xdd33ffc, float:1.3019283E-30)
            r0.markerStart(r2, r4)     // Catch:{ all -> 0x0250 }
            java.lang.Integer r21 = new java.lang.Integer     // Catch:{ all -> 0x0250 }
            r0 = r21
            r0.<init>(r1)     // Catch:{ all -> 0x0250 }
            X.ULy r0 = r8.A00     // Catch:{ all -> 0x0250 }
            java.lang.Object r13 = r0.A01     // Catch:{ all -> 0x0250 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x0250 }
            java.lang.Object r1 = r0.A02     // Catch:{ all -> 0x0250 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0250 }
            X.Uwt r0 = X.C16546Uwt.TOP     // Catch:{ all -> 0x0250 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0250 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0250 }
            if (r0 == 0) goto L_0x0132
            int r1 = r0.intValue()     // Catch:{ all -> 0x0250 }
        L_0x00b5:
            java.lang.Integer r20 = new java.lang.Integer     // Catch:{ all -> 0x0250 }
            r0 = r20
            r0.<init>(r1)     // Catch:{ all -> 0x0250 }
            X.ULy r0 = r8.A00     // Catch:{ all -> 0x0250 }
            java.lang.Object r1 = r0.A02     // Catch:{ all -> 0x0250 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0250 }
            X.Uwt r0 = X.C16546Uwt.NEED_SOON     // Catch:{ all -> 0x0250 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0250 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0250 }
            if (r0 == 0) goto L_0x0130
            int r1 = r0.intValue()     // Catch:{ all -> 0x0250 }
        L_0x00d0:
            java.lang.Integer r19 = new java.lang.Integer     // Catch:{ all -> 0x0250 }
            r0 = r19
            r0.<init>(r1)     // Catch:{ all -> 0x0250 }
            X.ULy r0 = r8.A00     // Catch:{ all -> 0x0250 }
            java.lang.Object r1 = r0.A02     // Catch:{ all -> 0x0250 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0250 }
            X.Uwt r0 = X.C16546Uwt.LOW     // Catch:{ all -> 0x0250 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0250 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0250 }
            if (r0 == 0) goto L_0x012e
            int r1 = r0.intValue()     // Catch:{ all -> 0x0250 }
        L_0x00eb:
            java.lang.Integer r18 = new java.lang.Integer     // Catch:{ all -> 0x0250 }
            r0 = r18
            r0.<init>(r1)     // Catch:{ all -> 0x0250 }
            X.ULy r8 = r8.A00     // Catch:{ all -> 0x0250 }
            java.lang.Object r12 = r8.A05     // Catch:{ all -> 0x0250 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0250 }
            java.lang.Object r10 = r8.A06     // Catch:{ all -> 0x0250 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x0250 }
            java.lang.Object r1 = r8.A03     // Catch:{ all -> 0x0250 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0250 }
            java.lang.Object r0 = r8.A04     // Catch:{ all -> 0x0250 }
            r17 = r0
            r0 = r17
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0250 }
            r17 = r0
            java.lang.Object r0 = r8.A07     // Catch:{ all -> 0x0250 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0250 }
            java.lang.Object r9 = r8.A08     // Catch:{ all -> 0x0250 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x0250 }
            r8 = 0
            com.facebook.quicklog.QuickPerformanceLogger r15 = X.VJT.A00     // Catch:{ all -> 0x0250 }
            if (r15 == 0) goto L_0x0244
            java.lang.String r16 = "quickPerformanceLogger"
            if (r11 == 0) goto L_0x0120
            java.lang.String r14 = "request_id"
            r15.markerAnnotate(r2, r4, r14, r11)     // Catch:{ all -> 0x0250 }
        L_0x0120:
            com.facebook.quicklog.QuickPerformanceLogger r15 = X.VJT.A00     // Catch:{ all -> 0x0250 }
            if (r15 == 0) goto L_0x023c
            int r11 = r21.intValue()     // Catch:{ all -> 0x0250 }
            java.lang.String r14 = "batch_size"
            r15.markerAnnotate(r2, r4, r14, r11)     // Catch:{ all -> 0x0250 }
            goto L_0x0134
        L_0x012e:
            r1 = 0
            goto L_0x00eb
        L_0x0130:
            r1 = 0
            goto L_0x00d0
        L_0x0132:
            r1 = 0
            goto L_0x00b5
        L_0x0134:
            if (r13 == 0) goto L_0x0143
            com.facebook.quicklog.QuickPerformanceLogger r14 = X.VJT.A00     // Catch:{ all -> 0x0250 }
            if (r14 == 0) goto L_0x023c
            int r13 = r13.intValue()     // Catch:{ all -> 0x0250 }
            java.lang.String r11 = "native_queue_size"
            r14.markerAnnotate(r2, r4, r11, r13)     // Catch:{ all -> 0x0250 }
        L_0x0143:
            com.facebook.quicklog.QuickPerformanceLogger r14 = X.VJT.A00     // Catch:{ all -> 0x0250 }
            if (r14 == 0) goto L_0x023c
            int r13 = r20.intValue()     // Catch:{ all -> 0x0250 }
            java.lang.String r11 = "top_priority_native_queue_size"
            r14.markerAnnotate(r2, r4, r11, r13)     // Catch:{ all -> 0x0250 }
            com.facebook.quicklog.QuickPerformanceLogger r14 = X.VJT.A00     // Catch:{ all -> 0x0250 }
            if (r14 == 0) goto L_0x023c
            int r13 = r19.intValue()     // Catch:{ all -> 0x0250 }
            java.lang.String r11 = "medium_priority_native_queue_size"
            r14.markerAnnotate(r2, r4, r11, r13)     // Catch:{ all -> 0x0250 }
            com.facebook.quicklog.QuickPerformanceLogger r14 = X.VJT.A00     // Catch:{ all -> 0x0250 }
            if (r14 == 0) goto L_0x023c
            int r13 = r18.intValue()     // Catch:{ all -> 0x0250 }
            java.lang.String r11 = "low_priority_native_queue_size"
            r14.markerAnnotate(r2, r4, r11, r13)     // Catch:{ all -> 0x0250 }
            if (r12 == 0) goto L_0x017d
            com.facebook.quicklog.QuickPerformanceLogger r25 = X.VJT.A00     // Catch:{ all -> 0x0250 }
            if (r25 == 0) goto L_0x023c
            long r29 = r12.longValue()     // Catch:{ all -> 0x0250 }
            java.lang.String r28 = "time_in_native_queue_avg"
            r26 = r2
            r27 = r4
            r25.markerAnnotate(r26, r27, r28, r29)     // Catch:{ all -> 0x0250 }
        L_0x017d:
            if (r10 == 0) goto L_0x0190
            com.facebook.quicklog.QuickPerformanceLogger r25 = X.VJT.A00     // Catch:{ all -> 0x0250 }
            if (r25 == 0) goto L_0x023c
            long r29 = r10.longValue()     // Catch:{ all -> 0x0250 }
            java.lang.String r28 = "time_in_native_queue_p90"
            r26 = r2
            r27 = r4
            r25.markerAnnotate(r26, r27, r28, r29)     // Catch:{ all -> 0x0250 }
        L_0x0190:
            if (r1 == 0) goto L_0x019f
            com.facebook.quicklog.QuickPerformanceLogger r11 = X.VJT.A00     // Catch:{ all -> 0x0250 }
            if (r11 == 0) goto L_0x023c
            java.lang.String[] r10 = X.DbU.A1b(r1, r8)     // Catch:{ all -> 0x0250 }
            java.lang.String r1 = "surface_types"
            r11.markerAnnotate(r2, r4, r1, r10)     // Catch:{ all -> 0x0250 }
        L_0x019f:
            if (r17 == 0) goto L_0x01ae
            com.facebook.quicklog.QuickPerformanceLogger r11 = X.VJT.A00     // Catch:{ all -> 0x0250 }
            if (r11 == 0) goto L_0x023c
            int[] r10 = X.00k.A0x(r17)     // Catch:{ all -> 0x0250 }
            java.lang.String r1 = "surface_types_count"
            r11.markerAnnotate(r2, r4, r1, r10)     // Catch:{ all -> 0x0250 }
        L_0x01ae:
            if (r0 == 0) goto L_0x01bd
            com.facebook.quicklog.QuickPerformanceLogger r10 = X.VJT.A00     // Catch:{ all -> 0x0250 }
            if (r10 == 0) goto L_0x023c
            java.lang.String[] r1 = X.DbU.A1b(r0, r8)     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = "triggers"
            r10.markerAnnotate(r2, r4, r0, r1)     // Catch:{ all -> 0x0250 }
        L_0x01bd:
            if (r9 == 0) goto L_0x01cc
            com.facebook.quicklog.QuickPerformanceLogger r10 = X.VJT.A00     // Catch:{ all -> 0x0250 }
            if (r10 == 0) goto L_0x023c
            int[] r1 = X.00k.A0x(r9)     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = "triggers_count"
            r10.markerAnnotate(r2, r4, r0, r1)     // Catch:{ all -> 0x0250 }
        L_0x01cc:
            r3.A05(r5)
            com.facebook.commonavatarliveediting.PrefetchQueue r11 = r7.A07
            java.util.concurrent.atomic.AtomicInteger r13 = r11.A03
            int r14 = r13.get()
            int r0 = r7.A06
            if (r14 <= r0) goto L_0x01dc
            r14 = r0
        L_0x01dc:
            X.MTM r10 = r7.A08
            r0 = r10
            com.facebook.commonavatarliveediting.CdlProviderImpl r0 = (com.facebook.commonavatarliveediting.CdlProviderImpl) r0
            X.L7W r12 = r0.A00
            if (r12 == 0) goto L_0x01fb
            X.LNu r9 = r12.A01
            java.lang.String r3 = "tick_cache_start"
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "numToPrefetch"
            r1.put(r0, r14)
            X.LNu.A00(r9, r3, r1)
            com.facebook.cdl.native.ContentDeliveryLibrary r0 = r12.A00
            r0.tickCache(r14)
        L_0x01fb:
            int r0 = -r14
            r13.addAndGet(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A02
            r0.set(r8)
            com.facebook.quicklog.QuickPerformanceLogger r1 = X.VJT.A00
            if (r1 == 0) goto L_0x0236
            r0 = r23
            r1.markerEnd(r2, r4, r0)
            X.4CZ r2 = r7.A09
            r7.A03 = r5
            r7.A04 = r5
            r7.A05 = r5
            r0 = r24
            r7.A02 = r0
            r1 = 4
            X.JTw r0 = new X.JTw
            r0.<init>(r11, r10, r5, r1)
            java.lang.Object r0 = X.1Eo.A00(r7, r2, r0)
            if (r0 != r6) goto L_0x001c
            return r6
        L_0x0226:
            X.0eS.A00(r2)
            com.facebook.commonavatarliveediting.PrefetchQueue r0 = r7.A07
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A02
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x001c
        L_0x0233:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0236:
            X.V1p r0 = new X.V1p
            r0.<init>()
            throw r0
        L_0x023c:
            X.0qQ.A0F(r16)     // Catch:{ all -> 0x0250 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0     // Catch:{ all -> 0x0250 }
        L_0x0244:
            X.V1p r0 = new X.V1p     // Catch:{ all -> 0x0250 }
            r0.<init>()     // Catch:{ all -> 0x0250 }
            throw r0     // Catch:{ all -> 0x0250 }
        L_0x024a:
            X.V1p r0 = new X.V1p     // Catch:{ all -> 0x0250 }
            r0.<init>()     // Catch:{ all -> 0x0250 }
            throw r0     // Catch:{ all -> 0x0250 }
        L_0x0250:
            r0 = move-exception
            r3.A05(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.commonavatarliveediting.PrefetchQueue$tickCache$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PrefetchQueue$tickCache$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
