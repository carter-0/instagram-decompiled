package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public final class PBZ implements C328007Db, C328017Dc, C3263976p {
    public C328087Dj A00;
    public final C252063oV A01;
    public final IgProgressImageView A02;
    public final MediaFrameLayout A03;
    public final ImageView A04;

    public PBZ(View view) {
        0qQ.A0B(view, 1);
        this.A03 = (MediaFrameLayout) AnonymousClass7TF.A0F(view, R.id.container);
        this.A02 = (IgProgressImageView) AnonymousClass7TF.A0F(view, R.id.image);
        this.A01 = DbU.A0Z(view, R.id.view_request_button_stub);
        this.A04 = DbX.A0J(view, R.id.doubletap_heart);
    }

    public final ImageView Afl() {
        return this.A04;
    }

    public final View BJd() {
        return this.A03;
    }

    public final C328087Dj BY0() {
        return this.A00;
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
