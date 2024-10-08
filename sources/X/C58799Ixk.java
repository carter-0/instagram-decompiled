package X;

/* renamed from: X.Ixk  reason: case insensitive filesystem */
public final class C58799Ixk extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58799Ixk(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A06 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A03 = obj5;
        this.A02 = obj6;
    }

    /* JADX WARNING: type inference failed for: r8v5, types: [java.lang.Object, X.OIu] */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.lang.Object, X.OIu] */
    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object, X.OIu] */
    /* JADX WARNING: type inference failed for: r12v0, types: [java.lang.Object, X.OIu] */
    /* JADX WARNING: type inference failed for: r13v0, types: [java.lang.Object, X.OIu] */
    /* JADX WARNING: type inference failed for: r14v0, types: [java.lang.Object, X.OIu] */
    /* JADX WARNING: type inference failed for: r15v0, types: [java.lang.Object, X.OIu] */
    /* JADX WARNING: type inference failed for: r2v119, types: [X.2T3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v80, types: [X.2T3, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0681, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0688, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0158, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x04aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            int r2 = r0.A00
            switch(r2) {
                case 0: goto L_0x0174;
                case 1: goto L_0x01c4;
                case 2: goto L_0x0765;
                case 3: goto L_0x01f8;
                case 4: goto L_0x02f4;
                case 5: goto L_0x0341;
                case 6: goto L_0x0394;
                case 7: goto L_0x04b3;
                case 8: goto L_0x0527;
                case 9: goto L_0x058e;
                case 10: goto L_0x05b7;
                case 11: goto L_0x05eb;
                case 12: goto L_0x07a6;
                case 13: goto L_0x0614;
                case 14: goto L_0x065d;
                case 15: goto L_0x083e;
                case 16: goto L_0x0706;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.2Uo r1 = (X.C70722Uo) r1
            r10 = 0
            X.0qQ.A0B(r1, r10)
            java.lang.Object r3 = r0.A05
            X.2Wb r3 = (X.2Wb) r3
            android.app.Activity r16 = X.C51969G9p.A0J(r3)
            java.lang.Object r2 = r0.A06
            X.GFJ r2 = (X.GFJ) r2
            X.4DU r5 = r2.A0C
            com.instagram.common.session.UserSession r4 = r2.A0A
            X.2V1 r6 = r3.A00
            android.content.Context r15 = X.C243803a8.A00(r3)
            X.4bN r12 = r2.A06
            java.lang.Object r7 = r0.A03
            java.lang.Object r8 = r0.A02
            X.3mp r8 = (X.C251263mp) r8
            java.lang.Object r9 = r1.A00
            boolean r1 = r9 instanceof android.view.View
            if (r1 == 0) goto L_0x0171
            android.view.View r9 = (android.view.View) r9
        L_0x0035:
            java.lang.Object r1 = r0.A01
            X.2Wa r1 = (X.2Wa) r1
            java.lang.Object r1 = r1.A03
            X.2Wd r1 = (X.2Wd) r1
            long r1 = r1.A00
            int r3 = X.C51968G9o.A09(r3, r1)
            java.lang.Object r11 = r0.A04
            X.3mp r11 = (X.C251263mp) r11
            r0 = 1
            X.AnonymousClass7TF.A1B(r5, r0, r4)
            r0 = 5
            X.AnonymousClass7TF.A1E(r12, r0, r8)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36315133900622866(0x81046c001e0c12, double:3.029175135836382E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0156
            X.GJ5 r0 = X.GJ5.OVERLAY_AD
            if (r7 != r0) goto L_0x0156
            if (r9 == 0) goto L_0x0156
            X.3OA r7 = r12.A07()
            if (r7 == 0) goto L_0x0156
            java.lang.String r1 = "clips_overlay_ad_cta_component"
            android.view.View r0 = r9.getRootView()
            android.view.View r0 = r0.findViewWithTag(r1)
            if (r0 == 0) goto L_0x016d
            int r0 = r0.getHeight()
            double r0 = (double) r0
        L_0x0079:
            X.HQP.A02 = r0
            r13 = 0
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0156
            int r9 = r9.getHeight()
            X.2T3 r2 = new X.2T3
            r2.<init>()
            r18 = r6
            r19 = r2
            r20 = r10
            r21 = r10
            r22 = r10
            r17 = r8
            r17.A0M(r18, r19, r20, r21, r22)
            if (r11 != 0) goto L_0x015c
            r0 = 0
        L_0x009d:
            double r8 = (double) r9
            double r8 = r8 + r0
            int r0 = r2.A00
            double r0 = (double) r0
            double r8 = r8 + r0
            double r0 = (double) r3
            double r8 = r8 + r0
            int r0 = X.AnonymousClass0nB.A00(r15)
            double r2 = (double) r0
            int r6 = X.2db.A01(r16)
            int r1 = X.0Pn.A00(r16)
            int r0 = X.AnonymousClass2uJ.A00
            int r6 = r6 + r1
            int r6 = r6 + r0
            double r0 = (double) r6
            double r2 = r2 - r0
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00ca
            int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00ca
            double r11 = X.HQP.A02
            double r0 = r8 - r11
            double r8 = r8 / r2
            X.HQP.A00 = r8
            double r0 = r0 / r2
            X.HQP.A01 = r0
        L_0x00ca:
            double r11 = X.HQP.A00
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0156
            double r8 = X.HQP.A01
            int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0156
            X.1Xj r6 = r7.A0K
            X.0wc r1 = X.C51967G9n.A0Z(r5, r4, r6, r10)
            java.lang.String r0 = "instagram_ads_host_media_rendered"
            X.3sc r3 = X.C254513sb.A03(r4, r6, r5, r0)
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            r0 = 283(0x11b, float:3.97E-43)
            X.1Ln r2 = X.C51965G9l.A0U(r1, r0)
            X.0jB r3 = r3.A01()
            android.content.Context r0 = X.C51966G9m.A0P(r4)
            java.lang.String r1 = X.C61120lW.A04(r0)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x0156
            X.C51976G9y.A0c(r2, r5, r3, r1)
            com.instagram.user.model.User r0 = r6.A2A(r4)
            java.lang.String r1 = X.C51968G9o.A15(r0)
            java.lang.String r0 = "a_pk"
            r2.A0R(r0, r1)
            java.lang.String r0 = X.C231122qu.A07(r4, r6)
            if (r0 == 0) goto L_0x0159
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x0159
            long r0 = r0.longValue()
        L_0x011e:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "ad_id"
            r2.A0Q(r0, r1)
            java.lang.String r0 = X.C294185m0.A09(r6)
            r2.A0m(r0)
            java.lang.Long r1 = X.C51972G9s.A0g(r6)
            java.lang.String r0 = "m_t"
            r2.A0Q(r0, r1)
            X.C51976G9y.A0a(r2, r3, r4, r6, r5)
            java.lang.String r1 = r7.A0f
            java.lang.String r0 = "host_media_pk"
            r2.A0R(r0, r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r11)
            java.lang.String r0 = "reels_metadata_top_position_percentage"
            r2.A0P(r0, r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r8)
            java.lang.String r0 = "reels_metadata_top_position_percentage_without_oa"
            r2.A0P(r0, r1)
            r2.Cgf()
        L_0x0156:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0159:
            r0 = 0
            goto L_0x011e
        L_0x015c:
            X.2T3 r0 = new X.2T3
            r0.<init>()
            r17 = r11
            r19 = r0
            r17.A0M(r18, r19, r20, r21, r22)
            int r0 = r0.A00
            double r0 = (double) r0
            goto L_0x009d
        L_0x016d:
            r0 = 0
            goto L_0x0079
        L_0x0171:
            r9 = 0
            goto L_0x0035
        L_0x0174:
            X.N4A r1 = (X.N4A) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A01
            X.0sP r2 = (X.0sP) r2
            boolean r2 = X.C51971G9r.A1a(r1, r2)
            if (r2 == 0) goto L_0x01a0
            java.lang.Object r7 = r0.A03
            X.0r1 r7 = (X.0r1) r7
            java.lang.Object r6 = r0.A06
            X.0rm r6 = (X.0rm) r6
            java.lang.Object r5 = r0.A05
            X.0rm r5 = (X.0rm) r5
            java.lang.Object r4 = r0.A02
            X.0sP r4 = (X.0sP) r4
            java.lang.Object r3 = r0.A04
            X.PeW r3 = (X.C73540PeW) r3
            X.NCB r2 = new X.NCB
            r2.<init>(r3)
            X.OOX.A01(r2, r4, r7, r6, r5)
        L_0x01a0:
            java.lang.Class<com.facebook.rsys.state.gen.State> r2 = com.facebook.rsys.state.gen.State.class
            java.lang.Object r1 = r1.A00(r2)
            com.facebook.rsys.state.gen.State r1 = (com.facebook.rsys.state.gen.State) r1
            if (r1 == 0) goto L_0x0156
            int r1 = r1.callState
            if (r1 != 0) goto L_0x0156
            java.lang.Object r4 = r0.A03
            X.0r1 r4 = (X.0r1) r4
            java.lang.Object r3 = r0.A06
            X.0rm r3 = (X.0rm) r3
            java.lang.Object r2 = r0.A05
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r1 = r0.A02
            X.0sP r1 = (X.0sP) r1
            X.Gy2 r0 = X.C54020Gy2.A00
            X.OOX.A01(r0, r1, r4, r3, r2)
            goto L_0x0156
        L_0x01c4:
            X.SUj r1 = (X.SUj) r1
            java.lang.Object r6 = r0.A06
            X.Stb r6 = (X.Stb) r6
            java.lang.Object r5 = r0.A04
            X.SJ1 r5 = (X.SJ1) r5
            java.lang.Object r2 = r0.A02
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r4 = r2.A00
            java.lang.String r4 = (java.lang.String) r4
            X.Ola r2 = X.C71485Ola.A00
            X.SUj r3 = X.SUj.A03(r2, r1)
            java.lang.Object r2 = r0.A03
            boolean r2 = X.AnonymousClass7TF.A1V(r2)
            r6.A05(r5, r3, r4, r2)
            boolean r1 = X.SUj.A0T(r1)
            if (r1 != 0) goto L_0x0156
            java.lang.Object r1 = r0.A05
            X.2gB r1 = (X.AnonymousClass2gB) r1
            java.lang.Object r0 = r0.A01
            X.2Fk r0 = (X.2Fk) r0
            r1.A0D(r0)
            goto L_0x0156
        L_0x01f8:
            X.GmM r1 = (X.C53336GmM) r1
            java.lang.Object r6 = r0.A05
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r6 = (com.instagram.common.ui.widget.imageview.RoundedCornerImageView) r6
            java.lang.Object r4 = r0.A03
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Object r2 = r0.A02
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.Object r3 = r0.A01
            com.instagram.business.ui.BusinessNavBar r3 = (com.instagram.business.ui.BusinessNavBar) r3
            java.lang.Object r9 = r0.A04
            com.instagram.ui.widget.spinner.SpinnerImageView r9 = (com.instagram.ui.widget.spinner.SpinnerImageView) r9
            boolean r8 = r1.A01
            r7 = 8
            int r5 = X.DbW.A00(r8)
            r6.setVisibility(r5)
            int r5 = X.DbW.A00(r8)
            r4.setVisibility(r5)
            int r5 = X.DbW.A00(r8)
            r2.setVisibility(r5)
            if (r8 != 0) goto L_0x022a
            r7 = 0
        L_0x022a:
            r3.setVisibility(r7)
            if (r8 == 0) goto L_0x0244
            X.3uy r5 = X.C255943uy.LOADING
        L_0x0231:
            r9.setLoadingStatus(r5)
            X.QP7 r7 = r1.A00
            if (r7 == 0) goto L_0x0156
            java.lang.Object r5 = r0.A06
            X.UaB r5 = (X.C15304UaB) r5
            X.2da r1 = r5.A00
            if (r1 != 0) goto L_0x0247
            java.lang.String r1 = "configurer"
            goto L_0x0681
        L_0x0244:
            X.3uy r5 = X.C255943uy.SUCCESS
            goto L_0x0231
        L_0x0247:
            java.lang.String r0 = r7.A06
            r1.setTitle(r0)
            java.lang.String r0 = r7.A07
            com.instagram.common.typedurl.SimpleImageUrl r8 = X.DbS.A0V(r0)
            java.lang.Object r1 = r7.A01
            com.instagram.business.promote.model.InstagramMediaProductType r0 = com.instagram.business.promote.model.InstagramMediaProductType.STORY
            if (r1 != r0) goto L_0x026a
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            X.0qQ.A07(r1)
            int r0 = r1.height
            int r0 = r0 * 9
            int r0 = r0 / 16
            r1.width = r0
            r6.setLayoutParams(r1)
        L_0x026a:
            X.3MJ r0 = X.AnonymousClass3MJ.CENTER_CROP
            r6.setBitmapShaderScaleType(r0)
            r6.setUrl(r8, r5)
            r9 = 0
            r6.setVisibility(r9)
            java.lang.String r0 = r7.A05
            r4.setText(r0)
            java.lang.String r0 = r7.A04
            r2.setText(r0)
            java.lang.Object r8 = r7.A02
            com.instagram.business.promote.model.PromoteButtonAction r8 = (com.instagram.business.promote.model.PromoteButtonAction) r8
            java.lang.String r0 = r8.A01
            if (r0 == 0) goto L_0x02f0
            r3.setPrimaryButtonText((java.lang.CharSequence) r0)
            r6 = 1
            android.view.View r0 = r3.A01
            r0.setVisibility(r9)
            java.lang.String r0 = r5.A03
            java.lang.String r1 = "adAccountId"
            if (r0 == 0) goto L_0x0681
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x02e8
            r3.setPrimaryButtonEnabled(r6)
            X.0rm r4 = X.C51965G9l.A11()
            java.lang.String r0 = r8.A02
            if (r0 == 0) goto L_0x02ec
            r4.A00 = r0
            java.lang.String r2 = r5.A03
            if (r2 == 0) goto L_0x0681
            java.lang.String r1 = "%2C+%22paymentAccountID%22%3A+%22{{ad_account_id}}%22%7D"
            java.lang.String r0 = "{{ad_account_id}}"
            java.lang.String r2 = X.00p.A0g(r1, r0, r2, r9)
            java.lang.Object r1 = r4.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "%7D"
            java.lang.String r0 = X.00p.A0g(r1, r0, r2, r9)
            r4.A00 = r0
            X.Ojy r0 = new X.Ojy
            r0.<init>(r6, r8, r5, r4)
            r3.setPrimaryButtonOnclickListeners(r0)
        L_0x02ca:
            java.lang.Object r2 = r7.A03
            com.instagram.business.promote.model.PromoteButtonAction r2 = (com.instagram.business.promote.model.PromoteButtonAction) r2
            if (r2 == 0) goto L_0x0156
            java.lang.String r0 = r2.A01
            if (r0 == 0) goto L_0x02f0
            r3.setSecondaryButtonText((java.lang.CharSequence) r0)
            r3.setSecondaryButtonEnabled(r6)
            r3.A02(r6)
            r1 = 7
            X.Ok4 r0 = new X.Ok4
            r0.<init>(r1, r2, r5)
            r3.setSecondaryButtonOnclickListeners(r0)
            goto L_0x0156
        L_0x02e8:
            r3.setPrimaryButtonEnabled(r9)
            goto L_0x02ca
        L_0x02ec:
            java.lang.String r1 = "link"
            goto L_0x0681
        L_0x02f0:
            java.lang.String r1 = "displayText"
            goto L_0x0681
        L_0x02f4:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r6 = 0
            X.0qQ.A0B(r1, r6)
            java.lang.Object r4 = r0.A02
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r2 = r0.A04
            android.view.View r2 = (android.view.View) r2
            android.content.res.Resources r3 = X.DbU.A05(r2)
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>(r3, r1)
            r4.setBackground(r2)
            r4.setVisibility(r6)
            java.lang.Object r1 = r0.A03
            X.80G r1 = (X.AnonymousClass80G) r1
            android.view.View r2 = r1.A05()
            r1 = 4
            r2.setVisibility(r1)
            java.lang.Object r5 = r0.A06
            X.8Lz r5 = (X.C354428Lz) r5
            r5.A04 = r6
            java.lang.Integer r1 = X.C51967G9n.A0j()
            r5.A03 = r1
            java.lang.Object r4 = r0.A01
            X.8Kz r4 = (X.C354188Kz) r4
            java.lang.Object r0 = r0.A05
            X.9Hy r0 = (X.C376429Hy) r0
            float r3 = r0.A03
            float r2 = r0.A02
            float r1 = r0.A00
            float r0 = r0.A01
            r4.A09(r3, r2, r1, r0)
            r0 = 1
            r5.A04 = r0
            goto L_0x0156
        L_0x0341:
            X.6Gb r5 = X.C51968G9o.A0L(r1)
            java.lang.Object r11 = r0.A01
            X.Gmk r11 = (X.C53360Gmk) r11
            java.lang.Object r1 = r11.A01
            boolean r1 = X.G9w.A1b(r1)
            r4 = 0
            if (r1 == 0) goto L_0x0364
            r1 = 1387913571(0x52b9e163, float:3.99175156E11)
            java.lang.Object r9 = r0.A06
            java.lang.Object r8 = r0.A03
            java.lang.Object r10 = r0.A04
            r7 = 7
            X.JJT r6 = new X.JJT
            r6.<init>(r7, r8, r9, r10, r11)
            X.C51967G9n.A11(r5, r6, r4, r1)
        L_0x0364:
            java.lang.Object r1 = r11.A03
            boolean r1 = X.G9w.A1b(r1)
            if (r1 == 0) goto L_0x037b
            r6 = 1221952652(0x48d5848c, float:437284.38)
            java.lang.Object r3 = r0.A02
            r2 = 37
            X.JJU r1 = new X.JJU
            r1.<init>(r2, r11, r3)
            X.C51967G9n.A11(r5, r1, r4, r6)
        L_0x037b:
            java.lang.Object r1 = r11.A02
            boolean r1 = X.G9w.A1b(r1)
            if (r1 == 0) goto L_0x0156
            r3 = 1994994603(0x76e933ab, float:2.3649475E33)
            java.lang.Object r2 = r0.A05
            r1 = 39
            X.JJU r0 = new X.JJU
            r0.<init>(r1, r11, r2)
            X.C51967G9n.A11(r5, r0, r4, r3)
            goto L_0x0156
        L_0x0394:
            X.6Gb r1 = (X.C305006Gb) r1
            r13 = 0
            X.0qQ.A0B(r1, r13)
            java.lang.Object r5 = r0.A03
            java.lang.Object r2 = r0.A04
            java.lang.Object r12 = r0.A05
            X.5Oz r12 = (X.C284945Oz) r12
            r14 = 12
            X.JGn r3 = new X.JGn
            r3.<init>(r14, r2, r12, r5)
            r2 = 968699663(0x39bd2f0f, float:3.608395E-4)
            r9 = 1
            X.5PJ r3 = X.AnonymousClass5PI.A04(r3, r2, r9)
            java.lang.String r2 = "search_bar_key"
            r1.Cf4(r2, r3)
            java.lang.String r2 = X.C51966G9m.A1A(r12)
            int r2 = r2.length()
            boolean r2 = X.AnonymousClass7TF.A1R(r2)
            r11 = 5
            r10 = 2
            java.lang.Object r8 = r0.A06
            X.GnX r8 = (X.C53400GnX) r8
            if (r2 == 0) goto L_0x0470
            java.lang.Object r2 = r8.A00
            X.HLa r2 = (X.C54617HLa) r2
            int r2 = r2.ordinal()
            if (r2 == r13) goto L_0x0468
            if (r2 == r10) goto L_0x0454
            if (r2 != r9) goto L_0x0400
            java.lang.Object r5 = r8.A01
            java.util.List r5 = (java.util.List) r5
            X.0sP r14 = X.I5W.A01
            java.lang.Object r4 = r0.A01
            X.0sP r4 = (X.0sP) r4
            X.J2X r3 = X.J2X.A00
            int r7 = r5.size()
            r2 = 45
            X.J6k r6 = new X.J6k
            r6.<init>((int) r2, (java.util.List) r5, (X.0sP) r14)
            r2 = 46
            X.J6k r15 = new X.J6k
            r15.<init>((int) r2, (java.util.List) r5, (X.0sP) r3)
            r3 = 11
            X.GaB r2 = new X.GaB
            r2.<init>((int) r3, (java.util.List) r5, (X.0sP) r4)
        L_0x03fd:
            X.C51967G9n.A12(r1, r2, r6, r15, r7)
        L_0x0400:
            java.lang.Object r7 = r8.A03
            java.util.List r7 = (java.util.List) r7
            boolean r2 = X.AnonymousClass7TE.A1b(r7)
            if (r2 != 0) goto L_0x0410
            java.lang.Object r3 = r8.A04
            X.HLa r2 = X.C54617HLa.SUCCESS
            if (r3 == r2) goto L_0x0420
        L_0x0410:
            r3 = 1190612093(0x46f74c7d, float:31654.244)
            X.JJR r2 = X.JJR.A00(r12, r11)
            X.5PJ r3 = X.AnonymousClass5PI.A04(r2, r3, r9)
            java.lang.String r2 = "suggested_section_header"
            r1.Cf4(r2, r3)
        L_0x0420:
            java.lang.Object r2 = r8.A04
            X.HLa r2 = (X.C54617HLa) r2
            int r2 = r2.ordinal()
            if (r2 == r13) goto L_0x04aa
            if (r2 == r10) goto L_0x0495
            if (r2 != r9) goto L_0x0156
            X.0sP r3 = X.I5W.A00
            java.lang.Object r6 = r0.A01
            X.0sP r6 = (X.0sP) r6
            X.J2Z r2 = X.J2Z.A00
            int r5 = r7.size()
            r0 = 43
            X.J6k r4 = new X.J6k
            r4.<init>((int) r0, (java.util.List) r7, (X.0sP) r3)
            r0 = 44
            X.J6k r3 = new X.J6k
            r3.<init>((int) r0, (java.util.List) r7, (X.0sP) r2)
            r2 = 10
            X.GaB r0 = new X.GaB
            r0.<init>((int) r2, (java.util.List) r7, (X.0sP) r6)
            X.C51967G9n.A12(r1, r0, r4, r3, r5)
            goto L_0x0156
        L_0x0454:
            r4 = 1796398867(0x6b12df13, float:1.775566E26)
            r3 = 41
            X.JJU r2 = new X.JJU
            r2.<init>(r3, r5, r12)
            X.5PJ r3 = X.AnonymousClass5PI.A04(r2, r4, r9)
            java.lang.String r2 = "search_retry"
            r1.Cf4(r2, r3)
            goto L_0x0400
        L_0x0468:
            X.0sP r3 = X.I5W.A02
            X.0sJ r2 = X.C55392Hgy.A00
            r1.CfB(r3, r2, r11)
            goto L_0x0400
        L_0x0470:
            java.lang.Object r5 = r8.A02
            java.util.List r5 = (java.util.List) r5
            X.0sP r15 = X.I5W.A00
            java.lang.Object r4 = r0.A01
            X.0sP r4 = (X.0sP) r4
            X.J2Y r3 = X.J2Y.A00
            int r7 = r5.size()
            r2 = 47
            X.J6k r6 = new X.J6k
            r6.<init>((int) r2, (java.util.List) r5, (X.0sP) r15)
            r2 = 48
            X.J6k r15 = new X.J6k
            r15.<init>((int) r2, (java.util.List) r5, (X.0sP) r3)
            X.GaB r2 = new X.GaB
            r2.<init>((int) r14, (java.util.List) r5, (X.0sP) r4)
            goto L_0x03fd
        L_0x0495:
            r3 = -367942322(0xffffffffea11a54e, float:-4.401872E25)
            java.lang.Object r2 = r0.A02
            r0 = 6
            X.JJR r0 = X.JJR.A00(r2, r0)
            X.5PJ r2 = X.AnonymousClass5PI.A04(r0, r3, r9)
            java.lang.String r0 = "suggested_retry"
            r1.Cf4(r0, r2)
            goto L_0x0156
        L_0x04aa:
            X.0sP r2 = X.I5W.A03
            X.0sJ r0 = X.C55392Hgy.A01
            r1.CfB(r2, r0, r11)
            goto L_0x0156
        L_0x04b3:
            X.6Gb r1 = (X.C305006Gb) r1
            r10 = 0
            X.0qQ.A0B(r1, r10)
            java.lang.Object r9 = r0.A06
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r8 = r0.A05
            X.0sP r8 = (X.0sP) r8
            java.lang.Object r7 = r0.A03
            X.0sP r7 = (X.0sP) r7
            java.lang.Object r6 = r0.A02
            java.lang.Object r2 = r0.A04
            java.lang.Object r5 = r0.A01
            X.HLa r5 = (X.C54617HLa) r5
            X.0sK r0 = X.C55413HhJ.A00
            r3 = 0
            r4 = 1
            r1.Cf4(r3, r0)
            r0 = 7
            X.JJR r2 = X.JJR.A00(r2, r0)
            r0 = 22436526(0x1565aae, float:3.9370652E-38)
            X.C51967G9n.A10(r1, r2, r0)
            r0 = 8
            X.JJR r2 = X.JJR.A00(r6, r0)
            r0 = 265973389(0xfda6e8d, float:2.1539042E-29)
            X.C51967G9n.A10(r1, r2, r0)
            X.0sK r0 = X.C55413HhJ.A01
            r1.Cf4(r3, r0)
            int r0 = r5.ordinal()
            if (r0 == r10) goto L_0x0520
            r6 = 2
            if (r0 == r6) goto L_0x0519
            if (r0 != r4) goto L_0x08bd
            X.J2e r2 = X.C58993J2e.A00
            X.J2d r5 = X.C58992J2d.A00
            int r4 = r9.size()
            r0 = 49
            X.J6k r3 = new X.J6k
            r3.<init>((int) r0, (java.util.List) r9, (X.0sP) r2)
            X.PqX r2 = new X.PqX
            r2.<init>((int) r10, (java.util.List) r9, (X.0sP) r5)
            X.JK1 r0 = new X.JK1
            r0.<init>((java.util.List) r9, (X.0sP) r8, (X.0sP) r7, (int) r6)
            X.C51967G9n.A12(r1, r0, r3, r2, r4)
            goto L_0x0156
        L_0x0519:
            X.0sK r0 = X.C55413HhJ.A03
            r1.Cf4(r3, r0)
            goto L_0x0156
        L_0x0520:
            X.0sK r0 = X.C55413HhJ.A02
            r1.Cf4(r3, r0)
            goto L_0x0156
        L_0x0527:
            X.6Gb r5 = X.C51968G9o.A0L(r1)
            java.lang.Object r6 = r0.A06
            X.GnP r6 = (X.C53392GnP) r6
            boolean r1 = r6.A0C
            r7 = 0
            if (r1 == 0) goto L_0x0539
            X.0sK r1 = X.C55394Hh0.A00
            r5.Cf4(r7, r1)
        L_0x0539:
            X.0sK r1 = X.C55394Hh0.A01
            r5.Cf4(r7, r1)
            boolean r1 = r6.A0A
            if (r1 == 0) goto L_0x0551
            r4 = 767751703(0x2dc2f617, float:2.2164532E-11)
            java.lang.Object r3 = r0.A04
            r2 = 45
            X.JJU r1 = new X.JJU
            r1.<init>(r2, r3, r6)
            X.C51967G9n.A11(r5, r1, r7, r4)
        L_0x0551:
            r4 = -1904205316(0xffffffff8e8021fc, float:-3.1587162E-30)
            java.lang.Object r3 = r0.A05
            r2 = 46
            X.JJU r1 = new X.JJU
            r1.<init>(r2, r3, r6)
            X.C51967G9n.A11(r5, r1, r7, r4)
            r4 = -685925699(0xffffffffd71d9abd, float:-1.73287921E14)
            java.lang.Object r3 = r0.A02
            r2 = 47
            X.JJU r1 = new X.JJU
            r1.<init>(r2, r3, r6)
            X.C51967G9n.A11(r5, r1, r7, r4)
            r4 = 532353918(0x1fbb137e, float:7.922983E-20)
            java.lang.Object r3 = r0.A01
            java.lang.Object r2 = r0.A03
            r1 = 14
            X.JGn r0 = new X.JGn
            r0.<init>(r1, r2, r6, r3)
            X.C51967G9n.A11(r5, r0, r7, r4)
            X.HLa r2 = r6.A03
            if (r2 == 0) goto L_0x0156
            X.Gq1 r1 = r6.A01
            r0 = 2131957005(0x7f13150d, float:1.9550582E38)
            X.HZ8.A00(r5, r1, r2, r0)
            goto L_0x0156
        L_0x058e:
            boolean r7 = X.AnonymousClass7TE.A1a(r1)
            java.lang.Object r1 = r0.A06
            X.MoE r1 = (X.C67459MoE) r1
            X.0eM r1 = r1.A04
            java.lang.Object r1 = r1.getValue()
            X.ONk r1 = (X.C70838ONk) r1
            java.lang.Object r2 = r0.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.Object r3 = r0.A05
            X.Pso r3 = (X.C74312Pso) r3
            java.lang.Object r6 = r0.A03
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r4 = r0.A04
            X.Niv r4 = (X.C69295Niv) r4
            java.lang.Object r5 = r0.A02
            X.Niv r5 = (X.C69295Niv) r5
            r1.A01(r2, r3, r4, r5, r6, r7)
            goto L_0x0156
        L_0x05b7:
            X.JP8 r1 = (X.JP8) r1
            r4 = 0
            X.0qQ.A0B(r1, r4)
            java.lang.Object r9 = r0.A05
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r8 = r0.A01
            java.lang.Object r5 = r0.A02
            java.lang.Object r6 = r0.A03
            java.lang.Object r7 = r0.A04
            java.lang.Object r10 = r0.A06
            int r11 = r9.size()
            r0 = 20
            X.PmE r2 = new X.PmE
            r2.<init>(r9, r0)
            X.GaF r3 = new X.GaF
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0 = 1229287273(0x49456f69, float:808694.56)
            X.5PJ r10 = X.AnonymousClass5PI.A03(r3, r0)
            r7 = 0
            r8 = r2
            r9 = r7
            r6 = r1
            r6.CfC(r7, r8, r9, r10, r11)
            goto L_0x0156
        L_0x05eb:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Object r7 = r0.A01
            X.Npq r7 = (X.C69668Npq) r7
            java.lang.Object r4 = r0.A05
            X.3sy r4 = (X.C254743sy) r4
            java.lang.Object r3 = r0.A03
            X.0sL r3 = (X.0sL) r3
            java.lang.Object r2 = r0.A04
            X.0sa r2 = (X.C62320sa) r2
            java.lang.Object r6 = r0.A06
            X.PA3 r6 = (X.PA3) r6
            java.lang.Object r0 = r0.A02
            X.0sP r0 = (X.0sP) r0
            X.Pc5 r5 = new X.Pc5
            r11 = r0
            r12 = r3
            r10 = r2
            r8 = r4
            r9 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.11Z.A02(r5)
            goto L_0x0156
        L_0x0614:
            java.lang.Object r1 = r0.A06
            X.PPx r1 = (X.C72939PPx) r1
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0O
            boolean r1 = r1.get()
            if (r1 != 0) goto L_0x0156
            java.lang.Object r5 = r0.A05
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r1 = r0.A01
            X.1aU r4 = X.1aU.A09(r1)
            java.lang.Object r3 = r0.A02
            X.68G r3 = (X.AnonymousClass68G) r3
            java.lang.Object r2 = r0.A04
            java.util.Map r2 = (java.util.Map) r2
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r2)
            java.lang.String r2 = r1.toString()
            r1 = 248(0xf8, float:3.48E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            X.6AO r2 = X.AnonymousClass6AN.A00(r4, r5, r3, r2, r1)
            r1 = 0
            X.1a8 r4 = new X.1a8
            r4.<init>(r1)
            X.1aU r3 = r2.A00()
            java.lang.Object r2 = r0.A03
            r1 = 17
            X.PU9 r0 = new X.PU9
            r0.<init>(r1, r4, r2)
            r4.A02(r3, r0)
            goto L_0x0156
        L_0x065d:
            java.lang.Object r2 = r0.A03
            X.0r1 r2 = (X.0r1) r2
            boolean r1 = r2.A00
            if (r1 != 0) goto L_0x0156
            r1 = 1
            r2.A00 = r1
            java.lang.Object r2 = r0.A02
            X.Vit r2 = (X.C17960Vit) r2
            java.lang.Object r1 = r0.A04
            X.N3A r1 = (X.N3A) r1
            X.QP5 r1 = r1.A02
            java.lang.String r4 = r1.A01
            r1 = 0
            X.0qQ.A0B(r4, r1)
            X.UZq r6 = r2.A00
            X.Hop r3 = r6.A0C
            r7 = 0
            if (r3 != 0) goto L_0x0689
            java.lang.String r1 = "serpMetaAiHcmLogger"
        L_0x0681:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0689:
            X.0wc r2 = r3.A01
            java.lang.String r1 = "ig_search_meta_ai_hcm_thumbs_up_tap"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x06a6
            X.0iw r1 = r3.A00
            X.C51969G9p.A1A(r2, r1)
            java.lang.String r1 = X.DbY.A0a()
            X.C51976G9y.A0Y(r2, r3, r1)
            r2.Cgf()
        L_0x06a6:
            java.lang.String r1 = "bot_response_id"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r4)
            java.lang.String r2 = "entry_point"
            java.lang.String r1 = "4"
            java.util.HashMap r5 = X.Dbb.A0e(r2, r1, r3)
            r2 = 3
            X.Wxc r1 = new X.Wxc
            r1.<init>(r6, r2)
            X.Q3B r4 = new X.Q3B
            r4.<init>(r1)
            com.instagram.common.session.UserSession r2 = r6.A04()
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            X.2nI r3 = X.C229382nI.A00(r1, r6, r6, r2, r7)
            r1 = 722(0x2d2, float:1.012E-42)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            X.FBO r2 = new X.FBO
            r2.<init>(r1)
            r2.A04 = r5
            r2.A01 = r4
            android.content.Context r1 = r6.requireContext()
            r2.A01(r1, r3)
            java.lang.Object r3 = r0.A05
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            r1 = 2131238912(0x7f082000, float:1.8094116E38)
            X.DbU.A13(r2, r3, r1)
            java.lang.Object r1 = r0.A06
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131238913(0x7f082001, float:1.8094118E38)
            X.DbU.A13(r2, r1, r0)
            r0 = 2130970224(0x7f040670, float:1.7549152E38)
            int r0 = X.AnonymousClass7TF.A03(r2, r0)
            r1.setColorFilter(r0)
            goto L_0x0156
        L_0x0706:
            X.Gln r1 = (X.C53301Gln) r1
            r3 = 0
            X.0qQ.A0B(r1, r3)
            java.lang.Object r2 = r0.A06
            X.DlJ r2 = (X.C46789DlJ) r2
            r2.A07(r3)
            r2 = 3
            java.lang.Integer[] r2 = X.AnonymousClass05K.A00(r2)
            int r1 = r1.A00
            r1 = r2[r1]
            int r2 = r1.intValue()
            java.lang.String r5 = "opal_compose_modal"
            if (r2 == r3) goto L_0x0755
            r1 = 1
            if (r2 == r1) goto L_0x0745
            r1 = 2
            if (r2 != r1) goto L_0x08c2
            java.lang.Object r1 = r0.A04
            X.DbS.A1U(r1)
            java.lang.Object r2 = r0.A05
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A01
            X.0iw r1 = (X.AnonymousClass0iw) r1
            java.lang.String r4 = "create_story_button"
        L_0x0739:
            X.62O r0 = X.I7S.A00
            java.lang.String r6 = r2.A06
            java.lang.String r3 = "tap"
            r7 = 0
            X.C49049EoT.A00(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0156
        L_0x0745:
            java.lang.Object r1 = r0.A02
            X.DbS.A1U(r1)
            java.lang.Object r2 = r0.A05
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A01
            X.0iw r1 = (X.AnonymousClass0iw) r1
            java.lang.String r4 = "create_reel_button"
            goto L_0x0739
        L_0x0755:
            java.lang.Object r1 = r0.A03
            X.DbS.A1U(r1)
            java.lang.Object r2 = r0.A05
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A01
            X.0iw r1 = (X.AnonymousClass0iw) r1
            java.lang.String r4 = "create_post_button"
            goto L_0x0739
        L_0x0765:
            java.lang.Object r4 = r0.A06
            X.0lg r4 = (X.0lg) r4
            X.0Tu r3 = X.0Tu.A05
            r1 = 36327589303826980(0x810fc000003a24, double:3.037051982976547E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x079e
            r1 = 0
            X.0qQ.A0B(r4, r1)
            X.IpU r2 = X.C58287IpU.A00
            java.lang.Class<X.HVg> r1 = X.C54849HVg.class
            r4.A01(r1, r2)
            java.lang.Object r7 = r0.A01
            android.app.Activity r7 = (android.app.Activity) r7
            r1 = 13
            X.C2594141p.A00(r7, r1)
            java.lang.Object r1 = r0.A04
            X.5Oz r1 = (X.C284945Oz) r1
            java.lang.Object r9 = r0.A02
            java.lang.Object r8 = r0.A05
            java.lang.Object r10 = r0.A03
            r6 = 15
            X.IoC r5 = new X.IoC
            r5.<init>(r6, r7, r8, r9, r10)
            r1.Epw(r5)
        L_0x079e:
            r0 = 12
            X.GP2 r3 = new X.GP2
            r3.<init>(r4, r0)
            return r3
        L_0x07a6:
            r8 = 0
            X.0qQ.A0B(r1, r8)
            java.lang.Object r6 = r0.A01
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r5 = r0.A06
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r4 = r0.A04
            X.9HC r4 = (X.AnonymousClass9HC) r4
            java.lang.Object r3 = r0.A05
            X.7UL r3 = (X.AnonymousClass7UL) r3
            java.lang.Object r2 = r0.A03
            X.7Me r2 = (X.C330287Me) r2
            java.lang.Object r7 = r0.A02
            X.7Sj r7 = (X.C331787Sj) r7
            X.0qQ.A0B(r6, r8)
            X.C51974G9v.A1L(r5, r4, r3)
            r0 = 5
            X.0qQ.A0B(r2, r0)
            r10 = 6
            X.0qQ.A0B(r7, r10)
            java.lang.String r0 = "ThreadViewReduxStore"
            X.MYg r8 = X.MYc.A01(r5, r0)
            java.lang.String r0 = "thread_view_redux_store"
            X.4fh r0 = X.AnonymousClass6F9.A00(r0)
            X.1aU r9 = r8.A00
            X.Ov1 r8 = new X.Ov1
            r8.<init>(r10, r1, r5)
            X.1aU r1 = r9.A0L(r8)
            X.NbI r8 = new X.NbI
            r8.<init>()
            X.NbO r9 = new X.NbO
            r9.<init>(r5)
            X.NbJ r10 = new X.NbJ
            r10.<init>()
            X.NbK r11 = new X.NbK
            r11.<init>()
            X.NbH r12 = new X.NbH
            r12.<init>()
            X.NbG r13 = new X.NbG
            r13.<init>()
            X.NbL r14 = new X.NbL
            r14.<init>()
            X.NbM r15 = new X.NbM
            r15.<init>()
            X.OIu[] r8 = new X.C70737OIu[]{r8, r9, r10, r11, r12, r13, r14, r15}
            java.util.List r11 = X.0sr.A1P(r8)
            X.Nb8 r10 = new X.Nb8
            r10.<init>(r6, r5, r3, r4)
            X.Nb7 r9 = new X.Nb7
            r9.<init>(r6, r5, r3, r4)
            X.Nb4 r8 = new X.Nb4
            r8.<init>(r5)
            X.Nb5 r6 = new X.Nb5
            r6.<init>(r5, r4)
            X.Nb6 r3 = new X.Nb6
            r3.<init>(r5, r7, r2)
            X.Npo[] r2 = new X.C69666Npo[]{r10, r9, r8, r6, r3}
            java.util.List r2 = X.0sr.A1P(r2)
            X.Mjr r3 = new X.Mjr
            r3.<init>(r1, r0, r11, r2)
            return r3
        L_0x083e:
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            r4 = 0
            X.0qQ.A0B(r1, r4)
            int r2 = r1.getAction()
            r7 = 1
            if (r2 == 0) goto L_0x08b1
            if (r2 == r7) goto L_0x085e
            r1 = 3
            if (r2 != r1) goto L_0x0859
            java.lang.Object r1 = r0.A04
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            int[] r0 = new int[r4]
        L_0x0856:
            r1.setState(r0)
        L_0x0859:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            return r3
        L_0x085e:
            java.lang.Object r9 = r0.A06
            X.GuK r9 = (X.C53791GuK) r9
            java.lang.Object r3 = r0.A04
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            int[] r2 = new int[r4]
            r3.setState(r2)
            int[] r2 = new int[r4]
            r3.setState(r2)
            java.lang.Object r8 = r0.A01
            X.3yx r8 = (X.C258403yx) r8
            java.lang.Object r6 = r0.A03
            X.1Xj r6 = (X.1Xj) r6
            X.0qQ.A0B(r6, r7)
            X.IrS r2 = X.C58409IrS.A00
            r8.A01(r2)
            X.02m r5 = r8.A00
            if (r5 == 0) goto L_0x0895
            r4 = 1056313521(0x3ef610b1, float:0.4805961)
            r5.markerStart(r4)
            java.lang.String r3 = "LITHO"
            r2 = 417(0x1a1, float:5.84E-43)
            java.lang.String r2 = X.C273654mx.A00(r2)
            r5.markerAnnotate(r4, r2, r3)
        L_0x0895:
            X.C258403yx.A00(r8, r6)
            java.lang.Object r3 = r0.A05
            X.5Ev r3 = (X.C282815Ev) r3
            X.5Eu r2 = r3.A00
            X.0sJ r6 = r2.A0A
            X.A4B r5 = r9.A01
            X.3W1 r4 = r3.A04
            java.lang.Object r3 = r0.A02
            r2 = 34
            X.Inr r0 = new X.Inr
            r0.<init>(r2, r3, r8)
            r6.invoke(r5, r4, r1, r0)
            goto L_0x0859
        L_0x08b1:
            java.lang.Object r1 = r0.A04
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r0 = new int[]{r0}
            goto L_0x0856
        L_0x08bd:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x08c2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58799Ixk.invoke(java.lang.Object):java.lang.Object");
    }
}
