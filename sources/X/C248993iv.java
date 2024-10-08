package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.ppml.enigma.EnigmaSQLite;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3iv  reason: invalid class name and case insensitive filesystem */
public final class C248993iv extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248993iv(2Lk r7) {
        super("ODIRPurgeJob", 1998884021, 3, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        C375799Fc A002;
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 0);
        C375779Fa r4 = (C375779Fa) userSession.A01(C375779Fa.class, new C41562AwU(userSession, 47));
        if (182.A06(0Tu.A05, r4.A02, 36319046613932924L) && (A002 = C375789Fb.A00()) != null) {
            long j = r4.A01;
            long j2 = r4.A00;
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            try {
                ((EnigmaSQLite) A002.A00.getValue()).purgeInstallReferrerV2(seconds - j, seconds - j2);
            } catch (Exception e) {
                C375799Fc.A00(A002, "purgev2", "0", (String) null, e.getMessage(), -1);
            }
        }
    }
}
