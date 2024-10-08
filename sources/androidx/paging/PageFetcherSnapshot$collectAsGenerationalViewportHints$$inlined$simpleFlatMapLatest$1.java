package androidx.paging;

import X.0sK;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C60340gF;
import X.C62448Kfy;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0}, l = {232, 99}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv", "generationId"}, s = {"L$1", "L$2", "I$0"})
public final class PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 extends AnonymousClass1Ek implements 0sK {
    public int A00;
    public int A01;
    public Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ C62448Kfy A05;
    public final /* synthetic */ PageFetcherSnapshot A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(C62448Kfy kfy, PageFetcherSnapshot pageFetcherSnapshot, AnonymousClass4D7 r4) {
        super(3, r4);
        this.A06 = pageFetcherSnapshot;
        this.A05 = kfy;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        PageFetcherSnapshot pageFetcherSnapshot = this.A06;
        PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(this.A05, pageFetcherSnapshot, (AnonymousClass4D7) obj3);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.A03 = obj;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.A04 = obj2;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059 A[Catch:{ all -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064 A[SYNTHETIC, Splitter:B:15:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1Hj r4 = X.1Hj.A02
            int r0 = r11.A01
            r5 = 2
            r7 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0022
            if (r0 == r7) goto L_0x0011
            X.0eS.A00(r12)
        L_0x000e:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0011:
            int r6 = r11.A00
            java.lang.Object r8 = r11.A02
            X.136 r8 = (X.136) r8
            java.lang.Object r1 = r11.A04
            androidx.paging.PageFetcherSnapshotState$Holder r1 = (androidx.paging.PageFetcherSnapshotState$Holder) r1
            java.lang.Object r0 = r11.A03
            X.02o r2 = X.JTO.A1H(r0, r12)
            goto L_0x0046
        L_0x0022:
            X.0eS.A00(r12)
            java.lang.Object r2 = r11.A03
            X.02o r2 = (X.02o) r2
            java.lang.Object r0 = r11.A04
            int r6 = X.AnonymousClass7TE.A0M(r0)
            androidx.paging.PageFetcherSnapshot r0 = r11.A06
            androidx.paging.PageFetcherSnapshotState$Holder r1 = r0.A01
            X.136 r8 = r1.A01
            r11.A03 = r2
            r11.A04 = r1
            r11.A02 = r8
            r11.A00 = r6
            r11.A01 = r7
            java.lang.Object r0 = X.136.A00(r11, r8)
            if (r0 != r4) goto L_0x0046
            return r4
        L_0x0046:
            X.LGA r0 = r1.A00     // Catch:{ all -> 0x0098 }
            X.LGK r10 = r0.A03     // Catch:{ all -> 0x0098 }
            X.Kfy r9 = r11.A05     // Catch:{ all -> 0x0098 }
            X.KzI r1 = r10.A00(r9)     // Catch:{ all -> 0x0098 }
            X.Jjb r0 = X.C60332Jjb.A00     // Catch:{ all -> 0x0098 }
            boolean r1 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x0098 }
            r0 = 0
            if (r1 == 0) goto L_0x0064
            X.LFi[] r0 = new X.LFi[r0]     // Catch:{ all -> 0x0098 }
            X.0ic r1 = new X.0ic     // Catch:{ all -> 0x0098 }
            r1.<init>(r0, r5)     // Catch:{ all -> 0x0098 }
            r8.A05(r3)
            goto L_0x0089
        L_0x0064:
            X.KzI r0 = r10.A00(r9)     // Catch:{ all -> 0x0098 }
            boolean r0 = r0 instanceof X.C60333Jjc     // Catch:{ all -> 0x0098 }
            if (r0 != 0) goto L_0x0071
            X.Jjb r0 = X.C60332Jjb.A01     // Catch:{ all -> 0x0098 }
            r10.A02(r0, r9)     // Catch:{ all -> 0x0098 }
        L_0x0071:
            r8.A05(r3)
            androidx.paging.PageFetcherSnapshot r0 = r11.A06
            X.LBn r0 = r0.A00
            X.0V2 r1 = r0.A00(r9)
            if (r6 != 0) goto L_0x007f
            r7 = 0
        L_0x007f:
            X.0rg r0 = new X.0rg
            r0.<init>(r1, r7)
            X.MBv r1 = new X.MBv
            r1.<init>(r0, r6)
        L_0x0089:
            r11.A03 = r3
            r11.A04 = r3
            r11.A02 = r3
            r11.A01 = r5
            java.lang.Object r0 = X.AnonymousClass11O.A02(r11, r1, r2)
            if (r0 != r4) goto L_0x000e
            return r4
        L_0x0098:
            r0 = move-exception
            r8.A05(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
