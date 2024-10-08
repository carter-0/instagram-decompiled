package X;

import android.app.Activity;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: X.SOa  reason: case insensitive filesystem */
public final class C11343SOa {
    public static final 02m A00 = C51965G9l.A0l();
    public static final C11343SOa A01 = new Object();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        if (X.Py8.A00.A02(r8, r9, r11) != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        r3 = X.AnonymousClass000.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a7, code lost:
        if (r9.equals(r3) == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
        if (r11 > ((long) X.DbS.A04(r2, r8, 36601999061750179L))) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c3, code lost:
        if (r9.equals(X.AnonymousClass000.A00(1180)) != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c5, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(X.0hq r7, com.instagram.common.session.UserSession r8, java.lang.String r9, java.lang.ref.WeakReference r10, long r11) {
        /*
            r6 = this;
            r5 = 0
            r0 = 3
            X.0qQ.A0B(r8, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36601999063323050(0x820953003d11aa, double:3.2105898198412724E-306)
            int r0 = X.DbS.A04(r2, r8, r0)
            long r0 = (long) r0
            r4 = 1
            int r3 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0037
            r0 = 36883474040095243(0x830953003e020b, double:3.388595728560765E-306)
            java.lang.String r0 = X.182.A04(r2, r8, r0)
            java.util.List r0 = X.DbX.A0x(r0)
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0037
            X.02m r2 = A00
            r1 = 728440635(0x2b6b1f3b, float:8.353211E-13)
            java.lang.String r0 = "AppEntryCustomSurfaceAppReset"
            r2.markerAnnotate(r1, r0, r9)
        L_0x0033:
            A00(r9, r10)
            return r4
        L_0x0037:
            int r3 = r9.hashCode()
            r0 = -975990334(0xffffffffc5d391c2, float:-6770.2197)
            if (r3 == r0) goto L_0x007c
            r0 = -633730979(0xffffffffda3a085d, float:-1.30908853E16)
            if (r3 == r0) goto L_0x006a
            r0 = 136678739(0x8258d53, float:4.9819007E-34)
            if (r3 != r0) goto L_0x0075
            r0 = 23
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x00a9
            r0 = 36320524084978225(0x81095300242231, double:3.032583910127241E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
        L_0x005f:
            if (r0 == 0) goto L_0x0075
            X.Dbs r0 = X.Py8.A00
            boolean r0 = r0.A02(r8, r9, r11)
            if (r0 == 0) goto L_0x0075
            goto L_0x0033
        L_0x006a:
            r0 = 362(0x16a, float:5.07E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r9.equals(r0)
            goto L_0x005f
        L_0x0075:
            switch(r3) {
                case -815402058: goto L_0x0079;
                case -32305112: goto L_0x00b9;
                case 935219501: goto L_0x009d;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x00a9
        L_0x0079:
            r0 = 5212(0x145c, float:7.304E-42)
            goto L_0x009f
        L_0x007c:
            java.lang.String r3 = "feed_timeline"
            boolean r0 = r9.equals(r3)
            if (r0 == 0) goto L_0x00a3
            r0 = 36320524084060709(0x81095300162225, double:3.0325839095470004E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x00a3
            X.Dbs r0 = X.Py8.A00
            boolean r0 = r0.A02(r8, r9, r11)
            if (r0 == 0) goto L_0x00a3
            X.02m r0 = A00
            X.C55281HfA.A00(r7, r0, r9)
            return r4
        L_0x009d:
            r0 = 1329(0x531, float:1.862E-42)
        L_0x009f:
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
        L_0x00a3:
            boolean r0 = r9.equals(r3)
            if (r0 != 0) goto L_0x00c5
        L_0x00a9:
            r0 = 36601999061750179(0x820953002511a3, double:3.2105898188465825E-306)
            int r0 = X.DbS.A04(r2, r8, r0)
            long r1 = (long) r0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c5
            goto L_0x0033
        L_0x00b9:
            r0 = 1180(0x49c, float:1.654E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x00a9
        L_0x00c5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11343SOa.A02(X.0hq, com.instagram.common.session.UserSession, java.lang.String, java.lang.ref.WeakReference, long):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ba, code lost:
        if (X.182.A06(r4, r5, 36320524084388393L) == false) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.0hq r23, com.instagram.common.session.UserSession r24, X.AnonymousClass2Zc r25, java.lang.String r26, java.lang.ref.WeakReference r27, long r28) {
        /*
            r22 = this;
            r7 = r25
            r14 = 2
            r5 = r24
            X.0qQ.A0B(r5, r14)
            X.02m r3 = A00
            r2 = 728440635(0x2b6b1f3b, float:8.353211E-13)
            r3.markerStart(r2)
            java.lang.String r0 = "AppEntryBackGroundDuration"
            r8 = r28
            r3.markerAnnotate(r2, r0, r8)
            java.lang.String r0 = "AppEntryActionActionStart"
            r6 = r26
            r3.markerAnnotate(r2, r0, r6)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36320524084847152(0x81095300222230, double:3.03258391004435E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            r15 = r27
            r10 = r23
            if (r0 == 0) goto L_0x0045
            r25 = r6
            r26 = r15
            r27 = r8
            boolean r0 = r22.A02(r23, r24, r25, r26, r27)
            if (r0 == 0) goto L_0x0045
            r0 = 869(0x365, float:1.218E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.markerAnnotate(r2, r0, r6)
        L_0x0044:
            return
        L_0x0045:
            r0 = 36320524084519467(0x810953001d222b, double:3.032583909837121E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            r12 = 7952(0x1f10, float:1.1143E-41)
            if (r0 == 0) goto L_0x0065
            r0 = 36883474039243270(0x83095300310206, double:3.3885957280219736E-306)
            java.lang.String r1 = X.182.A04(r4, r5, r0)
            r0 = 0
            boolean r0 = X.00l.A0d(r1, r6, r0)
            if (r0 == 0) goto L_0x0065
            X.C71342cb.A00(r5)
        L_0x0065:
            X.Dbs r13 = X.Py8.A00
            boolean r0 = r13.A02(r5, r6, r8)
            java.lang.String r11 = "AppEntryCancelledByTTLExpired"
            if (r0 != 0) goto L_0x0081
            r0 = 36320524084388393(0x810953001b2229, double:3.032583909754229E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 != 0) goto L_0x0081
        L_0x007a:
            r3.markerAnnotate(r2, r11, r6)
            r3.markerEnd(r2, r12)
            return
        L_0x0081:
            r0 = 36320524086551097(0x810953003c2239, double:3.032583911121932E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x00bd
            if (r7 == 0) goto L_0x00bd
            r0 = r7
            com.instagram.mainactivity.InstagramMainActivity r0 = (com.instagram.mainactivity.InstagramMainActivity) r0
            X.2b7 r0 = r0.A09
            r0.getClass()
            X.2b8 r0 = r0.A01
            X.1QK r0 = r0.A01()
            X.0qQ.A07(r0)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            long r8 = r1.toMillis(r8)
            long r16 = r13.A01(r5, r0, r6)
            long r16 = r16 - r8
            r8 = 0
            int r0 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x00bd
            r0 = 36320524084388393(0x810953001b2229, double:3.032583909754229E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 != 0) goto L_0x00bd
            goto L_0x007a
        L_0x00bd:
            java.lang.String r6 = X.C46324Dbs.A00(r6)
            r0 = 36883474037735941(0x830953001a0205, double:3.388595727068733E-306)
            java.lang.String r1 = X.182.A04(r4, r5, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -591165837: goto L_0x011a;
                case 77853049: goto L_0x0125;
                case 408556937: goto L_0x0130;
                case 2016710633: goto L_0x013b;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            X.1QK r9 = X.1QK.A0C
        L_0x00d3:
            r8 = 1
            r0 = 36320524084257320(0x81095300192228, double:3.032583909671338E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0149
            if (r7 == 0) goto L_0x0149
            java.lang.String r1 = r9.name()
            java.lang.String r0 = "AppEntryActionGotoSurface"
            r3.markerAnnotate(r2, r0, r1)
            com.instagram.mainactivity.InstagramMainActivity r7 = (com.instagram.mainactivity.InstagramMainActivity) r7
            X.37D r11 = r7.mBottomSheetNavigator
            X.2b7 r1 = r7.A09
            r1.getClass()
            if (r11 == 0) goto L_0x0149
            r0 = r11
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 != r8) goto L_0x00ff
            r11.A0B()
        L_0x00ff:
            r1.A09(r9)
            X.2b8 r0 = r1.A01
            java.util.Stack r7 = r0.A06
            int r0 = r7.size()
            if (r0 <= r14) goto L_0x0149
            java.lang.Object r1 = r7.pop()
        L_0x0110:
            int r0 = r7.size()
            if (r0 <= r8) goto L_0x0146
            r7.pop()
            goto L_0x0110
        L_0x011a:
            java.lang.String r0 = "EXPLORE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d1
            X.1QK r9 = X.1QK.A0F
            goto L_0x00d3
        L_0x0125:
            java.lang.String r0 = "REELS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d1
            X.1QK r9 = X.1QK.A09
            goto L_0x00d3
        L_0x0130:
            java.lang.String r0 = "PROFILE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d1
            X.1QK r9 = X.1QK.A0E
            goto L_0x00d3
        L_0x013b:
            java.lang.String r0 = "DIRECT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d1
            X.1QK r9 = X.1QK.A0B
            goto L_0x00d3
        L_0x0146:
            r7.push(r1)
        L_0x0149:
            r0 = 36320524083798561(0x81095300122221, double:3.032583909381217E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0158
            A00(r6, r15)
            return
        L_0x0158:
            java.lang.String r0 = "SUB_SURFACE"
            r7 = 0
            boolean r0 = X.00l.A0d(r6, r0, r7)
            if (r0 == 0) goto L_0x016d
            r0 = 36320524083864098(0x81095300132222, double:3.032583909422663E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x016d
            return
        L_0x016d:
            X.1QK r0 = X.1QK.A0C
            if (r9 != r0) goto L_0x017d
            r0 = 36320524083929635(0x81095300142223, double:3.032583909464109E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x017d
            return
        L_0x017d:
            r0 = 36320524083995172(0x81095300152224, double:3.0325839095055546E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 != 0) goto L_0x0044
            r0 = 36320524084060709(0x81095300162225, double:3.0325839095470004E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0197
            X.C55281HfA.A00(r10, r3, r6)
            return
        L_0x0197:
            r0 = 36320524084126246(0x81095300172226, double:3.032583909588446E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x01be
            java.lang.String r0 = "AppEntryActionRefreshReels"
            r3.markerAnnotate(r2, r0, r6)
            if (r23 == 0) goto L_0x01ba
            java.lang.String r0 = "fragment_clips"
            androidx.fragment.app.Fragment r1 = r10.A0R(r0)
            if (r1 == 0) goto L_0x01ba
            boolean r0 = r1 instanceof X.C227232is
            if (r0 == 0) goto L_0x01ba
            X.2is r1 = (X.C227232is) r1
            r1.EBF()
        L_0x01ba:
            r3.markerEnd(r2, r14)
            return
        L_0x01be:
            r0 = 36320524084191783(0x81095300182227, double:3.032583909629892E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "AppEntryActionRefreshExplore"
            r3.markerAnnotate(r2, r0, r6)
            if (r23 == 0) goto L_0x01ba
            java.lang.String r0 = "fragment_search"
            androidx.fragment.app.Fragment r1 = r10.A0R(r0)
            if (r1 == 0) goto L_0x01ba
            boolean r0 = r1 instanceof X.AnonymousClass32L
            if (r0 == 0) goto L_0x01ba
            X.32L r1 = (X.AnonymousClass32L) r1
            X.GWY r15 = r1.A0J
            if (r15 != 0) goto L_0x01ed
            java.lang.String r0 = "viewController"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01ed:
            java.lang.Integer r16 = X.AnonymousClass05K.A00
            r18 = r8
            r20 = r7
            r21 = r7
            r17 = r8
            r19 = r7
            X.GWY.A00(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x01ba
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11343SOa.A01(X.0hq, com.instagram.common.session.UserSession, X.2Zc, java.lang.String, java.lang.ref.WeakReference, long):void");
    }

    public static final void A00(String str, WeakReference weakReference) {
        short s;
        Activity A0K = Pxg.A0K(weakReference);
        02m r3 = A00;
        if (A0K != null) {
            r3.markerAnnotate(728440635, "AppEntryActionRestart", str);
            Intent A0A = C66580MXl.A0A(A0K, A0K.getClass());
            A0A.addFlags(268533760);
            0kR.A0B(A0K, A0A);
            A0K.finish();
            18g A012 = C638918c.A01(C61170le.A00);
            A012.A0O(A012.A02, "RESET_TO_MAIN_FEED");
            s = 2;
        } else {
            r3.markerAnnotate(728440635, "AppEntryfailedOnRedetToFeed", str);
            s = 3;
        }
        r3.markerEnd(728440635, s);
    }
}
