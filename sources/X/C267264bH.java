package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.4bH  reason: invalid class name and case insensitive filesystem */
public final class C267264bH {
    public final AnonymousClass3Ux A00;
    public final IgProgressImageView A01;
    public final AnonymousClass3V9 A02;
    public final MediaFrameLayout A03;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.2eb, java.lang.Object] */
    public C267264bH(Context context, UserSession userSession, SimpleZoomableViewContainer simpleZoomableViewContainer) {
        0qQ.A0B(userSession, 3);
        View requireViewById = simpleZoomableViewContainer.requireViewById(R.id.row_feed_photo_imageview);
        0qQ.A07(requireViewById);
        this.A01 = (IgProgressImageView) requireViewById;
        View requireViewById2 = simpleZoomableViewContainer.requireViewById(R.id.media_group);
        0qQ.A07(requireViewById2);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) requireViewById2;
        this.A03 = mediaFrameLayout;
        View requireViewById3 = simpleZoomableViewContainer.requireViewById(R.id.row_feed_media_tag_indicator);
        0qQ.A07(requireViewById3);
        Context context2 = requireViewById3.getContext();
        0qQ.A07(context2);
        ? obj = new Object();
        obj.A00 = requireViewById3;
        this.A02 = new AnonymousClass3V9(context2, (View) null, userSession, obj);
        Activity A002 = C70782Va.A00(context);
        if (A002 != null) {
            this.A00 = new AnonymousClass3Ux(A002, context, mediaFrameLayout, userSession);
            return;
        }
        throw new IllegalStateException(C273654mx.A00(224));
    }
}
