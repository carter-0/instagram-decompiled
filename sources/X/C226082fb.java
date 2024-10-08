package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2fb  reason: invalid class name and case insensitive filesystem */
public final class C226082fb implements 27S {
    public final /* synthetic */ C226062fZ A00;

    public C226082fb(C226062fZ r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        2Cy r3 = (2Cy) obj;
        UserSession userSession = this.A00.A07;
        if (userSession == null || !0eE.A00(userSession).A00().equals(r3.A00)) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(35889687);
        int A032 = AnonymousClass0fD.A03(2070477555);
        C226062fZ.A00(this.A00);
        AnonymousClass0fD.A0A(71753926, A032);
        AnonymousClass0fD.A0A(814656887, A03);
    }
}
