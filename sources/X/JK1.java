package X;

import java.util.List;

public final class JK1 extends 0Yg implements 0sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JK1(List list, 0sP r3, 0sP r4, int i) {
        super(4);
        this.A00 = i;
        this.A01 = list;
        if (2 - i != 0) {
            this.A02 = r3;
            this.A03 = r4;
        } else {
            this.A03 = r3;
            this.A02 = r4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (r6 == X.AnonymousClass05K.A0C) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x064d, code lost:
        X.0fL.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0654, code lost:
        r14.Evl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f2, code lost:
        if (r1 == 0) goto L_0x01f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r26, java.lang.Object r27, java.lang.Object r28, java.lang.Object r29) {
        /*
            r25 = this;
            r0 = r25
            r14 = r28
            r2 = r29
            r13 = r27
            r1 = r26
            int r3 = r0.A00
            switch(r3) {
                case 0: goto L_0x0659;
                case 1: goto L_0x05e3;
                case 2: goto L_0x0584;
                case 3: goto L_0x04e4;
                case 4: goto L_0x0484;
                case 5: goto L_0x0372;
                case 6: goto L_0x0312;
                case 7: goto L_0x02b2;
                case 8: goto L_0x025d;
                case 9: goto L_0x016c;
                case 10: goto L_0x06fa;
                case 11: goto L_0x010c;
                case 12: goto L_0x0098;
                default: goto L_0x000f;
            }
        L_0x000f:
            X.HtY r1 = (X.C56146HtY) r1
            X.Hse r13 = (X.C56091Hse) r13
            int r21 = X.AnonymousClass7TE.A0M(r14)
            X.0sa r2 = (X.C62320sa) r2
            X.C51974G9v.A1K(r1, r13, r2)
            r4 = r21 & 112(0x70, float:1.57E-43)
            r3 = 48
            boolean r6 = X.AnonymousClass7TF.A1S(r4, r3)
            r5 = r21 & 7
            r4 = 5
            java.lang.Object r12 = r0.A02
            X.3Y5 r12 = (X.AnonymousClass3Y5) r12
            r3 = 4
            if (r5 != r4) goto L_0x002f
            r3 = 2
        L_0x002f:
            double r3 = (double) r3
            int r3 = X.C51972G9s.A0B(r12, r3)
            int r5 = -r3
            if (r6 == 0) goto L_0x0091
            r3 = 4625196817309499392(0x4030000000000000, double:16.0)
            int r3 = X.C51972G9s.A0B(r12, r3)
            int r3 = -r3
        L_0x003e:
            java.lang.Object r9 = r0.A03
            X.GvI r9 = (X.C53851GvI) r9
            boolean r4 = r9.A02
            if (r4 == 0) goto L_0x005d
            java.lang.String r4 = r1.A04
            boolean r4 = X.C51966G9m.A1X(r4)
            if (r4 == 0) goto L_0x005d
            java.lang.Integer r6 = r1.A01
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            if (r6 == r4) goto L_0x005d
            java.lang.Integer r4 = X.AnonymousClass05K.A0Y
            if (r6 == r4) goto L_0x005d
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            r8 = 1
            if (r6 != r4) goto L_0x005e
        L_0x005d:
            r8 = 0
        L_0x005e:
            X.HMY r7 = r9.A00
            X.0sP r4 = r9.A01
            java.lang.Object r6 = r0.A01
            X.Hsu r7 = X.C55226HeH.A00(r7, r1)
            if (r8 == 0) goto L_0x008e
            r0 = 43
            X.Ivw r17 = X.C58687Ivw.A00(r4, r1, r0)
        L_0x0070:
            r0 = 41
            X.Ivw r14 = X.C58687Ivw.A00(r4, r1, r0)
            r0 = 42
            X.Ivw r15 = X.C58687Ivw.A00(r7, r4, r0)
            r0 = 21
            X.Iw6 r16 = X.C58697Iw6.A00(r4, r1, r6, r0)
            r18 = r2
            r19 = r5
            r20 = r3
            X.C55229HeK.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x008b:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x008e:
            r17 = 0
            goto L_0x0070
        L_0x0091:
            r3 = 4620693217682128896(0x4020000000000000, double:8.0)
            int r3 = X.C51972G9s.A0B(r12, r3)
            goto L_0x003e
        L_0x0098:
            int r4 = X.AnonymousClass7TE.A0M(r13)
            X.5Wy r14 = (X.C286575Wy) r14
            int r5 = X.AnonymousClass7TE.A0M(r2)
            r2 = r5 & 6
            if (r2 != 0) goto L_0x010a
            int r3 = X.G9t.A0O(r14, r1)
            r3 = r3 | r5
        L_0x00ab:
            r1 = r5 & 48
            if (r1 != 0) goto L_0x00b4
            int r1 = X.G9t.A06(r14, r4)
            r3 = r3 | r1
        L_0x00b4:
            r2 = r3 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            if (r2 != r1) goto L_0x00c0
            boolean r1 = r14.Bwn()
            if (r1 != 0) goto L_0x0654
        L_0x00c0:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x00ce
            r2 = -1594627408(0xffffffffa0f3eab0, float:-4.1321104E-19)
            java.lang.String r1 = "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:345)"
            X.0fL.A01(r2, r1)
        L_0x00ce:
            java.lang.Object r1 = r0.A02
            java.lang.Object r5 = X.C51966G9m.A19(r1, r4)
            r4 = r3 & 14
            com.instagram.wonderwall.model.WallPostItem r5 = (com.instagram.wonderwall.model.WallPostItem) r5
            r1 = -8906392(0xffffffffff781968, float:-3.2978046E38)
            r14.ExS(r1)
            r15 = 0
            java.lang.Object r1 = r0.A03
            com.instagram.wonderwall.model.WallInfo r1 = (com.instagram.wonderwall.model.WallInfo) r1
            java.lang.String r3 = r1.A01
            java.lang.Object r2 = r0.A01
            X.Ghf r2 = (X.C53047Ghf) r2
            r1 = 0
            int r0 = r4 >> 3
            r19 = r0 & 14
            r20 = 114(0x72, float:1.6E-43)
            r18 = r3
            r21 = r1
            r22 = r1
            r23 = r1
            r17 = r2
            r16 = r5
            X.I5C.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r0 = X.C51970G9q.A1a(r14, r1)
            if (r0 == 0) goto L_0x008b
            r0 = -1858833883(0xffffffff91347225, float:-1.423467E-28)
            goto L_0x064d
        L_0x010a:
            r3 = r5
            goto L_0x00ab
        L_0x010c:
            int r5 = X.AnonymousClass7TE.A0M(r13)
            X.5Wy r14 = (X.C286575Wy) r14
            int r4 = X.AnonymousClass7TE.A0M(r2)
            r2 = r4 & 6
            if (r2 != 0) goto L_0x016a
            int r3 = X.G9t.A0O(r14, r1)
            r3 = r3 | r4
        L_0x011f:
            r1 = r4 & 48
            if (r1 != 0) goto L_0x0128
            int r1 = X.G9t.A06(r14, r5)
            r3 = r3 | r1
        L_0x0128:
            r2 = r3 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            if (r2 != r1) goto L_0x0134
            boolean r1 = r14.Bwn()
            if (r1 != 0) goto L_0x0654
        L_0x0134:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0140
            r1 = -1689170595(0xffffffff9b514d5d, float:-1.7313072E-22)
            X.C51965G9l.A17(r1)
        L_0x0140:
            java.lang.Object r1 = r0.A01
            java.lang.Object r4 = X.C51966G9m.A19(r1, r5)
            r3 = r3 & 14
            X.Gbx r4 = (X.C52745Gbx) r4
            r1 = 301782976(0x11fcd7c0, float:3.9891556E-28)
            r14.ExS(r1)
            java.lang.Object r2 = r0.A03
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r1 = r0.A02
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r1 = (com.instagram.settings2.core.viewmodel.SettingsScreenViewModel) r1
            int r0 = r3 >> 3
            r0 = r0 & 14
            X.C52737Gbp.A00(r14, r4, r1, r2, r0)
            boolean r0 = X.C51970G9q.A1Z(r14)
            if (r0 == 0) goto L_0x008b
            r0 = -2122992654(0xffffffff8175b3f2, float:-4.5128498E-38)
            goto L_0x064d
        L_0x016a:
            r3 = r4
            goto L_0x011f
        L_0x016c:
            int r3 = X.AnonymousClass7TE.A0M(r13)
            X.5Wy r14 = (X.C286575Wy) r14
            int r4 = X.AnonymousClass7TE.A0M(r2)
            r2 = r4 & 6
            if (r2 != 0) goto L_0x025a
            int r1 = X.G9t.A0O(r14, r1)
            r2 = r4 | r1
        L_0x0180:
            r1 = r4 & 48
            if (r1 != 0) goto L_0x0189
            int r1 = X.G9t.A06(r14, r3)
            r2 = r2 | r1
        L_0x0189:
            r2 = r2 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            if (r2 != r1) goto L_0x0195
            boolean r1 = r14.Bwn()
            if (r1 != 0) goto L_0x0654
        L_0x0195:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x01a3
            r2 = -217124134(0xfffffffff30ef2da, float:-1.1325558E31)
            java.lang.String r1 = "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)"
            X.0fL.A01(r2, r1)
        L_0x01a3:
            java.lang.Object r1 = r0.A02
            java.lang.Object r8 = X.C51966G9m.A19(r1, r3)
            X.2Ep r8 = (X.AnonymousClass2Ep) r8
            r1 = -1203939905(0xffffffffb83d55bf, float:-4.514097E-5)
            r14.ExS(r1)
            com.instagram.user.model.User r1 = r8.BZK()
            if (r1 == 0) goto L_0x0257
            com.instagram.common.typedurl.ImageUrl r1 = r1.Bh3()
        L_0x01bb:
            r6 = 0
            X.2DN r15 = X.1zC.A00(r14, r1)
            com.instagram.user.model.User r1 = r8.BZK()
            if (r1 == 0) goto L_0x0253
            boolean r23 = r1.isVerified()
        L_0x01ca:
            java.lang.String r16 = r8.C6f()
            if (r16 != 0) goto L_0x01d2
            java.lang.String r16 = "unknown"
        L_0x01d2:
            com.instagram.common.session.UserSession r5 = X.C51968G9o.A0h(r14)
            android.content.Context r4 = X.C51968G9o.A0I(r14)
            X.9IE r1 = r8.BxH()
            if (r1 == 0) goto L_0x0251
            java.lang.Object r1 = r1.A00
            X.9Ip r1 = (X.C376599Ip) r1
            if (r1 == 0) goto L_0x0251
            java.lang.String r3 = r1.A02
        L_0x01e8:
            X.3su r2 = X.AnonymousClass48N.A01(r8)
            if (r3 == 0) goto L_0x01f4
            int r1 = r3.length()
            if (r1 != 0) goto L_0x0201
        L_0x01f4:
            java.lang.String r1 = X.C66713MbK.A00
            com.instagram.user.model.User r1 = X.AnonymousClass48N.A04(r5, r2, r8)
            java.lang.CharSequence r3 = X.C66713MbK.A00(r4, r5, r2, r8, r1)
            X.0qQ.A0A(r3)
        L_0x0201:
            java.lang.String r17 = r3.toString()
            r1 = -870115296(0xffffffffcc231820, float:-4.2754176E7)
            r14.ExS(r1)
            java.lang.Object r7 = r0.A01
            boolean r1 = X.C51971G9r.A1T(r14, r7, r8)
            java.lang.Object r5 = r14.ECw()
            if (r1 != 0) goto L_0x021b
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r5 != r1) goto L_0x0225
        L_0x021b:
            r1 = 25
            X.Plq r5 = new X.Plq
            r5.<init>(r1, r8, r7)
            r14.FLL(r5)
        L_0x0225:
            X.0sa r5 = (X.C62320sa) r5
            X.5Wx r4 = X.C51965G9l.A0H(r14, r6)
            r3 = -1001130330(0xffffffffc453f6a6, float:-847.8539)
            java.lang.Object r2 = r0.A03
            r1 = 15
            X.JGn r0 = new X.JGn
            r0.<init>(r1, r2, r8, r7)
            X.5PJ r19 = X.AnonymousClass5PI.A01(r14, r0, r3)
            r21 = 196608(0x30000, float:2.75506E-40)
            r22 = 24300(0x5eec, float:3.4052E-41)
            r18 = r5
            r20 = r6
            X.GS8.A0A(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r0 = X.C51967G9n.A1b(r4, r6)
            if (r0 == 0) goto L_0x008b
            r0 = -534071713(0xffffffffe02ab65f, float:-4.9204496E19)
            goto L_0x064d
        L_0x0251:
            r3 = 0
            goto L_0x01e8
        L_0x0253:
            r23 = 0
            goto L_0x01ca
        L_0x0257:
            r1 = 0
            goto L_0x01bb
        L_0x025a:
            r2 = r4
            goto L_0x0180
        L_0x025d:
            X.Nj3 r1 = (X.C69302Nj3) r1
            X.Niv r14 = (X.C69295Niv) r14
            r2 = 0
            int r5 = X.DbW.A02(r2, r1, r14)
            java.lang.Object r4 = r0.A03
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r0.A01
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r6 = r0.A02
            X.OyT r6 = (X.C72203OyT) r6
            java.lang.Integer r2 = X.AnonymousClass05K.A06
            X.C72203OyT.A03(r6, r2)
            X.0Ud r0 = r6.A0R
            java.lang.Object r0 = r0.getValue()
            X.Niv r0 = (X.C69295Niv) r0
            int r0 = r0.ordinal()
            if (r0 != r5) goto L_0x02af
            java.lang.Integer r7 = X.AnonymousClass05K.A00
        L_0x0287:
            int r0 = r14.ordinal()
            if (r0 != r5) goto L_0x02ac
            java.lang.Integer r8 = X.AnonymousClass05K.A00
        L_0x028f:
            X.C72203OyT.A03(r6, r2)
            X.0Ud r0 = r6.A0Q
            java.lang.Object r0 = r0.getValue()
            X.Niv r0 = (X.C69295Niv) r0
            int r0 = r0.ordinal()
            if (r0 != r5) goto L_0x02a9
            java.lang.Integer r9 = X.AnonymousClass05K.A00
        L_0x02a2:
            r5 = r1
            r6 = r3
            X.C71099OcZ.A01(r4, r5, r6, r7, r8, r9)
            goto L_0x008b
        L_0x02a9:
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            goto L_0x02a2
        L_0x02ac:
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            goto L_0x028f
        L_0x02af:
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            goto L_0x0287
        L_0x02b2:
            int r5 = X.AnonymousClass7TE.A0M(r13)
            X.5Wy r14 = (X.C286575Wy) r14
            int r4 = X.AnonymousClass7TE.A0M(r2)
            r2 = r4 & 6
            if (r2 != 0) goto L_0x0310
            int r3 = X.G9t.A0O(r14, r1)
            r3 = r3 | r4
        L_0x02c5:
            r1 = r4 & 48
            if (r1 != 0) goto L_0x02ce
            int r1 = X.G9t.A06(r14, r5)
            r3 = r3 | r1
        L_0x02ce:
            r2 = r3 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            if (r2 != r1) goto L_0x02da
            boolean r1 = r14.Bwn()
            if (r1 != 0) goto L_0x0654
        L_0x02da:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x02e6
            r1 = -319425382(0xffffffffecf5f49a, float:-2.3787354E27)
            X.C51965G9l.A17(r1)
        L_0x02e6:
            java.lang.Object r1 = r0.A01
            java.lang.Object r4 = X.C51966G9m.A19(r1, r5)
            r3 = r3 & 14
            X.QP8 r4 = (X.QP8) r4
            r1 = -193474858(0xfffffffff477ced6, float:-7.8533475E31)
            r14.ExS(r1)
            java.lang.Object r2 = r0.A02
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r1 = r0.A03
            X.0sP r1 = (X.0sP) r1
            int r0 = r3 >> 3
            r0 = r0 & 14
            X.C56286Hvu.A01(r14, r4, r2, r1, r0)
            boolean r0 = X.C51970G9q.A1Z(r14)
            if (r0 == 0) goto L_0x008b
            r0 = -537168421(0xffffffffdffb75db, float:-3.623926E19)
            goto L_0x064d
        L_0x0310:
            r3 = r4
            goto L_0x02c5
        L_0x0312:
            int r5 = X.AnonymousClass7TE.A0M(r13)
            X.5Wy r14 = (X.C286575Wy) r14
            int r4 = X.AnonymousClass7TE.A0M(r2)
            r2 = r4 & 6
            if (r2 != 0) goto L_0x0370
            int r3 = X.G9t.A0O(r14, r1)
            r3 = r3 | r4
        L_0x0325:
            r1 = r4 & 48
            if (r1 != 0) goto L_0x032e
            int r1 = X.G9t.A06(r14, r5)
            r3 = r3 | r1
        L_0x032e:
            r2 = r3 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            if (r2 != r1) goto L_0x033a
            boolean r1 = r14.Bwn()
            if (r1 != 0) goto L_0x0654
        L_0x033a:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0346
            r1 = -1868103146(0xffffffff90a70216, float:-6.58731E-29)
            X.C51965G9l.A17(r1)
        L_0x0346:
            java.lang.Object r1 = r0.A01
            java.lang.Object r4 = X.C51966G9m.A19(r1, r5)
            r3 = r3 & 14
            X.QP8 r4 = (X.QP8) r4
            r1 = -194336906(0xfffffffff46aa776, float:-7.4364867E31)
            r14.ExS(r1)
            java.lang.Object r2 = r0.A02
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r1 = r0.A03
            X.0sP r1 = (X.0sP) r1
            int r0 = r3 >> 3
            r0 = r0 & 14
            X.C56286Hvu.A01(r14, r4, r2, r1, r0)
            boolean r0 = X.C51970G9q.A1Z(r14)
            if (r0 == 0) goto L_0x008b
            r0 = 993067316(0x3b310134, float:0.0027008774)
            goto L_0x064d
        L_0x0370:
            r3 = r4
            goto L_0x0325
        L_0x0372:
            int r6 = X.AnonymousClass7TE.A0M(r13)
            X.5Wy r14 = (X.C286575Wy) r14
            int r3 = X.AnonymousClass7TE.A0M(r2)
            r2 = r3 & 6
            r4 = 10
            if (r2 != 0) goto L_0x0481
            int r1 = X.G9t.A0O(r14, r1)
            r5 = r3 | r1
        L_0x0388:
            r2 = r3 & 48
            r1 = 32
            if (r2 != 0) goto L_0x0393
            int r2 = X.G9t.A06(r14, r6)
            r5 = r5 | r2
        L_0x0393:
            r3 = r5 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            if (r3 != r2) goto L_0x039f
            boolean r2 = r14.Bwn()
            if (r2 != 0) goto L_0x0654
        L_0x039f:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x03ab
            r2 = -1964043081(0xffffffff8aef14b7, float:-2.3022655E-32)
            X.C51965G9l.A17(r2)
        L_0x03ab:
            java.lang.Object r2 = r0.A01
            java.lang.Object r7 = X.C51966G9m.A19(r2, r6)
            r11 = r5 & 14
            X.HMx r7 = (X.C54666HMx) r7
            r2 = 1154090378(0x44ca058a, float:1616.1731)
            r14.ExS(r2)
            int r3 = r7.ordinal()
            r6 = 1
            r2 = 2
            if (r3 == r2) goto L_0x0466
            r5 = 0
            if (r3 == r4) goto L_0x0425
            r2 = 1154499515(0x44d043bb, float:1666.1166)
            r14.ExS(r2)
            int r2 = r7.A00
            X.2DO r4 = X.C287975bA.A00(r14, r2, r5)
            int r2 = r7.A01
            java.lang.String r3 = X.C288035bG.A00(r14, r2)
            X.IPn r2 = X.C57124IPn.A00
            X.5Qk r8 = androidx.compose.ui.Modifier.A00
            r9 = -794034741(0xffffffffd0abfdcb, float:-2.30842921E10)
            r14.ExS(r9)
            java.lang.Object r9 = r0.A03
            boolean r10 = r14.AGu(r9)
            r0 = r11 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            if (r0 <= r1) goto L_0x03f4
            boolean r0 = r14.AGu(r7)
            if (r0 != 0) goto L_0x03f9
        L_0x03f4:
            r0 = r11 & 48
            if (r0 == r1) goto L_0x03f9
            r6 = 0
        L_0x03f9:
            r10 = r10 | r6
            java.lang.Object r1 = r14.ECw()
            if (r10 != 0) goto L_0x0404
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x040a
        L_0x0404:
            r0 = 43
            X.Ivy r1 = X.C58689Ivy.A00(r14, r7, r9, r0)
        L_0x040a:
            X.0sa r1 = (X.C62320sa) r1
            X.C51965G9l.A1X(r14, r5)
            androidx.compose.ui.Modifier r0 = X.C287635aW.A06(r8, r1)
            X.C52636GaA.A03(r14, r0, r4, r2, r3)
        L_0x0416:
            X.5Wx r0 = X.C51965G9l.A0G(r14)
            boolean r0 = X.C51967G9n.A1a(r0)
            if (r0 == 0) goto L_0x008b
            r0 = -2006839674(0xffffffff88620e86, float:-6.8026473E-34)
            goto L_0x064d
        L_0x0425:
            r1 = 1154266922(0x44ccb72a, float:1637.7239)
            r14.ExS(r1)
            int r1 = r7.A01
            java.lang.String r17 = X.C288035bG.A00(r14, r1)
            long r19 = X.C51966G9m.A09(r14)
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
            r3 = 0
            r1 = -794043966(0xffffffffd0abd9c2, float:-2.30653993E10)
            r14.ExS(r1)
            java.lang.Object r2 = r0.A02
            boolean r0 = r14.AGu(r2)
            java.lang.Object r1 = r14.ECw()
            if (r0 != 0) goto L_0x044e
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0454
        L_0x044e:
            r0 = 23
            X.IwF r1 = X.C58706IwF.A00(r14, r2, r0)
        L_0x0454:
            X.0sa r1 = (X.C62320sa) r1
            X.C51965G9l.A1X(r14, r5)
            androidx.compose.ui.Modifier r15 = X.C287635aW.A05(r4, r3, r3, r1, r6)
            r18 = 130044(0x1fbfc, float:1.8223E-40)
            r16 = r3
            X.C52636GaA.A0I(r14, r15, r16, r17, r18, r19)
            goto L_0x0416
        L_0x0466:
            r0 = -794053886(0xffffffffd0abb302, float:-2.30450831E10)
            X.5Qk r1 = X.C51965G9l.A0K(r14, r0)
            r0 = 1098907648(0x41800000, float:16.0)
            androidx.compose.ui.Modifier r15 = X.C51967G9n.A0F(r1, r0)
            r18 = 0
            long r19 = X.C51966G9m.A0C(r14)
            r16 = 1086324736(0x40c00000, float:6.0)
            r17 = 390(0x186, float:5.47E-43)
            X.C56618I4t.A02(r14, r15, r16, r17, r18, r19)
            goto L_0x0416
        L_0x0481:
            r5 = r3
            goto L_0x0388
        L_0x0484:
            int r5 = X.AnonymousClass7TE.A0M(r13)
            X.5Wy r14 = (X.C286575Wy) r14
            int r4 = X.AnonymousClass7TE.A0M(r2)
            r2 = r4 & 6
            if (r2 != 0) goto L_0x04e2
            int r3 = X.G9t.A0O(r14, r1)
            r3 = r3 | r4
        L_0x0497:
            r1 = r4 & 48
            if (r1 != 0) goto L_0x04a0
            int r1 = X.G9t.A06(r14, r5)
            r3 = r3 | r1
        L_0x04a0:
            r2 = r3 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            if (r2 != r1) goto L_0x04ac
            boolean r1 = r14.Bwn()
            if (r1 != 0) goto L_0x0654
        L_0x04ac:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x04b8
            r1 = -536371978(0xffffffffe0079cf6, float:-3.9087823E19)
            X.C51965G9l.A17(r1)
        L_0x04b8:
            java.lang.Object r1 = r0.A03
            java.lang.Object r4 = X.C51966G9m.A19(r1, r5)
            r3 = r3 & 14
            X.GlE r4 = (X.C53266GlE) r4
            r1 = 1258202706(0x4afea652, float:8344361.0)
            r14.ExS(r1)
            java.lang.Object r2 = r0.A01
            X.0sK r2 = (X.0sK) r2
            java.lang.Object r1 = r0.A02
            X.0sP r1 = (X.0sP) r1
            int r0 = r3 >> 3
            r0 = r0 & 14
            X.C56639I5u.A01(r14, r4, r1, r2, r0)
            boolean r0 = X.C51970G9q.A1Z(r14)
            if (r0 == 0) goto L_0x008b
            r0 = 978600094(0x3a54409e, float:8.096787E-4)
            goto L_0x064d
        L_0x04e2:
            r3 = r4
            goto L_0x0497
        L_0x04e4:
            int r3 = X.AnonymousClass7TE.A0M(r13)
            X.5Wy r14 = (X.C286575Wy) r14
            int r4 = X.AnonymousClass7TE.A0M(r2)
            r2 = r4 & 6
            if (r2 != 0) goto L_0x0581
            int r1 = X.G9t.A0O(r14, r1)
            r2 = r4 | r1
        L_0x04f8:
            r1 = r4 & 48
            if (r1 != 0) goto L_0x0501
            int r1 = X.G9t.A06(r14, r3)
            r2 = r2 | r1
        L_0x0501:
            r2 = r2 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            if (r2 != r1) goto L_0x050d
            boolean r1 = r14.Bwn()
            if (r1 != 0) goto L_0x0654
        L_0x050d:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0519
            r1 = -1528306635(0xffffffffa4e7e435, float:-1.0056688E-16)
            X.C51965G9l.A17(r1)
        L_0x0519:
            java.lang.Object r1 = r0.A01
            java.lang.Object r9 = X.C51966G9m.A19(r1, r3)
            X.GnV r9 = (X.C53398GnV) r9
            r1 = 837001102(0x31e39f8e, float:6.624709E-9)
            r14.ExS(r1)
            java.lang.Object r2 = r9.A01
            java.lang.Number r2 = (java.lang.Number) r2
            r1 = 1689569482(0x64b4c8ca, float:2.6679058E22)
            r14.ExS(r1)
            if (r2 != 0) goto L_0x0578
            r8 = 0
        L_0x0534:
            r7 = r14
            X.5Wx r7 = (X.C286565Wx) r7
            r6 = 0
            X.C286565Wx.A0L(r7, r6)
            java.lang.String r5 = r9.A04
            boolean r4 = r9.A05
            r1 = 1689575169(0x64b4df01, float:2.6691864E22)
            r14.ExS(r1)
            java.lang.Object r3 = r0.A02
            boolean r1 = X.C51971G9r.A1V(r14, r3, r9)
            java.lang.Object r2 = r0.A03
            boolean r0 = X.C51965G9l.A1Z(r14, r2, r1)
            java.lang.Object r1 = r14.ECw()
            if (r0 != 0) goto L_0x055b
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0561
        L_0x055b:
            r0 = 31
            X.J6W r1 = X.J6W.A00(r14, r9, r3, r2, r0)
        L_0x0561:
            X.0sP r1 = X.C51965G9l.A0z(r7, r1)
            X.IPl r0 = new X.IPl
            r0.<init>(r1, r4)
            X.C52636GaA.A0M(r14, r8, r0, r5)
            boolean r0 = X.C51967G9n.A1b(r7, r6)
            if (r0 == 0) goto L_0x008b
            r0 = 1249439903(0x4a78f09f, float:4078631.8)
            goto L_0x064d
        L_0x0578:
            int r1 = r2.intValue()
            X.2DO r8 = X.C51967G9n.A0J(r14, r1)
            goto L_0x0534
        L_0x0581:
            r2 = r4
            goto L_0x04f8
        L_0x0584:
            int r5 = X.AnonymousClass7TE.A0M(r13)
            X.5Wy r14 = (X.C286575Wy) r14
            int r4 = X.AnonymousClass7TE.A0M(r2)
            r2 = r4 & 6
            if (r2 != 0) goto L_0x05e1
            int r3 = X.G9t.A0O(r14, r1)
            r3 = r3 | r4
        L_0x0597:
            r1 = r4 & 48
            if (r1 != 0) goto L_0x05a0
            int r1 = X.G9t.A06(r14, r5)
            r3 = r3 | r1
        L_0x05a0:
            r2 = r3 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            if (r2 != r1) goto L_0x05ac
            boolean r1 = r14.Bwn()
            if (r1 != 0) goto L_0x0654
        L_0x05ac:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x05b8
            r1 = -1721069125(0xffffffff996a91bb, float:-1.21269465E-23)
            X.C51965G9l.A17(r1)
        L_0x05b8:
            java.lang.Object r1 = r0.A01
            java.lang.Object r4 = X.C51966G9m.A19(r1, r5)
            r3 = r3 & 14
            X.Jvb r4 = (X.C61037Jvb) r4
            r1 = -868641041(0xffffffffcc3996ef, float:-4.8651196E7)
            r14.ExS(r1)
            java.lang.Object r2 = r0.A03
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r1 = r0.A02
            X.0sP r1 = (X.0sP) r1
            int r0 = r3 >> 3
            r0 = r0 & 14
            X.C56580I2k.A01(r14, r4, r2, r1, r0)
            boolean r0 = X.C51970G9q.A1Z(r14)
            if (r0 == 0) goto L_0x008b
            r0 = -1144407443(0xffffffffbbc9ba6d, float:-0.006156257)
            goto L_0x064d
        L_0x05e1:
            r3 = r4
            goto L_0x0597
        L_0x05e3:
            int r4 = X.AnonymousClass7TE.A0M(r13)
            X.5Wy r14 = (X.C286575Wy) r14
            int r5 = X.AnonymousClass7TE.A0M(r2)
            r2 = r5 & 6
            if (r2 != 0) goto L_0x0652
            int r3 = X.G9t.A0O(r14, r1)
            r3 = r3 | r5
        L_0x05f6:
            r1 = r5 & 48
            if (r1 != 0) goto L_0x05ff
            int r1 = X.G9t.A06(r14, r4)
            r3 = r3 | r1
        L_0x05ff:
            r2 = r3 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            if (r2 != r1) goto L_0x060b
            boolean r1 = r14.Bwn()
            if (r1 != 0) goto L_0x0654
        L_0x060b:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0619
            r2 = 1866526690(0x6f40efe2, float:5.9711122E28)
            java.lang.String r1 = "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)"
            X.0fL.A01(r2, r1)
        L_0x0619:
            java.lang.Object r1 = r0.A02
            java.lang.Object r15 = X.C51966G9m.A19(r1, r4)
            int r3 = X.C51965G9l.A02(r3)
            X.JuV r15 = (X.C60973JuV) r15
            r1 = 119909112(0x725aaf8, float:1.2463464E-34)
            r14.ExS(r1)
            java.lang.Object r2 = r0.A01
            X.LRW r2 = (X.LRW) r2
            java.lang.Object r1 = r0.A03
            X.0sL r1 = (X.0sL) r1
            int r0 = r3 >> 6
            r19 = r0 & 14
            r0 = r3 & 112(0x70, float:1.57E-43)
            r19 = r19 | r0
            r18 = r4
            r17 = r1
            r16 = r2
            X.C56647I6c.A04(r14, r15, r16, r17, r18, r19)
            boolean r0 = X.C51970G9q.A1Z(r14)
            if (r0 == 0) goto L_0x008b
            r0 = 1559653963(0x5cf66e4b, float:5.54912901E17)
        L_0x064d:
            X.0fL.A00(r0)
            goto L_0x008b
        L_0x0652:
            r3 = r5
            goto L_0x05f6
        L_0x0654:
            r14.Evl()
            goto L_0x008b
        L_0x0659:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r4 = X.AnonymousClass7TG.A1Z(r1, r13)
            r11 = 2
            X.0qQ.A0B(r14, r11)
            java.lang.Object r7 = r0.A03
            X.I4c r7 = (X.C56603I4c) r7
            java.lang.Object r3 = r0.A01
            X.6Qj r3 = (X.C307506Qj) r3
            r12 = 0
            X.0qQ.A0B(r3, r12)
            X.GkW r5 = r7.A0A
            com.facebook.quicklog.QuickPerformanceLogger r8 = r5.A00
            r6 = 231933580(0xdd3068c, float:1.3005455E-30)
            java.lang.String r5 = "editor_native_launch_data_fetch_end"
            r8.markerPoint(r6, r12, r5)
            r8.markerEnd(r6, r12, r11)
            java.lang.String r6 = r7.A02
            boolean r5 = r13.equals(r6)
            if (r5 != 0) goto L_0x06e8
            if (r6 != 0) goto L_0x06f7
            java.lang.String r5 = "cold"
        L_0x0690:
            r7.A01 = r5
            java.lang.String r8 = r7.A03
            r6 = 0
            if (r8 == 0) goto L_0x06e6
            java.util.LinkedHashMap r10 = X.AnonymousClass7TE.A1H()
            java.util.BitSet r9 = X.DbS.A0w(r11)
            java.lang.String r5 = "launch_data_serialized"
            r10.put(r5, r8)
            r9.set(r12)
            X.0sm r8 = X.0Yt.A0E()
            X.0qQ.A0B(r8, r12)
            java.lang.String r5 = "logging_parameters"
            r10.put(r5, r8)
            r9.set(r4)
            int r5 = r9.nextClearBit(r12)
            if (r5 < r11) goto L_0x0722
            X.0sm r20 = X.0Yt.A0E()
            java.util.Map r19 = X.0Yt.A0B(r10)
            r22 = 86400(0x15180, double:4.26873E-319)
            r21 = 719983200(0x2aea1260, float:4.15795E-13)
            java.lang.String r5 = "com.bloks.www.screen_query.AEVTwoScreenQuery"
            X.ShW r15 = new X.ShW
            r17 = r6
            r18 = r6
            r24 = r4
            r16 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r24)
            X.6RB r8 = X.C307516Qk.A00(r3)
            X.0sm r4 = X.0Yt.A0E()
            java.util.Set r3 = X.REH.A00
            r8.A04(r5, r4, r3)
        L_0x06e6:
            r7.A02 = r6
        L_0x06e8:
            r7.A02 = r13
            r7.A03 = r1
            r7.A04 = r14
            r7.A00 = r2
            java.lang.Object r0 = r0.A02
            X.DbS.A1U(r0)
            goto L_0x008b
        L_0x06f7:
            java.lang.String r5 = "cache_key_changed"
            goto L_0x0690
        L_0x06fa:
            android.view.View r1 = (android.view.View) r1
            android.view.MotionEvent r13 = (android.view.MotionEvent) r13
            int r11 = X.AnonymousClass7TE.A0M(r14)
            X.JPN r2 = (X.JPN) r2
            X.C51974G9v.A1K(r1, r13, r2)
            java.lang.Object r4 = r0.A03
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r3 = r0.A01
            X.3V2 r3 = (X.AnonymousClass3V2) r3
            java.lang.Object r0 = r0.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            r5 = r2
            r6 = r13
            r7 = r1
            r8 = r3
            r9 = r4
            r10 = r0
            boolean r0 = r5.DrW(r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0722:
            java.lang.IllegalStateException r0 = X.DbT.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JK1.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JK1(int i, Object obj, Object obj2, Object obj3) {
        super(4);
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }
}
