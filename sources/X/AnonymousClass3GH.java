package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.3GH  reason: invalid class name */
public final class AnonymousClass3GH {
    public int A00 = -1;
    public long A01;
    public boolean A02;
    public final C249883kW A03;
    public final AnonymousClass2k6 A04;
    public final C227762js A05;
    public final UserSession A06;
    public final AnonymousClass3GD A07;
    public final 1FI A08;
    public final C2365134a A09;
    public final C228322lL A0A;
    public final AnonymousClass2l3 A0B;
    public final AnonymousClass3G8 A0C;
    public final AnonymousClass2lI A0D;
    public final C238213Az A0E;
    public final AnonymousClass3GA A0F;
    public final C228472lj A0G;
    public final C227872kC A0H;
    public final C227802jw A0I;
    public final AnonymousClass35W A0J;
    public final AnonymousClass35N A0K;
    public final C228182kv A0L;
    public final C228462li A0M;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (X.AnonymousClass1B1.A00(r4).A00(X.1B2.A0Q) == false) goto L_0x0084;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass3B0 A00(X.AnonymousClass3GH r10) {
        /*
            com.facebook.common.time.AwakeTimeSinceBootClock r0 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            long r8 = r0.now()
            long r0 = r10.A01
            long r8 = r8 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r0
            com.instagram.common.session.UserSession r4 = r10.A06
            X.0Tu r3 = X.0Tu.A05
            r0 = 36598992585821519(0x82069700370d4f, double:3.208688511363191E-306)
            long r6 = X.182.A01(r3, r4, r0)
            r0 = 36317620689245583(0x8106af0045158f, double:3.030747790974882E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x005b
            long r0 = X.AnonymousClass1B0.A02
            X.1B0 r1 = X.AnonymousClass1B1.A00(r4)
            X.1B2 r0 = X.1B2.A0Q
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x005b
            r0 = 36599095665888688(0x8206af00440db0, double:3.208753699612739E-306)
        L_0x0037:
            long r0 = X.182.A01(r3, r4, r0)
        L_0x003b:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.0qQ.A0A(r0)
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ab
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ab
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a8
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a8
            X.3B0 r0 = X.AnonymousClass3B0.FORCE_FEED_AND_STORIES_REFRESH
            return r0
        L_0x005b:
            r0 = 36328701700881954(0x8110c300083e22, double:3.0377554673533757E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x00a2
            X.Hra r5 = X.C55041HbC.A00(r4)
            r0 = 36328701700947491(0x8110c300093e23, double:3.0377554673948215E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x0084
            long r0 = X.AnonymousClass1B0.A02
            X.1B0 r1 = X.AnonymousClass1B1.A00(r4)
            X.1B2 r0 = X.1B2.A0Q
            boolean r1 = r1.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0085
        L_0x0084:
            r0 = 0
        L_0x0085:
            java.lang.String r2 = "in_session_refresh_timer_in_s"
            java.util.concurrent.ConcurrentHashMap r1 = r5.A01
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = "on_peak_"
        L_0x008d:
            java.lang.String r0 = X.002.A0R(r0, r2)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00a2
            int r0 = r0.intValue()
            long r0 = (long) r0
            goto L_0x003b
        L_0x009f:
            java.lang.String r0 = ""
            goto L_0x008d
        L_0x00a2:
            r0 = 36599095663725986(0x8206af00230da2, double:3.2087536982450374E-306)
            goto L_0x0037
        L_0x00a8:
            X.3B0 r0 = X.AnonymousClass3B0.FORCE_FEED_REFRESH
            return r0
        L_0x00ab:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b6
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b6
            X.3B0 r0 = X.AnonymousClass3B0.FORCE_STORIES_REFRESH
            return r0
        L_0x00b6:
            X.3B0 r0 = X.AnonymousClass3B0.DEFAULT_BEHAVIOR
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3GH.A00(X.3GH):X.3B0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Boolean A01(X.1FI r14, X.C2365134a r15, X.AnonymousClass3B0 r16, X.AnonymousClass3GH r17) {
        /*
            r4 = r16
            int r1 = r4.ordinal()
            r3 = 1
            r7 = 0
            r2 = r17
            if (r1 == r3) goto L_0x00d3
            r0 = 5
            r6 = 0
            if (r1 == r0) goto L_0x00b7
            r0 = 3
            if (r1 == r0) goto L_0x00b2
            r0 = 6
            if (r1 == r0) goto L_0x00e8
            if (r1 != r7) goto L_0x00ff
            X.2kn r9 = r15.A0O
            long r4 = r9.A01
            com.instagram.common.session.UserSession r10 = r15.A0F
            X.1Av r0 = X.1Au.A00(r10)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "reel_tray_personalization_is_high_usage_likelihood"
            boolean r14 = r1.getBoolean(r0, r7)
            X.1NN r0 = X.1NM.A00(r10)
            com.instagram.common.session.UserSession r0 = r0.A00
            X.0Tu r8 = X.0Tu.A05
            r2 = 36317517610751241(0x81069700501509, double:3.0306826037199966E-306)
            boolean r13 = X.182.A06(r8, r0, r2)
            r0 = 36598992586542418(0x82069700420d52, double:3.2086885118190905E-306)
            long r11 = X.182.A01(r8, r10, r0)
            com.instagram.common.session.UserSession r10 = r9.A07
            X.1Av r9 = X.1Au.A00(r10)
            X.1NN r0 = X.1NM.A00(r10)
            com.instagram.common.session.UserSession r0 = r0.A00
            boolean r0 = X.182.A06(r8, r0, r2)
            if (r0 != 0) goto L_0x00a2
            X.1NN r0 = X.1NM.A00(r10)
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36325867022333234(0x810e2f00063532, double:3.035962805224831E-306)
            boolean r0 = X.182.A06(r8, r2, r0)
            if (r0 == 0) goto L_0x00a2
            X.0xa r9 = r9.A01
            java.lang.String r3 = "reel_tray_personalization_warm_refresh_cooldown_s"
            r1 = -1
            int r0 = r9.getInt(r3, r1)
            if (r0 <= 0) goto L_0x00a2
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            int r0 = r9.getInt(r3, r1)
            long r0 = (long) r0
            long r0 = r2.toMillis(r0)
        L_0x007d:
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r4
            long r8 = java.lang.Math.abs(r2)
            if (r13 != 0) goto L_0x009f
            if (r14 != 0) goto L_0x009f
            r3 = 0
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x009f
            int r2 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
        L_0x0092:
            if (r2 <= 0) goto L_0x00ff
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            boolean r0 = r15.A0C(r6, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x009f:
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            goto L_0x0092
        L_0x00a2:
            X.1NN r0 = X.1NM.A00(r10)
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36598992582413633(0x82069700030d41, double:3.20868850920803E-306)
            long r0 = X.182.A01(r8, r2, r0)
            goto L_0x007d
        L_0x00b2:
            java.lang.Boolean r0 = A02(r14, r4, r2, r7)
            return r0
        L_0x00b7:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.2l3 r0 = r2.A0B
            boolean r1 = r15.A0C(r0, r1)
            java.lang.Boolean r0 = A02(r14, r4, r2, r1)
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00ce
            if (r1 != 0) goto L_0x00ce
            r3 = 0
        L_0x00ce:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
        L_0x00d2:
            return r6
        L_0x00d3:
            X.3Az r2 = r2.A0E
            if (r2 == 0) goto L_0x00ff
            boolean r0 = r2.A0B()
            if (r0 != 0) goto L_0x00ff
            X.2lj r1 = r2.A09
            X.DHQ r0 = new X.DHQ
            r0.<init>(r2)
            r1.A08(r0, r7)
            goto L_0x00ff
        L_0x00e8:
            X.2li r0 = r2.A0M
            X.2jw r0 = r0.A00
            X.2kj r0 = r0.A0A()
            X.34a r0 = r0.A0O()
            r0.A07()
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.2l3 r0 = r2.A0B
            boolean r7 = r15.A0C(r0, r1)
        L_0x00ff:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3GH.A01(X.1FI, X.34a, X.3B0, X.3GH):java.lang.Boolean");
    }

    public static final Boolean A02(1FI r7, AnonymousClass3B0 r8, AnonymousClass3GH r9, boolean z) {
        boolean z2;
        C228472lj r4 = r9.A0G;
        boolean z3 = false;
        if (r4.A08 != null) {
            z3 = true;
        }
        if (!z3) {
            if (!182.A06(0Tu.A05, r9.A06, 36329380305584208L)) {
                z2 = false;
                return Boolean.valueOf(z2);
            }
        }
        UserSession userSession = r9.A06;
        z2 = true;
        if (C238243Bc.A00(userSession).A03()) {
            if (182.A06(0Tu.A05, C238243Bc.A00(userSession).A02, 36317620685051247L)) {
                r9.A0L.A01 = AnonymousClass1FM.A00();
                AnonymousClass2rI r2 = r4.A06;
                if (r2 != null) {
                    C242583Vb.A00 = null;
                    ((AnonymousClass2rW) r2.A00).A04();
                    r2.A04 = null;
                    r2.A0A(-1);
                }
                r4.A08 = null;
                r4.A01 = 0;
                r4.A0n.A0R("");
                C228462li r1 = r9.A0M;
                r1.A00.A0A().A0O().A07();
                r1.A00();
                C228552lr r22 = r4.A0f;
                r22.A02 = System.currentTimeMillis();
                if (Systrace.A0E(1)) {
                    0fS.A01("MainFeedDeliveryController.restart", -1272963170);
                }
                try {
                    synchronized (r22.A0Y) {
                        r22.A07 = null;
                    }
                    r22.A0H.removeCallbacksAndMessages((Object) null);
                    r22.A09(r4, true);
                    C62670v5.A0B.A03(C228472lj.A00(r4));
                    if (Systrace.A0E(1)) {
                        0fS.A00(-240681582);
                    }
                    return Boolean.valueOf(z2);
                } catch (Throwable th) {
                    if (Systrace.A0E(1)) {
                        0fS.A00(1728612820);
                    }
                    throw th;
                }
            }
        }
        if (182.A06(0Tu.A05, userSession, 36326412483114751L)) {
            r4.A08(new C57289IVy(r7, r8, r9, z), true);
            return null;
        }
        z2 = A03(r7, r8, r9);
        return Boolean.valueOf(z2);
    }

    public static final boolean A03(1FI r3, AnonymousClass3B0 r4, AnonymousClass3GH r5) {
        11Z.A03(new C51323FsH(r5));
        HashMap hashMap = new HashMap();
        hashMap.put("new_posts_pill_type", r4.toString());
        return r5.A0G.A0A(r3, (String) null, hashMap);
    }

    public AnonymousClass3GH(C249883kW r2, AnonymousClass2k6 r3, C227762js r4, UserSession userSession, AnonymousClass3GD r6, AnonymousClass35N r7, 1FI r8, C2365134a r9, C228322lL r10, AnonymousClass2l3 r11, AnonymousClass3G8 r12, AnonymousClass2lI r13, C238213Az r14, C228182kv r15, AnonymousClass3GA r16, C228472lj r17, C227872kC r18, C227802jw r19, AnonymousClass35W r20, C228462li r21) {
        this.A06 = userSession;
        this.A0H = r18;
        this.A0C = r12;
        this.A0E = r14;
        this.A0L = r15;
        this.A09 = r9;
        this.A0I = r19;
        this.A0G = r17;
        this.A0B = r11;
        this.A04 = r3;
        this.A0F = r16;
        this.A07 = r6;
        this.A0K = r7;
        this.A03 = r2;
        this.A08 = r8;
        this.A0J = r20;
        this.A0D = r13;
        this.A05 = r4;
        this.A0A = r10;
        this.A0M = r21;
    }
}
