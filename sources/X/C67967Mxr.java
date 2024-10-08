package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.Mxr  reason: case insensitive filesystem */
public final class C67967Mxr extends C249703kE {
    public final UserSession A00;
    public final ConstrainedImageView A01;
    public final RoundedCornerFrameLayout A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67967Mxr(View view, UserSession userSession) {
        super(view);
        AnonymousClass7TG.A1O(view, userSession);
        this.A00 = userSession;
        this.A02 = (RoundedCornerFrameLayout) AnonymousClass7TF.A0F(view, R.id.giphy_sticker_parent);
        this.A01 = (ConstrainedImageView) AnonymousClass7TF.A0F(view, R.id.giphy_sticker_image);
    }
}
