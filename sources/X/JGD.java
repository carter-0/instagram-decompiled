package X;

public final class JGD extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGD(int i, int i2, Object obj) {
        super(2);
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj;
    }

    public static int A00(JGD jgd) {
        return C301445zH.A00(jgd.A01 | 1);
    }

    public static void A01(C286625Xd r1, Object obj, int i, int i2) {
        r1.A06 = new JGD(i, i2, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:0x054d, code lost:
        X.0fL.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0562, code lost:
        r10.Evl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r20, java.lang.Object r21) {
        /*
            r19 = this;
            r5 = r19
            r10 = r20
            int r0 = r5.A00
            r1 = r21
            switch(r0) {
                case 0: goto L_0x0578;
                case 1: goto L_0x0567;
                case 2: goto L_0x0479;
                case 3: goto L_0x0441;
                case 4: goto L_0x03e0;
                case 5: goto L_0x0359;
                case 6: goto L_0x0324;
                case 7: goto L_0x0313;
                case 8: goto L_0x0302;
                case 9: goto L_0x02f1;
                case 10: goto L_0x02e0;
                case 11: goto L_0x02cf;
                case 12: goto L_0x02be;
                case 13: goto L_0x0287;
                case 14: goto L_0x0276;
                case 15: goto L_0x0265;
                case 16: goto L_0x0254;
                case 17: goto L_0x0243;
                case 18: goto L_0x0232;
                case 19: goto L_0x0221;
                case 20: goto L_0x0210;
                case 21: goto L_0x01ff;
                case 22: goto L_0x01ee;
                case 23: goto L_0x01dd;
                case 24: goto L_0x01cc;
                case 25: goto L_0x01bb;
                case 26: goto L_0x01aa;
                case 27: goto L_0x0199;
                case 28: goto L_0x0188;
                case 29: goto L_0x0177;
                case 30: goto L_0x0166;
                case 31: goto L_0x0155;
                case 32: goto L_0x000b;
                case 33: goto L_0x000b;
                case 34: goto L_0x0144;
                case 35: goto L_0x0133;
                case 36: goto L_0x0122;
                case 37: goto L_0x0111;
                case 38: goto L_0x0100;
                case 39: goto L_0x00c0;
                case 40: goto L_0x00af;
                case 41: goto L_0x009e;
                case 42: goto L_0x008d;
                case 43: goto L_0x007d;
                case 44: goto L_0x006d;
                case 45: goto L_0x005d;
                case 46: goto L_0x004d;
                case 47: goto L_0x003d;
                case 48: goto L_0x002d;
                case 49: goto L_0x001d;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = A00(r5)
            X.I7S.A01(r2, r1, r0)
        L_0x001a:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x001d:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = A00(r5)
            X.I3B.A01(r2, r1, r0)
            goto L_0x001a
        L_0x002d:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            com.instagram.schools.management.data.SchoolInfo r1 = (com.instagram.schools.management.data.SchoolInfo) r1
            int r0 = A00(r5)
            X.I59.A03(r2, r1, r0)
            goto L_0x001a
        L_0x003d:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            com.instagram.schools.management.data.SchoolInfo r1 = (com.instagram.schools.management.data.SchoolInfo) r1
            int r0 = A00(r5)
            X.I59.A02(r2, r1, r0)
            goto L_0x001a
        L_0x004d:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.C56642I5x.A04(r1, r2, r0)
            goto L_0x001a
        L_0x005d:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.I38.A02(r1, r2, r0)
            goto L_0x001a
        L_0x006d:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.I38.A01(r1, r2, r0)
            goto L_0x001a
        L_0x007d:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = A00(r5)
            X.I36.A02(r2, r1, r0)
            goto L_0x001a
        L_0x008d:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = A00(r5)
            X.I36.A01(r2, r1, r0)
            goto L_0x001a
        L_0x009e:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.C55125HcY.A00(r1, r2, r0)
            goto L_0x001a
        L_0x00af:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            int r0 = A00(r5)
            X.C55099Hc8.A00(r2, r1, r0)
            goto L_0x001a
        L_0x00c0:
            X.5Wy r10 = (X.C286575Wy) r10
            int r1 = X.C51968G9o.A0B(r1)
            r0 = 2
            if (r1 != r0) goto L_0x00cf
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0562
        L_0x00cf:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00dd
            r1 = 429637577(0x199bbfc9, float:1.6104086E-23)
            java.lang.String r0 = "com.instagram.profilecard.ui.ProfileCardDownloadBottomSheetFragment.onCreateView.<anonymous> (ProfileCardDownloadBottomSheetFragment.kt:45)"
            X.0fL.A01(r1, r0)
        L_0x00dd:
            int r2 = r5.A01
            java.lang.Object r0 = r5.A02
            X.Gza r0 = (X.C54105Gza) r0
            X.F0P r1 = r0.A00
            if (r1 != 0) goto L_0x00f1
            java.lang.String r0 = "delegate"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00f1:
            r0 = 0
            X.C56595I2z.A01(r10, r1, r2, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x001a
            r0 = 507808384(0x1e448a80, float:1.0404795E-20)
            goto L_0x054d
        L_0x0100:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.62P r1 = (X.AnonymousClass62P) r1
            int r0 = A00(r5)
            X.C55088Hbx.A00(r1, r2, r0)
            goto L_0x001a
        L_0x0111:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.C56593I2x.A02(r1, r2, r0)
            goto L_0x001a
        L_0x0122:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.C56593I2x.A01(r1, r2, r0)
            goto L_0x001a
        L_0x0133:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = A00(r5)
            X.I53.A02(r2, r1, r0)
            goto L_0x001a
        L_0x0144:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.G7h r1 = (X.C51913G7h) r1
            int r0 = A00(r5)
            X.C55076Hbl.A00(r2, r1, r0)
            goto L_0x001a
        L_0x0155:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.6Bd r1 = (X.C303876Bd) r1
            int r0 = A00(r5)
            X.GRD.A01(r2, r1, r0)
            goto L_0x001a
        L_0x0166:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.6Bd r1 = (X.C303876Bd) r1
            int r0 = A00(r5)
            X.GRD.A00(r2, r1, r0)
            goto L_0x001a
        L_0x0177:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.C55065Hba.A00(r1, r2, r0)
            goto L_0x001a
        L_0x0188:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.I7A.A07(r1, r2, r0)
            goto L_0x001a
        L_0x0199:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = A00(r5)
            X.GQY.A01(r2, r1, r0)
            goto L_0x001a
        L_0x01aa:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = A00(r5)
            X.GQY.A00(r2, r1, r0)
            goto L_0x001a
        L_0x01bb:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.GZF r1 = (X.GZF) r1
            int r0 = A00(r5)
            X.I5Q.A01(r1, r2, r0)
            goto L_0x001a
        L_0x01cc:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.C55022Hat.A00(r1, r2, r0)
            goto L_0x001a
        L_0x01dd:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.HBP r1 = (X.HBP) r1
            int r0 = A00(r5)
            X.I79.A08(r2, r1, r0)
            goto L_0x001a
        L_0x01ee:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.HBO r1 = (X.HBO) r1
            int r0 = A00(r5)
            X.I6R.A03(r2, r1, r0)
            goto L_0x001a
        L_0x01ff:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.HBO r1 = (X.HBO) r1
            int r0 = A00(r5)
            X.I6R.A02(r2, r1, r0)
            goto L_0x001a
        L_0x0210:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.H19 r1 = (X.H19) r1
            int r0 = A00(r5)
            X.H19.A04(r2, r1, r0)
            goto L_0x001a
        L_0x0221:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.H19 r1 = (X.H19) r1
            int r0 = A00(r5)
            X.H19.A03(r2, r1, r0)
            goto L_0x001a
        L_0x0232:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = A00(r5)
            X.C56303HwG.A00(r2, r1, r0)
            goto L_0x001a
        L_0x0243:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.Mtx r1 = (X.C67744Mtx) r1
            int r0 = A00(r5)
            X.C56298HwB.A01(r2, r1, r0)
            goto L_0x001a
        L_0x0254:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.Pvd r1 = (X.C74483Pvd) r1
            int r0 = A00(r5)
            X.C56584I2o.A02(r2, r1, r0)
            goto L_0x001a
        L_0x0265:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.79c r1 = (X.AnonymousClass79c) r1
            int r0 = A00(r5)
            X.C54958HZo.A00(r2, r1, r0)
            goto L_0x001a
        L_0x0276:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.Mu4 r1 = (X.C67751Mu4) r1
            int r0 = A00(r5)
            X.C54947HZd.A00(r2, r1, r0)
            goto L_0x001a
        L_0x0287:
            X.5Wy r10 = (X.C286575Wy) r10
            int r1 = X.C51968G9o.A0C(r1)
            r0 = 2
            if (r1 != r0) goto L_0x0296
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0562
        L_0x0296:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x02a4
            r1 = 2106371971(0x7d8caf83, float:2.3375404E37)
            java.lang.String r0 = "com.instagram.direct.fragment.thread.chatsettings.customthemepreview.CustomThemePreviewFragment.updateViews.<anonymous>.<anonymous> (CustomThemePreviewFragment.kt:268)"
            X.0fL.A01(r1, r0)
        L_0x02a4:
            int r3 = r5.A01
            java.lang.Object r2 = r5.A02
            r0 = 30
            X.PlY r1 = new X.PlY
            r1.<init>(r2, r0)
            r0 = 0
            X.C54946HZc.A00(r10, r1, r3, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x001a
            r0 = -179052666(0xfffffffff553df86, float:-2.6858111E32)
            goto L_0x054d
        L_0x02be:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.OAO r1 = (X.OAO) r1
            int r0 = A00(r5)
            X.C54945HZb.A00(r2, r1, r0)
            goto L_0x001a
        L_0x02cf:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.C56583I2n.A02(r1, r2, r0)
            goto L_0x001a
        L_0x02e0:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.C56583I2n.A01(r1, r2, r0)
            goto L_0x001a
        L_0x02f1:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.6HD r1 = (X.AnonymousClass6HD) r1
            int r0 = A00(r5)
            X.C56581I2l.A01(r2, r1, r0)
            goto L_0x001a
        L_0x0302:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.6HD r1 = (X.AnonymousClass6HD) r1
            int r0 = A00(r5)
            X.C56581I2l.A00(r2, r1, r0)
            goto L_0x001a
        L_0x0313:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r0 = A00(r5)
            X.C56288Hvw.A01(r2, r1, r0)
            goto L_0x001a
        L_0x0324:
            X.5Wy r10 = (X.C286575Wy) r10
            int r1 = X.C51968G9o.A0B(r1)
            r0 = 2
            if (r1 != r0) goto L_0x0333
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0562
        L_0x0333:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0341
            r1 = 1118000727(0x42a35657, float:81.66863)
            java.lang.String r0 = "com.instagram.creator.agent.settings.facts.fragment.InformationFragment.onCreateView.<anonymous> (InformationFragment.kt:66)"
            X.0fL.A01(r1, r0)
        L_0x0341:
            r4 = 849556252(0x32a3331c, float:1.899894E-8)
            java.lang.Object r3 = r5.A02
            int r2 = r5.A01
            r1 = 5
            X.JGD r0 = new X.JGD
            r0.<init>(r2, r1, r3)
            boolean r0 = X.C51975G9x.A1T(r10, r0, r4)
            if (r0 == 0) goto L_0x001a
            r0 = 1398308029(0x53587cbd, float:9.298057E11)
            goto L_0x054d
        L_0x0359:
            X.5Wy r10 = (X.C286575Wy) r10
            int r1 = X.C51968G9o.A0B(r1)
            r0 = 2
            if (r1 != r0) goto L_0x0368
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0562
        L_0x0368:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0376
            r1 = 1273904598(0x4bee3dd6, float:3.1226796E7)
            java.lang.String r0 = "com.instagram.creator.agent.settings.facts.fragment.InformationFragment.onCreateView.<anonymous>.<anonymous> (InformationFragment.kt:67)"
            X.0fL.A01(r1, r0)
        L_0x0376:
            java.lang.Object r4 = r5.A02
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            int r5 = r5.A01
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
            X.5Zx r1 = X.C287275Zs.A07
            X.5Zr r0 = X.C287215Zl.A02
            r7 = 0
            X.5RD r1 = X.C291495hO.A02(r1, r10, r0, r7)
            int r6 = X.C287425a7.A00(r10)
            r3 = r10
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r0 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r10, r2)
            X.C51973G9u.A0y(r10, r3)
            X.C51971G9r.A12(r10, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x03a8
            boolean r0 = X.C51972G9s.A1Q(r10, r6)
            if (r0 != 0) goto L_0x03ab
        L_0x03a8:
            X.C51971G9r.A13(r10, r1, r6)
        L_0x03ab:
            X.C51965G9l.A18(r10, r2)
            r2 = 0
            r0 = 7
            X.Gbq r1 = new X.Gbq
            r1.<init>(r2, r0, r7)
            r0 = 2131957002(0x7f13150a, float:1.9550576E38)
            java.lang.String r0 = X.C288035bG.A00(r10, r0)
            X.C52739Gbr.A04(r10, r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.4bM r0 = X.C56390Hxj.A00
            X.5Xl r3 = r0.A02(r1)
            r2 = 117313106(0x6fe0e52, float:9.556522E-35)
            r1 = 4
            X.JGD r0 = new X.JGD
            r0.<init>(r5, r1, r4)
            X.C51971G9r.A11(r10, r3, r0, r2)
            boolean r0 = X.C51967G9n.A1R(r10)
            if (r0 == 0) goto L_0x001a
            r0 = -1122511333(0xffffffffbd17d61b, float:-0.03706942)
            goto L_0x054d
        L_0x03e0:
            X.5Wy r10 = (X.C286575Wy) r10
            int r1 = X.C51968G9o.A0B(r1)
            r0 = 2
            if (r1 != r0) goto L_0x03ef
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0562
        L_0x03ef:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x03fd
            r1 = 359328882(0x156aec72, float:4.7442446E-26)
            java.lang.String r0 = "com.instagram.creator.agent.settings.facts.fragment.InformationFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InformationFragment.kt:73)"
            X.0fL.A01(r1, r0)
        L_0x03fd:
            java.lang.Object r1 = r5.A02
            X.H20 r1 = (X.H20) r1
            X.0eM r0 = r1.A00
            java.lang.String r11 = X.DbS.A0t(r0)
            X.62P r14 = r1.A03
            int r15 = r5.A01
            X.0eM r0 = r1.A01
            java.lang.String r12 = X.DbS.A0t(r0)
            r0 = 1435549281(0x5590be61, float:1.98934182E13)
            boolean r0 = X.C51967G9n.A1Z(r10, r1, r0)
            java.lang.Object r13 = r10.ECw()
            if (r0 != 0) goto L_0x0422
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r13 != r0) goto L_0x042b
        L_0x0422:
            r0 = 1
            X.InY r13 = new X.InY
            r13.<init>(r1, r0)
            r10.FLL(r13)
        L_0x042b:
            X.0Ya r13 = (X.C59520Ya) r13
            boolean r16 = X.C51968G9o.A1Y(r10)
            X.0sG r13 = (X.0sG) r13
            X.HZG.A00(r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x001a
            r0 = -847509313(0xffffffffcd7c08bf, float:-2.64276976E8)
            goto L_0x054d
        L_0x0441:
            X.5Wy r10 = (X.C286575Wy) r10
            int r0 = X.C51968G9o.A0B(r1)
            r6 = 2
            if (r0 != r6) goto L_0x0450
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0562
        L_0x0450:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x045e
            r1 = -1858112781(0xffffffff913f72f3, float:-1.5102665E-28)
            java.lang.String r0 = "com.instagram.creator.agent.settings.facts.fragment.AddFactFragment.onCreateView.<anonymous> (AddFactFragment.kt:129)"
            X.0fL.A01(r1, r0)
        L_0x045e:
            androidx.compose.ui.Modifier r4 = X.C51969G9p.A0U()
            r3 = 386785404(0x170de07c, float:4.5842896E-25)
            java.lang.Object r2 = r5.A02
            int r1 = r5.A01
            X.JGD r0 = new X.JGD
            r0.<init>(r1, r6, r2)
            boolean r0 = X.C51972G9s.A1U(r10, r4, r0, r3)
            if (r0 == 0) goto L_0x001a
            r0 = 1892293741(0x70ca1c6d, float:5.004027E29)
            goto L_0x054d
        L_0x0479:
            X.5Wy r10 = (X.C286575Wy) r10
            int r1 = X.C51968G9o.A0B(r1)
            r0 = 2
            if (r1 != r0) goto L_0x0488
            boolean r0 = r10.Bwn()
            if (r0 != 0) goto L_0x0562
        L_0x0488:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0496
            r1 = -151201644(0xfffffffff6fcd894, float:-2.5641632E33)
            java.lang.String r0 = "com.instagram.creator.agent.settings.facts.fragment.AddFactFragment.onCreateView.<anonymous>.<anonymous> (AddFactFragment.kt:130)"
            X.0fL.A01(r1, r0)
        L_0x0496:
            java.lang.Object r4 = r5.A02
            X.H0U r4 = (X.H0U) r4
            X.0eM r7 = r4.A09
            java.lang.Object r0 = r7.getValue()
            X.H2d r0 = (X.C54183H2d) r0
            X.H2V r0 = r0.A00
            X.0Ud r0 = r0.A06
            r3 = 0
            r2 = 0
            X.4gU r9 = X.AnonymousClass6FW.A02(r10, r0, r2)
            java.lang.Object r0 = r7.getValue()
            X.H2d r0 = (X.C54183H2d) r0
            X.H2Q r1 = r0.A02
            boolean r0 = r1 instanceof com.instagram.creator.agent.settings.facts.viewmodel.SingularFactPreviewUseCaseImpl
            if (r0 == 0) goto L_0x0552
            com.instagram.creator.agent.settings.facts.viewmodel.SingularFactPreviewUseCaseImpl r1 = (com.instagram.creator.agent.settings.facts.viewmodel.SingularFactPreviewUseCaseImpl) r1
            X.0Ud r0 = r1.A03
        L_0x04bc:
            X.4gU r8 = X.AnonymousClass6FW.A02(r10, r0, r2)
            int r6 = r5.A01
            X.0eM r0 = r4.A07
            java.lang.String r13 = X.DbS.A0t(r0)
            X.0eM r0 = r4.A06
            java.lang.String r14 = X.DbS.A0t(r0)
            java.lang.Object r1 = r7.getValue()
            r0 = 1543590958(0x5c01542e, float:1.45611314E17)
            boolean r0 = X.C51967G9n.A1Z(r10, r1, r0)
            java.lang.Object r15 = r10.ECw()
            if (r0 != 0) goto L_0x04e3
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r15 != r0) goto L_0x04e9
        L_0x04e3:
            r0 = 14
            X.InR r15 = X.C51970G9q.A0q(r10, r1, r0)
        L_0x04e9:
            X.0Ya r15 = (X.C59520Ya) r15
            X.5Wx r5 = X.C51965G9l.A0H(r10, r2)
            X.0sL r15 = (X.0sL) r15
            java.lang.Object r7 = r7.getValue()
            r0 = 1543592801(0x5c015b61, float:1.45642977E17)
            boolean r0 = X.C51967G9n.A1Z(r10, r7, r0)
            java.lang.Object r1 = r10.ECw()
            if (r0 != 0) goto L_0x0506
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x050c
        L_0x0506:
            r0 = 15
            X.InR r1 = X.C51970G9q.A0q(r10, r7, r0)
        L_0x050c:
            X.0Ya r0 = X.C51965G9l.A12(r5, r1)
            X.0sL r0 = (X.0sL) r0
            java.lang.Object r12 = r9.getValue()
            X.Glh r12 = (X.C53295Glh) r12
            java.lang.Object r11 = r8.getValue()
            X.Gn3 r11 = (X.C53373Gn3) r11
            r18 = r2
            r17 = r6
            r16 = r0
            X.HZF.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.0gF r2 = X.C60340gF.A00
            r0 = 1543598079(0x5c016fff, float:1.45733652E17)
            boolean r1 = X.C51967G9n.A1Z(r10, r4, r0)
            java.lang.Object r0 = r10.ECw()
            if (r1 != 0) goto L_0x053a
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0544
        L_0x053a:
            r1 = 37
            X.ImO r0 = new X.ImO
            r0.<init>(r4, r3, r1)
            r10.FLL(r0)
        L_0x0544:
            boolean r0 = X.C51972G9s.A1S(r10, r5, r0, r2)
            if (r0 == 0) goto L_0x001a
            r0 = 340519453(0x144bea1d, float:1.02950516E-26)
        L_0x054d:
            X.0fL.A00(r0)
            goto L_0x001a
        L_0x0552:
            boolean r0 = r1 instanceof com.instagram.creator.agent.settings.facts.viewmodel.QuestionAnswerFactPreviewUseCaseImpl
            if (r0 == 0) goto L_0x055c
            com.instagram.creator.agent.settings.facts.viewmodel.QuestionAnswerFactPreviewUseCaseImpl r1 = (com.instagram.creator.agent.settings.facts.viewmodel.QuestionAnswerFactPreviewUseCaseImpl) r1
            X.0Ud r0 = r1.A03
            goto L_0x04bc
        L_0x055c:
            com.instagram.creator.agent.settings.facts.viewmodel.LinkPreviewUseCaseImpl r1 = (com.instagram.creator.agent.settings.facts.viewmodel.LinkPreviewUseCaseImpl) r1
            X.0Ud r0 = r1.A04
            goto L_0x04bc
        L_0x0562:
            r10.Evl()
            goto L_0x001a
        L_0x0567:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = A00(r5)
            X.C56284Hvs.A00(r2, r1, r0)
            goto L_0x001a
        L_0x0578:
            X.5Wy r2 = X.C51966G9m.A0R(r10, r1)
            java.lang.Object r1 = r5.A02
            X.N49 r1 = (X.N49) r1
            int r0 = A00(r5)
            X.HZ9.A00(r2, r1, r0)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JGD.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
