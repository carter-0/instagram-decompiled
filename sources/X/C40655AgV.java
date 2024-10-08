package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.AgV  reason: case insensitive filesystem */
public final class C40655AgV implements C332277Ui {
    public final /* synthetic */ C334747bo A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C62320sa A02;

    public final void D9a() {
    }

    public C40655AgV(C334747bo r1, UserSession userSession, C62320sa r3) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void D9V() {
        I21 i21 = I21.A00;
        UserSession userSession = this.A01;
        i21.A01(userSession);
        userSession.A01(C49530ExC.class, new GA1(44, userSession, false));
        this.A00.A00.getId();
        C62320sa r0 = this.A02;
        if (r0 != null) {
            r0.invoke();
        }
    }
}
