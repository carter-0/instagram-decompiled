package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4Oj  reason: invalid class name and case insensitive filesystem */
public abstract class C264044Oj {
    public static C264074Om A00(UserSession userSession) {
        C264074Om r2 = (C264074Om) userSession.A00(C264064Ol.class);
        if (r2 != null) {
            return r2;
        }
        C264084On r22 = new C264084On();
        0wb.A03("ARPlatformLoggerFactory", "platformLogger is null in getInstance()");
        return r22;
    }
}
