package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import java.io.File;

/* renamed from: X.OSk  reason: case insensitive filesystem */
public final class C70937OSk {
    public final UserSession A00;

    public C70937OSk(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final C71823OrQ A00(UserSession userSession, DirectAnimatedMedia directAnimatedMedia, AnonymousClass9HR r11, File file, String str) {
        0qQ.A0B(r11, 6);
        AnonymousClass19S A01 = AnonymousClass1HX.A01(1397460454, 3);
        C73564Pfl pfl = new C73564Pfl(userSession, directAnimatedMedia, r11, file, (String) null, (String) null, str, (AnonymousClass4D7) null);
        19B r0 = 19B.A00;
        Integer num = AnonymousClass05K.A00;
        Pr4 pr4 = new Pr4(1Ep.A02(r0, A01));
        pr4.A0T(num, pr4, pfl);
        return pr4.A00;
    }
}
