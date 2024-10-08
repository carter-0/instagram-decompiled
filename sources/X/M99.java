package X;

import com.instagram.common.session.UserSession;

public final class M99 implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ LwM A01;
    public final /* synthetic */ C316766mB A02;

    public M99(UserSession userSession, LwM lwM, C316766mB r3) {
        this.A02 = r3;
        this.A00 = userSession;
        this.A01 = lwM;
    }

    public final void run() {
        C316766mB.A02(this.A00, this.A01, this.A02);
    }
}
