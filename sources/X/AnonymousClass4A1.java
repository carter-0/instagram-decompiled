package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4A1  reason: invalid class name */
public final class AnonymousClass4A1 implements Runnable {
    public final /* synthetic */ AnonymousClass4A0 A00;

    public AnonymousClass4A1(AnonymousClass4A0 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass4A0 r4 = this.A00;
        UserSession userSession = r4.A07;
        if (182.A06(0Tu.A05, userSession, 36328151945001949L)) {
            long j = AnonymousClass1B0.A02;
            if (AnonymousClass1B1.A00(userSession).A00(1B2.A04)) {
                return;
            }
        }
        AnonymousClass4A0.A04(r4, true);
        r4.A05.A02(this, 2032156175, r4.A02);
    }
}
