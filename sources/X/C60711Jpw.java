package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import java.util.List;

/* renamed from: X.Jpw  reason: case insensitive filesystem */
public final class C60711Jpw extends C249703kE implements C331117Pq {
    public C59997Jd6 A00;
    public SimpleVideoLayout A01;
    public final int A02;
    public final int A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final C252063oV A07;
    public final C252063oV A08;
    public final C252063oV A09;
    public final C252063oV A0A;
    public final C252063oV A0B;
    public final 0sP A0C;
    public final View A0D;
    public final UserSession A0E;

    public final void DxV(C263754Nf r1) {
    }

    public final void Dxx(C263754Nf r1) {
    }

    public final void Dxy(C263754Nf r1) {
    }

    public final void Dyj(int i, int i2) {
    }

    public final void onCompletion() {
    }

    public final void onCues(List list) {
    }

    public final void onLoop(int i) {
    }

    public final void onPrepare(C263754Nf r1) {
    }

    public final void onProgressStateChanged(boolean z) {
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
    }

    public final void onStopVideo(String str, boolean z) {
    }

    public final void onVideoDownloading(C263754Nf r1) {
    }

    public final void onVideoPlayerError(C263754Nf r1, String str) {
    }

    public final /* synthetic */ void onVideoStartedPlaying(C263754Nf r1) {
    }

    public final void onVideoViewPrepared(C263754Nf r1) {
    }

    public C60711Jpw(View view, UserSession userSession, 0sP r7) {
        super(view);
        this.A0E = userSession;
        this.A0D = view;
        this.A0C = r7;
        Resources resources = view.getResources();
        this.A03 = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A02 = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A04 = DbX.A0J(view, R.id.gallery_grid_format_thumbnail_icon);
        this.A06 = AnonymousClass7TG.A0R(view, R.id.gallery_grid_format_thumbnail_title);
        this.A05 = AnonymousClass7TG.A0R(view, R.id.gallery_grid_format_thumbnail_subtitle);
        this.A08 = DbU.A0Z(view, R.id.gallery_grid_format_thumbnail_rounded_image_stub);
        this.A09 = DbU.A0Z(view, R.id.gallery_grid_format_thumbnail_rounded_recycler_view_stub);
        C252063oV A0Z = DbU.A0Z(view, R.id.gallery_grid_format_thumbnail_rounded_video_stub);
        this.A0A = A0Z;
        this.A0B = DbU.A0Z(view, R.id.gallery_grid_format_thumbnail_segmented_progress_bar_stub);
        this.A07 = DbU.A0Z(view, R.id.gallery_grid_format_thumbnail_disabled_cover_stub);
        JTP.A14(view, resources.getDimensionPixelSize(R.dimen.ad_tag_max_width), resources.getDimensionPixelSize(R.dimen.gallery_grid_format_thumbnail_height));
        A0Z.EeU(new C64885Ljl(this, 2));
    }
}
