package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.PBa  reason: case insensitive filesystem */
public final class C72569PBa implements C328007Db, C328017Dc, C3263976p {
    public C70762OKi A00;
    public C328087Dj A01;
    public final View A02;
    public final IgProgressImageView A03;
    public final ImageView A04;

    public C72569PBa(View view) {
        0qQ.A0B(view, 1);
        this.A02 = AnonymousClass7TE.A0b(view, R.id.static_sticker_container);
        this.A03 = (IgProgressImageView) AnonymousClass7TE.A0b(view, R.id.image);
        this.A04 = (ImageView) AnonymousClass7TE.A0b(view, R.id.doubletap_heart);
    }

    public final ImageView Afl() {
        return this.A04;
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
