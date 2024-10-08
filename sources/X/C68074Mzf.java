package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Mzf  reason: case insensitive filesystem */
public final class C68074Mzf extends C249703kE implements C328007Db, C328017Dc, C3263976p, C328027Dd {
    public C328087Dj A00;
    public final View A01;
    public final NoteBubbleView A02;
    public final GradientSpinnerAvatarView A03;

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

    public C68074Mzf(View view) {
        super(view);
        this.A01 = view;
        this.A02 = (NoteBubbleView) AnonymousClass7TE.A0b(view, R.id.xma_content_note_bubble_view);
        this.A03 = (GradientSpinnerAvatarView) AnonymousClass7TE.A0b(view, R.id.xma_content_circular_image);
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
