package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.android.R;
import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.ui.swipenavigation.PositionConfig;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;
import java.util.Set;

/* renamed from: X.K6m  reason: case insensitive filesystem */
public final class C61415K6m extends AnonymousClass4DH implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "BoostMediaPickerSubTabFragment";
    public int A00 = -1;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public RecyclerView A04;
    public AppBarLayout A05;
    public C15695Uh1 A06;
    public IgdsMediaButton A07;
    public SpinnerImageView A08;
    public boolean A09 = true;
    public final List A0A = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C = C227642jf.A02(this);
    public final AnonymousClass0eM A0D = AnonymousClass1YB.A00(new C20703Wxa(this, 6));
    public final AnonymousClass0eM A0E = AnonymousClass1YB.A00(new C20703Wxa(this, 7));
    public final AnonymousClass0eM A0F = AnonymousClass1YB.A00(new C20703Wxa(this, 8));

    public static final void A02(C61415K6m k6m, C60706Jpr jpr, 1Xj r12, int i) {
        C61415K6m k6m2 = k6m;
        if (k6m.isResumed()) {
            1Xj r2 = r12;
            if (r12.BR7() == 1iA.A0a) {
                AnonymousClass0eM r1 = k6m.A0E;
                if (!r12.equals(((C232722uK) r1.getValue()).A0G())) {
                    A04(k6m2, "media_mismatch");
                    C60706Jpr jpr2 = jpr;
                    ((C232722uK) r1.getValue()).A0R(r2, k6m2, jpr2, new C263414Lx(false, false, false, false), i, i, G9t.A18(r12).A01(), true, false);
                    k6m2.A00 = i;
                }
            }
        }
    }

    public static final void A04(C61415K6m k6m, String str) {
        AnonymousClass0eM r1 = k6m.A0E;
        if (((C232722uK) r1.getValue()).A0G() != null) {
            ((C232722uK) r1.getValue()).A0U(str, true, true);
            k6m.A00 = -1;
        }
    }

    public final String getModuleName() {
        return "boost_media_picker_sub_tab_fragment";
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.07Z, X.K6m, X.0iw, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        TextView A0d;
        int i;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        BoostMediaPickerTabType boostMediaPickerTabType = BoostMediaPickerTabType.STORY;
        Set A072 = 0sc.A07(new BoostMediaPickerTabType[]{boostMediaPickerTabType, BoostMediaPickerTabType.CLIPS});
        AnonymousClass0eM r3 = this.A0D;
        float f = 1.0f;
        if (A072.contains(r3.getValue())) {
            f = 0.5625f;
        }
        this.A02 = view2.findViewById(R.id.main_container_view);
        this.A08 = (SpinnerImageView) view2.findViewById(R.id.loading_indicator);
        View view3 = this.A02;
        if (view3 != null) {
            ViewStub A0X = JTR.A0X(view3, R.id.media_grid_container);
            Context context = A0X.getContext();
            View inflate = A0X.inflate();
            if (inflate != null) {
                RecyclerView A0F2 = DbZ.A0F(inflate, R.id.media_grid_recycler_view);
                View view4 = null;
                if (A0F2 != null) {
                    A0F2.setItemAnimator((AnonymousClass3AS) null);
                    JTR.A19(context, A0F2);
                    A0F2.A11(new C60455Jln(JTR.A08(context), 1));
                    A0F2.A15(new C3251871j(A0F2.A0D, new C65319LrI(this, 5), C3251771i.A07, true, false));
                    AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
                    A002.A08 = true;
                    AnonymousClass2t9 A0U = DbU.A0U(A002, new C61660KGk(new C63599Kzm(this), this, f));
                    JTQ.A1G(A0U);
                    A0U.notifyDataSetChanged();
                    A0F2.setAdapter(A0U);
                } else {
                    A0F2 = null;
                }
                this.A03 = A0F2;
                View findViewById = inflate.findViewById(R.id.empty_media_grid_view);
                if (findViewById != null) {
                    int ordinal = ((BoostMediaPickerTabType) r3.getValue()).ordinal();
                    TextView A0d2 = AnonymousClass7TE.A0d(findViewById, R.id.empty_media_grid_title);
                    if (ordinal == 1) {
                        if (A0d2 != null) {
                            A0d2.setText(2131961611);
                            A0d2.setVisibility(0);
                        }
                        TextView A0d3 = AnonymousClass7TE.A0d(findViewById, R.id.empty_media_grid_message);
                        if (A0d3 != null) {
                            A0d3.setText(2131961610);
                            A0d3.setVisibility(0);
                        }
                        A0d = AnonymousClass7TE.A0d(findViewById, R.id.create_media_button);
                        if (A0d != null) {
                            A0d.setText(2131965976);
                            i = 20;
                        }
                        view4 = findViewById;
                    } else if (ordinal != 2) {
                        if (A0d2 != null) {
                            A0d2.setText(2131961607);
                            A0d2.setVisibility(0);
                        }
                        TextView A0d4 = AnonymousClass7TE.A0d(findViewById, R.id.empty_media_grid_message);
                        if (A0d4 != null) {
                            A0d4.setText(2131961606);
                            A0d4.setVisibility(0);
                        }
                        A0d = AnonymousClass7TE.A0d(findViewById, R.id.create_media_button);
                        if (A0d != null) {
                            A0d.setText(2131965897);
                            i = 22;
                        }
                        view4 = findViewById;
                    } else {
                        if (A0d2 != null) {
                            A0d2.setText(2131961609);
                            A0d2.setVisibility(0);
                        }
                        TextView A0d5 = AnonymousClass7TE.A0d(findViewById, R.id.empty_media_grid_message);
                        if (A0d5 != null) {
                            A0d5.setText(2131961608);
                            A0d5.setVisibility(0);
                        }
                        A0d = AnonymousClass7TE.A0d(findViewById, R.id.create_media_button);
                        if (A0d != null) {
                            A0d.setText(2131965966);
                            i = 21;
                        }
                        view4 = findViewById;
                    }
                    LY1.A00(A0d, i, this);
                    A0d.setVisibility(0);
                    view4 = findViewById;
                }
                this.A01 = view4;
                ViewStub A0X2 = JTR.A0X(view3, R.id.media_thumbnail_preview_container);
                View inflate2 = A0X2.inflate();
                inflate2.setVisibility(0);
                C15695Uh1 uh1 = this.A06;
                if (uh1 != null) {
                    uh1.A06(C51969G9p.A1a(r3.getValue(), boostMediaPickerTabType));
                    uh1.A05 = new C19360WWb(this, 0);
                }
                AppBarLayout appBarLayout = (AppBarLayout) view3.findViewById(R.id.media_thumbnail_preview_app_bar);
                if (appBarLayout != null) {
                    appBarLayout.A02(new C59967Jcc(this, 1));
                } else {
                    appBarLayout = null;
                }
                this.A05 = appBarLayout;
                Context A0S = AnonymousClass7TE.A0S(A0X2);
                RecyclerView A0F3 = DbZ.A0F(inflate2, R.id.media_thumbnail_preview_recycler_view);
                if (A0F3 != null) {
                    DbV.A1A(A0S, A0F3);
                    AnonymousClass2tC A003 = AnonymousClass2t9.A00(A0S);
                    A003.A08 = true;
                    A003.A01(new KGU(f));
                    AnonymousClass2t9 A0U2 = DbU.A0U(A003, new C61663KGn(new L3P(A0F3, this), this, AnonymousClass7TE.A0l(this.A0C), f));
                    JTQ.A1G(A0U2);
                    A0F3.setAdapter(A0U2);
                    A0F3.A15(new UAx(0, this, A0F3));
                    A0F3.A11(new C60460Jls(A0S, this, f, 1));
                    try {
                        new C349087zZ().A07(A0F3);
                    } catch (IllegalStateException e) {
                        AnonymousClass7TF.A19(0wj.A01.AEf("boost_media_picker_sub_tab_fragment", 817897926), "boost_media_picker_sub_tab_fragment", AnonymousClass7TF.A0m("attaching the new instance to thumbnail recycler view caused an exception: ", e), e);
                    }
                } else {
                    A0F3 = null;
                }
                this.A04 = A0F3;
                IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view3.findViewById(R.id.thumbnail_igds_media_button);
                this.A07 = igdsMediaButton;
                if (igdsMediaButton != null) {
                    igdsMediaButton.setLabel(getString(2131965942));
                }
                IgdsMediaButton igdsMediaButton2 = this.A07;
                if (igdsMediaButton2 != null) {
                    LY1.A00(igdsMediaButton2, 19, this);
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        MH8.A03(this, DbW.A0E(this), 48);
    }

    public static final void A00(C61415K6m k6m) {
        String str;
        C61415K6m k6m2 = k6m;
        AnonymousClass0eM r7 = k6m2.A0C;
        WGU A0D2 = JTU.A0D(r7);
        C16678UzE uzE = C16678UzE.MEDIA_PICKER;
        AnonymousClass0eM r1 = k6m2.A0D;
        int ordinal = ((BoostMediaPickerTabType) r1.getValue()).ordinal();
        if (ordinal == 1) {
            str = "create_story";
        } else if (ordinal != 2) {
            str = "create_post";
        } else {
            str = "create_reel";
        }
        A0D2.A0F(uzE, str);
        int ordinal2 = ((BoostMediaPickerTabType) r1.getValue()).ordinal();
        if (ordinal2 != 1) {
            String A002 = AnonymousClass000.A00(2);
            if (ordinal2 != 2) {
                Context requireContext = k6m2.requireContext();
                C50348FZf fZf = new C50348FZf(k6m2, 2);
                UserSession A0l = AnonymousClass7TE.A0l(r7);
                0qQ.A0C(A0l, A002);
                AnonymousClass36R.A00(requireContext, A0l, fZf).Ewb(EXF.A0N, AnonymousClass36W.FOLLOWERS_SHARE);
                return;
            }
            0lg A0X = DbT.A0X(r7);
            0qQ.A0C(A0X, A002);
            C56044Hrt A0C2 = C250563lf.A0C(28D.A44);
            A0C2.A0m = true;
            DbT.A1L(k6m2, JTU.A0O(k6m2, A0X, A0C2));
            return;
        }
        2Zg rootActivity = k6m2.getRootActivity();
        0qQ.A0C(rootActivity, AnonymousClass000.A00(51));
        rootActivity.FLD(new PositionConfig((AnonymousClass57C) null, (CameraConfiguration) null, (AnonymousClass3QO) null, AnonymousClass000.A00(1723), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1.0f, 0, true));
    }

    public static final void A01(C61415K6m k6m) {
        C252553pI r2;
        LinearLayoutManager linearLayoutManager;
        C60706Jpr jpr;
        RecyclerView recyclerView = k6m.A04;
        C249703kE r1 = null;
        if (recyclerView != null) {
            r2 = recyclerView.A0D;
        } else {
            r2 = null;
        }
        if ((r2 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) r2) != null) {
            int A1a = linearLayoutManager.A1a();
            int A1b = linearLayoutManager.A1b();
            int A1c = linearLayoutManager.A1c();
            if (Math.abs(A1b - A1a) > 1) {
                A1c = (A1a + A1b) / 2;
            }
            C64787Li3 li3 = (C64787Li3) 00k.A0O(k6m.A0A, A1c);
            if (li3 != null) {
                1Xj r22 = li3.A00;
                RecyclerView recyclerView2 = k6m.A04;
                if (recyclerView2 != null) {
                    r1 = recyclerView2.A0W(A1c);
                }
                if ((r1 instanceof C60706Jpr) && (jpr = (C60706Jpr) r1) != null) {
                    A02(k6m, jpr, r22, A1c);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [X.2tL, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00bd: MOVE  (r1v2 com.instagram.base.activity.BaseFragmentActivity) = (r1v1 com.instagram.base.activity.BaseFragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final void A03(X.C61415K6m r10, X.C63762L5u r11) {
        /*
            boolean r0 = r11 instanceof X.C61452K8g
            if (r0 == 0) goto L_0x009a
            r5 = r11
            X.K8g r5 = (X.C61452K8g) r5
            X.1Xj r8 = r5.A03
            androidx.recyclerview.widget.RecyclerView r0 = r10.A04
            r6 = 0
            if (r0 == 0) goto L_0x0010
            X.2Rw r6 = r0.A0A
        L_0x0010:
            boolean r0 = r6 instanceof X.AnonymousClass2t9
            if (r0 == 0) goto L_0x0055
            X.2t9 r6 = (X.AnonymousClass2t9) r6
            if (r6 == 0) goto L_0x0055
            java.lang.String r0 = r8.getId()
            r9 = 0
            if (r0 == 0) goto L_0x00ef
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00ef
            java.util.List r7 = r10.A0A
            r7.clear()
            X.1iA r1 = r8.BR7()
            X.1iA r0 = X.1iA.A09
            if (r1 == r0) goto L_0x00d2
            X.3W1 r2 = X.G9t.A18(r8)
            X.3TO r1 = X.AnonymousClass3TO.AUTOPLAY_USING_TIMER
            X.Li3 r0 = new X.Li3
            r0.<init>(r8, r2, r1)
            r7.add(r0)
        L_0x0040:
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = X.DbS.A0R()
            r1.A01(r7)
        L_0x0047:
            r6.A05(r1)
            com.google.android.material.appbar.AppBarLayout r1 = r10.A05
            if (r1 == 0) goto L_0x0055
            r0 = 13
            r1.A03 = r0
            r1.requestLayout()
        L_0x0055:
            X.JvK r3 = r5.A01
            androidx.recyclerview.widget.RecyclerView r0 = r10.A03
            r2 = 0
            if (r0 == 0) goto L_0x005e
            X.2Rw r2 = r0.A0A
        L_0x005e:
            boolean r0 = r2 instanceof X.AnonymousClass2t9
            if (r0 == 0) goto L_0x0072
            X.2t9 r2 = (X.AnonymousClass2t9) r2
            if (r2 == 0) goto L_0x0072
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = X.DbS.A0R()
            java.util.List r0 = r3.A04
            r1.A01(r0)
            r2.A05(r1)
        L_0x0072:
            java.util.List r0 = r3.A04
            boolean r3 = r0.isEmpty()
            r2 = 8
            r1 = 0
            androidx.recyclerview.widget.RecyclerView r0 = r10.A03
            if (r3 == 0) goto L_0x00c5
            if (r0 == 0) goto L_0x0084
            r0.setVisibility(r2)
        L_0x0084:
            android.view.View r0 = r10.A01
            if (r0 == 0) goto L_0x008b
            r0.setVisibility(r1)
        L_0x008b:
            boolean r0 = r5.A00()
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = r10.A07
            if (r1 == 0) goto L_0x009a
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
        L_0x009a:
            boolean r3 = r11 instanceof X.C61453K8h
            android.view.View r2 = r10.A02
            r1 = 0
            if (r2 == 0) goto L_0x00aa
            r0 = r3 ^ 1
            int r0 = X.DbW.A01(r0)
            r2.setVisibility(r0)
        L_0x00aa:
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r10.A08
            if (r0 == 0) goto L_0x00b5
            if (r3 != 0) goto L_0x00b2
            r1 = 8
        L_0x00b2:
            r0.setVisibility(r1)
        L_0x00b5:
            androidx.fragment.app.FragmentActivity r1 = r10.getActivity()
            boolean r0 = r1 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x00c4
            com.instagram.base.activity.BaseFragmentActivity r1 = (com.instagram.base.activity.BaseFragmentActivity) r1
            if (r1 == 0) goto L_0x00c4
            r1.A0Z()
        L_0x00c4:
            return
        L_0x00c5:
            if (r0 == 0) goto L_0x00ca
            r0.setVisibility(r1)
        L_0x00ca:
            android.view.View r0 = r10.A01
            if (r0 == 0) goto L_0x008b
            r0.setVisibility(r2)
            goto L_0x008b
        L_0x00d2:
            int r4 = r8.A0o()
        L_0x00d6:
            if (r9 >= r4) goto L_0x0040
            X.1Xj r3 = r8.A1c(r9)
            if (r3 == 0) goto L_0x00ec
            X.3W1 r2 = X.G9t.A18(r3)
            X.3TO r1 = X.AnonymousClass3TO.AUTOPLAY_USING_TIMER
            X.Li3 r0 = new X.Li3
            r0.<init>(r3, r2, r1)
            r7.add(r0)
        L_0x00ec:
            int r9 = r9 + 1
            goto L_0x00d6
        L_0x00ef:
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = X.DbS.A0R()
            X.LhO r0 = new X.LhO
            r0.<init>()
            r1.A00(r0)
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61415K6m.A03(X.K6m, X.L5u):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public C61415K6m() {
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20703Wxa(new C20703Wxa(this, 3), 4));
        0Yh A0z = DbS.A0z(C60293Jiq.class);
        this.A0B = DbS.A0I(new C20703Wxa(A002, 5), new C41566AwY(8, A002, this), new C41566AwY(7, (Object) null, A002), A0z);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.30n, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1703179433);
        C61415K6m.super.onCreate(bundle);
        Context requireContext = requireContext();
        AnonymousClass0eM r3 = this.A0C;
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        DbS.A1Z(A0l);
        C15695Uh1 uh1 = new C15695Uh1(requireContext, this, DbV.A0I(this), A0l, new Object(), this, new C65326LrP(0), 0Pl.A0n.A00(requireContext(), AnonymousClass7TE.A0l(r3)));
        this.A06 = uh1;
        registerLifecycleListener(uh1);
        AnonymousClass0fD.A09(-693224651, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1894005546);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_ig_media_picker_content_fragment, false);
        AnonymousClass0fD.A09(-347001662, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-678119659);
        super.onDestroy();
        unregisterLifecycleListener(this.A06);
        this.A06 = null;
        AnonymousClass0fD.A09(-518787495, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(176709694);
        super.onDestroyView();
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            recyclerView.setAdapter((2Rw) null);
        }
        RecyclerView recyclerView2 = this.A03;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager((C252553pI) null);
        }
        this.A03 = null;
        this.A01 = null;
        RecyclerView recyclerView3 = this.A04;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter((2Rw) null);
        }
        RecyclerView recyclerView4 = this.A04;
        if (recyclerView4 != null) {
            recyclerView4.setLayoutManager((C252553pI) null);
        }
        this.A04 = null;
        this.A05 = null;
        this.A02 = null;
        this.A08 = null;
        this.A07 = null;
        AnonymousClass0fD.A09(375805755, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-734691343);
        C61415K6m.super.onPause();
        A04(this, "context_switch");
        AnonymousClass0fD.A09(467310575, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(2104129901);
        super.onResume();
        A03(this, (C63762L5u) ((C60252Ji9) this.A0F.getValue()).A05.getValue());
        A01(this);
        AnonymousClass0fD.A09(-932920996, A022);
    }
}
