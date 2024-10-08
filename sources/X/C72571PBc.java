package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.PBc  reason: case insensitive filesystem */
public final class C72571PBc implements C328007Db, C328017Dc, C3263976p {
    public C328087Dj A00;
    public final ImageView A01;
    public final TextView A02;
    public final IgImageView A03;
    public final IgImageView A04;
    public final RoundedCornerFrameLayout A05;

    public final ImageView Afl() {
        return this.A01;
    }

    public final View BJd() {
        return this.A05;
    }

    public final C328087Dj BY0() {
        return this.A00;
    }

    public C72571PBc(View view) {
        this.A05 = (RoundedCornerFrameLayout) view.requireViewById(R.id.foreground_container);
        this.A01 = DbU.A0F(view, R.id.doubletap_heart);
        this.A04 = DbT.A0b(view, R.id.preview);
        this.A02 = DbU.A0G(view, R.id.title_text);
        this.A03 = DbT.A0b(view, R.id.icon);
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
