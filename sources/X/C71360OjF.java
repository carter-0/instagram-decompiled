package X;

import android.view.View;

/* renamed from: X.OjF  reason: case insensitive filesystem */
public final class C71360OjF implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C71360OjF(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A05 = obj3;
        this.A03 = obj;
        this.A01 = obj2;
        this.A02 = obj5;
        this.A04 = obj4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.3Tu} */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x035f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r32) {
        /*
            r31 = this;
            r4 = r31
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x01f1;
                case 1: goto L_0x01cb;
                case 2: goto L_0x0143;
                case 3: goto L_0x006a;
                case 4: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            r0 = 2132470621(0x7f1aeb5d, float:2.0592319E38)
            int r12 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A02
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r6 = r4.A01
            X.Pw2 r6 = (X.C74507Pw2) r6
            java.lang.Object r2 = r4.A05
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r5 = r4.A04
            X.MgH r5 = (X.C66983MgH) r5
            java.lang.Object r4 = r4.A03
            X.4bu r4 = (X.C267614bu) r4
            r0 = 8
            r1.setVisibility(r0)
            r1 = 0
            r3 = 1
            X.1Av r0 = X.1Au.A00(r2)
            java.lang.String r2 = r6.Beb()
            X.0qQ.A0B(r2, r1)
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "dismissed_find_people_card"
            X.DbX.A1T(r1, r0, r2, r3)
            com.google.common.collect.ImmutableList r0 = r5.A00
            if (r0 == 0) goto L_0x0065
            X.3kO r2 = X.C66580MXl.A0J(r0)
        L_0x0046:
            r1 = 0
        L_0x0047:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005b
            android.view.View r0 = X.JTO.A0H(r2)
            if (r1 != 0) goto L_0x0059
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0046
        L_0x0059:
            r1 = 1
            goto L_0x0047
        L_0x005b:
            if (r1 != 0) goto L_0x0060
            r4.Cv1()
        L_0x0060:
            r0 = -815506772(0xffffffffcf645aac, float:-3.83114752E9)
            goto L_0x056d
        L_0x0065:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x006a:
            r0 = 508448034(0x1e4e4d22, float:1.09215E-20)
            int r12 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r9 = r4.A01
            X.Vit r9 = (X.C17960Vit) r9
            java.lang.Object r8 = r4.A05
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            com.instagram.reels.store.ReelStore r3 = X.1OP.A05(r8)
            java.lang.Object r7 = r4.A04
            com.instagram.user.model.User r7 = (com.instagram.user.model.User) r7
            java.lang.String r1 = r7.getId()
            X.1Nr r0 = new X.1Nr
            r0.<init>(r7)
            r2 = 0
            com.instagram.model.reels.Reel r21 = r3.A0K(r0, r1, r2)
            java.lang.Object r6 = r4.A02
            X.MzF r6 = (X.C68048MzF) r6
            X.PJQ r5 = new X.PJQ
            r5.<init>(r6)
            java.lang.Object r3 = r4.A03
            X.OMy r3 = (X.C70826OMy) r3
            r0 = 23
            X.Inz r1 = new X.Inz
            r1.<init>(r0, r6, r8, r7)
            X.UZq r13 = r9.A00
            r4 = 0
            X.C15286UZq.A00(r3, r13, r4)
            X.OLm r0 = r3.A00()
            X.N2k r0 = r0.A00
            if (r0 == 0) goto L_0x00e4
            com.instagram.user.model.User r9 = r0.A04
            if (r9 == 0) goto L_0x00e4
            com.instagram.common.session.UserSession r14 = r13.A04()
            com.instagram.common.session.UserSession r8 = r13.A04()
            java.lang.String r7 = r9.getId()
            java.lang.Integer r6 = r9.A0N()
            com.instagram.user.model.FollowStatus r0 = r9.B6o()
            X.6rY r15 = X.GU2.A00(r8, r0, r6, r7)
            java.lang.String r17 = r9.getId()
            r0 = 986(0x3da, float:1.382E-42)
            java.lang.String r16 = X.C273654mx.A00(r0)
            r0 = 93
            java.lang.String r20 = X.AnonymousClass000.A00(r0)
            r18 = r4
            r19 = r4
            X.C319976rX.A08(r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x00e4:
            com.instagram.common.session.UserSession r6 = r13.A04()
            X.0eM r0 = r3.A0A
            java.lang.String r0 = X.DbS.A0t(r0)
            X.AnonymousClass72K.A00(r6, r0, r4, r2)
            X.UZa r0 = r13.A06()
            X.TwL r27 = r0.A02()
            r0 = 2
            X.WNK r7 = new X.WNK
            r7.<init>(r13, r0)
            r0 = 4
            X.Wab r6 = new X.Wab
            r6.<init>(r1, r0)
            com.instagram.common.session.UserSession r2 = r13.A04()
            X.328 r1 = new X.328
            r1.<init>(r13)
            X.32A r0 = new X.32A
            r0.<init>(r13, r2, r1)
            X.3BQ r22 = X.AnonymousClass3BQ.SEARCH_ITEM_HEADER
            r20 = r7
            r23 = r6
            r24 = r0
            r25 = r5
            r26 = r4
            X.C14437TwL.A01(r20, r21, r22, r23, r24, r25, r26, r27)
            com.instagram.common.session.UserSession r0 = r13.A04()
            X.ToJ r1 = X.C14025ToR.A00(r0)
            X.OLm r0 = r3.A00()
            X.N2k r0 = r0.A00
            if (r0 == 0) goto L_0x013e
            com.instagram.user.model.User r0 = r0.A04
            if (r0 == 0) goto L_0x013e
            r1.A01(r0)
            r0 = 346314009(0x14a45519, float:1.6593333E-26)
            goto L_0x056d
        L_0x013e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0143:
            r0 = 1293556010(0x4d1a192a, float:1.61583776E8)
            int r12 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r15 = r4.A05
            com.instagram.common.session.UserSession r15 = (com.instagram.common.session.UserSession) r15
            java.lang.Object r0 = r4.A03
            X.N4P r0 = (X.N4P) r0
            r25 = 0
            X.3sy r1 = r0.A08()
            boolean r1 = r1 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            X.0Tu r3 = X.0Tu.A06
            if (r1 == 0) goto L_0x0188
            r1 = 36316993619563247(0x81061d000112ef, double:3.030351229582766E-306)
            boolean r1 = X.182.A06(r3, r15, r1)
            if (r1 != 0) goto L_0x0193
        L_0x0169:
            java.lang.Object r2 = r4.A01
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r1 = r4.A04
            java.lang.String r5 = X.DbS.A0q(r1)
            java.lang.Object r3 = r4.A02
            X.0iw r3 = (X.AnonymousClass0iw) r3
            X.3t3 r1 = r0.A0L
            java.lang.String r6 = X.C300965yF.A06(r1)
            boolean r7 = r0.A0n
            r4 = r15
            X.C71117OdB.A02(r2, r3, r4, r5, r6, r7)
        L_0x0183:
            r0 = -1176903739(0xffffffffb9d9dfc5, float:-4.1556187E-4)
            goto L_0x056d
        L_0x0188:
            r1 = 36316993619497710(0x81061d000012ee, double:3.03035122954132E-306)
            boolean r1 = X.182.A06(r3, r15, r1)
            if (r1 == 0) goto L_0x0169
        L_0x0193:
            java.lang.Object r13 = r4.A01
            androidx.fragment.app.FragmentActivity r13 = (androidx.fragment.app.FragmentActivity) r13
            java.lang.Object r1 = r4.A04
            java.lang.String r20 = X.DbS.A0q(r1)
            java.lang.Object r14 = r4.A02
            X.0iw r14 = (X.AnonymousClass0iw) r14
            r16 = 0
            r26 = 1
            boolean r22 = X.C71117OdB.A03(r15, r0)
            boolean r3 = r0.A0n
            X.3sy r1 = r0.A08()
            boolean r2 = r1 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            X.3t3 r4 = r0.A0L
            java.lang.String r17 = X.C300965yF.A06(r4)
            java.lang.String r1 = r0.A0Q
            java.lang.String r19 = X.C300965yF.A07(r4)
            int r0 = r0.A06
            r18 = r1
            r21 = r0
            r23 = r3
            r24 = r2
            X.C71117OdB.A01(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0183
        L_0x01cb:
            r0 = 2042213498(0x79b9b47a, float:1.2052943E35)
            int r12 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A05
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r3 = r4.A03
            android.view.View r3 = (android.view.View) r3
            X.0qQ.A0A(r3)
            java.lang.Object r2 = r4.A01
            X.0iw r2 = (X.AnonymousClass0iw) r2
            java.lang.Object r1 = r4.A02
            X.N3L r1 = (X.N3L) r1
            java.lang.Object r0 = r4.A04
            X.6iJ r0 = (X.C314466iJ) r0
            X.OPM.A00(r3, r2, r5, r0, r1)
            r0 = -2045302905(0xffffffff86172787, float:-2.8428984E-35)
            goto L_0x056d
        L_0x01f1:
            r0 = -1149435090(0xffffffffbb7d032e, float:-0.0038606632)
            int r12 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A05
            X.OLf r5 = (X.C70785OLf) r5
            java.lang.Object r3 = r4.A01
            X.OGq r3 = (X.C70695OGq) r3
            java.lang.Object r1 = r4.A03
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Object r6 = r4.A02
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r0 = r4.A04
            int r0 = X.AnonymousClass7TE.A0M(r0)
            if (r0 == 0) goto L_0x02c6
            java.lang.String r2 = "IgRecyclerView"
        L_0x0212:
            java.lang.String r7 = ", "
            int r0 = r1.intValue()
            if (r0 == 0) goto L_0x02c2
            java.lang.String r1 = "encrypted thread"
        L_0x021c:
            java.lang.String r0 = X.C69929NuV.A00(r6)
            java.lang.String r20 = X.002.A11(r2, r7, r1, r7, r0)
            int r1 = r6.intValue()
            r4 = 2
            r2 = 1
            if (r1 == r2) goto L_0x02fb
            if (r1 == r4) goto L_0x02fb
            r0 = 5
            if (r1 == r0) goto L_0x02d1
            X.7Zg r6 = r3.A00
            X.7S7 r9 = r6.C6l()
            X.2Ep r10 = r9.Cms()
            r0 = 0
            if (r10 == 0) goto L_0x02ce
            X.3Tu r3 = r10.AiM()
            if (r3 == 0) goto L_0x02ce
            com.instagram.common.session.UserSession r2 = r5.A02
            long r2 = r3.A00(r2)
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x02ce
            X.3Tu r8 = r10.AiM()
            if (r8 == 0) goto L_0x0257
            long r0 = r8.A03
        L_0x0257:
            java.lang.String r11 = "TTLC Mode Info bits: "
            java.lang.String r10 = java.lang.Long.toString(r0, r4)
            X.0qQ.A07(r10)
            java.lang.String r8 = "\nUpdated TTLC Mode Info bits: "
            java.lang.String r1 = java.lang.Long.toString(r2, r4)
            X.0qQ.A07(r1)
            r0 = 10
            java.lang.String r11 = X.002.A0v(r11, r10, r8, r1, r0)
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            r0 = 15
            java.lang.Integer[] r8 = X.AnonymousClass05K.A00(r0)
            r4 = 0
            int r1 = r8.length
        L_0x027b:
            if (r4 >= r1) goto L_0x034d
            r17 = r8[r4]
            long r15 = X.C242393Tw.A00(r17)
            long r13 = r2 & r15
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0295
            int r0 = r17.intValue()
            switch(r0) {
                case 1: goto L_0x0298;
                case 2: goto L_0x029b;
                case 3: goto L_0x029e;
                case 4: goto L_0x02a1;
                case 5: goto L_0x02a4;
                case 6: goto L_0x02a7;
                case 7: goto L_0x02aa;
                case 8: goto L_0x02ad;
                case 9: goto L_0x02b0;
                case 10: goto L_0x02b3;
                case 11: goto L_0x02b6;
                case 12: goto L_0x02b9;
                case 13: goto L_0x02bc;
                case 14: goto L_0x02bf;
                default: goto L_0x0290;
            }
        L_0x0290:
            java.lang.String r0 = "TEXT"
        L_0x0292:
            r10.add(r0)
        L_0x0295:
            int r4 = r4 + 1
            goto L_0x027b
        L_0x0298:
            java.lang.String r0 = "CLIP"
            goto L_0x0292
        L_0x029b:
            java.lang.String r0 = "REEL_SHARE"
            goto L_0x0292
        L_0x029e:
            java.lang.String r0 = "MEDIA"
            goto L_0x0292
        L_0x02a1:
            java.lang.String r0 = "STORY"
            goto L_0x0292
        L_0x02a4:
            java.lang.String r0 = "LINK"
            goto L_0x0292
        L_0x02a7:
            java.lang.String r0 = "GENERIC_XMA"
            goto L_0x0292
        L_0x02aa:
            java.lang.String r0 = "PROFILE"
            goto L_0x0292
        L_0x02ad:
            java.lang.String r0 = "PHOTO"
            goto L_0x0292
        L_0x02b0:
            java.lang.String r0 = "VIDEO"
            goto L_0x0292
        L_0x02b3:
            java.lang.String r0 = "AUDIO"
            goto L_0x0292
        L_0x02b6:
            java.lang.String r0 = "GIF_STICKER"
            goto L_0x0292
        L_0x02b9:
            java.lang.String r0 = "RAVEN"
            goto L_0x0292
        L_0x02bc:
            java.lang.String r0 = "MEDIA_LIST"
            goto L_0x0292
        L_0x02bf:
            java.lang.String r0 = "CALLING"
            goto L_0x0292
        L_0x02c2:
            java.lang.String r1 = "open thread"
            goto L_0x021c
        L_0x02c6:
            r0 = 496(0x1f0, float:6.95E-43)
            java.lang.String r2 = X.C273654mx.A00(r0)
            goto L_0x0212
        L_0x02ce:
            r11 = 0
            goto L_0x0355
        L_0x02d1:
            X.7Zg r0 = r3.A00
            X.7S7 r0 = r0.C6l()
            X.2Ep r0 = r0.Cms()
            if (r0 == 0) goto L_0x02f8
            X.3Tu r0 = r0.AiM()
            if (r0 == 0) goto L_0x02f8
            int r2 = r0.A01
            if (r2 == 0) goto L_0x02f8
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "TLC mode: "
            r1.append(r0)
            java.lang.String r2 = java.lang.Integer.toString(r2, r4)
            X.0qQ.A07(r2)
            goto L_0x032e
        L_0x02f8:
            r1 = 0
            goto L_0x0544
        L_0x02fb:
            java.lang.String r1 = r3.A03
            if (r1 != 0) goto L_0x030b
            X.3sy r0 = r3.A01
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A04(r0)
            if (r0 == 0) goto L_0x034a
            java.lang.String r1 = r0.A00
            if (r1 == 0) goto L_0x034a
        L_0x030b:
            com.instagram.common.session.UserSession r0 = r5.A02
            X.2Dm r0 = X.1bJ.A00(r0)
            X.3U9 r0 = X.C66580MXl.A0d(r0, r1)
            if (r0 == 0) goto L_0x034a
            int r1 = r0.Btc()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x034a
            if (r1 != 0) goto L_0x0334
            java.lang.String r2 = "NONE"
        L_0x0325:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "ShhTransportMode: "
            r1.append(r0)
        L_0x032e:
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r2, r1)
            goto L_0x0544
        L_0x0334:
            if (r1 != r2) goto L_0x0339
            java.lang.String r2 = "OPEN_MESSAGING"
            goto L_0x0325
        L_0x0339:
            if (r1 != r4) goto L_0x033e
            java.lang.String r2 = "ARMADILLO"
            goto L_0x0325
        L_0x033e:
            r0 = 3
            if (r1 != r0) goto L_0x0344
            java.lang.String r2 = "ARMADILLO_TEXT_ONLY"
            goto L_0x0325
        L_0x0344:
            r0 = 4
            if (r1 != r0) goto L_0x034a
            java.lang.String r2 = "INSTAMADILLO"
            goto L_0x0325
        L_0x034a:
            java.lang.String r2 = "UNKNOWN"
            goto L_0x0325
        L_0x034d:
            java.lang.String r0 = X.C66581MXm.A0w(r7, r10)
            java.lang.String r11 = X.002.A0R(r11, r0)
        L_0x0355:
            r8 = 0
            com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl r0 = com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl.A01
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            r4 = 0
            if (r0 == 0) goto L_0x0533
            X.2Ep r19 = r9.Cms()
            X.7SD r3 = r9.C6Q()
            com.instagram.common.session.UserSession r2 = r5.A02
            X.0qQ.A0A(r3)
            boolean r10 = X.C308556Us.A09(r2, r3)
            X.5Gf r18 = X.C283115Ge.A00(r2)
            java.lang.String r17 = "⚠ uninitialized"
            X.2Ep r14 = r9.Cms()
            if (r14 == 0) goto L_0x05c1
            java.util.HashMap r0 = r14.CCo()
            java.lang.String r13 = X.AnonymousClass48U.A06(r0)
            if (r13 != 0) goto L_0x0575
            java.lang.String r0 = "\n⚠ Couldn't get DM Seen State Marker"
        L_0x0388:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r6 = "DM Mode Info"
            r1.append(r6)
            if (r19 == 0) goto L_0x0571
            X.3Tu r6 = r19.AiM()
            if (r6 == 0) goto L_0x0571
            X.3Tv r6 = r6.A04
            int r6 = r6.A01
            java.lang.String r16 = "\nbits: "
            java.lang.String r13 = java.lang.Integer.toBinaryString(r6)
            r14 = r6 & 1
            r15 = 0
            boolean r14 = X.AnonymousClass7TF.A1R(r14)
            java.lang.String r21 = "DualSend"
            if (r14 != 0) goto L_0x03b0
            r21 = 0
        L_0x03b0:
            r14 = r6 & 2
            boolean r14 = X.AnonymousClass7TF.A1R(r14)
            java.lang.String r22 = "Blending"
            if (r14 != 0) goto L_0x03bc
            r22 = 0
        L_0x03bc:
            r14 = r6 & 4
            boolean r14 = X.AnonymousClass7TF.A1R(r14)
            java.lang.String r23 = "DummyData"
            if (r14 != 0) goto L_0x03c8
            r23 = 0
        L_0x03c8:
            r14 = r6 & 8
            boolean r14 = X.AnonymousClass7TF.A1R(r14)
            java.lang.String r24 = "EncryptedBackup"
            if (r14 != 0) goto L_0x03d4
            r24 = 0
        L_0x03d4:
            r14 = r6 & 16
            boolean r14 = X.AnonymousClass7TF.A1R(r14)
            java.lang.String r25 = "DisableOpenSync"
            if (r14 != 0) goto L_0x03e0
            r25 = 0
        L_0x03e0:
            r14 = r6 & 32
            boolean r14 = X.AnonymousClass7TF.A1R(r14)
            java.lang.String r26 = "Instamadillo"
            if (r14 != 0) goto L_0x03ec
            r26 = 0
        L_0x03ec:
            r14 = r6 & 64
            boolean r14 = X.AnonymousClass7TF.A1R(r14)
            java.lang.String r27 = "DM Instamadillo"
            if (r14 != 0) goto L_0x03f8
            r27 = 0
        L_0x03f8:
            r14 = r6 & 512(0x200, float:7.175E-43)
            boolean r14 = X.AnonymousClass7TF.A1R(r14)
            java.lang.String r28 = "DM 7 Day default"
            if (r14 != 0) goto L_0x0404
            r28 = 0
        L_0x0404:
            r14 = r6 & 1024(0x400, float:1.435E-42)
            boolean r14 = X.AnonymousClass7TF.A1R(r14)
            java.lang.String r29 = "DM E2EE Attribution"
            if (r14 != 0) goto L_0x0410
            r29 = 0
        L_0x0410:
            r6 = r6 & 2048(0x800, float:2.87E-42)
            if (r6 <= 0) goto L_0x0415
            r15 = 1
        L_0x0415:
            java.lang.String r30 = "DM over Open"
            if (r15 != 0) goto L_0x041b
            r30 = 0
        L_0x041b:
            java.lang.String[] r6 = new java.lang.String[]{r21, r22, r23, r24, r25, r26, r27, r28, r29, r30}
            X.0qQ.A0B(r6, r8)
            java.util.List r15 = X.03t.A0I(r6)
            java.lang.String r14 = "\n  "
            java.lang.String r6 = ""
            java.lang.String r7 = X.00k.A0P(r7, r14, r6, r15, r4)
            r6 = r16
            java.lang.String r6 = X.002.A0g(r6, r13, r7)
        L_0x0434:
            r1.append(r6)
            java.lang.String r6 = "\n\nactive: "
            r1.append(r6)
            boolean r6 = X.C308556Us.A08(r2, r3)
            r1.append(r6)
            java.lang.String r6 = "\nrendering_enabled: "
            r1.append(r6)
            boolean r6 = X.C308556Us.A0R(r2, r9)
            r1.append(r6)
            java.lang.String r6 = "\n\nDM USER\n  eligible: "
            r1.append(r6)
            boolean r6 = X.C308556Us.A05(r2)
            r1.append(r6)
            java.lang.String r14 = "\n  eligible dm creation: "
            r1.append(r14)
            boolean r6 = X.C308556Us.A06(r2)
            r1.append(r6)
            java.lang.String r6 = "\n  custom durations enabled: "
            r1.append(r6)
            X.3Tu r7 = r3.A0H
            boolean r6 = X.C308556Us.A0E(r2, r7)
            r1.append(r6)
            java.lang.String r6 = "\n\nDM THREAD\n  After-send ttl: "
            r1.append(r6)
            X.4li r13 = r3.A0N
            java.lang.Integer r6 = r13.A02
            r1.append(r6)
            java.lang.String r6 = "\n  After-viewed ttl: "
            r1.append(r6)
            java.lang.Integer r6 = r13.A03
            r1.append(r6)
            java.lang.String r6 = "\n  dm seen marker id: "
            r1.append(r6)
            r6 = r17
            r1.append(r6)
            java.lang.String r6 = " \n  text@dm seen marker: "
            r1.append(r6)
            r1.append(r0)
            java.lang.String r0 = "\n  eligible DM render: "
            r1.append(r0)
            boolean r0 = X.C308556Us.A0R(r2, r9)
            r1.append(r0)
            r1.append(r14)
            X.3t2 r0 = r9.C6c()
            X.0qQ.A07(r0)
            boolean r0 = r0 instanceof X.C254773t1
            X.7Kc r0 = X.C329737Ka.A01(r2, r3, r0)
            boolean r0 = r0.CdB(r2, r9)
            r1.append(r0)
            java.lang.String r0 = "\n  eligible dm e2ee: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "\n  e2ee attribution date ms: "
            r1.append(r0)
            java.lang.Long r0 = r13.A04
            r1.append(r0)
            java.lang.String r0 = "\n  e2ee DM SA enabled: "
            r1.append(r0)
            boolean r0 = X.C308556Us.A0T(r2, r10)
            r1.append(r0)
            java.lang.String r0 = "\n  e2ee SA self enabled: "
            r1.append(r0)
            boolean r0 = r18.A02()
            r1.append(r0)
            java.lang.String r0 = "\n  e2ee SA contact enabled: "
            r1.append(r0)
            r0 = r18
            X.0xa r6 = r0.A01
            java.lang.String r0 = "is_contact_security_alert_enabled"
            boolean r0 = r6.getBoolean(r0, r8)
            r1.append(r0)
            java.lang.String r0 = "\n  7 day duration enabled: "
            r1.append(r0)
            boolean r0 = X.C308556Us.A0F(r2, r7)
            r1.append(r0)
            java.lang.String r0 = "\n  dm swipe toggle enabled: "
            r1.append(r0)
            X.3t2 r0 = r9.C6c()
            X.0qQ.A07(r0)
            boolean r0 = r0 instanceof X.C254773t1
            boolean r0 = X.C308556Us.A0B(r2, r3, r0)
            r1.append(r0)
            java.lang.String r0 = "\n  should disable shh mode: "
            r1.append(r0)
            if (r19 == 0) goto L_0x0528
            X.3Tu r4 = r19.AiM()
        L_0x0528:
            boolean r0 = X.C308556Us.A0J(r2, r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
        L_0x0533:
            java.lang.String[] r0 = new java.lang.String[]{r11, r4}
            X.0qQ.A0B(r0, r8)
            java.util.List r1 = X.03t.A0I(r0)
            java.lang.String r0 = "\n\n"
            java.lang.String r1 = X.C66581MXm.A0w(r0, r1)
        L_0x0544:
            r0 = r20
            java.lang.String[] r1 = new java.lang.String[]{r0, r1}
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.List r1 = X.03t.A0I(r1)
            java.lang.String r0 = "\n\n"
            r3 = 0
            java.lang.String r2 = X.DbT.A0z(r0, r1, r3)
            android.app.Activity r0 = r5.A00
            X.8ab r1 = X.DbS.A0X(r0)
            java.lang.String r0 = "OK"
            r1.A0d(r3, r0)
            r1.A0q(r2)
            X.DbT.A1V(r1)
            r0 = 314875318(0x12c49db6, float:1.2408218E-27)
        L_0x056d:
            X.AnonymousClass0fD.A0C(r0, r12)
            return
        L_0x0571:
            java.lang.String r6 = "None"
            goto L_0x0434
        L_0x0575:
            X.7S9 r0 = r6.AvL()
            X.7LQ r0 = r0.BSO(r13)
            r1 = 0
            if (r0 == 0) goto L_0x058c
            X.3su r0 = r0.A0e
            if (r0 == 0) goto L_0x058c
            java.lang.String r0 = r0.A1q
            if (r0 == 0) goto L_0x058c
        L_0x0588:
            r17 = r13
            goto L_0x0388
        L_0x058c:
            X.3su r0 = r14.BKv()
            if (r0 == 0) goto L_0x05be
            java.lang.String r6 = r0.A0g()
            if (r6 == 0) goto L_0x05be
            int r0 = r6.compareTo(r13)
            if (r0 >= 0) goto L_0x05a1
            java.lang.String r0 = "\nℹ Seen marker ahead of last message"
            goto L_0x0588
        L_0x05a1:
            java.lang.String r0 = r2.A06
            X.3SZ r0 = r14.Aue(r0)
            if (r0 == 0) goto L_0x05af
            X.9JD r0 = r0.A01
            if (r0 == 0) goto L_0x05af
            java.lang.String r1 = r0.A02
        L_0x05af:
            boolean r0 = X.0qQ.A0K(r1, r6)
            if (r0 == 0) goto L_0x05be
            int r0 = r13.compareTo(r6)
            if (r0 >= 0) goto L_0x05be
            java.lang.String r0 = "\nℹ Other user last saw expired message"
            goto L_0x0588
        L_0x05be:
            java.lang.String r0 = "\n⚠ Couldn't get message"
            goto L_0x0588
        L_0x05c1:
            java.lang.String r0 = "\n⚠ Couldn't get DirectThread"
            goto L_0x0388
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71360OjF.onClick(android.view.View):void");
    }
}
