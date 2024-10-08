package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2lr  reason: invalid class name and case insensitive filesystem */
public final class C228552lr {
    public long A00;
    public long A01;
    public long A02;
    public AnonymousClass1GU A03;
    public AnonymousClass1GU A04;
    public AnonymousClass1GU A05;
    public MainFeedLocalDataSource A06;
    public C243433Yt A07;
    public C63657L1t A08;
    public 1V0 A09;
    public C228472lj A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public long A0E;
    public C238823Do A0F;
    public final Context A0G;
    public final Handler A0H;
    public final AnonymousClass07i A0I;
    public final UserSession A0J;
    public final 0tp A0K;
    public final C228542lq A0L;
    public final AnonymousClass2l3 A0M;
    public final C228302lG A0N;
    public final C228592lv A0O;
    public final C228612lx A0P;
    public final C228572lt A0Q;
    public final 1UN A0R;
    public final C228562ls A0S;
    public final AnonymousClass2lH A0T;
    public final C228622ly A0U;
    public final AnonymousClass2lZ A0V;
    public final C228232l0 A0W;
    public final C249763kK A0X;
    public final Object A0Y;
    public final Map A0Z;
    public final AtomicBoolean A0a = new AtomicBoolean(false);
    public final boolean A0b;
    public final boolean A0c;
    public volatile Runnable A0d;
    public volatile boolean A0e;

    public final void A06(1UV r13, C233992wo r14, AnonymousClass46L r15, List list, int i, boolean z) {
        C233992wo r7 = r14;
        0qQ.A0B(r14, 0);
        1UV r4 = r13;
        AnonymousClass46L r8 = r15;
        List list2 = list;
        int i2 = i;
        if (!this.A0b) {
            C228612lx r6 = this.A0P;
            r6.A01.ATE(new AnonymousClass46N(r4, this.A0J, r6, r7, r8, list2, i2, z));
            return;
        }
        synchronized (this.A0Y) {
            MainFeedLocalDataSource mainFeedLocalDataSource = this.A06;
            if (mainFeedLocalDataSource == null) {
                0qQ.A0F("mainFeedLocalDataSource");
                throw AnonymousClass00P.createAndThrow();
            }
            C228612lx r62 = mainFeedLocalDataSource.A0A;
            r62.A01.ATE(new AnonymousClass46N(r4, mainFeedLocalDataSource.A09, r62, r7, r8, list2, i2, false));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0094, code lost:
        if (r12 >= java.util.concurrent.TimeUnit.SECONDS.toMillis(X.182.A01(r7, X.C238243Bc.A00(r4).A02, 36599095661694363L))) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0096, code lost:
        r10 = X.C238243Bc.A00(r4);
        r3 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a9, code lost:
        if (X.182.A01(r7, r3, 36599095665102251L) <= 0) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ab, code lost:
        r0 = r10.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00af, code lost:
        if (r0 == null) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b1, code lost:
        r5 = new X.0eP("short", java.lang.Long.valueOf(r0.longValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x013e, code lost:
        r0 = java.lang.Long.valueOf(X.182.A01(r7, r3, 36599095661497753L));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01c0, code lost:
        if (X.C238253Bd.A00(X.182.A04(r7, r4, 36880570643054931L)) != false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.1XM r21, X.AnonymousClass3PG r22, java.util.List r23, long r24) {
        /*
            r20 = this;
            r11 = 0
            r0 = 2
            r8 = r22
            X.0qQ.A0B(r8, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.9IV r9 = new X.9IV
            r9.<init>((X.AnonymousClass3PG) r8, (java.lang.Integer) r0)
            r14 = r21
            r5 = r24
            r14.mResponseTimestamp = r5
            r2 = r23
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            r15 = r20
            if (r0 == 0) goto L_0x002e
            java.util.List r0 = r14.A00()
            r0.size()
            X.2lx r1 = r15.A0P
            com.instagram.common.session.UserSession r0 = r15.A0J
            r1.A01(r0, r2)
        L_0x002e:
            boolean r0 = r14.A0O
            if (r0 != 0) goto L_0x00f7
            com.instagram.common.session.UserSession r4 = r15.A0J
            android.content.Context r10 = r15.A0G
            long r2 = r15.A0E
            X.3Bd r0 = X.C238243Bc.A00(r4)
            com.instagram.common.session.UserSession r12 = r0.A02
            X.0Tu r7 = X.0Tu.A05
            r0 = 36317620686361979(0x8106af0019157b, double:3.0307477891512795E-306)
            boolean r0 = X.182.A06(r7, r12, r0)
            if (r0 == 0) goto L_0x0254
            r12 = 0
        L_0x004d:
            java.lang.System.currentTimeMillis()
            X.3Bd r0 = X.C238243Bc.A00(r4)
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0247
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r24
            X.3PG r0 = X.AnonymousClass3PG.LOCAL
            if (r8 != r0) goto L_0x0210
            X.3Bd r0 = X.C238243Bc.A00(r4)
            com.instagram.common.session.UserSession r2 = r0.A02
            r0 = 36880570639450446(0x8306af0014014e, double:3.386759606301939E-306)
            java.lang.String r1 = X.182.A04(r7, r2, r0)
            int r0 = r1.hashCode()
            r6 = 0
            java.lang.String r2 = "short"
            switch(r0) {
                case -2119608402: goto L_0x014d;
                case -2118744030: goto L_0x018f;
                case 2007348558: goto L_0x01c4;
                default: goto L_0x007d;
            }
        L_0x007d:
            X.3Bd r0 = X.C238243Bc.A00(r4)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            com.instagram.common.session.UserSession r3 = r0.A02
            r0 = 36599095661694363(0x8206af00040d9b, double:3.208753696960231E-306)
            long r0 = X.182.A01(r7, r3, r0)
            long r5 = r5.toMillis(r0)
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0210
        L_0x0096:
            X.3Bd r10 = X.C238243Bc.A00(r4)
            com.instagram.common.session.UserSession r3 = r10.A02
            r0 = 36599095665102251(0x8206af00380dab, double:3.208753699115393E-306)
            long r12 = X.182.A01(r7, r3, r0)
            r5 = 0
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x013e
            java.lang.Long r0 = r10.A01()
            if (r0 == 0) goto L_0x013e
        L_0x00b1:
            long r0 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.0eP r5 = new X.0eP
            r5.<init>(r2, r0)
        L_0x00be:
            java.lang.Object r3 = r5.A00
            java.lang.Object r0 = r5.A01
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.0eP r2 = new X.0eP
            r2.<init>(r3, r0)
        L_0x00d1:
            java.lang.Object r3 = r2.A00
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r2.A01
            java.lang.Number r0 = (java.lang.Number) r0
            long r18 = r0.longValue()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r15.A00 = r0
            X.495 r2 = new X.495
            r2.<init>(r9, r14, r8, r15)
            boolean r0 = r15.A0e
            if (r0 == 0) goto L_0x00f8
            r18 = 0
            java.lang.String r17 = "immediate"
            r16 = r2
            A02(r14, r15, r16, r17, r18)
            r15.A0e = r11
        L_0x00f7:
            return
        L_0x00f8:
            r15.A0d = r2
            com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator r13 = X.1HH.A00(r4)
            if (r13 == 0) goto L_0x0136
            X.0sa r0 = r13.A0D
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            X.4Cq r6 = r13.A0E
            r5 = 0
            X.MG1 r8 = new X.MG1
            r8.<init>((com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator) r13, (X.AnonymousClass4D7) r5, (long) r0)
            X.19B r7 = X.19B.A00
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            X.1Eo.A03(r4, r7, r8, r6)
            boolean r0 = r13.A0F
            if (r0 == 0) goto L_0x0136
            X.MN0 r12 = new X.MN0
            r17 = r3
            r16 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r1 = 29
            X.MH0 r0 = new X.MH0
            r0.<init>((java.lang.Object) r12, (java.lang.Object) r13, (X.AnonymousClass4D7) r5, (int) r1)
            X.1Eo.A03(r4, r7, r0, r6)
            boolean r0 = r13.A0G
            if (r0 == 0) goto L_0x00f7
        L_0x0136:
            r17 = r3
            r16 = r2
            A02(r14, r15, r16, r17, r18)
            return
        L_0x013e:
            r0 = 36599095661497753(0x8206af00010d99, double:3.208753696835894E-306)
            long r0 = X.182.A01(r7, r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x00b1
        L_0x014d:
            java.lang.String r0 = "UNSEEN_AD"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007d
            java.util.List r0 = r14.A00()
            java.util.Iterator r5 = r0.iterator()
        L_0x015d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0210
            java.lang.Object r1 = r5.next()
            X.1Xg r1 = (X.1Xg) r1
            boolean r0 = X.AnonymousClass3VP.A00(r1)
            if (r0 == 0) goto L_0x015d
            X.1Xn r3 = r1.A05
            X.1Xj r0 = X.1Xi.A02(r3)
            if (r0 == 0) goto L_0x015d
            X.1Ua r1 = X.1UX.A00(r10, r4)
            X.1Xj r0 = X.1Xi.A02(r3)
            if (r0 == 0) goto L_0x018d
            java.lang.String r0 = r0.getId()
        L_0x0185:
            boolean r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x015d
            goto L_0x0096
        L_0x018d:
            r0 = r6
            goto L_0x0185
        L_0x018f:
            java.lang.String r0 = "FLASH_FEED_SLOW_NETWORK"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007d
            X.3Bd r0 = X.C238243Bc.A00(r4)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            com.instagram.common.session.UserSession r3 = r0.A02
            r0 = 36599095661694363(0x8206af00040d9b, double:3.208753696960231E-306)
            long r0 = X.182.A01(r7, r3, r0)
            long r5 = r5.toMillis(r0)
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0210
            X.C238243Bc.A00(r4)
            r0 = 36880570643054931(0x8306af004b0153, double:3.38675960858143E-306)
            java.lang.String r0 = X.182.A04(r7, r4, r0)
            boolean r0 = X.C238253Bd.A00(r0)
            if (r0 == 0) goto L_0x0210
            goto L_0x0096
        L_0x01c4:
            java.lang.String r0 = "UNSEEN_SERVER"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007d
            java.lang.Boolean r0 = r14.A0C
            if (r0 == 0) goto L_0x0210
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0210
            java.util.List r0 = r14.A00()
            java.util.Iterator r5 = r0.iterator()
        L_0x01de:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0210
            java.lang.Object r1 = r5.next()
            X.1Xg r1 = (X.1Xg) r1
            boolean r0 = X.AnonymousClass3VP.A00(r1)
            if (r0 == 0) goto L_0x01de
            X.1Xn r3 = r1.A05
            X.1Xj r0 = X.1Xi.A02(r3)
            if (r0 == 0) goto L_0x01de
            X.1Ua r1 = X.1UX.A00(r10, r4)
            X.1Xj r0 = X.1Xi.A02(r3)
            if (r0 == 0) goto L_0x020e
            java.lang.String r0 = r0.getId()
        L_0x0206:
            boolean r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x01de
            goto L_0x0096
        L_0x020e:
            r0 = r6
            goto L_0x0206
        L_0x0210:
            X.3Bd r1 = X.C238243Bc.A00(r4)
            java.lang.Long r0 = r1.A01()
            if (r0 == 0) goto L_0x022b
            long r12 = r0.longValue()
        L_0x021e:
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            java.lang.String r0 = "long"
            X.0eP r5 = new X.0eP
            r5.<init>(r0, r1)
            goto L_0x00be
        L_0x022b:
            com.instagram.common.session.UserSession r2 = r1.A02
            r0 = 36599095661563290(0x8206af00020d9a, double:3.20875369687734E-306)
            long r12 = X.182.A01(r7, r2, r0)
            r0 = 36612543204170077(0x8212ea0002195d, double:3.2172579769707796E-306)
            long r5 = X.182.A01(r7, r2, r0)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x021e
            long r12 = r12 + r5
            goto L_0x021e
        L_0x0247:
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            java.lang.String r0 = "immediate"
            X.0eP r2 = new X.0eP
            r2.<init>(r0, r1)
            goto L_0x00d1
        L_0x0254:
            r12 = 400(0x190, double:1.976E-321)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r2
            long r12 = r12 - r0
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228552lr.A07(X.1XM, X.3PG, java.util.List, long):void");
    }

    public final void A08(AnonymousClass3PG r12, String str) {
        AnonymousClass1GU r1;
        if (this.A0D) {
            AnonymousClass1GU r2 = this.A03;
            if (r2 != null) {
                C228482lk.A00(this.A0J).A06(r2, "Prevent DeadLock on mLock");
                return;
            }
            return;
        }
        synchronized (this.A0Y) {
            C228472lj r5 = this.A0A;
            if (r5 != null) {
                UserSession userSession = this.A0J;
                String str2 = str;
                if (182.A06(0Tu.A05, userSession, 36313265588602723L) && (r1 = this.A03) != null) {
                    C228482lk.A00(userSession).A07(r1, str);
                }
                AnonymousClass1GU r8 = this.A03;
                if (r8 == null) {
                    r8 = A00(this);
                    this.A03 = r8;
                }
                r5.A06(new AnonymousClass9IV(r12, AnonymousClass05K.A01), AnonymousClass7BQ.A00(), r8, str2, true);
            }
            this.A03 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        if (X.182.A06(X.0Tu.A05, r4.A00, 36329337355518010L) == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0090, code lost:
        if (r6 != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0092, code lost:
        r12 = r4.A00;
        r10 = X.0Tu.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009f, code lost:
        if (X.182.A06(r10, r12, 36329337355583547L) != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00aa, code lost:
        if (X.182.A06(r10, r12, 36328151945329634L) == false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ac, code lost:
        r24 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ae, code lost:
        r10 = r4.A00;
        r20 = X.182.A01(X.0Tu.A05, r10, 36596462846478837L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bf, code lost:
        if ((r5 instanceof X.C228842mQ) == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        r0 = X.1P1.A00(r10).A05(new X.C292865je(r8), r4.A01, "main_feed", r20, true, r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d6, code lost:
        if (r0 != r15) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e6, code lost:
        if (r6 == false) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e8, code lost:
        r0 = X.1GZ.A00(r10).A05(new X.C228852mR(r8), r4.A01, "main_feed", r20, true, r23, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fe, code lost:
        r24 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0220, code lost:
        throw new java.lang.RuntimeException();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.C228472lj r26, boolean r27) {
        /*
            r25 = this;
            r11 = 0
            r2 = 0
            r3 = r25
            r3.A0F = r2
            com.instagram.common.session.UserSession r9 = r3.A0J
            X.2ll r0 = X.C228482lk.A00(r9)
            r0.A01 = r2
            r0.A03 = r2
            r0.A00 = r2
            java.util.ArrayList r0 = r0.A06
            r0.clear()
            java.lang.Object r7 = r3.A0Y
            monitor-enter(r7)
            r13 = 0
            r3.A0D = r11     // Catch:{ all -> 0x0224 }
            r0 = r26
            r3.A0A = r0     // Catch:{ all -> 0x0224 }
            monitor-exit(r7)
            if (r27 == 0) goto L_0x002c
            X.1FI r0 = X.1FI.A0M
            r3.A0B(r0, r2, r2)
        L_0x0029:
            monitor-enter(r7)
            goto L_0x0111
        L_0x002c:
            X.1Cj r0 = X.1Ci.A00(r9)
            java.lang.Object r1 = X.1Cj.A09
            monitor-enter(r1)
            X.1GU r5 = r0.A02     // Catch:{ all -> 0x0221 }
            r0.A02 = r2     // Catch:{ all -> 0x0221 }
            r0.A03 = r11     // Catch:{ all -> 0x0221 }
            monitor-exit(r1)
            r3.A05 = r5
            java.lang.Integer r15 = X.AnonymousClass05K.A0C
            if (r5 == 0) goto L_0x00d8
            X.0wX r0 = X.C61170le.A00
            X.18g r4 = X.C638918c.A01(r0)
            java.lang.String r1 = "MAIN_FRAGMENT_CONNECT_PREFETCH_REQUEST"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r4.A02
            r4.A0O(r0, r1)
            boolean r0 = r5 instanceof X.AnonymousClass1GT
            if (r0 == 0) goto L_0x0107
            java.lang.String r10 = "This operation must be run on UI thread."
            X.11Z.A06(r10)
            X.2lv r4 = r3.A0O
            boolean r6 = r5 instanceof X.AnonymousClass1GS
            if (r6 == 0) goto L_0x0101
            X.0Tu r8 = X.0Tu.A05
            r0 = 36329337355649084(0x8111570002403c, double:3.038157457987685E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x006b:
            X.0qQ.A0A(r0)
            boolean r0 = r0.booleanValue()
            r14 = 1
            X.2mP r8 = new X.2mP
            r8.<init>(r5, r3, r14, r0)
            X.11Z.A06(r10)
            if (r6 == 0) goto L_0x008e
            com.instagram.common.session.UserSession r12 = r4.A00
            X.0Tu r10 = X.0Tu.A05
            r0 = 36329337355518010(0x8111570000403a, double:3.038157457904793E-306)
            boolean r0 = X.182.A06(r10, r12, r0)
            r23 = 0
            if (r0 != 0) goto L_0x0092
        L_0x008e:
            r23 = 1
            if (r6 == 0) goto L_0x00fe
        L_0x0092:
            com.instagram.common.session.UserSession r12 = r4.A00
            X.0Tu r10 = X.0Tu.A05
            r0 = 36329337355583547(0x8111570001403b, double:3.038157457946239E-306)
            boolean r0 = X.182.A06(r10, r12, r0)
            if (r0 != 0) goto L_0x00ac
            r0 = 36328151945329634(0x811043000c3be2, double:3.0374077997284006E-306)
            boolean r0 = X.182.A06(r10, r12, r0)
            if (r0 == 0) goto L_0x00fe
        L_0x00ac:
            r24 = 1
        L_0x00ae:
            com.instagram.common.session.UserSession r10 = r4.A00
            X.0Tu r12 = X.0Tu.A05
            r0 = 36596462846478837(0x82044a000009f5, double:3.207088694016436E-306)
            long r20 = X.182.A01(r12, r10, r0)
            java.lang.String r19 = "main_feed"
            boolean r0 = r5 instanceof X.C228842mQ
            if (r0 == 0) goto L_0x00e6
            X.1P2 r16 = X.1P1.A00(r10)
            X.5je r0 = new X.5je
            r0.<init>(r8)
            X.4D6 r1 = r4.A01
            r22 = r14
            r17 = r0
            r18 = r1
            java.lang.Integer r0 = r16.A05(r17, r18, r19, r20, r22, r23)
        L_0x00d6:
            if (r0 != r15) goto L_0x0029
        L_0x00d8:
            X.3Yt r0 = r3.A07
            if (r0 != 0) goto L_0x00e3
            X.1FI r0 = X.1FI.A06
        L_0x00de:
            r3.A0B(r0, r2, r2)
            goto L_0x0029
        L_0x00e3:
            X.1FI r0 = X.1FI.A0M
            goto L_0x00de
        L_0x00e6:
            if (r6 == 0) goto L_0x021b
            X.1Ga r16 = X.1GZ.A00(r10)
            X.2mR r0 = new X.2mR
            r0.<init>(r8)
            X.4D6 r1 = r4.A01
            r22 = r14
            r17 = r0
            r18 = r1
            java.lang.Integer r0 = r16.A05(r17, r18, r19, r20, r22, r23, r24)
            goto L_0x00d6
        L_0x00fe:
            r24 = 0
            goto L_0x00ae
        L_0x0101:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            goto L_0x006b
        L_0x0107:
            boolean r0 = r5 instanceof X.C228972md
            if (r0 != 0) goto L_0x00d8
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0111:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0224 }
            r3.A0E = r0     // Catch:{ all -> 0x0224 }
            r0 = 0
            r3.A00 = r0     // Catch:{ all -> 0x0224 }
            X.0Tu r4 = X.0Tu.A05     // Catch:{ all -> 0x0224 }
            r0 = 36323706653519271(0x810c3800022da7, double:3.0345965792877736E-306)
            boolean r0 = X.182.A06(r4, r9, r0)     // Catch:{ all -> 0x0224 }
            if (r0 == 0) goto L_0x0138
            X.1GU r0 = r3.A05     // Catch:{ all -> 0x0224 }
            if (r0 == 0) goto L_0x0138
            X.1FS r0 = r0.A00     // Catch:{ all -> 0x0224 }
            java.lang.String r0 = r0.A07     // Catch:{ all -> 0x0224 }
            if (r0 == 0) goto L_0x0138
            int r0 = r0.length()     // Catch:{ all -> 0x0224 }
            if (r0 != 0) goto L_0x0139
        L_0x0138:
            r13 = 1
        L_0x0139:
            boolean r0 = r3.A0b     // Catch:{ all -> 0x0224 }
            if (r0 != 0) goto L_0x018f
            X.1UN r8 = r3.A0R     // Catch:{ all -> 0x0224 }
            com.instagram.common.session.UserSession r5 = r8.A03     // Catch:{ all -> 0x0224 }
            r0 = 36314914855652239(0x81043900050b8f, double:3.029036610914934E-306)
            boolean r0 = X.182.A06(r4, r5, r0)     // Catch:{ all -> 0x0224 }
            if (r0 == 0) goto L_0x018b
            boolean r0 = r8.A08     // Catch:{ all -> 0x0224 }
            if (r0 == 0) goto L_0x0180
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.A05     // Catch:{ all -> 0x0224 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0224 }
            if (r0 == 0) goto L_0x0180
        L_0x0158:
            X.4Cq r6 = r8.A07     // Catch:{ all -> 0x0224 }
            X.9K9 r5 = new X.9K9     // Catch:{ all -> 0x0224 }
            r14 = r5
            r15 = r8
            r16 = r3
            r17 = r2
            r18 = r11
            r19 = r13
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0224 }
            X.19B r1 = X.19B.A00     // Catch:{ all -> 0x0224 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0224 }
            X.1Eo.A03(r0, r1, r5, r6)     // Catch:{ all -> 0x0224 }
        L_0x0170:
            X.2md r5 = A00(r3)     // Catch:{ all -> 0x0224 }
            r3.A03 = r5     // Catch:{ all -> 0x0224 }
            r0 = 36313265588602723(0x8102b9000b0763, double:3.027993607791755E-306)
            boolean r0 = X.182.A06(r4, r9, r0)     // Catch:{ all -> 0x0224 }
            goto L_0x01ba
        L_0x0180:
            r0 = 36314914855914387(0x81043900090b93, double:3.0290366110807176E-306)
            boolean r0 = X.182.A06(r4, r5, r0)     // Catch:{ all -> 0x0224 }
            if (r0 == 0) goto L_0x0158
        L_0x018b:
            X.1UN.A02(r8, r3, r13)     // Catch:{ all -> 0x0224 }
            goto L_0x0170
        L_0x018f:
            com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource r6 = r3.A06     // Catch:{ all -> 0x0224 }
            if (r6 != 0) goto L_0x0199
            java.lang.String r0 = "mainFeedLocalDataSource"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x0224 }
            goto L_0x0213
        L_0x0199:
            X.L1t r0 = r3.A08     // Catch:{ all -> 0x0224 }
            if (r0 != 0) goto L_0x01a3
            java.lang.String r0 = "localSourceDelegate"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x0224 }
            goto L_0x0213
        L_0x01a3:
            X.4Cq r5 = r6.A0G     // Catch:{ all -> 0x0224 }
            r18 = 20
            X.JTe r1 = new X.JTe     // Catch:{ all -> 0x0224 }
            r14 = r1
            r15 = r0
            r16 = r6
            r17 = r2
            r19 = r13
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0224 }
            X.19B r0 = X.19B.A00     // Catch:{ all -> 0x0224 }
            X.1Eo.A05(r0, r1, r5)     // Catch:{ all -> 0x0224 }
            goto L_0x0170
        L_0x01ba:
            if (r0 == 0) goto L_0x01f4
            X.2ll r8 = X.C228482lk.A00(r9)     // Catch:{ all -> 0x0224 }
            java.lang.String r10 = "CACHED"
            java.lang.String r9 = "feed_repository"
            monitor-enter(r8)     // Catch:{ all -> 0x0224 }
            X.1FS r6 = r5.A00     // Catch:{ all -> 0x0218 }
            X.1QP r4 = r8.A04     // Catch:{ all -> 0x0218 }
            int r1 = r6.A01     // Catch:{ all -> 0x0218 }
            r0 = 974460658(0x3a1516f2, float:5.687318E-4)
            long r1 = r4.generateFlowId(r0, r1)     // Catch:{ all -> 0x0218 }
            boolean r0 = r4.isOngoingFlow(r1)     // Catch:{ all -> 0x0218 }
            if (r0 != 0) goto L_0x01f3
            X.C228492ll.A01(r4, r6, r8, r9)     // Catch:{ all -> 0x0218 }
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0218 }
            r8.A02 = r0     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "FEED_REQUEST_SENT"
            r4.flowMarkPoint(r1, r0)     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "SOURCE"
            r4.flowAnnotate(r1, r0, r10)     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "CALLING_SOURCE"
            r4.flowAnnotate(r1, r0, r9)     // Catch:{ all -> 0x0218 }
            X.C228492ll.A00(r4, r5, r8)     // Catch:{ all -> 0x0218 }
        L_0x01f3:
            monitor-exit(r8)     // Catch:{ all -> 0x0224 }
        L_0x01f4:
            X.2l3 r0 = r3.A0M     // Catch:{ all -> 0x0224 }
            X.1Gs r0 = r0.A0H     // Catch:{ all -> 0x0224 }
            X.1H4 r2 = r0.A01     // Catch:{ all -> 0x0224 }
            X.1Gq r1 = r2.A01     // Catch:{ all -> 0x0224 }
            java.lang.String r0 = "CACHED_FEED_START"
            r1.A02(r0)     // Catch:{ all -> 0x0224 }
            com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r1 = r2.A00()     // Catch:{ all -> 0x0224 }
            X.1Gx r0 = X.1Gx.A07     // Catch:{ all -> 0x0224 }
            r1.A00(r0)     // Catch:{ all -> 0x0224 }
            X.2lG r1 = r3.A0N     // Catch:{ all -> 0x0224 }
            java.lang.String r0 = "FEED_REQUEST_STARTED"
            r1.A00(r0)     // Catch:{ all -> 0x0224 }
            monitor-exit(r7)
            return
        L_0x0213:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x021a
        L_0x0218:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0224 }
        L_0x021a:
            throw r0     // Catch:{ all -> 0x0224 }
        L_0x021b:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0221:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0224:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228552lr.A09(X.2lj, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.1GU, X.2md] */
    public static final C228972md A00(C228552lr r18) {
        1FI r5 = 1FI.A06;
        C228552lr r1 = r18;
        String sessionId = r1.A0X.getSessionId();
        1FQ A002 = 1FP.A00(r1.A0J, r5, (String) null, (String) null, false);
        0sm A0E2 = 0Yt.A0E();
        0sm A0E3 = 0Yt.A0E();
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        return new AnonymousClass1GU(new 1FS((1FR) null, (C62500to) null, r5, A002, (Long) null, sessionId, (String) null, (String) null, (String) null, obj, (String) null, A0E2, A0E3, 1FS.A0G.incrementAndGet(), false, false));
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.3Do, java.lang.Object] */
    public static final C238823Do A01(C228552lr r2) {
        C238823Do r0;
        synchronized (r2.A0Y) {
            C238823Do r02 = r2.A0F;
            r0 = r02;
            if (r02 == null) {
                ? obj = new Object();
                r2.A0F = obj;
                r0 = obj;
            }
        }
        return r0;
    }

    public static final void A03(C228552lr r4) {
        String str = r4.A0C;
        if (str != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("pagination_source", str);
            String str2 = r4.A0B;
            if (str2 != null) {
                r4.A0B(1FI.A0G, str2, hashMap);
            }
        }
        if (182.A06(0Tu.A05, r4.A0J, 36317620689376656L)) {
            r4.A0C = null;
            r4.A0B = null;
        }
    }

    public static final boolean A04(1XM r4, C228552lr r5) {
        if (!182.A06(0Tu.A05, r5.A0J, 2342154114433941942L) || !1Xi.A04(r4.A00()) || r5.A0a.getAndSet(true)) {
            return false;
        }
        return true;
    }

    public final Long A05() {
        Long l;
        synchronized (this.A0Y) {
            C243433Yt r0 = this.A07;
            l = null;
            if (r0 != null) {
                long j = r0.A01;
                Long valueOf = Long.valueOf(j);
                boolean z = false;
                if (j > 0) {
                    z = true;
                }
                if (z) {
                    l = valueOf;
                }
            }
        }
        return l;
    }

    public final void A0A(List list) {
        UserSession userSession = this.A0J;
        0Tu r6 = 0Tu.A05;
        if (182.A06(r6, userSession, 2342154114433089972L)) {
            C228612lx r5 = this.A0P;
            r5.A01(userSession, list);
            this.A0Q.A00(r5, new AnonymousClass46L(Integer.MAX_VALUE, (int) 182.A01(r6, userSession, 36592580196172405L)), (int) 182.A01(r6, userSession, 36592580196041332L));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0091, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A0J, 36317620685051247L) == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b6, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A0J, 36317620685051247L) == false) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x019d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0B(X.1FI r38, java.lang.String r39, java.util.Map r40) {
        /*
            r37 = this;
            r4 = r39
            r5 = 0
            r6 = r37
            X.2ls r11 = r6.A0S
            X.3Do r0 = A01(r6)
            X.3Os r10 = r0.A01
            X.1FI r7 = X.1FI.A0G
            r15 = r38
            if (r15 == r7) goto L_0x002c
            boolean r0 = X.1ua.A0F
            if (r0 == 0) goto L_0x002c
            X.1ua.A0F = r5
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x001b:
            int r1 = r0.intValue()
            r3 = 1
            if (r1 == r5) goto L_0x02e5
            r0 = 3
            if (r1 == r0) goto L_0x0076
            r0 = 2
            if (r1 != r0) goto L_0x00d6
            java.lang.Object r3 = r6.A0Y
            monitor-enter(r3)
            goto L_0x0061
        L_0x002c:
            java.lang.Long r3 = r11.A01
            long r0 = r11.A00
            boolean r2 = r15.A00()
            if (r2 == 0) goto L_0x0048
            if (r3 == 0) goto L_0x0048
            long r8 = java.lang.System.currentTimeMillis()
            long r2 = r3.longValue()
            long r8 = r8 - r2
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0048
        L_0x0045:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x001b
        L_0x0048:
            X.3Os r0 = X.C241313Os.LOADING
            if (r10 != r0) goto L_0x005e
            com.instagram.common.session.UserSession r3 = r11.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317620685575540(0x8106af000d1574, double:3.030747788653932E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0045
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x001b
        L_0x005e:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x001b
        L_0x0061:
            java.lang.Integer r2 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0073 }
            X.3PG r0 = X.AnonymousClass3PG.LOCAL     // Catch:{ all -> 0x0073 }
            X.9IV r1 = new X.9IV     // Catch:{ all -> 0x0073 }
            r1.<init>((X.AnonymousClass3PG) r0, (java.lang.Integer) r2)     // Catch:{ all -> 0x0073 }
            X.2lj r0 = r6.A0A     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x02e4
            r0.A05(r1)     // Catch:{ all -> 0x0073 }
            goto L_0x02e4
        L_0x0073:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0076:
            if (r15 == r7) goto L_0x02e3
            r2 = 0
            X.1GU r0 = r6.A04
            if (r0 == 0) goto L_0x0093
            X.1FS r0 = r0.A00
            X.1FI r0 = r0.A04
            if (r0 != r7) goto L_0x0093
            com.instagram.common.session.UserSession r9 = r6.A0J
            X.0Tu r8 = X.0Tu.A05
            r0 = 36317620685051247(0x8106af0005156f, double:3.030747788322367E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            r10 = 1
            if (r0 != 0) goto L_0x0094
        L_0x0093:
            r10 = 0
        L_0x0094:
            X.1GU r0 = r6.A04
            if (r0 == 0) goto L_0x00b8
            X.1FS r0 = r0.A00
            java.lang.String r1 = r0.A0A
            X.3kK r0 = r6.A0X
            java.lang.String r0 = r0.getSessionId()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00b8
            com.instagram.common.session.UserSession r9 = r6.A0J
            X.0Tu r8 = X.0Tu.A05
            r0 = 36317620685051247(0x8106af0005156f, double:3.030747788322367E-306)
            boolean r1 = X.182.A06(r8, r9, r0)
            r0 = 1
            if (r1 != 0) goto L_0x00b9
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            if (r10 != 0) goto L_0x00bd
            if (r0 == 0) goto L_0x02e3
        L_0x00bd:
            X.3Do r1 = A01(r6)
            X.3Os r0 = X.C241313Os.ABORTING
            r1.A00(r0)
            X.1GU r1 = r6.A04
            if (r1 == 0) goto L_0x00d4
            boolean r0 = r1 instanceof X.C228842mQ
            if (r0 == 0) goto L_0x01b0
            X.2mQ r1 = (X.C228842mQ) r1
            X.1OC r0 = r1.A00
            r0.A02 = r3
        L_0x00d4:
            r6.A04 = r2
        L_0x00d6:
            X.3Do r0 = A01(r6)
            X.3Os r0 = r0.A01
            X.3Os r9 = X.C241313Os.LOADING
            if (r0 == r9) goto L_0x02e1
            r19 = 0
            if (r15 == r7) goto L_0x00e6
            r19 = 1
        L_0x00e6:
            if (r19 == 0) goto L_0x01a8
            java.lang.String r18 = X.AnonymousClass1FM.A00()
        L_0x00ec:
            r7 = 0
            if (r19 != 0) goto L_0x01a1
            com.instagram.common.session.UserSession r3 = r6.A0J
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317105288647451(0x8106370000131b, double:3.030421849561272E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01a1
            X.0tp r0 = r6.A0K
            java.lang.String r29 = r0.BtK()
        L_0x0104:
            if (r39 != 0) goto L_0x010c
            X.3Do r0 = A01(r6)
            java.lang.String r4 = r0.A03
        L_0x010c:
            long r0 = java.lang.System.currentTimeMillis()
            r6.A01 = r0
            if (r19 == 0) goto L_0x019d
            java.lang.Integer r17 = X.AnonymousClass05K.A00
        L_0x0116:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r0 = r40
            if (r40 == 0) goto L_0x0199
            r3.<init>(r0)
        L_0x011f:
            X.2lq r1 = r6.A0L
            X.2vV r14 = r1.A00
            if (r14 == 0) goto L_0x0180
            java.lang.Integer r0 = r14.A05
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            if (r0 == r13) goto L_0x0180
            com.instagram.common.session.UserSession r0 = r1.A01
            X.2ln r0 = X.C228502lm.A00(r0)
            java.lang.Integer r2 = r14.A05
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r2 != r1) goto L_0x0196
            java.lang.String r12 = "succeeded"
        L_0x0139:
            java.lang.String r11 = r14.A01()
            if (r11 != 0) goto L_0x0141
            java.lang.String r11 = ""
        L_0x0141:
            if (r19 == 0) goto L_0x0193
            java.lang.String r10 = "head_load"
        L_0x0145:
            r16 = 2
            r8 = 976041859(0x3a2d3783, float:6.607698E-4)
            X.02m r2 = r0.A00
            com.facebook.quicklog.MarkerEditor r1 = r2.withMarker(r8)
            java.lang.String r0 = "outcome_notify"
            com.facebook.quicklog.PointEditor r1 = r1.pointEditor(r0)
            java.lang.String r0 = "refresh_outcome_feed_request_type"
            com.facebook.quicklog.PointEditor r1 = r1.addPointData(r0, r10)
            java.lang.String r0 = "refresh_outcome"
            com.facebook.quicklog.PointEditor r1 = r1.addPointData(r0, r12)
            java.lang.String r0 = "outcome_unseen_media_ids"
            com.facebook.quicklog.PointEditor r0 = r1.addPointData(r0, r11)
            r0.markerEditingCompleted()
            r0 = r16
            r2.markerEnd(r8, r0)
            java.lang.String r0 = "unseen_media_ids"
            r3.put(r0, r11)
            java.lang.String r0 = "eager_refresh_result"
            r3.put(r0, r12)
            r14.A05 = r13
            r14.A08 = r7
            r14.A06 = r13
        L_0x0180:
            com.instagram.common.session.UserSession r2 = r6.A0J
            X.0Tu r8 = X.0Tu.A05
            r0 = 36317620689573266(0x8106af004a1592, double:3.03074779118211E-306)
            boolean r0 = X.182.A06(r8, r2, r0)
            if (r0 == 0) goto L_0x01dc
            java.lang.Object r10 = r6.A0Y
            monitor-enter(r10)
            goto L_0x01bc
        L_0x0193:
            java.lang.String r10 = "tail_load"
            goto L_0x0145
        L_0x0196:
            java.lang.String r12 = "failed"
            goto L_0x0139
        L_0x0199:
            r3.<init>()
            goto L_0x011f
        L_0x019d:
            r17 = r7
            goto L_0x0116
        L_0x01a1:
            r29 = r7
            if (r19 == 0) goto L_0x0104
            r4 = r7
            goto L_0x010c
        L_0x01a8:
            X.3kK r0 = r6.A0X
            java.lang.String r18 = r0.getSessionId()
            goto L_0x00ec
        L_0x01b0:
            boolean r0 = r1 instanceof X.AnonymousClass1GS
            if (r0 == 0) goto L_0x00d4
            X.1GS r1 = (X.AnonymousClass1GS) r1
            X.1GP r0 = r1.A00
            r0.A0A = r3
            goto L_0x00d4
        L_0x01bc:
            X.0eP r11 = new X.0eP     // Catch:{ all -> 0x01d8 }
            r0 = r18
            r11.<init>(r0, r4)     // Catch:{ all -> 0x01d8 }
            java.util.Map r1 = r6.A0Z     // Catch:{ all -> 0x01d8 }
            java.lang.Object r0 = r1.get(r11)     // Catch:{ all -> 0x01d8 }
            if (r0 != r9) goto L_0x01cd
            goto L_0x02e0
        L_0x01cd:
            X.3Do r0 = A01(r6)     // Catch:{ all -> 0x01d8 }
            r0.A00(r9)     // Catch:{ all -> 0x01d8 }
            r1.put(r11, r9)     // Catch:{ all -> 0x01d8 }
            goto L_0x01db
        L_0x01d8:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x01db:
            monitor-exit(r10)
        L_0x01dc:
            boolean r0 = r6.A0b
            if (r0 != 0) goto L_0x02c4
            X.2lx r0 = r6.A0P
            boolean r0 = r0.A02()
        L_0x01e6:
            X.1FQ r24 = X.1FP.A00(r2, r15, r4, r7, r0)
            X.0tp r0 = r6.A0K
            X.0to r7 = new X.0to
            r7.<init>(r0)
            X.2lH r0 = r6.A0T
            X.2rI r0 = r0.A00
            if (r0 == 0) goto L_0x02c0
            java.util.List r0 = r0.A07()
            java.lang.String r28 = X.C271054hp.A00(r0)
        L_0x01ff:
            X.2l0 r1 = r6.A0W
            java.lang.String r0 = "feed/timeline/"
            java.util.Map r32 = r1.AUH(r0)
            r0 = 36886656606798549(0x830c38000002d5, double:3.390608396559103E-306)
            java.lang.String r9 = X.182.A04(r8, r2, r0)
            int r9 = r9.length()
            if (r9 != 0) goto L_0x02ba
            java.lang.String r0 = "hoisted_media_id"
            java.lang.Object r8 = r3.get(r0)
            java.lang.String r8 = (java.lang.String) r8
        L_0x021e:
            X.1FR r1 = new X.1FR
            r0 = r17
            r1.<init>(r0)
            java.lang.Long r25 = r6.A05()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r30 = r0.toString()
            X.0qQ.A07(r30)
            java.util.concurrent.atomic.AtomicInteger r0 = X.1FS.A0G
            int r34 = r0.incrementAndGet()
            X.1FS r0 = new X.1FS
            r22 = r7
            r23 = r15
            r26 = r18
            r27 = r4
            r31 = r8
            r33 = r3
            r35 = r5
            r36 = r5
            r20 = r0
            r21 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            X.2lv r7 = r6.A0O
            r1 = 11
            X.9LT r8 = new X.9LT
            r8.<init>(r6, r1)
            X.1Cm r3 = r7.A02
            r1 = -20
            X.1GT r5 = r3.A00(r0, r1)
            boolean r1 = r5 instanceof X.C228842mQ
            if (r1 == 0) goto L_0x02a2
            r1 = r5
            X.2mQ r1 = (X.C228842mQ) r1
            X.1OC r4 = r1.A00
            java.lang.Object r3 = r8.invoke(r5)
            X.1P0 r3 = (X.1P0) r3
            X.5je r1 = new X.5je
            r1.<init>(r3)
            r4.A00 = r1
        L_0x027a:
            X.4D6 r1 = r7.A01
            X.11X r4 = (X.AnonymousClass11X) r4
            r1.schedule(r4)
            r6.A04 = r5
            if (r19 == 0) goto L_0x0289
            boolean r1 = r5 instanceof X.AnonymousClass1GS
            if (r1 == 0) goto L_0x029d
        L_0x0289:
            int r1 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            X.1GW r2 = X.1GV.A00(r2)
            java.lang.String r1 = r0.A09
            r2.A02 = r1
            java.lang.String r0 = r0.A0A
            r2.A01 = r0
            if (r19 != 0) goto L_0x029f
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x029b:
            r2.A00 = r0
        L_0x029d:
            r0 = 1
            return r0
        L_0x029f:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x029b
        L_0x02a2:
            boolean r1 = r5 instanceof X.AnonymousClass1GS
            if (r1 == 0) goto L_0x02da
            r1 = r5
            X.1GS r1 = (X.AnonymousClass1GS) r1
            X.1GP r4 = r1.A00
            java.lang.Object r3 = r8.invoke(r5)
            X.1P0 r3 = (X.1P0) r3
            X.2mR r1 = new X.2mR
            r1.<init>(r3)
            r4.A02(r1)
            goto L_0x027a
        L_0x02ba:
            java.lang.String r8 = X.182.A04(r8, r2, r0)
            goto L_0x021e
        L_0x02c0:
            r28 = 0
            goto L_0x01ff
        L_0x02c4:
            com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource r0 = r6.A06
            if (r0 != 0) goto L_0x02d2
            java.lang.String r0 = "mainFeedLocalDataSource"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02d2:
            X.2lx r0 = r0.A0A
            boolean r0 = r0.A02()
            goto L_0x01e6
        L_0x02da:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x02e0:
            monitor-exit(r10)
        L_0x02e1:
            r0 = 0
            return r0
        L_0x02e3:
            return r3
        L_0x02e4:
            monitor-exit(r3)
        L_0x02e5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228552lr.A0B(X.1FI, java.lang.String, java.util.Map):boolean");
    }

    public /* synthetic */ C228552lr(Context context, AnonymousClass07i r20, UserSession userSession, AnonymousClass4DU r22, C228542lq r23, C228322lL r24, AnonymousClass2l3 r25, C228302lG r26, AnonymousClass2lH r27, C228312lJ r28, AnonymousClass2lZ r29, C228232l0 r30, C249763kK r31) {
        1V0 r0;
        Handler handler = new Handler(Looper.getMainLooper());
        UserSession userSession2 = userSession;
        C228562ls r8 = new C228562ls(userSession2);
        1UN A002 = 1UM.A00(userSession2);
        0ug A003 = 0tq.A00(userSession2);
        C249763kK r4 = r31;
        C228572lt r6 = new C228572lt(userSession2, r4);
        AnonymousClass07i r12 = r20;
        C228592lv r5 = new C228592lv(r12, userSession2);
        1Ua A004 = 1UX.A00(context.getApplicationContext(), userSession2);
        0qQ.A07(A004);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new 1UW(userSession2));
        arrayList.add(new 1Ug(A004));
        C228612lx r1 = new C228612lx(arrayList);
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        C228622ly r10 = new C228622ly(applicationContext, r12, userSession2, r22, r24, r28, true);
        0qQ.A0B(A002, 15);
        this.A0J = userSession2;
        this.A0I = r12;
        this.A0X = r4;
        this.A0T = r27;
        this.A0W = r30;
        this.A0M = r25;
        this.A0N = r26;
        this.A0V = r29;
        this.A0H = handler;
        this.A0S = r8;
        this.A0R = A002;
        this.A0K = A003;
        this.A0Q = r6;
        this.A0O = r5;
        this.A0P = r1;
        this.A0U = r10;
        this.A0L = r23;
        Context applicationContext2 = context.getApplicationContext();
        0qQ.A07(applicationContext2);
        this.A0G = applicationContext2;
        this.A0c = 182.A06(0Tu.A05, userSession2, 36320635752030899L);
        boolean A072 = 0yU.A07(AnonymousClass0yP.A00(36321292881765615L));
        this.A0b = A072;
        this.A0Y = new Object();
        this.A0Z = new LinkedHashMap();
        if (A072) {
            MainFeedLocalDataSource mainFeedLocalDataSource = this.A06;
            if (mainFeedLocalDataSource == null) {
                mainFeedLocalDataSource = C63310Kut.A00(userSession2);
                mainFeedLocalDataSource.A03 = r4;
                mainFeedLocalDataSource.A02 = new C228572lt(mainFeedLocalDataSource.A09, r4);
                this.A06 = mainFeedLocalDataSource;
            }
            if (this.A08 == null) {
                this.A08 = new C63657L1t(this);
            }
            if (mainFeedLocalDataSource == null) {
                0qQ.A0F("mainFeedLocalDataSource");
                throw AnonymousClass00P.createAndThrow();
            }
            r0 = mainFeedLocalDataSource.A0B;
        } else {
            r0 = ((1Uy) A002.A06.getValue()).A08;
        }
        this.A09 = r0;
    }

    public static final void A02(1XM r13, C228552lr r14, Runnable runnable, String str, long j) {
        long A002;
        1Xj A022;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - r14.A02;
        UserSession userSession = r14.A0J;
        long max = currentTimeMillis - Math.max(1Ci.A00(userSession).A00, r14.A01);
        if (0LA.A04 == null) {
            A002 = 0;
        } else {
            A002 = 0LA.A04.A01.A00();
        }
        if (C64031Cc.A09 == 1CS.A03) {
            A002 = C64031Cc.A02();
        }
        Boolean bool = null;
        Boolean bool2 = null;
        for (1Xg r5 : r13.A00()) {
            if (bool == null && AnonymousClass3VP.A00(r5)) {
                1Xj A023 = 1Xi.A02(r5.A05);
                if (A023 != null) {
                    bool = Boolean.valueOf(!1UX.A00(r14.A0G, userSession).A03(A023.getId()));
                }
            } else if (bool2 == null && AnonymousClass3VP.A04(r5) && (A022 = 1Xi.A02(r5.A05)) != null) {
                bool2 = Boolean.valueOf(!1UX.A00(r14.A0G, userSession).A03(A022.getId()));
            }
        }
        C228302lG r4 = r14.A0N;
        Boolean bool3 = r13.A0C;
        02m r52 = r4.A07;
        r52.markerStart(974462634);
        r52.markerAnnotate(974462634, "CACHE_DELAY_TYPE", str);
        r52.markerAnnotate(974462634, "TIME_SINCE_SHIMMER", j2);
        r52.markerAnnotate(974462634, "TIME_SINCE_FEED_REQUEST", max);
        r52.markerAnnotate(974462634, "TIME_SINCE_START_UP", A002);
        if (bool != null) {
            r52.markerAnnotate(974462634, "TOP_AD_UNSEEN", bool.booleanValue());
        }
        if (bool2 != null) {
            r52.markerAnnotate(974462634, "TOP_ORGANIC_UNSEEN", bool2.booleanValue());
        }
        if (bool3 != null) {
            r52.markerAnnotate(974462634, "TOP_ORGANIC_CHANGED_BY_RANK_AND_MERGE", bool3.booleanValue());
        }
        long j3 = j;
        if (j <= 0) {
            boolean A062 = 182.A06(0Tu.A05, userSession, 36317620687213955L);
            Handler handler = r14.A0H;
            if (A062) {
                handler.postAtFrontOfQueue(runnable);
            } else {
                handler.post(runnable);
            }
        } else {
            r14.A0H.postDelayed(runnable, j3);
        }
    }
}
