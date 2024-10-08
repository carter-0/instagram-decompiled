package X;

import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.Trigger;
import java.lang.ref.WeakReference;
import java.util.EnumSet;

/* renamed from: X.2kS  reason: invalid class name */
public final class AnonymousClass2kS implements C61110lV, AnonymousClass0lh {
    public static final AnonymousClass2kT A02 = new Object();
    public WeakReference A00;
    public final UserSession A01;

    public AnonymousClass2kS(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void onAppBackgrounded() {
        AnonymousClass0fD.A0A(-812823775, AnonymousClass0fD.A03(-1766441363));
    }

    public final void onAppForegrounded() {
        AnonymousClass4DH r3;
        int A03 = AnonymousClass0fD.A03(-294530484);
        WeakReference weakReference = this.A00;
        if (!(weakReference == null || (r3 = (AnonymousClass4DH) weakReference.get()) == null)) {
            UserSession userSession = this.A01;
            2bK r1 = new 2bK(userSession.A03.A06(), userSession);
            EnumSet of = EnumSet.of(Trigger.A0A);
            0qQ.A07(of);
            r1.A05(r3, of);
        }
        AnonymousClass0fD.A0A(93400448, A03);
    }

    public final void onSessionWillEnd() {
        14i.A06(this);
    }
}
