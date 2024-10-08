package X;

import android.content.Context;
import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.GjQ  reason: case insensitive filesystem */
public final class C53154GjQ extends C249703kE implements AnonymousClass3V3 {
    public 1Xj A00;
    public AnonymousClass3W1 A01;
    public final View A02;
    public final Space A03;
    public final ConstraintLayout A04;
    public final IgFrameLayout A05;
    public final IgFrameLayout A06;
    public final IgFrameLayout A07;
    public final IgFrameLayout A08;
    public final IgTextView A09;
    public final CircularImageView A0A;
    public final IgImageView A0B;
    public final IgImageView A0C;
    public final SimpleVideoLayout A0D;
    public final Context A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53154GjQ(View view, Context context) {
        super(view);
        0qQ.A0B(view, 1);
        this.A02 = view;
        this.A0E = context;
        this.A04 = (ConstraintLayout) AnonymousClass7TF.A0F(view, R.id.intent_aware_ad_rifu_card_container);
        this.A0A = DbX.A0a(view, R.id.intent_aware_ad_rifu_profile_header_image_view);
        this.A0C = DbX.A0b(view, R.id.intent_aware_ad_rifu_media_options);
        this.A08 = (IgFrameLayout) AnonymousClass7TF.A0F(view, R.id.intent_aware_ad_rifu_card_preview_image_container);
        this.A0B = DbX.A0b(view, R.id.intent_aware_ad_rifu_card_preview_image);
        this.A0D = (SimpleVideoLayout) AnonymousClass7TF.A0F(view, R.id.intent_aware_ad_rifu_card_preview_video);
        this.A09 = DbX.A0Z(view, R.id.intent_aware_ad_rifu_cta);
        this.A07 = (IgFrameLayout) AnonymousClass7TF.A0F(view, R.id.intent_aware_ad_rifu_top_background);
        this.A06 = (IgFrameLayout) AnonymousClass7TF.A0F(view, R.id.intent_aware_ad_rifu_bottom_background);
        this.A05 = (IgFrameLayout) AnonymousClass7TF.A0F(view, R.id.intent_aware_ad_rifu_cta_gradient);
        this.A03 = (Space) AnonymousClass7TF.A0F(view, R.id.intent_aware_ad_rifu_cta_gradient_non_clickable_area);
    }

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
        return this.A0B;
    }

    public final View BQB() {
        return this.A02;
    }

    public final AnonymousClass3W1 BQq() {
        return this.A01;
    }

    public final C242423Ua C5r() {
        return this.A0D;
    }

    public final /* synthetic */ int C5s() {
        return -1;
    }

    public final int CEc() {
        return this.A0D.getWidth();
    }

    public final void Epi(AnonymousClass0iw r3, ImageUrl imageUrl, boolean z) {
        AnonymousClass7TG.A1N(imageUrl, r3);
        this.A0B.A0D(r3, (0lg) null, imageUrl, z);
    }
}
