package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.4ZR  reason: invalid class name */
public final class AnonymousClass4ZR implements C61110lV, 0lm {
    public boolean A00;
    public final Context A01;
    public final UserSession A02;

    public AnonymousClass4ZR(Context context, UserSession userSession) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A00 = false;
        14i.A06(this);
    }

    public final void onAppBackgrounded() {
        int i;
        int A03 = AnonymousClass0fD.A03(-1596905401);
        if (this.A00) {
            i = 720882991;
        } else {
            this.A00 = true;
            AnonymousClass19S A022 = 19E.A02(AnonymousClass12T.A00.CO6(2039365775, 3));
            1Eo.A05(19B.A00, new C59712JUv(this, (AnonymousClass4D7) null, 33), A022);
            i = 1573599374;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-531248416, AnonymousClass0fD.A03(-12115288));
    }
}
