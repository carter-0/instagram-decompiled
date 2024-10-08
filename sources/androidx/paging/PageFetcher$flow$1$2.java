package androidx.paging;

import X.0sK;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", i = {0, 1, 1}, l = {73, 77}, m = "invokeSuspend", n = {"previousGeneration", "previousGeneration", "pagingSource"}, s = {"L$0", "L$0", "L$1"})
public final class PageFetcher$flow$1$2 extends AnonymousClass1Ek implements 0sK {
    public int A00;
    public Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ PageFetcher A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1$2(PageFetcher pageFetcher, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A03 = pageFetcher;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [androidx.paging.PageFetcher$flow$1$2, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r7.A01 == null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r2 == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        r1 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r1 == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r1.A01 == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        r7 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        r5 = r6.A05(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (X.C62914KoS.A00 == null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (X.JTO.A1b(3) != true) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        r1 = X.AnonymousClass7TE.A1A();
        r1.append("Refresh key ");
        r1.append(r5);
        X.0qQ.A0B(X.AnonymousClass7TG.A0m(r6, " returned from PagingSource ", r1), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0065, code lost:
        if (r2 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        r2.A00.A07.AG7((java.util.concurrent.CancellationException) null);
        r2.A02.AG7((java.util.concurrent.CancellationException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r7 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0094, code lost:
        if (r7 != null) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            r7 = r11
            X.1Hj r6 = X.1Hj.A02
            int r0 = r10.A00
            r5 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0097
            if (r0 == r4) goto L_0x00b3
            java.lang.Object r6 = r10.A01
            androidx.paging.PagingSource r6 = (androidx.paging.PagingSource) r6
            java.lang.Object r2 = r10.A02
            X.L5l r2 = (X.C63753L5l) r2
            X.0eS.A00(r11)
        L_0x0017:
            X.LFt r7 = (X.C63967LFt) r7
            if (r7 == 0) goto L_0x0023
            java.util.List r0 = r7.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0032
        L_0x0023:
            if (r2 == 0) goto L_0x0094
            X.LFt r1 = r2.A01
            if (r1 == 0) goto L_0x0094
            java.util.List r0 = r1.A02
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r4) goto L_0x0094
            r7 = r1
        L_0x0032:
            java.lang.Integer r0 = r7.A01
            if (r0 != 0) goto L_0x0041
        L_0x0036:
            if (r2 == 0) goto L_0x0091
            X.LFt r1 = r2.A01
            if (r1 == 0) goto L_0x0091
            java.lang.Integer r0 = r1.A01
            if (r0 == 0) goto L_0x0091
            r7 = r1
        L_0x0041:
            java.lang.Object r5 = r6.A05(r7)
            X.MPb r0 = X.C62914KoS.A00
            if (r0 == 0) goto L_0x0065
            r0 = 3
            boolean r0 = X.JTO.A1b(r0)
            if (r0 != r4) goto L_0x0065
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Refresh key "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " returned from PagingSource "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r6, r0, r1)
            X.0qQ.A0B(r0, r4)
        L_0x0065:
            if (r2 == 0) goto L_0x0073
            androidx.paging.PageFetcherSnapshot r0 = r2.A00
            X.19G r0 = r0.A07
            r0.AG7(r3)
            X.4Co r0 = r2.A02
            r0.AG7(r3)
        L_0x0073:
            androidx.paging.PageFetcher r1 = r10.A03
            androidx.paging.PagingConfig r5 = r1.A02
            X.LNp r0 = r1.A01
            X.0r6 r9 = r0.A00
            r0 = 0
            X.MIW r8 = new X.MIW
            r8.<init>(r1, r0)
            androidx.paging.PageFetcherSnapshot r4 = new androidx.paging.PageFetcherSnapshot
            r4.<init>(r5, r6, r7, r8, r9)
            X.19G r0 = new X.19G
            r0.<init>(r3)
            X.L5l r6 = new X.L5l
            r6.<init>(r4, r7, r0)
        L_0x0090:
            return r6
        L_0x0091:
            if (r7 != 0) goto L_0x0041
            goto L_0x0065
        L_0x0094:
            if (r7 == 0) goto L_0x0036
            goto L_0x0032
        L_0x0097:
            X.0eS.A00(r11)
            java.lang.Object r2 = r10.A02
            X.L5l r2 = (X.C63753L5l) r2
            androidx.paging.PageFetcher r1 = r10.A03
            if (r2 == 0) goto L_0x00b1
            androidx.paging.PageFetcherSnapshot r0 = r2.A00
            androidx.paging.PagingSource r0 = r0.A03
        L_0x00a6:
            r10.A02 = r2
            r10.A00 = r4
            java.lang.Object r7 = androidx.paging.PageFetcher.A00(r1, r0, r10)
            if (r7 != r6) goto L_0x00ba
            return r6
        L_0x00b1:
            r0 = r3
            goto L_0x00a6
        L_0x00b3:
            java.lang.Object r2 = r10.A02
            X.L5l r2 = (X.C63753L5l) r2
            X.0eS.A00(r11)
        L_0x00ba:
            androidx.paging.PagingSource r7 = (androidx.paging.PagingSource) r7
            if (r2 == 0) goto L_0x00d0
            androidx.paging.PageFetcherSnapshot r0 = r2.A00
            r10.A02 = r2
            r10.A01 = r7
            r10.A00 = r5
            java.lang.Object r0 = r0.A08(r10)
            if (r0 == r6) goto L_0x0090
            r6 = r7
            r7 = r0
            goto L_0x0017
        L_0x00d0:
            r6 = r7
            r7 = r3
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$flow$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        PageFetcher$flow$1$2 pageFetcher$flow$1$2 = new PageFetcher$flow$1$2(this.A03, (AnonymousClass4D7) obj3);
        pageFetcher$flow$1$2.A02 = obj;
        return pageFetcher$flow$1$2.invokeSuspend(C60340gF.A00);
    }
}
