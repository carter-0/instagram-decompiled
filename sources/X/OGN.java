package X;

import android.widget.VideoView;
import androidx.cardview.widget.CardView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;

public final class OGN {
    public final VideoView A00;
    public final CardView A01;
    public final IgFrameLayout A02;
    public final CircularImageView A03;
    public final C71662eb A04;

    public OGN(C71662eb r3) {
        this.A04 = r3;
        this.A01 = (CardView) AnonymousClass7TF.A0F(r3.A01(), R.id.video_preview_container);
        this.A02 = (IgFrameLayout) AnonymousClass7TF.A0F(r3.A01(), R.id.layout_video_view);
        this.A00 = (VideoView) AnonymousClass7TF.A0F(r3.A01(), R.id.video_view);
        this.A03 = DbX.A0a(r3.A01(), R.id.video_view_thumbnail);
    }
}
