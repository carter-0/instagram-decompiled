package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Moo  reason: case insensitive filesystem */
public final class C67494Moo implements Runnable {
    public final /* synthetic */ C66777McN A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;

    public C67494Moo(C66777McN mcN, String str, List list) {
        this.A01 = str;
        this.A00 = mcN;
        this.A02 = list;
    }

    public final void run() {
        String str = this.A01;
        if (str != null) {
            this.A00.A01 = str;
        }
        C66777McN mcN = this.A00;
        C66777McN.A01(mcN, this.A02);
        UserSession userSession = mcN.A05;
        String str2 = mcN.A01;
        NMI nmi = new NMI((Object) mcN, 9);
        1NY r2 = new 1NY(userSession);
        Integer num = AnonymousClass05K.A01;
        r2.A08(num);
        r2.A0R = true;
        r2.A09 = num;
        r2.A0A("direct_v2/quick_reply/get/");
        r2.A0R(C67532MpR.class, C67531MpQ.class);
        r2.A9m("modification_token", str2);
        1OC A0T = DbT.A0T(r2, "reply_type", "text");
        A0T.A00 = nmi;
        1ES.A05(A0T, 116, 3, false, false);
    }
}
