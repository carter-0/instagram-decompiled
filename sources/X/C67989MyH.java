package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.MyH  reason: case insensitive filesystem */
public final class C67989MyH extends C249703kE {
    public final IgTextView A00;
    public final IgTextView A01;
    public final CircularImageView A02;

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67989MyH(Context context, View view, UserSession userSession) {
        super(view);
        0qQ.A0B(view, 1);
        ? A0X = DbU.A0X(view, R.id.avatar_pic);
        this.A02 = A0X;
        this.A01 = DbT.A0a(view, R.id.visibility_header);
        this.A00 = DbT.A0a(view, R.id.visibility_body);
        if (userSession != null && 182.A06(0Tu.A05, userSession, 36322465407838403L)) {
            if (context != null) {
                DbU.A13(context, A0X, R.drawable.instagram_avatars_pano_outline_24);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
