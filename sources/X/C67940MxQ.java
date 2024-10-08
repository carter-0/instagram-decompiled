package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.MxQ  reason: case insensitive filesystem */
public final class C67940MxQ extends C249703kE {
    public final ConstrainedImageView A00;
    public final RoundedCornerFrameLayout A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67940MxQ(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = (RoundedCornerFrameLayout) AnonymousClass7TF.A0F(view, R.id.store_sticker_parent);
        this.A00 = (ConstrainedImageView) AnonymousClass7TF.A0F(view, R.id.store_sticker_image);
    }
}
