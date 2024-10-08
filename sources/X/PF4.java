package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.List;

public final class PF4 implements C74550Pwj {
    public final List A00 = AnonymousClass7TE.A1I("instagram_secure_thread_model");
    public final AnonymousClass0eM A01;
    public final 1a8 A02 = C66581MXm.A0P();
    public final C67195Mjr A03;

    public final 1aU APA() {
        1aU r0 = this.A03.A01;
        0qQ.A07(r0);
        return r0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.PrZ] */
    public final void CgC() {
        this.A03.A01(new Object());
    }

    public final void start() {
        this.A03.A00();
        PU7.A00(MYb.A00(C66581MXm.A0b(this.A01)).A0N(new C66789Mca((Object) this, 16)), this.A02, this, 12);
    }

    public final void stop() {
        this.A03.A03.A01();
        this.A02.A01();
    }

    public PF4(Context context, UserSession userSession, Capabilities capabilities, C254793t3 r7) {
        this.A03 = O0H.A00(context, userSession, capabilities, r7);
        this.A01 = AnonymousClass0eN.A00(0eO.A02, new C73907Pli(userSession, 17));
    }
}
