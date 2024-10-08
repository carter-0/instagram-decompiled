package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Mzc  reason: case insensitive filesystem */
public final class C68071Mzc extends C249703kE implements C328007Db, C328017Dc, C3263976p, AnonymousClass7JP {
    public C328087Dj A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;
    public final IgImageView A04;
    public final AnonymousClass0eM A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68071Mzc(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A03 = DbX.A0b(view, R.id.music_sticker_card_background);
        this.A02 = DbX.A0Z(view, R.id.music_sticker_title);
        this.A01 = DbX.A0Z(view, R.id.music_sticker_subtitle);
        this.A04 = DbX.A0b(view, R.id.vinyl_image);
        this.A05 = C73909Plk.A00(view, 40);
    }

    public final void Cwj() {
    }

    public final void Cwk(int i, int i2, boolean z) {
    }

    public final ImageView Afl() {
        return (ImageView) this.A05.getValue();
    }

    public final C328087Dj BY0() {
        return this.A00;
    }

    public final View BJd() {
        return JTO.A0F(this);
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
