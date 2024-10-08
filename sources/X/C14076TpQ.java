package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.explore.intf.ExploreFragmentConfig;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.TpQ  reason: case insensitive filesystem */
public final class C14076TpQ implements JSr {
    public float A00;
    public float A01;
    public int A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public TextView A08;
    public RecyclerView A09;
    public UXW A0A;
    public GXQ A0B;
    public C355148Ov A0C;
    public C355148Ov A0D;
    public AnonymousClass5Gv A0E;
    public SearchEditText A0F;
    public Runnable A0G;
    public Runnable A0H;
    public boolean A0I;
    public Parcelable A0J;
    public Runnable A0K;
    public final int A0L;
    public final int A0M;
    public final Context A0N;
    public final Fragment A0O;
    public final FragmentActivity A0P;
    public final AnonymousClass0iw A0Q;
    public final UserSession A0R;
    public final C14391TvK A0S;
    public final GX8 A0T;
    public final C14388TvH A0U;
    public final C55919Hpg A0V;
    public final ExploreFragmentConfig A0W;
    public final C14364Tut A0X;
    public final C14359Tuo A0Y;
    public final C231002qi A0Z;
    public final C230882qT A0a;
    public final boolean A0b;
    public final V2H A0c;
    public final 1wn A0d = new C19221WQb(this, 21);
    public final GX7 A0e;
    public final String A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;

    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.Object, X.0rk] */
    public final void AJ9(C227762js r12, C231302rO r13, C238133Ar r14) {
        int i;
        float A002;
        C231302rO r7 = r13;
        boolean A1Y = DbW.A1Y(r13);
        ViewGroup viewGroup = this.A07;
        if (viewGroup == null) {
            0qQ.A0F("headerView");
            throw AnonymousClass00P.createAndThrow();
        }
        if (182.A06(0Tu.A05, this.A0R, 36330737515315955L)) {
            A002 = 0.0f;
        } else {
            ? obj = new Object();
            if (this.A0b) {
                Context context = this.A0N;
                i = 2Yu.A0G(context, R.attr.inlineMetaAISearchBarHeight) - 2Yu.A0G(context, R.attr.inlineSearchBarHeight);
            } else {
                i = 0;
            }
            obj.A00 = i;
            C227762js r6 = r12;
            C238133Ar r9 = r14;
            if (this.A0j) {
                C226122ff r1 = C226112fe.A0B;
                if (!C226122ff.A03()) {
                    this.A01 = (float) C14396TvP.A00(viewGroup, r12, r13, r14, i);
                }
                r1.A04(this.A0P, new C14427Tvw(viewGroup, r6, r7, this, r9, obj), A1Y);
                return;
            }
            A002 = (float) C14396TvP.A00(viewGroup, r12, r13, r14, i);
        }
        this.A01 = A002;
    }

    public final void D6y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        View inflate = layoutInflater.inflate(R.layout.explore_header, viewGroup, false);
        if ((inflate instanceof ViewGroup) && (viewGroup2 = (ViewGroup) inflate) != null) {
            this.A07 = viewGroup2;
            this.A09 = DbT.A0I(viewGroup2, R.id.destination_hscroll);
            ViewGroup viewGroup3 = this.A07;
            if (viewGroup3 != null) {
                this.A08 = DbU.A0G(viewGroup3, R.id.header_text_view);
                ViewGroup viewGroup4 = this.A07;
                if (viewGroup4 != null) {
                    this.A06 = viewGroup4.requireViewById(R.id.nav_bar_divider);
                    RecyclerView recyclerView = this.A09;
                    if (recyclerView != null) {
                        C14396TvP.A01(recyclerView);
                        recyclerView.A15(new C14397TvQ(recyclerView, this.A0S, this.A0e));
                    }
                    AnonymousClass1Nd.A00(this.A0R).A01(this.A0d, C19216WPw.class);
                    C226112fe.A0B.A04(this.A0P, new M01(this, 3), false);
                    return;
                }
            }
            0qQ.A0F("headerView");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DkU() {
        C321536uL.A00 = true;
        2dY r4 = 2dZ.A0t;
        FragmentActivity fragmentActivity = this.A0P;
        r4.A03(fragmentActivity).A0T();
        int A022 = JTQ.A02(this.A09);
        SearchEditText searchEditText = this.A0F;
        if (searchEditText != null) {
            searchEditText.setVisibility(A022);
        }
        View view = this.A03;
        if (view != null) {
            view.setVisibility(A022);
        }
        TextView textView = this.A08;
        if (textView != null) {
            textView.setVisibility(0);
        }
        View view2 = this.A06;
        if (view2 != null) {
            view2.setVisibility(A022);
        }
        View ETg = r4.A03(fragmentActivity).ETg(R.layout.explore_multi_hide_navbar, 24, 0, false);
        this.A05 = ETg;
        if (ETg != null) {
            WB9.A00(AnonymousClass7TF.A0G(ETg, R.id.multi_hide_navbar_left), 3, this);
            AnonymousClass0fU.A00(new C56800ICx(this, 64), AnonymousClass7TF.A0G(ETg, R.id.multi_hide_navbar_right));
        }
        this.A0V.A00();
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.widget.EditText] */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0214, code lost:
        if (r0 == false) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0247, code lost:
        if (X.AnonymousClass7TE.A0q(r6).getBoolean(X.AnonymousClass000.A00(3078), false) != false) goto L_0x0249;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r24) {
        /*
            r23 = this;
            r3 = 0
            r4 = r23
            boolean r8 = r4.A0i
            r2 = 1
            r11 = r24
            if (r8 == 0) goto L_0x000d
            r11.Eu4(r2)
        L_0x000d:
            boolean r0 = r4.A0j
            if (r0 == 0) goto L_0x002b
            X.2ff r5 = X.C226112fe.A0B
            androidx.fragment.app.FragmentActivity r1 = r4.A0P
            X.M01 r0 = new X.M01
            r0.<init>(r11, r2)
            r5.A04(r1, r0, r2)
            X.2dZ r0 = X.DbT.A0K(r1)
            android.view.ViewGroup r5 = r0.A0O
            android.content.Context r1 = r4.A0N
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            X.DbT.A16(r1, r5, r0)
        L_0x002b:
            boolean r0 = r4.A0h
            if (r0 == 0) goto L_0x02a4
            X.2dY r0 = X.2dZ.A0t
            androidx.fragment.app.FragmentActivity r6 = r4.A0P
            X.2dZ r0 = r0.A03(r6)
            android.view.ViewGroup r5 = r0.A0O
            android.content.Context r1 = r4.A0N
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            X.DbT.A16(r1, r5, r0)
            X.2ff r5 = X.C226112fe.A0B
            r1 = 2
            X.M01 r0 = new X.M01
            r0.<init>(r11, r1)
            r5.A04(r6, r0, r2)
            r4.A00()
            java.lang.String r0 = ""
            r11.setTitle(r0)
        L_0x0054:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A09
            r8 = 8
            if (r0 == 0) goto L_0x0066
            X.TvK r0 = r4.A0S
            r0.getItemCount()
            androidx.recyclerview.widget.RecyclerView r0 = r4.A09
            if (r0 == 0) goto L_0x0066
            r0.setVisibility(r8)
        L_0x0066:
            com.instagram.explore.intf.ExploreFragmentConfig r0 = r4.A0W
            int r9 = r0.A00
            r7 = 4
            boolean r10 = X.AnonymousClass7TF.A1S(r9, r7)
            com.instagram.common.session.UserSession r6 = r4.A0R
            boolean r0 = X.C321536uL.A02(r6)
            if (r0 != 0) goto L_0x00a9
            X.0Tu r5 = X.0Tu.A05
            r0 = 36318475383216271(0x8107760000188f, double:3.031288302883522E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x00aa
            X.3JR r1 = new X.3JR
            r1.<init>()
            r0 = 2131238564(0x7f081ea4, float:1.809341E38)
            r1.A06 = r0
            r0 = 2131966732(0x7f133b0c, float:1.957031E38)
            r1.A05 = r0
            X.WB9 r0 = new X.WB9
            r0.<init>((java.lang.Object) r4, (int) r3)
            r1.A0G = r0
            r0 = 17
            r1.A09 = r0
            android.view.View r1 = X.C51970G9q.A0P(r1, r11)
            r4.A04 = r1
            android.content.Context r0 = r4.A0N
            A01(r0, r1, r3, r7)
        L_0x00a9:
            return
        L_0x00aa:
            if (r10 != 0) goto L_0x01ef
            r0 = 36312475313898624(0x81020100000480, double:3.027493834886702E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x00d1
            X.3JR r2 = new X.3JR
            r2.<init>()
            r0 = 2131238947(0x7f082023, float:1.8094187E38)
            r2.A06 = r0
            r0 = 2131973986(0x7f135762, float:1.9585023E38)
            r2.A05 = r0
            r1 = 70
            X.WB8 r0 = new X.WB8
            r0.<init>((java.lang.Object) r4, (int) r1)
            X.DbX.A19(r0, r2, r11)
            return
        L_0x00d1:
            r0 = 36312758781805820(0x810243000104fc, double:3.027673101132646E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x0167
            androidx.fragment.app.FragmentActivity r10 = r4.A0P
            androidx.fragment.app.Fragment r0 = r4.A0O
            X.0gy r9 = X.AnonymousClass07i.A00(r0)
            X.1NY r5 = X.DbU.A0O(r6)
            java.lang.String r0 = "map/map_center_fallback/"
            r5.A0A(r0)
            java.lang.Class<X.UXW> r1 = X.UXW.class
            java.lang.Class<X.VnD> r0 = X.C18195VnD.class
            X.1OC r1 = X.DbT.A0S(r5, r1, r0)
            r0 = 30
            X.C15621Ufn.A00(r1, r4, r0)
            X.1ES.A00(r10, r9, r1)
            X.3JR r1 = new X.3JR
            r1.<init>()
            r0 = 2131238503(0x7f081e67, float:1.8093287E38)
            r1.A06 = r0
            r0 = 2131965858(0x7f1337a2, float:1.9568538E38)
            r1.A05 = r0
            X.WB9 r0 = new X.WB9
            r0.<init>((java.lang.Object) r4, (int) r2)
            r1.A0G = r0
            r1.A0O = r3
            r0 = 17
            r1.A09 = r0
            android.view.View r9 = X.C51970G9q.A0P(r1, r11)
            android.content.Context r0 = r4.A0N
            A01(r0, r9, r7, r8)
            X.41i r0 = X.C2593341h.A00(r6)
            X.0xa r5 = r0.A00
            java.lang.String r0 = "explore_search_bar_entry_point_tooltip_display_count"
            int r1 = r5.getInt(r0, r3)
            java.lang.String r0 = "map_launched_from_explore_search_bar_entry_point"
            boolean r0 = r5.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x00a9
            r0 = 2
            if (r1 >= r0) goto L_0x00a9
            r0 = 2131961877(0x7f132815, float:1.9560463E38)
            X.5Gt r1 = X.AnonymousClass7TG.A0e(r10, r0)
            r1.A03(r9)
            r1.A01()
            r1.A0F = r2
            X.UmZ r0 = new X.UmZ
            r0.<init>(r9, r4, r3)
            r1.A04 = r0
            X.5Gv r1 = r1.A00()
            java.lang.Runnable r0 = r4.A0K
            if (r0 == 0) goto L_0x015a
            X.11Z.A01(r0)
        L_0x015a:
            X.WnC r2 = new X.WnC
            r2.<init>(r4, r1)
            r0 = 300(0x12c, double:1.48E-321)
            X.11Z.A04(r2, r0)
            r4.A0K = r2
            return
        L_0x0167:
            r0 = 36315649294732744(0x8104e400000dc8, double:3.029501073146794E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x01e4
            X.2dY r0 = X.2dZ.A0t
            androidx.fragment.app.FragmentActivity r9 = r4.A0P
            X.2dZ r12 = r0.A03(r9)
            r11 = 2131238802(0x7f081f92, float:1.8093893E38)
            r0 = 63
            X.ICx r10 = new X.ICx
            r10.<init>(r4, r0)
            android.content.Context r1 = r4.A0N
            int r0 = X.2Yu.A0B(r1)
            com.instagram.actionbar.ActionButton r0 = r12.A0R(r10, r11, r0)
            r4.A03 = r0
            A01(r1, r0, r7, r8)
            r0 = 36315649294798281(0x8104e400010dc9, double:3.02950107318824E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x00a9
            android.view.View r5 = r4.A03
            if (r5 == 0) goto L_0x00a9
            X.0xa r1 = X.AnonymousClass7TE.A0q(r6)
            java.lang.String r0 = "explore_controls_upsell_tooltip_shown"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x00a9
            r0 = 2131961864(0x7f132808, float:1.9560437E38)
            X.5Gt r1 = X.AnonymousClass7TG.A0e(r9, r0)
            r1.A03(r5)
            r1.A01()
            r1.A0F = r2
            X.5Gu r0 = X.C283255Gu.A06
            r1.A07(r0)
            r1.A08(r0)
            X.UmZ r0 = new X.UmZ
            r0.<init>(r5, r4, r2)
            r1.A04 = r0
            X.5Gv r1 = r1.A00()
            java.lang.Runnable r0 = r4.A0G
            if (r0 == 0) goto L_0x01d7
            X.11Z.A01(r0)
        L_0x01d7:
            X.WnD r2 = new X.WnD
            r2.<init>(r4, r1)
            r0 = 300(0x12c, double:1.48E-321)
            X.11Z.A04(r2, r0)
            r4.A0G = r2
            return
        L_0x01e4:
            r0 = 36320081701052363(0x8108ec00011fcb, double:3.032304144751189E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x00a9
        L_0x01ef:
            X.3JR r8 = new X.3JR
            r8.<init>()
            r0 = 36883031654662624(0x8308ec000401e0, double:3.3883159622318334E-306)
            java.lang.String r5 = X.182.A04(r5, r6, r0)
            int r1 = r5.hashCode()
            r0 = 3181382(0x308b46, float:4.458066E-39)
            if (r1 == r0) goto L_0x0299
            r0 = 109770997(0x68af8f5, float:5.227564E-35)
            if (r1 != r0) goto L_0x0216
            java.lang.String r0 = "story"
            boolean r0 = r5.equals(r0)
            r1 = 2131238596(0x7f081ec4, float:1.8093475E38)
        L_0x0214:
            if (r0 != 0) goto L_0x0219
        L_0x0216:
            r1 = 2131238210(0x7f081d42, float:1.8092692E38)
        L_0x0219:
            r8.A06 = r1
            r0 = 2131973476(0x7f135564, float:1.9583989E38)
            r8.A05 = r0
            r1 = 2
            X.WB9 r0 = new X.WB9
            r0.<init>((java.lang.Object) r4, (int) r1)
            r8.A0G = r0
            android.view.View r8 = X.C51970G9q.A0P(r8, r11)
            android.content.Context r0 = r4.A0N
            r5 = 0
            A01(r0, r8, r3, r7)
            boolean r9 = X.AnonymousClass7TF.A1S(r9, r7)
            if (r9 != 0) goto L_0x0249
            X.0xa r1 = X.AnonymousClass7TE.A0q(r6)
            r0 = 3078(0xc06, float:4.313E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r3)
            r7 = 1
            if (r0 == 0) goto L_0x024a
        L_0x0249:
            r7 = 0
        L_0x024a:
            if (r9 == 0) goto L_0x025d
            X.0xa r1 = X.AnonymousClass7TE.A0q(r6)
            r0 = 3079(0xc07, float:4.315E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x025d
            r5 = 1
        L_0x025d:
            if (r7 != 0) goto L_0x0261
            if (r5 == 0) goto L_0x00a9
        L_0x0261:
            r0 = 2131961866(0x7f13280a, float:1.956044E38)
            X.6jx r3 = new X.6jx
            r3.<init>((int) r0)
            androidx.fragment.app.FragmentActivity r0 = r4.A0P
            X.5Gt r1 = new X.5Gt
            r1.<init>(r0, r3)
            r1.A03(r8)
            r1.A01()
            r1.A0F = r2
            X.9pI r0 = new X.9pI
            r0.<init>(r4, r2, r5, r7)
            r1.A04 = r0
            X.5Gv r1 = r1.A00()
            r4.A0E = r1
            java.lang.Runnable r0 = r4.A0H
            if (r0 == 0) goto L_0x028c
            X.11Z.A01(r0)
        L_0x028c:
            X.WnE r2 = new X.WnE
            r2.<init>(r4, r1)
            r0 = 300(0x12c, double:1.48E-321)
            X.11Z.A04(r2, r0)
            r4.A0H = r2
            return
        L_0x0299:
            java.lang.String r0 = "grid"
            boolean r0 = r5.equals(r0)
            r1 = 2131238631(0x7f081ee7, float:1.8093546E38)
            goto L_0x0214
        L_0x02a4:
            X.TvH r6 = r4.A0U
            boolean r0 = r6.A0F
            r1 = 0
            if (r0 == 0) goto L_0x02fb
            X.9B3 r9 = X.AnonymousClass9B2.A04
            com.instagram.common.session.UserSession r7 = r6.A09
            r0 = 12
            X.NQT r5 = new X.NQT
            r5.<init>(r6, r0)
            r0 = 2
            r9.A00(r7, r5, r1, r0)
            boolean r9 = r6.A0K
            if (r9 == 0) goto L_0x02ca
            X.0nO r5 = X.0nY.A00()
            X.NRZ r0 = new X.NRZ
            r0.<init>(r6)
            r5.ATE(r0)
        L_0x02ca:
            boolean r7 = r6.A0L
            boolean r5 = r6.A0H
            int r12 = r6.A02
            int r13 = r6.A03
            r14 = 1500(0x5dc, double:7.41E-321)
            boolean r0 = r6.A0I
            r19 = r5
            r20 = r3
            r21 = r9
            r22 = r0
            r17 = r7
            r18 = r2
            r16 = r8
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout r0 = r11.ErP(r12, r13, r14, r16, r17, r18, r19, r20, r21, r22)
            android.widget.EditText r5 = r0.getEditText()
            boolean r0 = r5 instanceof com.instagram.ui.widget.searchedittext.SearchEditText
            if (r0 == 0) goto L_0x02f3
            r1 = r5
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = (com.instagram.ui.widget.searchedittext.SearchEditText) r1
        L_0x02f3:
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r6.A01(r1)
            r4.A0F = r0
            goto L_0x0054
        L_0x02fb:
            r0 = r11
            X.2dZ r0 = (X.2dZ) r0
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout r0 = r0.A0S(r8)
            android.widget.EditText r1 = r0.getEditText()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.widget.searchedittext.SearchEditText"
            X.0qQ.A0C(r1, r0)
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = (com.instagram.ui.widget.searchedittext.SearchEditText) r1
            goto L_0x02f3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14076TpQ.configureActionBar(X.2da):void");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.widget.EditText] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r1 != null) goto L_0x002a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r21 = this;
            r5 = r21
            androidx.fragment.app.FragmentActivity r4 = r5.A0P
            boolean r0 = r4 instanceof com.instagram.base.activity.BaseFragmentActivity
            r3 = 0
            if (r0 == 0) goto L_0x00c4
            r2 = r4
            com.instagram.base.activity.BaseFragmentActivity r2 = (com.instagram.base.activity.BaseFragmentActivity) r2
            if (r2 == 0) goto L_0x00c4
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout r1 = r2.A03
            if (r1 != 0) goto L_0x002a
            r0 = 2131435177(0x7f0b1ea9, float:1.8492189E38)
            android.view.View r0 = r2.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.widget.edittext.AnimatedHintsTextLayout"
            X.0qQ.A0C(r1, r0)
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout r1 = (com.instagram.ui.widget.edittext.AnimatedHintsTextLayout) r1
            r2.A03 = r1
            if (r1 == 0) goto L_0x002e
        L_0x002a:
            r0 = 0
            r1.setVisibility(r0)
        L_0x002e:
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout r10 = r2.A03
            if (r10 == 0) goto L_0x00c4
            boolean r0 = r5.A0b
            if (r0 == 0) goto L_0x00c5
            X.TvH r7 = r5.A0U
            X.9B3 r6 = X.AnonymousClass9B2.A04
            com.instagram.common.session.UserSession r2 = r7.A09
            r0 = 12
            X.NQT r1 = new X.NQT
            r1.<init>(r7, r0)
            r0 = 2
            r6.A00(r2, r1, r3, r0)
            boolean r8 = r5.A0g
            if (r8 == 0) goto L_0x0057
            X.0nO r1 = X.0nY.A00()
            X.NRZ r0 = new X.NRZ
            r0.<init>(r7)
            r1.ATE(r0)
        L_0x0057:
            X.Vzf r9 = X.C18745Vzf.A00
            r7 = 0
            com.instagram.common.session.UserSession r6 = r5.A0R
            boolean r15 = X.C13988Tno.A1Y(r6)
            r16 = 1
            boolean r17 = X.C13988Tno.A1Y(r6)
            boolean r11 = X.C13988Tno.A1Y(r6)
            X.0qQ.A0B(r6, r7)
            boolean r0 = X.C13988Tno.A1Y(r6)
            r12 = 0
            if (r0 == 0) goto L_0x0075
            r12 = -1
        L_0x0075:
            r13 = 1500(0x5dc, double:7.41E-321)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330565716165303(0x811275000042b7, double:3.0389342781243527E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            r20 = r0 ^ 1
            r19 = r8
            r18 = r7
            r9.A01(r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            android.widget.EditText r0 = r10.getEditText()
            android.text.Editable r0 = r0.getText()
            r0.clear()
            android.view.ViewGroup$MarginLayoutParams r1 = X.DbX.A0G(r10)
            int r0 = X.0Pn.A00(r4)
            r1.bottomMargin = r0
            r10.setLayoutParams(r1)
        L_0x00a3:
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r5.A0F
            if (r1 == 0) goto L_0x00b0
            r0 = 0
            r1.A0P = r0
            com.instagram.ui.widget.searchedittext.SearchEditText.A02(r1, r0, r0)
            com.instagram.ui.widget.searchedittext.SearchEditText.A01(r1)
        L_0x00b0:
            android.widget.EditText r1 = r10.getEditText()
            boolean r0 = r1 instanceof com.instagram.ui.widget.searchedittext.SearchEditText
            if (r0 == 0) goto L_0x00bb
            r3 = r1
            com.instagram.ui.widget.searchedittext.SearchEditText r3 = (com.instagram.ui.widget.searchedittext.SearchEditText) r3
        L_0x00bb:
            r5.A0F = r3
            if (r3 == 0) goto L_0x00c4
            X.TvH r0 = r5.A0U
            r0.A01(r3)
        L_0x00c4:
            return
        L_0x00c5:
            android.content.Context r0 = r5.A0N
            X.C18745Vzf.A00(r0, r10)
            goto L_0x00a3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14076TpQ.A00():void");
    }

    public static final void A02(C14076TpQ tpQ) {
        int A022 = JTQ.A02(tpQ.A08);
        View view = tpQ.A05;
        if (view != null) {
            view.setVisibility(A022);
        }
        RecyclerView recyclerView = tpQ.A09;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        SearchEditText searchEditText = tpQ.A0F;
        if (searchEditText != null) {
            searchEditText.setVisibility(0);
        }
        View view2 = tpQ.A06;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = tpQ.A03;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        2dZ.A0t.A03(tpQ.A0P).A0T();
    }

    public final void AJA(C227762js r4, X46 x46) {
        C226112fe.A0B.A05(this.A0P, new C14401TvU(r4, x46, this));
    }

    public final String ArD() {
        return this.A0f;
    }

    public final float C8k() {
        return this.A01;
    }

    public final void EKZ() {
        RecyclerView recyclerView = this.A09;
        if (recyclerView != null) {
            recyclerView.A0p(0);
        }
    }

    public final void onDestroyView() {
        RecyclerView recyclerView = this.A09;
        if (recyclerView != null) {
            recyclerView.setAdapter((2Rw) null);
            this.A09 = null;
        }
        AnonymousClass1Nd.A00(this.A0R).A02(this.A0d, C19216WPw.class);
    }

    public final void onPause() {
        BaseFragmentActivity baseFragmentActivity;
        SearchEditText searchEditText = this.A0U.A01;
        if (searchEditText != null) {
            searchEditText.setOnTouchListener((View.OnTouchListener) null);
        }
        FragmentActivity fragmentActivity = this.A0P;
        Parcelable parcelable = null;
        if ((fragmentActivity instanceof BaseFragmentActivity) && (baseFragmentActivity = (BaseFragmentActivity) fragmentActivity) != null) {
            AnonymousClass7TH.A0R(baseFragmentActivity.A03);
        }
        RecyclerView recyclerView = this.A09;
        if (recyclerView != null) {
            C252553pI r0 = recyclerView.A0D;
            if (r0 != null) {
                parcelable = r0.A1M();
            }
            this.A0J = parcelable;
        }
        2db.A02(fragmentActivity, 2Yu.A0F(this.A0N, R.attr.statusBarBackgroundColor));
    }

    public final void onResume() {
        RecyclerView recyclerView;
        C252553pI r0;
        C14388TvH tvH = this.A0U;
        if (1pR.A00 != null) {
            C14398TvR.A00().A00(tvH.A09);
        }
        if (this.A0h) {
            A00();
        }
        UserSession userSession = this.A0R;
        if (C321536uL.A02(userSession)) {
            TextView textView = this.A08;
            if (textView != null) {
                textView.setVisibility(8);
            }
            View view = this.A06;
            if (view != null) {
                view.setVisibility(0);
            }
            C321536uL.A00 = false;
            C321536uL.A00(userSession);
            this.A0V.A00();
        }
        Parcelable parcelable = this.A0J;
        if (!(parcelable == null || (recyclerView = this.A09) == null || (r0 = recyclerView.A0D) == null)) {
            r0.A1P(parcelable);
        }
        this.A0S.getItemCount();
        if (!this.A0I && 182.A06(0Tu.A05, userSession, 36318475383216271L)) {
            GXQ gxq = this.A0B;
            if (gxq != null) {
                GWY gwy = gxq.A01;
                Long l = gwy.A01;
                if (l != null) {
                    AnonymousClass32L r6 = gxq.A00;
                    if (gwy.A04.now() - l.longValue() >= r6.A0d) {
                        gxq.A00(true);
                        UserSession A032 = r6.getSession();
                        String moduleName = r6.getModuleName();
                        0Aj A0e2 = AnonymousClass7TE.A0e(DbT.A0Q(r6, A032, 0), "explore_dsa_experience_expired");
                        A0e2.AAJ("containermodule", moduleName);
                        A0e2.Cgf();
                    }
                }
                RecyclerView recyclerView2 = this.A09;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(8);
                }
                RecyclerView recyclerView3 = this.A09;
                if (recyclerView3 != null) {
                    recyclerView3.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
                }
            }
            this.A0I = true;
        }
        if (this.A0j) {
            2db.A02(this.A0P, this.A0N.getColor(R.color.fds_transparent));
        }
    }

    public C14076TpQ(Context context, Fragment fragment, FragmentActivity fragmentActivity, V2H v2h, AnonymousClass0iw r9, UserSession userSession, GX8 gx8, GX7 gx7, C14388TvH tvH, C55919Hpg hpg, GXB gxb, ExploreFragmentConfig exploreFragmentConfig, C14364Tut tut, C14359Tuo tuo, C231002qi r19, C230882qT r20, boolean z) {
        boolean A1Y = DbW.A1Y(userSession);
        0qQ.A0B(hpg, 13);
        this.A0N = context;
        this.A0R = userSession;
        this.A0P = fragmentActivity;
        this.A0O = fragment;
        this.A0a = r20;
        this.A0Z = r19;
        this.A0Y = tuo;
        this.A0U = tvH;
        this.A0e = gx7;
        this.A0T = gx8;
        this.A0c = v2h;
        this.A0V = hpg;
        this.A0Q = r9;
        this.A0i = z;
        this.A0X = tut;
        this.A0W = exploreFragmentConfig;
        this.A0S = new C14391TvK(context, userSession, gxb);
        boolean z2 = true;
        this.A0I = A1Y;
        this.A0L = 2Yu.A07(context);
        this.A0M = 2Yu.A08(context);
        this.A0b = C13988Tno.A1Y(userSession);
        0Tu r2 = 0Tu.A05;
        this.A0h = 182.A06(r2, userSession, 36330737515315955L);
        this.A0j = C13988Tno.A1Y(userSession);
        this.A0g = (!AnonymousClass9B8.A0A(userSession) || !182.A06(r2, userSession, 36327447570495940L)) ? false : z2;
        this.A0f = AnonymousClass7TE.A16(fragmentActivity, 2131961860);
    }

    public static void A01(Context context, View view, int i, int i2) {
        0nA.A0Z(view, (int) 0nA.A04(context, i));
        0nA.A0b(view, (int) 0nA.A04(context, i2));
    }
}
