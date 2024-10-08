package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public final class PBU implements C328007Db, C328017Dc {
    public C328087Dj A00;
    public final View A01;
    public final IgTextView A02;
    public final CircularImageView A03;
    public final C252063oV A04;
    public final C252063oV A05;
    public final C252063oV A06;
    public final C252063oV A07;
    public final AnonymousClass9HC A08;
    public final MediaFrameLayout A09;

    public PBU(View view, AnonymousClass9HC r4) {
        0qQ.A0B(view, 1);
        this.A01 = view;
        this.A08 = r4;
        MediaFrameLayout mediaFrameLayout = null;
        this.A07 = 2b1.A00(view.requireViewById(R.id.text));
        this.A09 = view instanceof MediaFrameLayout ? (MediaFrameLayout) view : mediaFrameLayout;
        this.A04 = DbU.A0Z(view, R.id.full_bleed_media);
        this.A06 = DbU.A0Z(view, R.id.media_container);
        this.A05 = DbU.A0Z(view, R.id.media_overlay_gradient);
        this.A03 = DbX.A0a(view, R.id.profile_picture);
        this.A02 = DbX.A0Z(view, R.id.username);
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
