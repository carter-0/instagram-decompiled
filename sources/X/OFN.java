package X;

import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

public final class OFN {
    public String A00;
    public final FrameLayout A01;
    public final ConstrainedImageView A02;
    public final ConstrainedImageView A03;

    public OFN(FrameLayout frameLayout, String str) {
        0qQ.A0B(str, 2);
        this.A01 = frameLayout;
        this.A00 = str;
        this.A02 = (ConstrainedImageView) AnonymousClass7TE.A0b(frameLayout, R.id.image);
        this.A03 = (ConstrainedImageView) AnonymousClass7TE.A0b(frameLayout, R.id.overlay);
    }
}
