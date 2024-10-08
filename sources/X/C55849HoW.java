package X;

import android.app.Activity;
import android.content.Context;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.HoW  reason: case insensitive filesystem */
public final class C55849HoW {
    public final AnonymousClass3TS A00;
    public final C256063vA A01;
    public final AnonymousClass3Ux A02;
    public final IgProgressImageView A03;
    public final C258243yh A04;
    public final MediaActionsView A05;
    public final MediaFrameLayout A06;

    public C55849HoW(Context context, UserSession userSession, SimpleZoomableViewContainer simpleZoomableViewContainer) {
        0qQ.A0B(userSession, 2);
        this.A03 = (IgProgressImageView) AnonymousClass7TF.A0F(simpleZoomableViewContainer, R.id.row_feed_photo_imageview);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) AnonymousClass7TF.A0F(simpleZoomableViewContainer, R.id.media_group);
        this.A06 = mediaFrameLayout;
        this.A05 = (MediaActionsView) AnonymousClass7TF.A0F(simpleZoomableViewContainer, R.id.row_feed_media_actions);
        this.A00 = new AnonymousClass3TS(AnonymousClass7TF.A0G(simpleZoomableViewContainer, R.id.audio_icon_button));
        this.A01 = new C256063vA(new C256003v4(DbU.A0D(simpleZoomableViewContainer, R.id.media_subtitle_view_stub), false));
        ViewStub viewStub = (ViewStub) AnonymousClass7TF.A0F(simpleZoomableViewContainer, R.id.row_feed_interactive_sticker_stub);
        0qQ.A0B(viewStub, 0);
        this.A04 = new C258243yh(viewStub);
        Activity A002 = C70782Va.A00(context);
        if (A002 != null) {
            this.A02 = new AnonymousClass3Ux(A002, context, mediaFrameLayout, userSession);
            return;
        }
        throw AnonymousClass7TE.A0z(C273654mx.A00(224));
    }
}
