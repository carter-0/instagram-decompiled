package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8NA  reason: invalid class name */
public final class AnonymousClass8NA implements AnonymousClass0eK {
    public final /* synthetic */ AnonymousClass8ME A00;

    public AnonymousClass8NA(AnonymousClass8ME r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        AnonymousClass8ME r9 = this.A00;
        UserSession userSession = r9.A0r;
        C3499582p r7 = r9.A13;
        String moduleName = r9.A0o.getModuleName();
        AnonymousClass80U r8 = r9.A1B;
        Class<C358358am> cls = C358358am.class;
        C354538Mk r6 = r9.A0z;
        return new AZV(r9.A0h, r9.A0l, userSession, r9.A0s, r6, r7, r8, r9, (C358358am) userSession.A01(cls, new C66297MMg(userSession, 43)), moduleName);
    }
}
