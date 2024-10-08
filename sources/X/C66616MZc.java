package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.MZc  reason: case insensitive filesystem */
public final class C66616MZc implements AnonymousClass66d {
    public final /* synthetic */ UserSession A00;

    public C66616MZc(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void onNewNotification(String str, AnonymousClass2Lq r4, Map map) {
        AnonymousClass6AQ A002 = AnonymousClass6AP.A00(this.A00);
        A002.A08 = true;
        A002.A0E.accept(AnonymousClass7TE.A0u());
    }
}
