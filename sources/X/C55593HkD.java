package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HkD  reason: case insensitive filesystem */
public final class C55593HkD {
    public final C54330H8c A00;
    public final 2el A01;

    public C55593HkD(AnonymousClass4DJ r3, UserSession userSession, 2el r5, AnonymousClass4DU r6, String str, String str2) {
        0qQ.A0B(userSession, 1);
        this.A01 = r5;
        C54330H8c h8c = new C54330H8c(userSession, r6, str, str2);
        this.A00 = h8c;
        r3.registerLifecycleListener(new H5E(h8c));
    }
}
