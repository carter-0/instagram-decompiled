package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Doa  reason: case insensitive filesystem */
public final class C46982Doa extends C249703kE {
    public final View A00;
    public final ImageView A01;
    public final IgImageView A02;
    public final UserSession A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46982Doa(View view, UserSession userSession) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A03 = userSession;
        this.A01 = (ImageView) AnonymousClass7TE.A0b(view, R.id.spotlight_item_selected_indicator);
        this.A02 = AnonymousClass7TE.A0b(view, R.id.spotlight_item_front_image);
        0nA.A0V(AnonymousClass7TE.A0b(view, R.id.spotlight_item_image_container), DbS.A02(AnonymousClass7TE.A0S(view), DbW.A1T(0Tu.A05, userSession) ? 92 : 84));
    }
}
