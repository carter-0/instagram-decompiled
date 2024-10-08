package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public final class VYX {
    public final Context A00;
    public final IgProgressImageView A01;
    public final C17535VZo A02;
    public final MediaFrameLayout A03;

    public VYX(View view) {
        0qQ.A0B(view, 1);
        this.A02 = new C17535VZo(view, R.id.content);
        this.A00 = AnonymousClass7TE.A0S(view);
        this.A03 = (MediaFrameLayout) AnonymousClass7TE.A0b(view, R.id.video_container);
        this.A01 = (IgProgressImageView) AnonymousClass7TE.A0b(view, R.id.thumbnail);
    }
}
