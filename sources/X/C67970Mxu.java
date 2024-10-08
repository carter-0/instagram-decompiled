package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Mxu  reason: case insensitive filesystem */
public final class C67970Mxu extends C249703kE {
    public final View A00;
    public final UserSession A01;
    public final IgImageView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67970Mxu(View view, UserSession userSession) {
        super(view);
        0qQ.A0B(view, 2);
        this.A01 = userSession;
        this.A02 = JTR.A0i(view, R.id.gif_image);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.gif_image_container);
    }
}
