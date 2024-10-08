package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3hl  reason: invalid class name and case insensitive filesystem */
public final class C248313hl extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248313hl(2Lk r3) {
        super("sendSupportedCameraCapabilities", 376);
        this.A00 = r3;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 0);
        0tX r12 = AnonymousClass93A.A00;
        if (r12 == null) {
            r12 = 0xn.A01("SupportedCapabilitiesPreferences");
            AnonymousClass93A.A00 = r12;
        }
        long j = -1;
        if (r12 != null) {
            j = r12.getLong(AnonymousClass000.A00(2349), -1);
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (j < 0 || currentTimeMillis >= 86400000) {
            C385329il r13 = new C385329il(userSession);
            1OC A002 = AnonymousClass93A.A00(userSession);
            A002.A00 = r13;
            1ES.A03(A002);
        }
    }
}
