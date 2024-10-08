package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* renamed from: X.6lA  reason: invalid class name and case insensitive filesystem */
public final class C316136lA implements C316076l4 {
    public float A00 = 1.0f;
    public float A01;
    public Drawable A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public View A0I;
    public View A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public View A0Q;
    public View A0R;
    public ImageView A0S;
    public TextView A0T;
    public TextView A0U;
    public TextView A0V;
    public TextView A0W;
    public TextView A0X;
    public TextView A0Y;
    public TextView A0Z;
    public TextView A0a;
    public TextView A0b;
    public TextView A0c;
    public TextView A0d;
    public TextView A0e;
    public TextView A0f;
    public TextView A0g;
    public IgTextView A0h;
    public IgImageView A0i;
    public C255773uh A0j;
    public C250973mM A0k;
    public C67337MmD A0l;
    public C309426Yf A0m;
    public C316236lK A0n;
    public C55785HnK A0o;
    public C316246lL A0p;
    public C74500Pvu A0q;
    public final int A0r;
    public final int A0s;
    public final int A0t;
    public final int A0u;
    public final Resources A0v;
    public final Drawable A0w;
    public final View A0x;
    public final View A0y;
    public final View A0z;
    public final View A10;
    public final View A11;
    public final ViewGroup A12;
    public final ViewStub A13;
    public final ViewStub A14;
    public final ViewStub A15;
    public final ViewStub A16;
    public final ViewStub A17;
    public final ViewStub A18;
    public final ViewStub A19;
    public final ViewStub A1A;
    public final ViewStub A1B;
    public final ViewStub A1C;
    public final ViewStub A1D;
    public final ViewStub A1E;
    public final ViewStub A1F;
    public final ViewStub A1G;
    public final ViewStub A1H;
    public final ViewStub A1I;
    public final ViewStub A1J;
    public final TextView A1K;
    public final TextView A1L;
    public final ConstraintLayout A1M;
    public final AnonymousClass3TX A1N;
    public final UserSession A1O;
    public final C71662eb A1P;
    public final C71662eb A1Q;
    public final C71662eb A1R;
    public final C71662eb A1S;
    public final C71662eb A1T;
    public final C71662eb A1U;
    public final C71662eb A1V;
    public final C252063oV A1W;
    public final C252063oV A1X;
    public final C252063oV A1Y;
    public final C252063oV A1Z;
    public final C252063oV A1a;
    public final C252063oV A1b;
    public final C252063oV A1c;
    public final C252063oV A1d;
    public final C252063oV A1e;
    public final C252063oV A1f;
    public final C252063oV A1g;
    public final C252063oV A1h;
    public final C316196lG A1i;
    public final C316166lD A1j;
    public final C316186lF A1k;
    public final C316226lJ A1l;
    public final C316156lC A1m;
    public final C316146lB A1n;
    public final C316206lH A1o;

    public C316136lA(ViewStub viewStub, ConstraintLayout constraintLayout, UserSession userSession, LikeActionView likeActionView) {
        ViewStub viewStub2;
        ViewStub viewStub3;
        ViewStub viewStub4;
        ViewStub viewStub5;
        ViewStub viewStub6;
        ViewStub viewStub7;
        ViewStub viewStub8;
        ViewStub viewStub9;
        0qQ.A0B(constraintLayout, 1);
        ViewStub viewStub10 = viewStub;
        0qQ.A0B(viewStub, 2);
        LikeActionView likeActionView2 = likeActionView;
        0qQ.A0B(likeActionView2, 3);
        UserSession userSession2 = userSession;
        this.A1O = userSession;
        this.A1M = constraintLayout;
        Resources resources = constraintLayout.getResources();
        this.A0v = resources;
        Context context = constraintLayout.getContext();
        Drawable drawable = context.getDrawable(R.drawable.viewers_icon);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.A0w = mutate;
            mutate.setColorFilter(AnonymousClass37O.A00(context.getColor(R.color.design_dark_default_color_on_background)));
            this.A0r = resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
            this.A0t = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
            this.A0s = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            resources.getDimensionPixelSize(R.dimen.caption_overlay_offset_with_social_bubble);
            this.A0u = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            this.A11 = constraintLayout.requireViewById(R.id.viewer_reel_item_toolbar_container);
            this.A10 = constraintLayout.requireViewById(R.id.toolbar_buttons_container);
            this.A0z = constraintLayout.requireViewById(R.id.self_reel_item_toolbar_container);
            this.A1c = 2b1.A01(constraintLayout.requireViewById(R.id.toolbar_menu_button_stub), !1NM.A00(userSession).A01(), false);
            this.A0y = constraintLayout.requireViewById(R.id.self_toolbar_menu_button);
            this.A1g = 2b1.A01(constraintLayout.requireViewById(R.id.self_toolbar_menu_button_label_stub), !1NM.A00(userSession).A01(), false);
            this.A1e = 2b1.A01(constraintLayout.requireViewById(R.id.toolbar_reshare_button_stub), !1NM.A00(userSession).A01(), false);
            this.A1h = 2b1.A01(constraintLayout.requireViewById(R.id.toolbar_spinner_stub), !1NM.A00(userSession).A01(), false);
            this.A1X = 2b1.A01(constraintLayout.requireViewById(R.id.viewer_ar_effect_try_it_text_stub), !1NM.A00(userSession).A01(), false);
            this.A1W = 2b1.A01(constraintLayout.requireViewById(R.id.viewer_ar_effect_see_details_text_stub), !1NM.A00(userSession).A01(), false);
            this.A1f = 2b1.A01(constraintLayout.requireViewById(R.id.toolbar_save_button_stub), 1NM.A00(userSession).A01(), false);
            this.A1A = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_link_button_stub);
            this.A1E = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_share_to_link_button_stub);
            this.A1B = (ViewStub) constraintLayout.requireViewById(R.id.my_week_highlight_button_stub);
            this.A19 = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_highlights_button_stub);
            View findViewById = constraintLayout.findViewById(R.id.toolbar_facebook_share_button_stub);
            if (findViewById instanceof ViewStub) {
                viewStub2 = (ViewStub) findViewById;
            } else {
                viewStub2 = null;
            }
            this.A1S = new C71662eb(viewStub2);
            View findViewById2 = constraintLayout.findViewById(R.id.toolbar_whatsapp_share_button_stub);
            if (findViewById2 instanceof ViewStub) {
                viewStub3 = (ViewStub) findViewById2;
            } else {
                viewStub3 = null;
            }
            this.A1V = new C71662eb(viewStub3);
            View findViewById3 = constraintLayout.findViewById(R.id.toolbar_share_on_button_stub);
            if (findViewById3 instanceof ViewStub) {
                viewStub4 = (ViewStub) findViewById3;
            } else {
                viewStub4 = null;
            }
            this.A1U = new C71662eb(viewStub4);
            this.A1C = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_promote_button_stub);
            this.A1J = (ViewStub) constraintLayout.requireViewById(R.id.viewers_facepile_button_stub);
            this.A16 = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_archive_share_button_stub);
            this.A15 = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_archive_reshare_button_stub);
            this.A13 = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_archive_context_button_stub);
            this.A14 = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_archive_location_context_button_stub);
            this.A1G = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_story_highlight_to_reel_button_stub);
            this.A1F = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_story_highlight_post_to_grid_button_stub);
            this.A18 = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_create_from_story_button_stub);
            View requireViewById = constraintLayout.requireViewById(R.id.cta_button_container);
            0qQ.A07(requireViewById);
            this.A1n = new C316146lB(requireViewById, userSession);
            TextView textView = (TextView) constraintLayout.requireViewById(R.id.toolbar_text);
            this.A1L = textView;
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            this.A1m = new C316156lC(textView, 2b1.A01(constraintLayout.requireViewById(R.id.circular_progress_bar_stub), false, false));
            this.A0x = constraintLayout.requireViewById(R.id.message_composer_container);
            this.A1K = (TextView) constraintLayout.requireViewById(R.id.composer_text);
            this.A17 = (ViewStub) constraintLayout.requireViewById(R.id.composer_camera_button_stub);
            View findViewById4 = constraintLayout.findViewById(R.id.composer_text_active_now_stub);
            if (findViewById4 instanceof ViewStub) {
                viewStub5 = (ViewStub) findViewById4;
            } else {
                viewStub5 = null;
            }
            this.A1Q = new C71662eb(viewStub5);
            View findViewById5 = constraintLayout.findViewById(R.id.composer_text_avatar_stub);
            if (findViewById5 instanceof ViewStub) {
                viewStub6 = (ViewStub) findViewById5;
            } else {
                viewStub6 = null;
            }
            this.A1R = new C71662eb(viewStub6);
            this.A1a = 2b1.A01(constraintLayout.requireViewById(R.id.composer_ai_animation_stub), false, false);
            this.A1b = 2b1.A01(constraintLayout.requireViewById(R.id.composer_reaction_animation_stub), false, false);
            this.A1d = 2b1.A01(constraintLayout.requireViewById(R.id.reel_item_reaction_animation_above_toolbar_stub), false, false);
            View findViewById6 = constraintLayout.findViewById(R.id.reel_item_action_button_stub);
            if (findViewById6 instanceof ViewStub) {
                viewStub7 = (ViewStub) findViewById6;
            } else {
                viewStub7 = null;
            }
            this.A1j = new C316166lD(new C71662eb(viewStub7));
            View requireViewById2 = constraintLayout.requireViewById(R.id.reel_item_mention_reshare_button_stub);
            0qQ.A07(requireViewById2);
            this.A1k = new C316186lF((ViewStub) requireViewById2);
            View requireViewById3 = constraintLayout.requireViewById(R.id.reel_item_group_mention_button_stub);
            0qQ.A07(requireViewById3);
            this.A1i = new C316196lG((ViewStub) requireViewById3);
            View requireViewById4 = constraintLayout.requireViewById(R.id.reel_swipe_up_instructions_stub);
            0qQ.A07(requireViewById4);
            this.A1o = new C316206lH((ViewStub) requireViewById4);
            View requireViewById5 = constraintLayout.requireViewById(R.id.reel_item_share_to_friends_story_producer_likes_stub);
            0qQ.A07(requireViewById5);
            this.A1l = new C316226lJ((ViewStub) requireViewById5);
            View requireViewById6 = constraintLayout.requireViewById(R.id.reel_branded_content_violation_banner);
            0qQ.A07(requireViewById6);
            ViewStub viewStub11 = (ViewStub) requireViewById6;
            0qQ.A0B(viewStub11, 0);
            this.A1N = new AnonymousClass3TX(viewStub11);
            View requireViewById7 = constraintLayout.requireViewById(R.id.toolbar_like_container);
            this.A0A = requireViewById7;
            View requireViewById8 = requireViewById7.requireViewById(R.id.toolbar_like_button);
            0qQ.A07(requireViewById8);
            IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = (IgBouncyUfiButtonImageView) requireViewById8;
            C252063oV A012 = 2b1.A01(this.A0A.requireViewById(R.id.toolbar_like_button_outline_animation_stub), !1NM.A00(userSession).A01(), false);
            0qQ.A0B(igBouncyUfiButtonImageView, 1);
            this.A0n = new C316236lK(viewStub10, userSession2, A012, likeActionView2, igBouncyUfiButtonImageView, true);
            View findViewById7 = constraintLayout.findViewById(R.id.toolbar_add_to_story_button_stub);
            if (findViewById7 instanceof ViewStub) {
                viewStub8 = (ViewStub) findViewById7;
            } else {
                viewStub8 = null;
            }
            this.A1P = new C71662eb(viewStub8);
            View findViewById8 = constraintLayout.findViewById(R.id.toolbar_self_add_to_story_button_stub);
            if (findViewById8 instanceof ViewStub) {
                viewStub9 = (ViewStub) findViewById8;
            } else {
                viewStub9 = null;
            }
            this.A1T = new C71662eb(viewStub9);
            this.A12 = (ViewGroup) constraintLayout.requireViewById(R.id.media_overlay_cta_banner_container);
            this.A1D = (ViewStub) constraintLayout.requireViewById(R.id.self_toolbar_reshare_button_stub);
            View requireViewById9 = constraintLayout.requireViewById(R.id.toolbar_comment_button);
            0qQ.A0C(requireViewById9, "null cannot be cast to non-null type android.view.ViewStub");
            ViewStub viewStub12 = (ViewStub) requireViewById9;
            viewStub12.setLayoutResource(182.A06(0Tu.A05, this.A1O, 36318247751522347L) ? R.layout.reel_viewer_message_comment_brand_change_button : R.layout.reel_viewer_message_comment_button);
            this.A1Y = 2b1.A01(viewStub12, false, false);
            this.A1Z = 2b1.A01(constraintLayout.requireViewById(R.id.story_comment_composer_stub), false, false);
            this.A1I = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_superlative_share_button_stub);
            this.A1H = (ViewStub) constraintLayout.requireViewById(R.id.toolbar_superlative_send_button_stub);
            View requireViewById10 = constraintLayout.requireViewById(R.id.cta_shuffle_button_container);
            0qQ.A07(requireViewById10);
            View requireViewById11 = constraintLayout.requireViewById(R.id.cta_shuffle_button_dwell_container);
            0qQ.A07(requireViewById11);
            C316246lL r0 = new C316246lL((ViewStub) requireViewById10, (ViewStub) requireViewById11, userSession);
            this.A0p = r0;
            ImageView imageView = r0.A05;
            if (imageView != null) {
                imageView.setImageDrawable(r0.A09);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A00() {
        LinearLayout linearLayout;
        float min = Math.min(this.A00, 1.0f - this.A01);
        this.A11.setAlpha(min);
        this.A0z.setAlpha(min);
        C55785HnK hnK = this.A0o;
        if (!(hnK == null || (linearLayout = hnK.A02) == null)) {
            linearLayout.setAlpha(min);
        }
        this.A1n.A04.setAlpha(min);
        TextView textView = this.A1j.A01;
        if (textView != null) {
            textView.setAlpha(min);
        }
        View view = this.A1k.A00;
        if (view != null) {
            view.setAlpha(min);
        }
        IgImageView igImageView = this.A1i.A00;
        if (igImageView != null) {
            igImageView.setAlpha(min);
        }
        this.A1N.A00().setAlpha(min);
    }

    public final C74500Pvu AjF() {
        C74500Pvu pvu = this.A0q;
        if (pvu == null) {
            pvu = new C66952Mfl(this.A1n);
            this.A0q = pvu;
        }
        pvu.Ehz(this.A0m);
        return pvu;
    }
}
