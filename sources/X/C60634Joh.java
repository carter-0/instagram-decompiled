package X;

import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Joh  reason: case insensitive filesystem */
public final class C60634Joh extends C249703kE {
    public C378369Pn A00 = null;
    public final IgSimpleImageView A01;
    public final ConstrainedTextureView A02;
    public final MediaFrameLayout A03;

    public C60634Joh(MediaFrameLayout mediaFrameLayout) {
        super(mediaFrameLayout);
        this.A03 = mediaFrameLayout;
        this.A02 = (ConstrainedTextureView) AnonymousClass7TF.A0F(mediaFrameLayout, R.id.video_texture_view);
        this.A01 = DbX.A0Y(mediaFrameLayout, R.id.photo_media_preview_image_view);
    }
}
