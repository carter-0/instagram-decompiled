package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

/* renamed from: X.Mze  reason: case insensitive filesystem */
public final class C68073Mze extends C249703kE implements C328007Db, C328017Dc, C3263976p, C328027Dd {
    public C328087Dj A00;
    public final View A01;
    public final IgProgressImageView A02;
    public final RoundedCornerMediaFrameLayout A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68073Mze(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = view;
        this.A03 = (RoundedCornerMediaFrameLayout) AnonymousClass7TF.A0F(view, R.id.magic_media_remix_media_container);
        this.A02 = (IgProgressImageView) AnonymousClass7TF.A0F(view, R.id.magic_media_remix_media_image);
    }

    public final void FHQ(int i) {
    }

    public final ImageView Afl() {
        return null;
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
