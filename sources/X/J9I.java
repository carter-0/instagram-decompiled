package X;

public final class J9I extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J9I(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        super(2);
        this.A00 = i;
        this.A03 = obj;
        this.A05 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
        this.A01 = obj5;
        this.A06 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03c6, code lost:
        r0.Evl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x003c, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0293, code lost:
        X.0fL.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0302, code lost:
        if (r10 != false) goto L_0x0304;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r33, java.lang.Object r34) {
        /*
            r32 = this;
            r2 = r32
            r4 = r34
            r0 = r33
            int r1 = r2.A00
            switch(r1) {
                case 0: goto L_0x003d;
                case 1: goto L_0x01ad;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.30Y r0 = (X.AnonymousClass30Y) r0
            X.3oY r4 = (X.C252093oY) r4
            boolean r12 = X.AnonymousClass7TG.A1Z(r0, r4)
            java.lang.Object r3 = r2.A03
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            r4.B9Y(r3, r0)
            java.lang.Object r1 = r2.A05
            X.5qj r1 = (X.C296845qj) r1
            X.2xS r5 = r1.A04
            java.lang.Object r7 = r2.A02
            X.1Xj r7 = (X.1Xj) r7
            java.lang.Object r8 = r2.A04
            int r10 = r3.top
            int r11 = r3.left
            float r9 = r4.CFe(r0)
            java.lang.Object r0 = r2.A01
            X.3rq r0 = (X.C254043rq) r0
            android.view.View r6 = r0.A00
            boolean r13 = r2.A06
            r14 = r12
            r5.A04(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x003a:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x003d:
            X.5Wy r0 = (X.C286575Wy) r0
            int r3 = X.C51968G9o.A0B(r4)
            r1 = 2
            if (r3 != r1) goto L_0x004c
            boolean r1 = r0.Bwn()
            if (r1 != 0) goto L_0x03c6
        L_0x004c:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x005a
            r3 = -1190122258(0xffffffffb9102cee, float:-1.3749648E-4)
            java.lang.String r1 = "com.instagram.compose.igds.components.contextmenu.IgdsContextMenuContent.<anonymous> (IgdsContextMenuContent.kt:104)"
            X.0fL.A01(r3, r1)
        L_0x005a:
            java.lang.Object r3 = r2.A03
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            r18 = 0
            r1 = 1073741824(0x40000000, float:2.0)
            androidx.compose.ui.Modifier r5 = X.C51967G9n.A0F(r3, r1)
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            X.0sP r3 = X.C287655aY.A00
            androidx.compose.foundation.layout.IntrinsicWidthElement r1 = new androidx.compose.foundation.layout.IntrinsicWidthElement
            r1.<init>(r4, r3)
            androidx.compose.ui.Modifier r3 = r5.Ezh(r1)
            java.lang.Object r1 = r2.A05
            X.IEj r1 = (X.C56838IEj) r1
            r6 = 0
            androidx.compose.ui.Modifier r8 = X.I28.A01(r1, r3)
            java.lang.Object r10 = r2.A01
            X.0sL r10 = (X.0sL) r10
            boolean r5 = r2.A06
            java.lang.Object r4 = r2.A02
            X.HL4 r4 = (X.HL4) r4
            java.lang.Object r7 = r2.A04
            X.5RD r2 = X.C51969G9p.A0Z(r0, r6)
            int r9 = X.C287425a7.A00(r0)
            r3 = r0
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r1 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r8 = X.C287435a8.A01(r0, r8)
            X.C51973G9u.A0y(r0, r3)
            X.C51971G9r.A12(r0, r2, r1)
            X.0sL r2 = X.C287485aD.A02
            boolean r1 = r3.A0K
            if (r1 != 0) goto L_0x00ad
            boolean r1 = X.C51972G9s.A1Q(r0, r9)
            if (r1 != 0) goto L_0x00b0
        L_0x00ad:
            X.C51971G9r.A13(r0, r2, r9)
        L_0x00b0:
            X.C51965G9l.A18(r0, r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Object r2 = r10.invoke(r0, r1)
            java.util.List r2 = (java.util.List) r2
            r1 = 1696410674(0x651d2c32, float:4.6389175E22)
            java.util.Iterator r16 = X.C51968G9o.A17(r0, r2, r1)
            r11 = 0
        L_0x00c5:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x01a2
            java.lang.Object r9 = r16.next()
            int r15 = r11 + 1
            if (r11 >= 0) goto L_0x00db
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00db:
            X.Gln r9 = (X.C53301Gln) r9
            if (r5 == 0) goto L_0x0149
            r1 = -1791549072(0xffffffff95372170, float:-3.6982933E-26)
            r0.ExS(r1)
            java.lang.String r13 = r9.A03
            X.2DO r10 = r9.A01
            r1 = -473427320(0xffffffffe3c81288, float:-7.381368E21)
            r0.ExS(r1)
            boolean r8 = r9.A06
            if (r8 == 0) goto L_0x0146
            r1 = 2131238069(0x7f081cb5, float:1.8092406E38)
            X.2DO r20 = X.C287975bA.A00(r0, r1, r6)
        L_0x00fa:
            X.C286565Wx.A0L(r3, r6)
            r1 = -473421782(0xffffffffe3c8282a, float:-7.384486E21)
            boolean r12 = X.G9t.A1Z(r0, r7, r9, r1)
            java.lang.Object r1 = r0.ECw()
            if (r12 != 0) goto L_0x010e
            java.lang.Object r12 = X.AnonymousClass5XT.A00
            if (r1 != r12) goto L_0x0118
        L_0x010e:
            r12 = 16
            X.GNG r1 = new X.GNG
            r1.<init>(r12, r9, r7)
            r0.FLL(r1)
        L_0x0118:
            X.0sa r23 = X.C51965G9l.A0y(r3, r1, r6)
            boolean r1 = r9.A04
            int r12 = X.C51966G9m.A06(r2)
            boolean r30 = X.AnonymousClass7TF.A1S(r11, r12)
            boolean r9 = r9.A05
            r26 = 132(0x84, float:1.85E-43)
            r24 = r6
            r25 = r6
            r27 = r8
            r28 = r6
            r29 = r1
            r31 = r9
            r21 = r4
            r22 = r13
            r19 = r10
            r17 = r0
            X.HXL.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.C286565Wx.A0L(r3, r6)
        L_0x0144:
            r11 = r15
            goto L_0x00c5
        L_0x0146:
            r20 = r18
            goto L_0x00fa
        L_0x0149:
            r5 = 0
            r1 = -1790879968(0xffffffff95415720, float:-3.904477E-26)
            r0.ExS(r1)
            java.lang.String r14 = r9.A03
            X.2DO r12 = r9.A02
            X.2DO r10 = r9.A01
            r1 = -473404662(0xffffffffe3c86b0a, float:-7.3941236E21)
            boolean r8 = X.G9t.A1Z(r0, r7, r9, r1)
            java.lang.Object r1 = r0.ECw()
            if (r8 != 0) goto L_0x0167
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            if (r1 != r8) goto L_0x0171
        L_0x0167:
            r8 = 17
            X.GNG r1 = new X.GNG
            r1.<init>(r8, r9, r7)
            r0.FLL(r1)
        L_0x0171:
            X.0sa r23 = X.C51965G9l.A0y(r3, r1, r6)
            boolean r8 = r9.A06
            boolean r1 = r9.A04
            int r13 = X.C51966G9m.A06(r2)
            boolean r30 = X.AnonymousClass7TF.A1S(r11, r13)
            boolean r9 = r9.A05
            r26 = 132(0x84, float:1.85E-43)
            r24 = r6
            r25 = r6
            r27 = r8
            r28 = r6
            r29 = r1
            r31 = r9
            r21 = r4
            r22 = r14
            r19 = r12
            r20 = r10
            r17 = r0
            X.HXL.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.C286565Wx.A0L(r3, r6)
            goto L_0x0144
        L_0x01a2:
            boolean r0 = X.C51971G9r.A1S(r0, r3, r6)
            if (r0 == 0) goto L_0x003a
            r0 = -1433139954(0xffffffffaa94050e, float:-2.6293589E-13)
            goto L_0x0293
        L_0x01ad:
            X.5Wy r0 = (X.C286575Wy) r0
            int r1 = X.C51968G9o.A0B(r4)
            r6 = 2
            r3 = 0
            if (r1 != r6) goto L_0x01bd
            boolean r1 = r0.Bwn()
            if (r1 != 0) goto L_0x03c6
        L_0x01bd:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x01cb
            r4 = 2084427925(0x7c3dd895, float:3.9429476E36)
            java.lang.String r1 = "com.instagram.creation.genai.magicmod.tools.restyle.ui.MagicModRestyleScreen.<anonymous>.<anonymous> (MagicModRestyleScreen.kt:98)"
            X.0fL.A01(r4, r1)
        L_0x01cb:
            java.lang.Object r5 = r2.A04
            X.4gU r5 = (X.C270284gU) r5
            java.lang.Object r1 = r5.getValue()
            X.GnW r1 = (X.C53399GnW) r1
            java.lang.Object r1 = r1.A03
            X.HLZ r1 = (X.HLZ) r1
            int r4 = r1.ordinal()
            r1 = 1
            if (r4 == r1) goto L_0x02c3
            if (r4 == r3) goto L_0x0298
            if (r4 != r6) goto L_0x03cb
            r1 = 95294546(0x5ae1452, float:1.6370346E-35)
            java.lang.Object r1 = X.C51967G9n.A0n(r0, r5, r1)
            X.GnW r1 = (X.C53399GnW) r1
            java.lang.Object r8 = r1.A02
            X.I12 r8 = (X.I12) r8
            java.lang.Object r1 = r5.getValue()
            X.GnW r1 = (X.C53399GnW) r1
            boolean r7 = r1.A06
            java.lang.Object r9 = r2.A05
            r1 = -1659488277(0xffffffff9d1637eb, float:-1.9881244E-21)
            boolean r1 = X.C51967G9n.A1Z(r0, r9, r1)
            java.lang.Object r6 = r0.ECw()
            if (r1 != 0) goto L_0x020c
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r6 != r1) goto L_0x0212
        L_0x020c:
            r1 = 56
            X.Imy r6 = X.C51970G9q.A0r(r0, r9, r1)
        L_0x0212:
            X.0Ya r6 = (X.C59520Ya) r6
            X.5Wx r1 = X.C51965G9l.A0H(r0, r3)
            X.0sa r6 = (X.C62320sa) r6
            r4 = -1659486454(0xffffffff9d163f0a, float:-1.9884925E-21)
            boolean r4 = X.C51967G9n.A1Z(r0, r9, r4)
            java.lang.Object r10 = r2.A02
            boolean r2 = X.C51965G9l.A1Z(r0, r10, r4)
            java.lang.Object r4 = r0.ECw()
            if (r2 != 0) goto L_0x0231
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r4 != r2) goto L_0x0237
        L_0x0231:
            r2 = 27
            X.IwQ r4 = X.C58717IwQ.A01(r0, r10, r9, r2)
        L_0x0237:
            X.0sa r12 = X.C51965G9l.A0y(r1, r4, r3)
            r2 = -1659481695(0xffffffff9d1651a1, float:-1.9894536E-21)
            boolean r2 = X.C51967G9n.A1Z(r0, r9, r2)
            java.lang.Object r4 = r0.ECw()
            if (r2 != 0) goto L_0x024c
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r4 != r2) goto L_0x0252
        L_0x024c:
            r2 = 51
            X.Imy r4 = X.C51970G9q.A0r(r0, r9, r2)
        L_0x0252:
            X.0sa r13 = X.C51968G9o.A19(r1, r4)
            X.8hK r10 = X.C56447Hyf.A00
            java.lang.Object r2 = r5.getValue()
            X.GnW r2 = (X.C53399GnW) r2
            java.lang.Object r5 = r2.A05
            X.HLB r5 = (X.HLB) r5
            r2 = -1659476236(0xffffffff9d1666f4, float:-1.990556E-21)
            boolean r2 = X.C51967G9n.A1Z(r0, r9, r2)
            java.lang.Object r4 = r0.ECw()
            if (r2 != 0) goto L_0x0273
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r4 != r2) goto L_0x0279
        L_0x0273:
            r2 = 52
            X.Imy r4 = X.C51970G9q.A0r(r0, r9, r2)
        L_0x0279:
            X.0sa r14 = X.C51968G9o.A19(r1, r4)
            r15 = 196608(0x30000, float:2.75506E-40)
            r16 = r3
            r17 = r7
            r11 = r6
            r9 = r8
            r7 = r0
            r8 = r5
            X.C56619I4u.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x028a:
            boolean r0 = X.C51967G9n.A1b(r1, r3)
            if (r0 == 0) goto L_0x003a
            r0 = -36168018(0xfffffffffdd81eae, float:-3.5909068E37)
        L_0x0293:
            X.0fL.A00(r0)
            goto L_0x003a
        L_0x0298:
            r1 = 95143576(0x5abc698, float:1.6153715E-35)
            r0.ExS(r1)
            java.lang.Object r4 = r2.A05
            r1 = -1659497706(0xffffffff9d161316, float:-1.9862202E-21)
            boolean r1 = X.C51967G9n.A1Z(r0, r4, r1)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x02b1
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x02b7
        L_0x02b1:
            r1 = 55
            X.Imy r2 = X.C51970G9q.A0r(r0, r4, r1)
        L_0x02b7:
            X.0Ya r2 = (X.C59520Ya) r2
            X.5Wx r1 = X.C51965G9l.A0H(r0, r3)
            X.0sa r2 = (X.C62320sa) r2
            X.HYB.A00(r2, r0, r3)
            goto L_0x028a
        L_0x02c3:
            r1 = -1659540250(0xffffffff9d156ce6, float:-1.9776285E-21)
            r0.ExS(r1)
            java.lang.Object r6 = r2.A05
            X.GgL r6 = (X.C52968GgL) r6
            X.5Oz r1 = r6.A02
            X.5Tl r12 = X.C51966G9m.A0i(r1)
            X.8hK r15 = X.C56447Hyf.A00
            java.lang.Object r1 = r5.getValue()
            X.GnW r1 = (X.C53399GnW) r1
            java.lang.Object r8 = r1.A04
            X.JLs r8 = (X.C59494JLs) r8
            r22 = 2131965793(0x7f133761, float:1.9568406E38)
            java.lang.Object r4 = r2.A03
            X.I1b r4 = (X.C56547I1b) r4
            boolean r10 = r2.A06
            java.lang.Object r1 = r5.getValue()
            X.GnW r1 = (X.C53399GnW) r1
            java.lang.Object r1 = r1.A01
            boolean r26 = X.G9w.A1b(r1)
            java.lang.Object r2 = r2.A01
            com.instagram.creation.genai.magicmod.model.MagicModLaunchParams r2 = (com.instagram.creation.genai.magicmod.model.MagicModLaunchParams) r2
            com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig r1 = r2.A00
            boolean r1 = r1.CTv()
            if (r1 != 0) goto L_0x0304
            r27 = 1
            if (r10 == 0) goto L_0x0306
        L_0x0304:
            r27 = 0
        L_0x0306:
            com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform r11 = r2.A02
            r1 = -1659516417(0xffffffff9d15c9ff, float:-1.9824415E-21)
            boolean r1 = X.C51967G9n.A1Z(r0, r6, r1)
            java.lang.Object r5 = r0.ECw()
            if (r1 != 0) goto L_0x0319
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r5 != r1) goto L_0x031f
        L_0x0319:
            r1 = 25
            X.MP4 r5 = X.C51969G9p.A0z(r0, r6, r1)
        L_0x031f:
            X.0sP r5 = (X.0sP) r5
            r1 = r0
            X.5Wx r1 = (X.C286565Wx) r1
            X.C286565Wx.A0L(r1, r3)
            r2 = -1659513726(0xffffffff9d15d482, float:-1.982985E-21)
            boolean r7 = X.C51967G9n.A1Z(r0, r6, r2)
            java.lang.Object r2 = r0.ECw()
            if (r7 != 0) goto L_0x0338
            java.lang.Object r7 = X.AnonymousClass5XT.A00
            if (r2 != r7) goto L_0x0341
        L_0x0338:
            r2 = 9
            X.JFu r2 = X.C59342JFu.A00(r6, r2)
            r0.FLL(r2)
        L_0x0341:
            X.0sL r20 = X.C51965G9l.A10(r1, r2)
            r2 = -1659509165(0xffffffff9d15e653, float:-1.983906E-21)
            boolean r2 = X.C51967G9n.A1Z(r0, r6, r2)
            java.lang.Object r7 = r0.ECw()
            if (r2 != 0) goto L_0x0356
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r7 != r2) goto L_0x035c
        L_0x0356:
            r2 = 53
            X.Imy r7 = X.C51970G9q.A0r(r0, r6, r2)
        L_0x035c:
            X.0sa r16 = X.C51968G9o.A19(r1, r7)
            r2 = -1659506921(0xffffffff9d15ef17, float:-1.9843592E-21)
            boolean r2 = X.C51967G9n.A1Z(r0, r6, r2)
            java.lang.Object r7 = r0.ECw()
            if (r2 != 0) goto L_0x0371
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r7 != r2) goto L_0x0377
        L_0x0371:
            r2 = 11
            X.InR r7 = X.C51970G9q.A0q(r0, r6, r2)
        L_0x0377:
            X.0Ya r2 = X.C51965G9l.A12(r1, r7)
            X.0sL r2 = (X.0sL) r2
            r7 = -1659504421(0xffffffff9d15f8db, float:-1.9848641E-21)
            boolean r9 = X.C51967G9n.A1Z(r0, r6, r7)
            java.lang.Object r7 = r0.ECw()
            if (r9 != 0) goto L_0x038e
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            if (r7 != r9) goto L_0x0394
        L_0x038e:
            r7 = 54
            X.Imy r7 = X.C51970G9q.A0r(r0, r6, r7)
        L_0x0394:
            X.0sa r17 = X.C51968G9o.A19(r1, r7)
            r7 = -1659501811(0xffffffff9d16030d, float:-1.9853912E-21)
            boolean r9 = X.C51967G9n.A1Z(r0, r6, r7)
            java.lang.Object r7 = r0.ECw()
            if (r9 != 0) goto L_0x03a9
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            if (r7 != r9) goto L_0x03af
        L_0x03a9:
            r7 = 15
            X.Ivh r7 = X.C58672Ivh.A00(r0, r6, r7)
        L_0x03af:
            X.0sa r18 = X.C51965G9l.A0y(r1, r7, r3)
            r23 = 24624(0x6030, float:3.4506E-41)
            r19 = r5
            r21 = r2
            r24 = r3
            r25 = r10
            r14 = r11
            r13 = r8
            r10 = r0
            r11 = r4
            X.HYG.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x028a
        L_0x03c6:
            r0.Evl()
            goto L_0x003a
        L_0x03cb:
            r1 = -1659541851(0xffffffff9d1566a5, float:-1.9773052E-21)
            X.Wub r0 = X.C51973G9u.A0n(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J9I.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
