package X;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3GX  reason: invalid class name */
public final class AnonymousClass3GX {
    public C2813657d A00 = null;
    public 0lg A01;
    public String A02 = null;
    public String A03 = "";
    public String A04 = null;
    public WeakReference A05 = new WeakReference((Object) null);
    public boolean A06 = false;
    public Handler A07;
    public boolean A08;
    public boolean A09;
    public final boolean A0A;

    public static AnonymousClass3GX A00(0lg r2) {
        return (AnonymousClass3GX) r2.A01(AnonymousClass3GX.class, new AnonymousClass3GY(r2));
    }

    private void A01() {
        C2813657d r1 = this.A00;
        if (r1 != null && this.A06) {
            0lg r3 = this.A01;
            0wc A002 = AnonymousClass0kN.A00((AnonymousClass0iw) r1.A01.A02, 0kJ.A05, r3);
            0Aj A003 = A002.A00(A002.A00, AnonymousClass000.A00(3372));
            A003.AAJ("event_trace_id", this.A00.A03);
            A003.AAe("tracking", this.A00.A04);
            A003.AAJ("dest_module_uri", this.A03);
            A003.AAJ("extra_dest_module", this.A02);
            A003.AAJ(AnonymousClass000.A00(2768), C298095ss.A00);
            A003.Cgf();
            if (!this.A0A) {
                String str = this.A02;
                String str2 = this.A03;
                AnonymousClass3LT r0 = (AnonymousClass3LT) this.A05.get();
                if (!(str == null || r0 == null)) {
                    r0.A00(str, str2);
                }
            }
            this.A06 = false;
            this.A00 = null;
            this.A03 = "";
            this.A02 = null;
            C240443Kx.A00(r3).EPN((C55697Hlu) null);
        }
    }

    public static void A02(AnonymousClass3GX r8, boolean z) {
        long j;
        0lg r5 = r8.A01;
        0Tu r2 = 0Tu.A05;
        if (z) {
            j = 37155963941355536L;
        } else {
            j = 37155963941289999L;
        }
        double A002 = 182.A00(r2, r5, j);
        C2813657d r4 = r8.A00;
        if (r4 != null) {
            if (((double) (System.currentTimeMillis() - r4.A00)) / 1000.0d >= A002 && (r4.A01.A02 instanceof AnonymousClass0iw)) {
                C63007Kpx.A00(r5);
            }
        }
    }

    public static boolean A03(AnonymousClass3GX r5, long j) {
        if (((double) (System.currentTimeMillis() - j)) / 1000.0d < 182.A00(0Tu.A05, r5.A01, 37154907379204102L)) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: X.GDe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: X.4bN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v102, resolved type: X.3mM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: X.3uh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: X.3mM} */
    /* JADX WARNING: type inference failed for: r4v0, types: [X.57d, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.AnonymousClass4Lh r32, java.util.List r33, java.util.List r34, int r35, boolean r36) {
        /*
            r31 = this;
            X.0xE r2 = new X.0xE
            r2.<init>()
            r29 = r34
            java.util.Iterator r5 = r29.iterator()
        L_0x000b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r4 = r5.next()
            X.3Dt r4 = (X.C238873Dt) r4
            X.0xF r3 = new X.0xF
            r3.<init>()
            java.lang.Object r0 = r4.A01
            X.3Ds r0 = (X.C238863Ds) r0
            long r0 = r0.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "type"
            X.0xF.A00(r3, r1, r0)
            java.lang.Integer r1 = r4.A00
            if (r1 == 0) goto L_0x0034
            java.lang.String r0 = "index"
            X.0xF.A00(r3, r1, r0)
        L_0x0034:
            java.lang.String r1 = r4.A03
            if (r1 == 0) goto L_0x003d
            java.lang.String r0 = "thumbnail_id"
            X.0xF.A00(r3, r1, r0)
        L_0x003d:
            java.lang.String r1 = r4.A02
            if (r1 == 0) goto L_0x0046
            java.lang.String r0 = "product_id"
            X.0xF.A00(r3, r1, r0)
        L_0x0046:
            java.util.ArrayList r0 = r2.A00
            r0.add(r3)
            goto L_0x000b
        L_0x004c:
            X.57d r4 = new X.57d
            r4.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r4.A03 = r0
            r30 = r33
            r0 = r30
            r4.A04 = r0
            r5 = r32
            r4.A01 = r5
            r0 = r29
            r4.A05 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r4.A00 = r0
            r4.A02 = r2
            java.lang.Object r2 = r5.A01
            boolean r0 = r2 instanceof X.1Xj
            r11 = 0
            r9 = r31
            if (r0 == 0) goto L_0x00ad
            X.0lg r1 = r9.A01
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x00ad
            X.1Xj r2 = (X.1Xj) r2
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.String r0 = r2.getId()
            java.lang.String r3 = X.C231122qu.A0H(r1, r0)
            if (r3 == 0) goto L_0x00ad
            long r0 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0097 }
            java.lang.Long r11 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0097 }
            goto L_0x00ad
        L_0x0097:
            X.0wj r2 = X.0wj.A01
            r1 = 817902424(0x30c03358, float:1.3984431E-9)
            r0 = 448(0x1c0, float:6.28E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0R(r0, r3)
            X.0f9 r0 = r2.AEf(r0, r1)
            r0.report()
        L_0x00ad:
            java.lang.Object r2 = r5.A01
            boolean r0 = r2 instanceof X.1Xj
            r10 = 0
            if (r0 == 0) goto L_0x00dc
            X.1Xj r2 = (X.1Xj) r2
            java.util.Iterator r1 = r29.iterator()
        L_0x00ba:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r1.next()
            X.3Dt r0 = (X.C238873Dt) r0
            java.lang.Integer r0 = r0.A00
            if (r0 == 0) goto L_0x00ba
            int r0 = r0.intValue()
            X.1Xj r0 = r2.A1c(r0)
            if (r0 == 0) goto L_0x02ce
            X.1Xy r0 = r0.A0C
            java.lang.String r10 = r0.Aza()
        L_0x00da:
            if (r10 == 0) goto L_0x00ba
        L_0x00dc:
            java.lang.Object r2 = r5.A01
            boolean r0 = r2 instanceof X.1Xj
            r8 = 0
            if (r0 == 0) goto L_0x0103
            X.1Xj r2 = (X.1Xj) r2
            java.util.Iterator r1 = r29.iterator()
        L_0x00e9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0103
            java.lang.Object r0 = r1.next()
            X.3Dt r0 = (X.C238873Dt) r0
            java.lang.Integer r0 = r0.A00
            if (r0 == 0) goto L_0x00e9
            int r0 = r0.intValue()
            java.lang.String r8 = r2.A33(r0)
            if (r8 == 0) goto L_0x00e9
        L_0x0103:
            r12 = 1
            A02(r9, r12)
            r9.A00 = r4
            X.4Lh r0 = r4.A01
            X.4HI r0 = r0.A00
            if (r0 != 0) goto L_0x02c8
            r0 = 0
        L_0x0110:
            r9.A04 = r0
            X.0lg r3 = r9.A01
            r6 = 0
            X.0qQ.A0B(r3, r6)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320579918045846(0x810960000d2296, double:3.0326192191840265E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0127
            if (r36 != 0) goto L_0x01c2
        L_0x0127:
            X.4Lh r0 = r4.A01
            java.lang.Object r1 = r0.A02
            X.0iw r1 = (X.AnonymousClass0iw) r1
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x02c4
            X.0kJ r0 = X.0kJ.A05
        L_0x0133:
            X.0wc r7 = X.AnonymousClass0kN.A00(r1, r0, r3)
            r0 = 1482(0x5ca, float:2.077E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.0kJ r0 = r7.A00
            X.0Aj r7 = r7.A00(r0, r1)
            java.util.ArrayList r14 = X.C297065r7.A02(r4)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r13 = r0.A00
            java.lang.String r1 = r4.A03
            java.lang.String r0 = "event_trace_id"
            r7.AAJ(r0, r1)
            java.util.List r1 = r4.A04
            java.lang.String r0 = "tracking"
            r7.AAe(r0, r1)
            java.lang.String r0 = "tracking_nodes"
            r7.AAe(r0, r14)
            java.lang.String r1 = "gesture_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r35)
            r7.A8k(r1, r0)
            java.lang.String r0 = "nav_chain"
            r7.AAJ(r0, r13)
            if (r11 == 0) goto L_0x0175
            java.lang.String r0 = "host_profile_id"
            r7.A9F(r0, r11)
        L_0x0175:
            if (r10 == 0) goto L_0x017c
            java.lang.String r0 = "dynamic_creator_item_id"
            r7.AAJ(r0, r10)
        L_0x017c:
            if (r8 == 0) goto L_0x0183
            java.lang.String r0 = "dynamic_item_id"
            r7.AAJ(r0, r8)
        L_0x0183:
            java.lang.String r1 = r9.A04
            java.lang.String r0 = "dest_uri"
            r7.AAJ(r0, r1)
            r0 = 36317208368190298(0x81064f0005135a, double:3.0304870374792364E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01a2
            X.3L2 r0 = X.AnonymousClass3LU.A00(r3)
            java.lang.String r1 = r0.Ara()
            java.lang.String r0 = "correlation_id"
            r7.AAJ(r0, r1)
        L_0x01a2:
            r0 = 36315602050747816(0x8104d9000a0da8, double:3.0294711958604896E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01bf
            X.3Kz r8 = X.C240443Kx.A00(r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            java.lang.String r1 = r8.C9x(r0)
            java.lang.String r0 = "trigger_id"
            r7.AAJ(r0, r1)
            r8.Chg(r1)
        L_0x01bf:
            r7.Cgf()
        L_0x01c2:
            X.LCY r0 = X.C63007Kpx.A00(r3)
            r0.A00 = r4
            X.0Tu r7 = X.0Tu.A06
            r0 = 36320579917980309(0x810960000c2295, double:3.0326192191425806E-306)
            boolean r0 = X.182.A06(r7, r3, r0)
            if (r0 == 0) goto L_0x02d1
            X.3Kz r0 = X.C240443Kx.A00(r3)
            X.3L8 r7 = r0.AzE()
            if (r7 == 0) goto L_0x02d1
            X.3L9 r0 = r7.A00
            X.3LA r1 = r0.A00
            java.lang.String r0 = "ig_media_metrics"
            r1.remove(r0)
            r1.put(r0, r4)
            java.util.List r0 = r7.A01
            java.util.Iterator r17 = r0.iterator()
        L_0x01f1:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x02d1
            java.lang.Object r8 = r17.next()
            X.34K r8 = (X.AnonymousClass34K) r8
            X.0lg r7 = r8.A03     // Catch:{ Exception -> 0x01f1 }
            boolean r0 = r7 instanceof com.instagram.common.session.UserSession     // Catch:{ Exception -> 0x01f1 }
            if (r0 == 0) goto L_0x01f1
            X.4Lh r13 = r4.A01     // Catch:{ Exception -> 0x01f1 }
            X.0qQ.A07(r13)     // Catch:{ Exception -> 0x01f1 }
            java.lang.Object r11 = r13.A01     // Catch:{ Exception -> 0x01f1 }
            boolean r0 = r11 instanceof X.1Xj     // Catch:{ Exception -> 0x01f1 }
            if (r0 == 0) goto L_0x01f1
            boolean r0 = r13.A06     // Catch:{ Exception -> 0x01f1 }
            if (r0 == 0) goto L_0x01f1
            X.4Lh r0 = r4.A01     // Catch:{ Exception -> 0x01f1 }
            java.lang.Object r1 = r0.A02     // Catch:{ Exception -> 0x01f1 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.analytics.intf.AnalyticsModule"
            X.0qQ.A0C(r1, r0)     // Catch:{ Exception -> 0x01f1 }
            X.0iw r1 = (X.AnonymousClass0iw) r1     // Catch:{ Exception -> 0x01f1 }
            java.lang.String r0 = r1.getModuleName()     // Catch:{ Exception -> 0x01f1 }
            X.2pc r16 = X.C254373sN.A02(r0)     // Catch:{ Exception -> 0x01f1 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.media.Media"
            X.0qQ.A0C(r11, r0)     // Catch:{ Exception -> 0x01f1 }
            X.1Xj r11 = (X.1Xj) r11     // Catch:{ Exception -> 0x01f1 }
            long r0 = r4.A00     // Catch:{ Exception -> 0x01f1 }
            r14 = 2
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r12)     // Catch:{ Exception -> 0x01f1 }
            java.lang.Long r15 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x01f1 }
            r10 = 0
            r1 = 15
            X.9Ib r0 = new X.9Ib     // Catch:{ Exception -> 0x01f1 }
            r0.<init>((int) r1, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r15)     // Catch:{ Exception -> 0x01f1 }
            X.5yf r9 = new X.5yf     // Catch:{ Exception -> 0x01f1 }
            r9.<init>(r0, r10, r10, r10)     // Catch:{ Exception -> 0x01f1 }
            int r1 = r16.ordinal()     // Catch:{ Exception -> 0x01f1 }
            if (r1 == r14) goto L_0x02ac
            r0 = 3
            if (r1 == r0) goto L_0x0291
            if (r1 != r6) goto L_0x01f1
            java.lang.String r13 = r13.A03     // Catch:{ Exception -> 0x01f1 }
            if (r13 == 0) goto L_0x01f1
            X.1Xy r0 = r11.A0C     // Catch:{ Exception -> 0x01f1 }
            com.instagram.user.model.User r14 = r0.CCd()     // Catch:{ Exception -> 0x01f1 }
            if (r14 == 0) goto L_0x01f1
            X.3uh r1 = new X.3uh     // Catch:{ Exception -> 0x01f1 }
            r1.<init>((X.1Xj) r11, (com.instagram.user.model.User) r14, (java.lang.String) r13)     // Catch:{ Exception -> 0x01f1 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.session.UserSession"
            X.0qQ.A0C(r7, r0)     // Catch:{ Exception -> 0x01f1 }
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7     // Catch:{ Exception -> 0x01f1 }
            X.1Nr r0 = new X.1Nr     // Catch:{ Exception -> 0x01f1 }
            r0.<init>(r14)     // Catch:{ Exception -> 0x01f1 }
            com.instagram.model.reels.Reel r11 = new com.instagram.model.reels.Reel     // Catch:{ Exception -> 0x01f1 }
            r11.<init>(r0, r13, r6)     // Catch:{ Exception -> 0x01f1 }
            r25 = -1
            X.0sl r24 = X.0sl.A00     // Catch:{ Exception -> 0x01f1 }
            long r26 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01f1 }
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x01f1 }
            X.3mM r0 = new X.3mM     // Catch:{ Exception -> 0x01f1 }
            r20 = r11
            r22 = r10
            r23 = r10
            r28 = r6
            r18 = r0
            r19 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r28)     // Catch:{ Exception -> 0x01f1 }
            X.2l0 r8 = r8.A02     // Catch:{ Exception -> 0x01f1 }
            goto L_0x02a3
        L_0x0291:
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7     // Catch:{ Exception -> 0x01f1 }
            X.5o3 r0 = X.C267324bN.A0d     // Catch:{ Exception -> 0x01f1 }
            X.4bN r1 = r0.A04(r11)     // Catch:{ Exception -> 0x01f1 }
            X.1se r0 = X.1sd.A00(r7)     // Catch:{ Exception -> 0x01f1 }
            X.GDe r0 = X.C52057GDd.A01(r1, r7, r0, r10, r10)     // Catch:{ Exception -> 0x01f1 }
            X.2l0 r8 = r8.A00     // Catch:{ Exception -> 0x01f1 }
        L_0x02a3:
            if (r8 == 0) goto L_0x01f1
            X.2v9 r7 = X.C233162v9.AD_CLICK     // Catch:{ Exception -> 0x01f1 }
            r8.DUE(r9, r7, r1, r0)     // Catch:{ Exception -> 0x01f1 }
            goto L_0x01f1
        L_0x02ac:
            int r1 = r11.A0o()     // Catch:{ Exception -> 0x01f1 }
            boolean r0 = r11.A4o()     // Catch:{ Exception -> 0x01f1 }
            X.3W1 r7 = new X.3W1     // Catch:{ Exception -> 0x01f1 }
            r7.<init>(r1, r0)     // Catch:{ Exception -> 0x01f1 }
            X.2l0 r1 = r8.A01     // Catch:{ Exception -> 0x01f1 }
            if (r1 == 0) goto L_0x01f1
            X.2v9 r0 = X.C233162v9.AD_CLICK     // Catch:{ Exception -> 0x01f1 }
            r1.DUE(r9, r0, r11, r7)     // Catch:{ Exception -> 0x01f1 }
            goto L_0x01f1
        L_0x02c4:
            X.0kJ r0 = X.0kJ.A02
            goto L_0x0133
        L_0x02c8:
            java.lang.String r0 = r0.AWr()
            goto L_0x0110
        L_0x02ce:
            r10 = 0
            goto L_0x00da
        L_0x02d1:
            r0 = 36315602050092453(0x8104d900000da5, double:3.0294711954460354E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x02fd
            java.lang.Object r1 = r5.A01
            boolean r0 = r1 instanceof X.1Xj
            if (r0 == 0) goto L_0x02fe
            X.1Xj r1 = (X.1Xj) r1
            java.lang.String r5 = r1.A2n()
        L_0x02e8:
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = r29
            r4.<init>(r0)
            X.3Kz r2 = X.C240443Kx.A00(r3)
            X.Hlu r1 = new X.Hlu
            r0 = r30
            r1.<init>(r0, r4, r5)
            r2.EPN(r1)
        L_0x02fd:
            return
        L_0x02fe:
            r5 = 0
            goto L_0x02e8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3GX.A04(X.4Lh, java.util.List, java.util.List, int, boolean):void");
    }

    public final void A06(String str) {
        0kJ r0;
        String AWr;
        C2813657d r02 = this.A00;
        if (r02 != null && A03(this, r02.A00)) {
            C2813657d r5 = this.A00;
            ArrayList A022 = C297065r7.A02(r5);
            0lg r3 = this.A01;
            AnonymousClass4Lh r03 = r5.A01;
            AnonymousClass0iw r1 = (AnonymousClass0iw) r03.A02;
            if (r03.A06) {
                r0 = 0kJ.A05;
            } else {
                r0 = 0kJ.A02;
            }
            0wc A002 = AnonymousClass0kN.A00(r1, r0, r3);
            0Aj A003 = A002.A00(A002.A00, "instagram_media_metrics_state_change");
            A003.AAJ("event_trace_id", r5.A03);
            A003.AAe("tracking", r5.A04);
            A003.AAJ("extra_dest_module", str);
            A003.AAe("tracking_nodes", A022);
            AnonymousClass4HI r04 = r5.A01.A00;
            if (r04 == null) {
                AWr = null;
            } else {
                AWr = r04.AWr();
            }
            A003.AAJ("dest_module_uri", AWr);
            A003.Cgf();
            this.A00 = null;
            C240443Kx.A00(r3).EPN((C55697Hlu) null);
        }
    }

    public final void A07(String str) {
        if (this.A09 || this.A08) {
            Handler handler = this.A07;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                this.A07 = handler;
            }
            handler.post(new C57811Igq(this, str));
            return;
        }
        this.A02 = str;
    }

    public final void A08(String str, String str2, String str3, Set set, long j, boolean z) {
        boolean z2 = this.A0A;
        String A002 = Pxd.A00(6);
        if (z2) {
            if (set == null || !set.contains(A002)) {
                String str4 = this.A02;
                AnonymousClass3LT r0 = (AnonymousClass3LT) this.A05.get();
                if (!(str4 == null || r0 == null)) {
                    r0.A00(str4, str);
                }
            } else {
                AnonymousClass3LT r02 = (AnonymousClass3LT) this.A05.get();
                if (r02 != null) {
                    r02.A00("webview", str);
                }
            }
        }
        C2813657d r03 = this.A00;
        if (r03 == null || !A03(this, r03.A00)) {
            A02(this, false);
        } else {
            this.A06 = true;
            this.A03 = str;
            if (182.A06(0Tu.A05, this.A01, 36311362917368321L) && set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(A002)) {
                        A07("webview");
                    }
                }
            }
            if (!this.A09 && !this.A08) {
                A01();
            }
        }
        C18574VuQ A003 = C18574VuQ.A00(this.A01);
        A003.A04 = str2;
        A003.A03 = Long.valueOf(j);
        A003.A05 = str3;
        Boolean valueOf = Boolean.valueOf(z);
        if (!str.isEmpty()) {
            if (str2 == null) {
                str2 = AnonymousClass000.A00(3709);
            }
            0wc A004 = AnonymousClass0kN.A00(new C19195WPb(A003, str2), 0kJ.A05, A003.A00);
            0Aj A005 = A004.A00(A004.A00, "open_external_link_ig");
            if (valueOf.booleanValue()) {
                str = "";
            }
            A005.AAJ(C273654mx.A00(909), str);
            A005.A9F("a_pk", A003.A01);
            A005.A9F("ad_id", A003.A02);
            A005.AAJ("containermodule", A003.A04);
            A005.A9F("m_pk", A003.A03);
            A005.AAJ("ranking_info_token", A003.A05);
            A005.Cgf();
        }
        A003.A03 = null;
        A003.A01 = null;
        A003.A04 = null;
        A003.A02 = null;
    }

    public AnonymousClass3GX(0lg r4) {
        this.A01 = r4;
        0Tu r2 = 0Tu.A05;
        this.A08 = 182.A06(r2, r4, 36311362917433858L);
        this.A09 = 182.A06(r2, r4, 36311362917499395L);
        this.A0A = 182.A06(r2, r4, 36311646387438244L);
    }

    public final void A05(Integer num) {
        boolean z;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                z = this.A08;
            } else {
                z = this.A09;
            }
            if (z) {
                A01();
            }
        } else if (this.A08) {
            C2813657d r4 = this.A00;
            0lg r3 = this.A01;
            if (!182.A06(0Tu.A05, r3, 36311539011093073L) && this.A06 && r4 != null && (r4.A01.A02 instanceof AnonymousClass0iw)) {
                C63007Kpx.A00(r3);
            }
            this.A06 = false;
            this.A03 = "";
            this.A02 = null;
        }
    }
}
