package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.android.R;
import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.ui.swipenavigation.PositionConfig;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Set;

/* renamed from: X.K6l  reason: case insensitive filesystem */
public final class C61414K6l extends AnonymousClass4DH implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "BoostMediaPickerABTestSubTabFragment";
    public View A00;
    public View A01;
    public RecyclerView A02;
    public RecyclerView A03;
    public AppBarLayout A04;
    public IgdsMediaButton A05;
    public SpinnerImageView A06;
    public boolean A07 = true;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09 = C227642jf.A02(this);
    public final AnonymousClass0eM A0A = AnonymousClass1YB.A00(new C20606Wvn(this, 41));
    public final AnonymousClass0eM A0B = AnonymousClass1YB.A00(new C20606Wvn(this, 42));

    public final String getModuleName() {
        return "boost_media_picker_ab_test_sub_tab_fragment";
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.07Z, X.K6l, X.0iw, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        TextView A0d;
        int i;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Set A072 = 0sc.A07(new BoostMediaPickerTabType[]{BoostMediaPickerTabType.STORY, BoostMediaPickerTabType.CLIPS});
        AnonymousClass0eM r5 = this.A0A;
        float f = 1.0f;
        if (A072.contains(r5.getValue())) {
            f = 0.5625f;
        }
        this.A01 = view2.findViewById(R.id.main_container_view);
        this.A06 = (SpinnerImageView) view2.findViewById(R.id.loading_indicator);
        View view3 = this.A01;
        if (view3 != null) {
            ViewStub A0X = JTR.A0X(view3, R.id.media_grid_container);
            Context context = A0X.getContext();
            View inflate = A0X.inflate();
            if (inflate != null) {
                RecyclerView A0F = DbZ.A0F(inflate, R.id.media_grid_recycler_view);
                View view4 = null;
                if (A0F != null) {
                    A0F.setItemAnimator((AnonymousClass3AS) null);
                    JTR.A19(context, A0F);
                    A0F.A11(new C60455Jln(JTR.A08(context), 0));
                    A0F.A15(new C3251871j(A0F.A0D, new C65319LrI(this, 4), C3251771i.A07, true, false));
                    AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
                    A002.A08 = true;
                    AnonymousClass2t9 A0U = DbU.A0U(A002, new C61659KGj(new C63598Kzl(this), this, f));
                    JTQ.A1G(A0U);
                    A0U.notifyDataSetChanged();
                    A0F.setAdapter(A0U);
                } else {
                    A0F = null;
                }
                this.A02 = A0F;
                View findViewById = inflate.findViewById(R.id.empty_media_grid_view);
                if (findViewById != null) {
                    int ordinal = ((BoostMediaPickerTabType) r5.getValue()).ordinal();
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
                            i = 14;
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
                            i = 16;
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
                            i = 15;
                        }
                        view4 = findViewById;
                    }
                    LY1.A00(A0d, i, this);
                    A0d.setVisibility(0);
                    view4 = findViewById;
                }
                this.A00 = view4;
                ViewStub A0X2 = JTR.A0X(view3, R.id.media_thumbnail_preview_container);
                View inflate2 = A0X2.inflate();
                inflate2.setVisibility(0);
                AppBarLayout appBarLayout = (AppBarLayout) view3.findViewById(R.id.media_thumbnail_preview_app_bar);
                if (appBarLayout != null) {
                    appBarLayout.A02(new C59967Jcc(this, 0));
                } else {
                    appBarLayout = null;
                }
                this.A04 = appBarLayout;
                Context A0S = AnonymousClass7TE.A0S(A0X2);
                TextView A0d6 = AnonymousClass7TE.A0d(inflate2, R.id.thumbnail_header_text_view);
                if (A0d6 != null) {
                    DbU.A1G(A0d6, this, 2131953963);
                    A0d6.setVisibility(0);
                }
                RecyclerView A0F2 = DbZ.A0F(inflate2, R.id.media_thumbnail_preview_recycler_view);
                if (A0F2 != null) {
                    DbV.A1A(A0S, A0F2);
                    AnonymousClass2tC A003 = AnonymousClass2t9.A00(A0S);
                    A003.A08 = true;
                    AnonymousClass2t9 A0U2 = DbU.A0U(A003, new C61650KGa(this, f));
                    JTQ.A1G(A0U2);
                    A0F2.setAdapter(A0U2);
                    A0F2.A11(new C60460Jls(A0S, this, f, 0));
                    try {
                        new C349087zZ().A07(A0F2);
                    } catch (IllegalStateException e) {
                        AnonymousClass7TF.A19(0wj.A01.AEf("boost_media_picker_ab_test_sub_tab_fragment", 817897926), "boost_media_picker_ab_test_sub_tab_fragment", AnonymousClass7TF.A0m("attaching the new instance to thumbnail recycler view caused an exception: ", e), e);
                    }
                } else {
                    A0F2 = null;
                }
                this.A03 = A0F2;
                IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view3.findViewById(R.id.thumbnail_igds_media_button);
                this.A05 = igdsMediaButton;
                if (igdsMediaButton != null) {
                    igdsMediaButton.setLabel(getString(2131965950));
                }
                IgdsMediaButton igdsMediaButton2 = this.A05;
                if (igdsMediaButton2 != null) {
                    LY1.A00(igdsMediaButton2, 17, this);
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        MH8.A03(this, DbW.A0E(this), 46);
    }

    public static final void A00(C61414K6l k6l) {
        String str;
        C61414K6l k6l2 = k6l;
        AnonymousClass0eM r7 = k6l2.A09;
        WGU A0D = JTU.A0D(r7);
        C16678UzE uzE = C16678UzE.MEDIA_PICKER;
        AnonymousClass0eM r1 = k6l2.A0A;
        int ordinal = ((BoostMediaPickerTabType) r1.getValue()).ordinal();
        if (ordinal == 1) {
            str = "create_story";
        } else if (ordinal != 2) {
            str = "create_post";
        } else {
            str = "create_reel";
        }
        A0D.A0F(uzE, str);
        int ordinal2 = ((BoostMediaPickerTabType) r1.getValue()).ordinal();
        if (ordinal2 != 1) {
            String A002 = AnonymousClass000.A00(2);
            if (ordinal2 != 2) {
                Context requireContext = k6l2.requireContext();
                C50348FZf fZf = new C50348FZf(k6l2, 1);
                UserSession A0l = AnonymousClass7TE.A0l(r7);
                0qQ.A0C(A0l, A002);
                AnonymousClass36R.A00(requireContext, A0l, fZf).Ewb(EXF.A0N, AnonymousClass36W.FOLLOWERS_SHARE);
                return;
            }
            0lg A0X = DbT.A0X(r7);
            0qQ.A0C(A0X, A002);
            C56044Hrt A0C = C250563lf.A0C(28D.A44);
            A0C.A0m = true;
            DbT.A1L(k6l2, JTU.A0O(k6l2, A0X, A0C));
            return;
        }
        2Zg rootActivity = k6l2.getRootActivity();
        0qQ.A0C(rootActivity, AnonymousClass000.A00(51));
        rootActivity.FLD(new PositionConfig((AnonymousClass57C) null, (CameraConfiguration) null, (AnonymousClass3QO) null, AnonymousClass000.A00(1723), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1.0f, 0, true));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00d3: MOVE  (r1v2 com.instagram.base.activity.BaseFragmentActivity) = (r1v1 com.instagram.base.activity.BaseFragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final void A01(X.C61414K6l r11, X.C63762L5u r12) {
        /*
            boolean r0 = r12 instanceof X.C61452K8g
            if (r0 == 0) goto L_0x00b0
            r4 = r12
            X.K8g r4 = (X.C61452K8g) r4
            X.JvK r3 = r4.A01
            androidx.recyclerview.widget.RecyclerView r0 = r11.A03
            r9 = 0
            if (r0 == 0) goto L_0x0010
            X.2Rw r9 = r0.A0A
        L_0x0010:
            boolean r0 = r9 instanceof X.AnonymousClass2t9
            if (r0 == 0) goto L_0x006d
            X.2t9 r9 = (X.AnonymousClass2t9) r9
            if (r9 == 0) goto L_0x006d
            com.instagram.common.recyclerview.ViewModelListUpdate r8 = X.DbS.A0R()
            int r7 = r3.A00
            r6 = 0
        L_0x001f:
            if (r6 >= r7) goto L_0x005f
            java.util.ArrayList r0 = r3.A03
            java.lang.Object r0 = X.00k.A0O(r0, r6)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0051
            int r1 = r0.intValue()
            java.util.List r0 = r3.A04
            java.lang.Object r0 = X.00k.A0O(r0, r1)
            X.LiL r0 = (X.C64801LiL) r0
            if (r0 == 0) goto L_0x0051
            java.lang.String r10 = r0.A03
            com.instagram.common.typedurl.ImageUrl r2 = r0.A02
            X.UwY r1 = r0.A01
            int r0 = r0.A00
            X.L7g r5 = new X.L7g
            r5.<init>(r1, r2, r10, r0)
        L_0x0046:
            X.LiC r0 = new X.LiC
            r0.<init>(r5)
            r8.A00(r0)
            int r6 = r6 + 1
            goto L_0x001f
        L_0x0051:
            java.lang.String r0 = "null_item_key_"
            java.lang.String r2 = X.002.A0O(r0, r6)
            r1 = 0
            r0 = -1
            X.L7g r5 = new X.L7g
            r5.<init>(r1, r1, r2, r0)
            goto L_0x0046
        L_0x005f:
            r9.A05(r8)
            com.google.android.material.appbar.AppBarLayout r1 = r11.A04
            if (r1 == 0) goto L_0x006d
            r0 = 13
            r1.A03 = r0
            r1.requestLayout()
        L_0x006d:
            androidx.recyclerview.widget.RecyclerView r0 = r11.A02
            r2 = 0
            if (r0 == 0) goto L_0x0074
            X.2Rw r2 = r0.A0A
        L_0x0074:
            boolean r0 = r2 instanceof X.AnonymousClass2t9
            if (r0 == 0) goto L_0x0088
            X.2t9 r2 = (X.AnonymousClass2t9) r2
            if (r2 == 0) goto L_0x0088
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = X.DbS.A0R()
            java.util.List r0 = r3.A04
            r1.A01(r0)
            r2.A05(r1)
        L_0x0088:
            java.util.List r0 = r3.A04
            boolean r3 = r0.isEmpty()
            r2 = 8
            r1 = 0
            androidx.recyclerview.widget.RecyclerView r0 = r11.A02
            if (r3 == 0) goto L_0x00db
            if (r0 == 0) goto L_0x009a
            r0.setVisibility(r2)
        L_0x009a:
            android.view.View r0 = r11.A00
            if (r0 == 0) goto L_0x00a1
            r0.setVisibility(r1)
        L_0x00a1:
            boolean r0 = r4.A00()
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = r11.A05
            if (r1 == 0) goto L_0x00b0
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
        L_0x00b0:
            boolean r3 = r12 instanceof X.C61453K8h
            android.view.View r2 = r11.A01
            r1 = 0
            if (r2 == 0) goto L_0x00c0
            r0 = r3 ^ 1
            int r0 = X.DbW.A01(r0)
            r2.setVisibility(r0)
        L_0x00c0:
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r11.A06
            if (r0 == 0) goto L_0x00cb
            if (r3 != 0) goto L_0x00c8
            r1 = 8
        L_0x00c8:
            r0.setVisibility(r1)
        L_0x00cb:
            androidx.fragment.app.FragmentActivity r1 = r11.getActivity()
            boolean r0 = r1 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x00da
            com.instagram.base.activity.BaseFragmentActivity r1 = (com.instagram.base.activity.BaseFragmentActivity) r1
            if (r1 == 0) goto L_0x00da
            r1.A0Z()
        L_0x00da:
            return
        L_0x00db:
            if (r0 == 0) goto L_0x00e0
            r0.setVisibility(r1)
        L_0x00e0:
            android.view.View r0 = r11.A00
            if (r0 == 0) goto L_0x00a1
            r0.setVisibility(r2)
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61414K6l.A01(X.K6l, X.L5u):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public C61414K6l() {
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20606Wvn(new C20606Wvn(this, 38), 39));
        0Yh A0z = DbS.A0z(C60293Jiq.class);
        this.A08 = DbS.A0I(new C20606Wvn(A002, 40), new C41566AwY(5, A002, this), new C41566AwY(4, (Object) null, A002), A0z);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1824358156);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.boost_ig_media_picker_ab_test_content_fragment, false);
        AnonymousClass0fD.A09(-1385972577, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-32536597);
        super.onDestroyView();
        this.A00 = null;
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            recyclerView.setAdapter((2Rw) null);
        }
        RecyclerView recyclerView2 = this.A02;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager((C252553pI) null);
        }
        this.A02 = null;
        RecyclerView recyclerView3 = this.A03;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter((2Rw) null);
        }
        RecyclerView recyclerView4 = this.A03;
        if (recyclerView4 != null) {
            recyclerView4.setLayoutManager((C252553pI) null);
        }
        this.A03 = null;
        this.A04 = null;
        this.A01 = null;
        this.A06 = null;
        this.A05 = null;
        AnonymousClass0fD.A09(-442111930, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1218080780);
        super.onResume();
        A01(this, (C63762L5u) ((C60252Ji9) this.A0B.getValue()).A05.getValue());
        AnonymousClass0fD.A09(-580827599, A022);
    }
}
