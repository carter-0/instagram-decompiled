package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class OEN {
    public final Context A00;
    public final UserSession A01;
    public final boolean A02;

    public OEN(UserSession userSession, Context context, boolean z) {
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = z;
    }
}
