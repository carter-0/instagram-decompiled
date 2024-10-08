package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

/* renamed from: X.PBf  reason: case insensitive filesystem */
public final class C72574PBf implements C328007Db, C328017Dc, C3263976p {
    public C70440O6r A00;
    public C70762OKi A01;
    public Runnable A02;
    public C328087Dj A03;
    public final IgImageView A04;
    public final C252063oV A05;
    public final C252063oV A06;
    public final RoundedCornerMediaFrameLayout A07;
    public final Runnable A08 = new C73091PVy(this);
    public final ImageView A09;

    public C72574PBf(View view) {
        0qQ.A0B(view, 1);
        this.A07 = (RoundedCornerMediaFrameLayout) AnonymousClass7TF.A0F(view, R.id.media_frame);
        this.A04 = DbX.A0b(view, R.id.animated_image);
        this.A06 = DbU.A0Z(view, R.id.random_attribution_stub);
        this.A05 = DbU.A0Z(view, R.id.giphy_attribution_stub);
        View findViewById = view.findViewById(R.id.doubletap_heart);
        if (findViewById != null) {
            this.A09 = (ImageView) findViewById;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final ImageView Afl() {
        return this.A09;
    }

    public final View BJd() {
        return this.A07;
    }

    public final C328087Dj BY0() {
        return this.A03;
    }

    public final void EeT(C328087Dj r1) {
        this.A03 = r1;
    }
}
