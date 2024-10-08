package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.DpB  reason: case insensitive filesystem */
public final class C47019DpB extends C249703kE {
    public final IgSimpleImageView A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final CircularImageView A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47019DpB(View view) {
        super(view);
        0qQ.A0B(view, 1);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.ig_live_post_live_fundraiser_cover_photo_thumbnail);
        this.A00 = igSimpleImageView;
        this.A01 = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.ig_live_post_live_fundraiser_default_cover_photo);
        this.A05 = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.ig_live_post_live_fundraiser_default_cover_photo_border);
        this.A04 = Dba.A0E(view, R.id.ig_live_post_live_fundraiser_fundraiser_title_text_view);
        this.A03 = Dba.A0E(view, R.id.ig_live_post_live_fundraiser_subtitle_text_view);
        this.A02 = Dba.A0E(view, R.id.ig_live_post_live_fundraiser_attribution_text_view);
        Context A0S = AnonymousClass7TE.A0S(view);
        Resources resources = view.getResources();
        igSimpleImageView.setImageDrawable(new GIH(A0S, (GJO) null, resources.getDimensionPixelSize(R.dimen.action_button_settings_height), resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), 0, 0, 0, -1, false));
    }
}
