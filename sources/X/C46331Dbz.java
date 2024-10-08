package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Dbz  reason: case insensitive filesystem */
public final class C46331Dbz {
    public static final C46331Dbz A00 = new Object();

    public final String A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("getInitializeMailboxDelayMs: ");
        long A01 = 182.A01(0Tu.A06, userSession, 36607440784528965L);
        0qQ.A0A(Long.valueOf(A01));
        A1A.append(A01);
        A1A.append("enableMEMLoginWait: ");
        A1A.append(C3027865g.A00(userSession, AnonymousClass0yP.A00(36325965806908832L), false));
        A1A.append("\nshouldNotWaitForMailboxBootstrapForEB: ");
        A1A.append(C3027865g.A00(userSession, AnonymousClass0yP.A00(36325965807695273L), false));
        A1A.append("\nisMailboxBootstrapNotExpected: ");
        A1A.append(false);
        A1A.append("\nshouldThrowOnUnsatisfiedMailboxDependence: ");
        A1A.append(C3027865g.A00(userSession, AnonymousClass0yP.A00(36325965807367589L), false));
        A1A.append("\nisEnabledAuxDBWait: ");
        A1A.append(C3027865g.A00(userSession, AnonymousClass0yP.A00(36325965807629736L), false));
        A1A.append(10);
        return A1A.toString();
    }
}
