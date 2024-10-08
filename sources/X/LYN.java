package X;

import android.view.View;

public final class LYN implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;

    public LYN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        view.setOnFocusChangeListener(new LYN(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a5, code lost:
        if (X.182.A06(X.AnonymousClass7TF.A0H(r3), r3, 36328559966502318L) != false) goto L_0x01a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFocusChange(android.view.View r10, boolean r11) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0036;
                case 1: goto L_0x0152;
                case 2: goto L_0x0332;
                case 3: goto L_0x0128;
                case 4: goto L_0x0112;
                case 5: goto L_0x001a;
                case 6: goto L_0x0182;
                case 7: goto L_0x017a;
                case 8: goto L_0x010a;
                case 9: goto L_0x016e;
                case 10: goto L_0x00ba;
                case 11: goto L_0x0087;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r11 != 0) goto L_0x0019
            java.lang.Object r1 = r9.A01
            instagram.features.clips.edit.ClipsEditMetadataController r1 = (instagram.features.clips.edit.ClipsEditMetadataController) r1
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = r1.A0J()
            r0.clearFocus()
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = r1.A0J()
            X.0nA.A0N(r0)
        L_0x0019:
            return
        L_0x001a:
            java.lang.Object r0 = r9.A01
            X.LmV r0 = (X.C65051LmV) r0
            if (r11 == 0) goto L_0x002e
            X.3E6 r1 = r0.A0D
            X.3ok r0 = r0.A0C
            r1.A9Y(r0)
            X.0qQ.A0A(r10)
            X.0nA.A0Q(r10)
            return
        L_0x002e:
            com.instagram.common.ui.base.IgEditText r0 = r0.A04
            if (r0 != 0) goto L_0x016a
            java.lang.String r3 = "inputEditText"
            goto L_0x0162
        L_0x0036:
            java.lang.Object r2 = r9.A01
            X.QgI r2 = (X.C8066QgI) r2
            X.Qfl r0 = r2.A04
            java.lang.String r3 = "viewModel"
            if (r0 == 0) goto L_0x0162
            X.2Fj r0 = r0.A0E
            X.JTP.A1B(r0, r11)
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0v()
            X.Qfl r0 = r2.A04
            if (r0 == 0) goto L_0x0162
            X.2gB r0 = r0.A06
            java.lang.Object r0 = r0.A02()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.RFm r0 = X.C8919RFm.A07
            r2.setStyle(r0)
        L_0x005e:
            X.C8066QgI.A05(r2)
            return
        L_0x0062:
            if (r11 == 0) goto L_0x0084
            X.Qfl r0 = r2.A04
            if (r0 == 0) goto L_0x0162
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x0081
            X.RFm r0 = X.C8919RFm.A05
        L_0x006e:
            r2.setStyle(r0)
            X.Qfl r0 = r2.A04
            if (r0 == 0) goto L_0x0162
            X.2gB r0 = r0.A07
            java.lang.Object r0 = r0.A02()
            X.SE9 r0 = (X.SE9) r0
            X.C8066QgI.A06(r2, r0)
            goto L_0x005e
        L_0x0081:
            X.RFm r0 = X.C8919RFm.A08
            goto L_0x006e
        L_0x0084:
            X.RFm r0 = X.C8919RFm.A06
            goto L_0x006e
        L_0x0087:
            java.lang.Object r0 = r9.A01
            X.Lgj r0 = (X.C64710Lgj) r0
            X.JjF r3 = X.C64710Lgj.A00(r0)
            X.05G r0 = r3.A0O
            X.AnonymousClass7TF.A1O(r0, r11)
            X.05G r2 = r3.A0Q
            if (r11 == 0) goto L_0x00b7
            r0 = 0
        L_0x009a:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.Epw(r0)
            if (r11 == 0) goto L_0x0019
            X.LEQ r0 = r3.A00
            X.0Ud r0 = r0.A0J
            java.lang.String r0 = X.JTO.A11(r0)
            r3.A01 = r0
            X.6oS r1 = X.C318116oQ.A00(r3)
            r0 = 37
            X.MGU.A02(r3, r1, r0)
            return
        L_0x00b7:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x009a
        L_0x00ba:
            java.lang.Object r0 = r9.A01
            X.E4s r0 = (X.C47488E4s) r0
            if (r11 == 0) goto L_0x0019
            com.instagram.common.session.UserSession r0 = r0.A01
            X.29R r4 = X.JTO.A0b(r0)
            X.1Ln r3 = X.JTO.A0N(r4)
            boolean r0 = X.DbT.A1Y(r3)
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = "IG_CAMERA_BLACKLIST_TAP_SEARCH"
            r3.A0t(r0)
            java.lang.String r0 = "BLACKLIST_TAP_SEARCH"
            r3.A0r(r0)
            X.29R.A00(r3, r4)
            r0 = 2
            r3.A0W(r0)
            X.JTQ.A1A(r3)
            X.283 r2 = r4.A04
            int r0 = X.JTR.A0D(r2)
            r3.A0V(r0)
            java.lang.Long r1 = X.C51971G9r.A0m()
            java.lang.String r0 = "capture_format_index"
            r3.A0Q(r0, r1)
            X.JTQ.A18(r3, r4)
            X.28D r0 = r2.A09
            r3.A0b(r0)
            X.28t r0 = r2.A0A
            r3.A0c(r0)
            r3.A0U()
            X.JTS.A1E(r3)
            return
        L_0x010a:
            if (r11 == 0) goto L_0x0019
            java.lang.Object r0 = r9.A01
            X.DbS.A1U(r0)
            return
        L_0x0112:
            java.lang.Object r1 = r9.A01
            X.LmT r1 = (X.C65049LmT) r1
            boolean r0 = r1.A0B
            if (r0 != 0) goto L_0x0019
            X.87F r0 = r1.A0J
            if (r11 == 0) goto L_0x0345
            r0.A00()
            X.0qQ.A0A(r10)
            X.C63183Ksq.A00(r10)
            return
        L_0x0128:
            java.lang.Object r2 = r9.A01
            X.Joy r2 = (X.C60651Joy) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.9cn r1 = r2.A00
            if (r1 == 0) goto L_0x0019
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0019
            if (r11 == 0) goto L_0x0019
            X.L0K r0 = r2.A02
            int r3 = r1.A00
            X.Lh1 r2 = r0.A00
            X.MVu r0 = r2.A06
            if (r0 == 0) goto L_0x014e
            X.LED r1 = r0.BJn()
            if (r1 == 0) goto L_0x014e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A05 = r0
        L_0x014e:
            X.C64724Lh1.A06(r2)
            return
        L_0x0152:
            if (r11 != 0) goto L_0x0019
            java.lang.Object r1 = r9.A01
            X.KXg r1 = (X.KXg) r1
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x0019
            X.2dZ r0 = r1.A00
            if (r0 != 0) goto L_0x034f
            java.lang.String r3 = "actionBarService"
        L_0x0162:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x016a:
            r0.clearFocus()
            return
        L_0x016e:
            java.lang.Object r1 = r9.A01
            android.view.View r1 = (android.view.View) r1
            int r0 = X.DbW.A01(r11)
            r1.setVisibility(r0)
            return
        L_0x017a:
            java.lang.Object r0 = r9.A01
            X.K66 r0 = (X.K66) r0
            X.K66.A0P(r0, r11)
            return
        L_0x0182:
            java.lang.Object r5 = r9.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r5 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r5
            com.facebook.common.callercontext.CallerContext r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A10
            X.0eM r4 = r5.A0f
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            boolean r0 = X.JUO.A01(r0)
            if (r0 != 0) goto L_0x01a7
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36328559966502318(0x8110a200013dae, double:3.0376658339609753E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x023c
        L_0x01a7:
            if (r11 == 0) goto L_0x02f7
            boolean r0 = r5.A0R
            if (r0 != 0) goto L_0x023c
            boolean r0 = r5.A0S
            if (r0 != 0) goto L_0x023c
            androidx.recyclerview.widget.RecyclerView r0 = r5.mCaptionAddOnView
            if (r0 == 0) goto L_0x023c
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            boolean r0 = X.JUO.A01(r0)
            if (r0 == 0) goto L_0x01d6
            java.util.List r3 = r5.A0d
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x02df
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x02df
        L_0x01cb:
            X.KJo r2 = X.C61723KJo.A00
            r1 = 0
            X.JwH r0 = new X.JwH
            r0.<init>((X.C62743Klh) r2, (java.lang.Integer) r1)
            r3.add(r0)
        L_0x01d6:
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36328559966502318(0x8110a200013dae, double:3.0376658339609753E-306)
            boolean r2 = X.182.A06(r2, r3, r0)
            if (r2 == 0) goto L_0x020b
            java.util.List r7 = r5.A0d
            boolean r2 = r7 instanceof java.util.Collection
            if (r2 == 0) goto L_0x02c7
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L_0x02c7
        L_0x01f5:
            X.KJm r8 = X.C61721KJm.A00
            android.content.res.Resources r3 = X.DbV.A05(r5)
            r2 = 2131956388(0x7f1312a4, float:1.954933E38)
            java.lang.String r6 = r3.getString(r2)
            r3 = 0
            X.JwH r2 = new X.JwH
            r2.<init>((X.C62743Klh) r8, (java.lang.Integer) r3, (java.lang.String) r6)
            r7.add(r2)
        L_0x020b:
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0D(r5)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            boolean r2 = X.JUO.A01(r2)
            if (r2 == 0) goto L_0x0223
            X.27r r6 = X.JTT.A0M(r5)
            X.80P r3 = X.AnonymousClass80P.COMMENT_POLL
            X.4yP r2 = X.C279294yP.FEED
            r6.A15(r2, r3)
        L_0x0223:
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x023c
            X.27r r2 = X.JTT.A0M(r5)
            X.80P r1 = X.AnonymousClass80P.COMMENT_PROMPTS
            X.4yP r0 = X.C279294yP.FEED
            r2.A15(r0, r1)
        L_0x023c:
            r3 = 0
            if (r11 == 0) goto L_0x030b
            X.27r r1 = X.JTT.A0M(r5)
            X.80P r0 = X.AnonymousClass80P.WRITE_CAPTION
            r1.A1X(r0)
            X.4mj r0 = r5.A0A
            if (r0 == 0) goto L_0x025c
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r2 = r0.BQ1()
            if (r2 == 0) goto L_0x025c
            r1 = 43
            X.LYB r0 = new X.LYB
            r0.<init>((java.lang.Object) r5, (int) r1)
            r2.setBackButtonClickListener(r0)
        L_0x025c:
            r0 = 46
            X.LYB r2 = new X.LYB
            r2.<init>((java.lang.Object) r5, (int) r0)
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x0275
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            android.view.View r0 = X.JWN.A00(r1, r2, r0, r3)
            r5.mUploadHeaderButtonView = r0
        L_0x0275:
            X.LQa r0 = r5.A0S()
            android.view.View r0 = r0.A01
            r0.setVisibility(r3)
            r7 = 2
            int[] r1 = new int[r7]
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = X.LQa.A01(r5)
            r0.getLocationOnScreen(r1)
            r2 = 1
            r6 = r1[r2]
            int[] r1 = new int[r7]
            X.LQa r0 = r5.A0S()
            android.widget.ScrollView r0 = r0.A02
            r0.getLocationOnScreen(r1)
            r1 = r1[r2]
            X.LQa r0 = r5.A0S()
            android.widget.ScrollView r2 = r0.A02
            X.LQa r0 = r5.A0S()
            android.widget.ScrollView r0 = r0.A02
            int r0 = r0.getScrollY()
            int r6 = r6 + r0
            int r6 = r6 - r1
            android.content.res.Resources r1 = X.DbV.A05(r5)
            r0 = 2131165281(0x7f070061, float:1.7944775E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r6 = r6 - r0
            r2.smoothScrollTo(r3, r6)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.AE4 r1 = X.C59847JaN.A00(r0)
            java.lang.String r0 = "CAPTION_EDITING_ENTERED"
        L_0x02c3:
            r1.A04(r0)
            return
        L_0x02c7:
            java.util.Iterator r3 = r7.iterator()
        L_0x02cb:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x01f5
            java.lang.Object r2 = r3.next()
            X.JwH r2 = (X.C61079JwH) r2
            java.lang.Object r2 = r2.A01
            boolean r2 = r2 instanceof X.C61721KJm
            if (r2 == 0) goto L_0x02cb
            goto L_0x020b
        L_0x02df:
            java.util.Iterator r1 = r3.iterator()
        L_0x02e3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r0 = r1.next()
            X.JwH r0 = (X.C61079JwH) r0
            java.lang.Object r0 = r0.A01
            boolean r0 = r0 instanceof X.C61723KJo
            if (r0 == 0) goto L_0x02e3
            goto L_0x01d6
        L_0x02f7:
            androidx.recyclerview.widget.RecyclerView r0 = r5.mCaptionAddOnView
            if (r0 == 0) goto L_0x030b
            java.util.List r3 = r5.A0d
            X.MNy r2 = X.C66341MNy.A00
            r1 = 2
            X.MBF r0 = new X.MBF
            r0.<init>(r1, r2)
            r3.removeIf(r0)
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0D(r5)
        L_0x030b:
            X.4mj r0 = r5.A0A
            if (r0 == 0) goto L_0x0319
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r1 = r0.BQ1()
            if (r1 == 0) goto L_0x0319
            r0 = 0
            r1.setBackButtonClickListener(r0)
        L_0x0319:
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0C(r5)
            X.LQa r0 = r5.A0S()
            android.view.View r1 = r0.A01
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.AE4 r1 = X.C59847JaN.A00(r0)
            java.lang.String r0 = "CAPTION_EDITING_FINISHED"
            goto L_0x02c3
        L_0x0332:
            java.lang.Object r0 = r9.A01
            X.Ljc r0 = (X.C64876Ljc) r0
            X.JjN r1 = X.C64876Ljc.A00(r0)
            if (r11 == 0) goto L_0x0342
            X.KKg r0 = X.C61741KKg.A00
        L_0x033e:
            X.C60319JjN.A02(r0, r1)
            return
        L_0x0342:
            X.KKh r0 = X.C61742KKh.A00
            goto L_0x033e
        L_0x0345:
            r0.A01()
            X.JTQ.A1K(r10)
            X.0nA.A0N(r10)
            return
        L_0x034f:
            r0.A0T()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LYN.onFocusChange(android.view.View, boolean):void");
    }
}
