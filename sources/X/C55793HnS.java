package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.HnS  reason: case insensitive filesystem */
public final class C55793HnS {
    public final C54504HGq A00;
    public final HashMap A01 = AnonymousClass7TE.A1E();
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.HGq, X.3ou] */
    public C55793HnS(AnonymousClass0iw r5, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, r5);
        this.A03 = userSession;
        this.A02 = r5;
        this.A00 = new C252313ou(userSession, C227942kP.A01(r5.getModuleName(), false, false), (String) null, false);
    }
}
