package X;

/* renamed from: X.GKv  reason: case insensitive filesystem */
public final class C52254GKv extends C283285Gy {
    public final /* synthetic */ GC8 A00;

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x022b, code lost:
        if (X.182.A06(X.0Tu.A05, r11.A06, 36326996598536306L) == false) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x025f, code lost:
        if (r1 == X.GJF.CLOSED) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0267, code lost:
        r2 = r17.A06().A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02b6, code lost:
        if (X.182.A06(r3, r0, 36317543378261297L) != false) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x036f, code lost:
        if (((double) r33.getRawY()) < r3) goto L_0x0371;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04c5, code lost:
        if (r4 == false) goto L_0x02b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x057f  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x05a6  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x05c1  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x05c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onFling(android.view.MotionEvent r41, android.view.MotionEvent r42, float r43, float r44) {
        /*
            r40 = this;
            r12 = 1
            r38 = r42
            r0 = r38
            X.0qQ.A0B(r0, r12)
            r15 = 0
            r33 = r41
            if (r41 == 0) goto L_0x05c7
            r0 = r40
            X.GC8 r1 = r0.A00
            X.GC9 r0 = r1.A01
            r19 = r43
            r20 = r44
            r32 = r0
            r34 = r38
            r37 = r15
            r35 = r19
            r36 = r20
            java.lang.Integer r0 = r32.A00(r33, r34, r35, r36, r37)
            int r0 = r0.intValue()
            if (r0 == r12) goto L_0x04da
            if (r0 == r15) goto L_0x01fe
            r7 = 3
            if (r0 == r7) goto L_0x0125
            r6 = 2
            if (r0 != r6) goto L_0x05c7
            X.GC7 r4 = r1.A00
            X.GBj r5 = r4.A02
            r1 = 0
            if (r5 == 0) goto L_0x007f
            com.instagram.clips.intf.ClipsViewerConfig r8 = r4.A05
            com.instagram.clips.intf.ClipsWatchAndBrowseData r0 = r8.A0K
            if (r0 == 0) goto L_0x00d4
            int r0 = r5.A06()
            if (r0 != 0) goto L_0x00d4
            X.GDW r0 = r4.A01
            if (r0 == 0) goto L_0x00d4
            X.GDV r5 = r0.A03
            com.instagram.clips.intf.ClipsViewerConfig r0 = r5.A02
            com.instagram.clips.intf.ClipsWatchAndBrowseData r0 = r0.A0K
            if (r0 == 0) goto L_0x007e
            java.lang.Integer r0 = r0.A09
            if (r0 == 0) goto L_0x007e
            int r0 = r0.intValue()
            if (r0 == r7) goto L_0x0080
            if (r0 == r6) goto L_0x00a4
            if (r0 != r12) goto L_0x007e
            X.1Xj r4 = r5.A04
            if (r4 == 0) goto L_0x006f
            com.instagram.common.session.UserSession r3 = r5.A03
            X.4DU r2 = r5.A05
            java.lang.String r1 = "swipe_up_other_area"
            java.lang.String r0 = "dismiss"
            X.GDT.A00(r3, r4, r2, r1, r0)
        L_0x006f:
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r5.A01
            X.37D r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x007e
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x007b:
            r1.A0S(r0)
        L_0x007e:
            r1 = 0
        L_0x007f:
            return r1
        L_0x0080:
            X.3W1 r0 = r5.A06
            if (r0 == 0) goto L_0x007e
            X.GJF r0 = r0.A0n
            if (r0 == 0) goto L_0x007e
            int r0 = r0.ordinal()
            if (r0 == r6) goto L_0x00a4
            if (r0 == r12) goto L_0x0093
            if (r0 == r15) goto L_0x0093
            goto L_0x007e
        L_0x0093:
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r5.A01
            X.37D r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x016b
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1.A0S(r0)
            goto L_0x016b
        L_0x00a4:
            X.1Xj r4 = r5.A04
            if (r4 == 0) goto L_0x00b3
            com.instagram.common.session.UserSession r3 = r5.A03
            X.4DU r2 = r5.A05
            java.lang.String r1 = "swipe_up_other_area"
            java.lang.String r0 = "fullscreen"
            X.GDT.A00(r3, r4, r2, r1, r0)
        L_0x00b3:
            A00(r5, r6)
            X.S6e r3 = r5.A07
            if (r3 == 0) goto L_0x00c3
            java.lang.String r2 = "full"
            java.lang.String r1 = "expand"
            java.lang.String r0 = "external_swipe"
            r3.A02(r2, r1, r0)
        L_0x00c3:
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r5.A01
            X.37D r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x016b
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r1.A0T(r0)
            goto L_0x016b
        L_0x00d4:
            boolean r0 = r8.A28
            java.lang.String r3 = "swipe_bottom_to_top"
            if (r0 == 0) goto L_0x010d
            boolean r0 = r8.A1t
            if (r0 == 0) goto L_0x010d
            int r2 = r5.A08()
            int r0 = r5.A06()
            if (r2 != r0) goto L_0x010d
            X.Hpn r0 = r4.A0A
            r0.A00(r3)
            boolean r0 = r8.A00()
            if (r0 == 0) goto L_0x0106
            X.0eM r0 = r4.A0C
            java.lang.Object r3 = r0.getValue()
            X.GCc r3 = (X.C52030GCc) r3
            X.4bN r2 = X.C52012GBj.A04(r5)
            java.lang.String r1 = "swipe_up_other_area"
            java.lang.String r0 = "dismiss"
            r3.A05(r2, r1, r0)
        L_0x0106:
            androidx.fragment.app.FragmentActivity r0 = r4.A03
            r0.onBackPressed()
            goto L_0x05bf
        L_0x010d:
            boolean r0 = r8.A29
            if (r0 == 0) goto L_0x007f
            X.4bN r0 = X.C52012GBj.A04(r5)
            if (r0 == 0) goto L_0x0123
            X.5o2 r2 = r0.A01
        L_0x0119:
            X.5o2 r0 = X.C295365o2.GHOST
            if (r2 == r0) goto L_0x007f
            X.Hpn r0 = r4.A0A
            r0.A00(r3)
            goto L_0x0106
        L_0x0123:
            r2 = 0
            goto L_0x0119
        L_0x0125:
            X.GC7 r4 = r1.A00
            X.GBj r3 = r4.A02
            r1 = 0
            if (r3 == 0) goto L_0x007f
            com.instagram.clips.intf.ClipsViewerConfig r2 = r4.A05
            com.instagram.clips.intf.ClipsWatchAndBrowseData r0 = r2.A0K
            if (r0 == 0) goto L_0x01a5
            int r0 = r3.A06()
            if (r0 != 0) goto L_0x01a5
            X.GDW r0 = r4.A01
            if (r0 == 0) goto L_0x01a5
            X.GDV r2 = r0.A03
            com.instagram.clips.intf.ClipsViewerConfig r0 = r2.A02
            com.instagram.clips.intf.ClipsWatchAndBrowseData r6 = r0.A0K
            r1 = 0
            if (r6 == 0) goto L_0x01a3
            java.lang.Integer r0 = r6.A08
        L_0x0147:
            X.3W1 r3 = r2.A06
            if (r0 == 0) goto L_0x007e
            int r5 = r0.intValue()
            java.lang.String r4 = "dismiss"
            if (r5 == r12) goto L_0x01b9
            r3 = 4
            if (r5 == r3) goto L_0x01d6
            r0 = 2
            java.lang.String r1 = "collapse"
            if (r5 == r0) goto L_0x016d
            if (r5 != r7) goto L_0x007e
            int r0 = r2.A00
            if (r0 != r3) goto L_0x018b
            r2.A00 = r12
            X.GDV.A00(r2, r4)
            androidx.fragment.app.FragmentActivity r0 = r2.A01
        L_0x0168:
            r0.onBackPressed()
        L_0x016b:
            r1 = 1
            return r1
        L_0x016d:
            int r0 = r2.A00
            if (r0 != r3) goto L_0x0178
            java.lang.String r0 = "no_change"
            X.GDV.A00(r2, r0)
            goto L_0x007e
        L_0x0178:
            X.GDV.A00(r2, r1)
            A00(r2, r3)
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r2.A01
            X.37D r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x01a0
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            goto L_0x019d
        L_0x018b:
            X.GDV.A00(r2, r1)
            A00(r2, r3)
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r2.A01
            X.37D r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x01a0
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
        L_0x019d:
            r1.A0U(r0, r12)
        L_0x01a0:
            r2.A00 = r3
            goto L_0x016b
        L_0x01a3:
            r0 = r1
            goto L_0x0147
        L_0x01a5:
            int r0 = r3.A06()
            if (r0 != 0) goto L_0x007f
            boolean r0 = r2.A26
            if (r0 == 0) goto L_0x007f
            X.Hpn r1 = r4.A0A
            java.lang.String r0 = "swipe_top_to_buttom"
            r1.A00(r0)
            androidx.fragment.app.FragmentActivity r0 = r4.A03
            goto L_0x0168
        L_0x01b9:
            X.GDV.A00(r2, r4)
            if (r6 == 0) goto L_0x01d1
            boolean r0 = r6.A0D
            if (r0 != r12) goto L_0x01d1
            if (r3 == 0) goto L_0x01c6
            X.GJF r1 = r3.A0n
        L_0x01c6:
            X.GJF r0 = X.GJF.CLOSED
            if (r1 != r0) goto L_0x01d1
            androidx.fragment.app.FragmentActivity r0 = r2.A01
            r0.onBackPressed()
            goto L_0x007e
        L_0x01d1:
            X.37E r4 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r5 = r2.A01
            goto L_0x01f4
        L_0x01d6:
            X.GDV.A00(r2, r4)
            X.37E r4 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r5 = r2.A01
            X.37D r3 = r4.A01(r5)
            if (r3 == 0) goto L_0x01f4
            X.37F r3 = (X.AnonymousClass37F) r3
            X.GPw r0 = r3.A0E
            if (r0 == 0) goto L_0x01f4
            boolean r2 = r0.A01
            boolean r1 = r0.A00
            X.GPw r0 = new X.GPw
            r0.<init>(r2, r12, r1)
            r3.A0E = r0
        L_0x01f4:
            X.37D r1 = r4.A01(r5)
            if (r1 == 0) goto L_0x007e
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x007b
        L_0x01fe:
            X.GC7 r11 = r1.A00
            X.GBj r0 = r11.A02
            r18 = r0
            if (r0 == 0) goto L_0x05c7
            X.4bN r17 = X.C52012GBj.A04(r18)
            if (r17 == 0) goto L_0x05c7
            X.0eM r0 = X.C52204GIv.A02
            java.lang.Object r0 = r0.getValue()
            X.GIv r0 = (X.C52204GIv) r0
            long r13 = r0.A00()
            r0 = r17
            boolean r0 = r0.A0b
            if (r0 == 0) goto L_0x022d
            com.instagram.common.session.UserSession r3 = r11.A06
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326996598536306(0x810f3600033872, double:3.036677153764092E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x04d7
        L_0x022d:
            boolean r0 = r17.A0E()
            if (r0 != 0) goto L_0x04d7
            boolean r0 = r17.A0F()
            if (r0 != 0) goto L_0x04d7
            com.instagram.clips.intf.ClipsViewerConfig r1 = r11.A05
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x0261
            boolean r0 = r17.A0J()
            if (r0 == 0) goto L_0x0261
            com.instagram.clips.intf.ClipsWatchAndBrowseData r0 = r1.A0K
            if (r0 == 0) goto L_0x04d7
            boolean r0 = r0.A0D
            if (r0 != r12) goto L_0x04d7
            X.GD6 r1 = r11.A0B
            r0 = r17
            X.GDe r0 = X.JSx.A00(r0, r1)
            X.3W1 r0 = r0.A0E
            if (r0 == 0) goto L_0x04cf
            X.GJF r1 = r0.A0n
        L_0x025d:
            X.GJF r0 = X.GJF.CLOSED
            if (r1 != r0) goto L_0x04d7
        L_0x0261:
            boolean r0 = r17.CcK()
            if (r0 == 0) goto L_0x04d7
            X.3OA r0 = r17.A06()
            java.util.List r2 = r0.A04()
            androidx.fragment.app.FragmentActivity r1 = r11.A03
            com.instagram.common.session.UserSession r0 = r11.A06
            com.instagram.model.androidlink.AndroidLink r7 = X.AnonymousClass47K.A03(r1, r0, r2, r15)
            if (r7 == 0) goto L_0x04d7
            java.lang.String r3 = r7.CGH()
            if (r3 == 0) goto L_0x04d7
            X.14E r2 = X.14D.A04
            X.14D r1 = r2.A00()
            if (r1 == 0) goto L_0x04c9
            X.34S r1 = r1.A00(r0, r3)
            if (r1 == 0) goto L_0x04c9
            r6 = 1
        L_0x028e:
            android.content.Context r5 = r11.A02
            com.instagram.inappbrowser.launcher.ExternalBrowserLauncher r1 = new com.instagram.inappbrowser.launcher.ExternalBrowserLauncher
            r1.<init>(r5, r0)
            java.lang.Integer r2 = r1.A02()
            java.lang.Integer r1 = X.AnonymousClass05K.A0F
            boolean r1 = r2.equals(r1)
            r4 = r1 ^ 1
            X.47L r2 = X.C271714jT.A01(r7)
            if (r2 == 0) goto L_0x04d2
            X.47L r1 = X.AnonymousClass47L.AD_DESTINATION_APP_STORE
            if (r2 != r1) goto L_0x04b2
            X.0Tu r3 = X.0Tu.A05
            r1 = 36317543378261297(0x81069d002d1531, double:3.0306988991971134E-306)
            boolean r1 = X.182.A06(r3, r0, r1)
            if (r1 == 0) goto L_0x04d7
        L_0x02b8:
            X.0qQ.A0B(r0, r15)
            X.0qQ.A0B(r5, r12)
            r1 = 36319970032033630(0x8108d200031f5e, double:3.032233524814087E-306)
            boolean r1 = X.182.A06(r3, r0, r1)
            if (r1 == 0) goto L_0x0371
            r1 = 36319970033672031(0x8108d2001c1f5f, double:3.0322335258502186E-306)
            boolean r1 = X.182.A06(r3, r0, r1)
            if (r1 == 0) goto L_0x03b2
            r1 = 37
            X.IwK r2 = X.C58711IwK.A00(r0, r1)
            java.lang.Class<X.I43> r1 = X.I43.class
            java.lang.Object r1 = r0.A01(r1, r2)
            X.I43 r1 = (X.I43) r1
            X.Glt r4 = r1.A00
            long r1 = r4.A00
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x03a4
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x02ec:
            int r1 = r1.intValue()
            if (r1 == r15) goto L_0x03a0
            if (r1 == r12) goto L_0x039c
            X.Glb r9 = r4.A07
        L_0x02f6:
            float r2 = r33.getX()
            float r1 = r38.getX()
            float r2 = X.AnonymousClass7TE.A00(r2, r1)
            int r1 = r9.A05
            float r1 = X.0nA.A04(r5, r1)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x04d7
            float r3 = r33.getX()
            float r2 = r33.getY()
            float r6 = r38.getX()
            float r1 = r38.getY()
            float r6 = r6 - r3
            float r1 = r1 - r2
            double r1 = (double) r1
            double r3 = java.lang.Math.abs(r1)
            double r1 = (double) r6
            double r1 = java.lang.Math.abs(r1)
            double r1 = java.lang.Math.atan2(r3, r1)
            double r6 = java.lang.Math.toDegrees(r1)
            int r1 = r9.A04
            double r1 = (double) r1
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x04d7
            int r1 = X.AnonymousClass0nB.A01(r5)
            int r3 = X.AnonymousClass0nB.A00(r5)
            double r7 = (double) r1
            double r5 = r9.A00
            double r5 = r5 * r7
            double r1 = r9.A02
            double r7 = r7 * r1
            double r3 = (double) r3
            double r1 = r9.A03
            double r1 = r1 * r3
            double r9 = r9.A01
            double r3 = r3 * r9
            float r9 = r33.getRawX()
            double r9 = (double) r9
            int r16 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r16 <= 0) goto L_0x04d7
            float r5 = r33.getRawX()
            double r5 = (double) r5
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x04d7
            float r5 = r33.getRawY()
            double r5 = (double) r5
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x04d7
            float r1 = r33.getRawY()
            double r1 = (double) r1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x04d7
        L_0x0371:
            r6 = 1
            X.4DH r4 = r11.A04
            android.os.Bundle r3 = r4.mArguments
            if (r3 != 0) goto L_0x037c
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
        L_0x037c:
            r1 = 675(0x2a3, float:9.46E-43)
            java.lang.String r2 = X.Pxd.A00(r1)
            r3.putBoolean(r2, r12)
            boolean r1 = r4.isStateSaved()
            if (r1 != 0) goto L_0x038e
            r4.setArguments(r3)
        L_0x038e:
            X.JTB r1 = r11.A00
            if (r1 != 0) goto L_0x0521
            java.lang.String r0 = "delegate"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x039c:
            X.Glb r9 = r4.A06
            goto L_0x02f6
        L_0x03a0:
            X.Glb r9 = r4.A05
            goto L_0x02f6
        L_0x03a4:
            long r1 = r4.A01
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x03ae
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x02ec
        L_0x03ae:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x02ec
        L_0x03b2:
            android.content.Context r2 = X.DbT.A05(r5)
            r1 = r17
            boolean r7 = X.C52348GOs.A03(r2, r1, r0)
            X.0Tu r3 = X.0Tu.A06
            if (r7 == 0) goto L_0x04ab
            r1 = 36601445010247876(0x8208d2001a10c4, double:3.21023943444554E-306)
        L_0x03c5:
            int r4 = X.DbS.A04(r3, r0, r1)
            if (r7 == 0) goto L_0x04a4
            r1 = 36601445010313413(0x8208d2001b10c5, double:3.2102394344869856E-306)
        L_0x03d0:
            int r6 = X.DbS.A04(r3, r0, r1)
            long r1 = (long) r4
            int r4 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x0418
            r1 = 36601445009330366(0x8208d2000c10be, double:3.210239433865303E-306)
            int r30 = X.DbS.A04(r3, r0, r1)
            r1 = 36601445009395903(0x8208d2000d10bf, double:3.2102394339067486E-306)
            int r31 = X.DbS.A04(r3, r0, r1)
            r1 = 37164394963075392(0x8408d200110140, double:3.566251251431173E-306)
            double r22 = X.182.A00(r3, r0, r1)
            r1 = 37164394962878781(0x8408d2000e013d, double:3.5662512513068354E-306)
            double r24 = X.182.A00(r3, r0, r1)
            r1 = 37164394963009855(0x8408d20010013f, double:3.566251251389727E-306)
            double r26 = X.182.A00(r3, r0, r1)
            r1 = 37164394962944318(0x8408d2000f013e, double:3.566251251348281E-306)
        L_0x040b:
            double r28 = X.182.A00(r3, r0, r1)
            X.Glb r9 = new X.Glb
            r21 = r9
            r21.<init>(r22, r24, r26, r28, r30, r31)
            goto L_0x02f6
        L_0x0418:
            long r1 = (long) r6
            int r4 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0460
            if (r7 == 0) goto L_0x045a
            r1 = 36601445010116802(0x8208d2001810c2, double:3.210239434362648E-306)
        L_0x0424:
            int r30 = X.DbS.A04(r3, r0, r1)
            if (r7 == 0) goto L_0x0454
            r1 = 36601445009985728(0x8208d2001610c0, double:3.210239434279756E-306)
        L_0x042f:
            int r31 = X.DbS.A04(r3, r0, r1)
            r1 = 37164394963206466(0x8408d200130142, double:3.566251251514065E-306)
            double r22 = X.182.A00(r3, r0, r1)
            r1 = 37164394963140929(0x8408d200120141, double:3.566251251472619E-306)
            double r24 = X.182.A00(r3, r0, r1)
            r1 = 37164394963272003(0x8408d200140143, double:3.5662512515555106E-306)
            double r26 = X.182.A00(r3, r0, r1)
            r1 = 37164394963337540(0x8408d200150144, double:3.5662512515969564E-306)
            goto L_0x040b
        L_0x0454:
            r1 = 36601445009199292(0x8208d2000a10bc, double:3.210239433782411E-306)
            goto L_0x042f
        L_0x045a:
            r1 = 36601445009264829(0x8208d2000b10bd, double:3.210239433823857E-306)
            goto L_0x0424
        L_0x0460:
            if (r7 == 0) goto L_0x049e
            r1 = 36601445010182339(0x8208d2001910c3, double:3.210239434404094E-306)
        L_0x0467:
            int r30 = X.DbS.A04(r3, r0, r1)
            if (r7 == 0) goto L_0x0498
            r1 = 36601445010051265(0x8208d2001710c1, double:3.210239434321202E-306)
        L_0x0472:
            int r31 = X.DbS.A04(r3, r0, r1)
            r1 = 37164394962223417(0x8408d200040139, double:3.5662512508923805E-306)
            double r22 = X.182.A00(r3, r0, r1)
            r1 = 37164394962354491(0x8408d20006013b, double:3.566251250975272E-306)
            double r24 = X.182.A00(r3, r0, r1)
            r1 = 37164394962288954(0x8408d20005013a, double:3.5662512509338264E-306)
            double r26 = X.182.A00(r3, r0, r1)
            r1 = 37164394962420028(0x8408d20007013c, double:3.566251251016718E-306)
            goto L_0x040b
        L_0x0498:
            r1 = 36601445008675001(0x8208d2000210b9, double:3.210239433450847E-306)
            goto L_0x0472
        L_0x049e:
            r1 = 36601445008609464(0x8208d2000110b8, double:3.2102394334094014E-306)
            goto L_0x0467
        L_0x04a4:
            r1 = 36601445009133755(0x8208d2000910bb, double:3.210239433740965E-306)
            goto L_0x03d0
        L_0x04ab:
            r1 = 36601445009068218(0x8208d2000810ba, double:3.210239433699519E-306)
            goto L_0x03c5
        L_0x04b2:
            X.47L r1 = X.AnonymousClass47L.AD_DESTINATION_WEB
            if (r2 != r1) goto L_0x04d7
            X.0Tu r3 = X.0Tu.A05
            r1 = 36317543378261297(0x81069d002d1531, double:3.0306988991971134E-306)
            boolean r1 = X.182.A06(r3, r0, r1)
            if (r1 != 0) goto L_0x04d7
            if (r6 != 0) goto L_0x04d7
            if (r4 != 0) goto L_0x04d7
            goto L_0x02b8
        L_0x04c9:
            r2.A00()
            r6 = 0
            goto L_0x028e
        L_0x04cf:
            r1 = 0
            goto L_0x025d
        L_0x04d2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x04d7:
            r6 = 0
            goto L_0x0575
        L_0x04da:
            X.GC7 r2 = r1.A00
            X.GBj r0 = r2.A02
            if (r0 == 0) goto L_0x05c7
            X.4bN r3 = X.C52012GBj.A04(r0)
            if (r3 == 0) goto L_0x05c7
            com.instagram.clips.intf.ClipsViewerConfig r0 = r2.A05
            boolean r0 = r0.A27
            if (r0 == 0) goto L_0x04f8
            X.Hpn r1 = r2.A0A
            java.lang.String r0 = "swipe_right_to_left"
            r1.A00(r0)
            androidx.fragment.app.FragmentActivity r0 = r2.A03
            r0.onBackPressed()
        L_0x04f8:
            X.0eM r0 = r2.A0C
            java.lang.Object r2 = r0.getValue()
            X.GCc r2 = (X.C52030GCc) r2
            float r15 = r33.getRawX()
            float r16 = r33.getRawY()
            float r17 = r38.getRawX()
            float r18 = r38.getRawY()
            r4 = 0
            java.lang.String r11 = "swipe_right"
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r12 = r4
            r13 = r4
            r14 = r4
            r2.A04(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x05bf
        L_0x0521:
            X.GD6 r5 = r11.A0B
            r4 = r17
            X.GDe r24 = X.JSx.A00(r4, r5)
            X.ILk r22 = new X.ILk
            r22.<init>()
            X.2EG r25 = X.2EG.A0u
            r27 = 0
            r29 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r15)
            r21 = r1
            r23 = r4
            r28 = r27
            r30 = r29
            r31 = r12
            r32 = r15
            r21.D3Z(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r3.remove(r2)
            android.view.View r4 = X.C52012GBj.A02(r18)
            if (r4 == 0) goto L_0x0575
            X.3Dp r3 = X.C51967G9n.A0X(r0)
            X.4DU r2 = r11.A07
            X.GCs r1 = new X.GCs
            r1.<init>(r0, r2)
            r21 = r1
            r22 = r4
            r23 = r27
            r24 = r27
            r25 = r17
            r26 = r27
            r27 = r15
            r28 = r15
            r21.A03(r22, r23, r24, r25, r26, r27, r28)
            X.3Ds r1 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            java.lang.String[] r0 = new java.lang.String[r15]
            r3.A07(r4, r1, r0, r15)
        L_0x0575:
            X.0eM r0 = r11.A0C
            java.lang.Object r0 = r0.getValue()
            X.GCc r0 = (X.C52030GCc) r0
            if (r6 == 0) goto L_0x05c4
            java.lang.String r30 = "swipe_left_end"
        L_0x0581:
            float r34 = r33.getRawX()
            float r35 = r33.getRawY()
            float r36 = r38.getRawX()
            float r37 = r38.getRawY()
            double r1 = (double) r13
            java.lang.Double r25 = java.lang.Double.valueOf(r1)
            r26 = 0
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r15)
            com.instagram.common.session.UserSession r2 = r11.A06
            r1 = r17
            java.lang.String r31 = X.C52348GOs.A02(r1, r2)
            if (r6 == 0) goto L_0x05c1
            java.lang.String r32 = "mai"
        L_0x05a8:
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r12)
            r21 = r0
            r22 = r1
            r27 = r26
            r28 = r26
            r29 = r26
            r33 = r26
            r38 = r19
            r39 = r20
            r21.A04(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
        L_0x05bf:
            r15 = 1
            return r15
        L_0x05c1:
            r32 = 0
            goto L_0x05a8
        L_0x05c4:
            java.lang.String r30 = "swipe_left"
            goto L_0x0581
        L_0x05c7:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52254GKv.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public C52254GKv(GC8 gc8) {
        this.A00 = gc8;
    }

    public static void A00(GDV gdv, int i) {
        if (gdv.A08) {
            if (!182.A06(0Tu.A05, gdv.A03, 36321284292224237L)) {
                C263264Jy.A03(gdv.A01, i);
            }
        }
    }
}
