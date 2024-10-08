package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.KDg  reason: case insensitive filesystem */
public final class C61579KDg extends C228042kh {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public C61579KDg(Context context, AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = r3;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        C313786h0 r1 = C313776gz.A0K;
        UserSession userSession = this.A02;
        C313776gz A002 = r1.A00(userSession, C313666go.BROADCASTER);
        C62176KbY A012 = C64139LPo.A01(this.A01, userSession);
        return new C60195JhE(1Au.A00(userSession), A012.A01(this.A00), A002.A02(), A002.A03());
    }
}
