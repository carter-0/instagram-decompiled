package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fsq  reason: case insensitive filesystem */
public final class C51358Fsq implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public C51358Fsq(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }

    public final void run() {
        2DU.A00(this.A00).A09(this.A01);
    }
}
