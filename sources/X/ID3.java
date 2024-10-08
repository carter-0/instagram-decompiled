package X;

import android.view.View;

public final class ID3 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ID3(1Xj r1, GHU ghu, int i) {
        this.A00 = i;
        if (9 - i != 0) {
            this.A01 = r1;
            this.A02 = ghu;
        } else {
            this.A02 = ghu;
            this.A01 = r1;
        }
    }

    public static void A02(View view, int i, Object obj, Object obj2) {
        AnonymousClass0fU.A00(new ID3(i, obj, obj2), view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:144:0x079a, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x079d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0285, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0288, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r35) {
        /*
            r34 = this;
            r1 = r34
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0770;
                case 1: goto L_0x074e;
                case 2: goto L_0x072c;
                case 3: goto L_0x06fc;
                case 4: goto L_0x046a;
                case 5: goto L_0x040a;
                case 6: goto L_0x03d3;
                case 7: goto L_0x03ae;
                case 8: goto L_0x0381;
                case 9: goto L_0x0353;
                case 10: goto L_0x0330;
                case 11: goto L_0x0315;
                case 12: goto L_0x02ec;
                case 13: goto L_0x02cd;
                case 14: goto L_0x0294;
                case 15: goto L_0x025b;
                case 16: goto L_0x0243;
                case 17: goto L_0x022b;
                case 18: goto L_0x0220;
                case 19: goto L_0x0215;
                case 20: goto L_0x020a;
                case 21: goto L_0x01ff;
                case 22: goto L_0x01e0;
                case 23: goto L_0x01d4;
                case 24: goto L_0x01c8;
                case 25: goto L_0x01bc;
                case 26: goto L_0x01b0;
                case 27: goto L_0x01a4;
                case 28: goto L_0x0198;
                case 29: goto L_0x018c;
                case 30: goto L_0x0180;
                case 31: goto L_0x0174;
                case 32: goto L_0x0157;
                case 33: goto L_0x014b;
                case 34: goto L_0x0132;
                case 35: goto L_0x0119;
                case 36: goto L_0x003e;
                case 37: goto L_0x0025;
                case 38: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            r0 = -616318507(0xffffffffdb43b9d5, float:-5.5091945E16)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.HKa r3 = (X.C54591HKa) r3
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0sL r2 = r3.A06
            java.lang.Object r1 = r1.A01
            int r0 = r3.getPosition()
            X.C51967G9n.A1P(r1, r2, r0)
            r0 = -820092623(0xffffffffcf1e6131, float:-2.65716966E9)
            goto L_0x0285
        L_0x0025:
            r0 = -590208227(0xffffffffdcd2231d, float:-4.73186821E17)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.HKa r2 = (X.C54591HKa) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0sP r2 = r2.A05
            java.lang.Object r0 = r1.A01
            r2.invoke(r0)
            r0 = -1896663327(0xffffffff8ef336e1, float:-5.995697E-30)
            goto L_0x0285
        L_0x003e:
            r0 = 591160852(0x233c6614, float:1.0213116E-17)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A02
            X.HKc r5 = (X.C54593HKc) r5
            java.lang.Object r6 = r1.A01
            X.H3S r6 = (X.H3S) r6
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.common.ui.base.IgCheckBox r0 = r5.A08
            r2 = 0
            r0.setEnabled(r2)
            X.5DY r0 = r6.A00
            if (r0 == 0) goto L_0x00ec
            java.lang.Boolean r0 = r0.CbB()
            r4 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r4)
            if (r0 == 0) goto L_0x00ec
            android.app.Activity r1 = r5.A02
            com.instagram.common.session.UserSession r0 = r5.A07
            X.1Xj r8 = r5.A0C
            r7 = 43
            X.Iw1 r7 = X.C58692Iw1.A00(r6, r5, r7)
            X.0qQ.A0B(r1, r2)
            X.AnonymousClass7TF.A1C(r0, r4, r8)
            r19 = 0
            X.2IS r11 = X.C41845B3m.A04()
            X.2IS r12 = X.C41845B3m.A04()
            java.lang.String r10 = r6.A04
            r9 = 59
            java.lang.String r9 = X.C66579MXk.A00(r9)
            boolean r9 = X.C41848B3p.A1Z(r11, r9, r10)
            X.1vR r13 = X.C41845B3m.A06(r9)
            java.util.Map r15 = r11.getParamsCopy()
            java.util.Map r16 = r12.getParamsCopy()
            java.lang.Class<X.Bdc> r17 = X.C42495Bdc.class
            java.util.ArrayList r23 = X.AnonymousClass7TE.A1C()
            java.lang.String r14 = "UnsaveCutoutStickerMutation"
            java.lang.String r22 = "xdt_unsave_cutout_sticker"
            com.facebook.pando.PandoGraphQLRequest r12 = new com.facebook.pando.PandoGraphQLRequest
            r21 = r19
            r18 = r4
            r20 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.1vn r11 = X.1vm.A01(r0)
            r10 = 2
            X.DFW r9 = new X.DFW
            r13 = r9
            r14 = r10
            r15 = r7
            r16 = r0
            r17 = r6
            r18 = r8
            r13.<init>(r14, r15, r16, r17, r18)
            X.Lb5 r4 = new X.Lb5
            r4.<init>(r10, r1, r0, r7)
            r11.ATL(r4, r9, r12)
            X.0eM r0 = r5.A0D
            java.lang.Object r1 = r0.getValue()
            X.8aR r1 = (X.C358148aR) r1
            boolean r0 = r5.A0F
            if (r0 == 0) goto L_0x00e9
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x00d6:
            X.0qQ.A0B(r0, r2)
            java.lang.String r9 = "cutout_unsave_button_clicked"
            r4 = r1
            r5 = r0
            r6 = r19
            r7 = r6
            r8 = r6
            X.C358148aR.A00(r4, r5, r6, r7, r8, r9)
        L_0x00e4:
            r0 = 2144643774(0x7fd4aabe, float:NaN)
            goto L_0x079a
        L_0x00e9:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x00d6
        L_0x00ec:
            android.app.Activity r7 = r5.A02
            com.instagram.common.session.UserSession r4 = r5.A07
            X.1Xj r1 = r5.A0C
            r0 = 44
            X.Iw1 r0 = X.C58692Iw1.A00(r6, r5, r0)
            X.LRr.A01(r7, r6, r4, r1, r0)
            X.0eM r0 = r5.A0D
            java.lang.Object r4 = r0.getValue()
            X.8aR r4 = (X.C358148aR) r4
            boolean r0 = r5.A0F
            if (r0 == 0) goto L_0x0116
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
        L_0x0109:
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            X.0qQ.A0B(r5, r2)
            java.lang.String r9 = "cutout_save_button_clicked"
            r6 = 0
            r8 = r6
            X.C358148aR.A00(r4, r5, r6, r7, r8, r9)
            goto L_0x00e4
        L_0x0116:
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            goto L_0x0109
        L_0x0119:
            r0 = -1685049884(0xffffffff9b902de4, float:-2.3852458E-22)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.HKc r2 = (X.C54593HKc) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0sP r2 = r2.A0E
            java.lang.Object r0 = r1.A01
            r2.invoke(r0)
            r0 = -1868601520(0xffffffff909f6750, float:-6.287362E-29)
            goto L_0x0285
        L_0x0132:
            r0 = -49461173(0xfffffffffd0d484b, float:-1.1737282E37)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.HKc r2 = (X.C54593HKc) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0sP r2 = r2.A0E
            java.lang.Object r0 = r1.A01
            r2.invoke(r0)
            r0 = 493958057(0x1d7133a9, float:3.1922792E-21)
            goto L_0x0285
        L_0x014b:
            r0 = 663744905(0x278ff189, float:3.9952346E-15)
            int r4 = A00(r1, r0)
            r0 = -2105899252(0xffffffff827a870c, float:-1.8405856E-37)
            goto L_0x0285
        L_0x0157:
            r0 = 496502353(0x1d980651, float:4.0240596E-21)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.GiC r0 = (X.C53079GiC) r0
            X.0sP r2 = r0.A09
            java.lang.Object r0 = r1.A01
            X.IOc r0 = (X.C57088IOc) r0
            X.H3P r0 = (X.H3P) r0
            java.lang.String r0 = r0.A05
            r2.invoke(r0)
            r0 = 1746109201(0x68138311, float:2.7864225E24)
            goto L_0x0285
        L_0x0174:
            r0 = -260592846(0xfffffffff077ab32, float:-3.0659904E29)
            int r4 = A00(r1, r0)
            r0 = 1324019695(0x4eeaefef, float:1.97079642E9)
            goto L_0x0285
        L_0x0180:
            r0 = 776009735(0x2e40f807, float:4.3876038E-11)
            int r4 = A00(r1, r0)
            r0 = -1017596899(0xffffffffc358b41d, float:-216.70357)
            goto L_0x0285
        L_0x018c:
            r0 = 2106708690(0x7d91d2d2, float:2.4229088E37)
            int r4 = A00(r1, r0)
            r0 = 932629504(0x3796cc00, float:1.7976388E-5)
            goto L_0x0285
        L_0x0198:
            r0 = 1326010719(0x4f09515f, float:2.30381133E9)
            int r4 = A00(r1, r0)
            r0 = -1551177402(0xffffffffa38ae946, float:-1.5060785E-17)
            goto L_0x0285
        L_0x01a4:
            r0 = 1701929313(0x65716161, float:7.1242915E22)
            int r4 = A00(r1, r0)
            r0 = -1523537512(0xffffffffa530a998, float:-1.5323027E-16)
            goto L_0x0285
        L_0x01b0:
            r0 = 1615161292(0x604567cc, float:5.689825E19)
            int r4 = A00(r1, r0)
            r0 = 1665688278(0x634862d6, float:3.6964707E21)
            goto L_0x0285
        L_0x01bc:
            r0 = -2015560599(0xffffffff87dcfc69, float:-3.3250274E-34)
            int r4 = A00(r1, r0)
            r0 = 1700913556(0x6561e194, float:6.6668353E22)
            goto L_0x0285
        L_0x01c8:
            r0 = -1059622036(0xffffffffc0d7736c, float:-6.7328396)
            int r4 = A00(r1, r0)
            r0 = -785583142(0xffffffffd12cf3da, float:-4.6426595E10)
            goto L_0x0285
        L_0x01d4:
            r0 = 1328785571(0x4f33a8a3, float:3.01417344E9)
            int r4 = A00(r1, r0)
            r0 = -1118767048(0xffffffffbd50f838, float:-0.05101797)
            goto L_0x0285
        L_0x01e0:
            r0 = 874908576(0x34260ba0, float:1.5464184E-7)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.Ho4 r0 = (X.C55821Ho4) r0
            java.lang.Object r7 = r1.A01
            java.lang.Integer r7 = (java.lang.Integer) r7
            X.GBE r5 = r0.A04
            X.4bN r6 = r0.A01
            java.lang.String r10 = "three_dot_menu"
            r8 = 0
            r9 = r8
            r5.A0M(r6, r7, r8, r9, r10)
            r0 = 1075313945(0x4017fd19, float:2.3748229)
            goto L_0x0285
        L_0x01ff:
            r0 = 1959153005(0x74c64d6d, float:1.2568911E32)
            int r4 = A01(r1, r0)
            r0 = 419780849(0x190558f1, float:6.8939004E-24)
            goto L_0x0285
        L_0x020a:
            r0 = 1000959234(0x3ba96d02, float:0.0051704654)
            int r4 = A01(r1, r0)
            r0 = 1466779105(0x576d45e1, float:2.60884383E14)
            goto L_0x0285
        L_0x0215:
            r0 = 1255909876(0x4adba9f4, float:7197946.0)
            int r4 = A01(r1, r0)
            r0 = -1140452973(0xffffffffbc061193, float:-0.008182901)
            goto L_0x0285
        L_0x0220:
            r0 = 1525722809(0x5af0aeb9, float:3.3873052E16)
            int r4 = A01(r1, r0)
            r0 = 1391452372(0x52efe0d4, float:5.15134587E11)
            goto L_0x0285
        L_0x022b:
            r0 = 1440921431(0x55e2b757, float:3.11596333E13)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.GCf r0 = (X.C52033GCf) r0
            X.GCg r2 = r0.A0H
            java.lang.Object r0 = r1.A01
            X.HNR r0 = (X.HNR) r0
            r2.A0D(r0)
            r0 = -1032847137(0xffffffffc27000df, float:-60.00085)
            goto L_0x0285
        L_0x0243:
            r0 = -329289799(0xffffffffec5f6fb9, float:-1.0804722E27)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.GCf r0 = (X.C52033GCf) r0
            X.GCg r2 = r0.A0H
            java.lang.Object r0 = r1.A01
            X.HNR r0 = (X.HNR) r0
            r2.A0D(r0)
            r0 = 535477782(0x1feabe16, float:9.9417326E-20)
            goto L_0x0285
        L_0x025b:
            r0 = -1455680530(0xffffffffa93c13ee, float:-4.1761672E-14)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A02
            X.GCi r5 = (X.C52036GCi) r5
            com.instagram.common.session.UserSession r3 = r5.A02
            java.lang.Object r2 = r1.A01
            X.1Xj r2 = (X.1Xj) r2
            java.lang.String r1 = r2.getId()
            if (r1 == 0) goto L_0x0289
            java.lang.String r0 = "approve"
            X.1OC r1 = X.AnonymousClass73D.A01(r3, r0, r1)
            r0 = 26
            X.H51.A00(r1, r2, r5, r0)
            X.4DH r0 = r5.A01
            r0.schedule(r1)
            r0 = -1707101731(0xffffffff9a3fb1dd, float:-3.964155E-23)
        L_0x0285:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x0289:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -155110662(0xfffffffff6c132fa, float:-1.9592719E33)
            X.AnonymousClass0fD.A0C(r0, r4)
            throw r1
        L_0x0294:
            r0 = -1167976626(0xffffffffba62174e, float:-8.6246885E-4)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A02
            X.GCi r4 = (X.C52036GCi) r4
            com.instagram.common.session.UserSession r3 = r4.A02
            java.lang.Object r2 = r1.A01
            X.1Xj r2 = (X.1Xj) r2
            java.lang.String r1 = r2.getId()
            if (r1 == 0) goto L_0x02c2
            java.lang.String r0 = "remove"
            X.1OC r1 = X.AnonymousClass73D.A01(r3, r0, r1)
            r0 = 25
            X.H51.A00(r1, r2, r4, r0)
            X.4DH r0 = r4.A01
            r0.schedule(r1)
            r0 = -1879908692(0xffffffff8ff2deac, float:-2.3948812E-29)
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x02c2:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 207358602(0xc5c0a8a, float:1.6951355E-31)
            X.AnonymousClass0fD.A0C(r0, r5)
            throw r1
        L_0x02cd:
            r0 = -1828046443(0xffffffff930a3995, float:-1.7446439E-27)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Gkw r0 = (X.C53248Gkw) r0
            X.0sa r0 = r0.A04
            if (r0 == 0) goto L_0x02df
            r0.invoke()
        L_0x02df:
            java.lang.Object r1 = r1.A02
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setOnClickListener(r0)
            r0 = 1635771303(0x617fe3a7, float:2.9502024E20)
            goto L_0x079a
        L_0x02ec:
            r0 = 1026142359(0x3d29b097, float:0.041428175)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.0mM r2 = (X.0mM) r2
            java.lang.Object r1 = r1.A02
            X.GNH r1 = (X.GNH) r1
            X.GBj r0 = r1.A02
            if (r0 == 0) goto L_0x0313
            android.view.View r0 = X.C52012GBj.A02(r0)
        L_0x0303:
            boolean r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x030e
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r1.A03
            r2.A01(r0)
        L_0x030e:
            r0 = -49530916(0xfffffffffd0c37dc, float:-1.1648872E37)
            goto L_0x079a
        L_0x0313:
            r0 = 0
            goto L_0x0303
        L_0x0315:
            r0 = -1478648951(0xffffffffa7dd9b89, float:-6.1508454E-15)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.GHU r0 = (X.GHU) r0
            X.JTB r2 = r0.A07
            java.lang.Object r1 = r1.A01
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.4bN r0 = r0.A02
            r2.Dmw(r0, r1)
            r0 = -1601887635(0xffffffffa085226d, float:-2.2553857E-19)
            goto L_0x079a
        L_0x0330:
            r0 = -1240363035(0xffffffffb6118fe5, float:-2.1690441E-6)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.1Xj r2 = (X.1Xj) r2
            java.util.List r0 = r2.A3Q()
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x034e
            java.lang.Object r0 = r1.A02
            X.GHU r0 = (X.GHU) r0
            X.JTB r0 = r0.A07
            r0.Dlv(r2)
        L_0x034e:
            r0 = -741675508(0xffffffffd3caee0c, float:-1.74315432E12)
            goto L_0x079a
        L_0x0353:
            r0 = -347723531(0xffffffffeb4628f5, float:-2.3956073E26)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.GHU r2 = (X.GHU) r2
            com.instagram.common.session.UserSession r5 = r2.A04
            X.4DU r6 = r2.A06
            X.4bN r4 = r2.A02
            X.1Xj r0 = r4.A02
            if (r0 == 0) goto L_0x037f
            java.lang.String r8 = r0.A2n()
        L_0x036c:
            r7 = 0
            r9 = 0
            X.C52086GEg.A0V(r4, r5, r6, r7, r8, r9)
            X.JTB r2 = r2.A07
            java.lang.Object r0 = r1.A01
            X.1Xj r0 = (X.1Xj) r0
            r2.DQe(r0)
            r0 = 499582559(0x1dc7065f, float:5.268145E-21)
            goto L_0x079a
        L_0x037f:
            r8 = 0
            goto L_0x036c
        L_0x0381:
            r0 = -1127286467(0xffffffffbccef93d, float:-0.02526533)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.2V1 r0 = (X.2V1) r0
            java.lang.Object r1 = r1.A02
            X.0lg r1 = (X.0lg) r1
            android.content.Context r2 = r0.A0C
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            X.0qQ.A0C(r2, r0)
            android.app.Activity r2 = (android.app.Activity) r2
            X.7Pr r0 = X.DbS.A0W(r1)
            X.7Pu r1 = r0.A00()
            X.E0r r0 = new X.E0r
            r0.<init>()
            r1.A02(r2, r0)
            r0 = -168272180(0xfffffffff5f85ecc, float:-6.2969352E32)
            goto L_0x079a
        L_0x03ae:
            r0 = -257459417(0xfffffffff0a77b27, float:-4.1466303E29)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A02
            X.GCb r5 = (X.C52029GCb) r5
            X.GBn r0 = r5.A0d
            X.9Iy r0 = r0.A0B()
            java.lang.Object r4 = r1.A01
            X.1Xj r4 = (X.1Xj) r4
            if (r0 == 0) goto L_0x03d1
            java.lang.String r2 = r0.A02
        L_0x03c7:
            r1 = 1
            r0 = 0
            X.C52029GCb.A0E(r4, r5, r2, r1, r0)
            r0 = -985704556(0xffffffffc53f5794, float:-3061.4736)
            goto L_0x079a
        L_0x03d1:
            r2 = 0
            goto L_0x03c7
        L_0x03d3:
            r0 = -359810627(0xffffffffea8db9bd, float:-8.566783E25)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A02
            X.GCb r6 = (X.C52029GCb) r6
            java.lang.Object r2 = r1.A01
            X.GNW r2 = (X.GNW) r2
            X.0qQ.A0A(r2)
            X.28D r0 = X.28D.A1d
            com.instagram.common.session.UserSession r5 = r6.A0C
            X.Hrt r1 = X.C250563lf.A0C(r0)
            java.lang.String r0 = r2.A04
            r1.A0L = r0
            android.os.Bundle r4 = r1.A00()
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r2 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r6.A07
            java.lang.String r0 = "clips_camera"
            X.6W8 r0 = X.AnonymousClass6W8.A02(r1, r4, r5, r2, r0)
            X.Dbc.A0y(r0)
            r0.A0C(r1)
            r0 = -537861483(0xffffffffdff0e295, float:-3.47152E19)
            goto L_0x079a
        L_0x040a:
            r0 = -406344846(0xffffffffe7c7ab72, float:-1.8858271E24)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.GjN r5 = (X.C53151GjN) r5
            X.8vc r10 = r5.A00
            boolean r0 = r10.A0F
            if (r0 == 0) goto L_0x0420
            r0 = 1602237089(0x5f8032a1, float:1.8475246E19)
            goto L_0x079a
        L_0x0420:
            long r6 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object r4 = r1.A02
            X.GiF r4 = (X.C53081GiF) r4
            long r0 = r4.A01
            long r8 = r6 - r0
            r1 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0465
            r4.A01 = r6
            X.50r r1 = r10.A04
            X.50r r0 = X.C2801950r.CLIPS
            if (r1 == r0) goto L_0x043e
            X.50r r0 = X.C2801950r.FEED_POST
            if (r1 != r0) goto L_0x0465
        L_0x043e:
            com.instagram.common.session.UserSession r2 = r4.A07
            X.27r r1 = X.27p.A01(r2)
            X.8vc r0 = r5.A00
            java.lang.String r0 = r0.A09
            r1.A1p(r0)
            X.8A2 r1 = X.AnonymousClass8A1.A01(r2)
            X.27r r0 = X.27p.A01(r2)
            X.283 r0 = r0.A04
            java.lang.String r0 = r0.A0L
            if (r0 != 0) goto L_0x045b
            java.lang.String r0 = ""
        L_0x045b:
            r1.A0G(r0)
            X.8vc r1 = r5.A00
            X.GO1 r0 = r5.A01
            X.C53081GiF.A00(r1, r0, r4)
        L_0x0465:
            r0 = 319949131(0x1312094b, float:1.8432373E-27)
            goto L_0x079a
        L_0x046a:
            r0 = 1255031519(0x4ace42df, float:6758767.5)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.GiF r0 = (X.C53081GiF) r0
            com.instagram.common.session.UserSession r13 = r0.A07
            X.27r r4 = X.27p.A01(r13)
            java.lang.String r2 = "DRAFT_MORE_OPTIONS"
            r4.A1l(r2)
            r11 = r0
            X.HJZ r11 = (X.HJZ) r11
            X.0eM r12 = r11.A0E
            boolean r2 = X.AnonymousClass7TF.A1Z(r12)
            if (r2 == 0) goto L_0x0498
            X.0eM r2 = r0.A0C
            java.lang.Object r4 = r2.getValue()
            X.LPH r4 = (X.LPH) r4
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            r4.A07(r2)
        L_0x0498:
            java.lang.Object r1 = r1.A01
            X.GjN r1 = (X.C53151GjN) r1
            X.GO1 r2 = r1.A01
            r16 = 0
            r10 = 1
            if (r2 == 0) goto L_0x04ab
            java.util.List r2 = r2.A00
            boolean r2 = r2.isEmpty()
            if (r2 != r10) goto L_0x04ad
        L_0x04ab:
            r16 = 1
        L_0x04ad:
            X.8Ov r8 = r1.A08
            android.view.View r2 = r8.getContentView()
            r7 = 0
            r2.setVisibility(r7)
            android.widget.ImageView r9 = r1.A05
            r9.setVisibility(r7)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            X.Hjd r6 = r0.A0A
            if (r16 == 0) goto L_0x050f
            com.instagram.common.session.UserSession r15 = r6.A00
            X.0Tu r14 = X.0Tu.A05
            r4 = 36320528377586235(0x8109540000223b, double:3.032586624789832E-306)
            boolean r4 = X.182.A06(r14, r15, r4)
            if (r4 == 0) goto L_0x050f
            android.content.Context r5 = r0.A04
            r4 = 2131961062(0x7f1324e6, float:1.955881E38)
            java.lang.String r23 = X.AnonymousClass7TE.A16(r5, r4)
            r18 = 0
            r4 = 2131238164(0x7f081d14, float:1.8092599E38)
            android.graphics.drawable.Drawable r19 = r5.getDrawable(r4)
            r4 = 6
            X.IVI r5 = new X.IVI
            r5.<init>((X.C53151GjN) r1, (X.C53081GiF) r0, (int) r4)
            X.8rI r4 = new X.8rI
            r17 = r4
            r20 = r18
            r21 = r5
            r22 = r18
            r24 = r7
            r25 = r7
            r26 = r7
            r27 = r7
            r28 = r7
            r29 = r7
            r30 = r10
            r31 = r7
            r32 = r7
            r33 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r2.add(r4)
        L_0x050f:
            X.8vc r4 = r1.A00
            boolean r4 = r4.A00()
            if (r4 == 0) goto L_0x055b
            if (r16 == 0) goto L_0x055b
            com.instagram.common.session.UserSession r4 = r6.A00
            boolean r4 = X.1KU.A0C(r4)
            if (r4 == 0) goto L_0x055b
            android.content.Context r5 = r0.A04
            r4 = 2131973082(0x7f1353da, float:1.958319E38)
            java.lang.String r20 = X.AnonymousClass7TE.A16(r5, r4)
            r15 = 0
            r4 = 2131238210(0x7f081d42, float:1.8092692E38)
            android.graphics.drawable.Drawable r16 = r5.getDrawable(r4)
            r4 = 7
            X.IVI r5 = new X.IVI
            r5.<init>((X.C53151GjN) r1, (X.C53081GiF) r0, (int) r4)
            X.8rI r4 = new X.8rI
            r14 = r4
            r17 = r15
            r18 = r5
            r19 = r15
            r21 = r7
            r22 = r7
            r23 = r7
            r24 = r7
            r25 = r7
            r26 = r7
            r27 = r10
            r28 = r7
            r29 = r7
            r30 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r2.add(r4)
        L_0x055b:
            boolean r4 = X.AnonymousClass7TF.A1Z(r12)
            if (r4 == 0) goto L_0x05a2
            boolean r4 = X.C319116q4.A07(r13)
            if (r4 != 0) goto L_0x05a2
            android.content.Context r5 = r0.A04
            r4 = 2131955415(0x7f130ed7, float:1.9547357E38)
            java.lang.String r20 = X.AnonymousClass7TE.A16(r5, r4)
            r15 = 0
            r4 = 2131238134(0x7f081cf6, float:1.8092538E38)
            android.graphics.drawable.Drawable r16 = r5.getDrawable(r4)
            r4 = 8
            X.IVI r5 = new X.IVI
            r5.<init>((X.C53151GjN) r1, (X.C53081GiF) r0, (int) r4)
            X.8rI r4 = new X.8rI
            r14 = r4
            r17 = r15
            r18 = r5
            r19 = r15
            r21 = r7
            r22 = r7
            r23 = r7
            r24 = r7
            r25 = r7
            r26 = r7
            r27 = r10
            r28 = r7
            r29 = r7
            r30 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r2.add(r4)
        L_0x05a2:
            com.instagram.common.session.UserSession r12 = r6.A00
            X.0Tu r6 = X.0Tu.A05
            r4 = 36328237844544622(0x811057000a3c6e, double:3.0374621227378474E-306)
            boolean r4 = X.182.A06(r6, r12, r4)
            if (r4 == 0) goto L_0x05f8
            X.8vc r4 = r1.A00
            boolean r4 = r4.A0G
            r12 = 2131960006(0x7f1320c6, float:1.9556668E38)
            r5 = 2131238644(0x7f081ef4, float:1.8093573E38)
            if (r4 == 0) goto L_0x05c3
            r12 = 2131960637(0x7f13233d, float:1.9557948E38)
            r5 = 2131238939(0x7f08201b, float:1.809417E38)
        L_0x05c3:
            android.content.Context r4 = r0.A04
            java.lang.String r20 = X.AnonymousClass7TE.A16(r4, r12)
            r15 = 0
            android.graphics.drawable.Drawable r16 = r4.getDrawable(r5)
            r4 = 9
            X.IVI r5 = new X.IVI
            r5.<init>((X.C53151GjN) r1, (X.C53081GiF) r0, (int) r4)
            X.8rI r4 = new X.8rI
            r14 = r4
            r17 = r15
            r18 = r5
            r19 = r15
            r21 = r7
            r22 = r7
            r23 = r7
            r24 = r7
            r25 = r7
            r26 = r7
            r27 = r10
            r28 = r7
            r29 = r7
            r30 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r2.add(r4)
        L_0x05f8:
            r4 = 36328237843954790(0x81105700013c66, double:3.037462122364835E-306)
            boolean r4 = X.182.A06(r6, r13, r4)
            boolean r12 = X.AnonymousClass7TF.A1P(r4)
            android.content.Context r4 = r0.A04
            r5 = 2131967976(0x7f133fe8, float:1.9572834E38)
            if (r12 == 0) goto L_0x060f
            r5 = 2131972145(0x7f135031, float:1.958129E38)
        L_0x060f:
            java.lang.String r20 = X.C51967G9n.A0p(r4, r5)
            r15 = 0
            r5 = 2131238887(0x7f081fe7, float:1.8094065E38)
            if (r12 == 0) goto L_0x061c
            r5 = 2131238245(0x7f081d65, float:1.8092763E38)
        L_0x061c:
            android.graphics.drawable.Drawable r16 = r4.getDrawable(r5)
            r5 = 10
            X.IVI r12 = new X.IVI
            r12.<init>((X.C53151GjN) r1, (X.C53081GiF) r0, (int) r5)
            X.8rI r5 = new X.8rI
            r14 = r5
            r17 = r15
            r18 = r12
            r19 = r15
            r21 = r7
            r22 = r7
            r23 = r7
            r24 = r7
            r25 = r7
            r26 = r7
            r27 = r10
            r28 = r7
            r29 = r7
            r30 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r2.add(r5)
            r5 = 2131957531(0x7f13171b, float:1.9551649E38)
            java.lang.String r20 = X.AnonymousClass7TE.A16(r4, r5)
            r5 = 2131238196(0x7f081d34, float:1.8092664E38)
            android.graphics.drawable.Drawable r16 = r4.getDrawable(r5)
            r4 = 11
            X.IVI r5 = new X.IVI
            r5.<init>((X.C53151GjN) r1, (X.C53081GiF) r0, (int) r4)
            r4 = 2131100341(0x7f0602b5, float:1.781306E38)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r4)
            X.8rI r4 = new X.8rI
            r14 = r4
            r18 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r2.add(r4)
            r8.A02(r2)
            com.instagram.common.session.UserSession r2 = r11.A07
            r4 = 36322001551435664(0x810aab00012790, double:3.0335182658642056E-306)
            boolean r2 = X.182.A06(r6, r2, r4)
            if (r2 != 0) goto L_0x06dc
            X.HmB r2 = r11.A08
            android.view.View r5 = r1.itemView
            X.0qQ.A06(r5)
            android.view.View r11 = r5.getRootView()
            r4 = 5
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            X.0qQ.A0C(r11, r4)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            int[] r4 = r2.A01
            r11.getLocationOnScreen(r4)
            int[] r15 = r2.A02
            r5.getLocationOnScreen(r15)
            r12 = r15[r7]
            r7 = r4[r7]
            int r12 = r12 - r7
            int r14 = r5.getWidth()
            int r14 = r14 + r12
            r7 = r15[r10]
            r4 = r4[r10]
            int r7 = r7 - r4
            int r10 = r5.getHeight()
            int r10 = r10 + r7
            android.content.Context r15 = r11.getContext()
            android.view.View r5 = new android.view.View
            r5.<init>(r15)
            r2.A00 = r5
            X.Gcc r4 = new X.Gcc
            r4.<init>()
            r2 = 2131099788(0x7f06008c, float:1.781194E38)
            int r15 = r15.getColor(r2)
            android.graphics.Paint r2 = r4.A00
            r2.setColor(r15)
            android.graphics.Rect r2 = r4.A01
            r2.set(r12, r7, r14, r10)
            r5.setBackground(r4)
            r2 = -1
            r11.addView(r5, r2, r2)
        L_0x06dc:
            r4 = 4
            X.LZN r2 = new X.LZN
            r2.<init>(r4, r0, r1)
            r8.setOnDismissListener(r2)
            r0 = 36328237844741232(0x811057000d3c70, double:3.0374621228621843E-306)
            boolean r0 = X.182.A06(r6, r13, r0)
            if (r0 == 0) goto L_0x06f8
            r8.A01(r9)
        L_0x06f3:
            r0 = 59173494(0x386ea76, float:7.929642E-37)
            goto L_0x079a
        L_0x06f8:
            r8.showAsDropDown(r9)
            goto L_0x06f3
        L_0x06fc:
            r0 = -834674534(0xffffffffce3fe09a, float:-8.0479194E8)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A02
            X.H0d r6 = (X.C54134H0d) r6
            X.0eM r0 = r6.A0D
            java.lang.Object r4 = r0.getValue()
            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel r4 = (com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel) r4
            X.0eM r0 = r6.A0E
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r6.A0I
            java.lang.String r7 = X.DbS.A0t(r0)
            X.0eM r0 = r6.A0G
            java.lang.String r8 = X.DbS.A0t(r0)
            java.lang.Object r9 = r1.A01
            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$FeedbackType r9 = (com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType) r9
            r4.performFeedbackButtonAction(r5, r6, r7, r8, r9)
            r0 = 472742944(0x1c2d7c20, float:5.7401326E-22)
            goto L_0x079a
        L_0x072c:
            r0 = -1928118356(0xffffffff8d133fac, float:-4.5374515E-31)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r0 = r1.A02
            X.0lg r0 = (X.0lg) r0
            X.6Yo r1 = X.DbS.A0M(r2, r0)
            X.H06 r0 = new X.H06
            r0.<init>()
            r1.A0D(r0)
            r1.A04()
            r0 = -752136831(0xffffffffd32b4d81, float:-7.3573971E11)
            goto L_0x079a
        L_0x074e:
            r0 = -2025041587(0xffffffff874c514d, float:-1.5371146E-34)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r0 = r1.A02
            X.0lg r0 = (X.0lg) r0
            X.6Yo r1 = X.DbS.A0M(r2, r0)
            X.H05 r0 = new X.H05
            r0.<init>()
            r1.A0D(r0)
            r1.A04()
            r0 = -457138909(0xffffffffe4c09d23, float:-2.8424782E22)
            goto L_0x079a
        L_0x0770:
            r0 = 721994688(0x2b08c3c0, float:4.8588564E-13)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A02
            X.IO9 r4 = (X.IO9) r4
            com.instagram.common.session.UserSession r0 = r4.A0R
            X.8A2 r2 = X.AnonymousClass8A1.A01(r0)
            X.4yP r0 = X.C279294yP.CLIPS
            java.lang.String r0 = r0.toString()
            r2.A0J(r0)
            X.Ghc r4 = r4.A0X
            java.lang.Object r2 = r1.A01
            X.6oS r1 = X.C51975G9x.A0R(r4, r2)
            r0 = 49
            X.C51975G9x.A1E(r2, r4, r1, r0)
            r0 = -1312547754(0xffffffffb1c41c56, float:-5.707572E-9)
        L_0x079a:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ID3.onClick(android.view.View):void");
    }

    public static int A00(ID3 id3, int i) {
        int A05 = AnonymousClass0fD.A05(i);
        ((C53079GiC) id3.A02).A08.invoke(id3.A01);
        return A05;
    }

    public static int A01(ID3 id3, int i) {
        int A05 = AnonymousClass0fD.A05(i);
        ((C52034GCg) id3.A02).A0D((HNR) id3.A01);
        return A05;
    }

    public ID3(C53151GjN gjN, C53081GiF giF, int i) {
        this.A00 = i;
        if (4 - i != 0) {
            this.A01 = gjN;
            this.A02 = giF;
        } else {
            this.A02 = giF;
            this.A01 = gjN;
        }
    }

    public ID3(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
