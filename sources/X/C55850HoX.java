package X;

import android.app.Activity;
import android.content.Context;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.HoX  reason: case insensitive filesystem */
public final class C55850HoX {
    public final AnonymousClass3V4 A00;
    public final C258253yi A01;
    public final AnonymousClass3Ux A02;
    public final IgProgressImageView A03;
    public final C258243yh A04;
    public final AnonymousClass3V9 A05;
    public final MediaFrameLayout A06;

    public C55850HoX(Context context, UserSession userSession, SimpleZoomableViewContainer simpleZoomableViewContainer) {
        0qQ.A0B(userSession, 2);
        this.A03 = (IgProgressImageView) AnonymousClass7TF.A0F(simpleZoomableViewContainer, R.id.row_feed_photo_imageview);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) AnonymousClass7TF.A0F(simpleZoomableViewContainer, R.id.media_group);
        this.A06 = mediaFrameLayout;
        this.A00 = new AnonymousClass3V4(DbU.A0D(simpleZoomableViewContainer, R.id.zero_rating_video_play_button_stub));
        ViewStub viewStub = (ViewStub) AnonymousClass7TF.A0F(simpleZoomableViewContainer, R.id.media_video_scrubber_view_stub);
        0qQ.A0B(viewStub, 0);
        this.A01 = new C258253yi(viewStub);
        this.A05 = new AnonymousClass3V9(simpleZoomableViewContainer, userSession, R.id.row_feed_media_tag_indicator_stub);
        ViewStub viewStub2 = (ViewStub) AnonymousClass7TF.A0F(simpleZoomableViewContainer, R.id.row_feed_interactive_sticker_stub);
        0qQ.A0B(viewStub2, 0);
        this.A04 = new C258243yh(viewStub2);
        Activity A002 = C70782Va.A00(context);
        if (A002 != null) {
            this.A02 = new AnonymousClass3Ux(A002, context, mediaFrameLayout, userSession);
            return;
        }
        throw AnonymousClass7TE.A0z(C273654mx.A00(224));
    }
}
