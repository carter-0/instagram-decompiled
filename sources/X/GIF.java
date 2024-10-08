package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;

public final class GIF {
    public View A00;
    public IgSimpleImageView A01;
    public final Context A02;
    public final C252063oV A03;

    public final void A00(UserSession userSession, C255783ui r9, C249693kD r10) {
        ViewGroup A012 = C3019160o.A01(this.A03.getView());
        View view = this.A00;
        if (view == null) {
            0qQ.A0F("stickerContainerView");
            throw AnonymousClass00P.createAndThrow();
        }
        C255783ui r2 = r9;
        C306406Ma.A04(view, r2, r10.AcY(userSession), A012.getWidth(), A012.getHeight(), true);
    }

    public GIF(Context context, C252063oV r2) {
        this.A02 = context;
        this.A03 = r2;
    }
}
