package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;

/* renamed from: X.4bT  reason: invalid class name and case insensitive filesystem */
public final class C267384bT extends 0vM {
    public final /* synthetic */ AnonymousClass4j5 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C267384bT(AnonymousClass4j5 r7) {
        super("BackgrounColdStartScheduler", 1912120985, 3, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        C64331Jv r2 = C638918c.A01(C61170le.A00).A04;
        if (r2 != null && r2.A0O == 1CS.A03 && !r2.A0E) {
            AnonymousClass4j5 r6 = this.A00;
            long j = AnonymousClass1B0.A02;
            UserSession userSession = r6.A01;
            AnonymousClass1B1.A00(userSession);
            if ((SystemClock.elapsedRealtime() - AnonymousClass1B0.A02) / 1000 < 300) {
                AnonymousClass4j5.A00(r6);
            } else {
                AnonymousClass53V.A00(userSession, new C22370Y0y(r6));
            }
        }
    }
}
