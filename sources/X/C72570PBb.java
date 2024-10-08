package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.PBb  reason: case insensitive filesystem */
public final class C72570PBb implements C328007Db, C328017Dc, C3263976p {
    public C328087Dj A00;
    public final FrameLayout A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;

    public final ImageView Afl() {
        return this.A02;
    }

    public final View BJd() {
        return this.A01;
    }

    public final C328087Dj BY0() {
        return this.A00;
    }

    public C72570PBb(View view) {
        this.A01 = (FrameLayout) view.requireViewById(R.id.foreground_container);
        this.A02 = DbU.A0F(view, R.id.doubletap_heart);
        this.A04 = DbU.A0G(view, R.id.title_text);
        this.A03 = DbU.A0G(view, R.id.subtitle_text);
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
