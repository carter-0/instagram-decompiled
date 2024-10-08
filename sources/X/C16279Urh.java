package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Urh  reason: case insensitive filesystem */
public final class C16279Urh extends W0T {
    public final Context A00;
    public final C18777W1b A01;
    public final UserSession A02;
    public final 1Av A03;
    public final C18760Vzv A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new C20695WxR(this, 30));

    public /* synthetic */ C16279Urh(Context context, UserSession userSession) {
        1Av A002 = 1Au.A00(userSession);
        0qQ.A0B(A002, 3);
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = A002;
        C18777W1b w1b = new C18777W1b(new C20695WxR(this, 31), new C20695WxR(this, 32), new C20695WxR(this, 33), new MP8(this, 10), new MP8(this, 11));
        this.A01 = w1b;
        this.A04 = new C18760Vzv(context, (C17917Vi8) this.A05.getValue(), w1b, userSession, A002);
    }
}
