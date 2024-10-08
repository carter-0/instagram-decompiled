package X;

/* renamed from: X.IwK  reason: case insensitive filesystem */
public final class C58711IwK extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58711IwK(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C58711IwK A00(Object obj, int i) {
        return new C58711IwK(obj, i);
    }

    public static void A01(GE0 ge0, Integer num, int i) {
        GE0.A00(ge0, num, new C58711IwK(ge0, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03ab, code lost:
        X.C51971G9r.A1K(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03b0, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c1, code lost:
        r0.A03(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010a, code lost:
        r3 = r6.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0184, code lost:
        if (r0 != null) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0186, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01be, code lost:
        r2 = r1.A05;
        r2.A0J("fetch_type", X.GEB.A00(r3));
        r2.A0J("early_fetch_type", X.GEB.A00(r3));
        r2.A00.A02();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r21 = this;
            r1 = r21
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0045;
                case 1: goto L_0x0054;
                case 2: goto L_0x0064;
                case 3: goto L_0x0070;
                case 4: goto L_0x008b;
                case 5: goto L_0x0042;
                case 6: goto L_0x0091;
                case 7: goto L_0x00ab;
                case 8: goto L_0x00c6;
                case 9: goto L_0x00d2;
                case 10: goto L_0x00e0;
                case 11: goto L_0x0142;
                case 12: goto L_0x014f;
                case 13: goto L_0x0042;
                case 14: goto L_0x015e;
                case 15: goto L_0x017e;
                case 16: goto L_0x018b;
                case 17: goto L_0x0195;
                case 18: goto L_0x01a3;
                case 19: goto L_0x01b1;
                case 20: goto L_0x01b8;
                case 21: goto L_0x01d9;
                case 22: goto L_0x01ef;
                case 23: goto L_0x0207;
                case 24: goto L_0x0211;
                case 25: goto L_0x000e;
                case 26: goto L_0x0228;
                case 27: goto L_0x0236;
                case 28: goto L_0x002d;
                case 29: goto L_0x0318;
                case 30: goto L_0x0007;
                case 31: goto L_0x031f;
                case 32: goto L_0x032f;
                case 33: goto L_0x0339;
                case 34: goto L_0x0349;
                case 35: goto L_0x0354;
                case 36: goto L_0x035e;
                case 37: goto L_0x0368;
                case 38: goto L_0x0372;
                case 39: goto L_0x0389;
                case 40: goto L_0x0397;
                case 41: goto L_0x0042;
                case 42: goto L_0x0318;
                case 43: goto L_0x0007;
                case 44: goto L_0x03b1;
                case 45: goto L_0x03c1;
                case 46: goto L_0x03ca;
                case 47: goto L_0x03d7;
                case 48: goto L_0x03ca;
                case 49: goto L_0x03ca;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.07f r12 = X.DbY.A0I(r0)
        L_0x000d:
            return r12
        L_0x000e:
            java.lang.Object r2 = r1.A01
            X.H1H r2 = (X.H1H) r2
            X.0eM r0 = r2.A0M
            X.1E8 r1 = X.DbX.A0d(r0)
            X.0eM r0 = r2.A0L
            instagram.features.clips.viewer.recipesheet.RecipeSheetParams r0 = X.C51966G9m.A12(r0)
            java.lang.String r0 = r0.A04
            X.1Xj r12 = r1.A02(r0)
            if (r12 != 0) goto L_0x000d
            java.lang.String r0 = "Media required."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x002d:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "arg_extra_params"
            android.os.Parcelable r12 = r1.getParcelable(r0)
            if (r12 != 0) goto L_0x000d
            java.lang.String r0 = "Params required."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0042:
            java.lang.Object r12 = r1.A01
            return r12
        L_0x0045:
            java.lang.Object r1 = r1.A01
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r1
            X.3TG r0 = X.AnonymousClass3TG.DISCRETE_PAGING
            r1.setScrollMode(r0)
            r0 = 0
            r1.A0M(r0, r0)
            goto L_0x03ae
        L_0x0054:
            java.lang.Object r1 = r1.A01
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r1
            r0 = -1
            r1.A0C = r0
            X.3v0 r0 = new X.3v0
            r0.<init>()
            r1.A0J = r0
            goto L_0x03ae
        L_0x0064:
            java.lang.Object r0 = r1.A01
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r0
            r0.A0E()
            r0.A0F()
            goto L_0x03ae
        L_0x0070:
            java.lang.Object r0 = r1.A01
            X.Gvc r0 = (X.C53871Gvc) r0
            X.JT5 r1 = r0.A01
            if (r1 == 0) goto L_0x0089
            boolean r0 = r0.A03
            java.lang.Integer r0 = r1.AYl(r0)
            if (r0 == 0) goto L_0x0089
            int r0 = r0.intValue()
        L_0x0084:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            return r12
        L_0x0089:
            r0 = 0
            goto L_0x0084
        L_0x008b:
            java.lang.Object r0 = r1.A01
            X.0sa r0 = (X.C62320sa) r0
            goto L_0x0186
        L_0x0091:
            java.lang.Object r2 = r1.A01
            X.LVB r2 = (X.LVB) r2
            com.instagram.common.session.UserSession r0 = r2.A03
            X.1GF r1 = X.1GE.A00(r0)
            r0 = 0
            r1.A00(r0)
            r1 = 0
            X.STU r0 = r2.A02
            r0.A08(r1)
            X.1vq r0 = r2.A01
            r0.A03(r2)
            goto L_0x00c1
        L_0x00ab:
            java.lang.Object r2 = r1.A01
            X.LVB r2 = (X.LVB) r2
            com.instagram.common.session.UserSession r0 = r2.A03
            X.1GF r1 = X.1GE.A00(r0)
            r0 = 0
            r1.A00(r0)
            r1 = 0
            X.STU r0 = r2.A02
            r0.A08(r1)
            X.1vq r0 = r2.A01
        L_0x00c1:
            r0.A03(r2)
            goto L_0x03ae
        L_0x00c6:
            java.lang.Object r0 = r1.A01
            X.H2O r0 = (X.H2O) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.Hlb r12 = new X.Hlb
            r12.<init>(r0)
            return r12
        L_0x00d2:
            java.lang.Object r0 = r1.A01
            X.H2O r0 = (X.H2O) r0
            X.H2K r0 = r0.A03
            com.instagram.common.session.UserSession r0 = r0.A01
            X.Hlc r12 = new X.Hlc
            r12.<init>(r0)
            return r12
        L_0x00e0:
            java.lang.Object r6 = r1.A01
            X.GZP r6 = (X.GZP) r6
            java.util.Map r5 = r6.A05
            java.util.Iterator r9 = X.AnonymousClass7TF.A0u(r5)
        L_0x00ea:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x013d
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r9)
            java.lang.String r13 = X.DbT.A13(r0)
            java.lang.Object r0 = r0.getValue()
            long r0 = X.AnonymousClass7TE.A0R(r0)
            long r7 = X.C51966G9m.A07(r0)
            r3 = 250(0xfa, double:1.235E-321)
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x00ea
            java.util.Map r3 = r6.A06
            java.lang.Number r2 = X.C51966G9m.A14(r13, r3)
            if (r2 == 0) goto L_0x00ea
            X.I0t r10 = X.C56542I0t.A00
            com.instagram.common.session.UserSession r12 = r6.A01
            X.0iw r11 = r6.A00
            int r18 = r3.size()
            int r19 = r2.intValue()
            java.lang.String r14 = r6.A02
            java.lang.String r4 = r6.A03
            double r2 = (double) r0
            java.util.Map r7 = r6.A04
            java.lang.Object r1 = r7.get(r13)
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            boolean r20 = X.0qQ.A0K(r1, r0)
            r16 = r2
            r15 = r4
            r10.A00(r11, r12, r13, r14, r15, r16, r18, r19, r20)
            r7.put(r13, r0)
            goto L_0x00ea
        L_0x013d:
            r5.clear()
            goto L_0x03ae
        L_0x0142:
            java.lang.Object r1 = r1.A01
            X.54O r1 = (X.AnonymousClass54O) r1
            r1.A04()
            r0 = 0
            r1.setParentCompositionContext(r0)
            goto L_0x03ae
        L_0x014f:
            java.lang.Object r1 = r1.A01
            androidx.compose.ui.platform.ComposeView r1 = (androidx.compose.ui.platform.ComposeView) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.0sL r0 = X.C45194Crw.A00
            r1.setContent(r0)
            goto L_0x03ae
        L_0x015e:
            java.lang.Object r4 = r1.A01
            X.GE3 r4 = (X.GE3) r4
            X.2is r0 = r4.A06
            X.GBE r3 = r0.A09
            if (r3 != 0) goto L_0x0172
            java.lang.String r0 = "clipsViewerFragmentViewModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0172:
            r2 = 1
            X.0sn r1 = X.0sn.A00
            r0 = 0
            X.GBE.A05(r3, r1, r2, r0)
            r0 = 0
            r4.A01 = r0
            goto L_0x03ae
        L_0x017e:
            java.lang.Object r0 = r1.A01
            X.GG0 r0 = (X.GG0) r0
            X.0sa r0 = r0.A00
            if (r0 == 0) goto L_0x03ae
        L_0x0186:
            r0.invoke()
            goto L_0x03ae
        L_0x018b:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.GLx r12 = new X.GLx
            r12.<init>(r0)
            return r12
        L_0x0195:
            java.lang.Object r1 = r1.A01
            X.GE0 r1 = (X.GE0) r1
            X.GLu r0 = r1.A00
            if (r0 == 0) goto L_0x01a0
            r0.A01()
        L_0x01a0:
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            goto L_0x01be
        L_0x01a3:
            java.lang.Object r1 = r1.A01
            X.GE0 r1 = (X.GE0) r1
            X.GLu r0 = r1.A00
            if (r0 == 0) goto L_0x01ae
            r0.A01()
        L_0x01ae:
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x01be
        L_0x01b1:
            java.lang.Object r1 = r1.A01
            X.GE0 r1 = (X.GE0) r1
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            goto L_0x01be
        L_0x01b8:
            java.lang.Object r1 = r1.A01
            X.GE0 r1 = (X.GE0) r1
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
        L_0x01be:
            X.GIQ r2 = r1.A05
            java.lang.String r1 = X.GEB.A00(r3)
            java.lang.String r0 = "fetch_type"
            r2.A0J(r0, r1)
            java.lang.String r1 = X.GEB.A00(r3)
            java.lang.String r0 = "early_fetch_type"
            r2.A0J(r0, r1)
            X.34p r0 = r2.A00
            r0.A02()
            goto L_0x03ae
        L_0x01d9:
            java.lang.Object r0 = r1.A01
            X.GE0 r0 = (X.GE0) r0
            X.GIQ r2 = r0.A05
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x03ae
            X.34p r1 = r2.A00
            r0 = 1
            if (r1 == 0) goto L_0x01eb
            r1.A04()
        L_0x01eb:
            r2.A02 = r0
            goto L_0x03ae
        L_0x01ef:
            java.lang.Object r0 = r1.A01
            X.GE0 r0 = (X.GE0) r0
            X.GIQ r2 = r0.A05
            java.lang.String r1 = "is_video_stopped"
            r0 = 1
            r2.A0K(r1, r0)
            X.34p r0 = r2.A00
            if (r0 == 0) goto L_0x0202
            r0.A03()
        L_0x0202:
            r0 = 0
            r2.A00 = r0
            goto L_0x03ae
        L_0x0207:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Hlg r12 = new X.Hlg
            r12.<init>(r0)
            return r12
        L_0x0211:
            java.lang.Object r3 = r1.A01
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36315769556241943(0x81050000250e17, double:3.029577127009466E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            X.GLo r12 = new X.GLo
            r12.<init>(r0, r3)
            return r12
        L_0x0228:
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.fragment.app.Fragment r12 = r1.mParentFragment
            boolean r0 = r12 instanceof X.C54165H1k
            if (r0 == 0) goto L_0x0235
            if (r12 == 0) goto L_0x0235
            return r12
        L_0x0235:
            return r1
        L_0x0236:
            java.lang.Object r7 = r1.A01
            X.H1H r7 = (X.H1H) r7
            X.0eM r5 = r7.A0M
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r5)
            X.I76 r3 = X.I76.A00
            X.0eM r4 = r7.A0J
            X.1Xj r0 = X.C51966G9m.A0v(r4)
            java.util.ArrayList r15 = X.I76.A05(r0)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r5)
            X.1Xj r1 = X.C51966G9m.A0v(r4)
            android.content.Context r0 = r7.requireContext()
            java.util.List r16 = r3.A07(r0, r2, r1)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r5)
            X.1Xj r5 = X.C51966G9m.A0v(r4)
            android.content.Context r3 = r7.requireContext()
            X.AnonymousClass7TG.A1N(r6, r5)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            X.CH0 r0 = X.I76.A03(r6, r5)
            r2.add(r0)
            X.CGz r0 = X.I76.A02(r6, r5)
            r2.add(r0)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r5.A3Q()
            java.util.Iterator r7 = r0.iterator()
        L_0x0289:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x02a5
            com.instagram.user.model.User r1 = X.DbT.A0k(r7)
            r0 = 18
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r1, r0)
            com.instagram.model.people.PeopleTag r0 = new com.instagram.model.people.PeopleTag
            r0.<init>((com.instagram.user.model.User) r1)
            r8.add(r0)
            goto L_0x0289
        L_0x02a5:
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r8)
            java.util.Iterator r12 = r8.iterator()
        L_0x02ad:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x02e3
            java.lang.Object r11 = r12.next()
            com.instagram.model.people.PeopleTag r11 = (com.instagram.model.people.PeopleTag) r11
            java.lang.String r9 = r11.getId()
            X.0qQ.A07(r9)
            com.instagram.model.people.PeopleTag$UserInfo r0 = r11.A00
            java.lang.String r8 = r0.A04
            if (r8 != 0) goto L_0x02c8
            java.lang.String r8 = ""
        L_0x02c8:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131971373(0x7f134d2d, float:1.9579723E38)
            java.lang.String r7 = X.AnonymousClass7TF.A0d(r1, r0)
            com.instagram.model.people.PeopleTag$UserInfo r0 = r11.A00
            com.instagram.common.typedurl.ImageUrl r1 = r0.A01
            X.0qQ.A07(r1)
            X.H3F r0 = new X.H3F
            r0.<init>(r1, r9, r8, r7)
            r10.add(r0)
            goto L_0x02ad
        L_0x02e3:
            r2.addAll(r10)
            X.H3P r0 = X.I76.A04(r5)
            r2.add(r0)
            boolean r0 = r5.CcK()
            if (r0 != 0) goto L_0x030a
            X.4bN r1 = X.C295375o3.A02(r5)
            boolean r0 = X.AnonymousClass3ZC.A0R(r6, r5)
            if (r0 != 0) goto L_0x0303
            boolean r0 = X.AnonymousClass3ZC.A0N(r1, r6, r5)
            if (r0 == 0) goto L_0x030a
        L_0x0303:
            X.H3H r0 = X.I76.A01(r3, r6, r5)
            r2.add(r0)
        L_0x030a:
            java.util.List r17 = X.00k.A0X(r2)
            X.1Xj r14 = X.C51966G9m.A0v(r4)
            X.H6h r12 = new X.H6h
            r12.<init>(r13, r14, r15, r16, r17)
            return r12
        L_0x0318:
            java.lang.Object r0 = r1.A01
            java.lang.Object r12 = X.DbT.A0r(r0)
            return r12
        L_0x031f:
            java.lang.Object r2 = r1.A01
            X.HKc r2 = (X.C54593HKc) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.common.session.UserSession r1 = r2.A07
            X.0iw r0 = r2.A06
            X.8aR r12 = new X.8aR
            r12.<init>(r0, r1)
            return r12
        L_0x032f:
            java.lang.Object r0 = r1.A01
            X.GCr r0 = (X.C52045GCr) r0
            X.GBE r0 = r0.A04
            r0.A0G()
            goto L_0x03ae
        L_0x0339:
            java.lang.Object r0 = r1.A01
            X.3kE r0 = (X.C249703kE) r0
            android.content.Context r1 = X.DbS.A07(r0)
            r0 = 2131237983(0x7f081c5f, float:1.8092232E38)
            android.graphics.drawable.Drawable r12 = r1.getDrawable(r0)
            return r12
        L_0x0349:
            java.lang.Object r0 = r1.A01
            X.GCs r0 = (X.C52046GCs) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.3Dp r12 = X.C238833Dp.A00(r0)
            return r12
        L_0x0354:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.GP6 r12 = new X.GP6
            r12.<init>(r0)
            return r12
        L_0x035e:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.I6B r12 = new X.I6B
            r12.<init>(r0)
            return r12
        L_0x0368:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.I43 r12 = new X.I43
            r12.<init>(r0)
            return r12
        L_0x0372:
            java.lang.Object r2 = r1.A01
            X.GBx r2 = (X.C52025GBx) r2
            X.GBt r1 = r2.A02
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x037f
            r1.A00()
        L_0x037f:
            instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController r1 = r2.A03
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x03ae
            r1.A00()
            goto L_0x03ae
        L_0x0389:
            java.lang.Object r0 = r1.A01
            X.GKy r0 = (X.C52257GKy) r0
            X.How r1 = r0.A02
            X.I5d r0 = r1.A05
            r0.A03()
            com.instagram.common.session.UserSession r0 = r1.A03
            goto L_0x03ab
        L_0x0397:
            java.lang.Object r0 = r1.A01
            X.GC1 r0 = (X.GC1) r0
            X.GC0 r1 = r0.A01
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x03ae
            r0 = 0
            r1.A00 = r0
            X.GBu r0 = r1.playerManager
            r0.A00()
            com.instagram.common.session.UserSession r0 = r1.A02
        L_0x03ab:
            X.C51971G9r.A1K(r0)
        L_0x03ae:
            X.0gF r12 = X.C60340gF.A00
            return r12
        L_0x03b1:
            java.lang.Object r0 = r1.A01
            X.E2y r0 = (X.C47452E2y) r0
            X.0eM r0 = r0.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.EEu r12 = new X.EEu
            r12.<init>(r0)
            return r12
        L_0x03c1:
            java.lang.Object r0 = r1.A01
            X.8Z9 r0 = (X.AnonymousClass8Z9) r0
            X.3pa r12 = r0.A00()
            return r12
        L_0x03ca:
            java.lang.Object r0 = r1.A01
            X.2Ru r0 = (X.2Ru) r0
            int r0 = r0.getViewCount()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            return r12
        L_0x03d7:
            java.lang.Object r3 = r1.A01
            X.H3y r3 = (X.C54229H3y) r3
            X.2rw r2 = r3.A05
            X.4DU r0 = r3.A06
            java.lang.String r1 = r0.getModuleName()
            r0 = 46
            X.IwK r0 = A00(r3, r0)
            X.2u0 r12 = r2.A00(r1, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58711IwK.invoke():java.lang.Object");
    }
}
