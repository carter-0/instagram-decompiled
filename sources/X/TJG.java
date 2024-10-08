package X;

import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;

public final class TJG implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InstagramMainActivity A01;
    public final /* synthetic */ 2b7 A02;

    public TJG(UserSession userSession, InstagramMainActivity instagramMainActivity, 2b7 r3) {
        this.A00 = userSession;
        this.A02 = r3;
        this.A01 = instagramMainActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0132, code lost:
        if (X.AnonymousClass7TE.A1I(X.AnonymousClass000.A00(5286)).contains(r7) != false) goto L_0x0134;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01da A[Catch:{ Exception -> 0x0224 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r29 = this;
            r1 = r29
            com.instagram.common.session.UserSession r3 = r1.A00
            if (r3 == 0) goto L_0x00df
            X.2b7 r2 = r1.A02
            if (r2 == 0) goto L_0x00df
            boolean r0 = r2.A05
            if (r0 != 0) goto L_0x00df
            com.instagram.mainactivity.InstagramMainActivity r13 = r1.A01
            com.instagram.ui.swipenavigation.PositionConfig r0 = r13.A0B
            if (r0 != 0) goto L_0x00df
            boolean r0 = r13.A0O
            if (r0 != 0) goto L_0x00df
            android.os.Bundle r1 = com.instagram.mainactivity.InstagramMainActivity.A0s
            r0 = 0
            com.instagram.mainactivity.InstagramMainActivity.A0s = r0
            if (r1 == 0) goto L_0x002c
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x002c
            X.37Y r1 = X.AnonymousClass37X.A00(r3)
            r0 = 1
            r1.A05 = r0
        L_0x002c:
            X.2b8 r0 = r2.A01
            X.1QK r12 = r0.A01()
            if (r12 != 0) goto L_0x0036
            X.1QK r12 = X.1QK.A0C
        L_0x0036:
            X.37Y r6 = X.AnonymousClass37X.A00(r3)
            boolean r10 = r13.A0K
            java.lang.String r7 = r2.A02()
            r21 = 1
            com.instagram.common.session.UserSession r5 = r6.A0A
            X.0Tu r4 = X.0Tu.A05
            r0 = 36320524085502518(0x810953002c2236, double:3.032583910458806E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            r14 = 0
            if (r0 != 0) goto L_0x00c8
            X.02m r3 = r6.A09
            r2 = 728433975(0x2b6b0537, float:8.349601E-13)
            r3.markerStart(r2)
            java.lang.String r20 = r12.name()
            java.lang.String r1 = "AppEntryCurrentTab"
            r0 = r20
            r3.markerAnnotate(r2, r1, r0)
            java.lang.String r0 = "AppEntryCurrentModule"
            r3.markerAnnotate(r2, r0, r7)
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x00ac
            r0 = 36320524086485560(0x810953003b2238, double:3.032583911080486E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x00ac
            X.2cc r0 = X.C71342cb.A00(r5)
            java.lang.String r8 = r0.A0B
            java.lang.String r0 = "AppEntryResetUserNavigationBehavior"
            com.facebook.quicklog.EventBuilder r1 = r3.markEventBuilder(r2, r0)
            r0 = 7
            com.facebook.quicklog.EventBuilder r1 = r1.setLevel(r0)
            java.lang.String r0 = "AppEntryActionRestartApplied"
            com.facebook.quicklog.EventBuilder r0 = r1.annotate(r0, r8)
            r0.report()
            X.THh r0 = new X.THh
            r0.<init>(r6, r8)
            r6.A03 = r0
            r0 = 36601999061881252(0x820953002711a4, double:3.2105898189294736E-306)
            long r0 = X.182.A01(r4, r5, r0)
            android.os.Handler r9 = r6.A08
            java.lang.Runnable r8 = r6.A03
            r9.postDelayed(r8, r0)
            r6.A06 = r14
        L_0x00ac:
            r0 = 4709(0x1265, float:6.599E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.0qQ.A0K(r7, r0)
            r15 = 7952(0x1f10, float:1.1143E-41)
            if (r0 == 0) goto L_0x00e0
            r0 = 36320524083012125(0x8109530006221d, double:3.032583908883872E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 != 0) goto L_0x00e0
        L_0x00c5:
            r3.markerEnd(r2, r15)
        L_0x00c8:
            r3 = 0
        L_0x00c9:
            com.instagram.common.session.UserSession r2 = r13.A05
            r0 = 36323917106785896(0x810c6900002e68, double:3.0347296707810146E-306)
            boolean r0 = X.DbY.A1Y(r4, r2, r0)
            if (r0 == 0) goto L_0x00df
            if (r3 != 0) goto L_0x00df
            X.0hq r0 = r13.AuV()
            X.AnonymousClass6U5.A00(r0)
        L_0x00df:
            return
        L_0x00e0:
            r0 = 36320524083077662(0x8109530007221e, double:3.0325839089253176E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = "feed_timeline"
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 == 0) goto L_0x00f4
            goto L_0x00c5
        L_0x00f4:
            X.0xa r8 = X.AnonymousClass7TE.A0q(r5)
            r0 = 5188(0x1444, float:7.27E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            r0 = 0
            long r16 = r8.getLong(r9, r0)
            X.0xY r8 = X.AnonymousClass7TF.A0N(r5)
            r8.E5c(r9, r0)
            r8.apply()
            java.lang.ref.WeakReference r8 = r6.A04
            android.app.Activity r11 = X.Pxg.A0K(r8)
            r8 = 36320524084781615(0x8109530021222f, double:3.032583910002904E-306)
            boolean r8 = X.182.A06(r4, r5, r8)
            if (r8 == 0) goto L_0x0135
            if (r7 == 0) goto L_0x0135
            if (r10 != 0) goto L_0x0134
            r8 = 5286(0x14a6, float:7.407E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r8)
            java.util.List r8 = X.AnonymousClass7TE.A1I(r8)
            boolean r8 = r8.contains(r7)
            r10 = 0
            if (r8 == 0) goto L_0x0135
        L_0x0134:
            r10 = 1
        L_0x0135:
            int r8 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x023e
            if (r11 == 0) goto L_0x023e
            if (r10 == 0) goto L_0x023e
            boolean r0 = r6.A05
            if (r0 != 0) goto L_0x023e
            long r0 = r6.A00
            long r8 = r0 - r16
            long r8 = java.lang.Math.abs(r8)
            long r0 = X.C51966G9m.A07(r0)
            long r18 = java.lang.Math.abs(r0)
            X.Dbs r0 = X.Py8.A00
            long r16 = r0.A01(r5, r12, r7)
            java.lang.String r0 = "AppEntryBackGroundDuration"
            r3.markerAnnotate(r2, r0, r8)
            if (r7 == 0) goto L_0x0191
            r0 = 36320524084847152(0x81095300222230, double:3.03258391004435E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0191
            X.SOa r22 = X.C11343SOa.A01
            long r27 = X.AnonymousClass7TE.A0P(r8)
            java.lang.ref.WeakReference r1 = r6.A04
            X.0hq r0 = r6.A01
            r10 = 2
            r23 = r0
            r24 = r5
            r25 = r7
            r26 = r1
            boolean r0 = r22.A02(r23, r24, r25, r26, r27)
            if (r0 == 0) goto L_0x0192
            r0 = 869(0x365, float:1.218E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.markerAnnotate(r2, r0, r7)
        L_0x018b:
            r3.markerEnd(r2, r10)
        L_0x018e:
            r3 = 1
            goto L_0x00c9
        L_0x0191:
            r10 = 2
        L_0x0192:
            r0 = 36323917107179117(0x810c6900062e6d, double:3.034729671029689E-306)
            boolean r1 = X.182.A06(r4, r5, r0)
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r1 == 0) goto L_0x01b6
            if (r0 <= 0) goto L_0x01bf
        L_0x01a1:
            r7 = 1
        L_0x01a2:
            r0 = 36320524084650541(0x810953001f222d, double:3.0325839099200126E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x01da
            X.2cc r0 = X.C71342cb.A00(r5)
            java.lang.String r1 = r0.A0B
            if (r1 == 0) goto L_0x018e
            goto L_0x01c1
        L_0x01b6:
            if (r0 <= 0) goto L_0x01bf
            r16 = 500(0x1f4, double:2.47E-321)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x01bf
            goto L_0x01a1
        L_0x01bf:
            r7 = 0
            goto L_0x01a2
        L_0x01c1:
            X.SOa r14 = X.C11343SOa.A01     // Catch:{ Exception -> 0x0224 }
            long r20 = X.AnonymousClass7TE.A0P(r8)     // Catch:{ Exception -> 0x0224 }
            X.0hq r8 = r6.A01     // Catch:{ Exception -> 0x0224 }
            java.lang.ref.WeakReference r7 = r6.A04     // Catch:{ Exception -> 0x0224 }
            X.2Zc r0 = r6.A02     // Catch:{ Exception -> 0x0224 }
            r15 = r8
            r16 = r5
            r17 = r0
            r18 = r1
            r19 = r7
            r14.A01(r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0224 }
            goto L_0x018e
        L_0x01da:
            if (r7 == 0) goto L_0x023e
            r0 = 36320524085305908(0x81095300292234, double:3.032583910334469E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x01ee
            X.2Zc r0 = r6.A02
            if (r0 == 0) goto L_0x01ee
            r0.CJI()
        L_0x01ee:
            r0 = 60574(0xec9e, float:8.4882E-41)
            r13.finishActivity(r0)
            java.lang.Class r0 = r11.getClass()
            android.content.Intent r1 = X.C66580MXl.A0A(r11, r0)
            r0 = 268533760(0x10018000, float:2.5539372E-29)
            r1.addFlags(r0)
            X.0kR.A0B(r11, r1)
            r11.finish()
            r0 = r21
            r6.A06 = r0
            X.0wX r0 = X.C61170le.A00
            X.18g r5 = X.C638918c.A01(r0)
            java.lang.String r1 = "RESET_TO_MAIN_FEED"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r5.A02
            r5.A0O(r0, r1)
            r6.A05 = r14
            java.lang.String r1 = "AppEntryActionRestart"
            r0 = r20
            r3.markerAnnotate(r2, r1, r0)
            goto L_0x018b
        L_0x0224:
            r0 = move-exception
            java.lang.String r5 = r0.toString()
            r0 = 871(0x367, float:1.22E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.markerAnnotate(r2, r0, r5)
            r0 = 870(0x366, float:1.219E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.Pxf.A1I(r3, r0, r1, r2)
            r3 = 0
            goto L_0x00c9
        L_0x023e:
            r3.markerEnd(r2, r15)
            r6.A05 = r14
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TJG.run():void");
    }
}
