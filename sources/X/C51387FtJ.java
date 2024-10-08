package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FtJ  reason: case insensitive filesystem */
public final class C51387FtJ implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass5Gv A01;

    public C51387FtJ(UserSession userSession, AnonymousClass5Gv r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final void run() {
        this.A01.A07(this.A00);
    }
}
