package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.Dox  reason: case insensitive filesystem */
public final class C47005Dox extends C249703kE {
    public final View A00;
    public final IgImageView A01;
    public final IgImageView A02;
    public final RoundedCornerImageView A03;
    public final RoundedCornerImageView A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47005Dox(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A02 = DbX.A0b(view, R.id.reels_icon_overlay_view);
        this.A04 = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.tinted_view);
        this.A01 = DbX.A0b(view, R.id.icon_overlay_view);
        this.A03 = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.image_view);
    }
}
