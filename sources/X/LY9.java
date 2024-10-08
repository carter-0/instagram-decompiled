package X;

import android.view.View;

public final class LY9 implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public LY9(C60979Jub jub, C60690Jpb jpb, int i, int i2) {
        this.A00 = i2;
        if (1 - i2 != 0) {
            this.A03 = jpb;
            this.A02 = jub;
        } else {
            this.A02 = jub;
            this.A03 = jpb;
        }
        this.A01 = i;
    }

    public static void A00(View view, Object obj, Object obj2, int i, int i2) {
        AnonymousClass0fU.A00(new LY9(i, i2, obj, obj2), view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x046e, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0471, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02cd, code lost:
        if (r0 == null) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        X.0qQ.A0F(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0427  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x03c6;
                case 1: goto L_0x0120;
                case 2: goto L_0x0373;
                case 3: goto L_0x0315;
                case 4: goto L_0x0281;
                case 5: goto L_0x00df;
                case 6: goto L_0x025c;
                case 7: goto L_0x003d;
                case 8: goto L_0x0078;
                case 9: goto L_0x00a8;
                case 10: goto L_0x022e;
                case 11: goto L_0x0213;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1141131769(0x440449f9, float:529.1558)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A02
            X.L2s r0 = (X.C63682L2s) r0
            java.lang.Object r7 = r13.A03
            com.instagram.user.model.UpcomingEvent r7 = (com.instagram.user.model.UpcomingEvent) r7
            int r9 = r13.A01
            X.L2r r0 = r0.A00
            X.M0a r0 = r0.A00
            X.Kcv r2 = r0.A0A
            X.4gL r6 = r2.A00
            if (r6 == 0) goto L_0x0432
            X.0eM r0 = r2.A07
            java.lang.Object r0 = r0.getValue()
            X.Jhe r0 = (X.C60221Jhe) r0
            java.lang.String r5 = r2.A04
            if (r5 != 0) goto L_0x0036
            java.lang.String r5 = "viewerSessionId"
        L_0x002e:
            X.0qQ.A0F(r5)
        L_0x0031:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0036:
            java.lang.String r8 = r2.A02
            if (r8 != 0) goto L_0x03e1
            java.lang.String r5 = "entryPoint"
            goto L_0x002e
        L_0x003d:
            r0 = -992651861(0xffffffffc4d555ab, float:-1706.6771)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r13.A03
            X.K5B r4 = (X.K5B) r4
            androidx.viewpager2.widget.ViewPager2 r0 = r4.A01
            java.lang.String r5 = "viewPager"
            if (r0 == 0) goto L_0x002e
            int r0 = r0.A00
            int r2 = r13.A01
            if (r0 != r2) goto L_0x006b
            java.lang.Object r1 = r13.A02
            X.6zy r0 = r4.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x006b
            X.JjV r1 = X.JTT.A0Z(r4)
            X.LtV r0 = X.C65447LtV.A00
            X.MQl[] r0 = new X.C66405MQl[]{r0}
            r1.A03(r0)
        L_0x006b:
            androidx.viewpager2.widget.ViewPager2 r1 = r4.A01
            if (r1 == 0) goto L_0x002e
            r0 = 1
            r1.A03(r2, r0)
            r0 = -451308692(0xffffffffe519936c, float:-4.5327595E22)
            goto L_0x046e
        L_0x0078:
            r0 = -504450956(0xffffffffe1eeb074, float:-5.5038E20)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r13.A03
            X.KVJ r1 = (X.KVJ) r1
            X.LFN r0 = r1.A05
            X.0qQ.A0A(r14)
            java.lang.Object r6 = r13.A02
            X.MWx r6 = (X.C66569MWx) r6
            boolean r0 = r0.A01(r14, r6)
            if (r0 == 0) goto L_0x011b
            int r10 = r13.A01
            X.MU5 r4 = r1.A07
            r0 = 0
            com.instagram.clips.model.metadata.AudioPageMetadata r5 = X.LT9.A04(r6, r0)
            java.lang.String r8 = "MusicOverlayPlaylistSpotlightViewHolder"
            java.lang.String r9 = X.AnonymousClass7TG.A0j()
            com.instagram.music.common.model.MusicSearchPlaylist r7 = r1.A02
            if (r7 != 0) goto L_0x0118
            java.lang.String r5 = "musicSearchPlaylist"
            goto L_0x002e
        L_0x00a8:
            java.lang.Object r1 = r13.A02
            X.TzX r1 = (X.C14625TzX) r1
            java.lang.Object r0 = r13.A03
            X.3uh r0 = (X.C255773uh) r0
            int r5 = r13.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r4 = r1.A0B
            X.4gK r0 = r0.A0d
            android.content.Context r3 = r4.getContext()
            r3.getClass()
            if (r0 == 0) goto L_0x00da
            X.3Q2 r2 = r0.A00
            com.instagram.common.session.UserSession r0 = r4.A06
            X.1ua r1 = X.1ua.A00(r3, r0)
            X.0iw r0 = X.AnonymousClass6WL.A02(r3)
            r1.A05(r0, r2)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r4.mListViewPager
            float r1 = (float) r5
            r0.A0H(r1)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r4.mImageViewPager
            r0.A0H(r1)
            return
        L_0x00da:
            r0.getClass()
            goto L_0x0031
        L_0x00df:
            java.lang.Object r6 = r13.A02
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            java.lang.Object r0 = r13.A03
            X.4jz r0 = (X.C272034jz) r0
            int r5 = r13.A01
            java.lang.String r4 = r0.getPollId()
            r4.getClass()
            android.content.Context r2 = r6.requireContext()
            X.8ab r3 = X.DbS.A0Y(r2)
            r0 = 2131956380(0x7f13129c, float:1.9549314E38)
            r3.A09(r0)
            r1 = 2131956379(0x7f13129b, float:1.9549312E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            X.DbY.A0w(r2, r3, r0, r1)
            r3.A05()
            r2 = 2131957531(0x7f13171b, float:1.9551649E38)
            r1 = 3
            X.LV1 r0 = new X.LV1
            r0.<init>((java.lang.String) r4, (java.lang.Object) r6, (int) r1)
            X.Dba.A0t(r0, r3, r2)
            return
        L_0x0118:
            r4.Dm9(r5, r6, r7, r8, r9, r10)
        L_0x011b:
            r0 = 936966900(0x37d8faf4, float:2.5866066E-5)
            goto L_0x046e
        L_0x0120:
            r0 = -925344167(0xffffffffc8d85e59, float:-443122.78)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r13.A02
            X.Jub r5 = (X.C60979Jub) r5
            com.instagram.api.schemas.ACRType r4 = r5.A02
            com.instagram.api.schemas.ACRType r2 = com.instagram.api.schemas.ACRType.CAMERA_ROLL
            java.lang.Object r1 = r13.A03
            X.Jpb r1 = (X.C60690Jpb) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            if (r4 != r2) goto L_0x01b2
            X.JhU r4 = r1.A0E
            android.view.View r0 = r1.A04
            android.content.Context r7 = X.AnonymousClass7TE.A0S(r0)
            java.lang.String r6 = r5.A08
            int r2 = r13.A01
            r0 = 1
            X.0qQ.A0B(r6, r0)
            X.6oS r1 = X.C318116oQ.A00(r4)
            r5 = 0
            r0 = 8
            X.C66164MGb.A00(r4, r1, r2, r0)
            com.instagram.common.session.UserSession r4 = r4.A03
            X.27r r2 = X.27p.A01(r4)
            java.lang.String r1 = "AC_BROWSER_MORE_THREE_DOTS_MENU_REMOVE_BUTTON"
            X.JVj r0 = X.C59725JVj.ACR_BROWSER
            r2.A1Q(r0, r1)
            X.2jA r0 = new X.2jA
            r0.<init>()
            X.JY0 r7 = X.JTS.A0Q(r7, r4, r0)
            X.JY2 r0 = r7.A00
            X.0xa r4 = X.JTS.A0V(r0)
            java.util.LinkedHashSet r0 = X.DbS.A0y()
            java.lang.String r2 = "suggestions_hide_prefs_key"
            java.util.Set r0 = r4.getStringSet(r2, r0)
            if (r0 == 0) goto L_0x01ad
            java.util.Set r1 = X.00k.A0j(r0)
            boolean r0 = r1.contains(r6)
            if (r0 != 0) goto L_0x0189
            r1.add(r6)
            X.JTU.A1E(r4, r2, r1)
        L_0x0189:
            X.JY3 r4 = r7.A01
            java.util.Map r7 = r4.A05
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r7)
        L_0x0191:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01fc
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.List r0 = X.JY3.A00(r4, r0)
            r7.put(r1, r0)
            goto L_0x0191
        L_0x01ad:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01b2:
            X.JhU r4 = r1.A0E
            java.lang.String r6 = r5.A08
            int r2 = r13.A01
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.6oS r1 = X.C318116oQ.A00(r4)
            r0 = 8
            X.C66164MGb.A00(r4, r1, r2, r0)
            com.instagram.common.session.UserSession r5 = r4.A03
            X.27r r2 = X.27p.A01(r5)
            java.lang.String r1 = "AC_BROWSER_MORE_THREE_DOTS_MENU_REMOVE_BUTTON"
            X.JVj r0 = X.C59725JVj.ACR_BROWSER
            r2.A1Q(r0, r1)
            X.1NY r2 = X.AnonymousClass7TG.A0b(r5)
            java.lang.String r0 = "clips/acr_browser/delete/"
            r2.A0A(r0)
            r0 = 2573(0xa0d, float:3.606E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9m(r0, r6)
            java.lang.Class<X.CD9> r1 = X.CD9.class
            java.lang.Class<X.Cyh> r0 = X.C45569Cyh.class
            X.1OC r2 = X.DbU.A0S(r2, r1, r0)
            r1 = 1
            X.CH5 r0 = new X.CH5
            r0.<init>(r1)
            r2.A00 = r0
            android.app.Activity r1 = r4.A01
            X.07i r0 = r4.A02
            X.1ES.A00(r1, r0, r2)
            goto L_0x020e
        L_0x01fc:
            X.12T r1 = X.AnonymousClass12T.A00
            r0 = -18
            X.19S r2 = X.DbY.A0r(r1, r0)
            r1 = 31
            X.MGy r0 = new X.MGy
            r0.<init>(r4, r6, r5, r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
        L_0x020e:
            r0 = 1372757335(0x51d29d57, float:1.13072857E11)
            goto L_0x046e
        L_0x0213:
            r0 = 727268802(0x2b593dc2, float:7.7179593E-13)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A03
            X.Jkp r0 = (X.C60396Jkp) r0
            X.MUI r2 = r0.A00
            java.lang.Object r1 = r13.A02
            com.instagram.tagging.api.model.MediaSuggestedProductTag r1 = (com.instagram.tagging.api.model.MediaSuggestedProductTag) r1
            int r0 = r13.A01
            r2.D22(r1, r0)
            r0 = -958790893(0xffffffffc6da0313, float:-27905.537)
            goto L_0x046e
        L_0x022e:
            r0 = -466762462(0xffffffffe42dc522, float:-1.2821967E22)
            int r3 = X.AnonymousClass0fD.A05(r0)
            boolean r0 = r14 instanceof com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView
            if (r0 == 0) goto L_0x0257
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r14 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r14
            if (r14 == 0) goto L_0x0257
            java.lang.Object r1 = r13.A03
            X.Jga r1 = (X.C60155Jga) r1
            java.lang.Object r4 = r13.A02
            java.util.List r4 = (java.util.List) r4
            int r0 = r13.A01
            X.0V2 r2 = r1.A02
            java.lang.Object r1 = r4.get(r0)
            com.instagram.model.reels.Reel r1 = (com.instagram.model.reels.Reel) r1
            X.LwW r0 = new X.LwW
            r0.<init>(r1, r14, r4)
            r2.FIA(r0)
        L_0x0257:
            r0 = -537048847(0xffffffffdffd48f1, float:-3.6502205E19)
            goto L_0x046e
        L_0x025c:
            r0 = -1290641154(0xffffffffb31260fe, float:-3.4081488E-8)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A02
            X.LOe r0 = (X.LOe) r0
            X.MUo r2 = r0.A00
            if (r2 == 0) goto L_0x027c
            java.lang.Object r0 = r13.A03
            X.Jl2 r0 = (X.C60409Jl2) r0
            java.util.List r1 = r0.A00
            int r0 = r13.A01
            java.lang.Object r0 = r1.get(r0)
            com.instagram.model.venue.Venue r0 = (com.instagram.model.venue.Venue) r0
            r2.DOm(r0)
        L_0x027c:
            r0 = -2125475196(0xffffffff814fd284, float:-3.8170933E-38)
            goto L_0x046e
        L_0x0281:
            r0 = -2078828448(0xffffffff84179860, float:-1.7819932E-36)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r13.A03
            X.Jpe r4 = (X.C60693Jpe) r4
            int r6 = r13.A01
            java.lang.Object r0 = r13.A02
            X.JuM r0 = (X.C60964JuM) r0
            X.L0W r8 = r0.A03
            float r5 = r4.A01
            r2 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x02f7
            float r1 = r4.A00
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x02f7
            r4.A01 = r1
            r4.A00 = r2
        L_0x02a5:
            java.lang.Integer r0 = X.C60693Jpe.A01(r4)
        L_0x02a9:
            X.C60693Jpe.A04(r4, r0)
            X.Jl0 r5 = r4.A0D
            java.util.List r0 = r5.A00
            java.lang.Object r1 = r0.get(r6)
            X.JuM r1 = (X.C60964JuM) r1
            float r0 = r4.A01
            r1.A00 = r0
            r5.notifyItemChanged(r6)
            X.LEZ r7 = r4.A0B
            float r2 = r4.A01
            X.L0W r1 = r5.A05
            if (r1 == 0) goto L_0x02cf
            boolean r0 = r1 instanceof X.C61790KMe
            if (r0 == 0) goto L_0x02ee
            X.KMe r1 = (X.C61790KMe) r1
            java.lang.String r0 = r1.A00
        L_0x02cd:
            if (r0 != 0) goto L_0x02d9
        L_0x02cf:
            java.util.List r0 = r5.A00
            java.lang.Object r0 = r0.get(r6)
            X.JuM r0 = (X.C60964JuM) r0
            java.lang.String r0 = r0.A08
        L_0x02d9:
            r9 = 0
            r7.A00(r8, r0, r2)
            float r12 = r4.A01
            r10 = r9
            r11 = r9
            r7.A01(r8, r9, r10, r11, r12)
            float r0 = r4.A01
            X.C60693Jpe.A03(r4, r8, r0)
            r0 = -1905733344(0xffffffff8e68d120, float:-2.8696898E-30)
            goto L_0x046e
        L_0x02ee:
            boolean r0 = r1 instanceof X.C61789KMd
            if (r0 == 0) goto L_0x02cf
            X.KMd r1 = (X.C61789KMd) r1
            java.lang.String r0 = r1.A00
            goto L_0x02cd
        L_0x02f7:
            java.lang.Integer r1 = r4.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x030c
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x030c
            float r0 = r4.A00
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x030c
            r0 = 1056964608(0x3f000000, float:0.5)
            r4.A01 = r0
            goto L_0x02a5
        L_0x030c:
            r4.A00 = r5
            r4.A01 = r2
            java.lang.Integer r0 = X.C60693Jpe.A00(r4)
            goto L_0x02a9
        L_0x0315:
            r0 = 2064599320(0x7b0f4918, float:7.43981E35)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r13.A02
            X.Jkz r4 = (X.C60406Jkz) r4
            int r2 = r4.A00
            int r1 = r13.A01
            if (r2 != r1) goto L_0x032b
            r0 = -69317(0xfffffffffffef13b, float:NaN)
            goto L_0x046e
        L_0x032b:
            r4.A00 = r1
            r0 = -1
            if (r2 == r0) goto L_0x0333
            r4.notifyItemChanged(r2)
        L_0x0333:
            r4.notifyItemChanged(r1)
            java.lang.Object r2 = r13.A03
            X.Jmn r2 = (X.C60516Jmn) r2
            android.widget.ImageView r0 = r2.A00
            r0.getClass()
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            X.L0G r1 = r4.A04
            X.6nz r5 = r2.A01
            r5.getClass()
            X.6o8 r4 = r2.A02
            r4.getClass()
            r0.getClass()
            X.6tR r0 = (X.C321016tR) r0
            boolean r0 = r0.isLoading()
            if (r0 != 0) goto L_0x036e
            X.KKd r2 = r1.A00
            r0 = 0
            r2.A04 = r0
            X.87H r1 = r2.A0C
            r1.A07()
            X.Jcz r0 = r2.A0B
            r1.A09(r0)
            java.lang.String r0 = r2.A01
            X.C61738KKd.A01(r5, r4, r2, r0)
        L_0x036e:
            r0 = 664264455(0x2797df07, float:4.2152726E-15)
            goto L_0x046e
        L_0x0373:
            r0 = 1155931511(0x44e61d77, float:1840.9208)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r13.A03
            X.Jpb r8 = (X.C60690Jpb) r8
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.view.View r0 = r8.A04
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            com.instagram.common.session.UserSession r7 = r8.A08
            X.Dg1 r6 = new X.Dg1
            r6.<init>(r0, r7)
            r5 = 2131955169(0x7f130de1, float:1.9546858E38)
            java.lang.Object r4 = r13.A02
            X.Jub r4 = (X.C60979Jub) r4
            int r2 = r13.A01
            r1 = 1
            X.LY9 r0 = new X.LY9
            r0.<init>((X.C60979Jub) r4, (X.C60690Jpb) r8, (int) r2, (int) r1)
            r6.A02(r0, r5)
            r2 = 2131955168(0x7f130de0, float:1.9546856E38)
            r1 = 31
            X.LY0 r0 = new X.LY0
            r0.<init>(r8, r1)
            r6.A04(r0, r2)
            X.FFy r1 = new X.FFy
            r1.<init>(r6)
            android.app.Activity r0 = r8.A02
            r1.A03(r0)
            X.27r r2 = X.27p.A01(r7)
            java.lang.String r1 = "ACR_BROWSER_THREE_DOTS_MENU_BUTTON"
            X.JVj r0 = X.C59725JVj.ACR_BROWSER
            r2.A1Q(r0, r1)
            r0 = 1332585313(0x4f6da361, float:3.98690739E9)
            goto L_0x046e
        L_0x03c6:
            r0 = 1714415348(0x662fe6f4, float:2.0766862E23)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A03
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r1 = r13.A02
            int r0 = r13.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.invoke(r1, r0)
            r0 = 1171277827(0x45d04803, float:6665.0015)
            goto L_0x046e
        L_0x03e1:
            X.L5O r1 = r0.A07
            com.instagram.common.session.UserSession r0 = r1.A01
            X.0iw r10 = r1.A00
            X.0wc r1 = X.AnonymousClass0kN.A01(r10, r0)
            java.lang.String r0 = "ig_live_suggested_scheduled_live_click"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            com.instagram.user.model.User r0 = r7.BZw()
            if (r0 == 0) goto L_0x0472
            java.lang.String r1 = r0.getId()
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0403
            java.lang.String r1 = "0"
        L_0x0403:
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r1)
            if (r0 == 0) goto L_0x0472
            long r0 = r0.longValue()
        L_0x040d:
            X.JTQ.A0z(r4, r0)
            X.C51969G9p.A1A(r4, r10)
            java.lang.String r0 = "entry_point"
            java.lang.Long r1 = X.DbV.A0p(r4, r0, r8, r9)
            java.lang.String r0 = "live_position"
            r4.A9F(r0, r1)
            X.JTT.A19(r4, r6)
            java.lang.String r0 = X.C18810W3l.A04(r7)
            if (r0 != 0) goto L_0x0429
            java.lang.String r0 = ""
        L_0x0429:
            X.C51965G9l.A1I(r4, r0)
            X.C51965G9l.A1O(r4, r5)
            r4.Cgf()
        L_0x0432:
            X.0eM r0 = r2.A08
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6gt r4 = new X.6gt
            r4.<init>(r2, r0)
            X.0wc r1 = r4.A08
            java.lang.String r0 = "ig_live_viewer_entity_tap"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = r4.A03
            java.lang.Long r1 = X.DbV.A0q(r0)
            java.lang.String r0 = "a_pk"
            r2.A9F(r0, r1)
            java.lang.String r0 = r4.A02
            long r0 = java.lang.Long.parseLong(r0)
            X.JTQ.A10(r2, r0)
            X.0iw r0 = r4.A07
            X.C51969G9p.A1A(r2, r0)
            java.lang.String r0 = r4.A04
            X.C51965G9l.A1I(r2, r0)
            java.lang.String r0 = "live_explore_button"
            X.JTO.A1Q(r2, r0)
            r2.Cgf()
            r0 = -117325992(0xfffffffff901bf58, float:-4.210545E34)
        L_0x046e:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x0472:
            r0 = 0
            goto L_0x040d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LY9.onClick(android.view.View):void");
    }

    public LY9(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A02 = obj;
        this.A01 = i;
    }
}
