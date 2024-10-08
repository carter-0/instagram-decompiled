package X;

import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

public final class IUM implements AnonymousClass3V3 {
    public AnonymousClass3W1 A00;
    public final View A01;
    public final View A02;
    public final Space A03;
    public final Space A04;
    public final Space A05;
    public final ConstraintLayout A06;
    public final ConstraintLayout A07;
    public final ConstraintLayout A08;
    public final ConstraintLayout A09;
    public final IgFrameLayout A0A;
    public final IgFrameLayout A0B;
    public final IgFrameLayout A0C;
    public final IgFrameLayout A0D;
    public final IgFrameLayout A0E;
    public final IgFrameLayout A0F;
    public final IgLinearLayout A0G;
    public final IgTextView A0H;
    public final IgTextView A0I;
    public final IgTextView A0J;
    public final IgTextView A0K;
    public final IgTextView A0L;
    public final IgTextView A0M;
    public final CircularImageView A0N;
    public final CircularImageView A0O;
    public final IgImageView A0P;
    public final IgImageView A0Q;
    public final IgImageView A0R;
    public final IgImageView A0S;
    public final IgImageView A0T;
    public final SimpleVideoLayout A0U;
    public final View A0V;

    public final AnonymousClass3TS Adf() {
        return null;
    }

    public final C256043v8 B5X() {
        return null;
    }

    public final C247233fz BQv() {
        return null;
    }

    public final C258253yi BRL() {
        return null;
    }

    public final void EEI(int i) {
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.3TN] */
    public final AnonymousClass3TN B5Y() {
        return new Object();
    }

    public final View BG1() {
        return this.A0P;
    }

    public final View BQB() {
        return this.A02;
    }

    public final AnonymousClass3W1 BQq() {
        return this.A00;
    }

    public final C242423Ua C5r() {
        return this.A0U;
    }

    public final /* synthetic */ int C5s() {
        return -1;
    }

    public final int CEc() {
        return this.A0U.getWidth();
    }

    public IUM(View view) {
        this.A01 = view;
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.intent_aware_ad_grid_rounded_corner_card_view);
        this.A02 = A0G2;
        View A0G3 = AnonymousClass7TF.A0G(view, R.id.intent_aware_ad_grid_card_metadata_row);
        this.A0V = A0G3;
        this.A0D = (IgFrameLayout) AnonymousClass7TF.A0F(A0G2, R.id.intent_aware_ad_grid_profile_header_image_view_container);
        this.A0E = (IgFrameLayout) AnonymousClass7TF.A0F(A0G2, R.id.intent_aware_ad_grid_profile_header_pill_container);
        this.A0O = DbX.A0a(A0G2, R.id.intent_aware_ad_grid_profile_header_image_view);
        this.A0L = DbX.A0Z(A0G2, R.id.intent_aware_ad_grid_profile_name);
        this.A0R = DbX.A0b(A0G2, R.id.intent_aware_ad_grid_profile_header_row_media_options);
        this.A0F = (IgFrameLayout) AnonymousClass7TF.A0F(A0G2, R.id.intent_aware_ad_grid_profile_header_gradient);
        this.A05 = (Space) AnonymousClass7TF.A0F(A0G2, R.id.intent_aware_ad_grid_profile_header_gradient_non_clickable_area);
        this.A07 = (ConstraintLayout) AnonymousClass7TF.A0F(A0G2, R.id.intent_aware_ad_grid_card_profile_detached_header_row);
        this.A0C = (IgFrameLayout) AnonymousClass7TF.A0F(A0G3, R.id.intent_aware_ad_grid_card_profile_header_image_view_container);
        this.A0N = DbX.A0a(A0G3, R.id.intent_aware_ad_grid_card_profile_header_image_view);
        this.A0I = DbX.A0Z(A0G3, R.id.intent_aware_ad_grid_card_profile_name);
        this.A0B = (IgFrameLayout) AnonymousClass7TF.A0F(A0G2, R.id.intent_aware_ad_pivot_grid_preview_media_container);
        this.A0P = DbX.A0b(A0G2, R.id.intent_aware_ad_grid_card_preview_image);
        this.A0U = (SimpleVideoLayout) AnonymousClass7TF.A0F(A0G2, R.id.intent_aware_ad_grid_card_preview_video);
        this.A0H = DbX.A0Z(A0G2, R.id.intent_aware_ad_grid_cta);
        this.A0A = (IgFrameLayout) AnonymousClass7TF.A0F(A0G2, R.id.intent_aware_ad_grid_cta_gradient);
        this.A03 = (Space) AnonymousClass7TF.A0F(A0G2, R.id.intent_aware_ad_grid_cta_gradient_non_clickable_area);
        this.A06 = (ConstraintLayout) AnonymousClass7TF.A0F(A0G2, R.id.intent_aware_ad_grid_detached_cta);
        this.A08 = (ConstraintLayout) AnonymousClass7TF.A0F(A0G2, R.id.intent_aware_ad_grid_overlay_button_cta);
        this.A09 = (ConstraintLayout) AnonymousClass7TF.A0F(A0G2, R.id.intent_aware_ad_grid_overlay_small_button_cta);
        this.A0Q = DbX.A0b(A0G2, R.id.intent_aware_ad_grid_profile_header_row_carousel_indicator);
        this.A0T = DbX.A0b(A0G2, R.id.intent_aware_ad_grid_social_context_facepile);
        this.A0M = DbX.A0Z(A0G2, R.id.intent_aware_ad_grid_social_context_text);
        this.A0G = (IgLinearLayout) AnonymousClass7TF.A0F(A0G2, R.id.intent_aware_ad_pivot_grid_hidden_media_container);
        this.A0K = DbX.A0Z(A0G3, R.id.intent_aware_ad_grid_card_metadata_text);
        this.A04 = (Space) AnonymousClass7TF.A0F(A0G3, R.id.intent_aware_ad_grid_card_metadata_divider);
        this.A0J = DbX.A0Z(A0G3, R.id.intent_aware_ad_grid_social_context_text);
        this.A0S = DbX.A0b(A0G3, R.id.intent_aware_ad_grid_social_context_facepile);
    }

    public final void Epi(AnonymousClass0iw r3, ImageUrl imageUrl, boolean z) {
        AnonymousClass7TG.A1N(imageUrl, r3);
        this.A0P.A0D(r3, (0lg) null, imageUrl, z);
    }
}
