package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public final class VYV {
    public final Context A00;
    public final IgImageView A01;
    public final C17533VZm A02;
    public final MediaFrameLayout A03;

    public VYV(View view) {
        0qQ.A0B(view, 1);
        this.A00 = AnonymousClass7TE.A0S(view);
        this.A02 = new C17533VZm(view, R.id.video_container);
        View requireViewById = view.requireViewById(R.id.video_container);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) requireViewById;
        mediaFrameLayout.A00 = -1.0f;
        0qQ.A07(requireViewById);
        this.A03 = mediaFrameLayout;
        this.A01 = DbX.A0b(view, R.id.thumbnail);
    }
}
