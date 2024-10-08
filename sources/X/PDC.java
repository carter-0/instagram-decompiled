package X;

import com.instagram.common.session.UserSession;

public final class PDC implements C74551Pwk {
    public final UserSession A00;
    public final C74551Pwk A01;
    public final String A02;

    public final void DTM(C270214gN r4, String str) {
        if (r4 == null) {
            1Ou.A01(this.A00).A08(this.A02, str, (String) null);
        }
        this.A01.DTM(r4, (String) null);
    }

    public final 0xF B3j() {
        return this.A01.B3j();
    }

    public final 0xF BsS() {
        return this.A01.BsS();
    }

    public PDC(UserSession userSession, C74551Pwk pwk, String str) {
        this.A01 = pwk;
        this.A00 = userSession;
        this.A02 = str;
    }
}
