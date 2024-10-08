package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import com.instagram.xme.threed.view.IgGltfSceneLayoutView;

/* renamed from: X.76o  reason: invalid class name and case insensitive filesystem */
public final class C3263876o extends C249703kE implements C328007Db, C328017Dc, C3263976p {
    public C70440O6r A00;
    public C70762OKi A01;
    public C328087Dj A02;
    public final FrameLayout A03;
    public final ImageView A04;
    public final ImageView A05;
    public final ImageView A06;
    public final ImageView A07;
    public final TextView A08;
    public final TextView A09;
    public final ConstraintLayout A0A;
    public final ConstraintLayout A0B;
    public final C71662eb A0C;
    public final C71662eb A0D;
    public final C71662eb A0E;
    public final C71662eb A0F;
    public final C71662eb A0G;
    public final C71662eb A0H;
    public final C71662eb A0I;
    public final C71662eb A0J;
    public final C71662eb A0K;
    public final C71662eb A0L;
    public final C71662eb A0M;
    public final C71662eb A0N;
    public final C71662eb A0O;
    public final C71662eb A0P;
    public final C252063oV A0Q;
    public final C252063oV A0R;
    public final C252063oV A0S;
    public final C252063oV A0T;
    public final C3264076q A0U;
    public final IgProgressImageView A0V;
    public final RoundedCornerMediaFrameLayout A0W;
    public final IgGltfSceneLayoutView A0X;
    public final AnonymousClass0eM A0Y;
    public final AnonymousClass0eM A0Z;
    public final AnonymousClass0eM A0a;
    public final AnonymousClass0eM A0b;
    public final AnonymousClass0eM A0c;
    public final ImageView A0d;

    /* JADX WARNING: type inference failed for: r0v24, types: [X.2eb, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v26, types: [X.2eb, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v28, types: [X.2eb, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3263876o(View view, UserSession userSession) {
        super(view);
        ViewStub viewStub;
        ViewStub viewStub2;
        ViewStub viewStub3;
        ViewStub viewStub4;
        ViewStub viewStub5;
        ViewStub viewStub6;
        ViewStub viewStub7;
        ViewStub viewStub8;
        ViewStub viewStub9;
        ViewStub viewStub10;
        ViewStub viewStub11;
        0qQ.A0B(view, 2);
        View requireViewById = view.requireViewById(R.id.message_content_portrait_xma_container);
        0qQ.A07(requireViewById);
        this.A03 = (FrameLayout) requireViewById;
        View findViewById = view.findViewById(R.id.reel_profile_attribution_stub);
        if (findViewById instanceof ViewStub) {
            viewStub = (ViewStub) findViewById;
        } else {
            viewStub = null;
        }
        this.A0E = new C71662eb(viewStub);
        this.A0a = AnonymousClass0eN.A01(new AnonymousClass9LB(this, 41));
        View findViewById2 = view.findViewById(R.id.legibility_gradient_header_stub);
        if (findViewById2 instanceof ViewStub) {
            viewStub2 = (ViewStub) findViewById2;
        } else {
            viewStub2 = null;
        }
        C71662eb r3 = new C71662eb(viewStub2);
        this.A0F = r3;
        View findViewById3 = view.findViewById(R.id.placeholder_title_stub);
        if (findViewById3 instanceof ViewStub) {
            viewStub3 = (ViewStub) findViewById3;
        } else {
            viewStub3 = null;
        }
        this.A0J = new C71662eb(viewStub3);
        View findViewById4 = view.findViewById(R.id.placeholder_message_stub);
        if (findViewById4 instanceof ViewStub) {
            viewStub4 = (ViewStub) findViewById4;
        } else {
            viewStub4 = null;
        }
        this.A0I = new C71662eb(viewStub4);
        View requireViewById2 = view.requireViewById(R.id.media_constraint_layout);
        0qQ.A07(requireViewById2);
        this.A0B = (ConstraintLayout) requireViewById2;
        View findViewById5 = view.findViewById(R.id.reel_mention_reshare_cta_button_stub);
        if (findViewById5 instanceof ViewStub) {
            viewStub5 = (ViewStub) findViewById5;
        } else {
            viewStub5 = null;
        }
        this.A0L = new C71662eb(viewStub5);
        View findViewById6 = view.findViewById(R.id.reel_padded_buttons_container);
        ? obj = new Object();
        obj.A00 = findViewById6;
        this.A0M = obj;
        View findViewById7 = view.findViewById(R.id.reel_padded_first_button);
        ? obj2 = new Object();
        obj2.A00 = findViewById7;
        this.A0N = obj2;
        View findViewById8 = view.findViewById(R.id.reel_padded_second_button);
        ? obj3 = new Object();
        obj3.A00 = findViewById8;
        this.A0O = obj3;
        View requireViewById3 = view.requireViewById(R.id.media_container);
        0qQ.A07(requireViewById3);
        this.A0W = (RoundedCornerMediaFrameLayout) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.image);
        0qQ.A07(requireViewById4);
        IgProgressImageView igProgressImageView = (IgProgressImageView) requireViewById4;
        this.A0V = igProgressImageView;
        View requireViewById5 = view.requireViewById(R.id.gltf_scene_layout);
        0qQ.A07(requireViewById5);
        this.A0X = (IgGltfSceneLayoutView) requireViewById5;
        this.A0S = 2b1.A01(view.requireViewById(R.id.privacy_overlay_stub), false, false);
        View requireViewById6 = view.requireViewById(R.id.top_icon);
        0qQ.A07(requireViewById6);
        this.A07 = (ImageView) requireViewById6;
        View requireViewById7 = view.requireViewById(R.id.bottom_icon);
        0qQ.A07(requireViewById7);
        this.A04 = (ImageView) requireViewById7;
        View requireViewById8 = view.requireViewById(R.id.center_icon);
        0qQ.A07(requireViewById8);
        this.A05 = (ImageView) requireViewById8;
        View findViewById9 = view.findViewById(R.id.ig_live_label_layout_stub);
        if (findViewById9 instanceof ViewStub) {
            viewStub6 = (ViewStub) findViewById9;
        } else {
            viewStub6 = null;
        }
        this.A0G = new C71662eb(viewStub6);
        View findViewById10 = view.findViewById(R.id.footer_stub);
        if (findViewById10 instanceof ViewStub) {
            viewStub7 = (ViewStub) findViewById10;
        } else {
            viewStub7 = null;
        }
        this.A0C = new C71662eb(viewStub7);
        this.A0Z = AnonymousClass0eN.A01(new AnonymousClass9LB(this, 40));
        View findViewById11 = view.findViewById(R.id.placeholder_reel_reaction);
        if (findViewById11 instanceof ViewStub) {
            viewStub8 = (ViewStub) findViewById11;
        } else {
            viewStub8 = null;
        }
        this.A0K = new C71662eb(viewStub8);
        View findViewById12 = view.findViewById(R.id.placeholder_reel_sticker_reaction);
        if (findViewById12 instanceof ViewStub) {
            viewStub9 = (ViewStub) findViewById12;
        } else {
            viewStub9 = null;
        }
        this.A0P = new C71662eb(viewStub9);
        this.A0T = 2b1.A01(view.requireViewById(R.id.placeholder_reel_selfie_reaction), false, false);
        View findViewById13 = view.findViewById(R.id.gradient_spinner_stub);
        if (findViewById13 instanceof ViewStub) {
            viewStub10 = (ViewStub) findViewById13;
        } else {
            viewStub10 = null;
        }
        this.A0D = new C71662eb(viewStub10);
        View findViewById14 = view.findViewById(R.id.direct_persisted_reel_label_stub);
        if (findViewById14 instanceof ViewStub) {
            viewStub11 = (ViewStub) findViewById14;
        } else {
            viewStub11 = null;
        }
        this.A0H = new C71662eb(viewStub11);
        this.A0c = AnonymousClass0eN.A01(new AnonymousClass9LB(this, 42));
        View requireViewById9 = view.requireViewById(R.id.iconic_entrypoints_footer);
        0qQ.A07(requireViewById9);
        this.A0A = (ConstraintLayout) requireViewById9;
        View requireViewById10 = view.requireViewById(R.id.iconic_entrypoints_footer_title);
        0qQ.A07(requireViewById10);
        this.A09 = (TextView) requireViewById10;
        View requireViewById11 = view.requireViewById(R.id.iconic_entrypoints_footer_body_text);
        0qQ.A07(requireViewById11);
        this.A08 = (TextView) requireViewById11;
        View requireViewById12 = view.requireViewById(R.id.iconic_entrypoints_reels_icon);
        0qQ.A07(requireViewById12);
        this.A06 = (ImageView) requireViewById12;
        this.A0Q = 2b1.A01(view.requireViewById(R.id.direct_reel_reshare_comment_stub), false, false);
        this.A0R = 2b1.A01(view.requireViewById(R.id.direct_reel_share_comment_stub_xma_styling), false, false);
        this.A0U = new C3264076q();
        this.A0b = AnonymousClass0eN.A01(C3264176r.A00);
        View requireViewById13 = view.requireViewById(R.id.doubletap_heart);
        0qQ.A07(requireViewById13);
        this.A0d = (ImageView) requireViewById13;
        this.A0Y = AnonymousClass0eN.A01(new C377479Lz(18, view, this));
        igProgressImageView.getIgImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (!11Z.A07() && 182.A06(0Tu.A05, userSession, 36319128218770354L)) {
            ((AnonymousClass75H) this.A0a.getValue()).A00.setVisibility(8);
            r3.A01().setVisibility(8);
        }
    }

    public final void A00() {
        C70762OKi oKi = this.A01;
        if (oKi != null) {
            oKi.A00();
        }
        this.A01 = null;
        C70440O6r o6r = this.A00;
        if (o6r != null) {
            o6r.A00.set(true);
        }
        this.A00 = null;
    }

    public final ImageView Afl() {
        return this.A0d;
    }

    public final View BJd() {
        return this.A03;
    }

    public final C328087Dj BY0() {
        return this.A02;
    }

    public final void EeT(C328087Dj r1) {
        this.A02 = r1;
    }
}
