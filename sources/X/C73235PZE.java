package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PZE  reason: case insensitive filesystem */
public final class C73235PZE implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public C73235PZE(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }

    public final void run() {
        AnonymousClass1Nd.A00(this.A00).A00(new C71911Ost((String) null, this.A01));
    }
}
