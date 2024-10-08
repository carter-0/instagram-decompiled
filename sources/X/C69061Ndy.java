package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.reels.viewer.common.ReelViewGroup;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.ui.widget.textureview.ScalingTextureView;

/* renamed from: X.Ndy  reason: case insensitive filesystem */
public final class C69061Ndy extends C316016ky implements C316106l7 {
    public Context A00;
    public ImageButton A01;
    public C252063oV A02;
    public C255773uh A03;
    public SegmentedProgressBar A04;
    public final OI9 A05;
    public final OH7 A06;
    public final OGP A07;
    public final O9I A08;
    public final ReelViewGroup A09;
    public final AnonymousClass6N3 A0A;
    public final ScalingTextureView A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69061Ndy(Context context, View view, UserSession userSession) {
        super(view);
        C252063oV r1;
        0qQ.A0B(context, 3);
        this.A00 = context;
        this.A01 = (ImageButton) AnonymousClass7TF.A0F(view, R.id.story_interstitial_reel_item_exit_button);
        this.A04 = (SegmentedProgressBar) AnonymousClass7TF.A0F(view, R.id.reel_viewer_progress_bar);
        ScalingTextureView scalingTextureView = null;
        if (!C263454Mb.A00(userSession, "reel_interstitial_viewer")) {
            r1 = C66581MXm.A0T(view, R.id.reel_viewer_texture_viewstub);
        } else {
            r1 = null;
        }
        this.A02 = r1;
        this.A06 = new OH7(this.A00, DbU.A0D(view, R.id.story_interstitial_chaining_view_stub));
        this.A07 = new OGP(this.A00, DbU.A0D(view, R.id.story_interstitial_pog_garden_chaining_view_stub));
        this.A05 = new OI9(JTR.A0X(view, R.id.roll_call_overlay_view_stub));
        this.A0A = new AnonymousClass6N3(JTR.A0X(view, R.id.reconsideration_products_view_stub));
        this.A08 = new O9I(JTR.A0X(view, R.id.story_interstitial_reel_item_toolbar_view_stub));
        this.A09 = (ReelViewGroup) AnonymousClass7TF.A0F(view, R.id.reel_view_group);
        C252063oV r12 = this.A02;
        this.A0B = r12 != null ? (ScalingTextureView) r12.getView() : scalingTextureView;
    }

    public final FrameLayout Bkk() {
        return null;
    }

    public final void DcL(C309426Yf r3, int i) {
        0qQ.A0B(r3, 0);
        this.A04.setProgress(r3.A0B);
    }

    public final IgProgressImageView BGP() {
        return null;
    }

    public final C255773uh Bkg() {
        return this.A03;
    }

    public final ScalingTextureView C5p() {
        return this.A0B;
    }
}
