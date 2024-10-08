package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Plp  reason: case insensitive filesystem */
public final class C73914Plp extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73914Plp(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02f3, code lost:
        r1.DG7(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018d, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x031c;
                case 1: goto L_0x030a;
                case 2: goto L_0x02f8;
                case 3: goto L_0x02e2;
                case 4: goto L_0x02cc;
                case 5: goto L_0x02b6;
                case 6: goto L_0x02a4;
                case 7: goto L_0x0292;
                case 8: goto L_0x027c;
                case 9: goto L_0x026e;
                case 10: goto L_0x0261;
                case 11: goto L_0x0257;
                case 12: goto L_0x024d;
                case 13: goto L_0x0243;
                case 14: goto L_0x023a;
                case 15: goto L_0x0227;
                case 16: goto L_0x0214;
                case 17: goto L_0x0208;
                case 18: goto L_0x01d6;
                case 19: goto L_0x01c6;
                case 20: goto L_0x02eb;
                case 21: goto L_0x01bc;
                case 22: goto L_0x01ac;
                case 23: goto L_0x01a2;
                case 24: goto L_0x0198;
                case 25: goto L_0x018e;
                case 26: goto L_0x017c;
                case 27: goto L_0x016f;
                case 28: goto L_0x0165;
                case 29: goto L_0x015e;
                case 30: goto L_0x014e;
                case 31: goto L_0x0144;
                case 32: goto L_0x013a;
                case 33: goto L_0x0005;
                case 34: goto L_0x0133;
                case 35: goto L_0x012c;
                case 36: goto L_0x0005;
                case 37: goto L_0x0114;
                case 38: goto L_0x0102;
                case 39: goto L_0x00f2;
                case 40: goto L_0x00dc;
                case 41: goto L_0x00cf;
                case 42: goto L_0x00b7;
                case 43: goto L_0x0005;
                case 44: goto L_0x0133;
                case 45: goto L_0x012c;
                case 46: goto L_0x000c;
                case 47: goto L_0x0087;
                case 48: goto L_0x0072;
                case 49: goto L_0x0060;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
        L_0x000b:
            return r3
        L_0x000c:
            java.lang.Object r1 = r10.A01
            X.OMy r1 = (X.C70826OMy) r1
            java.lang.Integer r0 = r1.A01()
            int r0 = r0.intValue()
            java.lang.String r3 = ""
            switch(r0) {
                case 0: goto L_0x0022;
                case 1: goto L_0x002d;
                case 2: goto L_0x0330;
                case 3: goto L_0x0330;
                case 4: goto L_0x0044;
                case 5: goto L_0x0051;
                case 6: goto L_0x0330;
                case 7: goto L_0x000b;
                default: goto L_0x001d;
            }
        L_0x001d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0022:
            X.OLm r0 = r1.A00()
            X.N2k r0 = r0.A00
            if (r0 == 0) goto L_0x000b
            com.instagram.user.model.User r0 = r0.A04
            goto L_0x0057
        L_0x002d:
            X.OLm r0 = r1.A00()
            com.instagram.api.schemas.TrackDataImpl r0 = r0.A04
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r0.A0E
            if (r0 != 0) goto L_0x0332
        L_0x0039:
            X.OLm r0 = r1.A00()
            com.instagram.api.schemas.OriginalSoundData r0 = r0.A01
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r0.A0I
            goto L_0x005d
        L_0x0044:
            X.OLm r0 = r1.A00()
            java.lang.Long r0 = r0.A07
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r0.toString()
            goto L_0x005d
        L_0x0051:
            X.OLm r0 = r1.A00()
            com.instagram.user.model.User r0 = r0.A06
        L_0x0057:
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r0.getId()
        L_0x005d:
            if (r0 != 0) goto L_0x0332
            return r3
        L_0x0060:
            java.lang.Object r0 = r10.A01
            X.W17 r0 = (X.W17) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313682199709888(0x81031a000008c0, double:3.028257074333484E-306)
            java.lang.Boolean r3 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r3
        L_0x0072:
            java.lang.Object r0 = r10.A01
            com.instagram.feed.tifu.search.ThreadsSearchHcmViewModel r0 = (com.instagram.feed.tifu.search.ThreadsSearchHcmViewModel) r0
            X.5vC r1 = r0.A06
            X.0Ud r0 = r0.A0A
            java.lang.Object r0 = r0.getValue()
            X.5vX r0 = (X.AnonymousClass5vX) r0
            X.62P r0 = r0.A06
            r1.A01(r0)
            goto L_0x018b
        L_0x0087:
            java.lang.Object r0 = r10.A01
            X.OMy r0 = (X.C70826OMy) r0
            java.lang.Integer r0 = r0.A01()
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x009b;
                case 1: goto L_0x009e;
                case 2: goto L_0x00a1;
                case 3: goto L_0x00a4;
                case 4: goto L_0x00a7;
                case 5: goto L_0x00aa;
                case 6: goto L_0x00ad;
                case 7: goto L_0x00b0;
                default: goto L_0x0096;
            }
        L_0x0096:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x009b:
            java.lang.Integer r0 = X.AnonymousClass05K.A0G
            goto L_0x00b2
        L_0x009e:
            java.lang.Integer r0 = X.AnonymousClass05K.A09
            goto L_0x00b2
        L_0x00a1:
            java.lang.Integer r0 = X.AnonymousClass05K.A0A
            goto L_0x00b2
        L_0x00a4:
            java.lang.Integer r0 = X.AnonymousClass05K.A0E
            goto L_0x00b2
        L_0x00a7:
            java.lang.Integer r0 = X.AnonymousClass05K.A0F
            goto L_0x00b2
        L_0x00aa:
            java.lang.Integer r0 = X.AnonymousClass05K.A0B
            goto L_0x00b2
        L_0x00ad:
            java.lang.Integer r0 = X.AnonymousClass05K.A0D
            goto L_0x00b2
        L_0x00b0:
            java.lang.Integer r0 = X.AnonymousClass05K.A08
        L_0x00b2:
            java.lang.String r3 = X.C67419Mna.A00(r0)
            return r3
        L_0x00b7:
            java.lang.Object r4 = r10.A01
            X.GUc r4 = (X.C52476GUc) r4
            X.2rw r3 = r4.A02
            X.4DU r0 = r4.A03
            java.lang.String r2 = r0.getModuleName()
            r1 = 41
            X.Plp r0 = new X.Plp
            r0.<init>(r4, r1)
            X.2u0 r3 = r3.A00(r2, r0)
            return r3
        L_0x00cf:
            java.lang.Object r0 = r10.A01
            X.2Ru r0 = (X.2Ru) r0
            int r0 = r0.getViewCount()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L_0x00dc:
            java.lang.Object r0 = r10.A01
            X.HAh r0 = (X.C54366HAh) r0
            X.33h r7 = X.C73914Plp.super.C87()
            com.instagram.common.session.UserSession r4 = r0.A02
            X.4DU r6 = r0.A06
            X.3kK r8 = r0.A08
            X.30n r5 = r0.A05
            X.IUG r3 = new X.IUG
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L_0x00f2:
            java.lang.Object r0 = r10.A01
            X.HAh r0 = (X.C54366HAh) r0
            X.3Ww r1 = X.C73914Plp.super.BwU()
            X.GUc r0 = r0.A04
            X.Iap r3 = new X.Iap
            r3.<init>(r0, r1)
            return r3
        L_0x0102:
            java.lang.Object r0 = r10.A01
            X.HAh r0 = (X.C54366HAh) r0
            X.3WV r2 = X.C73914Plp.super.BRO()
            X.GUc r1 = r0.A04
            com.instagram.common.session.UserSession r0 = r0.A02
            X.ISX r3 = new X.ISX
            r3.<init>(r0, r1, r2)
            return r3
        L_0x0114:
            java.lang.Object r0 = r10.A01
            X.HAh r0 = (X.C54366HAh) r0
            X.3Wa r7 = X.C73914Plp.super.BQE()
            com.instagram.common.session.UserSession r5 = r0.A02
            X.4DH r4 = r0.A00
            X.GUc r6 = r0.A04
            X.32A r8 = r0.A07
            java.lang.String r9 = r0.A09
            X.IU7 r3 = new X.IU7
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L_0x012c:
            java.lang.Object r0 = r10.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
            return r3
        L_0x0133:
            java.lang.Object r0 = r10.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
            return r3
        L_0x013a:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.VQP r3 = new X.VQP
            r3.<init>(r0)
            return r3
        L_0x0144:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OKX r3 = new X.OKX
            r3.<init>(r0)
            return r3
        L_0x014e:
            java.lang.Object r0 = r10.A01
            X.NKA r0 = (X.NKA) r0
            X.0eM r0 = r0.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.NMn r3 = new X.NMn
            r3.<init>(r0)
            return r3
        L_0x015e:
            java.lang.Object r0 = r10.A01
            X.07f r3 = X.C51971G9r.A0U(r0)
            return r3
        L_0x0165:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OTF r3 = new X.OTF
            r3.<init>(r0)
            return r3
        L_0x016f:
            java.lang.Object r0 = r10.A01
            X.MhR r0 = (X.C67054MhR) r0
            com.instagram.common.session.UserSession r1 = r0.A03
            java.lang.String r0 = "MsysPendingThreadCountLoader"
            X.MYg r3 = X.MYc.A01(r1, r0)
            return r3
        L_0x017c:
            java.lang.Object r3 = r10.A01
            X.Mq7 r3 = (X.C67573Mq7) r3
            X.1QP r2 = r3.A01
            long r0 = r3.A00
            r2.flowEndSuccess(r0)
            r0 = 0
            r3.A00 = r0
        L_0x018b:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x018e:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Ncg r3 = new X.Ncg
            r3.<init>(r0)
            return r3
        L_0x0198:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Mpz r3 = new X.Mpz
            r3.<init>(r0)
            return r3
        L_0x01a2:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Ncf r3 = new X.Ncf
            r3.<init>(r0)
            return r3
        L_0x01ac:
            java.lang.Object r2 = r10.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.7Us r1 = X.C332367Ur.A00(r2)
            X.12T r0 = X.AnonymousClass12T.A00
            X.7Uz r3 = new X.7Uz
            r3.<init>(r0, r2, r1)
            return r3
        L_0x01bc:
            java.lang.Object r1 = r10.A01
            X.PtN r1 = (X.C74347PtN) r1
            if (r1 == 0) goto L_0x02f6
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x02f3
        L_0x01c6:
            java.lang.Object r2 = r10.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.7Us r1 = X.C332367Ur.A00(r2)
            X.0Gt r0 = X.AnonymousClass0Gt.A00
            X.7Uq r3 = new X.7Uq
            r3.<init>(r0, r2, r1)
            return r3
        L_0x01d6:
            java.lang.Object r1 = r10.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.String r0 = "IgRxProactiveWarning"
            X.1aD r0 = X.1aD.A01(r1, r0)
            X.1aS r3 = r0.A02
            X.0qQ.A07(r3)
            X.Owb r0 = X.C72116Owb.A00
            X.1aU r1 = r3.A0L(r0)
            java.lang.String r0 = "proactive_warnings"
            X.1aU r2 = X.C66581MXm.A0N(r1, r0)
            X.Owc r0 = X.C72117Owc.A00
            X.1aU r1 = r3.A0L(r0)
            java.lang.String r0 = "proactive_warnings_non_core"
            X.1aU r1 = X.C66581MXm.A0N(r1, r0)
            X.OCN r0 = new X.OCN
            r0.<init>(r2, r1)
            X.O8n r3 = new X.O8n
            r3.<init>(r0)
            return r3
        L_0x0208:
            java.lang.Object r1 = r10.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.12T r0 = X.AnonymousClass12T.A00
            X.7Zx r3 = new X.7Zx
            r3.<init>(r0, r1)
            return r3
        L_0x0214:
            java.lang.Object r2 = r10.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.1Am r1 = X.1Al.A01(r2)
            X.Mbp r0 = new X.Mbp
            r0.<init>(r1)
            X.Oy2 r3 = new X.Oy2
            r3.<init>(r2, r0)
            return r3
        L_0x0227:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Am r1 = X.1Al.A01(r0)
            X.OJv r0 = new X.OJv
            r0.<init>(r1)
            X.Oxz r3 = new X.Oxz
            r3.<init>(r0)
            return r3
        L_0x023a:
            java.lang.Object r0 = r10.A01
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            r0.onBackPressed()
            r3 = 0
            return r3
        L_0x0243:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Oxy r3 = new X.Oxy
            r3.<init>(r0)
            return r3
        L_0x024d:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1zI r3 = new X.1zI
            r3.<init>(r0)
            return r3
        L_0x0257:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OKW r3 = new X.OKW
            r3.<init>(r0)
            return r3
        L_0x0261:
            X.08y r1 = X.09i.A0A
            java.lang.Object r0 = r10.A01
            android.os.Bundle r0 = X.DbS.A0B(r0)
            com.instagram.common.session.UserSession r3 = r1.A06(r0)
            return r3
        L_0x026e:
            java.lang.Object r0 = r10.A01
            X.A90 r0 = (X.A90) r0
            android.view.ViewStub r0 = r0.A01
            android.view.View r3 = r0.inflate()
            X.C66580MXl.A1R(r3)
            return r3
        L_0x027c:
            java.lang.Object r0 = r10.A01
            X.Mnx r0 = (X.C67442Mnx) r0
            X.3oV r0 = r0.A00
            android.view.View r0 = r0.getView()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
            java.lang.Integer r3 = X.JTP.A0k(r1, r0)
            return r3
        L_0x0292:
            java.lang.Object r0 = r10.A01
            X.Mnx r0 = (X.C67442Mnx) r0
            X.3oV r0 = r0.A00
            android.view.View r1 = r0.getView()
            r0 = 2131443920(0x7f0b40d0, float:1.8509922E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x02a4:
            java.lang.Object r0 = r10.A01
            X.Mnx r0 = (X.C67442Mnx) r0
            X.3oV r0 = r0.A00
            android.view.View r1 = r0.getView()
            r0 = 2131443923(0x7f0b40d3, float:1.8509928E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x02b6:
            java.lang.Object r0 = r10.A01
            X.Mnx r0 = (X.C67442Mnx) r0
            X.3oV r0 = r0.A00
            android.view.View r0 = r0.getView()
            android.content.Context r1 = r0.getContext()
            r0 = 2131238650(0x7f081efa, float:1.8093585E38)
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)
            return r3
        L_0x02cc:
            java.lang.Object r0 = r10.A01
            X.Mnx r0 = (X.C67442Mnx) r0
            X.3oV r0 = r0.A00
            android.view.View r0 = r0.getView()
            android.content.Context r1 = r0.getContext()
            r0 = 2131238615(0x7f081ed7, float:1.8093514E38)
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)
            return r3
        L_0x02e2:
            java.lang.Object r0 = r10.A01
            X.2dZ r0 = (X.2dZ) r0
            if (r0 == 0) goto L_0x02f6
            android.view.ViewGroup r3 = r0.A0P
            return r3
        L_0x02eb:
            java.lang.Object r1 = r10.A01
            X.PtN r1 = (X.C74347PtN) r1
            if (r1 == 0) goto L_0x02f6
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x02f3:
            r1.DG7(r0)
        L_0x02f6:
            r3 = 0
            return r3
        L_0x02f8:
            java.lang.Object r0 = r10.A01
            android.view.View r0 = (android.view.View) r0
            android.content.res.Resources r0 = r0.getResources()
            int r0 = X.JTP.A03(r0)
            float r0 = (float) r0
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            return r3
        L_0x030a:
            java.lang.Object r0 = r10.A01
            android.view.View r0 = (android.view.View) r0
            android.content.res.Resources r0 = r0.getResources()
            int r0 = X.AnonymousClass7TE.A0D(r0)
            float r0 = (float) r0
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            return r3
        L_0x031c:
            java.lang.Object r0 = r10.A01
            android.view.View r0 = (android.view.View) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            float r0 = X.AnonymousClass7TE.A01(r1, r0)
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            return r3
        L_0x0330:
            java.lang.String r0 = r1.A05
        L_0x0332:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73914Plp.invoke():java.lang.Object");
    }

    public static C70488O8n A00(UserSession userSession) {
        return (C70488O8n) 1y0.A00(userSession).A01(C70488O8n.class, new C73914Plp(userSession, 18));
    }
}
