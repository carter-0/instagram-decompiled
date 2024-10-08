package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SsW  reason: case insensitive filesystem */
public final class C12382SsW implements C13727Tfx {
    public AtomicReference A00;
    public final C11286SJe A01;
    public final C11284SJc A02;
    public final Integer A03;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.RQK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.RQK, java.lang.Object] */
    public final void D5I(String str, int i, Map map) {
        AtomicReference atomicReference = this.A00;
        STT stt = (STT) atomicReference.get();
        if (stt != null) {
            int intValue = this.A03.intValue();
            if (intValue == 0) {
                ? obj = new Object();
                obj.A00 = str;
                STT.A03(obj, stt);
            } else if (intValue == 2) {
                ? obj2 = new Object();
                obj2.A00 = str;
                STT.A02(obj2, stt);
            } else if (intValue == 1) {
                C10746RxQ rxQ = stt.A0C.A03;
                long j = rxQ.A01;
                C13886Tj9 tj9 = rxQ.A03;
                C9596Rda.A00(tj9, (Exception) null, "media_upload_chunk_receive_reqeust_success", rxQ.A04, C13886Tj9.A00(tj9, j));
                C11284SJc sJc = this.A02;
                if (sJc != null) {
                    C11286SJe sJe = this.A01;
                    if (sJe != null) {
                        STT.A01(sJe, sJc, stt);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            atomicReference.set((Object) null);
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void DEh(java.lang.Exception r13, java.util.Map r14, int r15, boolean r16) {
        /*
            r12 = this;
            r6 = 0
            r4 = 1
            java.util.concurrent.atomic.AtomicReference r3 = r12.A00
            java.lang.Object r5 = r3.get()
            r2 = r5
            X.STT r2 = (X.STT) r2
            if (r2 == 0) goto L_0x003a
            java.lang.Integer r0 = r12.A03
            int r1 = r0.intValue()
            r7 = r13
            if (r1 == r6) goto L_0x0051
            r0 = 2
            if (r1 == r0) goto L_0x003b
            if (r1 != r4) goto L_0x0036
            X.RxR r0 = r2.A0C
            X.RxQ r4 = r0.A03
            long r0 = r4.A01
            X.Tj9 r6 = r4.A03
            long r10 = X.C13886Tj9.A00(r6, r0)
            java.lang.String r8 = "media_upload_chunk_receive_request_failure"
            java.util.Map r9 = r4.A04
            X.C9596Rda.A00(r6, r7, r8, r9, r10)
            X.SJc r0 = r12.A02
            if (r0 == 0) goto L_0x006b
            X.STT.A04(r0, r2, r13, r14, r15)
        L_0x0036:
            r0 = 0
            r3.set(r0)
        L_0x003a:
            return
        L_0x003b:
            monitor-enter(r5)
            X.RxR r0 = r2.A0C     // Catch:{ all -> 0x0070 }
            X.RxQ r4 = r0.A03     // Catch:{ all -> 0x0070 }
            long r0 = r4.A00     // Catch:{ all -> 0x0070 }
            X.Tj9 r6 = r4.A03     // Catch:{ all -> 0x0070 }
            long r10 = X.C13886Tj9.A00(r6, r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r8 = "media_post_failure"
            java.util.Map r9 = r4.A04     // Catch:{ all -> 0x0070 }
            X.C9596Rda.A00(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0070 }
            goto L_0x0066
        L_0x0051:
            monitor-enter(r5)
            X.RxR r0 = r2.A0C     // Catch:{ all -> 0x0070 }
            X.RxQ r4 = r0.A03     // Catch:{ all -> 0x0070 }
            long r0 = r4.A02     // Catch:{ all -> 0x0070 }
            X.Tj9 r6 = r4.A03     // Catch:{ all -> 0x0070 }
            long r10 = X.C13886Tj9.A00(r6, r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r8 = "media_upload_init_failure"
            java.util.Map r9 = r4.A04     // Catch:{ all -> 0x0070 }
            X.C9596Rda.A00(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0070 }
        L_0x0066:
            X.STT.A05(r2, r13, r14, r15)     // Catch:{ all -> 0x0070 }
            monitor-exit(r5)
            goto L_0x0036
        L_0x006b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0070:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12382SsW.DEh(java.lang.Exception, java.util.Map, int, boolean):void");
    }

    public C12382SsW(C11286SJe sJe, C11284SJc sJc, STT stt, Integer num) {
        this.A03 = num;
        this.A02 = sJc;
        this.A01 = sJe;
        this.A00 = new AtomicReference(stt);
    }
}
