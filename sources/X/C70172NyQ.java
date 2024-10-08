package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NyQ  reason: case insensitive filesystem */
public abstract class C70172NyQ {
    public static final C333547Zj A00(UserSession userSession, C254783t2 r2) {
        C333547Zj A00;
        AnonymousClass7TG.A1N(r2, userSession);
        if (AnonymousClass6W3.A08(r2)) {
            A00 = C333527Zh.A00(userSession);
        } else if (r2 instanceof AnonymousClass9HR) {
            A00 = C67497Mor.A00(userSession);
        } else {
            throw AnonymousClass7TE.A0z("Unknown ThreadTargetType");
        }
        return A00;
    }
}
