package X;

import android.view.View;
import android.widget.VideoView;
import com.instagram.api.schemas.MetaGalleryNetegoInStoryMediaType;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.KwX  reason: case insensitive filesystem */
public abstract class C63411KwX {
    public static final void A00(View.OnTouchListener onTouchListener, VideoView videoView, AnonymousClass0iw r3, IgImageView igImageView, String str, String str2) {
        if (str != null && Dba.A1X(MetaGalleryNetegoInStoryMediaType.VIDEO, str2)) {
            AnonymousClass7TH.A0R(igImageView);
            if (videoView != null) {
                videoView.setVisibility(0);
                videoView.setVideoURI(0cp.A03(str));
                videoView.setOnPreparedListener(LVL.A00);
                videoView.setOnTouchListener(onTouchListener);
                videoView.start();
            }
        } else if (igImageView != null) {
            DbV.A1P(r3, igImageView, str);
        }
    }
}
