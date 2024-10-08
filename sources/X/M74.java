package X;

import android.view.View;
import com.instagram.creation.fragment.followersshare.FollowersShareFragment;

public final class M74 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FollowersShareFragment A01;

    public M74(View view, FollowersShareFragment followersShareFragment) {
        this.A01 = followersShareFragment;
        this.A00 = view;
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r2 = r12.A01
            android.view.View r0 = r2.mView
            if (r0 == 0) goto L_0x0407
            X.KO3 r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A02(r2)
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0407
            boolean r0 = X.JTP.A1Z(r2)
            if (r0 != 0) goto L_0x0062
            X.3Q2 r0 = X.LRK.A00(r2)
            java.lang.String r0 = r0.A33
            if (r0 == 0) goto L_0x0327
            X.3Q2 r0 = X.LRK.A00(r2)
            java.lang.String r0 = r0.A33
            if (r0 == 0) goto L_0x0322
            boolean r0 = X.JTQ.A1Z(r0)
            if (r0 == 0) goto L_0x0327
            X.3Q2 r0 = X.LRK.A00(r2)
            boolean r0 = r0.A0y()
            if (r0 == 0) goto L_0x0062
            X.3Q2 r0 = X.LRK.A00(r2)
            boolean r0 = r0.A5S
            if (r0 != 0) goto L_0x0062
            X.3Q2 r1 = X.LRK.A00(r2)
            X.82q r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A00(r2)
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            int r0 = r0.A01()
            r1.A0H = r0
            X.3Q2 r1 = X.LRK.A00(r2)
            X.82q r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A00(r2)
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            int r0 = r0.A00()
            r1.A0G = r0
        L_0x0062:
            android.view.View r4 = r12.A00
            r0 = 2131430735(0x7f0b0d4f, float:1.848318E38)
            android.view.ViewGroup r3 = X.DbS.A0E(r4, r0)
            X.0qQ.A0A(r3)
            X.KNr r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A03(r2)
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r5 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.MAIN
            X.KNo r1 = r0.A04
            X.JwD r0 = X.C61828KNr.A01(r0)
            java.util.ArrayList r0 = r1.A06(r5, r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x0082:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r1 = r5.next()
            X.KmH r1 = (X.C62779KmH) r1
            boolean r0 = r1 instanceof X.C61832KNv
            if (r0 == 0) goto L_0x009f
            X.KNv r1 = (X.C61832KNv) r1
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = r1.A00
            X.KNv r1 = new X.KNv
            r1.<init>(r0)
        L_0x009b:
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0B(r3, r2, r1)
            goto L_0x0082
        L_0x009f:
            boolean r0 = r1 instanceof X.C61833KNw
            if (r0 == 0) goto L_0x00ad
            X.KNw r1 = (X.C61833KNw) r1
            java.lang.Integer r0 = r1.A00
            X.KNw r1 = new X.KNw
            r1.<init>(r0)
            goto L_0x009b
        L_0x00ad:
            boolean r0 = r1 instanceof X.KNx
            if (r0 == 0) goto L_0x0082
            X.KNl r0 = r2.A0C
            if (r0 == 0) goto L_0x0318
            X.Kp2 r1 = r0.A03()
            X.KNx r0 = X.KNx.A00
            X.MVS r0 = r1.A05(r0)
            android.view.View r0 = r0.ANH()
            r3.addView(r0)
            goto L_0x0082
        L_0x00c7:
            X.0eM r6 = r2.A0f
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            boolean r0 = X.LTP.A01(r0)
            java.lang.String r5 = "rowsContainer"
            if (r0 == 0) goto L_0x02fc
            android.view.ViewGroup r3 = r2.A01
            if (r3 == 0) goto L_0x031a
            X.KNl r0 = r2.A0C
            if (r0 == 0) goto L_0x0318
            X.Kp2 r1 = r0.A03()
            X.KNx r0 = X.KNx.A00
            X.MVS r0 = r1.A05(r0)
            android.view.View r0 = r0.ANH()
            r3.addView(r0)
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r3 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.MORE
            android.view.ViewGroup r1 = r2.A01
            if (r1 == 0) goto L_0x031a
            X.KNv r0 = new X.KNv
            r0.<init>(r3)
        L_0x00f9:
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0B(r1, r2, r0)
        L_0x00fc:
            r0 = 2131433059(0x7f0b1663, float:1.8487893E38)
            android.view.View r8 = r4.findViewById(r0)
            X.KNl r0 = r2.A0C
            if (r0 == 0) goto L_0x0318
            X.Kp2 r0 = r0.A03()
            X.MVS r1 = r0.A04()
            boolean r0 = r1 instanceof X.C65229LpZ
            if (r0 == 0) goto L_0x032a
            X.LpZ r1 = (X.C65229LpZ) r1
            if (r1 == 0) goto L_0x032a
            r2.xpostRowItem = r1
            android.view.View r0 = r1.ANH()
            r2.xpostRowItemView = r0
            X.LpZ r0 = r2.xpostRowItem
            if (r0 == 0) goto L_0x0126
            r0.CsQ()
        L_0x0126:
            boolean r0 = X.LTP.A0A(r2)
            if (r0 != 0) goto L_0x0134
            X.Loa r1 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A01(r2)
            X.LpZ r0 = r2.xpostRowItem
            r1.A01 = r0
        L_0x0134:
            X.3Q2 r0 = X.LRK.A00(r2)
            X.JxB r0 = r0.A0v
            if (r0 == 0) goto L_0x01a0
            if (r8 == 0) goto L_0x0313
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A08(r4, r2)
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r6)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36325596439000136(0x810df000003448, double:3.035791687235428E-306)
            boolean r1 = X.182.A06(r3, r5, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0156
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0A(r4, r2, r0)
        L_0x0156:
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0C(r2)
            boolean r0 = X.LTP.A0A(r2)
            if (r0 != 0) goto L_0x0168
            X.LpZ r0 = r2.xpostRowItem
            if (r0 == 0) goto L_0x0168
            com.instagram.common.ui.base.IgTextView r0 = r0.A07
            X.AnonymousClass7TH.A0R(r0)
        L_0x0168:
            X.07U r6 = X.07U.A05
            X.07Z r3 = r2.getViewLifecycleOwner()
            X.0xx r1 = X.AnonymousClass07a.A00(r3)
            r5 = 0
            r0 = 39
            X.MHJ r0 = X.MHJ.A02(r3, r6, r2, r5, r0)
            X.19B r4 = X.19B.A00
            X.1Eo.A05(r4, r0, r1)
            X.KNr r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A03(r2)
            X.KOp r3 = r0.A0M
            X.3Q2 r1 = X.LRK.A01(r2)
            java.lang.String r0 = "FollowersShareFragment"
            r3.A0A(r1, r0)
            X.07Z r3 = r2.getViewLifecycleOwner()
            X.0xx r1 = X.AnonymousClass07a.A00(r3)
            r0 = 40
            X.MHJ r0 = X.MHJ.A02(r3, r6, r2, r5, r0)
            X.1Eo.A05(r4, r0, r1)
            goto L_0x032a
        L_0x01a0:
            boolean r0 = X.LTP.A0A(r2)
            if (r0 != 0) goto L_0x01ba
            X.LpZ r1 = r2.xpostRowItem
            if (r1 == 0) goto L_0x01b3
            r0 = 2131428067(0x7f0b02e3, float:1.8477768E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r4, r0)
            r1.A07 = r0
        L_0x01b3:
            X.LpZ r0 = r2.xpostRowItem
            if (r0 == 0) goto L_0x01ba
            r0.A04()
        L_0x01ba:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            X.Liv r1 = X.C63270KuF.A00(r0)
            X.3Q2 r0 = X.LRK.A01(r2)
            r5 = 0
            boolean r0 = r1.A02(r0, r5)
            if (r0 == 0) goto L_0x0218
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r6)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            X.Liv r1 = X.C63270KuF.A00(r0)
            X.LpS r0 = new X.LpS
            r0.<init>(r2, r3, r1)
            r2.A0I = r0
            android.view.View r1 = r0.ANH()
            r0 = 2131441223(0x7f0b3647, float:1.8504452E38)
            android.view.ViewGroup r0 = X.DbS.A0E(r4, r0)
            r0.setVisibility(r5)
            r0.addView(r1)
            X.Loa r1 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A01(r2)
            X.LpS r0 = r2.A0I
            r1.A02 = r0
            if (r0 == 0) goto L_0x01fe
            r0.CsQ()
        L_0x01fe:
            X.1wn r0 = r2.A05
            if (r0 != 0) goto L_0x0218
            r0 = 30
            X.LgT r0 = X.C64698LgT.A00(r2, r0)
            r2.A05 = r0
            X.1Ng r3 = X.JTQ.A0F(r2)
            java.lang.Class<X.LfQ> r1 = X.C64638LfQ.class
            X.1wn r0 = r2.A05
            X.0qQ.A0A(r0)
            r3.A01(r0, r1)
        L_0x0218:
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A08(r4, r2)
            r5 = 1
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0A(r4, r2, r5)
            X.0qQ.A0A(r8)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            boolean r11 = X.JUO.A01(r0)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r6)
            X.0Tu r3 = X.AnonymousClass7TF.A0H(r4)
            r0 = 36328559966502318(0x8110a200013dae, double:3.0376658339609753E-306)
            boolean r10 = X.182.A06(r3, r4, r0)
            if (r11 != 0) goto L_0x025a
            if (r10 != 0) goto L_0x025a
        L_0x023f:
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0C(r2)
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            com.instagram.user.model.User r0 = r1.A01(r0)
            boolean r0 = r0.A1O()
            if (r0 == 0) goto L_0x0168
            X.6SR r0 = X.AnonymousClass6SR.A01()
            r0.A0F = r5
            goto L_0x0168
        L_0x025a:
            X.0eM r0 = r2.A0e
            java.lang.Object r0 = r0.getValue()
            X.Jg1 r0 = (X.C60120Jg1) r0
            X.2Fj r3 = r0.A00
            r1 = 7
            X.MP4 r0 = new X.MP4
            r0.<init>(r2, r1)
            r7 = 8
            X.Dba.A15(r2, r3, r0, r7)
            X.07U r9 = X.07U.A05
            X.07Z r4 = r2.getViewLifecycleOwner()
            X.0xx r3 = X.AnonymousClass07a.A00(r4)
            r1 = 0
            r0 = 41
            X.MHJ r0 = X.MHJ.A02(r4, r9, r2, r1, r0)
            X.AnonymousClass7TE.A1Z(r0, r3)
            r0 = 2131429584(0x7f0b08d0, float:1.8480845E38)
            android.view.View r1 = X.DbY.A0F(r8, r0)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView"
            X.0qQ.A0C(r1, r0)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r2.mCaptionAddOnView = r1
            java.util.List r0 = r2.A0d
            r0.clear()
            androidx.recyclerview.widget.RecyclerView r1 = r2.mCaptionAddOnView
            if (r1 == 0) goto L_0x02a4
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0D(r2)
            X.LCg r0 = r2.A0B
            r0.A00(r1)
        L_0x02a4:
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.TextView"
            r0 = 15
            java.lang.String r3 = X.C273654mx.A00(r0)
            if (r11 == 0) goto L_0x02d3
            r0 = 2131437876(0x7f0b2934, float:1.8497663E38)
            android.view.View r0 = r8.requireViewById(r0)
            X.0qQ.A0C(r0, r3)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            X.0qQ.A0C(r0, r4)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.pollPreviewText = r0
            if (r0 == 0) goto L_0x02ca
            r0.setVisibility(r7)
        L_0x02ca:
            android.widget.TextView r1 = r2.pollPreviewText
            if (r1 == 0) goto L_0x02d3
            r0 = 44
            X.LYB.A00(r1, r0, r2)
        L_0x02d3:
            if (r10 == 0) goto L_0x023f
            r0 = 2131438758(0x7f0b2ca6, float:1.8499452E38)
            android.view.View r0 = r8.requireViewById(r0)
            X.0qQ.A0C(r0, r3)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            X.0qQ.A0C(r0, r4)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.promptPreviewText = r0
            if (r0 == 0) goto L_0x02f1
            r0.setVisibility(r7)
        L_0x02f1:
            android.widget.TextView r1 = r2.promptPreviewText
            if (r1 == 0) goto L_0x023f
            r0 = 45
            X.LYB.A00(r1, r0, r2)
            goto L_0x023f
        L_0x02fc:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            boolean r0 = X.LTP.A00(r0)
            if (r0 != 0) goto L_0x00fc
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            android.view.ViewGroup r1 = r2.A01
            if (r1 == 0) goto L_0x031a
            X.KNw r0 = new X.KNw
            r0.<init>(r3)
            goto L_0x00f9
        L_0x0313:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0318:
            java.lang.String r5 = "dependencyProvider"
        L_0x031a:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0322:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0327:
            X.DbX.A1J(r2)
        L_0x032a:
            X.5w9 r0 = X.AnonymousClass5w8.A05
            X.0eM r3 = r2.A0f
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.5nZ r6 = X.JTT.A0S(r0)
            X.JeZ r0 = r2.mAppShareTable
            r10 = 1
            if (r0 == 0) goto L_0x0392
            boolean r0 = r2.A0Q
            if (r0 != 0) goto L_0x0392
            if (r6 == 0) goto L_0x0392
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            boolean r0 = X.AnonymousClass5w9.A02(r6)
            if (r0 == 0) goto L_0x0392
            boolean r0 = X.AnonymousClass5w9.A01(r1)
            if (r0 == 0) goto L_0x0392
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x0392
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x0392
            boolean r0 = X.LTP.A0A(r2)
            if (r0 != 0) goto L_0x0392
            X.JeZ r5 = r2.mAppShareTable
            X.0qQ.A0A(r5)
            r2.requireContext()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.AnonymousClass5w9.A00(r0)
            r7 = 0
            java.lang.String r9 = "share_sheet"
            r8 = r7
            r5.A05(r6, r7, r8, r9, r10)
        L_0x0379:
            r2.A0Q = r10
        L_0x037b:
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r3)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36323504790187213(0x810c0900042ccd, double:3.034468920103742E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x03fc
            android.view.View r0 = r12.A00
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A09(r0, r2)
            return
        L_0x0392:
            android.view.View r0 = r2.xpostRowItemView
            if (r0 == 0) goto L_0x03de
            if (r6 == 0) goto L_0x03de
            boolean r0 = r2.A0Q
            if (r0 != 0) goto L_0x03de
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            boolean r0 = X.AnonymousClass5w9.A02(r6)
            if (r0 == 0) goto L_0x03de
            boolean r0 = X.AnonymousClass5w9.A01(r1)
            if (r0 == 0) goto L_0x03de
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x03de
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x03de
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r3)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36328946513493697(0x8110fc00003ec1, double:3.037910287834823E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x03de
            X.Loa r4 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A01(r2)
            r2.requireContext()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.AnonymousClass5w9.A00(r0)
            r1 = 0
            java.lang.String r0 = "share_sheet"
            r4.EuY(r6, r1, r0, r10)
            goto L_0x0379
        L_0x03de:
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r3)
            android.content.Context r1 = r2.requireContext()
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            X.C250563lf.A0h(r4, r1, r0)
            X.6SR r1 = X.AnonymousClass6SR.A01()
            X.3Q2 r0 = X.LRK.A00(r2)
            X.1iA r0 = r0.A1G
            int r0 = r0.A00
            r1.A07 = r0
            goto L_0x037b
        L_0x03fc:
            android.view.View r1 = r12.A00
            X.M73 r0 = new X.M73
            r0.<init>(r1, r2)
            r1.post(r0)
            return
        L_0x0407:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M74.run():void");
    }
}
