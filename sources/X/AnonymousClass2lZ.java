package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.2lZ  reason: invalid class name */
public final class AnonymousClass2lZ implements C228382la {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C228372lY A03;

    public static final void A00(AnonymousClass2lZ r6, Object obj, int i) {
        Object obj2 = obj;
        if (obj != null) {
            C228372lY r1 = r6.A03;
            Context context = r6.A00;
            UserSession userSession = r6.A02;
            AnonymousClass0iw r3 = r6.A01;
            List AMe = r1.AMe(context, r3, userSession, obj2, i);
            1y3 A002 = 1y1.A00(userSession);
            String moduleName = r3.getModuleName();
            if (i == 0) {
                A002.A06(moduleName, AMe);
            } else {
                A002.A05(moduleName, AMe);
            }
        }
    }

    public final void DMI() {
    }

    public final void DMW() {
        1y1.A00(this.A02).A04(this.A01.getModuleName());
    }

    public AnonymousClass2lZ(Context context, AnonymousClass0iw r5, UserSession userSession, C228372lY r7) {
        this.A02 = userSession;
        this.A01 = r5;
        this.A03 = r7;
        if (!(context instanceof Application) && 182.A06(0Tu.A05, userSession, 36330836299694887L)) {
            context = context.getApplicationContext();
            0qQ.A07(context);
        }
        this.A00 = context;
    }

    public final void DLo(Object obj, int i) {
        A00(this, obj, i);
    }
}
