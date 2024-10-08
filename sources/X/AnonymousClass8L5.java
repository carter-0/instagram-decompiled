package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.8L5  reason: invalid class name */
public final class AnonymousClass8L5 {
    public ArrayList A00 = new ArrayList();
    public final Context A01;
    public final UserSession A02;
    public final AnonymousClass8L6 A03;
    public final HashMap A04 = new HashMap();

    public AnonymousClass8L5(Context context, UserSession userSession) {
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = new AnonymousClass8L6(context, userSession);
    }
}
