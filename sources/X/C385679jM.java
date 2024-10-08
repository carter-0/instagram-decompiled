package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.9jM  reason: invalid class name and case insensitive filesystem */
public final class C385679jM extends C228042kh {
    public final Context A00;
    public final UserSession A01;

    public C385679jM(UserSession userSession, Context context) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        Context context = this.A00;
        AnonymousClass7TG.A1N(userSession, context);
        return new C46747Dka(new C54438HDp(userSession, context));
    }
}
