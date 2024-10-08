package X;

import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.session.UserSession;

/* renamed from: X.8pu  reason: invalid class name and case insensitive filesystem */
public abstract class C366928pu {
    public static final boolean A00(UserSession userSession, C279284yO r3, C3499482o r4) {
        ImmersiveMediaFields immersiveMediaFields;
        0qQ.A0B(r3, 1);
        0qQ.A0B(r4, 2);
        C352218Cl A03 = r4.A01.A03();
        if (A03 == null || (immersiveMediaFields = A03.A01().A00) == null || immersiveMediaFields.A00 == null || !C39600A1q.A00(userSession, r3, r4.A0D())) {
            return false;
        }
        return true;
    }
}
