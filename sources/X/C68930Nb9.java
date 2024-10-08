package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.Nb9  reason: case insensitive filesystem */
public final class C68930Nb9 extends C69666Npo {
    public final UserSession A00;
    public final Capabilities A01;
    public final C66649MaI A02;
    public final C254763t0 A03;

    public C68930Nb9(Context context, UserSession userSession, Capabilities capabilities, C254763t0 r5) {
        this.A00 = userSession;
        this.A03 = r5;
        this.A01 = capabilities;
        this.A02 = C66653MaM.A00(context, userSession);
    }
}
