package X;

import com.instagram.common.session.UserSession;
import com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator;
import com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2mP  reason: invalid class name and case insensitive filesystem */
public final class C228832mP extends 1P0 {
    public int A00;
    public final Set A01 = new LinkedHashSet();
    public final AtomicInteger A02 = new AtomicInteger(0);
    public final /* synthetic */ AnonymousClass1GU A03;
    public final /* synthetic */ C228552lr A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public C228832mP(AnonymousClass1GU r3, C228552lr r4, boolean z, boolean z2) {
        this.A04 = r4;
        this.A03 = r3;
        this.A06 = z;
        this.A05 = z2;
    }

    private final boolean A00() {
        AnonymousClass1GU r0 = this.A03;
        boolean z = r0 instanceof AnonymousClass1GS;
        boolean A022 = r0.A00.A02();
        if (!z) {
            return A022;
        }
        if (!A022 || this.A00 != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (X.0qQ.A0K(r5.A04, r13) == false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.1XM r18, boolean r19) {
        /*
            r17 = this;
            r4 = r17
            boolean r7 = r4.A06
            if (r7 == 0) goto L_0x0011
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x0011
            java.util.concurrent.atomic.AtomicInteger r1 = r4.A02
            if (r19 == 0) goto L_0x01bb
            r1.incrementAndGet()
        L_0x0011:
            X.2lr r5 = r4.A04
            com.instagram.common.session.UserSession r6 = r5.A0J
            X.0Tu r3 = X.0Tu.A05
            r0 = 36317620689376656(0x8106af00471590, double:3.0307477910577733E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            r14 = r18
            if (r0 == 0) goto L_0x0036
            X.1GU r13 = r4.A03
            X.1FS r0 = r13.A00
            X.1FI r1 = r0.A04
            X.1FI r0 = X.1FI.A06
            if (r1 == r0) goto L_0x0036
            X.1GU r0 = r5.A04
            boolean r0 = X.0qQ.A0K(r0, r13)
            if (r0 == 0) goto L_0x0051
        L_0x0036:
            X.1GU r13 = r4.A03
            boolean r0 = r13 instanceof X.AnonymousClass1GS
            if (r0 != 0) goto L_0x0045
            X.3Do r1 = X.C228552lr.A01(r5)
            X.3Os r0 = X.C241313Os.LOADED
            r1.A00(r0)
        L_0x0045:
            X.3Do r1 = X.C228552lr.A01(r5)
            java.lang.String r0 = r14.A04
            r1.A03 = r0
            boolean r0 = r14.A07
            r1.A04 = r0
        L_0x0051:
            boolean r0 = r14.A0O
            if (r0 == 0) goto L_0x005d
            X.2l3 r1 = r5.A0M
            java.lang.String r0 = "SHELL_RESPONSE_RECEIVED_FROM_NETWORK"
            X.AnonymousClass2l3.A02(r1, r0)
        L_0x005c:
            return
        L_0x005d:
            if (r7 == 0) goto L_0x006c
            X.0wX r0 = X.C61170le.A00
            X.18g r2 = X.C638918c.A01(r0)
            java.lang.String r1 = "MAIN_FRAGMENT_CONNECT_CALLBACK_ON_SUCCESS_START"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r2.A02
            r2.A0O(r0, r1)
        L_0x006c:
            X.1FS r2 = r13.A00
            X.1FI r1 = r2.A04
            X.1FI r0 = X.1FI.A06
            if (r1 != r0) goto L_0x00df
            X.2lF r9 = X.C228282lE.A00(r6)
            java.lang.Long r0 = r9.A00
            if (r0 == 0) goto L_0x0085
            long r0 = r0.longValue()
            X.1QP r8 = r9.A02
            r8.flowEndSuccess(r0)
        L_0x0085:
            r0 = 0
            r9.A00 = r0
        L_0x0088:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            boolean r0 = r14.CPt()
            if (r0 != 0) goto L_0x0098
            boolean r0 = r14.mFromDiskCache
            if (r0 == 0) goto L_0x00dc
            boolean r0 = r5.A0c
            if (r0 == 0) goto L_0x00dc
        L_0x0098:
            X.3PG r0 = X.AnonymousClass3PG.CACHED
        L_0x009a:
            X.9IV r12 = new X.9IV
            r12.<init>((X.AnonymousClass3PG) r0, (java.lang.Integer) r1)
            java.lang.Object r1 = r12.A01
            X.3PG r0 = X.AnonymousClass3PG.CACHED
            if (r1 == r0) goto L_0x00ce
            X.0tp r9 = r5.A0K
            X.0to r8 = r2.A03
            java.util.List r1 = r14.A00()
            boolean r0 = r4.A00()
            r9.DeY(r8, r1, r0)
            r0 = 36610855281891493(0x821161000018a5, double:3.2161905281250856E-306)
            long r10 = X.182.A01(r3, r6, r0)
            r8 = 0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ca
            X.3Do r1 = X.C228552lr.A01(r5)
            r0 = 0
            r1.A00 = r0
        L_0x00ca:
            java.lang.Object r8 = r5.A0Y
            monitor-enter(r8)
            goto L_0x00f8
        L_0x00ce:
            boolean r0 = r5.A0c
            if (r0 == 0) goto L_0x00ca
            X.0wX r0 = X.C61170le.A00
            X.18g r0 = X.C638918c.A01(r0)
            r0.A0D()
            goto L_0x00ca
        L_0x00dc:
            X.3PG r0 = X.AnonymousClass3PG.NETWORK
            goto L_0x009a
        L_0x00df:
            X.1FI r0 = X.1FI.A0J
            if (r1 != r0) goto L_0x0088
            X.2lF r9 = X.C228282lE.A00(r6)
            java.lang.Long r0 = r9.A01
            if (r0 == 0) goto L_0x00f4
            long r0 = r0.longValue()
            X.1QP r8 = r9.A02
            r8.flowEndSuccess(r0)
        L_0x00f4:
            r0 = 0
            r9.A01 = r0
            goto L_0x0088
        L_0x00f8:
            boolean r9 = r13 instanceof X.AnonymousClass1GS     // Catch:{ all -> 0x01c5 }
            if (r9 != 0) goto L_0x010c
            java.util.Map r11 = r5.A0Z     // Catch:{ all -> 0x01c5 }
            java.lang.String r10 = r2.A0A     // Catch:{ all -> 0x01c5 }
            java.lang.String r0 = r2.A08     // Catch:{ all -> 0x01c5 }
            X.0eP r1 = new X.0eP     // Catch:{ all -> 0x01c5 }
            r1.<init>(r10, r0)     // Catch:{ all -> 0x01c5 }
            X.3Os r0 = X.C241313Os.LOADED     // Catch:{ all -> 0x01c5 }
            r11.put(r1, r0)     // Catch:{ all -> 0x01c5 }
        L_0x010c:
            X.2lj r11 = r5.A0A     // Catch:{ all -> 0x01c5 }
            if (r11 == 0) goto L_0x011e
            boolean r16 = r4.A00()     // Catch:{ all -> 0x01c5 }
            if (r9 == 0) goto L_0x011c
            int r15 = r4.A00     // Catch:{ all -> 0x01c5 }
        L_0x0118:
            r11.A07(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01c5 }
            goto L_0x012e
        L_0x011c:
            r15 = -1
            goto L_0x0118
        L_0x011e:
            X.2ll r1 = X.C228482lk.A00(r6)     // Catch:{ all -> 0x01c5 }
            java.lang.String r0 = "No new items delivered"
            r1.A0C(r2, r0)     // Catch:{ all -> 0x01c5 }
            X.2l3 r1 = r5.A0M     // Catch:{ all -> 0x01c5 }
            java.lang.String r0 = "NULL_DELEGATE_ON_FEED_REQUEST_SUCCESS"
            X.AnonymousClass2l3.A02(r1, r0)     // Catch:{ all -> 0x01c5 }
        L_0x012e:
            monitor-exit(r8)
            X.2ly r0 = r5.A0U
            r0.Des(r13, r14)
            boolean r0 = r4.A00()
            if (r0 != 0) goto L_0x0181
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            X.1GW r5 = X.1GV.A00(r6)
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0181
            java.lang.String r0 = r5.A03
            if (r0 != 0) goto L_0x0181
            java.lang.String r0 = r5.A02
            if (r0 == 0) goto L_0x0181
            java.lang.String r0 = r5.A01
            if (r0 == 0) goto L_0x0181
            java.util.List r0 = r14.A00()
            java.util.Iterator r8 = r0.iterator()
        L_0x0158:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01b9
            java.lang.Object r1 = r8.next()
            r0 = r1
            X.1Xg r0 = (X.1Xg) r0
            X.1Xn r0 = r0.A05
            boolean r0 = r0 instanceof X.AnonymousClass3O9
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0158
        L_0x016d:
            X.1Xg r1 = (X.1Xg) r1
            if (r1 == 0) goto L_0x0181
            X.1Xn r0 = r1.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            if (r0 == 0) goto L_0x0181
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x0181
            r5.A03 = r0
        L_0x0181:
            boolean r0 = r4.A00()
            if (r0 == 0) goto L_0x018d
            int r0 = r4.A00
            int r0 = r0 + 1
            r4.A00 = r0
        L_0x018d:
            if (r7 == 0) goto L_0x019c
            X.0wX r0 = X.C61170le.A00
            X.18g r4 = X.C638918c.A01(r0)
            java.lang.String r1 = "MAIN_FRAGMENT_CONNECT_CALLBACK_ON_SUCCESS_END"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r4.A02
            r4.A0O(r0, r1)
        L_0x019c:
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x005c
            r0 = 36328701700423195(0x8110c300013e1b, double:3.0377554670632546E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 == 0) goto L_0x005c
            java.util.Map r1 = r14.A0M
            if (r1 == 0) goto L_0x005c
            X.Hra r0 = X.C55041HbC.A00(r6)
            r0.A01(r1)
            return
        L_0x01b9:
            r1 = 0
            goto L_0x016d
        L_0x01bb:
            int r0 = r1.get()
            if (r0 <= 0) goto L_0x0011
            r1.decrementAndGet()
            return
        L_0x01c5:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228832mP.A01(X.1XM, boolean):void");
    }

    public final void onResponseStarted() {
        IgSignalsTtncEstimator A002 = 1HH.A00(this.A04.A0J);
        if (A002 != null) {
            A002.A04();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0075, code lost:
        if (r0 != null) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(java.lang.Object r21) {
        /*
            r20 = this;
            r6 = r21
            r0 = 1023478293(0x3d010a15, float:0.031503756)
            int r12 = X.AnonymousClass0fD.A03(r0)
            X.1XM r6 = (X.1XM) r6
            r0 = 790814458(0x2f22defa, float:1.4813031E-10)
            int r10 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r6, r5)
            boolean r0 = r6.A0O
            if (r0 == 0) goto L_0x0027
            r0 = 85188947(0x513e153, float:6.953292E-36)
        L_0x001d:
            X.AnonymousClass0fD.A0A(r0, r10)
            r0 = 615021189(0x24a87a85, float:7.306594E-17)
            X.AnonymousClass0fD.A0A(r0, r12)
            return
        L_0x0027:
            r7 = r20
            X.2lr r4 = r7.A04
            r4.A0e = r5
            boolean r9 = r7.A06
            if (r9 == 0) goto L_0x003e
            X.0wX r0 = X.C61170le.A00
            X.18g r2 = X.C638918c.A01(r0)
            java.lang.String r1 = "MAIN_FRAGMENT_CONNECT_CALLBACK_ON_SUCCESS_IN_BACKGROUND_START"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r2.A02
            r2.A0O(r0, r1)
        L_0x003e:
            X.2ly r0 = r4.A0U
            X.1GU r3 = r7.A03
            r0.Dey(r3, r6)
            java.lang.Object r2 = r4.A0Y
            monitor-enter(r2)
            X.1Jf r0 = X.AnonymousClass1K7.A00()     // Catch:{ all -> 0x0276 }
            boolean r0 = r0.A0E()     // Catch:{ all -> 0x0276 }
            r11 = 0
            if (r0 == 0) goto L_0x0079
            boolean r0 = r4.A0b     // Catch:{ all -> 0x0276 }
            if (r0 != 0) goto L_0x00a9
            X.1UN r13 = r4.A0R     // Catch:{ all -> 0x0276 }
            com.instagram.common.session.UserSession r14 = r4.A0J     // Catch:{ all -> 0x0276 }
            X.0Tu r8 = X.0Tu.A05     // Catch:{ all -> 0x0276 }
            r0 = 36592580196303479(0x8200c200040277, double:3.2046332904113625E-306)
            long r0 = X.182.A01(r8, r14, r0)     // Catch:{ all -> 0x0276 }
            int r8 = (int) r0     // Catch:{ all -> 0x0276 }
            X.0eM r0 = r13.A06     // Catch:{ all -> 0x0276 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0276 }
            X.1Uy r0 = (X.1Uy) r0     // Catch:{ all -> 0x0276 }
            com.instagram.mainfeed.network.FeedCacheCoordinator r0 = (com.instagram.mainfeed.network.FeedCacheCoordinator) r0     // Catch:{ all -> 0x0276 }
            r0.A00 = r8     // Catch:{ all -> 0x0276 }
            com.instagram.mainfeed.network.flashfeed.FlashFeedCache r0 = r0.A09     // Catch:{ all -> 0x0276 }
            if (r0 == 0) goto L_0x0079
        L_0x0077:
            r0.A00 = r8     // Catch:{ all -> 0x0276 }
        L_0x0079:
            boolean r14 = r4.A0b     // Catch:{ all -> 0x0276 }
            if (r14 != 0) goto L_0x00b3
            X.1UN r0 = r4.A0R     // Catch:{ all -> 0x0276 }
            X.0eM r0 = r0.A06     // Catch:{ all -> 0x0276 }
            java.lang.Object r8 = r0.getValue()     // Catch:{ all -> 0x0276 }
            X.1Uy r8 = (X.1Uy) r8     // Catch:{ all -> 0x0276 }
            com.instagram.mainfeed.network.FeedCacheCoordinator r8 = (com.instagram.mainfeed.network.FeedCacheCoordinator) r8     // Catch:{ all -> 0x0276 }
            java.util.List r1 = r6.A00()     // Catch:{ all -> 0x0276 }
            X.1FS r13 = r3.A00     // Catch:{ all -> 0x0276 }
            boolean r0 = r13.A02()     // Catch:{ all -> 0x0276 }
            r8.A8n(r1, r0)     // Catch:{ all -> 0x0276 }
        L_0x0096:
            boolean r0 = X.C228552lr.A04(r6, r4)     // Catch:{ all -> 0x0276 }
            if (r0 == 0) goto L_0x00fe
            if (r14 != 0) goto L_0x009f
            goto L_0x00e4
        L_0x009f:
            com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource r0 = r4.A06     // Catch:{ all -> 0x0276 }
            if (r0 != 0) goto L_0x00fb
            java.lang.String r0 = "mainFeedLocalDataSource"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x0276 }
            goto L_0x00bc
        L_0x00a9:
            com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource r13 = r4.A06     // Catch:{ all -> 0x0276 }
            if (r13 != 0) goto L_0x00cf
            java.lang.String r0 = "mainFeedLocalDataSource"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x0276 }
            goto L_0x00bc
        L_0x00b3:
            com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource r8 = r4.A06     // Catch:{ all -> 0x0276 }
            if (r8 != 0) goto L_0x00c1
            java.lang.String r0 = "mainFeedLocalDataSource"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x0276 }
        L_0x00bc:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0276 }
            throw r0     // Catch:{ all -> 0x0276 }
        L_0x00c1:
            java.util.List r1 = r6.A00()     // Catch:{ all -> 0x0276 }
            X.1FS r13 = r3.A00     // Catch:{ all -> 0x0276 }
            boolean r0 = r13.A02()     // Catch:{ all -> 0x0276 }
            r8.A8n(r1, r0)     // Catch:{ all -> 0x0276 }
            goto L_0x0096
        L_0x00cf:
            com.instagram.common.session.UserSession r14 = r4.A0J     // Catch:{ all -> 0x0276 }
            X.0Tu r8 = X.0Tu.A05     // Catch:{ all -> 0x0276 }
            r0 = 36592580196303479(0x8200c200040277, double:3.2046332904113625E-306)
            long r0 = X.182.A01(r8, r14, r0)     // Catch:{ all -> 0x0276 }
            int r8 = (int) r0     // Catch:{ all -> 0x0276 }
            r13.A00 = r8     // Catch:{ all -> 0x0276 }
            com.instagram.mainfeed.network.flashfeed.FlashFeedCache r0 = r13.A0C     // Catch:{ all -> 0x0276 }
            if (r0 == 0) goto L_0x0079
            goto L_0x0077
        L_0x00e4:
            X.1UN r0 = r4.A0R     // Catch:{ all -> 0x0276 }
            X.0eM r0 = r0.A06     // Catch:{ all -> 0x0276 }
            java.lang.Object r3 = r0.getValue()     // Catch:{ all -> 0x0276 }
            X.1Uy r3 = (X.1Uy) r3     // Catch:{ all -> 0x0276 }
            com.instagram.mainfeed.network.FeedCacheCoordinator r3 = (com.instagram.mainfeed.network.FeedCacheCoordinator) r3     // Catch:{ all -> 0x0276 }
            X.1Hb r1 = X.AnonymousClass1HI.A02     // Catch:{ all -> 0x0276 }
            X.4dz r0 = new X.4dz     // Catch:{ all -> 0x0276 }
            r0.<init>(r3)     // Catch:{ all -> 0x0276 }
            r1.Eym(r0)     // Catch:{ all -> 0x0276 }
            goto L_0x00fe
        L_0x00fb:
            r0.A06()     // Catch:{ all -> 0x0276 }
        L_0x00fe:
            monitor-exit(r2)
            int r0 = r7.A00
            r8 = 1
            if (r0 != 0) goto L_0x01b3
            boolean r0 = r13.A00()
            if (r0 == 0) goto L_0x01b3
            boolean r0 = r6.CPt()
            if (r0 != 0) goto L_0x01b3
            X.L4l r0 = r6.A05
            if (r0 == 0) goto L_0x012a
            java.lang.Integer r0 = r0.A01
            if (r0 == 0) goto L_0x012a
            int r1 = r0.intValue()
            X.0wX r0 = X.C61170le.A00
            X.18g r2 = X.C638918c.A01(r0)
            long r0 = (long) r1
            java.lang.String r3 = "server_total_latency_ms"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r2 = r2.A02
            X.18g.A04(r2, r3, r0)
        L_0x012a:
            X.L4l r0 = r6.A05
            if (r0 == 0) goto L_0x0144
            java.lang.Integer r0 = r0.A00
            if (r0 == 0) goto L_0x0144
            int r1 = r0.intValue()
            X.0wX r0 = X.C61170le.A00
            X.18g r2 = X.C638918c.A01(r0)
            long r0 = (long) r1
            java.lang.String r3 = "server_source_and_rank_latency_ms"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r2 = r2.A02
            X.18g.A04(r2, r3, r0)
        L_0x0144:
            com.instagram.common.session.UserSession r2 = r4.A0J
            com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator r15 = X.1HH.A00(r2)
            if (r15 == 0) goto L_0x016c
            X.L4l r14 = r6.A05
            X.0sa r0 = r15.A0D
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            long r18 = r0.longValue()
            X.4Cq r0 = r15.A0E
            r17 = 9
            X.MGF r13 = new X.MGF
            r16 = r11
            r13.<init>(r14, r15, r16, r17, r18)
            X.19B r3 = X.19B.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.1Eo.A03(r1, r3, r13, r0)
        L_0x016c:
            X.0Tu r3 = X.0Tu.A05
            r0 = 37162045618782426(0x8406af003c00da, double:3.564765516640251E-306)
            double r15 = X.182.A00(r3, r2, r0)
            r13 = 0
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x01b3
            long r0 = r4.A00
            r15 = 0
            int r3 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r3 <= 0) goto L_0x01b3
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r13 = r13 - r0
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b3
            X.0wX r1 = X.C61170le.A00
            X.18g r0 = X.C638918c.A01(r1)
            boolean r0 = r0.A0V()
            if (r0 == 0) goto L_0x01e8
            X.1Av r13 = X.1Au.A00(r2)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r4.A00
            long r0 = r0 - r2
            X.0xa r2 = r13.A01
            X.0xY r3 = r2.AR4()
            java.lang.String r2 = "last_hot_start_feed_latency"
            r3.E5c(r2, r0)
            r3.apply()
        L_0x01b3:
            if (r9 == 0) goto L_0x01cf
            X.0wX r0 = X.C61170le.A00
            X.18g r2 = X.C638918c.A01(r0)
            java.lang.String r1 = "MAIN_FRAGMENT_CONNECT_CALLBACK_ON_SUCCESS_IN_BACKGROUND_END"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r2.A02
            r2.A0O(r0, r1)
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x01cf
            boolean r0 = X.11Z.A07()
            if (r0 == 0) goto L_0x01cf
            r7.A01(r6, r8)
        L_0x01cf:
            boolean r0 = X.11Z.A07()
            if (r0 == 0) goto L_0x0237
            com.instagram.common.session.UserSession r3 = r4.A0J
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328151945329634(0x811043000c3be2, double:3.0374077997284006E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0237
            java.util.Set r0 = r7.A01
            monitor-enter(r0)
            goto L_0x0230
        L_0x01e8:
            X.18g r0 = X.C638918c.A01(r1)
            boolean r0 = r0.A0W()
            if (r0 == 0) goto L_0x020c
            X.1Av r13 = X.1Au.A00(r2)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r4.A00
            long r0 = r0 - r2
            X.0xa r2 = r13.A01
            X.0xY r3 = r2.AR4()
            java.lang.String r2 = "last_warm_start_feed_latency"
            r3.E5c(r2, r0)
            r3.apply()
            goto L_0x01b3
        L_0x020c:
            X.18g r0 = X.C638918c.A01(r1)
            boolean r0 = r0.A0U()
            if (r0 == 0) goto L_0x01b3
            X.1Av r13 = X.1Au.A00(r2)
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r4.A00
            long r2 = r2 - r0
            X.0xa r0 = r13.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "last_cold_start_feed_latency"
            r1.E5c(r0, r2)
            r1.apply()
            goto L_0x01b3
        L_0x0230:
            r0.add(r6)     // Catch:{ all -> 0x027c }
            monitor-exit(r0)
            r7.A01(r6, r5)
        L_0x0237:
            r0 = 36328151945591782(0x81104300103be6, double:3.037407799894184E-306)
            X.0tM r0 = X.AnonymousClass0yP.A00(r0)
            boolean r0 = X.0yU.A07(r0)
            if (r0 == 0) goto L_0x0260
            com.instagram.common.session.UserSession r0 = r4.A0J
            X.1Am r0 = X.1Al.A01(r0)
            X.1An r2 = X.1An.A1Q
            X.0xa r0 = r0.A03(r2)
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = r2.toString()
            r1.E5g(r0, r11)
            r1.apply()
        L_0x0260:
            java.lang.Boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x0271
            com.instagram.common.session.UserSession r0 = r4.A0J
            X.1Av r0 = X.1Au.A00(r0)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "is_ifr_eligible"
            r1.getBoolean(r0, r8)
        L_0x0271:
            r0 = -1888250117(0xffffffff8f7396fb, float:-1.2009903E-29)
            goto L_0x001d
        L_0x0276:
            r1 = move-exception
            monitor-exit(r2)
            r0 = -1235040173(0xffffffffb662c853, float:-3.3793228E-6)
            goto L_0x0281
        L_0x027c:
            r1 = move-exception
            monitor-exit(r0)
            r0 = 1545263468(0x5c1ad96c, float:1.74344817E17)
        L_0x0281:
            X.AnonymousClass0fD.A0A(r0, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228832mP.onSuccessInBackground(java.lang.Object):void");
    }

    public final void onFail(C268654dm r20) {
        String str;
        boolean z;
        String str2;
        int A032 = AnonymousClass0fD.A03(-543596776);
        C268654dm r17 = r20;
        0qQ.A0B(r17, 0);
        C228552lr r4 = this.A04;
        UserSession userSession = r4.A0J;
        0Tu r7 = 0Tu.A05;
        r4.A0e = 182.A06(r7, userSession, 36317620685575540L);
        Runnable runnable = r4.A0d;
        if (runnable != null) {
            runnable.run();
        }
        r4.A0d = null;
        IgSignalsTtncEstimator A002 = 1HH.A00(userSession);
        if (A002 != null) {
            A002.A03();
        }
        C238823Do A012 = C228552lr.A01(r4);
        C241313Os r9 = C241313Os.NEEDS_RETRY;
        A012.A00(r9);
        int i = -1;
        1XP r2 = (1XP) r17.A00();
        if (r2 != null) {
            i = r2.mStatusCode;
        } else {
            Throwable A013 = r17.A01();
            if (A013 instanceof C69248NiA) {
                0qQ.A0C(A013, "null cannot be cast to non-null type com.instagram.common.api.base.HttpResponseParseException");
                i = ((C69248NiA) A013).A00;
            }
        }
        AnonymousClass1GU r3 = this.A03;
        1FS r12 = r3.A00;
        1FI r11 = r12.A04;
        1FI r10 = 1FI.A06;
        if (r11 == r10) {
            C228292lF A003 = C228282lE.A00(userSession);
            if (r2 == null || (str2 = r2.getClientFacingErrorMessage()) == null) {
                str2 = "";
            }
            Long l = A003.A00;
            if (l != null) {
                A003.A02.flowEndFail(l.longValue(), str2, (String) null);
            }
            A003.A00 = null;
        } else if (r11 == 1FI.A0J) {
            C228292lF A004 = C228282lE.A00(userSession);
            if (r2 == null || (str = r2.getClientFacingErrorMessage()) == null) {
                str = "";
            }
            Long l2 = A004.A01;
            if (l2 != null) {
                A004.A02.flowEndFail(l2.longValue(), str, (String) null);
            }
            A004.A01 = null;
        }
        synchronized (r4.A0Y) {
            try {
                r4.A0Z.put(new 0eP(r12.A0A, r12.A08), r9);
                if (r4.A0A != null) {
                    0qQ.A0B(r11, 1);
                    if (!(r11 == 1FI.A0G || r11 == r10)) {
                        if (!r4.A0b) {
                            z = r4.A0P.A02();
                        } else {
                            MainFeedLocalDataSource mainFeedLocalDataSource = r4.A06;
                            if (mainFeedLocalDataSource == null) {
                                0qQ.A0F("mainFeedLocalDataSource");
                                throw AnonymousClass00P.createAndThrow();
                            }
                            z = mainFeedLocalDataSource.A0A.A02();
                        }
                        if (z) {
                            1QP r112 = C228482lk.A00(userSession).A04;
                            long generateFlowId = r112.generateFlowId(974460658, r12.A01);
                            if (r112.isOngoingFlow(generateFlowId)) {
                                r112.flowMarkPoint(generateFlowId, "FLASH_FEED_FALL_BACK");
                            }
                            C228552lr r8 = r4;
                            r8.A06((1UV) null, new C57283IVs(r3, r4), new AnonymousClass46L((int) 182.A01(r7, userSession, 36592580196369016L), 0), 0sn.A00, 4, true);
                        }
                    }
                    r4.A0U.DeP(r17, r3, i);
                    AnonymousClass9IV r5 = new AnonymousClass9IV(AnonymousClass3PG.NETWORK, AnonymousClass05K.A00);
                    C228472lj r42 = r4.A0A;
                    0qQ.A0A(r42);
                    r42.A06(r5, r17, r3, "network fail", A00());
                }
            } finally {
                AnonymousClass0fD.A0A(-1100109834, A032);
            }
        }
    }

    public final void onFailInBackground(C268654dm r8) {
        String clientFacingErrorMessage;
        String clientFacingErrorMessage2;
        int A032 = AnonymousClass0fD.A03(1599741089);
        0qQ.A0B(r8, 0);
        C228552lr r1 = this.A04;
        UserSession userSession = r1.A0J;
        IgSignalsTtncEstimator A002 = 1HH.A00(userSession);
        if (A002 != null) {
            A002.A03();
        }
        C228622ly r12 = r1.A0U;
        AnonymousClass1GU r0 = this.A03;
        r12.DeQ(r0);
        1FI r2 = r0.A00.A04;
        boolean z = false;
        if (r2 == 1FI.A06) {
            z = true;
        }
        String str = "";
        if (z) {
            C228292lF A003 = C228282lE.A00(userSession);
            1XP r02 = (1XP) r8.A00();
            if (!(r02 == null || (clientFacingErrorMessage2 = r02.getClientFacingErrorMessage()) == null)) {
                str = clientFacingErrorMessage2;
            }
            Long l = A003.A00;
            if (l != null) {
                A003.A02.flowEndFail(l.longValue(), str, (String) null);
            }
            A003.A00 = null;
        } else if (r2 == 1FI.A0J) {
            C228292lF A004 = C228282lE.A00(userSession);
            1XP r03 = (1XP) r8.A00();
            if (!(r03 == null || (clientFacingErrorMessage = r03.getClientFacingErrorMessage()) == null)) {
                str = clientFacingErrorMessage;
            }
            Long l2 = A004.A01;
            if (l2 != null) {
                A004.A02.flowEndFail(l2.longValue(), str, (String) null);
            }
            A004.A01 = null;
        }
        AnonymousClass0fD.A0A(885655556, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(266651858);
        AnonymousClass1GU r5 = this.A03;
        boolean z = r5 instanceof AnonymousClass1GS;
        if (z) {
            C228552lr r7 = this.A04;
            if (C228552lr.A01(r7).A01 == C241313Os.LOADING) {
                if (!182.A06(0Tu.A05, r7.A0J, 36317620689376656L) || r5.A00.A04 == 1FI.A06 || 0qQ.A0K(r7.A04, r5)) {
                    C228552lr.A01(r7).A00(C241313Os.LOADED);
                }
            }
        }
        C228552lr r4 = this.A04;
        r4.A0U.DeU(r5);
        synchronized (r4.A0Y) {
            if (z) {
                try {
                    Map map = r4.A0Z;
                    1FS r0 = r5.A00;
                    map.put(new 0eP(r0.A0A, r0.A08), C241313Os.LOADED);
                } catch (Throwable th) {
                    AnonymousClass0fD.A0A(1372463728, A032);
                    throw th;
                }
            }
            AnonymousClass9IV r1 = new AnonymousClass9IV(AnonymousClass3PG.NETWORK, AnonymousClass05K.A00);
            C228472lj r02 = r4.A0A;
            if (r02 != null) {
                r02.A05(r1);
            }
        }
        boolean z2 = false;
        if (r5.A00.A04 == 1FI.A06) {
            z2 = true;
        }
        if (z2 || 0qQ.A0K(r4.A04, r5)) {
            r4.A04 = null;
        }
        C228552lr.A03(r4);
        C238243Bc.A00(r4.A0J).A01 = null;
        AnonymousClass0fD.A0A(-1089131208, A032);
    }

    /* JADX WARNING: type inference failed for: r0v34, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c5, code lost:
        if (r5.A0D.containsKey("cached_feed_item_ids") != false) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r14 = this;
            r0 = 1476163348(0x57fc7714, float:5.55176734E14)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.2lr r7 = r14.A04
            X.3Do r0 = X.C228552lr.A01(r7)
            X.3Os r9 = X.C241313Os.LOADING
            r0.A00(r9)
            X.1GU r4 = r14.A03
            X.1FS r5 = r4.A00
            X.2ly r0 = r7.A0U
            r0.Dek(r4)
            java.lang.Object r6 = r7.A0Y
            monitor-enter(r6)
            java.util.Map r8 = r7.A0Z     // Catch:{ all -> 0x011f }
            java.lang.String r2 = r5.A0A     // Catch:{ all -> 0x011f }
            java.lang.String r1 = r5.A08     // Catch:{ all -> 0x011f }
            X.0eP r0 = new X.0eP     // Catch:{ all -> 0x011f }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x011f }
            r8.put(r0, r9)     // Catch:{ all -> 0x011f }
            boolean r13 = r5.A02()     // Catch:{ all -> 0x011f }
            if (r13 == 0) goto L_0x0099
            X.2l3 r9 = r7.A0M     // Catch:{ all -> 0x011f }
            X.1Gs r0 = r9.A0H     // Catch:{ all -> 0x011f }
            X.1Gu r0 = r0.A02     // Catch:{ all -> 0x011f }
            X.1Gw r8 = r0.A03     // Catch:{ all -> 0x011f }
            java.lang.String r1 = "FEED_REQUEST_START"
            X.1Gq r0 = r8.A01     // Catch:{ all -> 0x011f }
            r0.A02(r1)     // Catch:{ all -> 0x011f }
            com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r1 = r8.A00()     // Catch:{ all -> 0x011f }
            X.1Gx r0 = X.1Gx.A07     // Catch:{ all -> 0x011f }
            r1.A00(r0)     // Catch:{ all -> 0x011f }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x011f }
            r9.A0O = r0     // Catch:{ all -> 0x011f }
            com.facebook.common.callercontext.CallerContext r0 = X.2Lk.A08     // Catch:{ all -> 0x011f }
            android.content.Context r0 = r9.A0A     // Catch:{ all -> 0x011f }
            com.instagram.common.session.UserSession r9 = r9.A0F     // Catch:{ all -> 0x011f }
            X.2Lk r11 = X.2Lo.A00(r0, r9)     // Catch:{ all -> 0x011f }
            com.instagram.common.session.UserSession r12 = r11.A04     // Catch:{ all -> 0x011f }
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r12)     // Catch:{ all -> 0x011f }
            X.2Do r0 = new X.2Do     // Catch:{ all -> 0x011f }
            r0.<init>()     // Catch:{ all -> 0x011f }
            r1.A05(r0)     // Catch:{ all -> 0x011f }
            boolean r0 = X.2Lk.A03(r11)     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x0085
            X.1Hb r10 = X.AnonymousClass1HI.A02     // Catch:{ all -> 0x011f }
            X.0qQ.A07(r10)     // Catch:{ all -> 0x011f }
            X.0Tu r8 = X.0Tu.A05     // Catch:{ all -> 0x011f }
            r0 = 36607702775895657(0x820e8300001669, double:3.214196870639196E-306)
            long r0 = X.182.A01(r8, r12, r0)     // Catch:{ all -> 0x011f }
            int r8 = (int) r0     // Catch:{ all -> 0x011f }
            X.3Oy r0 = new X.3Oy     // Catch:{ all -> 0x011f }
            r0.<init>(r11, r8)     // Catch:{ all -> 0x011f }
            r10.Eyo(r0)     // Catch:{ all -> 0x011f }
        L_0x0085:
            X.2I1 r1 = X.2Hz.A00(r9)     // Catch:{ all -> 0x011f }
            if (r1 == 0) goto L_0x0090
            java.lang.String r0 = "main_feed_request_start"
            r1.A04(r0)     // Catch:{ all -> 0x011f }
        L_0x0090:
            com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger r0 = X.2Hi.A00(r9)     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x0099
            r0.onLogMainFeedRequestStart()     // Catch:{ all -> 0x011f }
        L_0x0099:
            X.2lj r8 = r7.A0A     // Catch:{ all -> 0x011f }
            if (r8 == 0) goto L_0x00f4
            X.2lG r1 = r8.A0a     // Catch:{ all -> 0x011f }
            java.lang.String r0 = "FEED_REQUEST_STARTED"
            r1.A00(r0)     // Catch:{ all -> 0x011f }
            X.2rI r0 = r8.A06     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x00ab
            r0.notifyDataSetChangedSmart()     // Catch:{ all -> 0x011f }
        L_0x00ab:
            r9 = 0
            r12 = 1
            if (r13 == 0) goto L_0x00bd
            X.2jw r11 = r8.A0n     // Catch:{ all -> 0x011f }
            X.1FI r10 = r5.A04     // Catch:{ all -> 0x011f }
            X.1FI r1 = X.1FI.A0J     // Catch:{ all -> 0x011f }
            r0 = 0
            if (r10 != r1) goto L_0x00b9
            r0 = 1
        L_0x00b9:
            r11.A0V(r12, r0)     // Catch:{ all -> 0x011f }
            goto L_0x00c7
        L_0x00bd:
            java.util.Map r1 = r5.A0D     // Catch:{ all -> 0x011f }
            java.lang.String r0 = "cached_feed_item_ids"
            boolean r0 = r1.containsKey(r0)     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x00d5
        L_0x00c7:
            X.2lo r0 = r8.A0i     // Catch:{ all -> 0x011f }
            r0.A00()     // Catch:{ all -> 0x011f }
            X.2jw r0 = r8.A0n     // Catch:{ all -> 0x011f }
            X.3Az r0 = r0.A0B     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x00d5
            r0.A08()     // Catch:{ all -> 0x011f }
        L_0x00d5:
            boolean r0 = r8.A0M     // Catch:{ all -> 0x011f }
            if (r0 != 0) goto L_0x00e6
            X.1FI r1 = r5.A04     // Catch:{ all -> 0x011f }
            X.1FI r0 = X.1FI.A0G     // Catch:{ all -> 0x011f }
            if (r1 == r0) goto L_0x00e4
            boolean r0 = r4 instanceof X.AnonymousClass1GS     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x00e4
            r9 = 1
        L_0x00e4:
            r8.A0M = r9     // Catch:{ all -> 0x011f }
        L_0x00e6:
            X.1FQ r0 = r5.A05     // Catch:{ all -> 0x011f }
            java.lang.Integer r1 = r0.A01     // Catch:{ all -> 0x011f }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x011f }
            if (r1 == r0) goto L_0x00f4
            java.lang.String r0 = r5.A09     // Catch:{ all -> 0x011f }
            r8.A0J = r0     // Catch:{ all -> 0x011f }
            r8.A0I = r2     // Catch:{ all -> 0x011f }
        L_0x00f4:
            monitor-exit(r6)
            com.instagram.common.session.UserSession r0 = r7.A0J
            com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator r2 = X.1HH.A00(r0)
            if (r2 == 0) goto L_0x010a
            X.1FI r1 = r5.A04
            X.1FI r0 = X.1FI.A06
            if (r1 != r0) goto L_0x0111
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0105:
            boolean r0 = r4 instanceof X.AnonymousClass1GS
            r2.A05(r1, r0)
        L_0x010a:
            r0 = -131401131(0xfffffffff82afa55, float:-1.3871372E34)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0111:
            X.1FI r0 = X.1FI.A0M
            if (r1 != r0) goto L_0x0118
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x0105
        L_0x0118:
            X.1FI r0 = X.1FI.A0G
            if (r1 == r0) goto L_0x010a
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x0105
        L_0x011f:
            r1 = move-exception
            monitor-exit(r6)
            r0 = -1130538734(0xffffffffbc9d5912, float:-0.019207511)
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228832mP.onStart():void");
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean contains;
        int i;
        int A032 = AnonymousClass0fD.A03(14584813);
        1XM r6 = (1XM) obj;
        int A033 = AnonymousClass0fD.A03(-500264476);
        0qQ.A0B(r6, 0);
        Set set = this.A01;
        synchronized (set) {
            try {
                contains = set.contains(r6);
            } catch (Throwable th) {
                AnonymousClass0fD.A0A(1561083996, A033);
                throw th;
            }
        }
        if (contains) {
            i = -747145369;
        } else {
            A01(r6, false);
            i = -1587953592;
        }
        AnonymousClass0fD.A0A(i, A033);
        AnonymousClass0fD.A0A(1380035401, A032);
    }
}
