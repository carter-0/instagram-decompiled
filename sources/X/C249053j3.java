package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3j3  reason: invalid class name and case insensitive filesystem */
public final class C249053j3 extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C249053j3(2Lk r7) {
        super("UpdateArCapabilitiesInPreferences", 1915160355, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0xm A002 = AnonymousClass0xl.A00(C61170le.A00);
        String obj = C278474ww.A03(userSession).toString();
        0xY AR4 = A002.A00.AR4();
        AR4.E5g("preference_supported_ar_capabilities_as_json", obj);
        AR4.apply();
    }
}
