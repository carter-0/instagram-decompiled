package X;

import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.Vgl  reason: case insensitive filesystem */
public final class C17832Vgl {
    public final C15383Ubh A00;
    public final C228602lw A01;
    public final UserSession A02;

    public C17832Vgl(C228602lw r2, UserSession userSession, C15383Ubh ubh) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = ubh;
    }

    public final void A00(String str, String str2, String str3) {
        UserSession userSession = this.A02;
        boolean A1X = DbW.A1X(str);
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("ads/pbia_info/");
        A0b.A9m("ad_id", str);
        A0b.A0G("media_id", str2);
        A0b.A0G("ig_user_id", str3);
        A0b.A02 = new 1NT(new 0bH(userSession), new 1NX((File) null), C18232Vnw.class, A1X);
        1OC A0M = A0b.A0M();
        C228602lw r1 = this.A01;
        C15621Ufn.A00(A0M, this, 36);
        r1.schedule(A0M);
    }
}
