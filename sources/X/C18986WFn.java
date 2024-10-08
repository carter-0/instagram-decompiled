package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.WFn  reason: case insensitive filesystem */
public final class C18986WFn implements C20946X5p {
    public final UserSession A00;
    public final AnonymousClass0eM A01;
    public final /* synthetic */ AnonymousClass1ZO A02;

    public C18986WFn(AnonymousClass1ZO r3, UserSession userSession) {
        this.A02 = r3;
        this.A00 = userSession;
        this.A01 = AnonymousClass0eN.A01(new MMZ(39, (Object) r3, (Object) this));
    }

    public final X2H E4n() {
        return (X2H) this.A01.getValue();
    }

    public final C297775sJ E4q() {
        AnonymousClass1ZO r3 = this.A02;
        UserSession userSession = this.A00;
        UHT uht = r3.A01;
        if (uht != null) {
            return uht;
        }
        UHT uht2 = new UHT(new C12042Sl3(userSession));
        r3.A01 = uht2;
        return uht2;
    }
}
