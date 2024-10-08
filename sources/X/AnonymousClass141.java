package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.141  reason: invalid class name */
public final class AnonymousClass141 extends 122 {
    public 0L6 A00;
    public C70442Pg A01;
    public final long A02;
    public final AnonymousClass11y A03;

    public final String A06() {
        return "IgMemoryProgramQplInitializer";
    }

    public final void A07() {
        AnonymousClass11y r1 = this.A03;
        if (r1.A00().A08() instanceof UserSession) {
            C70442Pg r0 = new C70442Pg(r1.A00().A08());
            this.A01 = r0;
            if (182.A06(0Tu.A05, r0.A00, 36312282040435743L)) {
                AnonymousClass1JB.A00(new C272384kc(this));
            }
        }
    }

    public AnonymousClass141(AnonymousClass11y r1, long j) {
        this.A03 = r1;
        this.A02 = j;
    }
}
