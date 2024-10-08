package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.LMb  reason: case insensitive filesystem */
public final class C64083LMb {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02;

    public C64083LMb(AnonymousClass4DH r10, UserSession userSession, XCD xcd) {
        0qQ.A0B(userSession, 2);
        this.A01 = userSession;
        C66304MMn A012 = C66304MMn.A01(this, r10, 25);
        AnonymousClass0eM A013 = C66293MMc.A01(new C66293MMc(r10, 15), 0eO.A02, 16);
        this.A02 = DbS.A0I(new C66293MMc(A013, 17), A012, C66304MMn.A01(A013, (Object) null, 24), DbS.A0z(C60292Jip.class));
        this.A00 = r10.requireContext();
        AnonymousClass0r6 r0 = ((C60292Jip) this.A02.getValue()).A0F;
        XCD xcd2 = xcd;
        DbZ.A1C(r10, new C66172MGj(xcd2, r10, this, (AnonymousClass4D7) null, 33), r0);
    }

    public static C60292Jip A00(Object obj) {
        return (C60292Jip) ((C64083LMb) obj).A02.getValue();
    }
}
