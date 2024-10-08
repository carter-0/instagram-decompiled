package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Flq  reason: case insensitive filesystem */
public final class C50963Flq implements C20986X8c {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C62320sa A01;

    public C50963Flq(UserSession userSession, C62320sa r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final void onAccept() {
        C49881FBf fBf = C49881FBf.A00;
        UserSession userSession = this.A00;
        fBf.A00(userSession, (C49922FEx) null, "auto_crossposting");
        AnonymousClass7TF.A0D().post(new C51244Fqz(this.A01));
        C363548ju.A03.A01(userSession, (Integer) null, "upsell", true, true);
        C363008it.A05.A01(userSession, (Integer) null, "upsell", true, true);
    }

    public final void onBloksRenderSuccess() {
        C49938FFr.A01(this.A00, "auto_crossposting");
    }

    public final void onDecline() {
        C49881FBf.A00.A00(this.A00, (C49922FEx) null, "auto_crossposting");
        AnonymousClass7TF.A0D().post(new C51246Fr1(this.A01));
    }

    public final void onBloksFailure() {
        AnonymousClass7TF.A0D().post(new C51245Fr0(this.A01));
    }
}
