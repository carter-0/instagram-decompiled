package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.business.ui.widget.IgABTestMultiImageButton;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Jmz  reason: case insensitive filesystem */
public final class C60528Jmz extends C249703kE {
    public final IgABTestMultiImageButton A00;

    public C60528Jmz(View view, float f) {
        super(view);
        ((MediaFrameLayout) AnonymousClass7TF.A0F(view, R.id.thumbnail_preview_container)).A00 = f;
        this.A00 = (IgABTestMultiImageButton) view.requireViewById(R.id.media_image_button);
    }
}
