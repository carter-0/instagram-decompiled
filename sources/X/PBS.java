package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;

public final class PBS implements C328007Db, C328017Dc {
    public C328087Dj A00;
    public final View A01;
    public final 1a8 A02 = C66580MXl.A0O();
    public final IgProgressImageView A03;

    public PBS(View view) {
        0qQ.A0B(view, 1);
        this.A01 = view;
        this.A03 = (IgProgressImageView) AnonymousClass7TF.A0F(view, R.id.image);
    }

    public final View BJd() {
        return this.A01;
    }

    public final C328087Dj BY0() {
        return this.A00;
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
