package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.AnL  reason: case insensitive filesystem */
public final class C41037AnL implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass5Gv A01;

    public C41037AnL(UserSession userSession, AnonymousClass5Gv r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final void run() {
        this.A01.A07(this.A00);
    }
}
