package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;

public final class VVR {
    public final View.OnClickListener A00;
    public final ImageUrl A01;
    public final boolean A02;

    public VVR(View.OnClickListener onClickListener, ImageUrl imageUrl, boolean z) {
        this.A01 = imageUrl;
        this.A02 = z;
        this.A00 = onClickListener;
    }
}
