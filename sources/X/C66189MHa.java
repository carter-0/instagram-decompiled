package X;

/* renamed from: X.MHa  reason: case insensitive filesystem */
public final class C66189MHa extends AnonymousClass1Ek implements 0sK {
    public Object A00;
    public boolean A01;
    public final int A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66189MHa(Object obj, AnonymousClass4D7 r3, int i) {
        super(3, r3);
        this.A02 = i;
        this.A03 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1a;
        AnonymousClass4D7 r7;
        Object obj4;
        int i;
        C66189MHa mHa;
        switch (this.A02) {
            case 0:
                A1a = AnonymousClass7TE.A1a(obj2);
                r7 = (AnonymousClass4D7) obj3;
                obj4 = this.A03;
                i = 0;
                break;
            case 1:
                A1a = AnonymousClass7TE.A1a(obj2);
                r7 = (AnonymousClass4D7) obj3;
                obj4 = this.A03;
                i = 1;
                break;
            case 2:
                A1a = AnonymousClass7TE.A1a(obj2);
                r7 = (AnonymousClass4D7) obj3;
                obj4 = this.A03;
                i = 2;
                break;
            case 3:
                boolean A1a2 = AnonymousClass7TE.A1a(obj);
                mHa = new C66189MHa(this.A03, (AnonymousClass4D7) obj3, 3);
                mHa.A01 = A1a2;
                mHa.A00 = obj2;
                break;
            case 4:
                A1a = AnonymousClass7TE.A1a(obj2);
                r7 = (AnonymousClass4D7) obj3;
                obj4 = this.A03;
                i = 4;
                break;
            default:
                A1a = AnonymousClass7TE.A1a(obj2);
                r7 = (AnonymousClass4D7) obj3;
                obj4 = this.A03;
                i = 5;
                break;
        }
        mHa = new C66189MHa(obj4, r7, i);
        mHa.A00 = obj;
        mHa.A01 = A1a;
        return mHa.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r0v107, types: [java.lang.Object, X.KGC] */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x033b, code lost:
        if (r4 != null) goto L_0x033d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r8 = r20
            int r0 = r8.A02
            switch(r0) {
                case 0: goto L_0x031f;
                case 1: goto L_0x0056;
                case 2: goto L_0x02e2;
                case 3: goto L_0x0270;
                case 4: goto L_0x022a;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.0eS.A00(r21)
            java.lang.Object r5 = r8.A00
            java.util.List r5 = (java.util.List) r5
            boolean r7 = r8.A01
            java.lang.Object r0 = r8.A03
            X.Ggq r0 = (X.C52999Ggq) r0
            X.2nF r4 = r0.A00
            java.lang.String r3 = r0.A02
            java.util.ArrayList r2 = X.00k.A0U(r5)
            r1 = 1
            r0 = 0
            r4.A08(r3, r2, r1, r0)
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r5)
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        L_0x002a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0050
            java.lang.Object r4 = r5.next()
            int r3 = r1 + 1
            if (r1 < 0) goto L_0x020c
            X.4bN r4 = (X.C267324bN) r4
            if (r1 != 0) goto L_0x004e
            r0 = 2131969096(0x7f134448, float:1.9575105E38)
            X.HsR r2 = X.JTP.A0P(r0)
        L_0x0043:
            r1 = 0
            X.6sp r0 = new X.6sp
            r0.<init>(r1, r4, r2)
            r6.add(r0)
            r1 = r3
            goto L_0x002a
        L_0x004e:
            r2 = 0
            goto L_0x0043
        L_0x0050:
            X.JV5 r2 = new X.JV5
            r2.<init>((java.util.List) r6, (boolean) r7)
            return r2
        L_0x0056:
            X.0eS.A00(r21)
            java.lang.Object r7 = r8.A00
            X.Jv4 r7 = (X.Jv4) r7
            boolean r5 = r8.A01
            java.lang.Object r3 = r8.A03
            X.JhS r3 = (X.C60209JhS) r3
            java.util.List r0 = r7.A03
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00af
            java.lang.Integer r1 = r7.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x00af
            X.L59 r2 = r3.A01
            X.72b r3 = new X.72b
            r3.<init>()
            r0 = 2131238794(0x7f081f8a, float:1.8093877E38)
            r3.A02 = r0
            r0 = 2131971425(0x7f134d61, float:1.9579829E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0B = r0
            r0 = 2131971424(0x7f134d60, float:1.9579827E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0A = r0
        L_0x008f:
            X.6rr r1 = X.C320156rr.EMPTY
            r0 = 1
            X.0qQ.A0B(r3, r0)
            X.KGC r0 = new X.KGC
            r0.<init>()
            r0.A00 = r3
            r0.A01 = r1
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            X.Vhr r0 = r2.A01
            r0.A00()
            X.Kng r0 = r7.A00
            X.KZh r2 = new X.KZh
            r2.<init>(r0, r1, r5)
            return r2
        L_0x00af:
            java.util.List r2 = r7.A03
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x00e5
            java.lang.Integer r1 = r7.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x00e5
            X.L59 r2 = r3.A01
            X.72b r3 = new X.72b
            r3.<init>()
            r0 = 2131238259(0x7f081d73, float:1.8092792E38)
            r3.A02 = r0
            r0 = 2131971423(0x7f134d5f, float:1.9579825E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0B = r0
            r0 = 2131971422(0x7f134d5e, float:1.9579823E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0A = r0
            r0 = 2131971421(0x7f134d5d, float:1.957982E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A09 = r0
            goto L_0x008f
        L_0x00e5:
            boolean r0 = X.AnonymousClass7TE.A1b(r2)
            if (r0 == 0) goto L_0x0227
            X.L59 r10 = r3.A01
            X.0eM r0 = r3.A02
            r0.getValue()
            r9 = 0
            r8 = 0
            java.lang.String r1 = X.AnonymousClass7TF.A0b()
            r6 = 2131165196(0x7f07000c, float:1.7944602E38)
            X.UO2 r0 = new X.UO2
            r0.<init>(r8, r8, r1, r6)
            X.2tL[] r0 = new X.C232262tL[]{r0}
            java.util.ArrayList r4 = X.0sr.A1M(r0)
            java.util.LinkedHashMap r3 = X.AnonymousClass7TE.A1H()
            r10.A00 = r9
            java.util.Iterator r19 = r2.iterator()
            r14 = 0
        L_0x0113:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0214
            java.lang.Object r11 = r19.next()
            int r18 = r14 + 1
            if (r14 < 0) goto L_0x020c
            X.JwH r11 = (X.C61079JwH) r11
            java.lang.Object r0 = r11.A01
            java.lang.Number r0 = X.JTO.A0z(r0, r3)
            if (r0 == 0) goto L_0x0209
            int r0 = r0.intValue()
            int r0 = r0 + 1
        L_0x0131:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r11.A01
            r3.put(r0, r12)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r13 = 3
            java.lang.Object r0 = r11.A01
            X.KhY r0 = (X.C62542KhY) r0
            java.lang.String r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r12, r0}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r13)
            java.lang.String r0 = "%s_%s_overall_%s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.0qQ.A07(r0)
            java.lang.Object r0 = r11.A01
            X.KhY r0 = (X.C62542KhY) r0
            int r0 = r0.ordinal()
            if (r0 != r9) goto L_0x0202
            java.lang.Object r0 = r11.A00
            X.K1c r0 = (X.C61291K1c) r0
            X.JwG r11 = r0.A00
            if (r11 == 0) goto L_0x0202
            java.lang.Object r0 = r11.A00
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r12 = X.AnonymousClass7TF.A0q(r0, r9)
            java.util.Iterator r17 = r0.iterator()
            r1 = 0
        L_0x0179:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x01e8
            java.lang.Object r14 = r17.next()
            int r16 = r1 + 1
            if (r1 < 0) goto L_0x020c
            X.JwC r14 = (X.C61074JwC) r14
            java.lang.Object r0 = r14.A00
            X.Jw7 r0 = (X.C61069Jw7) r0
            java.lang.Object r0 = r0.A02
            com.instagram.model.shopping.productfeed.ProductTile r0 = (com.instagram.model.shopping.productfeed.ProductTile) r0
            if (r0 == 0) goto L_0x019f
            com.instagram.model.mediasize.ImageInfo r0 = X.C18768W0o.A02(r0)
            if (r0 == 0) goto L_0x019f
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.1iI.A03(r0)
            if (r0 != 0) goto L_0x01bc
        L_0x019f:
            java.lang.Object r0 = r14.A00
            X.Jw7 r0 = (X.C61069Jw7) r0
            java.lang.Object r0 = r0.A00
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x01af
            com.instagram.common.typedurl.ImageUrl r0 = r0.A1Q()
            if (r0 != 0) goto L_0x01bc
        L_0x01af:
            java.lang.Object r0 = r14.A00
            X.Jw7 r0 = (X.C61069Jw7) r0
            java.lang.Object r0 = r0.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x01e5
            r0.Bh3()
        L_0x01bc:
            java.lang.Object r0 = r14.A02
            X.JwL r0 = (X.C61083JwL) r0
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r1 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r15 = r0.iterator()
        L_0x01cc:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x01de
            java.lang.Object r0 = r15.next()
            X.JwG r0 = (X.C61078JwG) r0
            java.lang.Object r0 = r0.A00
            r1.add(r0)
            goto L_0x01cc
        L_0x01de:
            java.lang.Object r1 = r14.A03
            java.lang.Object r0 = r14.A01
            X.DbW.A1N(r1, r13, r0)
        L_0x01e5:
            r1 = r16
            goto L_0x0179
        L_0x01e8:
            r2.addAll(r12)
            java.lang.String r1 = X.AnonymousClass7TF.A0b()
            X.UO2 r0 = new X.UO2
            r0.<init>(r8, r8, r1, r6)
            r2.add(r0)
            int r1 = r10.A00
            java.lang.Object r0 = r11.A00
            int r0 = X.DbS.A05(r0)
            int r1 = r1 + r0
            r10.A00 = r1
        L_0x0202:
            r4.addAll(r2)
            r14 = r18
            goto L_0x0113
        L_0x0209:
            r0 = 0
            goto L_0x0131
        L_0x020c:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0214:
            X.Vhr r0 = r10.A01
            r0.A00()
            java.util.List r3 = X.00k.A0a(r4)
            X.0sn r1 = X.0sn.A00
            X.Kng r0 = r7.A00
            X.KZi r2 = new X.KZi
            r2.<init>(r0, r3, r1, r5)
            return r2
        L_0x0227:
            X.KZj r2 = X.C62079KZj.A00
            return r2
        L_0x022a:
            X.0eS.A00(r21)
            java.lang.Object r6 = r8.A00
            java.util.List r6 = (java.util.List) r6
            boolean r5 = r8.A01
            java.lang.Object r0 = r8.A03
            X.Ggj r0 = (X.C52992Ggj) r0
            X.2nF r4 = r0.A00
            java.lang.String r3 = r0.A02
            java.util.ArrayList r2 = X.00k.A0U(r6)
            r1 = 1
            r0 = 0
            r4.A08(r3, r2, r1, r0)
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r6)
            java.util.Iterator r3 = r6.iterator()
        L_0x024c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0262
            java.lang.Object r2 = r3.next()
            X.4bN r2 = (X.C267324bN) r2
            r1 = 0
            X.6sp r0 = new X.6sp
            r0.<init>(r1, r2, r1)
            r4.add(r0)
            goto L_0x024c
        L_0x0262:
            r0 = 2131975267(0x7f135c63, float:1.9587621E38)
            X.HsR r1 = X.JTP.A0P(r0)
            r0 = 3
            X.JV5 r2 = new X.JV5
            r2.<init>((X.C56078HsR) r1, (java.util.List) r4, (int) r0, (boolean) r5)
            return r2
        L_0x0270:
            X.0eS.A00(r21)
            boolean r0 = r8.A01
            java.lang.Object r2 = r8.A00
            X.JvD r2 = (X.C61013JvD) r2
            if (r0 == 0) goto L_0x02bb
            if (r2 == 0) goto L_0x02bb
            java.lang.String r1 = r2.A08
            java.lang.String r0 = "0"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x02bb
            java.lang.Object r4 = r8.A03
            X.KdM r4 = (X.C62288KdM) r4
            java.lang.String r2 = r2.A08
            boolean r0 = r4.A01
            r3 = 0
            if (r0 == 0) goto L_0x02a7
            X.6oS r1 = X.C318116oQ.A00(r4)
            r0 = 31
            X.DbX.A1W(r4, r2, r1, r0)
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r1 = r4.A08
            X.6oS r0 = X.C318116oQ.A00(r4)
            r1.A0J(r2, r0)
        L_0x02a4:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x02a7:
            X.4Co r0 = r4.A00
            if (r0 != 0) goto L_0x02a4
            X.6oS r2 = X.C318116oQ.A00(r4)
            r1 = 22
            X.MGv r0 = new X.MGv
            r0.<init>((java.lang.Object) r4, (X.AnonymousClass4D7) r3, (int) r1)
            X.1Er r0 = X.C51966G9m.A1L(r0, r2)
            goto L_0x02df
        L_0x02bb:
            java.lang.Object r4 = r8.A03
            X.KdM r4 = (X.C62288KdM) r4
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x02d9
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r2 = r4.A08
            com.instagram.realtimeclient.requeststream.SubscriptionHandler r0 = r2.A06
            if (r0 == 0) goto L_0x02cc
            r0.cancel()
        L_0x02cc:
            r1 = 0
            r2.A06 = r1
            com.instagram.realtimeclient.requeststream.SubscriptionHandler r0 = r2.A05
            if (r0 == 0) goto L_0x02d6
            r0.cancel()
        L_0x02d6:
            r2.A05 = r1
            goto L_0x02a4
        L_0x02d9:
            X.4Co r0 = r4.A00
            X.4Co r0 = X.JTQ.A0n(r0)
        L_0x02df:
            r4.A00 = r0
            goto L_0x02a4
        L_0x02e2:
            X.0eS.A00(r21)
            java.lang.Object r3 = r8.A00
            X.Kno r3 = (X.C62874Kno) r3
            boolean r0 = r8.A01
            if (r0 != 0) goto L_0x031d
            java.lang.Object r2 = r8.A03
            X.Ji7 r2 = (X.C60250Ji7) r2
            boolean r0 = r3 instanceof X.C62122KaY
            r1 = 1
            if (r0 == 0) goto L_0x0312
            X.2Fk r0 = r2.A06
            java.lang.Object r0 = r0.A02()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0306
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0312
        L_0x0306:
            X.2Fk r0 = r2.A08
            java.lang.Object r0 = r0.A02()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r1)
            if (r0 == 0) goto L_0x0316
        L_0x0312:
            boolean r0 = r3 instanceof X.C62124Kaa
            if (r0 == 0) goto L_0x031d
        L_0x0316:
            r0 = 0
        L_0x0317:
            X.JwK r2 = new X.JwK
            r2.<init>((X.C62874Kno) r3, (boolean) r0)
            return r2
        L_0x031d:
            r0 = 1
            goto L_0x0317
        L_0x031f:
            X.0eS.A00(r21)
            java.lang.Object r4 = r8.A00
            com.instagram.appreciation.graphql.ContentAppreciationMetricsDataImpl r4 = (com.instagram.appreciation.graphql.ContentAppreciationMetricsDataImpl) r4
            boolean r3 = r8.A01
            r0 = 0
            if (r4 == 0) goto L_0x0339
            com.instagram.appreciation.graphql.ContentAppreciationMetricsDataImpl$EstimatedEarnings r2 = r4.A0E()
            if (r2 == 0) goto L_0x0339
            java.lang.String r1 = "formatted_amount"
            java.lang.String r1 = r2.A07(r1)
            if (r1 != 0) goto L_0x033d
        L_0x0339:
            java.lang.String r1 = ""
            if (r4 == 0) goto L_0x0341
        L_0x033d:
            java.util.Map r0 = X.C60307Jj6.A00(r4)
        L_0x0341:
            X.JwF r2 = new X.JwF
            r2.<init>((java.lang.String) r1, (java.util.Map) r0, (boolean) r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66189MHa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
