package X;

import com.instagram.common.session.UserSession;

public final class FR0 implements 2YM {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        return 2YT.A01(this, cls);
    }

    public final 2YL create(Class cls) {
        UserSession userSession = this.A00;
        return new C46770Dkx(userSession, C63397KwI.A00(userSession), this.A02, this.A01);
    }

    public FR0(UserSession userSession, String str, String str2) {
        AnonymousClass7TG.A1U(userSession, str, str2);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
    }
}
