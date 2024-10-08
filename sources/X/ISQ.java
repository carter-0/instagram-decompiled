package X;

import com.instagram.common.session.UserSession;

public final class ISQ implements JOB {
    public final UserSession A00;
    public final JOB A01;
    public final C228302lG A02;

    public final void DNR(1Xj r8, AnonymousClass3W1 r9, String str, C62320sa r11, int i) {
        1Xj r2 = r8;
        AnonymousClass3W1 r3 = r9;
        String str2 = str;
        C51974G9v.A1K(r8, r9, str);
        if (!C51968G9o.A1X(this.A00, r8)) {
            this.A02.A00("LIKE");
        }
        this.A01.DNR(r2, r3, str2, r11, i);
    }

    public ISQ(UserSession userSession, JOB job, C228302lG r3) {
        AnonymousClass7TG.A1U(job, userSession, r3);
        this.A01 = job;
        this.A00 = userSession;
        this.A02 = r3;
    }
}
