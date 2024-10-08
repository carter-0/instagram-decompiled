package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.location.Location;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.Adapter;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.android.maps.model.LatLng;
import com.facebook.maps.ttrc.common.MapboxTTRC;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.friendmap.configs.FriendMapLaunchConfig;
import com.instagram.friendmap.view.customview.FriendMapAnimatedLikeView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* renamed from: X.NJa  reason: case insensitive filesystem */
public final class C68462NJa extends AnonymousClass4DH implements AnonymousClass4DR, X8V, X8W, X8X {
    public static final String __redex_internal_original_name = "FriendMapFragment";
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public CardView A07;
    public CardView A08;
    public CardView A09;
    public CardView A0A;
    public ViewPager2 A0B;
    public AnonymousClass2t9 A0C;
    public IgFrameLayout A0D;
    public IgFrameLayout A0E;
    public IgFrameLayout A0F;
    public IgLinearLayout A0G;
    public IgSimpleImageView A0H;
    public IgSimpleImageView A0I;
    public IgSimpleImageView A0J;
    public IgSimpleImageView A0K;
    public IgSimpleImageView A0L;
    public IgSimpleImageView A0M;
    public IgSimpleImageView A0N;
    public IgSimpleImageView A0O;
    public IgSimpleImageView A0P;
    public IgSimpleImageView A0Q;
    public IgSimpleImageView A0R;
    public CircularImageView A0S;
    public IgImageView A0T;
    public IgImageView A0U;
    public IgImageView A0V;
    public ReboundViewPager A0W;
    public FriendMapLaunchConfig A0X;
    public C58045Ikd A0Y;
    public FriendMapAnimatedLikeView A0Z;
    public C68634NQn A0a;
    public C68633NQm A0b;
    public OMr A0c;
    public C70817OMm A0d;
    public NR4 A0e;
    public IgdsBottomButtonLayout A0f;
    public C18663VwL A0g;
    public QuickSnapReactionEmitterView A0h;
    public Integer A0i;
    public IgFrameLayout A0j;
    public C72273Ozi A0k;
    public final 2el A0l = 2el.A00();
    public final AnonymousClass0eM A0m = AnonymousClass1YB.A00(C73905Plg.A00(this, 22));
    public final AnonymousClass0eM A0n = AnonymousClass1YB.A00(C73905Plg.A00(this, 23));
    public final AnonymousClass0eM A0o = C227642jf.A02(this);
    public final AnonymousClass0eM A0p = DbS.A0I(C73905Plg.A00(this, 25), C73905Plg.A00(this, 26), new C58185Inp(18, (Object) null, this), DbS.A0z(C69028NdD.class));

    public final int BOy(C14633Tzf tzf) {
        return 0;
    }

    public final void DPX(C18663VwL vwL) {
    }

    public final void DPb(C18663VwL vwL) {
        C69028NdD A012 = A01(this);
        Integer num = AnonymousClass05K.A00;
        UserSession userSession = A012.A02;
        if (C56317HwU.A01(userSession, num)) {
            C69028NdD.A0A((C69486NmU) null, A012, num, new C73662Phb(A012, 3), new C73662Phb(A012, 4), 300, C51965G9l.A1a(0Tu.A05, userSession, 36321769623987931L));
        } else {
            C71035OZw oZw = A012.A06;
            if (((!oZw.A05() && oZw.A04()) || !oZw.A05()) && (MYL.A01(A012) instanceof C69031NdI) && ((AnonymousClass4A6) A012.A05.A0N.getValue()).A04 != AnonymousClass4A5.PRIVATE && AnonymousClass3HF.A03(userSession)) {
                C318136oS A002 = C318116oQ.A00(A012);
                1Eo.A03(num, 19B.A00, new MG8(A012, (AnonymousClass4D7) null, 29), A002);
            }
            C69028NdD.A09((C69486NmU) null, A012, AnonymousClass05K.A01, new C73662Phb(A012, 5));
        }
        07U r10 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A003 = AnonymousClass07a.A00(viewLifecycleOwner);
        1Eo.A03(num, 19B.A00, new MHE(viewLifecycleOwner, r10, this, (AnonymousClass4D7) null, 32), A003);
    }

    public final void EEz(C18016Vjs vjs, C14955UGt uGt) {
    }

    public final void EF0(C18016Vjs vjs, C14955UGt uGt) {
    }

    public final String getModuleName() {
        return "friend_map";
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.NR4, java.lang.Object, X.3os] */
    /* JADX WARNING: type inference failed for: r0v142, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void onViewCreated(View view, Bundle bundle) {
        C67686MsO msO;
        ViewGroup viewGroup;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        View A0B2 = C66583MXo.A0B(this, R.id.note_creation_button);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) A0B2;
        C67587MqL.A07(igSimpleImageView, R.drawable.instagram_add_pano_outline_24);
        0qQ.A07(A0B2);
        this.A0L = igSimpleImageView;
        this.A0D = (IgFrameLayout) C66584MXp.A0A(this, R.id.center_location_button_container);
        View A0B3 = C66583MXo.A0B(this, R.id.center_location_button);
        IgSimpleImageView igSimpleImageView2 = (IgSimpleImageView) A0B3;
        C67587MqL.A07(igSimpleImageView2, R.drawable.instagram_location_arrow_pano_outline_24);
        0qQ.A07(A0B3);
        this.A0J = igSimpleImageView2;
        View A0B4 = C66583MXo.A0B(this, R.id.center_location_button_warning);
        IgSimpleImageView igSimpleImageView3 = (IgSimpleImageView) A0B4;
        igSimpleImageView3.setImageResource(R.drawable.instagram_warning_pano_filled_12);
        DbU.A14(igSimpleImageView3.getContext(), igSimpleImageView3, R.color.activator_card_progress_bad);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(AnonymousClass7TF.A03(requireContext(), R.attr.igds_color_primary_background));
        igSimpleImageView3.setBackground(gradientDrawable);
        0qQ.A07(A0B4);
        this.A0K = igSimpleImageView3;
        View A0B5 = C66583MXo.A0B(this, R.id.back_button);
        IgSimpleImageView igSimpleImageView4 = (IgSimpleImageView) A0B5;
        C67587MqL.A07(igSimpleImageView4, R.drawable.instagram_chevron_left_pano_outline_rtl_24);
        0qQ.A07(A0B5);
        this.A0H = igSimpleImageView4;
        View A0B6 = C66583MXo.A0B(this, R.id.zoom_out_button);
        IgSimpleImageView igSimpleImageView5 = (IgSimpleImageView) A0B6;
        C67587MqL.A07(igSimpleImageView5, R.drawable.instagram_expand_pano_outline_24);
        0qQ.A07(A0B6);
        this.A0R = igSimpleImageView5;
        View A0B7 = C66583MXo.A0B(this, R.id.settings_button);
        IgSimpleImageView igSimpleImageView6 = (IgSimpleImageView) A0B7;
        C67587MqL.A07(igSimpleImageView6, R.drawable.instagram_settings_pano_outline_24);
        0qQ.A07(A0B7);
        this.A0P = igSimpleImageView6;
        View A0B8 = C66583MXo.A0B(this, R.id.test_rig_button);
        IgSimpleImageView igSimpleImageView7 = (IgSimpleImageView) A0B8;
        C67587MqL.A07(igSimpleImageView7, R.drawable.instagram_sliders_pano_outline_24);
        0qQ.A07(A0B8);
        this.A0Q = igSimpleImageView7;
        this.A01 = C66584MXp.A0A(this, R.id.self_view_container);
        IgImageView A0B9 = C66583MXo.A0B(this, R.id.self_view_button);
        IgImageView igImageView = (CircularImageView) A0B9;
        AnonymousClass0eM r9 = this.A0o;
        User A022 = JTR.A0u(r9).A02(DbU.A0u(r9));
        if (A022 != null) {
            DbU.A1S(this, igImageView, A022);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(AnonymousClass7TF.A03(requireContext(), R.attr.igds_color_primary_background));
        igImageView.setBackground(gradientDrawable2);
        0qQ.A07(A0B9);
        this.A0S = igImageView;
        View A0B10 = C66583MXo.A0B(this, R.id.self_view_count_label);
        TextView textView = (TextView) A0B10;
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(1);
        gradientDrawable3.setColor(AnonymousClass7TF.A03(requireContext(), R.attr.igds_color_primary_background));
        textView.setBackground(gradientDrawable3);
        0qQ.A07(A0B10);
        this.A06 = textView;
        this.A0G = (IgLinearLayout) C66584MXp.A0A(this, R.id.map_focus_mode_overlay);
        this.A0B = (ViewPager2) C66584MXp.A0A(this, R.id.friend_map_h_scroll_pager);
        View A0B11 = C66583MXo.A0B(this, R.id.exit_focus_view_button);
        IgSimpleImageView igSimpleImageView8 = (IgSimpleImageView) A0B11;
        C67587MqL.A07(igSimpleImageView8, R.drawable.instagram_x_pano_outline_24);
        0qQ.A07(A0B11);
        this.A0M = igSimpleImageView8;
        this.A0E = (IgFrameLayout) C66584MXp.A0A(this, R.id.map_creation_mode_overlay);
        this.A0f = (IgdsBottomButtonLayout) C66584MXp.A0A(this, R.id.publish_note_bottom_button);
        this.A0A = (CardView) C66584MXp.A0A(this, R.id.publish_note_bottom_card);
        this.A0O = (IgSimpleImageView) C66584MXp.A0A(this, R.id.creation_pin_overlay_image_view);
        this.A0W = (ReboundViewPager) C66584MXp.A0A(this, R.id.quick_emoji_note_options_pager);
        this.A0Z = (FriendMapAnimatedLikeView) C66584MXp.A0A(this, R.id.map_animated_like_view);
        this.A0F = (IgFrameLayout) C66584MXp.A0A(this, R.id.map_hide_places_mode_overlay);
        this.A0N = (IgSimpleImageView) C66584MXp.A0A(this, R.id.hide_places_draft_pin_overlay_image_view);
        CardView cardView = (CardView) C66584MXp.A0A(this, R.id.audience_selector_pill);
        this.A07 = cardView;
        String str = "audiencePillSelector";
        String str2 = str;
        if (cardView != null) {
            this.A02 = AnonymousClass7TE.A0d(cardView, R.id.friend_map_indicator_pill_text);
            CardView cardView2 = this.A07;
            if (cardView2 != null) {
                this.A0T = JTO.A0Y(cardView2, R.id.friend_map_indicator_pill_image);
                0nA.A0e(C66584MXp.A0A(this, R.id.map_buttons_overlay), 2db.A01(requireActivity()));
                View A0B12 = C66583MXo.A0B(this, R.id.friend_map_banner);
                int A012 = 2db.A01(requireActivity());
                0qQ.A0B(A0B12, 0);
                0nA.A0e(A0B12, A012 + 0nA.A0C(A0B12));
                this.A00 = A0B12;
                this.A03 = (TextView) C66584MXp.A0A(this, R.id.friend_map_banner_message);
                View A0B13 = C66583MXo.A0B(this, R.id.friend_map_banner_close_button);
                C71402Ok1.A00(A0B13, 60, this);
                0qQ.A07(A0B13);
                this.A0I = (IgSimpleImageView) C66584MXp.A0A(this, R.id.friend_map_banner_image);
                CardView cardView3 = (CardView) C66584MXp.A0A(this, R.id.not_sharing_location_pill);
                this.A09 = cardView3;
                str = "notSharingLocationPill";
                String str3 = str;
                if (cardView3 != null) {
                    this.A05 = AnonymousClass7TE.A0d(cardView3, R.id.friend_map_indicator_pill_text);
                    CardView cardView4 = this.A09;
                    if (cardView4 != null) {
                        this.A0V = JTO.A0Y(cardView4, R.id.friend_map_indicator_pill_image);
                        CardView cardView5 = (CardView) C66584MXp.A0A(this, R.id.location_sharing_pill);
                        this.A08 = cardView5;
                        str = "locationSharingPill";
                        if (cardView5 != null) {
                            this.A04 = AnonymousClass7TE.A0d(cardView5, R.id.friend_map_indicator_pill_text);
                            CardView cardView6 = this.A08;
                            if (cardView6 != null) {
                                this.A0U = JTO.A0Y(cardView6, R.id.friend_map_indicator_pill_image);
                                if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(r9, 0), 36321769627133698L)) {
                                    View rootView = view2.getRootView();
                                    if ((rootView instanceof ViewGroup) && (viewGroup = (ViewGroup) rootView) != null) {
                                        QuickSnapReactionEmitterView quickSnapReactionEmitterView = new QuickSnapReactionEmitterView(AnonymousClass7TE.A0S(viewGroup), (AttributeSet) null, 0);
                                        this.A0h = quickSnapReactionEmitterView;
                                        viewGroup.addView(quickSnapReactionEmitterView);
                                    }
                                }
                                AnonymousClass2t9 A0U2 = DbU.A0U(DbV.A0S(this), new NQ1(this, AnonymousClass7TE.A0l(r9), (OEH) this.A0m.getValue(), new PGT(this)));
                                this.A0C = A0U2;
                                ViewPager2 viewPager2 = this.A0B;
                                if (viewPager2 != null) {
                                    viewPager2.setAdapter(A0U2);
                                    int dimensionPixelSize = DbV.A05(this).getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
                                    int dimensionPixelSize2 = DbV.A05(this).getDimensionPixelSize(R.dimen.achievements_only_you_bottom_margin);
                                    ViewPager2 viewPager22 = this.A0B;
                                    if (viewPager22 != null) {
                                        viewPager22.offsetLeftAndRight(dimensionPixelSize);
                                        ViewPager2 viewPager23 = this.A0B;
                                        if (viewPager23 != null) {
                                            viewPager23.setOffscreenPageLimit(3);
                                            ViewPager2 viewPager24 = this.A0B;
                                            if (viewPager24 != null) {
                                                viewPager24.setOrientation(0);
                                                int i = dimensionPixelSize + dimensionPixelSize2;
                                                ViewPager2 viewPager25 = this.A0B;
                                                if (viewPager25 != null) {
                                                    viewPager25.setPageTransformer(new C71507Oly(i));
                                                    ViewPager2 viewPager26 = this.A0B;
                                                    if (viewPager26 != null) {
                                                        int i2 = dimensionPixelSize2 * 2;
                                                        viewPager26.A04.A11(new C67831MvZ(dimensionPixelSize2, i2, i2));
                                                        ReboundViewPager reboundViewPager = this.A0W;
                                                        String str4 = "quickEmojiPager";
                                                        if (reboundViewPager != null) {
                                                            C67686MsO msO2 = new C67686MsO(requireContext(), AnonymousClass7TE.A0l(r9), (C71144Ody) this.A0n.getValue());
                                                            msO2.A00 = new C70752OJy(this);
                                                            reboundViewPager.setAdapter((Adapter) msO2);
                                                            float A013 = AnonymousClass7TE.A01(DbV.A05(this), R.dimen.appreciation_reels_grid_item_width);
                                                            C342277oK r12 = new C342277oK(C342257oI.A00(A013, ((float) 0nA.A09(requireContext())) / 2.0f, AnonymousClass7TE.A01(DbV.A05(this), R.dimen.action_bar_item_spacing_left), AnonymousClass7TE.A01(DbV.A05(this), R.dimen.fbpay_ui_text_button_width), AnonymousClass7TE.A01(DbV.A05(this), R.dimen.avatar_size_ridiculously_xlarge)), A013, (float) 0nA.A09(requireContext()), A013, 20.0f);
                                                            ReboundViewPager reboundViewPager2 = this.A0W;
                                                            if (reboundViewPager2 != null) {
                                                                reboundViewPager2.A04 = 4.0f;
                                                                reboundViewPager2.A0M(4, false);
                                                                ReboundViewPager reboundViewPager3 = this.A0W;
                                                                if (reboundViewPager3 != null) {
                                                                    reboundViewPager3.setPageSpacing(0.0f);
                                                                    ReboundViewPager reboundViewPager4 = this.A0W;
                                                                    if (reboundViewPager4 != null) {
                                                                        reboundViewPager4.setScrollMode(AnonymousClass3TG.WHEEL_OF_FORTUNE);
                                                                        ReboundViewPager reboundViewPager5 = this.A0W;
                                                                        if (reboundViewPager5 != null) {
                                                                            reboundViewPager5.A0J = r12;
                                                                            IgSimpleImageView igSimpleImageView9 = this.A0L;
                                                                            if (igSimpleImageView9 == null) {
                                                                                str4 = "createNoteButton";
                                                                            } else {
                                                                                NQx.A01(C66583MXo.A0N(igSimpleImageView9), this, 12);
                                                                                IgSimpleImageView igSimpleImageView10 = this.A0M;
                                                                                if (igSimpleImageView10 == null) {
                                                                                    str4 = "exitFocusViewButton";
                                                                                } else {
                                                                                    NQx.A01(C66583MXo.A0N(igSimpleImageView10), this, 13);
                                                                                    ViewPager2 viewPager27 = this.A0B;
                                                                                    if (viewPager27 != null) {
                                                                                        viewPager27.A05(new N02(new C59100J6i(this, 29), 1));
                                                                                        ? obj = new Object();
                                                                                        ReboundViewPager reboundViewPager6 = this.A0W;
                                                                                        if (reboundViewPager6 != null) {
                                                                                            obj.A00 = reboundViewPager6;
                                                                                            Adapter adapter = reboundViewPager6.getAdapter();
                                                                                            if ((adapter instanceof C67686MsO) && (msO = (C67686MsO) adapter) != null) {
                                                                                                obj.A01 = msO;
                                                                                            }
                                                                                            this.A0e = obj;
                                                                                            reboundViewPager6.A0P(obj);
                                                                                            IgSimpleImageView igSimpleImageView11 = this.A0H;
                                                                                            if (igSimpleImageView11 == null) {
                                                                                                str4 = "backButton";
                                                                                            } else {
                                                                                                NQx.A01(C66583MXo.A0N(igSimpleImageView11), this, 14);
                                                                                                IgSimpleImageView igSimpleImageView12 = this.A0J;
                                                                                                if (igSimpleImageView12 == null) {
                                                                                                    str4 = "centerLocationButton";
                                                                                                } else {
                                                                                                    NQx.A01(C66583MXo.A0N(igSimpleImageView12), this, 15);
                                                                                                    IgSimpleImageView igSimpleImageView13 = this.A0P;
                                                                                                    if (igSimpleImageView13 == null) {
                                                                                                        str4 = "settingsButton";
                                                                                                    } else {
                                                                                                        NQx.A01(C66583MXo.A0N(igSimpleImageView13), this, 16);
                                                                                                        IgSimpleImageView igSimpleImageView14 = this.A0Q;
                                                                                                        if (igSimpleImageView14 == null) {
                                                                                                            str4 = "testRigButton";
                                                                                                        } else {
                                                                                                            NQx.A01(C66583MXo.A0N(igSimpleImageView14), this, 17);
                                                                                                            ? r0 = this.A0S;
                                                                                                            if (r0 == 0) {
                                                                                                                str4 = "selfViewButton";
                                                                                                            } else {
                                                                                                                NQx.A01(C66583MXo.A0N(r0), this, 18);
                                                                                                                IgSimpleImageView igSimpleImageView15 = this.A0R;
                                                                                                                if (igSimpleImageView15 == null) {
                                                                                                                    str4 = "zoomOutButton";
                                                                                                                } else {
                                                                                                                    NQx.A01(C66583MXo.A0N(igSimpleImageView15), this, 19);
                                                                                                                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A0f;
                                                                                                                    if (igdsBottomButtonLayout == null) {
                                                                                                                        str4 = "publishNoteBottomButton";
                                                                                                                    } else {
                                                                                                                        igdsBottomButtonLayout.setPrimaryActionOnClickListener(new C71402Ok1((Object) this, 61));
                                                                                                                        CardView cardView7 = this.A07;
                                                                                                                        if (cardView7 == null) {
                                                                                                                            str4 = str2;
                                                                                                                        } else {
                                                                                                                            NQx.A01(C66583MXo.A0N(cardView7), this, 20);
                                                                                                                            CardView cardView8 = this.A09;
                                                                                                                            if (cardView8 == null) {
                                                                                                                                str4 = str3;
                                                                                                                            } else {
                                                                                                                                NQx.A01(C66583MXo.A0N(cardView8), this, 10);
                                                                                                                                CardView cardView9 = this.A08;
                                                                                                                                if (cardView9 == null) {
                                                                                                                                    str4 = str;
                                                                                                                                } else {
                                                                                                                                    NQx.A01(C66583MXo.A0N(cardView9), this, 11);
                                                                                                                                    this.mLifecycleRegistry.A09(A01(this));
                                                                                                                                    C58045Ikd ikd = this.A0Y;
                                                                                                                                    if (ikd == null) {
                                                                                                                                        str4 = "annotationPlaybackManager";
                                                                                                                                    } else {
                                                                                                                                        registerLifecycleListener(ikd);
                                                                                                                                        2el r3 = this.A0l;
                                                                                                                                        AnonymousClass3DZ A002 = AnonymousClass3DZ.A00(this);
                                                                                                                                        ViewPager2 viewPager28 = this.A0B;
                                                                                                                                        if (viewPager28 != null) {
                                                                                                                                            r3.A08(viewPager28, A002, new AnonymousClass2eo[0]);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    str4 = "presenceHScrollPager";
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        0qQ.A0F(str4);
                                                        throw AnonymousClass00P.createAndThrow();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                0qQ.A0F("presenceHScrollPager");
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final C69041NdZ A00(N4t n4t, C68462NJa nJa) {
        C18663VwL vwL = nJa.A0g;
        if (vwL == null) {
            0qQ.A0F("mapViewController");
            throw AnonymousClass00P.createAndThrow();
        }
        C14955UGt A052 = vwL.A05(n4t);
        if (A052 instanceof C69041NdZ) {
            return (C69041NdZ) A052;
        }
        return null;
    }

    public static final C69028NdD A01(C68462NJa nJa) {
        return (C69028NdD) nJa.A0p.getValue();
    }

    public static final void A02(Drawable drawable, C68462NJa nJa, Integer num, int i) {
        Drawable A0E2;
        String str;
        CardView cardView = nJa.A08;
        if (cardView == null) {
            str = "locationSharingPill";
        } else {
            TextView textView = nJa.A04;
            if (textView == null) {
                str = "locationSharingPillText";
            } else {
                IgImageView igImageView = nJa.A0U;
                if (igImageView == null) {
                    str = "locationSharingPillImage";
                } else {
                    String A0d2 = AnonymousClass7TF.A0d(DbV.A05(nJa), i);
                    cardView.setCardBackgroundColor(AnonymousClass7TF.A03(nJa.requireContext(), R.attr.igds_color_primary_background));
                    int A032 = AnonymousClass7TF.A03(nJa.requireContext(), R.attr.igds_color_primary_text);
                    textView.setTextColor(A032);
                    textView.setText(A0d2);
                    if (drawable == null) {
                        if (num != null && (A0E2 = JTP.A0E(nJa.requireContext(), num)) != null && (drawable = A0E2.mutate()) != null) {
                            drawable.setTint(A032);
                        } else {
                            return;
                        }
                    }
                    igImageView.setImageDrawable(drawable);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A03(C68462NJa nJa, int i) {
        ReboundViewPager reboundViewPager = nJa.A0W;
        if (reboundViewPager != null) {
            if (reboundViewPager.getCurrentDataIndex() != i) {
                ReboundViewPager reboundViewPager2 = nJa.A0W;
                if (reboundViewPager2 != null) {
                    ReboundViewPager.A05(reboundViewPager2, 0.0d, (float) i, true);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("quickEmojiPager");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A04(C68462NJa nJa, Set set, boolean z) {
        C18663VwL vwL = nJa.A0g;
        if (vwL != null) {
            if (z) {
                set = C281945Ae.A02(set);
            }
            vwL.A0G(set);
            C18663VwL vwL2 = nJa.A0g;
            if (vwL2 != null) {
                vwL2.A09();
                return;
            }
        }
        0qQ.A0F("mapViewController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A05(Map map) {
        C18663VwL vwL = this.A0g;
        if (vwL != null) {
            Set A072 = vwL.A07();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : A072) {
                if (((N4t) next).A05 == null) {
                    A1C.add(next);
                }
            }
            C18663VwL vwL2 = this.A0g;
            if (vwL2 != null) {
                Set A073 = vwL2.A07();
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                for (Object next2 : A073) {
                    if (((N4t) next2).A05 != null) {
                        A1C2.add(next2);
                    }
                }
                LinkedHashMap A1H = AnonymousClass7TE.A1H();
                Iterator A0u = AnonymousClass7TF.A0u(map);
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    ArrayList A0r = AnonymousClass7TG.A0r(A1C);
                    Iterator it = A1C.iterator();
                    while (it.hasNext()) {
                        A0r.add(C66580MXl.A0f(it).A06.getId());
                    }
                    if (A0r.contains(A1J.getKey())) {
                        Dbb.A1V(A1J, A1H);
                    }
                }
                LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
                Iterator it2 = A1C2.iterator();
                while (it2.hasNext()) {
                    N4t A0f2 = C66580MXl.A0f(it2);
                    String str = A0f2.A0A;
                    if (map.containsKey(str)) {
                        A1H2.put(A0f2, Long.valueOf(DbY.A04(C51966G9m.A14(str, map))));
                    }
                }
                AnonymousClass0eM r4 = this.A0n;
                C71144Ody ody = (C71144Ody) r4.getValue();
                C3018760k A012 = C3018660j.A01(ody.A01);
                Iterator A0s = AnonymousClass7TF.A0s(A1H2);
                while (A0s.hasNext()) {
                    Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s);
                    N4t n4t = (N4t) A1J2.getKey();
                    long A0R2 = AnonymousClass7TE.A0R(A1J2.getValue());
                    String str2 = n4t.A0A;
                    if (!(n4t.A05 == null || str2 == null)) {
                        ody.A0B(A012, n4t, A0R2, false);
                    }
                }
                C71144Ody ody2 = (C71144Ody) r4.getValue();
                Iterator A0s2 = AnonymousClass7TF.A0s(A1H);
                while (A0s2.hasNext()) {
                    Map.Entry A1J3 = AnonymousClass7TE.A1J(A0s2);
                    ody2.A08(AnonymousClass7TE.A0R(A1J3.getValue()), (String) A1J3.getKey(), false);
                }
                return;
            }
        }
        0qQ.A0F("mapViewController");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005a, code lost:
        if ((!r14.A0C) != false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.C14955UGt ALU(X.C19879Wh8 r17, X.XCL r18, X.WFU r19) {
        /*
            r16 = this;
            r14 = r18
            X.N4t r14 = (X.N4t) r14
            r1 = 2
            X.0qQ.A0B(r14, r1)
            r2 = r16
            X.0eM r0 = r2.A0o
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.0h9 r10 = r2.mLifecycleRegistry
            X.0qQ.A07(r10)
            X.OMr r5 = r2.A0c
            if (r5 != 0) goto L_0x0023
            java.lang.String r0 = "mapCoordinator"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0023:
            X.NdD r6 = A01(r2)
            X.0eM r0 = r2.A0n
            java.lang.Object r4 = r0.getValue()
            X.Ody r4 = (X.C71144Ody) r4
            r0 = 27
            X.J6i r7 = new X.J6i
            r7.<init>(r2, r0)
            r0 = 28
            X.J6i r8 = new X.J6i
            r8.<init>(r2, r0)
            X.C51973G9u.A0s(r1, r3, r6, r4)
            android.content.Context r9 = r2.getContext()
            r12 = r19
            if (r9 == 0) goto L_0x005f
            X.OHV r1 = new X.OHV
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            X.NdZ r8 = new X.NdZ
            r11 = r17
            r13 = r3
            r15 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = r14.A0C
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x005f
        L_0x005c:
            X.UGt r8 = (X.C14955UGt) r8
            return r8
        L_0x005f:
            X.NdY r8 = new X.NdY
            r8.<init>(r12, r14)
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68462NJa.ALU(X.Wh8, X.XCL, X.WFU):X.UGt");
    }

    public final Map AoR() {
        C18663VwL vwL = this.A0g;
        if (vwL == null) {
            0qQ.A0F("mapViewController");
            throw AnonymousClass00P.createAndThrow();
        }
        Set<Object> A072 = vwL.A07();
        LinkedHashMap A0x = DbS.A0x(JTT.A08(A072));
        for (Object put : A072) {
            A0x.put(put, "friend_map_notes_cluster");
        }
        return 0Yt.A03(A0x);
    }

    public final Location Au9(C18016Vjs vjs, String str) {
        C69028NdD A012 = A01(this);
        String A0R2 = 002.A0R("FriendMapFragment:", "CurrentLocationDrawable");
        0qQ.A0B(A0R2, 0);
        1Wr r2 = A012.A08;
        if (r2 != null) {
            return r2.getLastLocation(A012.A02, 002.A0R("FriendMapViewModel:", A0R2));
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ XCL BfZ() {
        return null;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0o);
    }

    public final int AoQ() {
        return (int) (((double) Math.max(C67587MqL.A02(requireContext()), C67587MqL.A01(requireContext()))) * ((Number) C229632nm.A09(Double.valueOf(182.A00(0Tu.A05, DbY.A0R(this.A0o), 37166194553520553L)), new C58024IkH(0.1d))).doubleValue());
    }

    public final void D0D(LatLng latLng, boolean z) {
        C69028NdD A012 = A01(this);
        O93 A013 = MYL.A01(A012);
        if (A013 instanceof NdH) {
            C262204Co r0 = A012.A01;
            if (r0 != null) {
                r0.AG7((CancellationException) null);
            }
            if (!z) {
                A012.A0R(new C58766IxD(16, A012, (Object) null, A013, false));
                A012.A01 = C70290O0u.A00(A012, new C73567Pfo(latLng, A012, (AnonymousClass4D7) null, 33), 450);
                return;
            }
        } else if (A013 instanceof NdF) {
            A012.A0P(new PHB(latLng, (Double) null));
            if (!z) {
                A012.A0R(new GN2(17, A013, (Object) null, false));
                return;
            }
        } else {
            return;
        }
        C69028NdD.A0D(latLng, A012);
    }

    public final void DYH(C18663VwL vwL, C17368VSv vSv) {
        A01(this).A07.A01 = vSv;
    }

    public final boolean onBackPressed() {
        C69028NdD A012 = A01(this);
        O93 A013 = MYL.A01(A012);
        if (A013 instanceof C69030NdG) {
            C69028NdD.A0F(C69031NdI.A00, A012);
            A012.A0P(new PH9(1.5f));
            C69028NdD.A0I(A012, 400);
            return true;
        } else if (!(A013 instanceof NdH)) {
            return false;
        } else {
            C262204Co r1 = A012.A01;
            if (r1 != null) {
                r1.AG7((CancellationException) null);
            }
            A012.A0c(true, (String) null);
            C69028NdD.A08(C69028NdD.A03(A012), A012, 15.0f, 150, true, false, false);
            return true;
        }
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        int A022 = AnonymousClass0fD.A02(663367215);
        C68462NJa.super.onCreate(bundle);
        this.A0X = (FriendMapLaunchConfig) requireArguments().getParcelable("arg_friend_map_launch_config");
        0lg A0X2 = DbT.A0X(this.A0o);
        0qQ.A0B(A0X2, 0);
        Oy3 oy3 = (Oy3) A0X2.A01(Oy3.class, C73825PkO.A00);
        FriendMapLaunchConfig friendMapLaunchConfig = this.A0X;
        if (friendMapLaunchConfig != null) {
            num = friendMapLaunchConfig.A09;
        } else {
            num = null;
        }
        oy3.A02 = "";
        Integer num2 = AnonymousClass05K.A0j;
        oy3.A00 = num2;
        if (num == null) {
            num = num2;
        }
        oy3.A00 = num;
        oy3.A02 = AnonymousClass7TF.A0b();
        oy3.A01 = null;
        C71144Ody ody = (C71144Ody) this.A0n.getValue();
        C71144Ody.A05(ody, (Boolean) null, (Boolean) null, (Boolean) null, ody.A02.A00, (Long) null, "MAP_VIEW", "IMPRESSION", (String) null);
        this.A0i = Integer.valueOf(2db.A00(requireActivity()));
        this.A0k = new C72273Ozi(this.A0l, this, this);
        if (getActivity() != null) {
            Window A0G2 = DbV.A0G(this);
            0qQ.A07(A0G2);
            2db.A08(A0G2, true);
            2db.A02(requireActivity(), 0);
        }
        AnonymousClass0fD.A09(-1094684733, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(781849920);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        View inflate = layoutInflater2.inflate(R.layout.friend_map_layout, viewGroup, false);
        this.A0j = (IgFrameLayout) inflate.findViewById(R.id.map_container);
        Context requireContext = requireContext();
        AnonymousClass0eM r6 = this.A0o;
        UserSession A0l2 = AnonymousClass7TE.A0l(r6);
        IgFrameLayout igFrameLayout = this.A0j;
        String str = "mapContainer";
        if (igFrameLayout != null) {
            C18663VwL vwL = new C18663VwL(requireContext, igFrameLayout, A0l2, this, this, this, "friend_map", AnonymousClass1GD.A03());
            vwL.A0E(bundle);
            this.A0g = vwL;
            Context requireContext2 = requireContext();
            UserSession A0l3 = AnonymousClass7TE.A0l(r6);
            C18663VwL vwL2 = this.A0g;
            if (vwL2 == null) {
                str = "mapViewController";
            } else {
                this.A0c = new OMr(requireContext2, A0l3, vwL2, C73905Plg.A00(this, 24));
                this.A0d = new C70817OMm(requireActivity(), this, AnonymousClass7TE.A0l(r6), A01(this));
                int A042 = DbS.A04(0Tu.A05, AnonymousClass7TF.A0L(r6, 0), 36603244599972745L);
                if (A042 > 10) {
                    A042 = 10;
                }
                IgFrameLayout igFrameLayout2 = this.A0j;
                if (igFrameLayout2 != null) {
                    this.A0Y = new C58045Ikd(igFrameLayout2, this, AnonymousClass7TE.A0l(r6), A042);
                    AnonymousClass0fD.A09(-942097138, A022);
                    return inflate;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        ViewGroup viewGroup;
        C14956UGu uGu;
        String str;
        int A022 = AnonymousClass0fD.A02(-1605752042);
        super.onDestroyView();
        C72273Ozi ozi = this.A0k;
        ViewParent viewParent = null;
        if (ozi == null) {
            str = "friendMapViewpointHelper";
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            ozi.A05.clear();
            Map map = ozi.A04;
            map.clear();
            Set set = ozi.A06;
            set.clear();
            Map map2 = ozi.A03;
            Iterator A0u = AnonymousClass7TF.A0u(map2);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                Object key = A1J.getKey();
                long A0R2 = AnonymousClass7TE.A0R(A1J.getValue());
                if (!set.contains(key)) {
                    map.put(key, Long.valueOf(currentTimeMillis - A0R2));
                }
            }
            map2.clear();
            ozi.A01.A05(map);
            this.A0l.A04(this.mView);
            C18663VwL vwL = this.A0g;
            if (vwL == null) {
                str = "mapViewController";
            } else {
                vwL.A04.A00();
                C18016Vjs vjs = vwL.A01;
                if (!(vjs == null || (uGu = vjs.A04) == null)) {
                    uGu.A08();
                }
                QuickSnapReactionEmitterView quickSnapReactionEmitterView = this.A0h;
                if (quickSnapReactionEmitterView != null) {
                    quickSnapReactionEmitterView.A01();
                }
                QuickSnapReactionEmitterView quickSnapReactionEmitterView2 = this.A0h;
                if (quickSnapReactionEmitterView2 != null) {
                    viewParent = quickSnapReactionEmitterView2.getParent();
                }
                if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
                    viewGroup.removeView(this.A0h);
                }
                AnonymousClass0fD.A09(72646042, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1189058173);
        C68462NJa.super.onPause();
        C18663VwL vwL = this.A0g;
        if (vwL == null) {
            0qQ.A0F("mapViewController");
            throw AnonymousClass00P.createAndThrow();
        }
        if (vwL.A04.A01 != null) {
            MapboxTTRC.cancel("maps_perf_logger_on_pause");
        }
        AnonymousClass0fD.A09(-1472609760, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1140694190);
        super.onResume();
        2db.A02(requireActivity(), 0);
        C18663VwL vwL = this.A0g;
        if (vwL == null) {
            0qQ.A0F("mapViewController");
            throw AnonymousClass00P.createAndThrow();
        }
        vwL.A04.A01();
        AnonymousClass0fD.A09(1175842009, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-192679431);
        C68462NJa.super.onStart();
        C18663VwL vwL = this.A0g;
        if (vwL == null) {
            0qQ.A0F("mapViewController");
            throw AnonymousClass00P.createAndThrow();
        }
        vwL.A04.A02();
        if (getActivity() != null) {
            Window A0G2 = DbV.A0G(this);
            0qQ.A07(A0G2);
            2db.A08(A0G2, true);
            2db.A02(requireActivity(), 0);
        }
        AnonymousClass0fD.A09(238788178, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1576233794);
        C68462NJa.super.onStop();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            0qQ.A07(window);
            2db.A08(window, false);
            Integer num = this.A0i;
            if (num != null) {
                2db.A02(getActivity(), num.intValue());
            }
        }
        if (this.A0g == null) {
            0qQ.A0F("mapViewController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            AnonymousClass0fD.A09(2131528553, A022);
        }
    }
}
