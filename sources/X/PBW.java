package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class PBW implements C328007Db, C328017Dc, C3263976p {
    public ImageView A00;
    public C328087Dj A01;
    public final FrameLayout A02;
    public final IgImageView A03;

    public PBW(View view) {
        0qQ.A0B(view, 1);
        this.A02 = (FrameLayout) AnonymousClass7TF.A0F(view, R.id.image_container);
        this.A03 = DbX.A0b(view, R.id.animated_image);
        this.A00 = DbU.A0F(view, R.id.doubletap_heart);
    }

    public final ImageView Afl() {
        return this.A00;
    }

    public final View BJd() {
        return this.A02;
    }

    public final C328087Dj BY0() {
        return this.A01;
    }

    public final void EeT(C328087Dj r1) {
        this.A01 = r1;
    }
}
