package X;

import com.instagram.common.session.UserSession;

public final class P4H implements C13756TgS {
    public final int A00;
    public final Object A01;

    public P4H(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFailure() {
        UserSession userSession;
        String str;
        String str2;
        String str3;
        int i = this.A00;
        OWM owm = OWM.A00;
        if (i != 0) {
            NIF nif = (NIF) this.A01;
            userSession = AnonymousClass7TE.A0l(nif.A06);
            str = nif.A01;
            if (str == null) {
                str3 = "entryPoint";
            } else {
                str2 = nif.A02;
                if (str2 == null) {
                    str3 = "threadId";
                }
            }
            0qQ.A0F(str3);
            throw AnonymousClass00P.createAndThrow();
        }
        userSession = C66583MXo.A0M(this.A01);
        str = "inbox";
        str2 = null;
        owm.A01(userSession, str, str2);
    }

    public final void onSuccess() {
        String str;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            NIF nif = (NIF) obj;
            nif.A03.invoke();
            nif.A07();
            OWM owm = OWM.A00;
            UserSession A0l = AnonymousClass7TE.A0l(nif.A06);
            String str2 = nif.A01;
            if (str2 == null) {
                str = "entryPoint";
            } else {
                String str3 = nif.A02;
                if (str3 == null) {
                    str = "threadId";
                } else {
                    owm.A02(A0l, str2, str3);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C66633Ma2 ma2 = (C66633Ma2) obj;
        C270264gS A002 = AnonymousClass7MX.A00(ma2.A0p());
        A002.A00 = true;
        A002.A01 = false;
        C66581MXm.A0U(ma2).A07((C67303Mld) ma2.A2I.getValue(), true, true);
        ma2.A17((Integer) null, "LOCKED_CHAT", true);
        OWM.A00.A02(ma2.A0p(), "inbox", (String) null);
    }
}
