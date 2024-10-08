package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;

/* renamed from: X.6PB  reason: invalid class name */
public final class AnonymousClass6PB {
    public ImageView A00;
    public ReelBrandingBadgeView A01;
    public C70582OCf A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final ViewStub A09;
    public final ViewStub A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final IgSimpleImageView A0E;
    public final IgImageView A0F;
    public final AnonymousClass6PC A0G;
    public final AnonymousClass6P0 A0H;
    public final AnonymousClass6PD A0I;

    public AnonymousClass6PB(View view, View view2) {
        this.A04 = view;
        this.A03 = view2;
        View requireViewById = view.requireViewById(R.id.profile_picture_container);
        0qQ.A07(requireViewById);
        this.A06 = requireViewById;
        IgImageView requireViewById2 = view.requireViewById(R.id.reel_viewer_profile_picture);
        0qQ.A07(requireViewById2);
        this.A0F = requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.reel_viewer_icon_image_view);
        0qQ.A07(requireViewById3);
        this.A0E = (IgSimpleImageView) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.reel_viewer_profile_facepile_stub);
        0qQ.A07(requireViewById4);
        this.A0A = (ViewStub) requireViewById4;
        View requireViewById5 = view.requireViewById(R.id.branding_badge_stub);
        0qQ.A07(requireViewById5);
        this.A09 = (ViewStub) requireViewById5;
        View requireViewById6 = view.requireViewById(R.id.reel_viewer_text_container);
        0qQ.A07(requireViewById6);
        this.A07 = requireViewById6;
        View requireViewById7 = view.requireViewById(R.id.reel_viewer_title);
        0qQ.A07(requireViewById7);
        this.A0C = (TextView) requireViewById7;
        View requireViewById8 = view.requireViewById(R.id.reel_viewer_multi_ad_carousel_additional_text);
        0qQ.A07(requireViewById8);
        this.A0B = (TextView) requireViewById8;
        View requireViewById9 = view.requireViewById(R.id.reel_viewer_title_brand_survey);
        0qQ.A07(requireViewById9);
        this.A0D = (TextView) requireViewById9;
        View requireViewById10 = view.requireViewById(R.id.reel_viewer_subtitle);
        0qQ.A07(requireViewById10);
        this.A0G = new AnonymousClass6PC((TextView) requireViewById10);
        View requireViewById11 = view.requireViewById(R.id.video_loading_spinner);
        0qQ.A07(requireViewById11);
        this.A08 = requireViewById11;
        View requireViewById12 = view.requireViewById(R.id.header_menu_button);
        0qQ.A07(requireViewById12);
        this.A05 = requireViewById12;
        Integer num = AnonymousClass05K.A0C;
        this.A0I = new AnonymousClass6PD(2b1.A01(view.requireViewById(R.id.social_context_stub), false, false), num);
        this.A0H = new AnonymousClass6P0(2b1.A01(view.requireViewById(R.id.popularity_proof_stub), false, false), num);
    }
}
