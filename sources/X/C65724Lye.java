package X;

/* renamed from: X.Lye  reason: case insensitive filesystem */
public final class C65724Lye implements C295005nO {
    public final int A00;
    public final Object A01;

    public C65724Lye(C62320sa r1, int i) {
        this.A00 = i;
        switch (i) {
            case 2:
            case 16:
            case 22:
                this.A01 = r1;
                return;
            default:
                this.A01 = r1;
                return;
        }
    }

    public static void A00(C294975nL r1, Object obj, int i) {
        r1.A05 = new C65724Lye(obj, i);
        r1.A0H();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0106, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x017a, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x017f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d1, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d8, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x022e, code lost:
        r0.removeAllViews();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0231, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0238, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0239, code lost:
        r1.setImportantForAccessibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x023c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFinish() {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x010a;
                case 1: goto L_0x000b;
                case 2: goto L_0x0005;
                case 3: goto L_0x0034;
                case 4: goto L_0x0114;
                case 5: goto L_0x011e;
                case 6: goto L_0x00ac;
                case 7: goto L_0x012e;
                case 8: goto L_0x0146;
                case 9: goto L_0x0160;
                case 10: goto L_0x0160;
                case 11: goto L_0x016b;
                case 12: goto L_0x0176;
                case 13: goto L_0x00c7;
                case 14: goto L_0x0005;
                case 15: goto L_0x0180;
                case 16: goto L_0x0005;
                case 17: goto L_0x00dd;
                case 18: goto L_0x00ea;
                case 19: goto L_0x00fe;
                case 20: goto L_0x0192;
                case 21: goto L_0x01a3;
                case 22: goto L_0x0005;
                case 23: goto L_0x0005;
                case 24: goto L_0x01ae;
                case 25: goto L_0x01bc;
                case 26: goto L_0x01fd;
                case 27: goto L_0x0222;
                case 28: goto L_0x0232;
                case 29: goto L_0x0213;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A01
            X.DbS.A1U(r0)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r0 = r9.A01
            X.KAy r0 = (X.C61519KAy) r0
            com.instagram.arlink.fragment.NametagController r3 = r0.A07
            android.app.Activity r0 = r3.A06
            android.view.Window r2 = r0.getWindow()
            r2.getClass()
            android.view.View r1 = r2.getDecorView()
            boolean r0 = X.2db.A0B(r1, r2)
            if (r0 == 0) goto L_0x0028
            r0 = 0
            X.2db.A07(r1, r2, r0)
        L_0x0028:
            java.lang.Integer r1 = r3.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x000a
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            com.instagram.arlink.fragment.NametagController.A03(r3, r0)
            return
        L_0x0034:
            java.lang.Object r3 = r9.A01
            com.instagram.avatars.pokes.PokeReceiverView r3 = (com.instagram.avatars.pokes.PokeReceiverView) r3
            com.instagram.common.session.UserSession r2 = r3.A02
            if (r2 == 0) goto L_0x000a
            X.LBs r1 = r3.A08
            r8 = 0
            android.content.Context r4 = r1.A00
            com.instagram.common.ui.widget.imageview.IgImageView r7 = new com.instagram.common.ui.widget.imageview.IgImageView
            r7.<init>(r4)
            r0 = 2131239382(0x7f0821d6, float:1.809507E38)
            X.6tR r0 = r1.A00(r2, r0)
            r7.setImageDrawable(r0)
            int r1 = X.JTU.A01(r4)
            int r0 = X.JTU.A01(r4)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r1, r0)
            android.content.res.Resources r1 = r4.getResources()
            if (r1 == 0) goto L_0x00aa
            r0 = 2131165217(0x7f070021, float:1.7944645E38)
            int r0 = r1.getDimensionPixelSize(r0)
        L_0x006a:
            int r0 = -r0
            r2.setMargins(r8, r8, r8, r0)
            r6 = 0
            X.JTQ.A0v(r7, r6)
            r7.setLayoutParams(r2)
            r3.A03 = r7
            r3.addView(r7, r8)
            r0 = 30
            X.MMX r5 = new X.MMX
            r5.<init>((int) r0, (java.lang.Object) r7, (java.lang.Object) r3)
            X.5nL r4 = X.JTP.A0c(r7, r8)
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            X.5nL r2 = X.JTQ.A0P(r4, r2, r0)
            float r1 = X.AnonymousClass7TE.A02(r7)
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.A0P(r0, r1)
            r2.A0Q(r0, r6)
            r2.A0I(r0)
            X.Lyc r0 = new X.Lyc
            r0.<init>(r8, r2, r7, r5)
            r2.A05 = r0
            r2.A0H()
            return
        L_0x00aa:
            r0 = 0
            goto L_0x006a
        L_0x00ac:
            java.lang.Object r3 = r9.A01
            X.JY9 r3 = (X.JY9) r3
            com.instagram.common.session.UserSession r0 = r3.A18
            com.instagram.avatars.store.AvatarStore r2 = X.25x.A00(r0)
            r1 = 2
            X.MMs r0 = new X.MMs
            r0.<init>(r3, r1)
            r2.A04(r0)
            X.JZL r0 = r3.A0L
            if (r0 == 0) goto L_0x000a
            r0.A04()
            return
        L_0x00c7:
            java.lang.Object r0 = r9.A01
            X.LzO r0 = (X.C65770LzO) r0
            X.K6K r0 = r0.A00
            androidx.fragment.app.Fragment r0 = r0.A09
            if (r0 == 0) goto L_0x000a
            android.view.View r1 = r0.mView
            if (r1 == 0) goto L_0x000a
            r0 = 2131433347(0x7f0b1783, float:1.8488477E38)
            android.view.View r1 = r1.findViewById(r0)
            goto L_0x0106
        L_0x00dd:
            java.lang.Object r0 = r9.A01
            X.K6J r0 = (X.K6J) r0
            android.view.View r1 = X.K6J.A00(r0)
            if (r1 == 0) goto L_0x000a
            r0 = 1
            goto L_0x0239
        L_0x00ea:
            java.lang.Object r2 = r9.A01
            X.K6J r2 = (X.K6J) r2
            android.view.View r1 = X.K6J.A00(r2)
            if (r1 == 0) goto L_0x00f8
            r0 = 1
            r1.setImportantForAccessibility(r0)
        L_0x00f8:
            android.view.ViewGroup r0 = r2.A06
            if (r0 == 0) goto L_0x000a
            goto L_0x022e
        L_0x00fe:
            java.lang.Object r0 = r9.A01
            X.K6J r0 = (X.K6J) r0
            android.view.View r1 = X.K6J.A00(r0)
        L_0x0106:
            if (r1 == 0) goto L_0x000a
            goto L_0x0238
        L_0x010a:
            java.lang.Object r0 = r9.A01
            X.KAy r0 = (X.C61519KAy) r0
            android.app.Activity r0 = r0.A04
            r0.finish()
            return
        L_0x0114:
            java.lang.Object r0 = r9.A01
            X.Ll3 r0 = (X.C64964Ll3) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A08
            X.AnonymousClass7TF.A16(r0)
            return
        L_0x011e:
            java.lang.Object r0 = r9.A01
            X.Ll7 r0 = (X.C64968Ll7) r0
            android.view.View r0 = r0.A01
            if (r0 != 0) goto L_0x012a
            java.lang.String r0 = "overlayContainer"
            goto L_0x01d1
        L_0x012a:
            r0.invalidate()
            return
        L_0x012e:
            java.lang.Object r2 = r9.A01
            X.Lze r2 = (X.C65786Lze) r2
            X.0eM r1 = r2.A0B
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r1)
            X.C51969G9p.A1M(r0)
            android.widget.ImageView r1 = X.JTR.A0Z(r1)
            r0 = 0
            r1.setImageDrawable(r0)
            r2.A00 = r0
            return
        L_0x0146:
            java.lang.Object r2 = r9.A01
            X.Lze r2 = (X.C65786Lze) r2
            X.0eM r0 = r2.A0C
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            r1 = 8
            r0.setVisibility(r1)
            X.0eM r0 = r2.A0E
            X.JTS.A1W(r0, r1)
            X.0eM r0 = r2.A09
            X.JTS.A1W(r0, r1)
            return
        L_0x0160:
            java.lang.Object r0 = r9.A01
            X.JYD r0 = (X.JYD) r0
            com.instagram.ui.widget.shutterbutton.ShutterButton r1 = r0.A0T
            r0 = 1
            r1.setEnabled(r0)
            return
        L_0x016b:
            java.lang.Object r1 = r9.A01
            X.JXi r1 = (X.C59767JXi) r1
            r0 = 0
            X.C59767JXi.A0A(r1, r0)
            android.view.ViewGroup r1 = r1.A0N
            goto L_0x017a
        L_0x0176:
            java.lang.Object r1 = r9.A01
            android.view.View r1 = (android.view.View) r1
        L_0x017a:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0180:
            java.lang.Object r0 = r9.A01
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r0 = (com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController) r0
            android.view.View r1 = r0.A04
            r0 = 2131441113(0x7f0b35d9, float:1.8504228E38)
            android.view.View r1 = r1.requireViewById(r0)
            r0 = 1
            r1.setClickable(r0)
            return
        L_0x0192:
            java.lang.Object r0 = r9.A01
            X.K72 r0 = (X.K72) r0
            X.Lwc r0 = r0.A07
            if (r0 != 0) goto L_0x019d
            java.lang.String r0 = "trackCoverReelHolder"
            goto L_0x01d1
        L_0x019d:
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r0.A02
            r0.A05()
            return
        L_0x01a3:
            java.lang.Object r0 = r9.A01
            X.JZ0 r0 = (X.JZ0) r0
            android.view.View r1 = r0.A0A
            r0 = 4
            r1.setVisibility(r0)
            return
        L_0x01ae:
            java.lang.Object r0 = r9.A01
            X.LMz r0 = (X.LMz) r0
            android.os.Handler r3 = r0.A00
            java.lang.Runnable r2 = r0.A05
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x01bc:
            java.lang.Object r2 = r9.A01
            X.LMz r2 = (X.LMz) r2
            android.view.View r1 = r2.A01
            r0 = 8
            r1.setVisibility(r0)
            X.MRD r4 = r2.A04
            com.instagram.tagging.activity.TaggingActivity r4 = (com.instagram.tagging.activity.TaggingActivity) r4
            X.LSN r3 = r4.A0E
            if (r3 != 0) goto L_0x01d9
            java.lang.String r0 = "helpTextController"
        L_0x01d1:
            X.0qQ.A0F(r0)
        L_0x01d4:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01d9:
            java.util.ArrayList r0 = r4.A0M
            if (r0 != 0) goto L_0x01e1
            X.JTO.A1L()
            goto L_0x01d4
        L_0x01e1:
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r0 = X.JTT.A0i(r4, r0)
            X.1iA r2 = r0.A03
            X.1iA r0 = X.1iA.A0Q
            r1 = 0
            if (r2 != r0) goto L_0x01f3
            int r0 = com.instagram.tagging.activity.TaggingActivity.A00(r4)
            if (r0 != 0) goto L_0x01f3
            r1 = 1
        L_0x01f3:
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = r4.A0D
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            r3.A03(r1, r0)
            return
        L_0x01fd:
            android.view.animation.RotateAnimation r3 = X.C64179LSh.A00()
            java.lang.Object r2 = r9.A01
            android.view.View r2 = (android.view.View) r2
            r1 = 8
            X.IE5 r0 = new X.IE5
            r0.<init>(r2, r1)
            r3.setAnimationListener(r0)
            r2.startAnimation(r3)
            return
        L_0x0213:
            java.lang.Object r0 = r9.A01
            X.GDy r0 = (X.C52078GDy) r0
            X.M5Z r2 = new X.M5Z
            r2.<init>(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            X.11Z.A04(r2, r0)
            return
        L_0x0222:
            java.lang.Object r2 = r9.A01
            X.KHO r2 = (X.KHO) r2
            android.view.View r1 = r2.A03
            r0 = 1
            r1.setImportantForAccessibility(r0)
            android.widget.FrameLayout r0 = r2.A04
        L_0x022e:
            r0.removeAllViews()
            return
        L_0x0232:
            java.lang.Object r0 = r9.A01
            X.KHO r0 = (X.KHO) r0
            android.view.View r1 = r0.A03
        L_0x0238:
            r0 = 4
        L_0x0239:
            r1.setImportantForAccessibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65724Lye.onFinish():void");
    }

    public C65724Lye(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
