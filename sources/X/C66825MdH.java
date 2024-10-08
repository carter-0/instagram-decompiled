package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.instagram.android.R;

/* renamed from: X.MdH  reason: case insensitive filesystem */
public final class C66825MdH implements C328007Db, C328017Dc, C3263976p {
    public C328087Dj A00;
    public final LinearLayout A01;
    public final C252063oV A02;
    public final C252063oV A03;
    public final ImageView A04;

    public final ImageView Afl() {
        return this.A04;
    }

    public final View BJd() {
        return this.A01;
    }

    public final C328087Dj BY0() {
        return this.A00;
    }

    public C66825MdH(View view) {
        this.A01 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.expired_message_placeholder);
        this.A03 = C66581MXm.A0T(view, R.id.expired_placeholder_title_stub);
        this.A02 = C66581MXm.A0T(view, R.id.expired_placeholder_message_stub);
        this.A04 = DbX.A0J(view, R.id.doubletap_heart);
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
