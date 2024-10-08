package X;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.shimmer.placeholder.SimpleShimmerPlaceholderView;
import com.instagram.user.model.User;

public final class H1H extends AnonymousClass4DH implements AnonymousClass4DU, C320316sB {
    public static final String __redex_internal_original_name = "RecipeSheetListFragment";
    public View A00;
    public UAE A01;
    public RecyclerView A02;
    public RecyclerView A03;
    public ShimmerFrameLayout A04;
    public IgTextView A05;
    public IgTextView A06;
    public SimpleShimmerPlaceholderView A07;
    public SimpleShimmerPlaceholderView A08;
    public C320516sV A09;
    public C320516sV A0A;
    public C53071Gi4 A0B;
    public JQY A0C;
    public C53079GiC A0D;
    public C55976Hqh A0E;
    public 1Ng A0F;
    public 1wn A0G = new IO4((Object) this, 26);
    public 2el A0H = 2el.A00();
    public Integer A0I;
    public final AnonymousClass0eM A0J = AnonymousClass0eN.A01(C58711IwK.A00(this, 25));
    public final AnonymousClass0eM A0K;
    public final AnonymousClass0eM A0L = AnonymousClass0eN.A01(C58711IwK.A00(this, 28));
    public final AnonymousClass0eM A0M;

    public final void D04() {
    }

    public final void D3f(View view) {
    }

    public final /* synthetic */ void D3i(User user) {
    }

    public final void D46(C267324bN r1, int i) {
    }

    public final boolean D47(MotionEvent motionEvent, View view, C267324bN r4, int i) {
        return true;
    }

    public final /* synthetic */ void DyE() {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final String getModuleName() {
        Integer num = this.A0I;
        if (num == null) {
            0qQ.A0F("listType");
            throw AnonymousClass00P.createAndThrow();
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return "recipe_sheet";
        }
        if (intValue == 1) {
            return "recipe_sheet_people";
        }
        if (intValue == 2) {
            return "recipe_sheet_cyclic_subtitles";
        }
        throw AnonymousClass7TE.A1K();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0M);
    }

    public H1H() {
        C58711IwK A002 = C58711IwK.A00(this, 26);
        C58711IwK A003 = C58711IwK.A00(this, 27);
        AnonymousClass0eM A004 = AnonymousClass0eN.A00(0eO.A02, C58711IwK.A00(A002, 29));
        this.A0K = DbS.A0I(C58711IwK.A00(A004, 30), A003, C58692Iw1.A00((Object) null, A004, 42), DbS.A0z(C53009Gh0.class));
        this.A0M = C227642jf.A02(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1845155189);
        H1H.super.onCreate(bundle);
        Integer[] A002 = AnonymousClass05K.A00(3);
        AnonymousClass0eM r1 = this.A0L;
        this.A0I = A002[C51966G9m.A12(r1).A01];
        this.A0E = new C55976Hqh(this, AnonymousClass7TE.A0l(this.A0M), C51966G9m.A0v(this.A0J), (int) C51966G9m.A12(r1).A02);
        AnonymousClass0fD.A09(-1167314106, A022);
    }

    /* JADX WARNING: type inference failed for: r18v2, types: [X.Kp9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v2, types: [X.4CZ, java.lang.Object, X.38Q] */
    /* JADX WARNING: type inference failed for: r20v3, types: [X.4CZ] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x02d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r31, android.view.ViewGroup r32, android.os.Bundle r33) {
        /*
            r30 = this;
            r0 = -822132263(0xffffffffceff41d9, float:-2.14125274E9)
            int r4 = X.AnonymousClass0fD.A02(r0)
            r3 = 0
            r6 = r31
            X.0qQ.A0B(r6, r3)
            r5 = r30
            java.lang.Integer r7 = r5.A0I
            java.lang.String r16 = "listType"
            r11 = 0
            if (r7 == 0) goto L_0x02df
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2 = 2
            r10 = 1
            r8 = 3
            java.lang.String r15 = "listFragmentView"
            r1 = r32
            if (r7 != r0) goto L_0x0266
            X.0eM r0 = r5.A0L
            instagram.features.clips.viewer.recipesheet.RecipeSheetParams r0 = X.C51966G9m.A12(r0)
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0266
            r0 = 2131628686(0x7f0e128e, float:1.8884672E38)
            android.view.View r1 = r6.inflate(r0, r1, r3)
            r5.A00 = r1
            if (r1 == 0) goto L_0x0105
            r0 = 2131443508(0x7f0b3f34, float:1.8509086E38)
            android.view.View r0 = r1.requireViewById(r0)
            r0.setVisibility(r3)
            X.AnonymousClass0fU.A00(r11, r0)
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x0105
            r0 = 2131443511(0x7f0b3f37, float:1.8509092E38)
            android.widget.TextView r6 = X.DbU.A0G(r1, r0)
            r0 = 2131971369(0x7f134d29, float:1.9579715E38)
            r6.setText(r0)
            android.content.Context r1 = r5.requireContext()
            r0 = 2131971370(0x7f134d2a, float:1.9579717E38)
            X.DbU.A12(r1, r6, r0)
            X.2eS.A01(r6)
            android.content.Context r7 = r5.requireContext()
            X.2el r1 = r5.A0H
            X.0eM r12 = r5.A0M
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r12)
            X.6sT r6 = new X.6sT
            r6.<init>(r0, r1, r5, r11)
            X.0eM r0 = X.I76.A02
            X.0eM r9 = r5.A0J
            X.1Xj r0 = X.C51966G9m.A0v(r9)
            X.0qQ.A0B(r0, r3)
            X.1sQ r0 = X.C51966G9m.A0n(r0)
            if (r0 == 0) goto L_0x00c2
            X.46i r0 = X.C291335gz.A01(r0)
            if (r0 == 0) goto L_0x00c2
            boolean r0 = r0.Cdd()
            if (r0 == 0) goto L_0x00c2
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x0105
            r0 = 2131443208(0x7f0b3e08, float:1.8508478E38)
            com.instagram.common.ui.base.IgTextView r14 = X.DbT.A0a(r1, r0)
            android.view.View r0 = r5.A00
            if (r0 == 0) goto L_0x0105
            android.content.res.Resources r13 = r0.getResources()
            r1 = 2131971376(0x7f134d30, float:1.957973E38)
            java.lang.String r0 = "125k"
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r13, r0, r1)
            r14.setText(r0)
            r5.A06 = r14
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x0105
            r0 = 2131443206(0x7f0b3e06, float:1.8508474E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.igds.components.shimmer.placeholder.SimpleShimmerPlaceholderView r0 = (com.instagram.igds.components.shimmer.placeholder.SimpleShimmerPlaceholderView) r0
            r0.setVisibility(r3)
            r5.A08 = r0
        L_0x00c2:
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x0105
            r0 = 2131434787(0x7f0b1d23, float:1.8491398E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r1, r0)
            r5.A05 = r0
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x0105
            r0 = 2131434783(0x7f0b1d1f, float:1.849139E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.igds.components.shimmer.placeholder.SimpleShimmerPlaceholderView r0 = (com.instagram.igds.components.shimmer.placeholder.SimpleShimmerPlaceholderView) r0
            r5.A07 = r0
            X.1Xj r0 = X.C51966G9m.A0v(r9)
            X.0qQ.A0B(r0, r3)
            X.1sQ r0 = X.C51966G9m.A0n(r0)
            if (r0 == 0) goto L_0x011a
            X.46i r0 = X.C291335gz.A01(r0)
            if (r0 == 0) goto L_0x011a
            boolean r0 = r0.Cdd()
            if (r0 == 0) goto L_0x011a
            android.content.Context r0 = r5.requireContext()
            int r1 = X.AnonymousClass7TG.A03(r0)
            com.instagram.igds.components.shimmer.placeholder.SimpleShimmerPlaceholderView r0 = r5.A07
            if (r0 != 0) goto L_0x010d
            java.lang.String r15 = "inspirationGhostTitle"
        L_0x0105:
            X.0qQ.A0F(r15)
        L_0x0108:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x010d:
            X.0nA.A0T(r0, r1)
            com.instagram.common.ui.base.IgTextView r0 = r5.A05
            if (r0 != 0) goto L_0x0117
            java.lang.String r15 = "inspirationTitle"
            goto L_0x0105
        L_0x0117:
            X.0nA.A0X(r0, r1)
        L_0x011a:
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r12)
            X.U9R r1 = new X.U9R
            r1.<init>(r2)
            X.Gi4 r0 = new X.Gi4
            r0.<init>(r7, r1, r5, r9)
            r5.A0B = r0
            com.instagram.common.session.UserSession r24 = X.AnonymousClass7TE.A0l(r12)
            r9 = 1058013184(0x3f100000, float:0.5625)
            X.6sS r0 = new X.6sS
            r0.<init>(r9, r3, r3)
            X.6sV r1 = new X.6sV
            r21 = r5
            r22 = r6
            r23 = r5
            r25 = r11
            r26 = r11
            r27 = r11
            r28 = r3
            r29 = r3
            r18 = r7
            r19 = r11
            r20 = r0
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r0 = 6
            r1.A04(r0)
            r5.A09 = r1
            com.instagram.common.session.UserSession r24 = X.AnonymousClass7TE.A0l(r12)
            X.6sS r0 = new X.6sS
            r0.<init>(r9, r3, r3)
            X.6sV r9 = new X.6sV
            r20 = r0
            r17 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r5.A0A = r9
            X.6sV r0 = r5.A09
            if (r0 != 0) goto L_0x0174
            java.lang.String r16 = "ghostItemsAdapter"
            goto L_0x02df
        L_0x0174:
            X.2t9 r6 = r0.A0I
            X.Gi4 r1 = r5.A0B
            if (r1 != 0) goto L_0x017e
            java.lang.String r16 = "clipsItemsAdapter"
            goto L_0x02df
        L_0x017e:
            X.2t9 r0 = r9.A0I
            X.2Rw[] r1 = new X.2Rw[]{r6, r1, r0}
            X.UAE r0 = new X.UAE
            r0.<init>(r1)
            r5.A01 = r0
            androidx.recyclerview.widget.GridLayoutManager r6 = new androidx.recyclerview.widget.GridLayoutManager
            r6.<init>(r7, r8)
            r1 = 5
            X.Ghx r0 = new X.Ghx
            r0.<init>(r5, r1)
            r6.A01 = r0
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x0105
            r0 = 2131430192(0x7f0b0b30, float:1.8482078E38)
            androidx.recyclerview.widget.RecyclerView r1 = X.DbT.A0I(r1, r0)
            X.UAE r0 = r5.A01
            if (r0 != 0) goto L_0x01ab
            java.lang.String r16 = "concatAdapter"
            goto L_0x02df
        L_0x01ab:
            r1.setAdapter(r0)
            r1.setLayoutManager(r6)
            X.6t2 r0 = X.C320826t1.A00(r7, r3, r3)
            r1.A11(r0)
            r5.A03 = r1
            X.0eM r9 = r5.A0K
            java.lang.Object r7 = r9.getValue()
            X.Gh0 r7 = (X.C53009Gh0) r7
            X.Hli r1 = r7.A09
            X.6oS r0 = X.C318116oQ.A00(r7)
            X.Hzo r6 = new X.Hzo
            r6.<init>(r1, r7, r0)
            X.Kp9 r18 = new X.Kp9
            r18.<init>()
            X.1tE r22 = X.C67391tE.A00
            java.util.concurrent.Executor r0 = X.C21057XCj.A02
            X.0qQ.A07(r0)
            X.38Q r8 = new X.38Q
            r8.<init>(r0)
            r1 = 24
            X.IwR r0 = new X.IwR
            r0.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r6)
            X.Ik8 r6 = new X.Ik8
            r6.<init>(r0, r8)
            java.util.concurrent.Executor r1 = X.C21057XCj.A03
            X.0qQ.A07(r1)
            X.38Q r0 = new X.38Q
            r0.<init>(r1)
            X.Jfr r7 = new X.Jfr
            r21 = r8
            r19 = r6
            r20 = r0
            r17 = r7
            r17.<init>(r18, r19, r20, r21, r22)
            X.07Z r6 = r5.getViewLifecycleOwner()
            r1 = 10
            X.J6L r0 = new X.J6L
            r0.<init>(r5, r1)
            r8 = 27
            X.C51969G9p.A15(r6, r7, r0, r8)
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x0105
            r0 = 2131441288(0x7f0b3688, float:1.8504583E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.facebook.shimmer.ShimmerFrameLayout r0 = (com.facebook.shimmer.ShimmerFrameLayout) r0
            r0.A02()
            r5.A04 = r0
            java.lang.Object r0 = r9.getValue()
            X.Gh0 r0 = (X.C53009Gh0) r0
            X.2Fk r7 = r0.A05
            X.07Z r6 = r5.getViewLifecycleOwner()
            r1 = 11
            X.J6L r0 = new X.J6L
            r0.<init>(r5, r1)
            X.C51969G9p.A15(r6, r7, r0, r8)
            java.lang.Object r0 = r9.getValue()
            X.Gh0 r0 = (X.C53009Gh0) r0
            X.2Fk r7 = r0.A04
            X.07Z r6 = r5.getViewLifecycleOwner()
            r1 = 12
            X.J6L r0 = new X.J6L
            r0.<init>(r5, r1)
            X.C51969G9p.A15(r6, r7, r0, r8)
            java.lang.Object r0 = r9.getValue()
            X.Gh0 r0 = (X.C53009Gh0) r0
            X.2Fk r7 = r0.A03
            X.07Z r6 = r5.getViewLifecycleOwner()
            r1 = 13
            X.J6L r0 = new X.J6L
            r0.<init>(r5, r1)
            X.C51969G9p.A15(r6, r7, r0, r8)
            goto L_0x026f
        L_0x0266:
            r0 = 2131628685(0x7f0e128d, float:1.888467E38)
            android.view.View r0 = r6.inflate(r0, r1, r3)
            r5.A00 = r0
        L_0x026f:
            androidx.fragment.app.FragmentActivity r18 = r5.requireActivity()
            X.0eM r11 = r5.A0M
            com.instagram.common.session.UserSession r21 = X.AnonymousClass7TE.A0l(r11)
            X.2el r9 = r5.A0H
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r11)
            r1 = 46
            X.InR r0 = new X.InR
            r0.<init>(r5, r1)
            X.H8V r8 = new X.H8V
            r8.<init>(r6, r0)
            X.0eM r0 = r5.A0J
            X.1Xj r23 = X.C51966G9m.A0v(r0)
            java.util.ArrayList r25 = X.AnonymousClass7TE.A1C()
            X.07Z r19 = r5.getViewLifecycleOwner()
            r0 = 14
            X.J6L r7 = new X.J6L
            r7.<init>(r5, r0)
            r0 = 6
            X.J6L r6 = new X.J6L
            r6.<init>(r5, r0)
            r0 = 44
            X.JGB r1 = new X.JGB
            r1.<init>(r5, r0)
            X.0eM r0 = r5.A0L
            instagram.features.clips.viewer.recipesheet.RecipeSheetParams r0 = X.C51966G9m.A12(r0)
            int r0 = r0.A01
            boolean r29 = X.AnonymousClass7TF.A1S(r0, r2)
            X.GiC r0 = new X.GiC
            r20 = r5
            r22 = r9
            r24 = r8
            r26 = r7
            r27 = r6
            r28 = r1
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r5.A0D = r0
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x0105
            r0 = 2131428188(0x7f0b035c, float:1.8478013E38)
            androidx.recyclerview.widget.RecyclerView r1 = X.DbT.A0I(r1, r0)
            X.GiC r0 = r5.A0D
            if (r0 != 0) goto L_0x02e4
            java.lang.String r16 = "attributesAdapter"
        L_0x02df:
            X.0qQ.A0F(r16)
            goto L_0x0108
        L_0x02e4:
            r1.setAdapter(r0)
            r5.A02 = r1
            X.3DZ r6 = X.AnonymousClass3DZ.A00(r5)
            androidx.recyclerview.widget.RecyclerView r1 = r5.A02
            if (r1 == 0) goto L_0x035c
            X.2eo[] r0 = new X.AnonymousClass2eo[r3]
            r9.A08(r1, r6, r0)
            java.lang.Integer r0 = r5.A0I
            if (r0 == 0) goto L_0x02df
            int r0 = r0.intValue()
            if (r0 == r3) goto L_0x033a
            if (r0 == r10) goto L_0x0329
            if (r0 != r2) goto L_0x0364
            X.0eM r0 = r5.A0K
            java.lang.Object r0 = r0.getValue()
            X.Gh0 r0 = (X.C53009Gh0) r0
            X.2Fk r3 = r0.A02
            X.07Z r2 = r5.getViewLifecycleOwner()
            r0 = 9
        L_0x0314:
            X.J6L r1 = new X.J6L
            r1.<init>(r5, r0)
            r0 = 27
            X.C51969G9p.A15(r2, r3, r1, r0)
            X.1Ng r2 = X.DbX.A0R(r11)
            r5.A0F = r2
            if (r2 != 0) goto L_0x034a
            java.lang.String r16 = "igEventBus"
            goto L_0x02df
        L_0x0329:
            X.0eM r0 = r5.A0K
            java.lang.Object r0 = r0.getValue()
            X.Gh0 r0 = (X.C53009Gh0) r0
            X.2Fk r3 = r0.A00
            X.07Z r2 = r5.getViewLifecycleOwner()
            r0 = 8
            goto L_0x0314
        L_0x033a:
            X.0eM r0 = r5.A0K
            java.lang.Object r0 = r0.getValue()
            X.Gh0 r0 = (X.C53009Gh0) r0
            X.2Fk r3 = r0.A01
            X.07Z r2 = r5.getViewLifecycleOwner()
            r0 = 7
            goto L_0x0314
        L_0x034a:
            java.lang.Class<X.3KA> r1 = X.AnonymousClass3KA.class
            X.1wn r0 = r5.A0G
            r2.A01(r0, r1)
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x0105
            r0 = -806933695(0xffffffffcfe72b41, float:-7.7567432E9)
            X.AnonymousClass0fD.A09(r0, r4)
            return r1
        L_0x035c:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1375112666(0xffffffffae097226, float:-3.1251578E-11)
            goto L_0x036b
        L_0x0364:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            r0 = -969990832(0xffffffffc62f1d50, float:-11207.328)
        L_0x036b:
            X.AnonymousClass0fD.A09(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H1H.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-877427824);
        super.onDestroyView();
        1Ng r2 = this.A0F;
        if (r2 == null) {
            0qQ.A0F("igEventBus");
            throw AnonymousClass00P.createAndThrow();
        }
        r2.A02(this.A0G, AnonymousClass3KA.class);
        AnonymousClass0fD.A09(-296251659, A022);
    }
}
