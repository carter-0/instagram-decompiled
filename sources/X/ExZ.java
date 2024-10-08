package X;

import android.content.Context;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsBanner;

public final class ExZ {
    public final Context A00;
    public final IgdsBanner A01;
    public final UserSession A02;

    public ExZ(Context context, UserSession userSession, G76 g76) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = context;
        IgdsBanner igdsBanner = new IgdsBanner(context, (AttributeSet) null, 0);
        igdsBanner.setIcon((int) R.drawable.instagram_channels_broadcast_pano_outline_24);
        DbT.A1U(igdsBanner, AnonymousClass7TE.A16(this.A00, 2131963772), false);
        igdsBanner.setAction(2131963771);
        igdsBanner.setDismissible(true);
        igdsBanner.A00 = g76;
        this.A01 = igdsBanner;
    }
}
