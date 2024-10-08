package X;

import android.view.ViewStub;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.L7d  reason: case insensitive filesystem */
public final class C63797L7d {
    public final C312366eJ A00;
    public final L9T A01;
    public final UserSession A02;
    public final ArrayList A03 = AnonymousClass7TE.A1C();

    public C63797L7d(ViewStub viewStub, AnonymousClass07Z r4, C312366eJ r5, UserSession userSession) {
        AnonymousClass7TG.A0w(1, viewStub, r4, userSession);
        this.A00 = r5;
        this.A02 = userSession;
        this.A01 = new L9T(viewStub, DbW.A0E(r4));
    }
}
