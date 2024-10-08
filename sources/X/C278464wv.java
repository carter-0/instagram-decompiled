package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.4wv  reason: invalid class name and case insensitive filesystem */
public final class C278464wv {
    public final AnonymousClass3TS A00;
    public final C256063vA A01;
    public final AnonymousClass3V4 A02;
    public final C258253yi A03;
    public final AnonymousClass3Ux A04;
    public final IgProgressImageView A05;
    public final C258243yh A06;
    public final AnonymousClass3V9 A07;
    public final MediaActionsView A08;
    public final MediaFrameLayout A09;

    public C278464wv(Context context, UserSession userSession, SimpleZoomableViewContainer simpleZoomableViewContainer) {
        0qQ.A0B(userSession, 3);
        View requireViewById = simpleZoomableViewContainer.requireViewById(R.id.row_feed_photo_imageview);
        0qQ.A07(requireViewById);
        this.A05 = (IgProgressImageView) requireViewById;
        View requireViewById2 = simpleZoomableViewContainer.requireViewById(R.id.media_group);
        0qQ.A07(requireViewById2);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) requireViewById2;
        this.A09 = mediaFrameLayout;
        View requireViewById3 = simpleZoomableViewContainer.requireViewById(R.id.row_feed_media_actions);
        0qQ.A07(requireViewById3);
        this.A08 = (MediaActionsView) requireViewById3;
        View requireViewById4 = simpleZoomableViewContainer.requireViewById(R.id.audio_icon_button);
        0qQ.A07(requireViewById4);
        this.A00 = new AnonymousClass3TS(requireViewById4);
        this.A01 = new C256063vA(new C256003v4((ViewStub) simpleZoomableViewContainer.requireViewById(R.id.media_subtitle_view_stub), false));
        this.A02 = new AnonymousClass3V4((ViewStub) simpleZoomableViewContainer.requireViewById(R.id.zero_rating_video_play_button_stub));
        View requireViewById5 = simpleZoomableViewContainer.requireViewById(R.id.media_video_scrubber_view_stub);
        0qQ.A07(requireViewById5);
        ViewStub viewStub = (ViewStub) requireViewById5;
        0qQ.A0B(viewStub, 0);
        this.A03 = new C258253yi(viewStub);
        this.A07 = new AnonymousClass3V9(simpleZoomableViewContainer, userSession, R.id.row_feed_media_tag_indicator_stub);
        View requireViewById6 = simpleZoomableViewContainer.requireViewById(R.id.row_feed_interactive_sticker_stub);
        0qQ.A07(requireViewById6);
        ViewStub viewStub2 = (ViewStub) requireViewById6;
        0qQ.A0B(viewStub2, 0);
        this.A06 = new C258243yh(viewStub2);
        Activity A002 = C70782Va.A00(context);
        if (A002 != null) {
            this.A04 = new AnonymousClass3Ux(A002, context, mediaFrameLayout, userSession);
            return;
        }
        throw new IllegalStateException("Should have an hosting activity");
    }
}
