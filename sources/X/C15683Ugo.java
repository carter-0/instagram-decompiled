package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.Ugo  reason: case insensitive filesystem */
public final class C15683Ugo extends C252233om {
    public AnonymousClass0iw A00;
    public 2el A01;
    public final UserSession A02;
    public final LinkedHashMap A03 = new LinkedHashMap();

    public C15683Ugo(AnonymousClass0iw r2, UserSession userSession, 2el r4) {
        DbW.A1O(userSession, 1, r4);
        this.A02 = userSession;
        this.A00 = r2;
        this.A01 = r4;
    }

    public final void onDestroyView() {
        this.A03.clear();
    }
}
