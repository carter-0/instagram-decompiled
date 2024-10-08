package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Wmp  reason: case insensitive filesystem */
public final class C20191Wmp implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass5Gt A01;

    public C20191Wmp(UserSession userSession, AnonymousClass5Gt r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final void run() {
        this.A01.A00().A07(this.A00);
    }
}
