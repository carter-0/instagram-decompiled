package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.spinner.RefreshSpinner;
import java.util.List;

/* renamed from: X.E3r  reason: case insensitive filesystem */
public final class C47468E3r extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "AvatarCoinFlipCustomizationFragment";
    public RecyclerView A00;
    public RecyclerView A01;
    public ProfileCoinFlipView A02;
    public AnonymousClass2t9 A03;
    public AnonymousClass2t9 A04;
    public IgdsBottomButtonLayout A05;
    public RefreshSpinner A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public 2dZ A0B;
    public IgView A0C;
    public IgView A0D;
    public final Intent A0E;
    public final C50480FcS A0F;
    public final C50480FcS A0G;
    public final C50480FcS A0H;
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K = DbS.A0I(C51799G2i.A00(this, 0), C51801G2k.A00(this, 48), new MMX(14, (Object) null, (Object) this), DbS.A0z(DdZ.class));
    public final AnonymousClass0eM A0L;
    public final C50195FTb A0M;

    public final String getModuleName() {
        return "avatar_coin_flip_customization";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.postponeEnterTransition();
        }
        this.A00 = DbT.A0I(view2, R.id.avatar_background_grid);
        this.A01 = DbT.A0I(view2, R.id.avatar_pose_grid);
        this.A05 = DbT.A0c(view2, R.id.update_coin_flip_button);
        this.A02 = (ProfileCoinFlipView) view2.requireViewById(R.id.avatar_preview);
        this.A06 = view2.requireViewById(R.id.loading_spinner);
        this.A0C = (IgView) view2.requireViewById(R.id.grid_separator);
        this.A0D = (IgView) view2.requireViewById(R.id.preview_separator);
        AnonymousClass2tC A0S = DbV.A0S(this);
        AnonymousClass0eM r1 = this.A0L;
        AnonymousClass2t9 A0U = DbU.A0U(A0S, new EHK(this, AnonymousClass7TE.A0l(r1)));
        this.A03 = A0U;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter(A0U);
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 1, 0, false);
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            recyclerView2.A11(new C361648gZ(false, DbV.A05(this).getDimensionPixelOffset(R.dimen.accent_edge_thickness), DbV.A05(this).getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap), DbV.A05(this).getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap), 0));
        }
        RecyclerView recyclerView3 = this.A00;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(gridLayoutManager);
        }
        AnonymousClass2t9 A0U2 = DbU.A0U(DbV.A0S(this), new EHL(AnonymousClass7TE.A0l(r1), requireContext()));
        this.A04 = A0U2;
        RecyclerView recyclerView4 = this.A01;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(A0U2);
        }
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(requireContext(), 3, 1, false);
        RecyclerView recyclerView5 = this.A01;
        if (recyclerView5 != null) {
            recyclerView5.A11(new C361648gZ(true, DbV.A05(this).getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), DbV.A05(this).getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), DbV.A05(this).getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), 0));
        }
        RecyclerView recyclerView6 = this.A01;
        if (recyclerView6 != null) {
            recyclerView6.setLayoutManager(gridLayoutManager2);
        }
        07U r11 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        07U r16 = r11;
        MHH mhh = new MHH(r16, this, viewLifecycleOwner, (AnonymousClass4D7) null, 27);
        19B r2 = 19B.A00;
        1Eo.A05(r2, mhh, A002);
        AnonymousClass7TH.A0R(this.A05);
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A05;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionOnClickListener(new FP6((Object) this, 31));
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A05;
        if (igdsBottomButtonLayout2 != null) {
            igdsBottomButtonLayout2.setDividerVisible(true);
        }
        AnonymousClass07Z viewLifecycleOwner2 = getViewLifecycleOwner();
        1Eo.A05(r2, new MHH(r16, this, viewLifecycleOwner2, (AnonymousClass4D7) null, 28), AnonymousClass07a.A00(viewLifecycleOwner2));
        if (this.A0A) {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.setEnterSharedElementCallback(new C46660Dih(this));
            }
        } else {
            A03(this);
        }
        AnonymousClass0eM r7 = this.A0K;
        if (!((DdZ) r7.getValue()).A0A.A00.A00.getBoolean("KEY_HAS_SEEN_CUSTOMIZATION_LAUNCH_ON_EDIT_PROFILE", false)) {
            String str2 = this.A07;
            str = "editorSurface";
            if (str2 != null) {
                if (str2.equals("ig_edit_profile")) {
                    DbX.A1V(((DdZ) r7.getValue()).A0A.A00.A00, "KEY_HAS_SEEN_CUSTOMIZATION_LAUNCH_ON_EDIT_PROFILE", true);
                    C46368Ddk ddk = (C46368Ddk) this.A0I.getValue();
                    String str3 = this.A07;
                    if (str3 != null) {
                        C48376EdX.A00(ddk.A01, str3);
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0eM r3 = this.A0I;
        2YL A0H2 = DbS.A0H(r3);
        1Eo.A05(r2, new MFS(A0H2, (AnonymousClass4D7) null, 15), C318116oQ.A00(A0H2));
        ((C46368Ddk) r3.getValue()).A05(DcE.A03(AnonymousClass7TE.A0l(r1)), DcE.A03(AnonymousClass7TE.A0l(r1)));
        AnonymousClass0eM r12 = this.A0J;
        if (AnonymousClass7TF.A1Z(DbZ.A0O(r12).A08)) {
            AnonymousClass07Z viewLifecycleOwner3 = getViewLifecycleOwner();
            1Eo.A05(r2, new MHG(view2, viewLifecycleOwner3, this, r11, (AnonymousClass4D7) null, 18), AnonymousClass07a.A00(viewLifecycleOwner3));
            DbZ.A0O(r12).A02(C317846nw.CONVERGENCE_2_UPSELL_BANNER_STICKER_PACK);
        }
        C46368Ddk ddk2 = (C46368Ddk) r3.getValue();
        if (this.A08 && !ddk2.A03.A00.getBoolean("key_has_seen_coin_flip_pose_deprecated_message", false)) {
            if (182.A06(0Tu.A05, ddk2.A02, 36325351626060692L)) {
                ddk2.A05.FIA(C47390DxM.A00);
            }
        }
        C46368Ddk ddk3 = (C46368Ddk) r3.getValue();
        String str4 = this.A07;
        if (str4 == null) {
            str = "editorSurface";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C48376EdX.A00(ddk3.A01, str4);
    }

    private final AnimatorSet A00(float f, float f2, float f3, float f4) {
        View view;
        Animator[] animatorArr;
        AnimatorSet animatorSet = new AnimatorSet();
        ProfileCoinFlipView profileCoinFlipView = this.A02;
        if (profileCoinFlipView != null) {
            view = profileCoinFlipView.getRootView();
        } else {
            view = null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{f, f2});
        RecyclerView recyclerView = this.A00;
        Property property = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(recyclerView, property, new float[]{f3, f4});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.A01, property, new float[]{f3, f4});
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.A0C, property, new float[]{f3, f4});
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.A0D, property, new float[]{f3, f4});
        if (this.A0A) {
            animatorArr = new Animator[]{ofFloat2, ofFloat3, ofFloat4, ofFloat5};
        } else {
            animatorArr = new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5};
        }
        animatorSet.playTogether(animatorArr);
        return animatorSet;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.avatars.coinflip.CoinFlipAvatarImageView, android.view.View] */
    public static final void A01(AvatarCoinFlipSticker avatarCoinFlipSticker, AvatarCoinFlipSticker avatarCoinFlipSticker2, C47468E3r e3r) {
        C47468E3r e3r2 = e3r;
        ProfileCoinFlipView profileCoinFlipView = e3r2.A02;
        if (profileCoinFlipView != null) {
            AnonymousClass0eM r6 = e3r2.A0L;
            C320966tM.A03(AnonymousClass7TE.A0S(profileCoinFlipView), profileCoinFlipView, AnonymousClass7TE.A0l(r6), (Integer) null, R.dimen.avatar_size_coin_flip_expanded_view);
            AvatarCoinFlipSticker avatarCoinFlipSticker3 = avatarCoinFlipSticker2;
            AvatarCoinFlipSticker avatarCoinFlipSticker4 = avatarCoinFlipSticker;
            profileCoinFlipView.setAvatarDrawables(0sr.A1P(new C321006tQ[]{C320966tM.A00(e3r2.requireContext(), AnonymousClass7TE.A0l(r6), avatarCoinFlipSticker3.A03, avatarCoinFlipSticker3.A00, R.dimen.avatar_size_coin_flip_expanded_view), C320966tM.A00(e3r2.requireContext(), AnonymousClass7TE.A0l(r6), avatarCoinFlipSticker4.A03, avatarCoinFlipSticker4.A00, R.dimen.avatar_size_coin_flip_expanded_view)}));
            C320946tJ r9 = C320946tJ.AVATAR;
            profileCoinFlipView.A0F(r9);
            profileCoinFlipView.A01.setAvatarScale(1.0f);
            ProfileCoinFlipView profileCoinFlipView2 = profileCoinFlipView;
            C321266tq r7 = new C321266tq(profileCoinFlipView, r9, profileCoinFlipView2, (List) null, G1K.A00, G1L.A00, G1M.A00, G1N.A00, DcE.A01(AnonymousClass7TE.A0l(r6)), false, false);
            r7.A08.A05(0.0d);
            r7.A04(r9);
            r7.A0C.A0D();
        }
        ProfileCoinFlipView profileCoinFlipView3 = e3r2.A02;
        if (profileCoinFlipView3 != null) {
            profileCoinFlipView3.A01.setTransitionName(C273654mx.A00(122));
            profileCoinFlipView3.A02.setTransitionName(C273654mx.A00(239));
        }
        FragmentActivity activity = e3r2.getActivity();
        if (activity != null) {
            activity.startPostponedEnterTransition();
        }
    }

    public static final void A02(C47468E3r e3r) {
        View view = e3r.mView;
        if (view != null) {
            2dZ A012 = 2dY.A01(C50091FOg.A00, DbX.A0I(view, R.id.action_bar_container));
            e3r.A0B = A012;
            A012.A0X(new FTS(e3r, 0));
        }
    }

    public static final void A03(C47468E3r e3r) {
        ProfileCoinFlipView profileCoinFlipView;
        View rootView;
        String str = e3r.A07;
        if (str == null) {
            0qQ.A0F("editorSurface");
            throw AnonymousClass00P.createAndThrow();
        } else if (str.equals("ig_self_profile")) {
            RecyclerView recyclerView = e3r.A00;
            if (recyclerView != null) {
                recyclerView.setTranslationY(1500.0f);
            }
            RecyclerView recyclerView2 = e3r.A01;
            if (recyclerView2 != null) {
                recyclerView2.setTranslationY(1500.0f);
            }
            IgView igView = e3r.A0C;
            if (igView != null) {
                igView.setTranslationY(1500.0f);
            }
            IgView igView2 = e3r.A0D;
            if (igView2 != null) {
                igView2.setTranslationY(1500.0f);
            }
            if (!(e3r.A0A || (profileCoinFlipView = e3r.A02) == null || (rootView = profileCoinFlipView.getRootView()) == null)) {
                rootView.setAlpha(0.0f);
            }
            AnimatorSet A002 = e3r.A00(0.0f, 1.0f, 1500.0f, 0.0f);
            A002.setStartDelay(250);
            A002.setDuration(250);
            A002.addListener(new FHI(e3r, 1));
            A002.start();
        } else {
            A02(e3r);
        }
    }

    public static final void A04(C47468E3r e3r) {
        ViewGroup viewGroup;
        String str = e3r.A07;
        if (str == null) {
            0qQ.A0F("editorSurface");
            throw AnonymousClass00P.createAndThrow();
        } else if (str.equals("ig_self_profile")) {
            AnimatorSet A002 = e3r.A00(1.0f, 0.0f, 0.0f, 1500.0f);
            A002.setInterpolator(new DecelerateInterpolator());
            A002.setDuration(250);
            int i = 3;
            if (e3r.A0A) {
                i = 2;
            }
            A002.addListener(new FHI(e3r, i));
            A002.start();
            2dZ r0 = e3r.A0B;
            if (r0 != null && (viewGroup = r0.A0O) != null) {
                viewGroup.setAlpha(0.0f);
            }
        } else {
            Dbc.A0n(e3r);
        }
    }

    public static final void A05(C47468E3r e3r, String str) {
        String str2;
        C317846nw r1;
        C52480GUi gUi = C63556Kz5.A01;
        AnonymousClass0eM r0 = e3r.A0L;
        UserSession A0l = AnonymousClass7TE.A0l(r0);
        FragmentActivity requireActivity = e3r.requireActivity();
        String str3 = e3r.A07;
        if (str3 == null) {
            0qQ.A0F("editorSurface");
            throw AnonymousClass00P.createAndThrow();
        }
        String str4 = str;
        if (str == null) {
            str2 = "ig_avatar_coin_flip_customization_menu_item";
        } else {
            str2 = "mux_banner";
        }
        C50195FTb fTb = e3r.A0M;
        UserSession A0l2 = AnonymousClass7TE.A0l(r0);
        C317856nx r3 = C317846nw.A01;
        C317866ny r2 = C317866ny.PROFILE;
        if (DcE.A00(A0l2)) {
            r1 = C317846nw.COIN_FLIP_CUSTOMIZATION_POSES_440_400;
        } else {
            r1 = C317846nw.COIN_FLIP_CUSTOMIZATION_ALL_POSES;
        }
        gUi.A04(requireActivity, fTb, A0l, str3, str2, str4, 0sr.A1N(r3.A00(r1, r2, A0l2, false)));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0L);
    }

    public C47468E3r() {
        C51801G2k A002 = C51801G2k.A00(this, 46);
        C51799G2i A003 = C51799G2i.A00(this, 1);
        0eO r4 = 0eO.A02;
        AnonymousClass0eM A004 = AnonymousClass0eN.A00(r4, C51799G2i.A00(A003, 2));
        this.A0I = DbS.A0I(C51799G2i.A00(A004, 3), A002, new MMX(15, (Object) null, (Object) A004), DbS.A0z(C46368Ddk.class));
        C51801G2k A005 = C51801G2k.A00(this, 47);
        AnonymousClass0eM A006 = AnonymousClass0eN.A00(r4, C51799G2i.A00(C51799G2i.A00(this, 4), 5));
        this.A0J = DbS.A0I(C51799G2i.A00(A006, 6), A005, new MMX(16, (Object) null, (Object) A006), DbS.A0z(C314336i2.class));
        this.A0E = DbS.A09();
        this.A0M = new C50195FTb(this, 1);
        this.A0H = new C50480FcS(this, 2);
        this.A0G = new C50480FcS(this, 1);
        this.A0F = new C50480FcS(this, 0);
        this.A0L = C227642jf.A02(this);
    }

    public final boolean onBackPressed() {
        A04(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-39625063);
        C47468E3r.super.onCreate(bundle);
        if (requireArguments().getString("args_avatar_idle_sticker_url") == null) {
            illegalStateException = AnonymousClass7TE.A0z("avatar sticker required");
            i = 20960056;
        } else if (requireArguments().getString("args_avatar_pose_sticker_url") != null) {
            requireArguments().getFloat("args_top_margin_ratio");
            String string = requireArguments().getString("args_editor_surface");
            if (string != null) {
                this.A07 = string;
                this.A0A = requireArguments().getBoolean("args_shared_element_transition_enabled");
                this.A09 = requireArguments().getBoolean("args_is_coin_flip_tied_to_avatar");
                this.A08 = requireArguments().getBoolean("args_has_deprecated_pose");
                AnonymousClass0fD.A09(-1203244502, A022);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z("editor surface required");
            i = -198640492;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("avatar sticker required");
            i = -1591589384;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object value;
        JVH jvh;
        int A022 = AnonymousClass0fD.A02(9133499);
        0qQ.A0B(layoutInflater, 0);
        AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse = (AvatarCoinFlipBackgroundOptionResponse) requireArguments().getParcelable("args_avatar_background");
        if (avatarCoinFlipBackgroundOptionResponse != null) {
            ((C46368Ddk) this.A0I.getValue()).A03(avatarCoinFlipBackgroundOptionResponse);
        }
        String string = requireArguments().getString("args_avatar_pose_id");
        if (string != null) {
            05G r3 = ((C46368Ddk) this.A0I.getValue()).A06;
            do {
                value = r3.getValue();
                jvh = (JVH) value;
            } while (!r3.AIY(value, new JVH(jvh.A01, jvh.A02, jvh.A03, jvh.A04, string, 0)));
        }
        View inflate = layoutInflater.inflate(R.layout.avatar_coin_flip_customization_v2_sheet, viewGroup, false);
        AnonymousClass0fD.A09(1535145735, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(279909912);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A05 = null;
        this.A06 = null;
        AnonymousClass0fD.A09(1197697291, A022);
    }
}
