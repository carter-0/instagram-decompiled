package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource;
import com.instagram.mainfeed.network.FeedCacheCoordinator;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4xR  reason: invalid class name and case insensitive filesystem */
public final class C278734xR {
    public MainFeedLocalDataSource A00;
    public List A01;
    public final int A02;
    public final Context A03;
    public final UserSession A04;
    public final C252263op A05;
    public final 1Cl A06;
    public final 1Uy A07;
    public final List A08 = Collections.synchronizedList(new ArrayList());
    public final List A09 = Collections.synchronizedList(new ArrayList());
    public final AtomicBoolean A0A;
    public final boolean A0B;

    public static final synchronized void A02(AnonymousClass540 r1, C278734xR r2) {
        synchronized (r2) {
            if (r2.A08.isEmpty() && r2.A09.isEmpty()) {
                r1.AVX("feed_timeline_background_prefetch");
            }
        }
    }

    public static final void A04(AnonymousClass540 r5, C278734xR r6, boolean z) {
        C278734xR r4 = r6;
        AnonymousClass540 r3 = r5;
        if (!r6.A0B) {
            r6.A07.EwN(new C57288IVx(r5, r6, z), true);
            return;
        }
        if (r6.A00 == null) {
            r6.A00 = C63310Kut.A00(r6.A04);
        }
        AnonymousClass19S A022 = 19E.A02(AnonymousClass12T.A00.AOJ(739, 3));
        1Eo.A05(19B.A00, new C59673JTe(r3, r4, (AnonymousClass4D7) null, 21, z), A022);
    }

    public /* synthetic */ C278734xR(Context context, UserSession userSession) {
        1Cl r0 = new 1Cl(userSession);
        this.A03 = context;
        this.A04 = userSession;
        this.A06 = r0;
        ArrayList A032 = 1FV.A03(userSession);
        int A002 = 1FV.A00(userSession);
        Context context2 = C60960kU.A00;
        0qQ.A07(context2);
        this.A07 = new FeedCacheCoordinator(context2, userSession, A032, A002, 50, 0, Long.MAX_VALUE);
        this.A0A = new AtomicBoolean(false);
        this.A05 = C252253oo.A00(userSession);
        this.A0B = 0yU.A07(AnonymousClass0yP.A00(36321292881765615L));
        this.A02 = (int) 182.A01(0Tu.A05, userSession, 36606388516296103L);
    }

    private final long A00() {
        UserSession userSession = this.A04;
        0Tu r5 = 0Tu.A05;
        long A012 = 182.A01(r5, userSession, 36596784969419384L);
        long A013 = 182.A01(r5, userSession, 36596784971188857L);
        long A014 = 182.A01(r5, userSession, 36596784971254394L);
        if (!(A013 == -1 || A014 == -1)) {
            long j = AnonymousClass1B0.A02;
            A012 = (!AnonymousClass1B1.A00(userSession).A00(1B2.A0N) || (182.A06(r5, userSession, 36328873499246226L) && (!182.A06(r5, userSession, 36328873499442837L) || A17.A00(userSession, 1Au.A00(userSession))))) ? A014 : A013;
        }
        return TimeUnit.MINUTES.toMillis(A012);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        if (r0 > 0) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass540 r11, X.1XM r12, X.C278734xR r13, java.util.List r14, long r15, boolean r17) {
        /*
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r0 = r12.A00()
            r6.addAll(r0)
            java.util.List r0 = r12.A00()
            java.util.Iterator r2 = r0.iterator()
        L_0x0014:
            boolean r0 = r2.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0028
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.1Xg r0 = (X.1Xg) r0
            boolean r0 = X.AnonymousClass3VP.A00(r0)
            if (r0 == 0) goto L_0x0014
        L_0x0028:
            X.1Xg r1 = (X.1Xg) r1
            if (r1 == 0) goto L_0x0049
            X.1Xn r0 = r1.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            if (r0 == 0) goto L_0x0049
            java.lang.String r2 = r0.getId()
            if (r2 == 0) goto L_0x0049
            com.instagram.common.session.UserSession r1 = r13.A04
            X.0wX r0 = r1.A03
            android.content.Context r0 = r0.A06()
            X.1Ua r0 = X.1UX.A00(r0, r1)
            r0.A03(r2)
        L_0x0049:
            com.instagram.common.session.UserSession r5 = r13.A04
            X.0Tu r4 = X.0Tu.A05
            r0 = 36315309992774784(0x81049500070c80, double:3.029286497222321E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0076
            r1 = -1
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0076
            long r3 = r13.A00()
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r15
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
        L_0x0069:
            if (r0 <= 0) goto L_0x00cd
        L_0x006b:
            X.IiS r0 = new X.IiS
            r1 = r17
            r0.<init>(r11, r13, r1)
            X.11Z.A02(r0)
            return
        L_0x0076:
            r0 = 36328607211404753(0x8110ad00053dd1, double:3.037695711827515E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x00cd
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r15
            X.1Av r0 = X.1Au.A00(r5)
            X.S5L r7 = new X.S5L
            r7.<init>(r0)
            r0 = 36328607211273680(0x8110ad00033dd0, double:3.037695711744624E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            r0 = 36610082187909088(0x8210ad000217e0, double:3.215701620377613E-306)
            long r2 = X.182.A01(r4, r5, r0)
            r0 = 36610082188040161(0x8210ad000417e1, double:3.215701620460504E-306)
            long r0 = X.182.A01(r4, r5, r0)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MINUTES
            long r3 = r5.toMillis(r2)
            long r1 = r5.toMillis(r0)
            java.lang.Boolean r0 = r7.A00()
            if (r0 == 0) goto L_0x00cb
            java.lang.Boolean r0 = r7.A00()
            boolean r0 = X.0qQ.A0K(r8, r0)
            if (r0 == 0) goto L_0x00cb
        L_0x00c8:
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            goto L_0x0069
        L_0x00cb:
            r3 = r1
            goto L_0x00c8
        L_0x00cd:
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x006b
            A03(r11, r13, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C278734xR.A01(X.540, X.1XM, X.4xR, java.util.List, long, boolean):void");
    }

    public static final void A05(AnonymousClass540 r7, C278734xR r8, boolean z) {
        long j = 1Au.A00(r8.A04).A01.getLong("last_feed_background_prefetch_timestamp", 0);
        if (System.currentTimeMillis() - j >= r8.A00()) {
            11Z.A02(new C57911IiS(r7, r8, z));
        }
    }

    private final void A06(AnonymousClass540 r4, ExtendedImageUrl extendedImageUrl, String str, List list) {
        INK ink = new INK(r4, this);
        this.A08.add(ink);
        1OO A0J = 1NK.A00().A0J(extendedImageUrl, "feed_timeline_background_prefetch");
        A0J.A0I = true;
        A0J.A09 = str;
        A0J.A0F = false;
        A0J.A02(ink);
        list.add(A0J.A00());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r0 == null) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.C278734xR r6) {
        /*
            com.instagram.common.session.UserSession r3 = r6.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315309992447103(0x81049500020c7f, double:3.029286497015094E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0040
            java.util.concurrent.atomic.AtomicBoolean r5 = r6.A0A
            boolean r0 = r5.get()
            if (r0 == 0) goto L_0x0040
            java.util.List r0 = r6.A01
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0040
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0040
            java.util.List r2 = r6.A01
            java.lang.String r1 = "mainFeedLocalDataSource"
            if (r2 == 0) goto L_0x0034
            boolean r0 = r6.A0B
            if (r0 != 0) goto L_0x0049
            X.1Uy r0 = r6.A07
            com.instagram.mainfeed.network.FeedCacheCoordinator r0 = (com.instagram.mainfeed.network.FeedCacheCoordinator) r0
        L_0x0031:
            r0.A8n(r2, r3)
        L_0x0034:
            boolean r0 = r6.A0B
            if (r0 != 0) goto L_0x0041
            X.1Uy r0 = r6.A07
            r0.stop()
        L_0x003d:
            r5.set(r4)
        L_0x0040:
            return
        L_0x0041:
            com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource r0 = r6.A00
            if (r0 == 0) goto L_0x004d
            r0.A07()
            goto L_0x003d
        L_0x0049:
            com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource r0 = r6.A00
            if (r0 != 0) goto L_0x0031
        L_0x004d:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C278734xR.A07(X.4xR):void");
    }

    public static final void A03(AnonymousClass540 r13, C278734xR r14, List list) {
        1Xj A022;
        1Xj A1c;
        ExtendedImageUrl A1n;
        1Xj A1c2;
        if (list.isEmpty()) {
            r13.AVX("feed_timeline_background_prefetch");
        }
        int i = 6;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        r14.A08.clear();
        List list2 = r14.A09;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            1Xg r2 = (1Xg) it.next();
            if (r2.A06 == 1UQ.A0Y && (A022 = 1Xi.A02(r2.A05)) != null && A022.A4w()) {
                C252263op r0 = r14.A05;
                Context context = r14.A03;
                if (!r0.A00(context, A022)) {
                    try {
                        if (A022.CeS() || (A022.A5D() && (A1c2 = A022.A1c(A022.A0w())) != null && A1c2.CeS())) {
                            int i2 = i;
                            i--;
                            if (i2 <= 0) {
                            }
                        }
                    } catch (Exception unused) {
                    }
                    A022.A35(context);
                    ExtendedImageUrl A1n2 = A022.A1n(context);
                    if (A1n2 != null) {
                        r14.A06(r13, A1n2, A022.BTL(), arrayList);
                    }
                    if (A022.A5D()) {
                        int A0w = A022.A0w();
                        int min = Math.min(A022.A0o(), A0w + 2);
                        while (A0w < min) {
                            1Xj A1c3 = A022.A1c(A0w);
                            if (!(A1c3 == null || (A1n = A1c3.A1n(context)) == null)) {
                                r14.A06(r13, A1n, A1c3.BTL(), arrayList);
                            }
                            A0w++;
                        }
                    }
                    try {
                        if (A022.CeS() || (A022.A5D() && (A1c = A022.A1c(A022.A0w())) != null && A1c.CeS())) {
                            if (!A022.A5D() || (A022 = A022.A1c(A022.A0w())) != null) {
                                C256203vO r22 = new C256203vO(A022.CEL(), "feed_timeline_background_prefetch");
                                C57458Ib2 ib2 = new C57458Ib2(r13, r14);
                                r22.A01(ib2, r14.A02);
                                list2.add(ib2);
                                arrayList2.add(r22);
                                A022.A2U();
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                1NK.A00().A0N((C226952iF) it2.next());
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C255593uO.A00(r14.A04).A01((C256203vO) it3.next());
            }
            return;
        }
        r13.AVX("feed_timeline_background_prefetch");
    }
}
