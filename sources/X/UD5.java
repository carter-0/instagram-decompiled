package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public final class UD5 extends C249703kE {
    public final View A00;
    public final IgProgressImageView A01;
    public final MediaFrameLayout A02;

    public UD5(View view) {
        super(view);
        this.A00 = view;
        this.A01 = (IgProgressImageView) AnonymousClass7TF.A0F(view, R.id.imageview);
        this.A02 = (MediaFrameLayout) AnonymousClass7TF.A0F(view, R.id.canvas_media_group);
    }
}
