package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public final class VTP {
    public final IgProgressImageView A00;
    public final MediaFrameLayout A01;

    public VTP(View view) {
        this.A01 = (MediaFrameLayout) AnonymousClass7TE.A0b(view, R.id.media_layout);
        this.A00 = (IgProgressImageView) AnonymousClass7TE.A0b(view, R.id.media_thumbnail);
    }
}
