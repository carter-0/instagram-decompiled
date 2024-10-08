package X;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class Q3F {
    public final /* synthetic */ AnonymousClass6RD A00;
    public final /* synthetic */ Q3E A01;
    public final /* synthetic */ Q39 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Executor A05;
    public final /* synthetic */ 0sP A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public final void A01(C7305Q3h q3h, Throwable th) {
        Throwable th2 = th;
        0qQ.A0B(th2, 0);
        AnonymousClass6RD r5 = this.A00;
        Map map = r5.A03;
        String str = this.A04;
        Object obj = map.get(str);
        if (obj != null) {
            Set set = (Set) obj;
            map.remove(str);
            Q39 q39 = this.A02;
            Q3K q3k = q39.A01;
            Q3K q3k2 = Q3K.FETCH;
            if (q3k == q3k2 || !set.contains(q3k2)) {
                this.A06.invoke(new R9Q(q3h, str, th2));
                return;
            }
            String str2 = this.A03;
            r5.A00(new Q39(q3k2, q39.A02, q39.A03, q39.A00), str, str2, this.A05, this.A06, this.A07);
            return;
        }
        throw AnonymousClass7TE.A0z("Invalid state: Active queries have been cleaned up, but requests still in flight");
    }

    public Q3F(AnonymousClass6RD r1, Q3E q3e, Q39 q39, String str, String str2, Executor executor, 0sP r7, boolean z, boolean z2) {
        this.A01 = q3e;
        this.A00 = r1;
        this.A04 = str;
        this.A02 = q39;
        this.A07 = z;
        this.A08 = z2;
        this.A06 = r7;
        this.A03 = str2;
        this.A05 = executor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, X.Rwl] */
    /* JADX WARNING: type inference failed for: r13v4, types: [X.T9F, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v15, types: [X.If1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v1 */
    /* JADX WARNING: type inference failed for: r15v2, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r15v10 */
    /* JADX WARNING: type inference failed for: r15v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x045b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        X.1zE.A00(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0461, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0136, code lost:
        if (r4.A00 != null) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0047, code lost:
        if (r2.length() == 0) goto L_0x0049;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C7305Q3h r36, java.lang.String r37, java.util.List r38) {
        /*
            r35 = this;
            r24 = 1
            r26 = r38
            r1 = r24
            r0 = r26
            X.0qQ.A0B(r0, r1)
            r23 = 0
            r5 = r35
            X.Q3E r3 = r5.A01
            X.6RD r0 = r5.A00
            r34 = r0
            X.6Qo r0 = r0.A01
            r25 = r0
            long r1 = r25.currentMonotonicTimestamp()
            java.lang.String r0 = "request_end"
            r3.A00(r0, r1)
            java.util.Map r0 = r3.A02
            java.util.Map r2 = X.0Yt.A0B(r0)
            java.util.Map r0 = r3.A01
            java.util.Map r1 = X.0Yt.A0B(r0)
            X.R9P r0 = new X.R9P
            r0.<init>(r2, r1)
            r1 = r36
            X.Q3h[] r0 = new X.C7305Q3h[]{r1, r0}
            X.Q3h r22 = X.C7306Q3i.A00(r0)
            r2 = r37
            if (r37 == 0) goto L_0x0049
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x004a
        L_0x0049:
            r0 = 1
        L_0x004a:
            r21 = 0
            java.lang.String r4 = "ComponentQueryParser"
            if (r0 == 0) goto L_0x01ca
            java.lang.String r0 = "Expected a valid component query response but found empty"
            X.1Kn.A02(r0, r4)
            X.Q3p r1 = new X.Q3p
            r1.<init>()
            r0 = r21
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)
        L_0x0060:
            java.lang.Object r0 = r1.A00
            X.Q40 r0 = (X.Q40) r0
            java.lang.Object r13 = r1.A01
            if (r0 != 0) goto L_0x00a2
            java.lang.String r3 = r5.A04
            java.lang.String r0 = "Expected a valid component query response but found empty"
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r0)
            X.Q3h r13 = (X.C7305Q3h) r13
            r0 = r22
            X.Q3h[] r0 = new X.C7305Q3h[]{r0, r13}
            X.Q3h r1 = X.C7306Q3i.A00(r0)
            X.R9Q r0 = new X.R9Q
            r0.<init>(r1, r3, r2)
            java.util.List r12 = X.AnonymousClass7TE.A1I(r0)
        L_0x0085:
            r0 = r34
            java.util.Map r1 = r0.A03
            java.lang.String r0 = r5.A04
            r1.remove(r0)
            X.0sP r2 = r5.A06
            java.util.Iterator r1 = r12.iterator()
        L_0x0094:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0476
            java.lang.Object r0 = r1.next()
            r2.invoke(r0)
            goto L_0x0094
        L_0x00a2:
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.List r11 = r0.A00
            X.Q39 r10 = r5.A02
            boolean r9 = r5.A07
            boolean r8 = r5.A08
            java.util.Iterator r17 = r11.iterator()
        L_0x00b2:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0085
            java.lang.Object r2 = r17.next()
            X.Q3z r2 = (X.C7323Q3z) r2
            r0 = r34
            X.6Qu r14 = r0.A00
            if (r14 == 0) goto L_0x01c7
            X.6Qq r3 = r14.A00
        L_0x00c6:
            java.lang.String r1 = r2.A02
            java.util.Map r6 = r10.A03
            java.util.Map r0 = r2.A04
            java.lang.String r7 = X.Q32.A01(r3, r1, r6, r0)
            r0 = 10
            int r0 = X.0Yv.A1E(r11, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r16 = r11.iterator()
        L_0x00df:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r0 = r16.next()
            X.Q3z r0 = (X.C7323Q3z) r0
            if (r14 == 0) goto L_0x00fb
            X.6Qq r15 = r14.A00
        L_0x00ef:
            java.lang.String r3 = r0.A02
            java.util.Map r0 = r0.A04
            java.lang.String r0 = X.Q32.A01(r15, r3, r6, r0)
            r4.add(r0)
            goto L_0x00df
        L_0x00fb:
            r15 = 0
            goto L_0x00ef
        L_0x00fd:
            java.lang.String r0 = r2.A03
            r18 = r0
            r6 = r13
            X.Q3h r6 = (X.C7305Q3h) r6
            r0 = r22
            X.Q3h[] r0 = new X.C7305Q3h[]{r0, r6}
            X.Q3h r4 = X.C7306Q3i.A00(r0)
            java.util.Map r3 = r4.A01
            java.lang.String r0 = "points"
            X.0eP r14 = new X.0eP
            r14.<init>(r0, r3)
            java.util.Map r4 = r4.A00
            java.lang.String r3 = "annotations"
            X.0eP r0 = new X.0eP
            r0.<init>(r3, r4)
            X.0eP[] r0 = new X.0eP[]{r14, r0}
            X.0Yt.A06(r0)
            java.lang.Class<X.1xI> r0 = X.AnonymousClass1xI.class
            monitor-enter(r0)
            monitor-exit(r0)
            X.Q3u r4 = r2.A00
            if (r9 == 0) goto L_0x0138
            if (r8 != 0) goto L_0x0138
            java.lang.String r0 = r4.A00
            r16 = 1
            if (r0 == 0) goto L_0x013a
        L_0x0138:
            r16 = 0
        L_0x013a:
            X.T9F r3 = r2.A01
            r0 = r34
            X.6RA r0 = r0.A02     // Catch:{ Exception -> 0x0182 }
            X.6R6 r2 = r0.A00(r1)     // Catch:{ Exception -> 0x0182 }
            long r0 = r10.A00     // Catch:{ Exception -> 0x0182 }
            X.Q3K r15 = r10.A01     // Catch:{ Exception -> 0x0182 }
            r14 = r23
            X.0qQ.A0B(r7, r14)     // Catch:{ Exception -> 0x0182 }
            X.0JR r14 = r2.A02     // Catch:{ Exception -> 0x0182 }
            long r32 = r14.now()     // Catch:{ Exception -> 0x0182 }
            X.6Qy r14 = r2.A01     // Catch:{ Exception -> 0x0182 }
            r25 = r14
            r26 = r4
            r27 = r15
            r28 = r3
            r29 = r7
            r30 = r0
            r25.A00(r26, r27, r28, r29, r30, r32)     // Catch:{ Exception -> 0x0182 }
            if (r16 == 0) goto L_0x019f
            X.6R2 r0 = r2.A00     // Catch:{ Exception -> 0x0182 }
            java.util.concurrent.Executor r2 = r0.A04     // Catch:{ Exception -> 0x0182 }
            X.Q3x r1 = new X.Q3x     // Catch:{ Exception -> 0x0182 }
            r27 = r1
            r28 = r0
            r29 = r3
            r30 = r7
            r31 = r18
            r27.<init>(r28, r29, r30, r31, r32)     // Catch:{ Exception -> 0x0182 }
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask     // Catch:{ Exception -> 0x0182 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0182 }
            r2.execute(r0)     // Catch:{ Exception -> 0x0182 }
            goto L_0x019f
        L_0x0182:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            r0 = r24
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "Component query fetcher successfully fetched from network but failed to write to cache: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            X.0qQ.A07(r1)
            java.lang.String r0 = "BloksComponentQueryFetcher"
            X.1Kn.A02(r0, r1)
        L_0x019f:
            r0 = r22
            X.Q3h[] r0 = new X.C7305Q3h[]{r0, r6}
            X.Q3h r1 = X.C7306Q3i.A00(r0)
            X.Q3o r0 = new X.Q3o
            r0.<init>(r4, r1, r7)
            r12.add(r0)
            if (r3 == 0) goto L_0x00b2
            r0 = r22
            X.Q3h[] r0 = new X.C7305Q3h[]{r0, r6}
            X.Q3h r1 = X.C7306Q3i.A00(r0)
            X.Q4B r0 = new X.Q4B
            r0.<init>(r1, r3, r7)
            r12.add(r0)
            goto L_0x00b2
        L_0x01c7:
            r3 = 0
            goto L_0x00c6
        L_0x01ca:
            java.lang.String r1 = "ComponentQueryParser.parseBatched"
            r0 = 58
            java.lang.String r0 = X.002.A0T(r4, r1, r0)     // Catch:{ all -> 0x0477 }
            X.1KZ.A01(r0)     // Catch:{ all -> 0x0477 }
            long r16 = r25.currentMonotonicTimestamp()     // Catch:{ all -> 0x0477 }
            java.io.StringReader r1 = new java.io.StringReader     // Catch:{ Exception -> 0x0462 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0462 }
            android.util.JsonReader r20 = new android.util.JsonReader     // Catch:{ Exception -> 0x0462 }
            r0 = r20
            r0.<init>(r1)     // Catch:{ Exception -> 0x0462 }
            X.8fW r10 = new X.8fW     // Catch:{ all -> 0x0459 }
            r10.<init>(r0)     // Catch:{ all -> 0x0459 }
            r10.Crg()     // Catch:{ all -> 0x0459 }
            r8 = 0
            java.lang.Integer r0 = r10.A00     // Catch:{ all -> 0x0459 }
            java.lang.Integer r11 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0459 }
            if (r0 == r11) goto L_0x0209
            r10.Evn()     // Catch:{ all -> 0x0459 }
        L_0x01f7:
            java.lang.String r0 = "Expected a valid set of batched component responses but found none"
            X.1Kn.A02(r0, r4)     // Catch:{ all -> 0x0459 }
            X.Q3p r1 = new X.Q3p     // Catch:{ all -> 0x0459 }
            r1.<init>()     // Catch:{ all -> 0x0459 }
            r0 = r21
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)     // Catch:{ all -> 0x0459 }
            goto L_0x03aa
        L_0x0209:
            java.lang.Integer r0 = r10.Crg()     // Catch:{ all -> 0x0459 }
            java.lang.Integer r9 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0459 }
            if (r0 == r9) goto L_0x03a7
            java.lang.String r3 = r10.A01     // Catch:{ all -> 0x0459 }
            int r2 = X.C276474tO.A00(r3)     // Catch:{ all -> 0x0459 }
            r1 = 32
            r0 = 0
            if (r2 < r1) goto L_0x021d
            r0 = 1
        L_0x021d:
            r10.Crg()     // Catch:{ all -> 0x0459 }
            if (r0 != 0) goto L_0x03a2
            java.lang.String r0 = "component_query_responses"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0459 }
            if (r0 == 0) goto L_0x03a2
            r8 = 0
            java.lang.Integer r0 = r10.A00     // Catch:{ all -> 0x0459 }
            java.lang.Integer r7 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0459 }
            if (r0 != r7) goto L_0x03a2
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0459 }
            r8.<init>()     // Catch:{ all -> 0x0459 }
        L_0x0236:
            java.lang.Integer r0 = r10.Crg()     // Catch:{ all -> 0x0459 }
            java.lang.Integer r6 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0459 }
            if (r0 == r6) goto L_0x03a2
            X.Rwl r3 = new X.Rwl     // Catch:{ all -> 0x0459 }
            r3.<init>()     // Catch:{ all -> 0x0459 }
            java.lang.Integer r0 = r10.E2K()     // Catch:{ all -> 0x0459 }
            if (r0 == r11) goto L_0x024d
            r10.Evn()     // Catch:{ all -> 0x0459 }
            goto L_0x0236
        L_0x024d:
            java.lang.Integer r0 = r10.Crg()     // Catch:{ all -> 0x0459 }
            if (r0 == r9) goto L_0x039d
            java.lang.String r1 = r10.E2H()     // Catch:{ all -> 0x0459 }
            int r12 = X.C276474tO.A00(r1)     // Catch:{ all -> 0x0459 }
            r2 = 32
            r0 = 0
            if (r12 < r2) goto L_0x0261
            r0 = 1
        L_0x0261:
            r10.Crg()     // Catch:{ all -> 0x0459 }
            if (r0 != 0) goto L_0x0293
            java.lang.String r19 = "app_id"
            r0 = r19
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0459 }
            if (r0 == 0) goto L_0x0283
            X.4tL r1 = r10.E2L()     // Catch:{ all -> 0x0459 }
            boolean r0 = r1.isNull()     // Catch:{ all -> 0x0459 }
            if (r0 == 0) goto L_0x027c
            r0 = 0
            goto L_0x0280
        L_0x027c:
            java.lang.String r0 = r1.Eyf()     // Catch:{ all -> 0x0459 }
        L_0x0280:
            r3.A02 = r0     // Catch:{ all -> 0x0459 }
            goto L_0x0293
        L_0x0283:
            java.lang.String r18 = "consumed_params"
            r0 = r18
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0459 }
            if (r0 == 0) goto L_0x0297
            java.util.HashMap r0 = X.C276514tS.A01(r10)     // Catch:{ all -> 0x0459 }
            r3.A03 = r0     // Catch:{ all -> 0x0459 }
        L_0x0293:
            r10.Evn()     // Catch:{ all -> 0x0459 }
            goto L_0x024d
        L_0x0297:
            java.lang.String r0 = "payload"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0459 }
            if (r0 == 0) goto L_0x02a7
            android.util.Pair r0 = X.C7308Q3k.A00(r10)     // Catch:{ all -> 0x0459 }
            r3.A00 = r0     // Catch:{ all -> 0x0459 }
            goto L_0x0293
        L_0x02a7:
            java.lang.String r0 = "resources"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0459 }
            if (r0 == 0) goto L_0x0293
            X.T9F r13 = new X.T9F     // Catch:{ all -> 0x0459 }
            r13.<init>()     // Catch:{ all -> 0x0459 }
            java.lang.Integer r0 = r10.E2K()     // Catch:{ all -> 0x0459 }
            if (r0 == r11) goto L_0x02c1
            r10.Evn()     // Catch:{ all -> 0x0459 }
            r13 = 0
            goto L_0x0399
        L_0x02c1:
            java.lang.Integer r0 = r10.Crg()     // Catch:{ all -> 0x0459 }
            if (r0 == r9) goto L_0x0399
            java.lang.String r2 = r10.E2H()     // Catch:{ all -> 0x0459 }
            int r1 = X.C276474tO.A00(r2)     // Catch:{ all -> 0x0459 }
            r12 = 32
            r0 = 0
            if (r1 < r12) goto L_0x02d5
            r0 = 1
        L_0x02d5:
            r10.Crg()     // Catch:{ all -> 0x0459 }
            if (r0 != 0) goto L_0x0394
            java.lang.String r0 = "acq"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0459 }
            if (r0 == 0) goto L_0x0394
            r2 = 0
            java.lang.Integer r0 = r10.E2K()     // Catch:{ all -> 0x0459 }
            if (r0 != r7) goto L_0x0392
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0459 }
            r2.<init>()     // Catch:{ all -> 0x0459 }
        L_0x02ee:
            java.lang.Integer r0 = r10.Crg()     // Catch:{ all -> 0x0459 }
            if (r0 == r6) goto L_0x0392
            X.If1 r1 = new X.If1     // Catch:{ all -> 0x0459 }
            r1.<init>()     // Catch:{ all -> 0x0459 }
            java.lang.Integer r0 = r10.E2K()     // Catch:{ all -> 0x0459 }
            if (r0 == r11) goto L_0x0303
            r10.Evn()     // Catch:{ all -> 0x0459 }
            goto L_0x02ee
        L_0x0303:
            java.lang.Integer r0 = r10.Crg()     // Catch:{ all -> 0x0459 }
            if (r0 == r9) goto L_0x038d
            java.lang.String r14 = r10.E2H()     // Catch:{ all -> 0x0459 }
            int r15 = X.C276474tO.A00(r14)     // Catch:{ all -> 0x0459 }
            r0 = 0
            if (r15 < r12) goto L_0x0315
            r0 = 1
        L_0x0315:
            r10.Crg()     // Catch:{ all -> 0x0459 }
            if (r0 != 0) goto L_0x0333
            r0 = r19
            boolean r0 = r0.equals(r14)     // Catch:{ all -> 0x0459 }
            r15 = 0
            if (r0 == 0) goto L_0x0337
            X.4tL r14 = r10.E2L()     // Catch:{ all -> 0x0459 }
            boolean r0 = r14.isNull()     // Catch:{ all -> 0x0459 }
            if (r0 != 0) goto L_0x0331
            java.lang.String r15 = r14.Eyf()     // Catch:{ all -> 0x0459 }
        L_0x0331:
            r1.A01 = r15     // Catch:{ all -> 0x0459 }
        L_0x0333:
            r10.Evn()     // Catch:{ all -> 0x0459 }
            goto L_0x0303
        L_0x0337:
            r0 = r18
            boolean r0 = r0.equals(r14)     // Catch:{ all -> 0x0459 }
            if (r0 == 0) goto L_0x0346
            java.util.HashMap r0 = X.C276514tS.A01(r10)     // Catch:{ all -> 0x0459 }
            r1.A02 = r0     // Catch:{ all -> 0x0459 }
            goto L_0x0333
        L_0x0346:
            java.lang.String r0 = "cache_keys"
            boolean r0 = r0.equals(r14)     // Catch:{ all -> 0x0459 }
            if (r0 == 0) goto L_0x0376
            java.lang.Integer r0 = r10.E2K()     // Catch:{ all -> 0x0459 }
            if (r0 != r7) goto L_0x0373
            java.util.HashSet r15 = new java.util.HashSet     // Catch:{ all -> 0x0459 }
            r15.<init>()     // Catch:{ all -> 0x0459 }
        L_0x0359:
            java.lang.Integer r0 = r10.Crg()     // Catch:{ all -> 0x0459 }
            if (r0 == r6) goto L_0x0373
            X.4tL r14 = r10.E2L()     // Catch:{ all -> 0x0459 }
            boolean r0 = r14.isNull()     // Catch:{ all -> 0x0459 }
            if (r0 != 0) goto L_0x0359
            java.lang.String r0 = r14.Eyf()     // Catch:{ all -> 0x0459 }
            if (r0 == 0) goto L_0x0359
            r15.add(r0)     // Catch:{ all -> 0x0459 }
            goto L_0x0359
        L_0x0373:
            r1.A03 = r15     // Catch:{ all -> 0x0459 }
            goto L_0x0333
        L_0x0376:
            java.lang.String r0 = "cache_ttl"
            boolean r0 = r0.equals(r14)     // Catch:{ all -> 0x0459 }
            if (r0 == 0) goto L_0x0333
            X.4tL r0 = r10.E2L()     // Catch:{ all -> 0x0459 }
            long r14 = r0.ClN()     // Catch:{ all -> 0x0459 }
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0459 }
            r1.A00 = r0     // Catch:{ all -> 0x0459 }
            goto L_0x0333
        L_0x038d:
            r2.add(r1)     // Catch:{ all -> 0x0459 }
            goto L_0x02ee
        L_0x0392:
            r13.A00 = r2     // Catch:{ all -> 0x0459 }
        L_0x0394:
            r10.Evn()     // Catch:{ all -> 0x0459 }
            goto L_0x02c1
        L_0x0399:
            r3.A01 = r13     // Catch:{ all -> 0x0459 }
            goto L_0x0293
        L_0x039d:
            r8.add(r3)     // Catch:{ all -> 0x0459 }
            goto L_0x0236
        L_0x03a2:
            r10.Evn()     // Catch:{ all -> 0x0459 }
            goto L_0x0209
        L_0x03a7:
            if (r8 == 0) goto L_0x01f7
            goto L_0x03af
        L_0x03aa:
            r20.close()     // Catch:{ Exception -> 0x0462 }
            goto L_0x0471
        L_0x03af:
            long r0 = r25.currentMonotonicTimestamp()     // Catch:{ all -> 0x0459 }
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0459 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0459 }
        L_0x03bb:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x0459 }
            if (r2 == 0) goto L_0x041a
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x0459 }
            X.Rwl r7 = (X.C10707Rwl) r7     // Catch:{ all -> 0x0459 }
            android.util.Pair r2 = r7.A00     // Catch:{ all -> 0x0459 }
            if (r2 == 0) goto L_0x0416
            java.lang.Object r13 = r2.first     // Catch:{ all -> 0x0459 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0459 }
            java.lang.Object r6 = r2.second     // Catch:{ all -> 0x0459 }
            X.Q3k r6 = (X.C7308Q3k) r6     // Catch:{ all -> 0x0459 }
        L_0x03d3:
            java.lang.String r12 = r7.A02     // Catch:{ all -> 0x0459 }
            java.util.Map r14 = r7.A03     // Catch:{ all -> 0x0459 }
            if (r13 == 0) goto L_0x03f0
            if (r6 == 0) goto L_0x03f0
            if (r12 == 0) goto L_0x03f3
            if (r14 == 0) goto L_0x03f3
            r2 = r26
            X.Q3u r10 = X.C7314Q3q.A00(r6, r2)     // Catch:{ all -> 0x0459 }
            X.T9F r11 = r7.A01     // Catch:{ all -> 0x0459 }
            X.Q3z r9 = new X.Q3z     // Catch:{ all -> 0x0459 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0459 }
            r3.add(r9)     // Catch:{ all -> 0x0459 }
            goto L_0x03bb
        L_0x03f0:
            java.lang.String r2 = "Got null payload in multi component response"
            goto L_0x0412
        L_0x03f3:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0459 }
            r6.<init>()     // Catch:{ all -> 0x0459 }
            java.lang.String r2 = "Unexpected null in metadata: {appId: "
            r6.append(r2)     // Catch:{ all -> 0x0459 }
            r6.append(r12)     // Catch:{ all -> 0x0459 }
            java.lang.String r2 = "}, {consumed_params: "
            r6.append(r2)     // Catch:{ all -> 0x0459 }
            r6.append(r14)     // Catch:{ all -> 0x0459 }
            r2 = 125(0x7d, float:1.75E-43)
            r6.append(r2)     // Catch:{ all -> 0x0459 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0459 }
        L_0x0412:
            X.1Kn.A02(r2, r4)     // Catch:{ all -> 0x0459 }
            goto L_0x03bb
        L_0x0416:
            r13 = r21
            r6 = r13
            goto L_0x03d3
        L_0x041a:
            X.Q40 r8 = new X.Q40     // Catch:{ all -> 0x0459 }
            r8.<init>(r3)     // Catch:{ all -> 0x0459 }
            long r6 = r25.currentMonotonicTimestamp()     // Catch:{ all -> 0x0459 }
            X.Q3w r9 = new X.Q3w     // Catch:{ all -> 0x0459 }
            r9.<init>()     // Catch:{ all -> 0x0459 }
            java.lang.String r10 = "parse_start"
            r2 = r16
            r9.A00(r10, r2)     // Catch:{ all -> 0x0459 }
            java.lang.String r10 = "json_parse_start"
            r9.A00(r10, r2)     // Catch:{ all -> 0x0459 }
            java.lang.String r2 = "json_parse_end"
            r9.A00(r2, r0)     // Catch:{ all -> 0x0459 }
            java.lang.String r0 = "parse_end"
            r9.A00(r0, r6)     // Catch:{ all -> 0x0459 }
            java.util.Map r0 = r9.A02     // Catch:{ all -> 0x0459 }
            java.util.Map r2 = X.0Yt.A0B(r0)     // Catch:{ all -> 0x0459 }
            java.util.Map r0 = r9.A01     // Catch:{ all -> 0x0459 }
            java.util.Map r1 = X.0Yt.A0B(r0)     // Catch:{ all -> 0x0459 }
            X.Q3v r0 = new X.Q3v     // Catch:{ all -> 0x0459 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0459 }
            X.0eP r1 = X.AnonymousClass7TE.A1L(r8, r0)     // Catch:{ all -> 0x0459 }
            r20.close()     // Catch:{ Exception -> 0x0462 }
            goto L_0x0471
        L_0x0459:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x045b }
        L_0x045b:
            r1 = move-exception
            r0 = r20
            X.1zE.A00(r0, r2)     // Catch:{ Exception -> 0x0462 }
            throw r1     // Catch:{ Exception -> 0x0462 }
        L_0x0462:
            r0 = move-exception
            X.1Kn.A03(r4, r0)     // Catch:{ all -> 0x0477 }
            X.Q3p r1 = new X.Q3p     // Catch:{ all -> 0x0477 }
            r1.<init>()     // Catch:{ all -> 0x0477 }
            r0 = r21
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)     // Catch:{ all -> 0x0477 }
        L_0x0471:
            X.1KZ.A00()
            goto L_0x0060
        L_0x0476:
            return
        L_0x0477:
            r0 = move-exception
            X.1KZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q3F.A00(X.Q3h, java.lang.String, java.util.List):void");
    }
}
