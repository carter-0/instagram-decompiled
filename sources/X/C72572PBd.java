package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.PBd  reason: case insensitive filesystem */
public final class C72572PBd implements C328007Db, C328017Dc, C3263976p {
    public C328087Dj A00;
    public final ViewGroup A01;
    public final FrameLayout A02;
    public final TextView A03;
    public final TextView A04;
    public final CircularImageView A05;
    public final C70459O7k A06;
    public final ImageView A07;

    public final ImageView Afl() {
        return this.A07;
    }

    public final View BJd() {
        return this.A02;
    }

    public final C328087Dj BY0() {
        return this.A00;
    }

    public C72572PBd(View view) {
        this.A02 = (FrameLayout) view.requireViewById(R.id.foreground_container);
        this.A01 = DbU.A0C(view, R.id.message_content_profile_bubble_container);
        this.A05 = DbU.A0X(view, R.id.avatar);
        this.A04 = DbU.A0G(view, R.id.title);
        this.A03 = DbU.A0G(view, R.id.subtitle);
        this.A06 = new C70459O7k(view, false, false);
        this.A07 = DbU.A0F(view, R.id.doubletap_heart);
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
