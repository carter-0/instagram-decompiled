package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Paf  reason: case insensitive filesystem */
public final class C73320Paf implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C73320Paf(UserSession userSession, String str, String str2) {
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
    }

    public final void run() {
        AnonymousClass1Nd.A00(this.A00).A00(new C71911Ost(this.A02, this.A01));
    }
}
