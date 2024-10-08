package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.8L6  reason: invalid class name */
public final class AnonymousClass8L6 {
    public final AnonymousClass8L8 A00;
    public final AnonymousClass8L7 A01;
    public final Context A02;
    public final UserSession A03;

    public AnonymousClass8L6(Context context, UserSession userSession) {
        this.A02 = context;
        this.A03 = userSession;
        this.A01 = new AnonymousClass8L7(context, userSession);
        this.A00 = new AnonymousClass8L8(context, userSession);
    }
}
