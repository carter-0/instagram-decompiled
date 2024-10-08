package X;

import android.view.View;

public final class WB3 implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public WB3(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A01 = i;
        this.A02 = obj;
    }

    public static void A00(View view, Object obj, Object obj2, int i, int i2) {
        AnonymousClass0fU.A00(new WB3(i, i2, obj, obj2), view);
    }

    /* JADX WARNING: type inference failed for: r0v65, types: [com.instagram.ui.viewpager.BakeOffViewPager] */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x025c, code lost:
        if (r0 != 0) goto L_0x025e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r19) {
        /*
            r18 = this;
            r7 = r18
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0329;
                case 1: goto L_0x0310;
                case 2: goto L_0x02f7;
                case 3: goto L_0x02de;
                case 4: goto L_0x0112;
                case 5: goto L_0x00e1;
                case 6: goto L_0x0361;
                case 7: goto L_0x0353;
                case 8: goto L_0x00c3;
                case 9: goto L_0x008e;
                case 10: goto L_0x006a;
                case 11: goto L_0x0052;
                case 12: goto L_0x003a;
                case 13: goto L_0x0022;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 1354228395(0x50b7e2ab, float:2.46806835E10)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r7.A02
            X.X8z r2 = (X.C21002X8z) r2
            int r1 = r7.A01
            java.lang.Object r0 = r7.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r2.DVq(r0, r1)
            r0 = -154537328(0xfffffffff6c9f290, float:-2.047991E33)
        L_0x001e:
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        L_0x0022:
            r0 = 1395897528(0x5333b4b8, float:7.718311E11)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r7.A02
            X.X8z r2 = (X.C21002X8z) r2
            int r1 = r7.A01
            java.lang.Object r0 = r7.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r2.DJp(r0, r1)
            r0 = -2032266223(0xffffffff86de1411, float:-8.3536604E-35)
            goto L_0x001e
        L_0x003a:
            r0 = -643572760(0xffffffffd9a3dbe8, float:-5.7652763E15)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r7.A02
            X.X8z r2 = (X.C21002X8z) r2
            int r1 = r7.A01
            java.lang.Object r0 = r7.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r2.DJp(r0, r1)
            r0 = 2116614693(0x7e28fa25, float:5.615228E37)
            goto L_0x001e
        L_0x0052:
            r0 = -487068767(0xffffffffe2f7eba1, float:-2.2866623E21)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r7.A02
            X.X8z r2 = (X.C21002X8z) r2
            int r1 = r7.A01
            java.lang.Object r0 = r7.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r2.DgC(r0, r1)
            r0 = 1892805465(0x70d1eb59, float:5.1973508E29)
            goto L_0x001e
        L_0x006a:
            r0 = 1315331889(0x4e665f31, float:9.6624954E8)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r7.A03
            X.UA4 r0 = (X.UA4) r0
            X.X4r r3 = r0.A02
            if (r3 == 0) goto L_0x008a
            java.lang.Object r2 = r7.A02
            com.instagram.model.shopping.ProductVariantDimension r2 = (com.instagram.model.shopping.ProductVariantDimension) r2
            java.lang.String[] r1 = r0.A06
            int r0 = r7.A01
            r0 = r1[r0]
            if (r0 != 0) goto L_0x0087
            java.lang.String r0 = ""
        L_0x0087:
            r3.Dx4(r2, r0)
        L_0x008a:
            r0 = -1827780087(0xffffffff930e4a09, float:-1.7959422E-27)
            goto L_0x001e
        L_0x008e:
            r0 = -362567363(0xffffffffea63a93d, float:-6.880634E25)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r7.A03
            X.UA3 r4 = (X.UA3) r4
            int r3 = r4.A00
            java.lang.Object r0 = r7.A02
            X.3kE r0 = (X.C249703kE) r0
            int r0 = r0.getAbsoluteAdapterPosition()
            r4.A00 = r0
            X.L76 r0 = r4.A02
            if (r0 == 0) goto L_0x00b6
            X.0sP r2 = r0.A02
            int r1 = r7.A01
            java.util.List r0 = r4.A05
            java.lang.Object r0 = r0.get(r1)
            r2.invoke(r0)
        L_0x00b6:
            r4.notifyItemChanged(r3)
            int r0 = r4.A00
            r4.notifyItemChanged(r0)
            r0 = 2041820426(0x79b3b50a, float:1.1663663E35)
            goto L_0x001e
        L_0x00c3:
            r0 = 2079121884(0x7bece1dc, float:2.459926E36)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r7.A03
            X.1Av r1 = (X.1Av) r1
            int r0 = r7.A01
            int r0 = r0 + 1
            r1.A0b(r0)
            java.lang.Object r0 = r7.A02
            X.WB6 r0 = (X.WB6) r0
            X.WB6.A00(r0)
            r0 = 1475148193(0x57ecf9a1, float:5.21113784E14)
            goto L_0x001e
        L_0x00e1:
            r0 = -1995551333(0xffffffff890e4d9b, float:-1.7129118E-33)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r7.A03
            X.UA7 r0 = (X.UA7) r0
            X.9i0 r3 = r0.A00
            int r2 = r7.A01
            X.A3k r0 = r3.A00
            if (r0 == 0) goto L_0x010d
            X.9mJ r1 = r0.A00
            r1.A00 = r2
            X.57C r0 = X.AnonymousClass57C.CREATE_MODE_VIEW_ALL_SELECTION
            X.C387499mJ.A00(r0, r1, r2)
            android.content.Context r1 = r3.getContext()
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r0 = r0.A02(r1)
            r0.getClass()
            r0.A0B()
        L_0x010d:
            r0 = -2106007623(0xffffffff8278dfb9, float:-1.8284368E-37)
            goto L_0x001e
        L_0x0112:
            r0 = 784457615(0x2ec1df8f, float:8.816336E-11)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r7.A03
            X.ViB r0 = (X.C17920ViB) r0
            com.instagram.genericsurvey.fragment.AdBakeOffFragment r3 = r0.A06
            int r11 = r7.A01
            java.lang.Object r0 = r7.A02
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r1 = r0.getTag()
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 != 0) goto L_0x012e
            r1 = 0
        L_0x012e:
            r8 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r8)
            r4 = 0
            if (r0 == 0) goto L_0x027c
            X.Ugr r0 = r3.A02
            if (r0 != 0) goto L_0x0144
            java.lang.String r0 = "analyticsHelper"
        L_0x013c:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0144:
            long r9 = java.lang.System.currentTimeMillis()
            long r1 = r0.A01
            long r7 = r0.A00
            long r12 = r9 - r7
            long r1 = r1 + r12
            r0.A01 = r1
            r0.A00 = r9
            r0 = 2
            if (r11 != r0) goto L_0x019a
            java.util.List r5 = r3.A09
            int r0 = r3.A00
            java.lang.Object r0 = r5.get(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            int r11 = r0.size()
            r10 = 0
        L_0x0165:
            if (r10 >= r11) goto L_0x020d
            int r0 = r3.A00
            X.1Xj r9 = com.instagram.genericsurvey.fragment.AdBakeOffFragment.A00(r3, r0, r10)
            java.util.List r5 = r3.A08
            int r0 = r3.A00
            java.lang.String r8 = X.DbU.A0t(r5, r0)
            java.lang.String r7 = r3.A04
            X.0eM r0 = r3.A0B
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            r0 = 3
            X.DbW.A1O(r8, r0, r5)
            java.lang.String r0 = "bakeoff_skip"
            X.3sc r0 = X.C13991Tnr.A0O(r3, r0)
            r0.A0G(r5, r9)
            r0.A09(r10)
            r0.A6I = r8
            r0.A4I = r7
            r0.A0B(r1)
            X.C233822wX.A0H(r5, r0, r3)
            int r10 = r10 + 1
            goto L_0x0165
        L_0x019a:
            int r0 = r3.A00
            X.1Xj r16 = com.instagram.genericsurvey.fragment.AdBakeOffFragment.A00(r3, r0, r11)
            java.util.List r7 = r3.A08
            int r0 = r3.A00
            java.lang.String r12 = X.DbU.A0t(r7, r0)
            java.lang.String r10 = r3.A04
            X.0eM r0 = r3.A0B
            r17 = r0
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r17)
            java.lang.String r9 = "w"
            r14 = 4
            X.AnonymousClass7TF.A1E(r12, r14, r15)
            java.lang.String r13 = "bakeoff_result"
            java.lang.String r5 = "instagram_survey_"
            java.lang.String r0 = X.002.A0R(r5, r13)
            X.3sc r8 = new X.3sc
            r8.<init>(r3, r0)
            r0 = r16
            r8.A0G(r15, r0)
            r8.A09(r11)
            r8.A6p = r9
            r8.A6I = r12
            r8.A4I = r10
            r8.A0B(r1)
            X.C13991Tnr.A1F(r15, r8)
            int r0 = r3.A00
            int r12 = 1 - r11
            X.1Xj r11 = com.instagram.genericsurvey.fragment.AdBakeOffFragment.A00(r3, r0, r12)
            int r0 = r3.A00
            java.lang.String r10 = X.DbU.A0t(r7, r0)
            java.lang.String r9 = r3.A04
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r17)
            java.lang.String r7 = "l"
            X.AnonymousClass7TF.A1E(r10, r14, r8)
            java.lang.String r5 = X.002.A0R(r5, r13)
            X.3sc r0 = new X.3sc
            r0.<init>(r3, r5)
            r0.A0G(r8, r11)
            r0.A09(r12)
            r0.A6p = r7
            r0.A6I = r10
            r0.A4I = r9
            r0.A0B(r1)
            X.C13991Tnr.A1F(r8, r0)
        L_0x020d:
            int r0 = r3.A00
            int r1 = r0 + 1
            java.util.List r0 = r3.A09
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x0276
            X.ViB r0 = r3.answerButtonController
            if (r0 == 0) goto L_0x0220
            r0.A00(r4)
        L_0x0220:
            java.util.Set r0 = r3.A0A
            r0.clear()
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r1, r0)
            r0 = 400(0x190, double:1.976E-321)
            r2.setDuration(r0)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r2.setInterpolator(r0)
            X.UoB r0 = r3.A03
            if (r0 == 0) goto L_0x036f
            java.lang.String r1 = r0.A05
            X.Usc r0 = new X.Usc
            r0.<init>(r3, r1)
            r2.setAnimationListener(r0)
            java.lang.String r0 = "bakeoff_feed_item"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0262
            com.instagram.genericsurvey.fragment.BakeoffFeedPairSectionController r0 = r3.bakeoffFeedPairSectionController
            if (r0 == 0) goto L_0x02c2
            com.instagram.ui.viewpager.BakeOffViewPager r0 = r0.fragmentPager
            if (r0 == 0) goto L_0x02c2
        L_0x025e:
            r0.startAnimation(r2)
            goto L_0x02c2
        L_0x0262:
            java.lang.String r0 = "bakeoff_reel"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02c2
            X.WeX r0 = r3.bakeoffStoryPairSectionController
            if (r0 == 0) goto L_0x02c2
            android.view.View r0 = r0.A03
            if (r0 != 0) goto L_0x025e
            java.lang.String r0 = "reelPreviewsContainer"
            goto L_0x013c
        L_0x0276:
            java.lang.String r0 = "auto_exit_after_completion"
            r3.A05(r0)
            goto L_0x02c2
        L_0x027c:
            java.util.List r0 = r3.A09
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x02b2
            int r0 = r3.A00
            X.1Xj r9 = com.instagram.genericsurvey.fragment.AdBakeOffFragment.A00(r3, r0, r4)
            java.util.List r1 = r3.A08
            int r0 = r3.A00
            java.lang.String r7 = X.DbU.A0t(r1, r0)
            java.lang.String r5 = r3.A04
            X.0eM r0 = r3.A0B
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r1 = "attempt"
            r0 = 3
            X.DbW.A1N(r7, r0, r2)
            java.lang.String r0 = "bakeoff_action"
            X.3sc r0 = X.C13991Tnr.A0O(r3, r0)
            r0.A0G(r2, r9)
            r0.A4J = r1
            r0.A6I = r7
            r0.A4I = r5
            X.C13991Tnr.A1F(r2, r0)
        L_0x02b2:
            android.widget.Toast r0 = r3.A01
            if (r0 == 0) goto L_0x02c7
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L_0x02c7
            boolean r0 = r0.isShown()
            if (r0 != r8) goto L_0x02c7
        L_0x02c2:
            r0 = -1948894078(0xffffffff8bd63c82, float:-8.2520844E-32)
            goto L_0x001e
        L_0x02c7:
            android.content.Context r2 = r3.requireContext()
            android.content.res.Resources r1 = X.DbV.A05(r3)
            r0 = 2131962640(0x7f132b10, float:1.956201E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 0
            X.Jf4 r0 = X.C59689JTv.A03(r2, r1, r0, r4)
            r3.A01 = r0
            goto L_0x02c2
        L_0x02de:
            r0 = 1900989958(0x714ece06, float:1.0240477E30)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r7.A02
            X.X99 r2 = (X.X99) r2
            java.lang.Object r1 = r7.A03
            com.instagram.model.hashtag.Hashtag r1 = (com.instagram.model.hashtag.Hashtag) r1
            int r0 = r7.A01
            r2.Dg8(r1, r0)
            r0 = 740332511(0x2c2093df, float:2.2819452E-12)
            goto L_0x001e
        L_0x02f7:
            r0 = -1402673657(0xffffffffac64e607, float:-3.252844E-12)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r7.A02
            X.X99 r2 = (X.X99) r2
            java.lang.Object r1 = r7.A03
            X.Vc5 r1 = (X.C17674Vc5) r1
            int r0 = r7.A01
            r2.D9R(r1, r0)
            r0 = 631448137(0x25a32249, float:2.8299225E-16)
            goto L_0x001e
        L_0x0310:
            r0 = -617252393(0xffffffffdb3579d7, float:-5.1080935E16)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r7.A02
            X.X99 r2 = (X.X99) r2
            java.lang.Object r1 = r7.A03
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            int r0 = r7.A01
            r2.Dg9(r1, r0)
            r0 = -1584467591(0xffffffffa18ef179, float:-9.686212E-19)
            goto L_0x001e
        L_0x0329:
            r0 = 613834763(0x2496600b, float:6.5214833E-17)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r7.A03
            X.UA2 r0 = (X.UA2) r0
            X.2or r5 = r0.A03
            int r4 = r7.A01
            java.lang.Object r3 = r7.A02
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            java.lang.String r2 = r3.getId()
            com.instagram.common.session.UserSession r1 = r5.A02
            X.0iw r0 = r5.A01
            X.DdQ.A03(r0, r1, r2, r4)
            java.lang.String r0 = r3.getId()
            r5.A01(r0)
            r0 = 1126874848(0x432abee0, float:170.7456)
            goto L_0x001e
        L_0x0353:
            java.lang.Object r2 = r7.A02
            X.X6o r2 = (X.C20961X6o) r2
            java.lang.Object r1 = r7.A03
            X.VgE r1 = (X.C17801VgE) r1
            int r0 = r7.A01
            r2.Db9(r1, r0)
            return
        L_0x0361:
            java.lang.Object r2 = r7.A02
            X.X6o r2 = (X.C20961X6o) r2
            java.lang.Object r1 = r7.A03
            X.VgE r1 = (X.C17801VgE) r1
            int r0 = r7.A01
            r2.DbB(r1, r0)
            return
        L_0x036f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WB3.onClick(android.view.View):void");
    }
}
