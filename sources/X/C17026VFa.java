package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.VFa  reason: case insensitive filesystem */
public abstract class C17026VFa {
    public static final C18467VsH A00(UserSession userSession) {
        if (C18467VsH.A03 == null) {
            C18467VsH.A03 = new C18467VsH(userSession);
        }
        C18467VsH vsH = C18467VsH.A03;
        if (vsH != null) {
            return vsH;
        }
        0qQ.A0F("instance");
        throw AnonymousClass00P.createAndThrow();
    }
}
