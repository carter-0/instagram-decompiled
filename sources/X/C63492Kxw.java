package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Kxw  reason: case insensitive filesystem */
public abstract class C63492Kxw {
    public static final C62010KVj A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        C62010KVj kVj = C62010KVj.A02;
        if (kVj != null) {
            return kVj;
        }
        C62010KVj kVj2 = new C62010KVj(userSession);
        C62010KVj.A02 = kVj2;
        return kVj2;
    }
}
