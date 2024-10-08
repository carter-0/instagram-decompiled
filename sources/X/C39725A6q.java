package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.A6q  reason: case insensitive filesystem */
public final class C39725A6q {
    public final Context A00;
    public final C353738Iw A01;
    public final UserSession A02;
    public final List A03;

    public C39725A6q(Context context, UserSession userSession, List list) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = list;
        this.A01 = new C353738Iw(new C353698Is(context, new C40158ATy(1), new AnonymousClass84N(context, userSession)), list);
    }
}
