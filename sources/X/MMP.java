package X;

public final class MMP extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMP(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new MMP(obj, i));
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [X.KI1, android.widget.ImageView, android.view.View, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v7, types: [X.KI1, android.widget.ImageView, android.view.View, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0383, code lost:
        return X.DbT.A0l(X.AnonymousClass7TF.A1Q((X.C51971G9r.A02(r0) > 0.0f ? 1 : (X.C51971G9r.A02(r0) == 0.0f ? 0 : -1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0093, code lost:
        r4 = X.JTP.A0b(r5);
        r4.A0M(0.0f, 1.0f);
        r4.A0U(0.0f, 1.0f, ((float) r5.getMeasuredWidth()) / 2.0f);
        r4.A0V(0.0f, 1.0f, ((float) r5.getMeasuredHeight()) / 2.0f);
        r4.A06 = new X.C65726Lyg(r6, 0);
        r4.A0H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0147, code lost:
        if (r0 != null) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0250, code lost:
        if (X.182.A06(X.0Tu.A05, r1.A00, 36317075223876374L) == false) goto L_0x0252;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x014e;
                case 1: goto L_0x0161;
                case 2: goto L_0x0171;
                case 3: goto L_0x014b;
                case 4: goto L_0x0178;
                case 5: goto L_0x017f;
                case 6: goto L_0x0186;
                case 7: goto L_0x000f;
                case 8: goto L_0x005d;
                case 9: goto L_0x0068;
                case 10: goto L_0x00be;
                case 11: goto L_0x00c8;
                case 12: goto L_0x00eb;
                case 13: goto L_0x01b9;
                case 14: goto L_0x014b;
                case 15: goto L_0x0178;
                case 16: goto L_0x017f;
                case 17: goto L_0x014b;
                case 18: goto L_0x0178;
                case 19: goto L_0x017f;
                case 20: goto L_0x01c9;
                case 21: goto L_0x01d4;
                case 22: goto L_0x0236;
                case 23: goto L_0x0258;
                case 24: goto L_0x026c;
                case 25: goto L_0x02ae;
                case 26: goto L_0x02c6;
                case 27: goto L_0x02df;
                case 28: goto L_0x02ed;
                case 29: goto L_0x0304;
                case 30: goto L_0x0319;
                case 31: goto L_0x0327;
                case 32: goto L_0x0331;
                case 33: goto L_0x033c;
                case 34: goto L_0x0346;
                case 35: goto L_0x0105;
                case 36: goto L_0x0350;
                case 37: goto L_0x0125;
                case 38: goto L_0x0005;
                case 39: goto L_0x035a;
                case 40: goto L_0x0138;
                case 41: goto L_0x0005;
                case 42: goto L_0x0367;
                case 43: goto L_0x036e;
                case 44: goto L_0x0384;
                case 45: goto L_0x039c;
                case 46: goto L_0x03a6;
                case 47: goto L_0x0143;
                case 48: goto L_0x0005;
                case 49: goto L_0x03b4;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A01
            X.0sa r0 = (X.C62320sa) r0
        L_0x0009:
            r0.invoke()
        L_0x000c:
            X.0gF r4 = X.C60340gF.A00
        L_0x000e:
            return r4
        L_0x000f:
            java.lang.Object r5 = r15.A01
            X.KI1 r5 = (X.KI1) r5
            int r0 = r5.getPaddingLeft()
            r5.A01 = r0
            int r0 = r5.getPaddingRight()
            r5.A02 = r0
            int r0 = r5.getPaddingTop()
            r5.A03 = r0
            int r0 = r5.getPaddingBottom()
            r5.A00 = r0
            r0 = 0
            r5.setPaddingRelative(r0, r0, r0, r0)
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            boolean r0 = r1 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x003f
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x003f
            int r0 = r5.A00
            r1.bottomMargin = r0
        L_0x003f:
            X.LBs r2 = r5.A04
            com.instagram.common.session.UserSession r1 = r5.A05
            r0 = 2131239382(0x7f0821d6, float:1.809507E38)
            X.6tR r2 = r2.A00(r1, r0)
            r0 = 1
            r2.A0A(r0)
            r1 = 9
            X.MMP r0 = new X.MMP
            r0.<init>(r5, r1)
            r2.A0I = r0
            r5.setImageDrawable(r2)
            X.MJs r6 = X.MJs.A00
            goto L_0x0093
        L_0x005d:
            java.lang.Object r0 = r15.A01
            X.KI1 r0 = (X.KI1) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A06
            r0 = 0
            r1.set(r0)
            goto L_0x000c
        L_0x0068:
            java.lang.Object r5 = r15.A01
            X.KI1 r5 = (X.KI1) r5
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            boolean r0 = r1 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x007b
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x007b
            r0 = 0
            r1.bottomMargin = r0
        L_0x007b:
            int r3 = r5.A01
            int r2 = r5.A03
            int r1 = r5.A02
            int r0 = r5.A00
            r5.setPaddingRelative(r3, r2, r1, r0)
            r0 = 2131239009(0x7f082061, float:1.8094313E38)
            r5.setImageResource(r0)
            r0 = 8
            X.MMP r6 = new X.MMP
            r6.<init>(r5, r0)
        L_0x0093:
            X.5nL r4 = X.JTP.A0b(r5)
            r3 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r4.A0M(r3, r2)
            int r0 = r5.getMeasuredWidth()
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r4.A0U(r3, r2, r0)
            int r0 = r5.getMeasuredHeight()
            float r0 = (float) r0
            float r0 = r0 / r1
            r4.A0V(r3, r2, r0)
            r1 = 0
            X.Lyg r0 = new X.Lyg
            r0.<init>(r6, r1)
            r4.A06 = r0
            r4.A0H()
            goto L_0x000c
        L_0x00be:
            java.lang.Object r1 = r15.A01
            X.K4g r1 = (X.C61364K4g) r1
            r0 = 0
            r1.A0M(r0)
            goto L_0x000c
        L_0x00c8:
            java.lang.Object r2 = r15.A01
            X.K4g r2 = (X.C61364K4g) r2
            r0 = 62
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.A0M(r0)
            X.Jir r0 = r2.A0B()
            r0.A03()
            X.0eM r0 = r2.A0R
            X.6i2 r1 = X.DbZ.A0O(r0)
            java.lang.String r0 = r2.A0E()
            r1.A04(r0)
            goto L_0x000c
        L_0x00eb:
            java.lang.Object r2 = r15.A01
            X.K4g r2 = (X.C61364K4g) r2
            X.Jir r0 = r2.A0B()
            r0.A03()
            X.0eM r0 = r2.A0R
            X.6i2 r1 = X.DbZ.A0O(r0)
            java.lang.String r0 = r2.A0E()
            r1.A05(r0)
            goto L_0x000c
        L_0x0105:
            java.lang.Object r0 = r15.A01
            X.Glw r0 = (X.C53310Glw) r0
            java.util.List r0 = r0.A07
            r4 = 0
            if (r0 == 0) goto L_0x000e
            java.util.Iterator r1 = r0.iterator()
        L_0x0112:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03be
            java.lang.Object r0 = r1.next()
            com.instagram.model.androidlink.AndroidLink r0 = (com.instagram.model.androidlink.AndroidLink) r0
            java.lang.String r4 = r0.CGH()
            if (r4 != 0) goto L_0x000e
            goto L_0x0112
        L_0x0125:
            java.lang.Object r4 = r15.A01
            X.HkF r4 = (X.C55595HkF) r4
            X.4Cq r3 = r4.A01
            r2 = 0
            r1 = 35
            X.MFS r0 = new X.MFS
            r0.<init>(r4, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            goto L_0x000c
        L_0x0138:
            java.lang.Object r1 = r15.A01
            X.0sP r1 = (X.0sP) r1
            X.KgO r0 = X.C62473KgO.Dismissed
            r1.invoke(r0)
            goto L_0x000c
        L_0x0143:
            java.lang.Object r0 = r15.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x000c
            goto L_0x0009
        L_0x014b:
            java.lang.Object r4 = r15.A01
            return r4
        L_0x014e:
            java.lang.Object r1 = r15.A01
            X.0lg r1 = (X.0lg) r1
            X.0wc r0 = X.AnonymousClass0kN.A02(r1)
            X.LBr r4 = new X.LBr
            r4.<init>(r0)
            java.lang.Class<X.LBr> r0 = X.C63908LBr.class
            r1.A04(r0, r4)
            return r4
        L_0x0161:
            java.lang.Object r0 = r15.A01
            X.K3Q r0 = (X.K3Q) r0
            X.0eM r0 = r0.A05
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBc r4 = new X.KBc
            r4.<init>(r0)
            return r4
        L_0x0171:
            java.lang.Object r0 = r15.A01
            X.07f r4 = X.C51971G9r.A0U(r0)
            return r4
        L_0x0178:
            java.lang.Object r0 = r15.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x017f:
            java.lang.Object r0 = r15.A01
            X.07f r4 = X.DbY.A0I(r0)
            return r4
        L_0x0186:
            java.lang.Object r1 = r15.A01
            X.K7m r1 = (X.C61437K7m) r1
            X.0eM r3 = r1.A0K
            X.0lg r0 = X.DbY.A0R(r3)
            X.0wc r2 = X.C51972G9s.A0a(r1, r0)
            android.os.Bundle r1 = r1.requireArguments()
            r0 = 43
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L_0x01ae
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.KDF r4 = new X.KDF
            r4.<init>(r2, r0, r1)
            return r4
        L_0x01ae:
            r0 = 3042(0xbe2, float:4.263E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            throw r1
        L_0x01b9:
            java.lang.Object r0 = r15.A01
            X.K4g r0 = (X.C61364K4g) r0
            X.0eM r0 = r0.A0S
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6iw r4 = new X.6iw
            r4.<init>(r0)
            return r4
        L_0x01c9:
            java.lang.Object r0 = r15.A01
            X.K4g r0 = (X.C61364K4g) r0
            X.0sa r0 = r0.A0E
            java.lang.Object r4 = r0.invoke()
            return r4
        L_0x01d4:
            java.lang.Object r1 = r15.A01
            X.K4g r1 = (X.C61364K4g) r1
            X.0eM r0 = r1.A0S
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r0)
            X.6ny r7 = r1.A0A()
            X.6nw r6 = r1.A09()
            X.JwK r5 = r1.A08()
            X.Kow r10 = r1.A0D()
            boolean r0 = r1 instanceof X.K3Q
            if (r0 == 0) goto L_0x0234
            r0 = r1
            X.K3Q r0 = (X.K3Q) r0
            java.lang.String r12 = r0.A00
        L_0x01f7:
            boolean r0 = r1 instanceof X.K3S
            if (r0 == 0) goto L_0x0212
            r0 = r1
            X.K3S r0 = (X.K3S) r0
            X.0eM r0 = r0.A0J
            java.lang.String r13 = X.DbS.A0t(r0)
        L_0x0204:
            X.L8m r8 = r1.A0Q
            boolean r14 = r1.A0O()
            java.lang.Integer r11 = r1.A0C
            X.KEc r4 = new X.KEc
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r4
        L_0x0212:
            boolean r0 = r1 instanceof X.K3O
            if (r0 == 0) goto L_0x0220
            r0 = r1
            X.K3O r0 = (X.K3O) r0
            X.0eM r0 = r0.A09
            java.lang.String r13 = X.DbS.A0t(r0)
            goto L_0x0204
        L_0x0220:
            boolean r0 = r1 instanceof X.K3N
            if (r0 != 0) goto L_0x0232
            boolean r0 = r1 instanceof X.K3R
            if (r0 == 0) goto L_0x0232
            r0 = r1
            X.K3R r0 = (X.K3R) r0
            X.0eM r0 = r0.A06
            java.lang.String r13 = X.DbS.A0t(r0)
            goto L_0x0204
        L_0x0232:
            r13 = 0
            goto L_0x0204
        L_0x0234:
            r12 = 0
            goto L_0x01f7
        L_0x0236:
            java.lang.Object r0 = r15.A01
            X.KG6 r0 = (X.KG6) r0
            X.7IJ r1 = r0.A02
            boolean r0 = r1.A00()
            if (r0 != 0) goto L_0x0252
            com.instagram.common.session.UserSession r3 = r1.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317075223876374(0x81063000001316, double:3.030402836478982E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0253
        L_0x0252:
            r0 = 0
        L_0x0253:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x0258:
            java.lang.Object r0 = r15.A01
            com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository r0 = (com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository) r0
            com.instagram.common.session.UserSession r2 = r0.A04
            int r0 = r0.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "igd_typeahead"
            com.instagram.avatars.suggestions.LexiconRecommendationProvider r4 = new com.instagram.avatars.suggestions.LexiconRecommendationProvider
            r4.<init>(r2, r1, r0)
            return r4
        L_0x026c:
            java.lang.Object r2 = r15.A01
            com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository r2 = (com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository) r2
            X.0eM r0 = r2.A07
            java.lang.Object r5 = r0.getValue()
            com.instagram.avatars.suggestions.LexiconRecommendationProvider r5 = (com.instagram.avatars.suggestions.LexiconRecommendationProvider) r5
            com.instagram.common.session.UserSession r4 = r2.A04
            X.0Tu r3 = X.0Tu.A05
            r0 = 36321984371500926(0x810aa70000277e, double:3.033507401204299E-306)
            boolean r10 = X.182.A06(r3, r4, r0)
            r0 = 36884934324978254(0x830aa70001024e, double:3.389519218600876E-306)
            java.lang.String r9 = X.182.A04(r3, r4, r0)
            r0 = 36603459348403108(0x820aa7000313a4, double:3.211513310005997E-306)
            long r7 = X.182.A01(r3, r4, r0)
            r0 = 36603459348337571(0x820aa7000213a3, double:3.211513309964551E-306)
            long r11 = X.182.A01(r3, r4, r0)
            X.LFu r6 = new X.LFu
            r6.<init>(r7, r9, r10, r11)
            X.02m r1 = r2.A03
            r0 = 0
            com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl r4 = new com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl
            r4.<init>(r6, r5, r1, r0)
            return r4
        L_0x02ae:
            java.lang.Object r4 = r15.A01
            com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository r4 = (com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository) r4
            com.instagram.common.session.UserSession r3 = r4.A05
            r0 = 20
            X.MId r2 = X.JTO.A1C(r4, r0)
            r1 = 1
            X.PgO r0 = new X.PgO
            r0.<init>(r4, r1)
            X.L7f r4 = new X.L7f
            r4.<init>(r3, r0, r2)
            return r4
        L_0x02c6:
            java.lang.Object r0 = r15.A01
            X.JdB r0 = (X.C60002JdB) r0
            android.content.Context r2 = r0.A07
            com.instagram.common.session.UserSession r0 = r0.A08
            boolean r1 = X.JTR.A1X(r0)
            r0 = 2131238286(0x7f081d8e, float:1.8092846E38)
            if (r1 == 0) goto L_0x02da
            r0 = 2131237949(0x7f081c3d, float:1.8092163E38)
        L_0x02da:
            android.graphics.drawable.Drawable r4 = r2.getDrawable(r0)
            return r4
        L_0x02df:
            java.lang.Object r0 = r15.A01
            X.JdB r0 = (X.C60002JdB) r0
            android.content.Context r1 = r0.A07
            r0 = 2131230997(0x7f080115, float:1.8078063E38)
            android.graphics.drawable.Drawable r4 = r1.getDrawable(r0)
            return r4
        L_0x02ed:
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR
            int[] r0 = X.AnonymousClass6LW.A07
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>(r1, r0)
            java.lang.Object r1 = r15.A01
            X.JdB r1 = (X.C60002JdB) r1
            r0 = 1
            r4.setShape(r0)
            float r0 = r1.A02
            r4.setCornerRadius(r0)
            return r4
        L_0x0304:
            java.lang.Object r2 = r15.A01
            X.JdB r2 = (X.C60002JdB) r2
            android.content.Context r1 = r2.A07
            r0 = 2131099779(0x7f060083, float:1.781192E38)
            int r1 = r1.getColor(r0)
            int r0 = r2.A05
            X.GVD r4 = new X.GVD
            r4.<init>(r1, r0)
            return r4
        L_0x0319:
            java.lang.Object r0 = r15.A01
            X.JdB r0 = (X.C60002JdB) r0
            android.content.Context r1 = r0.A07
            r0 = 2131230998(0x7f080116, float:1.8078065E38)
            android.graphics.drawable.Drawable r4 = r1.getDrawable(r0)
            return r4
        L_0x0327:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.9B2 r4 = new X.9B2
            r4.<init>(r0)
            return r4
        L_0x0331:
            java.lang.Object r1 = r15.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r0 = 1
            X.5fe r4 = new X.5fe
            r4.<init>(r1, r0)
            return r4
        L_0x033c:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.5fy r4 = new X.5fy
            r4.<init>(r0)
            return r4
        L_0x0346:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.FYj r4 = new X.FYj
            r4.<init>(r0)
            return r4
        L_0x0350:
            java.lang.Object r0 = r15.A01
            X.DbS.A1U(r0)
            java.lang.Boolean r4 = X.AnonymousClass7TE.A0v()
            return r4
        L_0x035a:
            java.lang.Object r0 = r15.A01
            java.lang.Object r0 = X.DbT.A0r(r0)
            java.util.List r0 = (java.util.List) r0
            java.lang.Integer r4 = X.C51968G9o.A0t(r0)
            return r4
        L_0x0367:
            java.lang.Object r0 = r15.A01
            com.instagram.barcelona.common.ui.toast.ToastDragDismissState r0 = (com.instagram.barcelona.common.ui.toast.ToastDragDismissState) r0
            X.5Oz r0 = r0.A03
            goto L_0x0374
        L_0x036e:
            java.lang.Object r0 = r15.A01
            com.instagram.barcelona.common.ui.toast.ToastDragDismissState r0 = (com.instagram.barcelona.common.ui.toast.ToastDragDismissState) r0
            X.5Oz r0 = r0.A04
        L_0x0374:
            float r1 = X.C51971G9r.A02(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            java.lang.Boolean r4 = X.DbT.A0l(r0)
            return r4
        L_0x0384:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.Object r0 = r15.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            r1.append(r0)
            r0 = 37
            java.lang.String r4 = X.C51967G9n.A0r(r1, r0)
            return r4
        L_0x039c:
            java.lang.Object r0 = r15.A01
            X.1ua r0 = (X.1ua) r0
            X.7aM r4 = new X.7aM
            r4.<init>(r0)
            return r4
        L_0x03a6:
            java.lang.Object r1 = r15.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            android.content.Context r0 = X.C51966G9m.A0P(r1)
            X.7aL r4 = new X.7aL
            r4.<init>(r0, r1)
            return r4
        L_0x03b4:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.HDm r4 = new X.HDm
            r4.<init>(r0)
            return r4
        L_0x03be:
            java.lang.String r0 = "No element of the collection was transformed to a non-null value."
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MMP.invoke():java.lang.Object");
    }
}
