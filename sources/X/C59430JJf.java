package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.JJf  reason: case insensitive filesystem */
public final class C59430JJf extends 0Yg implements 0sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C284945Oz A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ 0sP A04;
    public final /* synthetic */ 0sP A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59430JJf(C284945Oz r2, UserSession userSession, List list, 0sP r5, 0sP r6, int i) {
        super(4);
        this.A03 = list;
        this.A00 = i;
        this.A05 = r5;
        this.A04 = r6;
        this.A01 = r2;
        this.A02 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r1.A00 == 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r33, java.lang.Object r34, java.lang.Object r35, java.lang.Object r36) {
        /*
            r32 = this;
            r15 = r35
            int r3 = X.AnonymousClass7TE.A0M(r34)
            X.5Wy r15 = (X.C286575Wy) r15
            int r2 = X.AnonymousClass7TE.A0M(r36)
            r0 = r2 & 6
            if (r0 != 0) goto L_0x025a
            r0 = r33
            int r0 = X.G9t.A0O(r15, r0)
            r1 = r2 | r0
        L_0x0018:
            r0 = r2 & 48
            if (r0 != 0) goto L_0x0021
            int r0 = X.G9t.A06(r15, r3)
            r1 = r1 | r0
        L_0x0021:
            r1 = r1 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L_0x0033
            boolean r0 = r15.Bwn()
            if (r0 == 0) goto L_0x0033
            r15.Evl()
        L_0x0030:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0033:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x003f
            r0 = -1924427562(0xffffffff8d4b90d6, float:-6.2728545E-31)
            X.C51965G9l.A17(r0)
        L_0x003f:
            r1 = r32
            java.util.List r0 = r1.A03
            java.lang.Object r7 = r0.get(r3)
            X.JOQ r7 = (X.JOQ) r7
            r0 = -2097703103(0xffffffff82f79741, float:-3.6380204E-37)
            r15.ExS(r0)
            boolean r0 = r7 instanceof X.C53554GqP
            r18 = 0
            r5 = 1
            if (r0 == 0) goto L_0x01ea
            r0 = -2097631246(0xffffffff82f8aff2, float:-3.6541313E-37)
            r15.ExS(r0)
            X.GqP r7 = (X.C53554GqP) r7
            boolean r0 = r7.A01
            r6 = 0
            if (r0 != 0) goto L_0x0068
            int r0 = r1.A00
            r4 = 0
            if (r0 != 0) goto L_0x0069
        L_0x0068:
            r4 = 1
        L_0x0069:
            X.5Qk r3 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r2 = X.C51966G9m.A0T(r3)
            r0 = 1096810496(0x41600000, float:14.0)
            androidx.compose.ui.Modifier r8 = X.C287195Zj.A08(r2, r0)
            X.5RD r10 = X.C51968G9o.A0V(r15)
            int r9 = X.C287425a7.A00(r15)
            r0 = r15
            X.5Wx r0 = (X.C286565Wx) r0
            X.5RM r2 = X.C286565Wx.A04(r0)
            androidx.compose.ui.Modifier r8 = X.C287435a8.A01(r15, r8)
            X.0sa r14 = X.C287485aD.A00
            X.C51973G9u.A0z(r15, r0, r14)
            X.0sL r13 = X.C287485aD.A03
            X.0sL r12 = X.C51969G9p.A0w(r15, r10, r2, r13)
            X.0sL r11 = X.C287485aD.A02
            boolean r2 = r0.A0K
            if (r2 != 0) goto L_0x009f
            boolean r2 = X.C51972G9s.A1Q(r15, r9)
            if (r2 != 0) goto L_0x00a2
        L_0x009f:
            X.C51971G9r.A13(r15, r11, r9)
        L_0x00a2:
            X.0sL r10 = X.C51966G9m.A1K(r15, r8)
            X.6FX r8 = X.AnonymousClass6FX.A00
            androidx.compose.ui.Modifier r3 = r8.A00(r3)
            X.5Zp r2 = X.C287215Zl.A04
            androidx.compose.ui.Modifier r3 = r8.AB1(r2, r3)
            X.5RD r9 = X.C51966G9m.A0a(r6)
            int r8 = X.C287425a7.A00(r15)
            X.5RM r2 = X.C286565Wx.A04(r0)
            androidx.compose.ui.Modifier r3 = X.C287435a8.A01(r15, r3)
            X.C51973G9u.A0z(r15, r0, r14)
            X.C287595aO.A00(r15, r9, r13)
            boolean r2 = X.C51965G9l.A1Y(r15, r0, r2, r12)
            if (r2 != 0) goto L_0x00d4
            boolean r2 = X.C51972G9s.A1Q(r15, r8)
            if (r2 != 0) goto L_0x00d7
        L_0x00d4:
            X.C51971G9r.A13(r15, r11, r8)
        L_0x00d7:
            X.C287595aO.A00(r15, r3, r10)
            java.lang.Integer r7 = r7.A00
            int r8 = r1.A00
            r2 = -876684138(0xffffffffcbbedc96, float:-2.501662E7)
            boolean r2 = X.C51967G9n.A1U(r15, r2)
            if (r2 == 0) goto L_0x00ef
            r3 = 1774493456(0x69c49f10, float:2.9712577E25)
            java.lang.String r2 = "com.instagram.opal.impl.ui.getAudienceTitleRowTitle (OpalAudienceSelectorFragment.kt:421)"
            X.0fL.A01(r3, r2)
        L_0x00ef:
            int r2 = r7.intValue()
            if (r2 == r6) goto L_0x01db
            if (r2 != r5) goto L_0x025d
            r2 = 1446515571(0x56381373, float:5.0598418E13)
            r15.ExS(r2)
            if (r8 <= 0) goto L_0x01cc
            r2 = 1446550260(0x56389af4, float:5.0743915E13)
            r15.ExS(r2)
            r3 = 2131820875(0x7f11014b, float:1.9274477E38)
            java.lang.String r2 = java.lang.String.valueOf(r8)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r9 = X.C304346Dc.A02(r15, r2, r3, r8)
        L_0x0114:
            X.C286565Wx.A0L(r0, r6)
        L_0x0117:
            boolean r2 = X.C51967G9n.A1b(r0, r6)
            if (r2 == 0) goto L_0x0123
            r2 = 130587650(0x7c89c02, float:3.0184349E-34)
            X.0fL.A00(r2)
        L_0x0123:
            X.C286565Wx.A0L(r0, r6)
            long r2 = X.C51966G9m.A0M(r15)
            r22 = 0
            X.5Z4 r8 = X.C51965G9l.A0S(r15)
            X.AnonymousClass5ZZ.A0r(r15, r8, r9, r2)
            r2 = 1247684976(0x4a5e2970, float:3639900.0)
            r15.ExS(r2)
            X.5Oz r8 = r1.A01
            boolean r2 = X.C51971G9r.A1W(r8)
            if (r2 != 0) goto L_0x017b
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            if (r7 != r2) goto L_0x017b
            r2 = 2131968837(0x7f134345, float:1.957458E38)
            java.lang.String r18 = X.C304346Dc.A00(r15, r2)
            X.HMB r16 = X.HMB.DOWN_LEFT
            X.HLY r17 = X.HLY.DARK
            r2 = 1247702409(0x4a5e6d89, float:3644258.2)
            boolean r2 = X.C51967G9n.A1Y(r15, r8, r2)
            com.instagram.common.session.UserSession r7 = r1.A02
            boolean r2 = X.C51966G9m.A1U(r15, r7, r2)
            java.lang.Object r3 = r15.ECw()
            if (r2 != 0) goto L_0x0167
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r3 != r2) goto L_0x016d
        L_0x0167:
            r2 = 39
            X.MJ7 r3 = X.C51970G9q.A0w(r15, r8, r7, r2)
        L_0x016d:
            X.0sa r19 = X.C51965G9l.A0y(r0, r3, r6)
            r20 = 197040(0x301b0, float:2.76112E-40)
            r21 = 2000(0x7d0, float:2.803E-42)
            r24 = r5
            X.C56617I4s.A03(r15, r16, r17, r18, r19, r20, r21, r22, r24)
        L_0x017b:
            X.C286565Wx.A0L(r0, r6)
            r15.ASN()
            r2 = -1414375004(0xffffffffabb259a4, float:-1.2672541E-12)
            r15.ExS(r2)
            X.0sP r3 = r1.A04
            boolean r1 = r15.AGu(r3)
            boolean r1 = X.C51966G9m.A1V(r15, r4, r1)
            java.lang.Object r2 = r15.ECw()
            if (r1 != 0) goto L_0x019b
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x01a1
        L_0x019b:
            r1 = 38
            X.GA1 r2 = X.GA1.A00(r15, r3, r1, r4)
        L_0x01a1:
            X.0sa r3 = X.C51965G9l.A0y(r0, r2, r6)
            r1 = 2131955136(0x7f130dc0, float:1.954679E38)
            if (r4 == 0) goto L_0x01ad
            r1 = 2131973026(0x7f1353a2, float:1.9583076E38)
        L_0x01ad:
            java.lang.String r2 = X.C304346Dc.A00(r15, r1)
            X.6CB r1 = X.AnonymousClass6CA.A00(r15)
            X.AnonymousClass6CE.A09(r15, r1, r2, r3, r6)
            r15.ASN()
        L_0x01bb:
            X.C286565Wx.A0L(r0, r6)
            boolean r0 = X.C51967G9n.A1b(r0, r6)
            if (r0 == 0) goto L_0x0030
            r0 = 1510699588(0x5a0b7244, float:9.8126645E15)
            X.0fL.A00(r0)
            goto L_0x0030
        L_0x01cc:
            r2 = 1446724883(0x563b4513, float:5.1476336E13)
            r15.ExS(r2)
            r2 = 2131968834(0x7f134342, float:1.9574574E38)
            java.lang.String r9 = X.C304346Dc.A00(r15, r2)
            goto L_0x0114
        L_0x01db:
            r2 = 1446368166(0x5635d3a6, float:4.9980157E13)
            r15.ExS(r2)
            r2 = 2131974699(0x7f135a2b, float:1.958647E38)
            java.lang.String r9 = X.C304346Dc.A00(r15, r2)
            goto L_0x0117
        L_0x01ea:
            boolean r0 = r7 instanceof X.C53553GqO
            if (r0 == 0) goto L_0x0265
            r0 = -2095535584(0xffffffff8318aa20, float:-4.486408E-37)
            r15.ExS(r0)
            r0 = r7
            X.GqO r0 = (X.C53553GqO) r0
            com.instagram.opal.impl.data.OpalAudienceSelectorRepository$OpalAudience r2 = r0.A00
            java.lang.String r0 = r2.A02
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.DbS.A0V(r0)
            r6 = 0
            X.2DN r17 = X.1zC.A00(r15, r0)
            java.lang.String r8 = r2.A03
            androidx.compose.ui.Modifier r16 = X.C51969G9p.A0U()
            java.lang.String r4 = r2.A00
            boolean r3 = r2.A06
            boolean r2 = r2.A04
            r0 = 70963593(0x43ad189, float:2.1960409E-36)
            r15.ExS(r0)
            X.0sP r11 = r1.A05
            boolean r0 = X.C51971G9r.A1T(r15, r11, r7)
            java.lang.Object r1 = r15.ECw()
            if (r0 != 0) goto L_0x0226
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x022c
        L_0x0226:
            r0 = 40
            X.MJ7 r1 = X.C51970G9q.A0w(r15, r11, r7, r0)
        L_0x022c:
            X.0sa r1 = (X.C62320sa) r1
            r0 = r15
            X.5Wx r0 = (X.C286565Wx) r0
            X.C286565Wx.A0L(r0, r6)
            r10 = 1450470934(0x56746e16, float:6.7188413E13)
            r9 = 15
            X.5PJ r24 = X.JJS.A00(r15, r7, r11, r9, r10)
            r25 = 384(0x180, float:5.38E-43)
            r26 = 196608(0x30000, float:2.75506E-40)
            r27 = 23784(0x5ce8, float:3.3328E-41)
            r19 = r8
            r20 = r4
            r21 = r18
            r22 = r1
            r23 = r18
            r28 = r6
            r29 = r6
            r30 = r3
            r31 = r2
            X.GS8.A01(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x01bb
        L_0x025a:
            r1 = r2
            goto L_0x0018
        L_0x025d:
            r1 = -1615913629(0xffffffff9faf1d63, float:-7.4164E-20)
            X.Wub r0 = X.C51972G9s.A0v(r15, r0, r1)
            throw r0
        L_0x0265:
            r0 = 70879490(0x4398902, float:2.1809556E-36)
            X.Wub r0 = X.C51973G9u.A0o(r15, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59430JJf.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
