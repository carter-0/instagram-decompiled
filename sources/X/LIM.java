package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.io.File;

public abstract class LIM {
    public static final File A00(int i) {
        return AnonymousClass7TE.A0t(AnonymousClass457.A0B(AnonymousClass457.A0C((String) null, i, false)));
    }

    public static final File A01(UserSession userSession, int i) {
        0qQ.A0B(userSession, 0);
        if (AnonymousClass0Ke.A00(C51966G9m.A0P(userSession)) < 2016) {
            return A00(i);
        }
        String A0C = AnonymousClass457.A0C((String) null, i, false);
        String A0g = 002.A0g(AnonymousClass457.A07(System.currentTimeMillis()), AnonymousClass000.A00(2554), ".mp4");
        File A0s = JTO.A0s(AnonymousClass1F2.A00().CGg((1LJ) null, 554767808), A0C);
        Handler handler = AnonymousClass457.A00;
        if (handler == null) {
            handler = new Handler(C64021Cb.A00());
            AnonymousClass457.A00 = handler;
        }
        handler.post(new M51(A0s));
        return AnonymousClass7TE.A0t(JTO.A0s(A0s, A0g).getPath());
    }
}
