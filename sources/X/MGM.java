package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

public final class MGM extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGM(RecyclerView recyclerView, U94 u94, EmptyStateView emptyStateView, RefreshableNestedScrollingParent refreshableNestedScrollingParent, AnonymousClass4D7 r6) {
        super(2, r6);
        this.A02 = 10;
        this.A03 = u94;
        this.A04 = emptyStateView;
        this.A05 = recyclerView;
        this.A00 = refreshableNestedScrollingParent;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.MGM, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.MGM, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bc, code lost:
        return new X.MGM(r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        r2 = new X.MGM(r3, r4, r5, r6, r7, r8);
        r2.A00 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            int r1 = r9.A02
            r7 = r11
            switch(r1) {
                case 0: goto L_0x0062;
                case 1: goto L_0x0019;
                case 2: goto L_0x0023;
                case 3: goto L_0x006e;
                case 4: goto L_0x002d;
                case 5: goto L_0x0037;
                case 6: goto L_0x007a;
                case 7: goto L_0x0086;
                case 8: goto L_0x0041;
                case 9: goto L_0x004c;
                case 10: goto L_0x0092;
                case 11: goto L_0x00ab;
                case 12: goto L_0x0057;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            java.lang.Object r3 = r9.A04
            java.lang.Object r4 = r9.A05
            r8 = 13
        L_0x0010:
            X.MGM r1 = new X.MGM
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.A00 = r10
            return r1
        L_0x0019:
            java.lang.Object r3 = r9.A04
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            java.lang.Object r4 = r9.A05
            r8 = 1
            goto L_0x0010
        L_0x0023:
            java.lang.Object r5 = r9.A01
            java.lang.Object r4 = r9.A05
            java.lang.Object r3 = r9.A04
            java.lang.Object r6 = r9.A03
            r8 = 2
            goto L_0x0010
        L_0x002d:
            java.lang.Object r5 = r9.A01
            java.lang.Object r3 = r9.A04
            java.lang.Object r6 = r9.A03
            java.lang.Object r4 = r9.A05
            r8 = 4
            goto L_0x0010
        L_0x0037:
            java.lang.Object r4 = r9.A05
            java.lang.Object r3 = r9.A04
            java.lang.Object r6 = r9.A03
            java.lang.Object r5 = r9.A01
            r8 = 5
            goto L_0x0010
        L_0x0041:
            java.lang.Object r5 = r9.A01
            java.lang.Object r3 = r9.A04
            java.lang.Object r4 = r9.A05
            java.lang.Object r6 = r9.A03
            r8 = 8
            goto L_0x0010
        L_0x004c:
            java.lang.Object r3 = r9.A04
            java.lang.Object r4 = r9.A05
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 9
            goto L_0x0010
        L_0x0057:
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            java.lang.Object r3 = r9.A04
            java.lang.Object r4 = r9.A05
            r8 = 12
            goto L_0x0010
        L_0x0062:
            java.lang.Object r2 = r9.A01
            java.lang.Object r3 = r9.A04
            java.lang.Object r4 = r9.A05
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A00
            r8 = 0
            goto L_0x00b7
        L_0x006e:
            java.lang.Object r5 = r9.A03
            java.lang.Object r4 = r9.A05
            java.lang.Object r6 = r9.A00
            java.lang.Object r3 = r9.A04
            java.lang.Object r2 = r9.A01
            r8 = 3
            goto L_0x00b7
        L_0x007a:
            java.lang.Object r5 = r9.A03
            java.lang.Object r3 = r9.A04
            java.lang.Object r2 = r9.A01
            java.lang.Object r6 = r9.A00
            java.lang.Object r4 = r9.A05
            r8 = 6
            goto L_0x00b7
        L_0x0086:
            java.lang.Object r3 = r9.A04
            java.lang.Object r4 = r9.A05
            java.lang.Object r6 = r9.A00
            java.lang.Object r2 = r9.A01
            java.lang.Object r5 = r9.A03
            r8 = 7
            goto L_0x00b7
        L_0x0092:
            java.lang.Object r3 = r9.A03
            X.U94 r3 = (X.U94) r3
            java.lang.Object r4 = r9.A04
            com.instagram.ui.emptystaterow.EmptyStateView r4 = (com.instagram.ui.emptystaterow.EmptyStateView) r4
            java.lang.Object r2 = r9.A05
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            java.lang.Object r5 = r9.A00
            com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent r5 = (com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent) r5
            X.MGM r1 = new X.MGM
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r1.A01 = r10
            return r1
        L_0x00ab:
            java.lang.Object r6 = r9.A00
            java.lang.Object r4 = r9.A05
            java.lang.Object r2 = r9.A01
            java.lang.Object r3 = r9.A04
            java.lang.Object r5 = r9.A03
            r8 = 11
        L_0x00b7:
            X.MGM r1 = new X.MGM
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGM.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: X.7aD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.7aD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: X.7aD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.7aD} */
    /* JADX WARNING: type inference failed for: r50v0, types: [boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0306, code lost:
        X.0qQ.A0F(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x030d, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x039a, code lost:
        if (r6 <= 0) goto L_0x039c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r9 <= 0) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0995, code lost:
        X.C51968G9o.A1P(r3, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e2, code lost:
        r7 = "adapter";
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r64) {
        /*
            r63 = this;
            r0 = r63
            int r1 = r0.A02
            switch(r1) {
                case 0: goto L_0x099a;
                case 1: goto L_0x090f;
                case 2: goto L_0x00e6;
                case 3: goto L_0x08eb;
                case 4: goto L_0x047a;
                case 5: goto L_0x02c8;
                case 6: goto L_0x045d;
                case 7: goto L_0x042a;
                case 8: goto L_0x095a;
                case 9: goto L_0x03d1;
                case 10: goto L_0x035d;
                case 11: goto L_0x031e;
                case 12: goto L_0x009a;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.0eS.A00(r64)
            java.lang.Object r7 = r0.A00
            X.LFx r7 = (X.C63970LFx) r7
            java.lang.Object r3 = r0.A01
            X.H1J r3 = (X.H1J) r3
            X.U94 r1 = r3.A04
            if (r1 == 0) goto L_0x00e2
            int r9 = r1.getItemCount()
            java.lang.Object r6 = r0.A03
            com.instagram.ui.emptystaterow.EmptyStateView r6 = (com.instagram.ui.emptystaterow.EmptyStateView) r6
            r8 = 1
            boolean r4 = X.AnonymousClass7TF.A1Q(r9)
            r2 = 8
            r1 = 8
            if (r4 == 0) goto L_0x002a
            r1 = 0
        L_0x002a:
            r6.setVisibility(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r3.A00
            if (r1 == 0) goto L_0x0037
            if (r9 <= 0) goto L_0x0034
            r2 = 0
        L_0x0034:
            r1.setVisibility(r2)
        L_0x0037:
            java.lang.Object r5 = r0.A04
            com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent r5 = (com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent) r5
            X.KzI r4 = r7.A02
            boolean r2 = r4 instanceof X.C60334Jjd
            if (r2 == 0) goto L_0x0044
            r1 = 1
            if (r9 > 0) goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            r5.setRefreshing(r1)
            if (r2 != 0) goto L_0x0098
            if (r9 <= 0) goto L_0x0098
        L_0x004c:
            r5.setEnabled(r8)
            boolean r1 = r4 instanceof X.C60333Jjc
            if (r1 == 0) goto L_0x007c
            r6.A0J()
        L_0x0056:
            X.KzI r1 = r7.A00
            boolean r1 = r1 instanceof X.C60333Jjc
            if (r1 == 0) goto L_0x0079
            X.89j r2 = r3.A03
            X.89j r1 = X.C3515689j.CREATORS_INSPIRATION_HUB_AUDIO
            if (r2 != r1) goto L_0x0079
            X.I4Q r4 = X.I4Q.A00
            android.content.Context r5 = r3.requireContext()
            java.lang.Object r6 = r0.A05
            android.view.View r6 = (android.view.View) r6
            X.HOz r7 = X.C54694HOz.AUDIO
            r9 = 1
            r0 = 24
            X.Ivo r8 = new X.Ivo
            r8.<init>(r3, r0)
            r4.A02(r5, r6, r7, r8, r9)
        L_0x0079:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x007c:
            if (r2 == 0) goto L_0x0084
            if (r9 != 0) goto L_0x0084
            r6.A0L()
            goto L_0x0056
        L_0x0084:
            boolean r1 = r4 instanceof X.C60332Jjb
            if (r1 == 0) goto L_0x0094
            X.KzI r1 = r7.A00
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x0094
            if (r9 != 0) goto L_0x0094
            r6.A0I()
            goto L_0x0056
        L_0x0094:
            r6.A0K()
            goto L_0x0056
        L_0x0098:
            r8 = 0
            goto L_0x004c
        L_0x009a:
            X.0eS.A00(r64)
            java.lang.Object r1 = r0.A00
            X.4Cq r1 = (X.C262224Cq) r1
            java.lang.Object r6 = r0.A01
            X.H1J r6 = (X.H1J) r6
            X.0eM r2 = r6.A0B
            java.lang.Object r2 = r2.getValue()
            X.GgG r2 = (X.C52963GgG) r2
            X.0r6 r4 = r2.A02
            r8 = 0
            r3 = 5
            X.ImR r2 = new X.ImR
            r2.<init>(r6, r8, r3)
            X.C51968G9o.A1P(r2, r1, r4)
            X.U94 r2 = r6.A04
            if (r2 == 0) goto L_0x00e2
            X.0r6 r2 = r2.A02
            java.lang.Object r7 = r0.A03
            java.lang.Object r4 = r0.A04
            java.lang.Object r5 = r0.A05
            r9 = 13
            X.MGM r3 = new X.MGM
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.C51968G9o.A1P(r3, r1, r2)
            X.0eM r0 = r6.A0B
            java.lang.Object r0 = r0.getValue()
            X.GgG r0 = (X.C52963GgG) r0
            X.0r6 r2 = r0.A0B
            r0 = 36
            X.ImP r3 = new X.ImP
            r3.<init>(r6, r8, r0)
            goto L_0x0995
        L_0x00e2:
            java.lang.String r7 = "adapter"
            goto L_0x0306
        L_0x00e6:
            X.0eS.A00(r64)
            java.lang.Object r5 = r0.A00
            X.JVf r5 = (X.C59721JVf) r5
            java.lang.Object r6 = r5.A00
            X.MVo r6 = (X.C66534MVo) r6
            if (r6 == 0) goto L_0x011d
            java.lang.Object r7 = r0.A01
            com.instagram.creation.fragment.AlbumEditFragment r7 = (com.instagram.creation.fragment.AlbumEditFragment) r7
            java.lang.Object r4 = r0.A05
            android.view.View r4 = (android.view.View) r4
            boolean r1 = X.C60323JjS.A01(r7)
            if (r1 == 0) goto L_0x017e
            boolean r1 = r6 instanceof X.C65499LuN
            if (r1 == 0) goto L_0x0176
            X.LuN r6 = (X.C65499LuN) r6
            com.instagram.creation.fragment.AlbumEditFragment.A08(r7)
            X.LOy r4 = r7.A0M
            if (r4 == 0) goto L_0x011d
            r1 = 0
            X.MIz r3 = new X.MIz
            r3.<init>(r7, r1)
            r2 = 1
            X.MIz r1 = new X.MIz
            r1.<init>(r7, r2)
            r4.A03(r6, r3, r1)
        L_0x011d:
            java.lang.Object r1 = r5.A01
            int r5 = X.AnonymousClass7TE.A0M(r1)
            r2 = 1
            r3 = 0
            java.lang.String r7 = "creationMainActionsFlipper"
            r6 = 0
            r4 = 8
            if (r5 == r3) goto L_0x0250
            if (r5 == r2) goto L_0x0208
            r6 = 2
            if (r5 == r6) goto L_0x01ac
            r1 = 3
            if (r5 != r1) goto L_0x09cd
            java.lang.Object r2 = r0.A01
            com.instagram.creation.fragment.AlbumEditFragment r2 = (com.instagram.creation.fragment.AlbumEditFragment) r2
            android.widget.ViewFlipper r1 = r2.A09
            if (r1 == 0) goto L_0x0306
            r1.setDisplayedChild(r6)
            X.0eM r1 = r2.A0d
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.C59888JbD.A00(r1)
            java.lang.Object r1 = r0.A04
            X.JTO.A1a(r1, r4)
            android.view.View r1 = r2.A00
            if (r1 == 0) goto L_0x0154
            r1.setVisibility(r4)
        L_0x0154:
            android.view.View r1 = r2.A01
            if (r1 == 0) goto L_0x015b
            r1.setVisibility(r4)
        L_0x015b:
            android.view.View r1 = r2.A05
            if (r1 == 0) goto L_0x0162
            r1.setVisibility(r4)
        L_0x0162:
            boolean r2 = com.instagram.creation.fragment.AlbumEditFragment.A0I(r2)
            java.lang.Object r1 = r0.A03
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r1 = (com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar) r1
            android.widget.TextView r0 = r1.A0B
            if (r2 == 0) goto L_0x01a4
            r0.setVisibility(r4)
            r1.A02(r3, r3)
            goto L_0x0079
        L_0x0176:
            X.LOy r1 = r7.A0M
            if (r1 == 0) goto L_0x011d
            r1.A01(r6)
            goto L_0x011d
        L_0x017e:
            X.0eM r1 = r7.A0d
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r2 = r6.getTitle()
            X.KPN r1 = new X.KPN
            r1.<init>(r2)
            X.C59888JbD.A01(r3, r1)
            r1 = 2131427808(0x7f0b01e0, float:1.8477243E38)
            android.view.ViewGroup r2 = X.DbU.A0C(r4, r1)
            android.content.Context r1 = r7.getThemedContext()
            android.view.View r1 = r6.AZq(r1)
            r2.addView(r1)
            goto L_0x011d
        L_0x01a4:
            r0.setVisibility(r3)
            r1.A02(r4, r3)
            goto L_0x0079
        L_0x01ac:
            java.lang.Object r5 = r0.A01
            com.instagram.creation.fragment.AlbumEditFragment r5 = (com.instagram.creation.fragment.AlbumEditFragment) r5
            android.widget.ViewFlipper r1 = r5.A09
            if (r1 == 0) goto L_0x0306
            r1.setDisplayedChild(r6)
            X.0eM r1 = r5.A0d
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.C59888JbD.A00(r1)
            java.lang.Object r1 = r0.A04
            X.JTO.A1a(r1, r4)
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x01cc
            r1.setVisibility(r4)
        L_0x01cc:
            android.view.View r1 = r5.A01
            if (r1 == 0) goto L_0x01d3
            r1.setVisibility(r4)
        L_0x01d3:
            android.view.View r1 = r5.A05
            if (r1 == 0) goto L_0x01da
            r1.setVisibility(r4)
        L_0x01da:
            boolean r1 = com.instagram.creation.fragment.AlbumEditFragment.A0I(r5)
            java.lang.Object r2 = r0.A03
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r2 = (com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar) r2
            android.widget.TextView r0 = r2.A0B
            if (r1 == 0) goto L_0x0201
            r0.setVisibility(r3)
            r2.A02(r4, r3)
            android.content.res.Resources r1 = X.DbV.A05(r5)
            r0 = 2131962420(0x7f132a34, float:1.9561565E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A03(r0, r3)
        L_0x01fa:
            X.8Xk r0 = r5.A0I
            X.JTS.A1N(r0, r5)
            goto L_0x0079
        L_0x0201:
            r0.setVisibility(r4)
            r2.A02(r3, r3)
            goto L_0x01fa
        L_0x0208:
            java.lang.Object r5 = r0.A01
            com.instagram.creation.fragment.AlbumEditFragment r5 = (com.instagram.creation.fragment.AlbumEditFragment) r5
            android.widget.ViewFlipper r1 = r5.A09
            if (r1 == 0) goto L_0x0306
            r1.setDisplayedChild(r2)
            java.lang.Object r2 = r0.A05
            android.view.View r2 = (android.view.View) r2
            r1 = 2131427808(0x7f0b01e0, float:1.8477243E38)
            android.view.ViewGroup r1 = X.DbU.A0C(r2, r1)
            r1.removeAllViews()
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x0228
            r1.setVisibility(r3)
        L_0x0228:
            android.view.View r1 = r5.A01
            if (r1 == 0) goto L_0x022f
            r1.setVisibility(r3)
        L_0x022f:
            android.view.View r1 = r5.A05
            if (r1 == 0) goto L_0x0236
            r1.setVisibility(r3)
        L_0x0236:
            java.lang.Object r2 = r0.A03
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r2 = (com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar) r2
            android.widget.TextView r1 = r2.A0B
            r1.setVisibility(r4)
            r2.A02(r3, r3)
            java.lang.Object r0 = r0.A04
            X.JTO.A1a(r0, r3)
            boolean r0 = r5.A0S
            if (r0 != 0) goto L_0x02c3
            r2.A03(r6, r3)
            goto L_0x0079
        L_0x0250:
            java.lang.Object r5 = r0.A01
            com.instagram.creation.fragment.AlbumEditFragment r5 = (com.instagram.creation.fragment.AlbumEditFragment) r5
            android.widget.ViewFlipper r1 = r5.A09
            if (r1 == 0) goto L_0x0306
            r1.setDisplayedChild(r3)
            java.lang.Object r2 = r0.A05
            android.view.View r2 = (android.view.View) r2
            r1 = 2131427808(0x7f0b01e0, float:1.8477243E38)
            android.view.ViewGroup r1 = X.DbU.A0C(r2, r1)
            r1.removeAllViews()
            boolean r2 = com.instagram.creation.fragment.AlbumEditFragment.A0I(r5)
            java.lang.Object r1 = r0.A04
            android.view.View r1 = (android.view.View) r1
            if (r2 == 0) goto L_0x02a2
            r1.setVisibility(r4)
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x027d
            r1.setVisibility(r4)
        L_0x027d:
            android.view.View r1 = r5.A01
            if (r1 == 0) goto L_0x0284
            r1.setVisibility(r4)
        L_0x0284:
            android.view.View r1 = r5.A05
            if (r1 == 0) goto L_0x028b
            r1.setVisibility(r4)
        L_0x028b:
            java.lang.Object r2 = r0.A03
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r2 = (com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar) r2
            r2.A02(r4, r3)
            android.content.res.Resources r1 = X.DbV.A05(r5)
            r0 = 2131962420(0x7f132a34, float:1.9561565E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A03(r0, r3)
            goto L_0x0079
        L_0x02a2:
            r1.setVisibility(r3)
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x02ac
            r1.setVisibility(r3)
        L_0x02ac:
            android.view.View r1 = r5.A01
            if (r1 == 0) goto L_0x02b3
            r1.setVisibility(r3)
        L_0x02b3:
            android.view.View r1 = r5.A05
            if (r1 == 0) goto L_0x02ba
            r1.setVisibility(r3)
        L_0x02ba:
            java.lang.Object r0 = r0.A03
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r0 = (com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar) r0
            r0.A02(r3, r3)
            android.widget.TextView r1 = r0.A0B
        L_0x02c3:
            r1.setVisibility(r4)
            goto L_0x0079
        L_0x02c8:
            X.0eS.A00(r64)
            java.lang.Object r5 = r0.A00
            X.JwH r5 = (X.C61079JwH) r5
            java.lang.Object r3 = r0.A05
            com.instagram.igds.components.textcell.IgdsListCell r3 = (com.instagram.igds.components.textcell.IgdsListCell) r3
            java.lang.Object r2 = r5.A01
            X.NkD r1 = X.C69373NkD.SHOUTOUT
            r4 = 1
            boolean r1 = X.AnonymousClass7TF.A1W(r2, r1)
            r3.setChecked(r1)
            java.lang.Object r2 = r0.A04
            com.instagram.igds.components.textcell.IgdsListCell r2 = (com.instagram.igds.components.textcell.IgdsListCell) r2
            java.lang.Object r3 = r5.A01
            X.NkD r3 = (X.C69373NkD) r3
            X.NkD r1 = X.C69373NkD.MESSAGE
            boolean r1 = X.AnonymousClass7TF.A1W(r3, r1)
            r2.setChecked(r1)
            java.lang.Object r2 = r0.A03
            com.instagram.igds.components.textcell.IgdsListCell r2 = (com.instagram.igds.components.textcell.IgdsListCell) r2
            X.NkD r1 = X.C69373NkD.CUSTOM
            if (r3 == r1) goto L_0x02f9
            r4 = 0
        L_0x02f9:
            r2.setChecked(r4)
            java.lang.Object r0 = r0.A01
            X.NIO r0 = (X.NIO) r0
            X.O6P r0 = r0.A00
            if (r0 != 0) goto L_0x030e
            java.lang.String r7 = "delegate"
        L_0x0306:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x030e:
            java.lang.String r1 = r5.A02
            X.AnonymousClass7TG.A1N(r3, r1)
            X.NVW r0 = r0.A00
            X.Mu3 r0 = r0.A04()
            r0.A01(r3, r1)
            goto L_0x0079
        L_0x031e:
            X.0eS.A00(r64)
            java.lang.Object r5 = r0.A00
            X.LGS r5 = (X.LGS) r5
            java.lang.Object r1 = r0.A05
            X.LEO r1 = (X.LEO) r1
            X.LBK r1 = r1.A00()
            boolean r1 = r5.A05(r1)
            if (r1 == 0) goto L_0x0356
            java.lang.Object r4 = r0.A01
            X.8qK r4 = (X.C367188qK) r4
            com.instagram.common.session.UserSession r3 = r4.A00
            com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository r2 = r4.A01
            java.lang.Object r1 = r0.A04
            X.818 r1 = (X.AnonymousClass818) r1
            X.A1G.A00(r1, r3, r2, r5)
            X.8qL r4 = r4.A02
            r2 = 1
            java.lang.String r1 = "displayed_upsell"
            r4.A00(r1, r2)
            java.lang.Object r1 = r0.A03
            X.MSr r1 = (X.C66463MSr) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0351:
            r1.DfE(r0)
            goto L_0x0079
        L_0x0356:
            java.lang.Object r1 = r0.A03
            X.MSr r1 = (X.C66463MSr) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0351
        L_0x035d:
            X.0eS.A00(r64)
            java.lang.Object r7 = r0.A01
            X.LFx r7 = (X.C63970LFx) r7
            java.lang.Object r1 = r0.A03
            X.2Rw r1 = (X.2Rw) r1
            int r6 = r1.getItemCount()
            java.lang.Object r5 = r0.A04
            com.instagram.ui.emptystaterow.EmptyStateView r5 = (com.instagram.ui.emptystaterow.EmptyStateView) r5
            X.0qQ.A0A(r5)
            r4 = 1
            boolean r3 = X.AnonymousClass7TF.A1Q(r6)
            r2 = 8
            r1 = 8
            if (r3 == 0) goto L_0x037f
            r1 = 0
        L_0x037f:
            r5.setVisibility(r1)
            java.lang.Object r1 = r0.A05
            android.view.View r1 = (android.view.View) r1
            X.0qQ.A0A(r1)
            if (r6 <= 0) goto L_0x038c
            r2 = 0
        L_0x038c:
            r1.setVisibility(r2)
            java.lang.Object r3 = r0.A00
            com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent r3 = (com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent) r3
            X.KzI r2 = r7.A02
            boolean r1 = r2 instanceof X.C60334Jjd
            if (r1 == 0) goto L_0x039c
            r0 = 1
            if (r6 > 0) goto L_0x039d
        L_0x039c:
            r0 = 0
        L_0x039d:
            r3.setRefreshing(r0)
            if (r1 != 0) goto L_0x03b0
            if (r6 <= 0) goto L_0x03b0
        L_0x03a4:
            r3.setEnabled(r4)
            boolean r0 = r2 instanceof X.C60333Jjc
            if (r0 == 0) goto L_0x03b2
            r5.A0J()
            goto L_0x0079
        L_0x03b0:
            r4 = 0
            goto L_0x03a4
        L_0x03b2:
            if (r1 == 0) goto L_0x03bb
            if (r6 != 0) goto L_0x03bb
            r5.A0L()
            goto L_0x0079
        L_0x03bb:
            boolean r0 = r2 instanceof X.C60332Jjb
            if (r0 == 0) goto L_0x03cc
            X.KzI r0 = r7.A00
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x03cc
            if (r6 != 0) goto L_0x03cc
            r5.A0I()
            goto L_0x0079
        L_0x03cc:
            r5.A0K()
            goto L_0x0079
        L_0x03d1:
            X.0eS.A00(r64)
            java.lang.Object r5 = r0.A00
            X.EaX r5 = (X.C48191EaX) r5
            X.EOm r1 = X.C47961EOm.A00
            boolean r1 = X.0qQ.A0K(r5, r1)
            r4 = 0
            r3 = 8
            if (r1 == 0) goto L_0x03f4
            java.lang.Object r1 = r0.A04
            X.JTO.A1a(r1, r3)
            java.lang.Object r1 = r0.A05
            android.view.View r1 = (android.view.View) r1
            r0 = 2131435629(0x7f0b206d, float:1.8493106E38)
            X.Dbb.A0t(r1, r0, r4)
            goto L_0x0079
        L_0x03f4:
            boolean r1 = r5 instanceof X.C47960EOl
            if (r1 == 0) goto L_0x09d2
            java.lang.Object r1 = r0.A01
            X.E2U r1 = (X.E2U) r1
            X.0eM r1 = r1.A01
            java.lang.Object r1 = r1.getValue()
            X.Dbx r1 = (X.C46329Dbx) r1
            X.34p r1 = r1.A00
            r1.A05()
            java.lang.Object r2 = r0.A05
            android.view.View r2 = (android.view.View) r2
            r1 = 2131435629(0x7f0b206d, float:1.8493106E38)
            X.Dbb.A0t(r2, r1, r3)
            java.lang.Object r1 = r0.A04
            X.JTO.A1a(r1, r4)
            java.lang.Object r1 = r0.A03
            X.Dlt r1 = (X.C46817Dlt) r1
            X.EOl r5 = (X.C47960EOl) r5
            java.util.List r0 = r5.A00
            X.0qQ.A0B(r0, r4)
            r1.A00 = r0
            r1.notifyDataSetChanged()
            goto L_0x0079
        L_0x042a:
            X.0eS.A00(r64)
            java.lang.Object r3 = r0.A04
            X.0sP r3 = (X.0sP) r3
            java.lang.Object r1 = r0.A05
            X.Hl6 r1 = (X.C55647Hl6) r1
            X.GZF r2 = r1.A00
            int r1 = r2.A03()
            java.lang.Integer r1 = X.JTO.A0w(r1)
            r3.invoke(r1)
            int r4 = r2.A03()
            java.lang.Object r1 = r0.A00
            X.Dry r1 = (X.C47183Dry) r1
            com.instagram.opal.impl.data.OpalProfileData r1 = r1.A05
            java.lang.String r3 = r1.A05
            java.lang.Object r2 = r0.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A03
            X.0iw r1 = (X.AnonymousClass0iw) r1
            java.lang.String r0 = "swipe_to"
            X.I7S.A0B(r1, r2, r3, r0, r4)
            goto L_0x0079
        L_0x045d:
            X.0eS.A00(r64)
            java.lang.Object r1 = r0.A03
            X.G85 r1 = (X.G85) r1
            java.lang.Object r2 = r0.A04
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.Object r6 = r0.A01
            X.DiE r6 = (X.C46634DiE) r6
            java.lang.Object r4 = r0.A00
            X.0aP r4 = (X.AnonymousClass0aP) r4
            r3 = 0
            java.lang.Object r5 = r0.A05
            X.Lt9 r5 = (X.C65427Lt9) r5
            r1.CJF(r2, r3, r4, r5, r6)
            goto L_0x0079
        L_0x047a:
            X.0eS.A00(r64)
            java.lang.Object r1 = r0.A00
            X.MQX r1 = (X.MQX) r1
            boolean r2 = r1 instanceof X.C61201Jyu
            if (r2 == 0) goto L_0x04e2
            java.lang.Object r7 = r0.A01
            X.K6q r7 = (X.C61419K6q) r7
            X.Jyu r1 = (X.C61201Jyu) r1
            java.lang.String r6 = r1.A00
            java.lang.String r4 = r1.A01
            r1 = 98
            java.lang.String r3 = X.AnonymousClass000.A00(r1)
            java.lang.String r2 = "direct_thread_reply_thread_view"
            if (r6 == 0) goto L_0x04d5
            X.0eM r5 = r7.A06
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            X.Dfc r1 = X.C46548Dgp.A01(r1, r6, r2, r3)
        L_0x04a3:
            com.instagram.profile.intf.UserDetailLaunchConfig r4 = r1.A04()
            X.6Yo r3 = X.DbZ.A0P(r7, r5)
            r3.A08()
            X.1a1 r2 = X.C46447Df9.A02()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            androidx.fragment.app.Fragment r1 = r2.A02(r1, r4)
            r3.A0D(r1)
            r3.A04()
        L_0x04c0:
            java.lang.Object r0 = r0.A01
            X.K6q r0 = (X.C61419K6q) r0
            X.0eM r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.JjH r0 = (X.C60314JjH) r0
            X.05G r1 = r0.A0D
            X.LqC r0 = X.C65257LqC.A00
            r1.Epw(r0)
            goto L_0x0079
        L_0x04d5:
            if (r4 == 0) goto L_0x04c0
            X.0eM r5 = r7.A06
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            X.Dfc r1 = X.C46548Dgp.A02(r1, r4, r2, r3)
            goto L_0x04a3
        L_0x04e2:
            boolean r2 = r1 instanceof X.C61203Jyw
            if (r2 == 0) goto L_0x0703
            java.lang.Object r10 = r0.A01
            X.K6q r10 = (X.C61419K6q) r10
            java.lang.Object r5 = r0.A04
            X.LqU r5 = (X.C65275LqU) r5
            X.Jyw r1 = (X.C61203Jyw) r1
            java.lang.Object r2 = r0.A03
            X.LZa r2 = (X.C64300LZa) r2
            android.view.View r15 = r2.A01
            X.0eM r2 = r10.A02
            java.lang.Object r4 = r2.getValue()
            X.OLz r4 = (X.C70804OLz) r4
            r24 = 0
            r2 = r24
            boolean r50 = X.AnonymousClass7TF.A1U(r2, r4, r1)
            r14 = 2
            X.0qQ.A0B(r15, r14)
            r5.A00 = r1
            X.4DH r8 = r5.A02
            android.content.Context r26 = r8.requireContext()
            X.LBc r25 = com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel.A0a
            java.lang.String r6 = r4.A09
            r23 = 0
            com.instagram.model.direct.messageid.MessageIdentifier r22 = new com.instagram.model.direct.messageid.MessageIdentifier
            r3 = r22
            r2 = r23
            r3.<init>(r6, r2)
            com.instagram.common.session.UserSession r6 = r5.A03
            java.lang.String r9 = r6.A06
            X.0Tu r7 = X.0Tu.A05
            r12 = 36319407395446100(0x81084f00421d54, double:3.0318777111705776E-306)
            boolean r21 = X.182.A06(r7, r6, r12)
            r2 = 36319407396232543(0x81084f004e1d5f, double:3.031877711667927E-306)
            boolean r20 = X.182.A06(r7, r6, r2)
            r2 = 36319407397215595(0x81084f005d1d6b, double:3.0318777122896133E-306)
            boolean r19 = X.182.A06(r7, r6, r2)
            android.content.Context r2 = r8.requireContext()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            boolean r18 = r4.A00()
            if (r18 == 0) goto L_0x0570
            java.lang.Integer r30 = X.AnonymousClass05K.A01
            r8 = 2131954242(0x7f130a42, float:1.9544978E38)
            java.lang.String r32 = X.AnonymousClass7TE.A16(r2, r8)
            r8 = 2131238713(0x7f081f39, float:1.8093712E38)
            java.lang.Integer r31 = java.lang.Integer.valueOf(r8)
            X.NkG r29 = X.C69376NkG.A09
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r8 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r27 = r8
            r28 = r23
            r33 = r23
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r3.add(r8)
        L_0x0570:
            com.instagram.user.model.User r8 = r1.A03
            r34 = r8
            java.lang.String r8 = r34.getId()
            boolean r17 = X.C51966G9m.A1a(r8, r9)
            java.lang.String r11 = r34.getId()
            java.lang.String r8 = r4.A03
            boolean r16 = X.0qQ.A0K(r11, r8)
            if (r17 == 0) goto L_0x05b0
            if (r20 == 0) goto L_0x05b0
            boolean r8 = r1.A08
            if (r8 == 0) goto L_0x06dc
            if (r19 == 0) goto L_0x06dc
            java.lang.Integer r30 = X.AnonymousClass05K.A0a
            r8 = 2131963365(0x7f132de5, float:1.9563481E38)
            java.lang.String r32 = X.AnonymousClass7TE.A16(r2, r8)
            X.NkG r29 = X.C69376NkG.A09
            r8 = 2131238268(0x7f081d7c, float:1.809281E38)
        L_0x059e:
            java.lang.Integer r31 = java.lang.Integer.valueOf(r8)
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r8 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r27 = r8
            r28 = r23
            r33 = r23
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r3.add(r8)
        L_0x05b0:
            boolean r8 = r4.A0D
            if (r8 != 0) goto L_0x05e8
            boolean r8 = r4.A0E
            if (r8 != 0) goto L_0x05c8
            boolean r4 = r4.A0F
            if (r4 == 0) goto L_0x05be
            if (r16 == 0) goto L_0x05c8
        L_0x05be:
            java.lang.String r4 = r34.getId()
            boolean r4 = X.0qQ.A0K(r4, r9)
            if (r4 == 0) goto L_0x05e8
        L_0x05c8:
            java.lang.Integer r30 = X.AnonymousClass05K.A0j
            r4 = 2131957531(0x7f13171b, float:1.9551649E38)
            java.lang.String r32 = X.AnonymousClass7TE.A16(r2, r4)
            X.NkG r29 = X.C69376NkG.A07
            r4 = 2131238196(0x7f081d34, float:1.8092664E38)
            java.lang.Integer r31 = java.lang.Integer.valueOf(r4)
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r4 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r27 = r4
            r28 = r23
            r33 = r23
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r3.add(r4)
        L_0x05e8:
            if (r17 == 0) goto L_0x060a
            java.lang.Integer r30 = X.AnonymousClass05K.A0N
            r4 = 2131972171(0x7f13504b, float:1.9581342E38)
            java.lang.String r32 = X.AnonymousClass7TE.A16(r2, r4)
            X.NkG r29 = X.C69376NkG.A07
            r4 = 2131238715(0x7f081f3b, float:1.8093717E38)
            java.lang.Integer r31 = java.lang.Integer.valueOf(r4)
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r4 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r27 = r4
            r28 = r23
            r33 = r23
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r3.add(r4)
        L_0x060a:
            if (r18 == 0) goto L_0x062d
            if (r21 != 0) goto L_0x062d
            boolean r4 = r1.A07
            if (r4 == 0) goto L_0x06d5
            java.lang.Integer r30 = X.AnonymousClass05K.A05
            r4 = 2131975945(0x7f135f09, float:1.9588997E38)
        L_0x0617:
            java.lang.String r32 = X.AnonymousClass7TE.A16(r2, r4)
            X.NkG r29 = X.C69376NkG.A09
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r2 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r27 = r2
            r28 = r23
            r31 = r23
            r33 = r23
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r3.add(r2)
        L_0x062d:
            java.util.List r43 = X.00k.A0a(r3)
            android.graphics.PointF r3 = r1.A00
            android.graphics.Rect r2 = r1.A01
            boolean r4 = r1.A07
            if (r4 == 0) goto L_0x06d1
            java.lang.String r4 = "❤"
            java.util.List r44 = X.AnonymousClass7TE.A1I(r4)
        L_0x063f:
            java.lang.String r1 = r1.A04
            boolean r53 = X.AnonymousClass7TF.A1V(r1)
            boolean r54 = X.182.A06(r7, r6, r12)
            boolean r59 = X.182.A06(r7, r6, r12)
            r46 = 29
            r48 = 0
            r27 = r3
            r28 = r2
            r29 = r23
            r30 = r23
            r31 = r22
            r32 = r23
            r33 = r23
            r34 = r23
            r35 = r23
            r36 = r23
            r37 = r23
            r38 = r23
            r39 = r23
            r40 = r23
            r41 = r23
            r42 = r23
            r45 = r23
            r47 = r24
            r51 = r24
            r52 = r24
            r55 = r50
            r56 = r24
            r57 = r24
            r58 = r24
            r60 = r24
            r61 = r24
            r62 = r24
            com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel r1 = r25.A00(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)
            r5.A01 = r1
            r16 = r6
            r17 = r1
            r18 = r23
            r19 = r23
            r20 = r24
            r21 = r24
            r22 = r24
            r23 = r24
            X.NIE r3 = X.NIE.A01(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r3.A0N(r5)
            int r1 = r15.getVisibility()
            if (r1 != 0) goto L_0x06cf
            int[] r1 = new int[r14]
            r15.getLocationOnScreen(r1)
            r1 = r1[r50]
        L_0x06b1:
            r3.A0M(r1)
            int r2 = r15.getHeight()
            int r1 = X.DbY.A01(r26)
            int r2 = r2 + r1
            r3.A01 = r2
            X.0s1 r2 = X.DbW.A0C(r10)
            java.lang.String r1 = "BroadcastChannelRepliesListFullScreenFragment.MESSAGE_ACTIONS_FRAGMENT_TAG"
            r2.A0B(r3, r1)
            r2.A00()
            r10.A01 = r3
            goto L_0x04c0
        L_0x06cf:
            r1 = -1
            goto L_0x06b1
        L_0x06d1:
            r44 = r23
            goto L_0x063f
        L_0x06d5:
            java.lang.Integer r30 = X.AnonymousClass05K.A06
            r4 = 2131964931(0x7f133403, float:1.9566658E38)
            goto L_0x0617
        L_0x06dc:
            X.7de r11 = r1.A02
            X.7de r8 = X.C335857de.COVERED_COMMENT
            if (r11 != r8) goto L_0x06f6
            boolean r8 = r1.A06
            if (r8 == 0) goto L_0x06f6
            java.lang.Integer r30 = X.AnonymousClass05K.A0b
        L_0x06e8:
            r8 = 2131954253(0x7f130a4d, float:1.9545E38)
            java.lang.String r32 = X.AnonymousClass7TE.A16(r2, r8)
            X.NkG r29 = X.C69376NkG.A09
            r8 = 2131238274(0x7f081d82, float:1.8092822E38)
            goto L_0x059e
        L_0x06f6:
            if (r19 == 0) goto L_0x05b0
            X.7de r8 = X.C335857de.HIDDEN_COMMENT
            if (r11 != r8) goto L_0x05b0
            boolean r8 = r1.A06
            if (r8 == 0) goto L_0x05b0
            java.lang.Integer r30 = X.AnonymousClass05K.A0c
            goto L_0x06e8
        L_0x0703:
            boolean r2 = r1 instanceof X.C61200Jyt
            if (r2 == 0) goto L_0x0760
            java.lang.Object r4 = r0.A01
            X.K6q r4 = (X.C61419K6q) r4
            X.0eM r2 = r4.A05
            java.lang.Object r2 = r2.getValue()
            X.L1B r2 = (X.L1B) r2
            android.content.Context r7 = r4.requireContext()
            r3 = 24
            X.Phd r6 = new X.Phd
            r6.<init>(r3, r4, r1)
            r5 = 1
            X.Dc2 r1 = r2.A00
            if (r1 == 0) goto L_0x0726
            X.DbX.A1R(r1)
        L_0x0726:
            android.content.res.Resources r3 = r7.getResources()
            r1 = 2131820593(0x7f110031, float:1.9273905E38)
            java.lang.String r1 = X.DbY.A0d(r3, r5, r1)
            X.0qQ.A07(r1)
            X.6ap r4 = X.DbS.A0a()
            r4.A0D = r1
            android.content.res.Resources r3 = r7.getResources()
            r1 = 2131975851(0x7f135eab, float:1.9588806E38)
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r3, r1)
            r4.A0G = r1
            r3 = 3
            X.Lrz r1 = new X.Lrz
            r1.<init>(r3, r6, r2)
            r4.A0A(r1)
            r4.A0L = r5
            r4.A06()
            X.Dc2 r1 = r4.A00()
            X.DbX.A1S(r1)
        L_0x075c:
            r2.A00 = r1
            goto L_0x04c0
        L_0x0760:
            boolean r2 = r1 instanceof X.LqB
            if (r2 == 0) goto L_0x0779
            java.lang.Object r1 = r0.A01
            X.K6q r1 = (X.C61419K6q) r1
            X.0eM r1 = r1.A05
            java.lang.Object r2 = r1.getValue()
            X.L1B r2 = (X.L1B) r2
            X.Dc2 r1 = r2.A00
            if (r1 == 0) goto L_0x0777
            X.DbX.A1R(r1)
        L_0x0777:
            r1 = 0
            goto L_0x075c
        L_0x0779:
            boolean r2 = r1 instanceof X.C61204Jyx
            if (r2 == 0) goto L_0x0802
            java.lang.Object r3 = r0.A01
            X.K6q r3 = (X.C61419K6q) r3
            androidx.fragment.app.FragmentActivity r8 = r3.requireActivity()
            X.0eM r2 = r3.A06
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r2)
            X.Jyx r1 = (X.C61204Jyx) r1
            java.lang.Object r7 = r0.A05
            X.K6q r7 = (X.C61419K6q) r7
            X.0eM r2 = r3.A04
            java.lang.Object r6 = r2.getValue()
            X.LSm r6 = (X.LSm) r6
            r9 = 0
            r11 = 1
            X.0qQ.A0B(r14, r11)
            X.C51974G9v.A1M(r1, r7, r6)
            java.lang.String r4 = r1.A05
            X.TpH r3 = r1.A01
            X.UzD r2 = r1.A02
            r13 = r7
            r15 = r3
            r16 = r2
            r17 = r4
            r12 = r8
            X.OcF r5 = X.ORV.A01(r12, r13, r14, r15, r16, r17)
            com.instagram.user.model.User r10 = r1.A00
            r5.A01 = r10
            X.Pvj r2 = r1.A03
            r5.A07(r2)
            r5.A05()
            X.7Pr r3 = X.DbS.A0W(r14)
            java.lang.String r2 = r10.getUsername()
            r3.A0d = r2
            X.DbS.A1S(r3, r11)
            r2 = 1060320051(0x3f333333, float:0.7)
            r3.A03 = r2
            X.7Pu r4 = r3.A00()
            java.lang.String r15 = r10.getId()
            java.lang.String r3 = r1.A04
            java.lang.String r2 = r1.A07
            r18 = 8
            r17 = r2
            r19 = r9
            r16 = r3
            X.Nhk r3 = X.O3G.A00(r14, r15, r16, r17, r18, r19)
            X.0qQ.A0B(r4, r9)
            r3.A02 = r4
            X.M13 r2 = new X.M13
            r9 = r2
            r10 = r8
            r11 = r14
            r12 = r6
            r13 = r1
            r14 = r7
            r15 = r4
            r16 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r3.A06 = r2
            r4.A02(r8, r3)
            goto L_0x04c0
        L_0x0802:
            r4 = 0
            boolean r3 = r1 instanceof X.C61205Jyy
            if (r3 == 0) goto L_0x0820
            r2 = r1
            X.Jyy r2 = (X.C61205Jyy) r2
            int r2 = r2.A00
            if (r2 != r4) goto L_0x0820
            java.lang.Object r2 = r0.A01
            android.content.Context r3 = X.DbT.A07(r2)
            r2 = 2131974093(0x7f1357cd, float:1.958524E38)
        L_0x0817:
            X.Jyy r1 = (X.C61205Jyy) r1
            java.lang.String r1 = r1.A01
            X.C59689JTv.A01(r3, r1, r2, r4)
            goto L_0x04c0
        L_0x0820:
            r6 = 1
            if (r3 == 0) goto L_0x0834
            r2 = r1
            X.Jyy r2 = (X.C61205Jyy) r2
            int r2 = r2.A00
            if (r2 != r6) goto L_0x0834
            java.lang.Object r2 = r0.A01
            android.content.Context r3 = X.DbT.A07(r2)
            r2 = 2131954212(0x7f130a24, float:1.9544917E38)
            goto L_0x0817
        L_0x0834:
            boolean r3 = r1 instanceof X.C61202Jyv
            if (r3 == 0) goto L_0x0890
            r2 = r1
            X.Jyv r2 = (X.C61202Jyv) r2
            int r2 = r2.A00
            if (r2 != r4) goto L_0x0890
            java.lang.Object r4 = r0.A01
            X.K6q r4 = (X.C61419K6q) r4
            X.0eM r2 = r4.A03
            java.lang.Object r2 = r2.getValue()
            X.L1A r2 = (X.L1A) r2
            android.content.Context r7 = r4.requireContext()
            r3 = 25
            X.Phd r5 = new X.Phd
            r5.<init>(r3, r4, r1)
            X.Dc2 r1 = r2.A00
            if (r1 == 0) goto L_0x085d
            X.DbX.A1R(r1)
        L_0x085d:
            r1 = 2131954215(0x7f130a27, float:1.9544923E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r7, r1)
            X.6ap r4 = X.DbS.A0a()
            r4.A0D = r1
            android.content.res.Resources r3 = r7.getResources()
            r1 = 2131975851(0x7f135eab, float:1.9588806E38)
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r3, r1)
            r4.A0G = r1
            r3 = 2
            X.Lrz r1 = new X.Lrz
            r1.<init>(r3, r5, r2)
            r4.A0A(r1)
            r4.A0L = r6
            r4.A06()
            X.Dc2 r1 = r4.A00()
            X.DbX.A1S(r1)
        L_0x088c:
            r2.A00 = r1
            goto L_0x04c0
        L_0x0890:
            boolean r2 = r1 instanceof X.C65256LqA
            if (r2 == 0) goto L_0x08a9
            java.lang.Object r1 = r0.A01
            X.K6q r1 = (X.C61419K6q) r1
            X.0eM r1 = r1.A03
            java.lang.Object r2 = r1.getValue()
            X.L1A r2 = (X.L1A) r2
            X.Dc2 r1 = r2.A00
            if (r1 == 0) goto L_0x08a7
            X.DbX.A1R(r1)
        L_0x08a7:
            r1 = 0
            goto L_0x088c
        L_0x08a9:
            if (r3 == 0) goto L_0x04c0
            r2 = r1
            X.Jyv r2 = (X.C61202Jyv) r2
            int r3 = r2.A00
            if (r3 != r6) goto L_0x08d4
            java.lang.Object r5 = r0.A01
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            X.8ab r4 = X.DbW.A0U(r5)
            r2 = 2131954255(0x7f130a4f, float:1.9545004E38)
            r4.A09(r2)
            r3 = 2131954253(0x7f130a4d, float:1.9545E38)
            r2 = 37
        L_0x08c5:
            X.LV0 r1 = X.LV0.A00(r1, r5, r2)
            r4.A0G(r1, r3)
            r4.A05()
            X.AnonymousClass7TH.A0a(r4, r6)
            goto L_0x04c0
        L_0x08d4:
            r2 = 2
            if (r3 != r2) goto L_0x04c0
            java.lang.Object r5 = r0.A01
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            X.8ab r4 = X.DbW.A0U(r5)
            r2 = 2131954255(0x7f130a4f, float:1.9545004E38)
            r4.A09(r2)
            r3 = 2131954253(0x7f130a4d, float:1.9545E38)
            r2 = 38
            goto L_0x08c5
        L_0x08eb:
            X.0eS.A00(r64)
            java.lang.Object r1 = r0.A03
            X.82p r1 = (X.C3499582p) r1
            X.82q r4 = r1.A00()
            java.lang.Object r5 = r0.A05
            X.4mi r5 = (X.C273514mi) r5
            java.lang.Object r3 = r0.A00
            com.instagram.creation.base.PhotoSession r3 = (com.instagram.creation.base.PhotoSession) r3
            java.lang.Object r1 = r0.A04
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.A01
            X.JcW r0 = (X.C59963JcW) r0
            com.instagram.common.session.UserSession r2 = r0.A09
            r6 = 0
            r7 = 1
            X.LIb.A01(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0079
        L_0x090f:
            X.0eS.A00(r64)
            java.lang.Object r2 = r0.A00
            X.7aa r2 = (X.C334047aa) r2
            boolean r1 = r2 instanceof X.C334947c8
            r6 = 0
            if (r1 == 0) goto L_0x0079
            X.7c8 r2 = (X.C334947c8) r2
            if (r2 == 0) goto L_0x0079
            java.util.List r1 = r2.A09
            java.lang.Object r5 = r0.A04
            X.7aD r5 = (X.C333827aD) r5
            java.util.Iterator r4 = r1.iterator()
        L_0x0929:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0941
            java.lang.Object r3 = r4.next()
            r1 = r3
            X.7aD r1 = (X.C333827aD) r1
            java.lang.String r2 = r1.A00
            java.lang.String r1 = r5.A00
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0929
            r6 = r3
        L_0x0941:
            X.7aD r6 = (X.C333827aD) r6
            if (r6 == 0) goto L_0x0079
            java.lang.Object r3 = r0.A01
            X.7be r3 = (X.C334657be) r3
            java.lang.Object r2 = r0.A03
            X.A64 r2 = (X.A64) r2
            java.lang.Object r1 = r0.A05
            X.7b2 r1 = (X.C334297b2) r1
            com.instagram.common.session.UserSession r0 = r3.A05
            X.7dj r6 = (X.C335907dj) r6
            X.C334657be.A01(r6, r2, r3, r1, r0)
            goto L_0x0079
        L_0x095a:
            X.0eS.A00(r64)
            java.lang.Object r1 = r0.A00
            X.4Cq r1 = (X.C262224Cq) r1
            java.lang.Object r6 = r0.A01
            X.E2U r6 = (X.E2U) r6
            X.0eM r2 = r6.A03
            java.lang.Object r2 = r2.getValue()
            X.Dl0 r2 = (X.C46773Dl0) r2
            X.0r6 r4 = r2.A06
            r8 = 0
            r3 = 24
            X.Fy7 r2 = new X.Fy7
            r2.<init>(r6, r8, r3)
            X.C51968G9o.A1P(r2, r1, r4)
            X.0eM r2 = r6.A03
            java.lang.Object r2 = r2.getValue()
            X.Dl0 r2 = (X.C46773Dl0) r2
            X.05G r2 = r2.A08
            X.05F r2 = X.10b.A03(r2)
            java.lang.Object r4 = r0.A04
            java.lang.Object r5 = r0.A05
            java.lang.Object r7 = r0.A03
            r9 = 9
            X.MGM r3 = new X.MGM
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L_0x0995:
            X.C51968G9o.A1P(r3, r1, r2)
            goto L_0x0079
        L_0x099a:
            X.0eS.A00(r64)
            java.lang.Object r1 = r0.A01
            X.Qcf r1 = (X.C7909Qcf) r1
            com.facebook.smartcapture.logging.SmartCaptureLogger r2 = r1.A01
            if (r2 == 0) goto L_0x09aa
            java.lang.String r1 = "docupload_failed"
            r2.logEvent(r1)
        L_0x09aa:
            java.lang.Object r1 = r0.A04
            X.RKf r1 = (X.C8989RKf) r1
            java.lang.String r1 = r1.A03
            java.util.List r1 = X.AnonymousClass7TE.A1I(r1)
            X.6Tm r3 = new X.6Tm
            r3.<init>(r1)
            java.lang.Object r2 = r0.A05
            X.4uI r2 = (X.C277014uI) r2
            java.lang.Object r1 = r0.A03
            X.6Rx r1 = (X.C307896Rx) r1
            X.C299275ur.A00(r1, r3, r2)
            java.lang.Object r0 = r0.A00
            java.io.File r0 = (java.io.File) r0
            X.JTR.A1O(r0)
            goto L_0x0079
        L_0x09cd:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x09d2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MGM) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGM(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, AnonymousClass4D7 r7, int i) {
        super(2, r7);
        this.A02 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A00 = obj5;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGM(Object obj, Object obj2, Object obj3, Object obj4, AnonymousClass4D7 r6, int i) {
        super(2, r6);
        this.A02 = i;
        this.A04 = obj;
        this.A05 = obj2;
        this.A01 = obj3;
        this.A03 = obj4;
    }
}
