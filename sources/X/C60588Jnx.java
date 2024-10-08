package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.gallery.albumpicker.AlbumThumbnailView;

/* renamed from: X.Jnx  reason: case insensitive filesystem */
public final class C60588Jnx extends C249703kE {
    public final UserSession A00;
    public final AlbumThumbnailView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60588Jnx(View view, UserSession userSession, C361518gM r5) {
        super(view);
        0qQ.A0B(view, 2);
        this.A00 = userSession;
        AlbumThumbnailView albumThumbnailView = (AlbumThumbnailView) AnonymousClass7TE.A0b(view, R.id.album_thumbnail_view);
        this.A01 = albumThumbnailView;
        albumThumbnailView.A01 = new C64975LlE(r5, this);
    }
}
