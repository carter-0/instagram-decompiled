package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.3V5  reason: invalid class name */
public final class AnonymousClass3V5 {
    public final IgProgressImageView A00;
    public final MediaFrameLayout A01;

    public AnonymousClass3V5(MediaFrameLayout mediaFrameLayout) {
        0qQ.A0B(mediaFrameLayout, 1);
        this.A01 = mediaFrameLayout;
        View requireViewById = mediaFrameLayout.requireViewById(R.id.collection_thumbnail_imageview);
        0qQ.A07(requireViewById);
        this.A00 = (IgProgressImageView) requireViewById;
    }
}
