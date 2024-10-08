package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.mediakit.analytics.MediaKitEntryPoint;
import com.instagram.mediakit.config.MediaKitConfig;
import java.util.List;

public final class K6H extends AnonymousClass4DH implements AnonymousClass4DR, MXF {
    public static final String __redex_internal_original_name = "MediaKitFragment";
    public View A00;
    public View A01;
    public RecyclerView A02;
    public AnonymousClass2t9 A03;
    public C252063oV A04;
    public C252063oV A05;
    public 2el A06;
    public C14312Ttm A07;
    public C331157Pu A08;
    public AnonymousClass5Gv A09;
    public LtB A0A;
    public C61411K6i A0B;
    public LS8 A0C;
    public LDE A0D;
    public AnonymousClass6ST A0E;
    public C62320sa A0F = new MMD(this, 7);
    public boolean A0G;
    public MediaKitConfig A0H;
    public boolean A0I;
    public final C60473Jm5 A0J = new C60473Jm5(this, 11);
    public final AnonymousClass4DU A0K = C227942kP.A01(__redex_internal_original_name, false, false);
    public final C63730L4o A0L = new Object();
    public final AnonymousClass0eM A0M = MMD.A00(this, 4);
    public final AnonymousClass0eM A0N = C227642jf.A02(this);
    public final AnonymousClass0eM A0O = DbS.A0I(new MMD(this, 11), new MMD(this, 12), MMW.A00((Object) null, this, 11), DbS.A0z(C60327JjW.class));
    public final LCA A0P = new LCA(this);
    public final AnonymousClass0eM A0Q = MMD.A00(this, 5);

    /* JADX WARNING: type inference failed for: r0v10, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.2tF, java.lang.Object] */
    public static final void A02(C62466KgG kgG, K6H k6h) {
        0qQ.A0B(kgG, 0);
        boolean A1W = AnonymousClass7TF.A1W(kgG, C62466KgG.EDIT);
        AnonymousClass2tC A0S = DbV.A0S(k6h);
        AnonymousClass0eM r6 = k6h.A0N;
        UserSession A0l = AnonymousClass7TE.A0l(r6);
        AnonymousClass2tC A0S2 = DbV.A0S(k6h);
        LDE lde = k6h.A0D;
        if (lde != null) {
            A0S2.A01(new KG2(lde, A1W));
            A0S.A01(new KUJ(A0S2, A0l, k6h, A1W));
            A0S.A01(new KUH(AnonymousClass7TE.A0l(r6), k6h, A1W));
            A0S.A01(new KG5(k6h.requireContext(), AnonymousClass7TE.A0l(r6), k6h, A1W));
            A0S.A01(new KUG(AnonymousClass7TE.A0l(r6), k6h, A1W));
            A0S.A01(new KUI(k6h, AnonymousClass7TE.A0l(r6), k6h, A1W));
            A0S.A01(new Object());
            k6h.A03 = DbU.A0U(A0S, new Object());
            return;
        }
        0qQ.A0F("mediaKitViewPointHelper");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        if (!this.A0I) {
            2YL A0H2 = DbS.A0H(this.A0O);
            MediaKitConfig mediaKitConfig = this.A0H;
            str = "mediaKitConfig";
            if (mediaKitConfig != null) {
                String str3 = mediaKitConfig.A01;
                String str4 = mediaKitConfig.A02;
                AnonymousClass7TE.A1Z(new MFe((Object) A0H2, str3, str4, (AnonymousClass4D7) null, 17), C318116oQ.A00(A0H2));
                this.A0I = true;
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        Context requireContext = requireContext();
        AnonymousClass0eM r4 = this.A0N;
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        AnonymousClass4DU r3 = this.A0K;
        String A0b = AnonymousClass7TF.A0b();
        int A032 = DbW.A03(2, A0l, r3);
        C14312Ttm ttm = new C14312Ttm(requireContext, A0l, r3, A0b, -1);
        this.A07 = ttm;
        C63730L4o l4o = this.A0L;
        LS8 ls8 = new LS8(this, ttm, l4o);
        this.A0C = ls8;
        2el r32 = this.A06;
        if (r32 == null) {
            str2 = "mediaKitViewPointManager";
        } else {
            this.A0D = new LDE(r32, ls8);
            LtB ltB = this.A0A;
            if (ltB == null) {
                str = "mediaKitActionBarHolder";
            } else {
                FragmentActivity requireActivity = requireActivity();
                ltB.A02 = 2db.A01(requireActivity);
                ltB.A09 = (AppBarLayout) view2.requireViewById(R.id.mk_app_bar);
                ltB.A0A = (CollapsingToolbarLayout) view2.requireViewById(R.id.mk_collapsing_toolbar);
                ltB.A06 = DbU.A0C(view2, R.id.mk_action_bar);
                view2.post(new M4Y(ltB));
                AppBarLayout appBarLayout = ltB.A09;
                if (appBarLayout == null) {
                    str2 = "appBarLayout";
                } else {
                    appBarLayout.A02(new C59967Jcc(ltB, 4));
                    ViewGroup viewGroup = ltB.A06;
                    if (viewGroup != null) {
                        ltB.A0B = new 2dZ(C64270LXw.A00, viewGroup);
                        ViewGroup viewGroup2 = ltB.A06;
                        if (viewGroup2 != null) {
                            ltB.A0B = new 2dZ(LY6.A00(ltB, 52), viewGroup2);
                            View requireViewById = view2.requireViewById(R.id.mk_status_bar_background);
                            ltB.A05 = requireViewById;
                            str2 = "statusBarBackground";
                            if (requireViewById != null) {
                                requireViewById.setBackgroundColor(ltB.A0G);
                                View view3 = ltB.A05;
                                if (view3 != null) {
                                    JTP.A14(view3, -1, ltB.A02);
                                    ltB.A03 = view2.requireViewById(R.id.mk_action_bar_dimmer);
                                    ValueAnimator valueAnimator = ltB.A0I;
                                    C64205LTv.A01(valueAnimator, ltB, 12);
                                    valueAnimator.setDuration(200);
                                    2dZ r33 = ltB.A0B;
                                    if (r33 != null) {
                                        r33.A0X(ltB.A0L);
                                    }
                                    int A062 = (int) (((float) 0nA.A06(requireActivity)) / 0.75f);
                                    AppBarLayout appBarLayout2 = ltB.A09;
                                    str2 = "appBarLayout";
                                    if (appBarLayout2 != null) {
                                        ViewGroup.LayoutParams layoutParams = appBarLayout2.getLayoutParams();
                                        0qQ.A0C(layoutParams, C273654mx.A00(48));
                                        layoutParams.height = A062;
                                        appBarLayout2.setLayoutParams(layoutParams);
                                        this.A01 = view2.requireViewById(R.id.mk_toolbar_fragment_container);
                                        UserSession A0S = DbW.A0S(r4, 0);
                                        C61411K6i k6i = new C61411K6i();
                                        DbZ.A1B(k6i, "IgSessionManager.SESSION_TOKEN_KEY", A0S.A05);
                                        this.A0B = k6i;
                                        l4o.A01 = k6i;
                                        0s1 A0C2 = DbW.A0C(this);
                                        A0C2.A0A(k6i, R.id.mk_toolbar_fragment_container);
                                        A0C2.A00();
                                        AnonymousClass0eM r42 = this.A0O;
                                        A02((C62466KgG) JTT.A0a(r42).A0H.getValue(), this);
                                        RecyclerView A0I2 = DbT.A0I(view2, R.id.mk_recycler_view);
                                        AnonymousClass2t9 r2 = this.A03;
                                        if (r2 == null) {
                                            str2 = "recyclerAdapter";
                                        } else {
                                            A0I2.setAdapter(r2);
                                            A0I2.setItemAnimator((AnonymousClass3AS) null);
                                            C64128LPc.A02(A0I2, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                                            A0I2.requestFocus();
                                            A0I2.A15(this.A0J);
                                            C14312Ttm ttm2 = this.A07;
                                            if (ttm2 == null) {
                                                str2 = "discoveryVideoPlayer";
                                            } else {
                                                A0I2.setOnKeyListener(ttm2);
                                                l4o.A00 = A0I2;
                                                this.A02 = A0I2;
                                                this.A00 = view2.requireViewById(R.id.mk_bottom_actions_view);
                                                this.A05 = DbU.A0Y(requireView(), R.id.mk_brand_actions_view_stub);
                                                this.A04 = DbU.A0Y(requireView(), R.id.mk_add_section_view_stub);
                                                A04(this);
                                                Object value = r42.getValue();
                                                07U r9 = 07U.A05;
                                                AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                                                AnonymousClass7TE.A1Z(new MHL(viewLifecycleOwner, value, r9, this, (AnonymousClass4D7) null, A032), AnonymousClass07a.A00(viewLifecycleOwner));
                                                2el r34 = this.A06;
                                                if (r34 == null) {
                                                    str = "mediaKitViewPointManager";
                                                } else {
                                                    r34.A08(view2, AnonymousClass3DZ.A00(this), new AnonymousClass2eo[0]);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    str2 = "actionBar";
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final C331127Pr A00(K6H k6h) {
        C331127Pr A0f = DbX.A0f(k6h.A0N);
        A0f.A0B = R.color.fds_transparent;
        C65745Lyz.A00(A0f, new MMD(k6h, 8), 13);
        return A0f;
    }

    public static final void A01(C63934LDu lDu) {
        1xC r1 = 1xC.A01;
        int i = lDu.A04;
        int i2 = lDu.A05;
        r1.A00(new AnonymousClass3GS(new LAQ(lDu.A01, (C63772L6e) null, lDu.A00, AnonymousClass7TE.A0u(), (CharSequence) null, i2, i)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r3.A05.A01 == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.K6H r8) {
        /*
            X.0eM r2 = r8.A0O
            X.JjW r3 = X.JTT.A0a(r2)
            X.05G r0 = r3.A0H
            java.lang.Object r1 = r0.getValue()
            X.KgG r1 = (X.C62466KgG) r1
            r4 = 0
            X.0qQ.A0B(r1, r4)
            X.KgG r0 = X.C62466KgG.EDIT
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            if (r0 == 0) goto L_0x0021
            X.L9D r0 = r3.A05
            boolean r1 = r0.A01
            r0 = 1
            if (r1 != 0) goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            java.lang.String r7 = "bottomActionView"
            java.lang.String r6 = "brandActionsStubHolder"
            java.lang.String r5 = "addSectionActionsStubHolder"
            r3 = 8
            if (r0 == 0) goto L_0x0056
            android.view.View r0 = r8.A00
            if (r0 == 0) goto L_0x00eb
            r0.setVisibility(r4)
            X.3oV r0 = r8.A04
            if (r0 == 0) goto L_0x00f0
            r0.setVisibility(r4)
            X.3oV r0 = r8.A05
            if (r0 == 0) goto L_0x005c
            r0.setVisibility(r3)
            X.3oV r0 = r8.A04
            if (r0 == 0) goto L_0x00f0
            android.view.View r1 = r0.getView()
            r0 = 2131436400(0x7f0b2370, float:1.849467E38)
            android.view.View r1 = r1.requireViewById(r0)
            r0 = 53
        L_0x0052:
            X.LY6.A01(r1, r0, r8)
            return
        L_0x0056:
            com.instagram.mediakit.config.MediaKitConfig r0 = r8.A0H
            if (r0 != 0) goto L_0x0064
            java.lang.String r6 = "mediaKitConfig"
        L_0x005c:
            X.0qQ.A0F(r6)
        L_0x005f:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0064:
            com.instagram.mediakit.analytics.MediaKitEntryPoint r1 = r0.A00
            com.instagram.mediakit.analytics.MediaKitEntryPoint r0 = com.instagram.mediakit.analytics.MediaKitEntryPoint.DIRECT_XMA
            if (r1 == r0) goto L_0x00d5
            X.JjW r2 = X.JTT.A0a(r2)
            X.05G r0 = r2.A0H
            java.lang.Object r1 = r0.getValue()
            X.0qQ.A0B(r1, r4)
            X.KgG r0 = X.C62466KgG.VIEW
            if (r1 != r0) goto L_0x00d5
            X.0Ud r0 = r2.A0M
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x00d5
            X.L9D r1 = r2.A05
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x00d5
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x00d5
            com.instagram.common.session.UserSession r2 = r1.A03
            boolean r0 = X.AnonymousClass430.A01(r2)
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x00c9
        L_0x009d:
            java.lang.Integer r0 = X.AnonymousClass05K.A0m
            X.C64127LPb.A01(r8, r0)
            android.view.View r0 = r8.A00
            if (r0 == 0) goto L_0x00eb
            r0.setVisibility(r4)
            X.3oV r0 = r8.A04
            if (r0 == 0) goto L_0x00f0
            r0.setVisibility(r3)
            X.3oV r0 = r8.A05
            if (r0 == 0) goto L_0x005c
            r0.setVisibility(r4)
            X.3oV r0 = r8.A05
            if (r0 == 0) goto L_0x005c
            android.view.View r1 = r0.getView()
            r0 = 2131436406(0x7f0b2376, float:1.8494682E38)
            android.view.View r1 = r1.requireViewById(r0)
            r0 = 54
            goto L_0x0052
        L_0x00c9:
            r0 = 36316808936166035(0x8105f200041293, double:3.030234435058709E-306)
            boolean r0 = X.AnonymousClass430.A03(r2, r0)
            if (r0 == 0) goto L_0x00d5
            goto L_0x009d
        L_0x00d5:
            X.3oV r0 = r8.A04
            if (r0 == 0) goto L_0x00f0
            r0.setVisibility(r3)
            X.3oV r0 = r8.A05
            if (r0 == 0) goto L_0x005c
            r0.setVisibility(r3)
            android.view.View r0 = r8.A00
            if (r0 == 0) goto L_0x00eb
            r0.setVisibility(r3)
            return
        L_0x00eb:
            X.0qQ.A0F(r7)
            goto L_0x005f
        L_0x00f0:
            X.0qQ.A0F(r5)
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6H.A04(X.K6H):void");
    }

    public final LDW BO3() {
        return (LDW) this.A0Q.getValue();
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0N);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (r2 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001a, code lost:
        r5 = r2.A07.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bf, code lost:
        if (X.C51966G9m.A1a(r4, r2) != false) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r6 = this;
            X.0eM r0 = r6.A0O
            X.JjW r2 = X.JTT.A0a(r0)
            X.05G r0 = r2.A0H
            java.lang.Object r1 = r0.getValue()
            X.KgG r1 = (X.C62466KgG) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.KgG r0 = X.C62466KgG.EDIT
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            if (r0 == 0) goto L_0x00c2
            com.instagram.mediakit.repository.MediaKitRepository r0 = r2.A07
            X.LFM r5 = r0.A02
            X.Jz9 r0 = r5.A00
            if (r0 == 0) goto L_0x00c2
            r1 = 0
            X.JzE r2 = r0.A00
            X.JzE r0 = r5.A01
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x006c
            X.Jz9 r0 = r5.A00
            if (r0 == 0) goto L_0x0033
            java.util.List r1 = r0.A02
        L_0x0033:
            java.util.ArrayList r0 = r5.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x006c
            X.Jz9 r0 = r5.A00
            if (r0 == 0) goto L_0x006c
            X.JzE r0 = r0.A00
            if (r0 == 0) goto L_0x006c
            java.util.List r4 = r0.A06
            int r1 = r4.size()
            java.util.List r0 = r5.A02
            int r0 = r0.size()
            if (r1 != r0) goto L_0x006c
            java.util.List r0 = r5.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x0057:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x009d
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.Jzx r0 = (X.C61264Jzx) r0
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0057
            if (r2 == 0) goto L_0x009d
        L_0x006c:
            r1 = 2131966615(0x7f133a97, float:1.9570073E38)
            r0 = 2131966614(0x7f133a96, float:1.9570071E38)
            X.LDu r4 = new X.LDu
            r4.<init>(r1, r0)
            r0 = 9
            X.MMD r2 = new X.MMD
            r2.<init>(r6, r0)
            r1 = 2131960790(0x7f1323d6, float:1.9558259E38)
            X.8ae r0 = X.C358278ae.RED_BOLD
            r4.A00(r0, r2, r1)
            X.8ae r3 = X.C358278ae.DEFAULT
            r2 = 2131966613(0x7f133a95, float:1.957007E38)
            r0 = 3
            X.LU1 r1 = new X.LU1
            r1.<init>(r0)
            X.L6e r0 = new X.L6e
            r0.<init>(r1, r3, r2)
            r4.A00 = r0
            A01(r4)
            r0 = 1
            return r0
        L_0x009d:
            java.util.List r0 = r5.A02
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x00a7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r0 = r1.next()
            X.Jzx r0 = (X.C61264Jzx) r0
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x00a7
            r2.add(r0)
            goto L_0x00a7
        L_0x00bb:
            boolean r0 = X.C51966G9m.A1a(r4, r2)
            if (r0 == 0) goto L_0x00c2
            goto L_0x006c
        L_0x00c2:
            X.DbT.A1K(r6)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6H.onBackPressed():boolean");
    }

    public static final void A03(K6H k6h) {
        View currentFocus;
        Activity rootActivity = k6h.getRootActivity();
        if (rootActivity != null && (currentFocus = rootActivity.getCurrentFocus()) != null) {
            0nA.A0N(currentFocus);
            currentFocus.clearFocus();
        }
    }

    public static final void A05(K6H k6h, List list) {
        ViewModelListUpdate A0R = DbS.A0R();
        A0R.A01(list);
        AnonymousClass2t9 r2 = k6h.A03;
        if (r2 == null) {
            0qQ.A0F("recyclerAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        r2.A06(A0R, new C66905Meo(k6h, 1));
        A06(k6h, true);
    }

    public static final void A06(K6H k6h, boolean z) {
        Window A0G2 = DbV.A0G(k6h);
        0qQ.A07(A0G2);
        2db.A08(A0G2, z);
        2db.A02(k6h.requireActivity(), 0);
        2db.A06(k6h.requireActivity(), false);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-295193155);
        K6H.super.onCreate(bundle);
        A06(this, true);
        MediaKitConfig mediaKitConfig = (MediaKitConfig) requireArguments().getParcelable(AnonymousClass000.A00(3571));
        if (mediaKitConfig == null) {
            mediaKitConfig = new MediaKitConfig(MediaKitEntryPoint.UNKNOWN, (String) null, (String) null);
        }
        this.A0H = mediaKitConfig;
        DbV.A0G(this).setSoftInputMode(32);
        this.A06 = C71682ef.A01((0lg) null, C71682ef.A00());
        Context requireContext = requireContext();
        int A002 = 2db.A00(getActivity());
        LCA lca = this.A0P;
        this.A0A = new LtB(requireContext, this, BO3(), JTT.A0a(this.A0O).A05, lca, A002);
        AnonymousClass0fD.A09(568224484, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1843140482);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.media_kit_fragment, false);
        AnonymousClass0fD.A09(-967603292, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(2021759318);
        LtB ltB = this.A0A;
        if (ltB == null) {
            0qQ.A0F("mediaKitActionBarHolder");
            throw AnonymousClass00P.createAndThrow();
        }
        ltB.A0D = null;
        ltB.A0B = null;
        ltB.A0I.removeAllUpdateListeners();
        this.A0B = null;
        super.onDestroy();
        AnonymousClass0fD.A09(-734432086, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1828142452);
        K6H.super.onPause();
        LS8 ls8 = this.A0C;
        if (ls8 == null) {
            0qQ.A0F("mediaKitAutoPlayManager");
            throw AnonymousClass00P.createAndThrow();
        }
        ls8.A03.A09();
        A06(this, false);
        AnonymousClass0fD.A09(995675907, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1719101832);
        super.onResume();
        A06(this, true);
        JTT.A0a(this.A0O).A03();
        AnonymousClass0fD.A09(553767685, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1795925712);
        K6H.super.onStart();
        DbX.A0R(this.A0N).A01((1wn) this.A0M.getValue(), C64680Lg7.class);
        AnonymousClass0fD.A09(1584125467, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1498074739);
        K6H.super.onStop();
        LDE lde = this.A0D;
        if (lde != null) {
            lde.A00();
            DbX.A0R(this.A0N).A02((1wn) this.A0M.getValue(), C64680Lg7.class);
            AnonymousClass0fD.A09(641830608, A022);
            return;
        }
        0qQ.A0F("mediaKitViewPointHelper");
        throw AnonymousClass00P.createAndThrow();
    }
}
