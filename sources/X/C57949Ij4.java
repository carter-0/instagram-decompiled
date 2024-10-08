package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ij4  reason: case insensitive filesystem */
public final class C57949Ij4 implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C265804Wi A01;
    public final /* synthetic */ C255783ui A02;
    public final /* synthetic */ C249693kD A03;

    public C57949Ij4(UserSession userSession, C265804Wi r2, C255783ui r3, C249693kD r4) {
        this.A01 = r2;
        this.A00 = userSession;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void run() {
        this.A01.A01(this.A00, this.A02, this.A03);
    }
}
