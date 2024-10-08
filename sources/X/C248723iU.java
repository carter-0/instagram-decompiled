package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3iU  reason: invalid class name and case insensitive filesystem */
public final class C248723iU extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248723iU(2Lk r7) {
        super("fetchFacebookCrosspostingSettingFromServer", 763, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r5 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r5.A04;
        new C363528js(userSession).A06("app_start", true);
        boolean A06 = 182.A06(0Tu.A05, userSession, 36329723902574881L);
        C363378jd A002 = C363388je.A00(userSession);
        if (A06) {
            A002.A01(2Lk.A08, new AnonymousClass9EI(r5), "app_start");
            return;
        }
        A002.A01(2Lk.A08, (C363658k8) null, "app_start");
        AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
        0qQ.A0B(userSession, 0);
        if (AnonymousClass5w9.A01(userSession)) {
            AnonymousClass5w9.A00(userSession).A08((C3034168s) null);
        }
        C299955wH.A00(userSession).A01((C295035nS) null);
    }
}
