package X;

import com.facebook.msys.mca.MailboxFeature;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mdb  reason: case insensitive filesystem */
public abstract class C66843Mdb {
    public static final C66840MdY A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (C66840MdY) userSession.A01(C66840MdY.class, new C73661Pha(userSession, 41));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.NAP, com.facebook.msys.mca.MailboxFeature] */
    public static final NAP A00(UserSession userSession) {
        return new MailboxFeature(new C3023662u(C300345wy.A02(userSession, AnonymousClass45R.A00(userSession)), 2));
    }
}
