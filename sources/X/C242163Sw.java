package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Sw  reason: invalid class name and case insensitive filesystem */
public final class C242163Sw extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C242163Sw(Context context, UserSession userSession) {
        super(273, 4, false, false);
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void run() {
        AnonymousClass454 A002 = AnonymousClass454.A00(this.A00);
        UserSession userSession = this.A01;
        synchronized (A002) {
            if (A002.A03) {
                A002.A05.ATE(new C386739l5(userSession, A002));
            }
        }
    }
}
